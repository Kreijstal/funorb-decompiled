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
            Throwable decompiledCaughtException = null;
            L0: {
              var18 = null;
              var19 = null;
              var16 = null;
              var22 = null;
              var23 = null;
              var12 = ArcanistsMulti.field_G ? 1 : 0;
              if (param0 == -5534) {
                break L0;
              } else {
                field_d = null;
                break L0;
              }
            }
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
                        var5++;
                      } else {
                        L3: {
                          if (var17.field_j[var5] == 0) {
                            try {
                              L4: {
                                var6_int = var17.field_o[var5];
                                if (-1 != (var6_int ^ -1)) {
                                  if (var6_int == -2) {
                                    var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_g;
                                    var20 = var16_ref;
                                    var20.setInt((Object) null, var17.field_p[var5]);
                                    param1.f(0, (byte) -10);
                                    break L4;
                                  } else {
                                    if (-3 == var6_int) {
                                      var28 = (java.lang.reflect.Field) var17.field_n[var5].field_g;
                                      var8 = var28.getModifiers();
                                      param1.f(0, (byte) -10);
                                      param1.a(var8, (byte) -101);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Field) var17.field_n[var5].field_g;
                                  var8 = var27.getInt((Object) null);
                                  param1.f(0, (byte) -37);
                                  param1.a(var8, (byte) -101);
                                  break L4;
                                }
                              }
                              L5: {
                                if (-4 != (var6_int ^ -1)) {
                                  if ((var6_int ^ -1) != -5) {
                                    break L5;
                                  } else {
                                    var30 = (java.lang.reflect.Method) var17.field_g[var5].field_g;
                                    var8 = var30.getModifiers();
                                    param1.f(0, (byte) -102);
                                    param1.a(var8, (byte) -101);
                                    break L5;
                                  }
                                } else {
                                  var29 = (java.lang.reflect.Method) var17.field_g[var5].field_g;
                                  var26 = var17.field_l[var5];
                                  var9 = new Object[var26.length];
                                  var10_int = 0;
                                  L6: while (true) {
                                    if (var26.length <= var10_int) {
                                      var10 = var29.invoke((Object) null, var9);
                                      if (var10 != null) {
                                        if (!(var10 instanceof Number)) {
                                          if (!(var10 instanceof String)) {
                                            param1.f(4, (byte) -115);
                                            break L5;
                                          } else {
                                            param1.f(2, (byte) -118);
                                            param1.a((String) var10, 23333);
                                            break L5;
                                          }
                                        } else {
                                          param1.f(1, (byte) -64);
                                          param1.a(((Number) var10).longValue(), (byte) 78);
                                          break L5;
                                        }
                                      } else {
                                        param1.f(0, (byte) -66);
                                        break L5;
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param1.f(-14, (byte) -25);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param1.f(-17, (byte) -36);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param1.f(-18, (byte) -82);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param1.f(-19, (byte) -65);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param1.f(-20, (byte) -118);
                            }
                            break L3;
                          } else {
                            param1.f(var17.field_j[var5], (byte) -67);
                            break L3;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param1.f(-21, (byte) -27);
                        continue L2;
                      }
                    }
                  }
                } else {
                  L7: {
                    if (var13.field_n[var4] == null) {
                      break L7;
                    } else {
                      L8: {
                        if (2 == var13.field_n[var4].field_e) {
                          var13.field_j[var4] = -5;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (0 != var13.field_n[var4].field_e) {
                        break L7;
                      } else {
                        var3 = 1;
                        break L7;
                      }
                    }
                  }
                  if (var13.field_g[var4] != null) {
                    L9: {
                      if (-3 != var13.field_g[var4].field_e) {
                        break L9;
                      } else {
                        var13.field_j[var4] = -6;
                        break L9;
                      }
                    }
                    if (-1 == var13.field_g[var4].field_e) {
                      var3 = 1;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
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

    final static void a(byte param0, int param1, int param2) {
        if (param0 <= 36) {
            return;
        }
        ub.field_g = param1;
        af.field_Eb = param2;
    }

    final static void a(int param0) {
        oc.a(false);
        if (param0 != 0) {
            return;
        }
        ld.c((byte) 13);
        db.field_a = null;
        gb.a(14);
    }

    final static ho a(byte param0, String[] param1) {
        ho var2 = new ho(false);
        var2.field_b = param1;
        if (param0 < 82) {
            return null;
        }
        return var2;
    }

    final static String b(byte param0) {
        String var1 = "";
        if (null != wh.field_f) {
            var1 = wh.field_f.e(true);
        }
        if (0 == var1.length()) {
            var1 = gi.a(0);
        }
        int var2 = 101 / ((24 - param0) / 56);
        if (var1.length() == 0) {
            var1 = ob.field_ib;
        }
        return var1;
    }

    final static boolean a(byte param0) {
        int var1 = -61 / ((12 - param0) / 47);
        return bj.field_mb;
    }

    ho(boolean param0) {
        ((ho) this).field_f = param0 ? true : false;
    }

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        if (param0 != 0) {
            field_d = null;
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> cannot join; the game has started.";
    }
}
