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
            pd var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            pd var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            int stackIn_30_0 = 0;
            int stackIn_74_0 = 0;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            String stackIn_79_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_29_0 = 0;
            int stackOut_73_0 = 0;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            RuntimeException stackOut_78_0 = null;
            StringBuilder stackOut_78_1 = null;
            String stackOut_78_2 = null;
            RuntimeException stackOut_77_0 = null;
            StringBuilder stackOut_77_1 = null;
            String stackOut_77_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
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
                    L3: {
                      L4: {
                        if (var4 >= var17.field_p) {
                          break L4;
                        } else {
                          if (var12 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (null != var13.field_k[var4]) {
                                L6: {
                                  if (2 != var13.field_k[var4].field_b) {
                                    break L6;
                                  } else {
                                    var13.field_n[var4] = -5;
                                    break L6;
                                  }
                                }
                                if (-1 != (var13.field_k[var4].field_b ^ -1)) {
                                  break L5;
                                } else {
                                  var3 = 1;
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (var13.field_i[var4] != null) {
                                L8: {
                                  if ((var13.field_i[var4].field_b ^ -1) == -3) {
                                    var13.field_n[var4] = -6;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                if (-1 == (var13.field_i[var4].field_b ^ -1)) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            var4++;
                            if (var12 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var3 != 0) {
                        break L3;
                      } else {
                        var4 = param1.field_h;
                        param1.f(var17.field_j, -32287);
                        var5 = 0;
                        L9: while (true) {
                          L10: {
                            L11: {
                              if (var17.field_p <= var5) {
                                break L11;
                              } else {
                                stackOut_29_0 = 0;
                                stackIn_74_0 = stackOut_29_0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var12 != 0) {
                                  break L10;
                                } else {
                                  L12: {
                                    L13: {
                                      if (stackIn_30_0 != var13.field_n[var5]) {
                                        param1.c(var13.field_n[var5], -1);
                                        if (var12 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    try {
                                      L14: {
                                        L15: {
                                          L16: {
                                            var6_int = var13.field_m[var5];
                                            if (-1 == (var6_int ^ -1)) {
                                              break L16;
                                            } else {
                                              L17: {
                                                if ((var6_int ^ -1) == -2) {
                                                  break L17;
                                                } else {
                                                  if (-3 == (var6_int ^ -1)) {
                                                    var25 = (java.lang.reflect.Field) (var13.field_k[var5].field_g);
                                                    var8 = var25.getModifiers();
                                                    param1.c(0, -1);
                                                    param1.f(var8, -32287);
                                                    if (var12 == 0) {
                                                      break L15;
                                                    } else {
                                                      break L17;
                                                    }
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              var14 = (java.lang.reflect.Field) (var13.field_k[var5].field_g);
                                              var7 = var14;
                                              var14.setInt((Object) null, var13.field_h[var5]);
                                              param1.c(0, -1);
                                              if (var12 == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          var15 = (java.lang.reflect.Field) (var13.field_k[var5].field_g);
                                          var8 = var15.getInt((Object) null);
                                          param1.c(0, -1);
                                          param1.f(var8, param0 ^ 32270);
                                          break L15;
                                        }
                                        L18: {
                                          L19: {
                                            if ((var6_int ^ -1) == -4) {
                                              break L19;
                                            } else {
                                              if (4 == var6_int) {
                                                var26 = (java.lang.reflect.Method) (var13.field_i[var5].field_g);
                                                var8 = var26.getModifiers();
                                                param1.c(0, -1);
                                                param1.f(var8, -32287);
                                                if (var12 == 0) {
                                                  break L18;
                                                } else {
                                                  break L19;
                                                }
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          var27 = (java.lang.reflect.Method) (var13.field_i[var5].field_g);
                                          var24 = var13.field_o[var5];
                                          var9 = new Object[var24.length];
                                          var10_int = 0;
                                          L20: while (true) {
                                            L21: {
                                              if (var10_int >= var24.length) {
                                                break L21;
                                              } else {
                                                var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                                                var9[var10_int] = var11.readObject();
                                                var10_int++;
                                                if (var12 != 0) {
                                                  break L18;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L20;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                            L22: {
                                              var10 = var27.invoke((Object) null, var9);
                                              if (var10 != null) {
                                                break L22;
                                              } else {
                                                param1.c(0, -1);
                                                if (var12 == 0) {
                                                  break L18;
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
                                                  if (var10 instanceof String) {
                                                    break L24;
                                                  } else {
                                                    param1.c(4, -1);
                                                    if (var12 == 0) {
                                                      break L18;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                param1.c(2, -1);
                                                param1.a((String) (var10), (byte) 0);
                                                if (var12 == 0) {
                                                  break L18;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            param1.c(1, -1);
                                            param1.a(((Number) (var10)).longValue(), (byte) 37);
                                            break L18;
                                          }
                                        }
                                        break L14;
                                      }
                                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L25: {
                                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                        param1.c(-10, -1);
                                        break L25;
                                      }
                                    } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L26: {
                                        var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                        param1.c(-11, -1);
                                        break L26;
                                      }
                                    } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                      decompiledCaughtException = decompiledCaughtParameter2;
                                      L27: {
                                        var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                        param1.c(-12, -1);
                                        break L27;
                                      }
                                    } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                      decompiledCaughtException = decompiledCaughtParameter3;
                                      L28: {
                                        var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                        param1.c(-13, param0 + 16);
                                        break L28;
                                      }
                                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                      decompiledCaughtException = decompiledCaughtParameter4;
                                      L29: {
                                        var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                        param1.c(-14, -1);
                                        break L29;
                                      }
                                    } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                      decompiledCaughtException = decompiledCaughtParameter5;
                                      L30: {
                                        var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                        param1.c(-15, -1);
                                        break L30;
                                      }
                                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                      decompiledCaughtException = decompiledCaughtParameter6;
                                      L31: {
                                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                        param1.c(-16, -1);
                                        break L31;
                                      }
                                    } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                      decompiledCaughtException = decompiledCaughtParameter7;
                                      L32: {
                                        var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                        param1.c(-17, -1);
                                        break L32;
                                      }
                                    } catch (java.io.IOException decompiledCaughtParameter8) {
                                      decompiledCaughtException = decompiledCaughtParameter8;
                                      L33: {
                                        var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                        param1.c(-18, -1);
                                        break L33;
                                      }
                                    } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                      decompiledCaughtException = decompiledCaughtParameter9;
                                      L34: {
                                        var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                        param1.c(-19, param0 ^ 16);
                                        break L34;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter10) {
                                      decompiledCaughtException = decompiledCaughtParameter10;
                                      L35: {
                                        var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                        param1.c(-20, -1);
                                        break L35;
                                      }
                                    } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                      decompiledCaughtException = decompiledCaughtParameter11;
                                      L36: {
                                        var6_ref11 = decompiledCaughtException;
                                        param1.c(-21, -1);
                                        break L36;
                                      }
                                    }
                                    break L12;
                                  }
                                  var5++;
                                  if (var12 == 0) {
                                    continue L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            stackOut_73_0 = param1.a(var4, (byte) 82);
                            stackIn_74_0 = stackOut_73_0;
                            break L10;
                          }
                          var17.b((byte) -116);
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
                stackOut_76_0 = (RuntimeException) (var2);
                stackOut_76_1 = new StringBuilder().append("ej.A(").append(param0).append(',');
                stackIn_78_0 = stackOut_76_0;
                stackIn_78_1 = stackOut_76_1;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                if (param1 == null) {
                  stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
                  stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
                  stackOut_78_2 = "null";
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  stackIn_79_2 = stackOut_78_2;
                  break L37;
                } else {
                  stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
                  stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
                  stackOut_77_2 = "{...}";
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_79_1 = stackOut_77_1;
                  stackIn_79_2 = stackOut_77_2;
                  break L37;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
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
