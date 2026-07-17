/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rh extends rf {
    int field_l;
    int field_k;
    static String field_g;
    static char[] field_j;
    static qe field_h;
    static hl[] field_f;
    static int field_i;

    public static void a(boolean param0) {
        field_j = null;
        field_f = null;
        field_g = null;
        field_h = null;
    }

    private rh() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var7 = 1;
            if (param1 < param3) {
              break L1;
            } else {
              if (param2 + param3 <= param1) {
                break L1;
              } else {
                if (param4 > param5) {
                  break L1;
                } else {
                  if (param0 + param4 <= param5) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (ki.field_l <= param3) {
                break L1;
              } else {
                param1 = param1 - (ki.field_l + -param3);
                param3 = ki.field_l;
                break L1;
              }
            }
            L2: {
              if (param0 < ki.field_e) {
                param2 = param2 - (-param0 + ki.field_e);
                param0 = ki.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 + param1 > ki.field_g) {
                param1 = -param3 + ki.field_g;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 + param2 <= ki.field_i) {
                break L4;
              } else {
                param2 = -param0 + ki.field_i;
                break L4;
              }
            }
            L5: {
              if (0 >= param1) {
                break L5;
              } else {
                if (param2 > 0) {
                  var6_int = param3 + param0 * ki.field_j;
                  var7 = ki.field_j - param1;
                  param0 = -param2;
                  L6: while (true) {
                    if (param0 >= 0) {
                      break L0;
                    } else {
                      param3 = -param1;
                      L7: while (true) {
                        if (param3 >= 0) {
                          var6_int = var6_int + var7;
                          param0++;
                          continue L6;
                        } else {
                          L8: {
                            var8 = ki.field_a[var6_int];
                            if ((var8 & 65280) >> 8 <= param4) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var6_int++;
                          param3++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var6, "rh.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 1 + 41);
        }
    }

    final static hb a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        hb var8 = new hb(param7, param0, param2, param4, param3, param1);
        hi.field_f.b(101, (rf) (Object) var8);
        if (param5 != -1893600464) {
            rh.a(false);
        }
        hb.a(-16, param6, var8);
        return var8;
    }

    final static void a(ia param0, byte param1) {
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
            va var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            va var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var21 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            String stackOut_63_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var21 = null;
            var23 = null;
            var12 = StarCannon.field_A;
            try {
              L0: {
                var13 = (va) (Object) ee.field_a.c(-3905);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var17.field_n <= var4) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_g;
                        param0.c((byte) -127, var17.field_k);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_n <= var5) {
                            int discarded$1 = param0.b((byte) -89, var4);
                            var17.b(4);
                            var5 = 0;
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_g[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_r[var5];
                                      if (var6_int != 0) {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_p[var5].field_f;
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_q[var5]);
                                          param0.a(0, -61);
                                          break L5;
                                        } else {
                                          if (var6_int == 2) {
                                            var28 = (java.lang.reflect.Field) var17.field_p[var5].field_f;
                                            var8 = var28.getModifiers();
                                            param0.a(0, -112);
                                            param0.c((byte) -86, var8);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) var17.field_p[var5].field_f;
                                        var8 = var27.getInt((Object) null);
                                        param0.a(0, -122);
                                        param0.c((byte) -118, var8);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var30 = (java.lang.reflect.Method) var17.field_i[var5].field_f;
                                        var26 = var17.field_l[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var26.length <= var10_int) {
                                            var10 = var30.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.a(1, -79);
                                                param0.a(true, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(4, -51);
                                                  break L6;
                                                } else {
                                                  param0.a(2, -53);
                                                  param0.b(false, (String) var10);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param0.a(0, -74);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          var29 = (java.lang.reflect.Method) var17.field_i[var5].field_f;
                                          var8 = var29.getModifiers();
                                          param0.a(0, -64);
                                          param0.c((byte) -79, var8);
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.a(-14, -58);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(-15, -74);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(-16, -70);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(-18, -76);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(-19, -115);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(-20, -66);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(-21, -81);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param0.a(var17.field_g[var5], -92);
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
                        if (null == var13.field_p[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (2 != var13.field_p[var4].field_b) {
                              break L21;
                            } else {
                              var13.field_g[var4] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_p[var4].field_b != 0) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        }
                      }
                      if (null != var13.field_i[var4]) {
                        L22: {
                          if (var13.field_i[var4].field_b != 2) {
                            break L22;
                          } else {
                            var13.field_g[var4] = -6;
                            break L22;
                          }
                        }
                        L23: {
                          if (var13.field_i[var4].field_b != 0) {
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
                stackOut_62_0 = (RuntimeException) var2;
                stackOut_62_1 = new StringBuilder().append("rh.A(");
                stackIn_64_0 = stackOut_62_0;
                stackIn_64_1 = stackOut_62_1;
                stackIn_63_0 = stackOut_62_0;
                stackIn_63_1 = stackOut_62_1;
                if (param0 == null) {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "null";
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  stackIn_65_2 = stackOut_64_2;
                  break L24;
                } else {
                  stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                  stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                  stackOut_63_2 = "{...}";
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  stackIn_65_2 = stackOut_63_2;
                  break L24;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + -68 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = new hl[8];
        field_j = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
