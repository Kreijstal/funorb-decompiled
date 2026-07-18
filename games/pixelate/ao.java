/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ao implements Runnable {
    static sb field_e;
    static String field_i;
    static int field_c;
    static int field_d;
    volatile boolean field_a;
    volatile boolean field_f;
    cb field_g;
    volatile mm[] field_h;
    static String field_b;

    final static void a(pc param0) {
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
            aj var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            aj var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
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
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                var13 = (aj) (Object) ma.field_o.c(1504642273);
                var17 = var13;
                if (var17 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (~var4 <= ~var17.field_s) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_m;
                        param0.d(var17.field_p, -66);
                        var5 = 0;
                        L2: while (true) {
                          if (~var17.field_s >= ~var5) {
                            int discarded$1 = param0.b(var4, (byte) 111);
                            var17.c(2779);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_u[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_r[var5];
                                      if (var6_int != 0) {
                                        if (var6_int != 1) {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var15 = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                                            var8 = var15.getModifiers();
                                            param0.e(160, 0);
                                            param0.d(var8, -46);
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_q[var5]);
                                          param0.e(160, 0);
                                          break L5;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                                        var8 = var26.getInt((Object) null);
                                        param0.e(160, 0);
                                        param0.d(var8, -124);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        L7: {
                                          if (4 != var6_int) {
                                            break L7;
                                          } else {
                                            var28 = (java.lang.reflect.Method) var17.field_v[var5].field_e;
                                            var8 = var28.getModifiers();
                                            param0.e(160, 0);
                                            param0.d(var8, -45);
                                            break L7;
                                          }
                                        }
                                        break L6;
                                      } else {
                                        var27 = (java.lang.reflect.Method) var17.field_v[var5].field_e;
                                        var25 = var17.field_w[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.e(160, 0);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param0.e(160, 1);
                                                param0.a(false, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.e(160, 4);
                                                  break L6;
                                                } else {
                                                  param0.e(160, 2);
                                                  param0.b((byte) -41, (String) var10);
                                                  break L6;
                                                }
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
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
                                    param0.e(160, -14);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.e(160, -15);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.e(160, -16);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.e(160, -18);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.e(160, -19);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.e(160, -20);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.e(160, -21);
                                    break L20;
                                  }
                                }
                                break L3;
                              } else {
                                param0.e(160, var17.field_u[var5]);
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
                        if (null != var13.field_l[var4]) {
                          L22: {
                            if (var13.field_l[var4].field_b == 2) {
                              var13.field_u[var4] = -5;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (0 != var13.field_l[var4].field_b) {
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
                        if (var13.field_v[var4] == null) {
                          break L23;
                        } else {
                          L24: {
                            if (var13.field_v[var4].field_b != 2) {
                              break L24;
                            } else {
                              var13.field_u[var4] = -6;
                              break L24;
                            }
                          }
                          if (var13.field_v[var4].field_b == 0) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_62_0 = (RuntimeException) var2;
                stackOut_62_1 = new StringBuilder().append("ao.C(");
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
                  break L25;
                } else {
                  stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                  stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                  stackOut_63_2 = "{...}";
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  stackIn_65_2 = stackOut_63_2;
                  break L25;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ',' + -20 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet a(int param0) {
        if (!(bd.field_b == null)) {
            return bd.field_b;
        }
        if (param0 != 13867) {
            return null;
        }
        return (java.applet.Applet) (Object) ne.field_I;
    }

    final static void b(int param0) {
        if (null != wa.field_c) {
            wa.field_c.a((byte) -22);
        }
        if (null != cn.field_b) {
            cn.field_b.o(30);
        }
        int var1 = -72 % ((param0 - 48) / 43);
        int discarded$0 = -95;
        hm.a();
    }

    public static void a() {
        field_b = null;
        field_i = null;
        field_e = null;
    }

    public final void run() {
        int var1_int = 0;
        mm var2 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        ((ao) this).field_f = true;
        try {
            while (!((ao) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ao) this).field_h[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.b();
                    }
                }
                int discarded$0 = 23;
                vg.a(10L);
                Object var5 = null;
                fm.a(((ao) this).field_g, (Object) null, (byte) -52);
            }
        } catch (Exception exception) {
            Object var6 = null;
            jo.a(1, (String) null, (Throwable) (Object) exception);
        } finally {
            ((ao) this).field_f = false;
        }
    }

    ao() {
        ((ao) this).field_h = new mm[2];
        ((ao) this).field_a = false;
        ((ao) this).field_f = false;
    }

    final static void a(int param0, int param1) {
        pc var2 = aa.field_f;
        int var3 = 0;
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_i = "Game options changed (<%0>)";
        field_b = "Unfortunately you are not eligible to create an account.";
    }
}
