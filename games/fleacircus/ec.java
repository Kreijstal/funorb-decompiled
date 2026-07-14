/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    volatile boolean field_h;
    ce field_f;
    volatile boolean field_g;
    static fh field_b;
    volatile la[] field_c;
    static String field_d;
    static String field_e;
    static String field_a;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 <= 116) {
            field_a = null;
        }
    }

    final static void a(ih param0, boolean param1) {
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
            fg var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            fg var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            Throwable decompiledCaughtException = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = fleas.field_A ? 1 : 0;
            var13 = (fg) (Object) jk.field_m.c((byte) 47);
            var17 = var13;
            if (var17 != null) {
              var3 = param1 ? 1 : 0;
              var4 = 0;
              L0: while (true) {
                if (var17.field_k <= var4) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var4 = param0.field_i;
                    param0.a(var17.field_v, (byte) -84);
                    var5 = 0;
                    L1: while (true) {
                      if (var17.field_k <= var5) {
                        var5++;
                      } else {
                        L2: {
                          if (var17.field_r[var5] != 0) {
                            param0.a(-11, var17.field_r[var5]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var6_int = var17.field_o[var5];
                                if (var6_int != 0) {
                                  if (var6_int != 1) {
                                    if (2 == var6_int) {
                                      var15 = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                      var8 = var15.getModifiers();
                                      param0.a(-11, 0);
                                      param0.a(var8, (byte) -18);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  } else {
                                    var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                    var19 = var16_ref;
                                    var19.setInt((Object) null, var17.field_p[var5]);
                                    param0.a(-11, 0);
                                    break L3;
                                  }
                                } else {
                                  var26 = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                  var8 = var26.getInt((Object) null);
                                  param0.a(-11, 0);
                                  param0.a(var8, (byte) -58);
                                  break L3;
                                }
                              }
                              L4: {
                                if (var6_int != 3) {
                                  if (4 == var6_int) {
                                    var28 = (java.lang.reflect.Method) var17.field_s[var5].field_e;
                                    var8 = var28.getModifiers();
                                    param0.a(-11, 0);
                                    param0.a(var8, (byte) -32);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Method) var17.field_s[var5].field_e;
                                  var25 = var17.field_w[var5];
                                  var9 = new Object[var25.length];
                                  var10_int = 0;
                                  L5: while (true) {
                                    if (var25.length <= var10_int) {
                                      var10 = var27.invoke((Object) null, var9);
                                      if (var10 == null) {
                                        param0.a(-11, 0);
                                        break L4;
                                      } else {
                                        if (!(var10 instanceof Number)) {
                                          if (var10 instanceof String) {
                                            param0.a(-11, 2);
                                            param0.a(127, (String) var10);
                                            break L4;
                                          } else {
                                            param0.a(-11, 4);
                                            break L4;
                                          }
                                        } else {
                                          param0.a(-11, 1);
                                          param0.a(-83, ((Number) var10).longValue());
                                          break L4;
                                        }
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param0.a(-11, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param0.a(-11, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param0.a(-11, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param0.a(-11, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param0.a(-11, -20);
                            }
                            break L2;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param0.a(-11, -21);
                        continue L1;
                      }
                    }
                  }
                } else {
                  L6: {
                    if (null == var13.field_n[var4]) {
                      break L6;
                    } else {
                      L7: {
                        if (2 != var13.field_n[var4].field_b) {
                          break L7;
                        } else {
                          var13.field_r[var4] = -5;
                          break L7;
                        }
                      }
                      if (0 != var13.field_n[var4].field_b) {
                        break L6;
                      } else {
                        var3 = 1;
                        break L6;
                      }
                    }
                  }
                  if (var13.field_s[var4] != null) {
                    L8: {
                      if (2 != var13.field_s[var4].field_b) {
                        break L8;
                      } else {
                        var13.field_r[var4] = -6;
                        break L8;
                      }
                    }
                    if (-1 == (var13.field_s[var4].field_b ^ -1)) {
                      var3 = 1;
                      var4++;
                      continue L0;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
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

    final static void a(hg param0, byte param1, int param2) {
        ih var3 = ud.field_b;
        var3.e(8, param2);
        if (param1 != 30) {
            return;
        }
        var3.a(-11, param0.field_m);
        var3.a(-11, param0.field_j);
    }

    public final void run() {
        int var1_int = 0;
        la var2 = null;
        int var4 = fleas.field_A ? 1 : 0;
        ((ec) this).field_h = true;
        try {
            while (!((ec) this).field_g) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ec) this).field_c[var1_int];
                    if (var2 != null) {
                        var2.a();
                    }
                }
                vh.a(10L, -108);
                aj.a((byte) -60, (Object) null, ((ec) this).field_f);
            }
        } catch (Exception exception) {
            Object var5 = null;
            ud.a((String) null, (Throwable) (Object) exception, 0);
        } finally {
            ((ec) this).field_h = false;
        }
    }

    ec() {
        ((ec) this).field_c = new la[2];
        ((ec) this).field_g = false;
        ((ec) this).field_h = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fh(1, 2, 2, 0);
        field_d = "Hints (1/2)";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_a = "Start new levels";
    }
}
