/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ke {
    static String field_c;
    static String field_a;
    static int[] field_b;

    final static e a(String param0, int param1) {
        RuntimeException var2 = null;
        md var3 = null;
        e stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 28515) {
                break L1;
              } else {
                var3 = (md) null;
                ke.a((md) null, -96);
                break L1;
              }
            }
            L2: {
              if (!gk.field_e.b(param1 ^ -28494)) {
                break L2;
              } else {
                if (!param0.equals(gk.field_e.a(125))) {
                  gk.field_e = lc.a(param0, (byte) 51);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_6_0 = gk.field_e;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("ke.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    abstract int a(long param0, int param1);

    final static void a(String param0, boolean param1, int param2) {
        try {
            ud.field_U = param1;
            dj.field_t = true;
            sp.field_a = new na(qe.field_g, mo.field_m, param0, ne.field_d, ud.field_U);
            if (param2 != -13) {
                field_a = (String) null;
            }
            qe.field_g.b(-3264, sp.field_a);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ke.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract long a(boolean param0);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 123) {
            field_a = (String) null;
        }
    }

    final int b(long param0, int param1) {
        long var4 = this.a(true);
        if (param1 != -1) {
            return -69;
        }
        if (0L < var4) {
            fh.a(true, var4);
        }
        return this.a(param0, param1 ^ 18);
    }

    final static void a(md param0, int param1) {
        try {
            int discarded$1 = 0;
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
            pi var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            pi var17 = null;
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
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var21 = null;
            var23 = null;
            var12 = CrazyCrystals.field_B;
            try {
              L0: {
                var13 = (pi) ((Object) hc.field_b.g(param1 + 41202));
                var17 = var13;
                if (var17 != null) {
                  L1: {
                    if (param1 == -9129) {
                      break L1;
                    } else {
                      field_c = (String) null;
                      break L1;
                    }
                  }
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var17.field_i <= var4) {
                      if (var3 == 0) {
                        var4 = param0.field_f;
                        param0.a(var17.field_l, param1 ^ 7255);
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var17.field_i) {
                            discarded$1 = param0.b(var4, (byte) -101);
                            var17.a(false);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (var17.field_n[var5] == 0) {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_f[var5];
                                      if (0 != var6_int) {
                                        if (1 == var6_int) {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_g[var5]);
                                          param0.a(true, 0);
                                          break L6;
                                        } else {
                                          if (-3 == (var6_int ^ -1)) {
                                            var28 = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                                            var8 = var28.getModifiers();
                                            param0.a(true, 0);
                                            param0.a(var8, -16384);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                                        var8 = var27.getInt((Object) null);
                                        param0.a(true, 0);
                                        param0.a(var8, -16384);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((var6_int ^ -1) == -4) {
                                        var30 = (java.lang.reflect.Method) (var17.field_m[var5].field_b);
                                        var26 = var17.field_h[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var26.length <= var10_int) {
                                            var10 = var30.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.a(true, 0);
                                              break L7;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param0.a(true, 1);
                                                param0.b(((Number) (var10)).longValue(), (byte) 13);
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(true, 4);
                                                  break L7;
                                                } else {
                                                  param0.a(true, 2);
                                                  param0.b((String) (var10), (byte) -23);
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (-5 == (var6_int ^ -1)) {
                                          var29 = (java.lang.reflect.Method) (var17.field_m[var5].field_b);
                                          var8 = var29.getModifiers();
                                          param0.a(true, 0);
                                          param0.a(var8, -16384);
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
                                    param0.a(true, -10);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.a(true, -11);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.a(true, -12);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.a(true, -13);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.a(true, -14);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(true, -15);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(true, -16);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.a(true, -17);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(true, -18);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(true, -19);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(true, -20);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(true, -21);
                                    break L20;
                                  }
                                }
                                break L4;
                              } else {
                                param0.a(true, var17.field_n[var5]);
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
                        if (null == var13.field_k[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if (-3 == (var13.field_k[var4].field_a ^ -1)) {
                              var13.field_n[var4] = -5;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (-1 != (var13.field_k[var4].field_a ^ -1)) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      if (var13.field_m[var4] != null) {
                        L23: {
                          if (-3 == (var13.field_m[var4].field_a ^ -1)) {
                            var13.field_n[var4] = -6;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (var13.field_m[var4].field_a == 0) {
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
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_64_0 = (RuntimeException) (var2);
                stackOut_64_1 = new StringBuilder().append("ke.C(");
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                if (param0 == null) {
                  stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackOut_66_2 = "null";
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  break L24;
                } else {
                  stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
                  stackOut_65_2 = "{...}";
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_67_1 = stackOut_65_1;
                  stackIn_67_2 = stackOut_65_2;
                  break L24;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param1 + ')');
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

    abstract void a(int param0);

    static {
        field_a = "Service unavailable";
        field_c = "Watch how the green player lets the rock start rolling, but intercepts it before it actually falls.";
        field_b = new int[5];
    }
}
