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
    }

    final static void a(ih param0, boolean param1) {
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
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            String stackIn_61_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_58_0 = null;
            StringBuilder stackOut_58_1 = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            String stackOut_60_2 = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            String stackOut_59_2 = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                var13 = (fg) (Object) jk.field_m.c((byte) 47);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var17.field_k <= var4) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_i;
                        param0.a(var17.field_v, (byte) -84);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_k <= var5) {
                            int discarded$1 = param0.c(var4, -30532);
                            var17.c(-1);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_r[var5] != 0) {
                                param0.a(-11, var17.field_r[var5]);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_o[var5];
                                      if (var6_int != 0) {
                                        if (var6_int != 1) {
                                          if (2 == var6_int) {
                                            var15 = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                            var8 = var15.getModifiers();
                                            param0.a(-11, 0);
                                            param0.a(var8, (byte) -18);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_p[var5]);
                                          param0.a(-11, 0);
                                          break L5;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                        var8 = var26.getInt((Object) null);
                                        param0.a(-11, 0);
                                        param0.a(var8, (byte) -58);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if (4 == var6_int) {
                                          var28 = (java.lang.reflect.Method) var17.field_s[var5].field_e;
                                          var8 = var28.getModifiers();
                                          param0.a(-11, 0);
                                          param0.a(var8, (byte) -32);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Method) var17.field_s[var5].field_e;
                                        var25 = var17.field_w[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.a(-11, 0);
                                              break L6;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param0.a(-11, 2);
                                                  param0.a(127, (String) var10);
                                                  break L6;
                                                } else {
                                                  param0.a(-11, 4);
                                                  break L6;
                                                }
                                              } else {
                                                param0.a(-11, 1);
                                                param0.a(-83, ((Number) var10).longValue());
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
                                    param0.a(-11, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(-11, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(-11, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(-11, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(-11, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(-11, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(-11, -21);
                                    break L19;
                                  }
                                }
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
                        if (null == var13.field_n[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (2 != var13.field_n[var4].field_b) {
                              break L21;
                            } else {
                              var13.field_r[var4] = -5;
                              break L21;
                            }
                          }
                          if (0 != var13.field_n[var4].field_b) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (var13.field_s[var4] == null) {
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
                stackOut_58_0 = (RuntimeException) var2;
                stackOut_58_1 = new StringBuilder().append("ec.C(");
                stackIn_60_0 = stackOut_58_0;
                stackIn_60_1 = stackOut_58_1;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                if (param0 == null) {
                  stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                  stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                  stackOut_60_2 = "null";
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  stackIn_61_2 = stackOut_60_2;
                  break L23;
                } else {
                  stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                  stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                  stackOut_59_2 = "{...}";
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_61_1 = stackOut_59_1;
                  stackIn_61_2 = stackOut_59_2;
                  break L23;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ',' + false + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(hg param0, byte param1, int param2) {
        ih var3 = ud.field_b;
        var3.e(8, 7);
        try {
            var3.a(-11, param0.field_m);
            var3.a(-11, param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ec.B(" + (param0 != null ? "{...}" : "null") + ',' + 30 + ',' + 7 + ')');
        }
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
