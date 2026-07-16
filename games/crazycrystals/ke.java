/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ke {
    static String field_c;
    static String field_a;
    static int[] field_b;

    final static e a(String param0, int param1) {
        if (param1 != 28515) {
            Object var3 = null;
            ke.a((md) null, -96);
        }
        if (gk.field_e.b(param1 ^ -28494)) {
            if (!(param0.equals((Object) (Object) gk.field_e.a(125)))) {
                gk.field_e = lc.a(param0, (byte) 51);
            }
        }
        return gk.field_e;
    }

    abstract int a(long param0, int param1);

    final static void a(String param0, boolean param1, int param2) {
        ud.field_U = param1 ? true : false;
        dj.field_t = true;
        sp.field_a = new na(qe.field_g, mo.field_m, param0, ne.field_d, ud.field_U);
        if (param2 != -13) {
            field_a = null;
        }
        qe.field_g.b(-3264, (qm) (Object) sp.field_a);
    }

    abstract long a(boolean param0);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 < 123) {
            field_a = null;
        }
    }

    final int b(long param0, int param1) {
        long var4 = ((ke) this).a(true);
        if (param1 != -1) {
            return -69;
        }
        if (0L < var4) {
            fh.a(true, var4);
        }
        return ((ke) this).a(param0, param1 ^ 18);
    }

    final static void a(md param0, int param1) {
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
            Throwable decompiledCaughtException = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var21 = null;
            var23 = null;
            var12 = CrazyCrystals.field_B;
            var13 = (pi) (Object) hc.field_b.g(param1 + 41202);
            var17 = var13;
            if (var17 != null) {
              L0: {
                if (param1 == -9129) {
                  break L0;
                } else {
                  field_c = null;
                  break L0;
                }
              }
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if ((var17.field_i ^ -1) >= (var4 ^ -1)) {
                  if (var3 == 0) {
                    var4 = param0.field_f;
                    param0.a(var17.field_l, param1 ^ 7255);
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var17.field_i) {
                        int discarded$1 = param0.b(var4, (byte) -101);
                        var17.a(false);
                        return;
                      } else {
                        L3: {
                          if (var17.field_n[var5] == 0) {
                            try {
                              L4: {
                                L5: {
                                  var6_int = var17.field_f[var5];
                                  if (0 != var6_int) {
                                    if (1 == var6_int) {
                                      var16_ref = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                                      var20 = var16_ref;
                                      var20.setInt((Object) null, var17.field_g[var5]);
                                      param0.a(true, 0);
                                      break L5;
                                    } else {
                                      if (-3 == (var6_int ^ -1)) {
                                        var28 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                                        var8 = var28.getModifiers();
                                        param0.a(true, 0);
                                        param0.a(var8, -16384);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    var27 = (java.lang.reflect.Field) var17.field_k[var5].field_b;
                                    var8 = var27.getInt((Object) null);
                                    param0.a(true, 0);
                                    param0.a(var8, -16384);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if ((var6_int ^ -1) == -4) {
                                    var30 = (java.lang.reflect.Method) var17.field_m[var5].field_b;
                                    var26 = var17.field_h[var5];
                                    var9 = new Object[var26.length];
                                    var10_int = 0;
                                    L7: while (true) {
                                      if (var26.length <= var10_int) {
                                        var10 = var30.invoke((Object) null, var9);
                                        if (var10 == null) {
                                          param0.a(true, 0);
                                          break L6;
                                        } else {
                                          if (var10 instanceof Number) {
                                            param0.a(true, 1);
                                            param0.b(((Number) var10).longValue(), (byte) 13);
                                            break L6;
                                          } else {
                                            if (!(var10 instanceof String)) {
                                              param0.a(true, 4);
                                              break L6;
                                            } else {
                                              param0.a(true, 2);
                                              param0.b((String) var10, (byte) -23);
                                              break L6;
                                            }
                                          }
                                        }
                                      } else {
                                        var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                        var9[var10_int] = var11.readObject();
                                        var10_int++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    if (-5 == (var6_int ^ -1)) {
                                      var29 = (java.lang.reflect.Method) var17.field_m[var5].field_b;
                                      var8 = var29.getModifiers();
                                      param0.a(true, 0);
                                      param0.a(var8, -16384);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                break L4;
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                              decompiledCaughtException = decompiledCaughtParameter5;
                              L13: {
                                var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                param0.a(true, -15);
                                break L13;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter8) {
                              decompiledCaughtException = decompiledCaughtParameter8;
                              L16: {
                                var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                param0.a(true, -18);
                                break L16;
                              }
                            } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                              decompiledCaughtException = decompiledCaughtParameter9;
                              L17: {
                                var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                param0.a(true, -19);
                                break L17;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter10) {
                              decompiledCaughtException = decompiledCaughtParameter10;
                              L18: {
                                var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                param0.a(true, -20);
                                break L18;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter11) {
                              decompiledCaughtException = decompiledCaughtParameter11;
                              L19: {
                                var6_ref11 = decompiledCaughtException;
                                param0.a(true, -21);
                                break L19;
                              }
                            }
                            break L3;
                          } else {
                            param0.a(true, var17.field_n[var5]);
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
                    if (null == var13.field_k[var4]) {
                      break L20;
                    } else {
                      L21: {
                        if (-3 == (var13.field_k[var4].field_a ^ -1)) {
                          var13.field_n[var4] = -5;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      if (-1 != (var13.field_k[var4].field_a ^ -1)) {
                        break L20;
                      } else {
                        var3 = 1;
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (var13.field_m[var4] == null) {
                      break L22;
                    } else {
                      L23: {
                        if (-3 == (var13.field_m[var4].field_a ^ -1)) {
                          var13.field_n[var4] = -6;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      if (var13.field_m[var4].field_a != 0) {
                        break L22;
                      } else {
                        var3 = 1;
                        break L22;
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Service unavailable";
        field_c = "Watch how the green player lets the rock start rolling, but intercepts it before it actually falls.";
        field_b = new int[5];
    }
}
