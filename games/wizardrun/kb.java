/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb extends gf {
    static o field_jb;

    final static void j(byte param0) {
        if (param0 != 63) {
            field_jb = null;
        }
        tj.a(param0 + 3025, jg.f(1));
    }

    kb(wi param0, ub param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, mg param1) {
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
            pk var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            pk var17 = null;
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
            var12 = wizardrun.field_H;
            var13 = (pk) (Object) kj.field_d.b((byte) 60);
            var17 = var13;
            if (var17 == null) {
              return;
            } else {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var17.field_r) {
                  if (var3 != 0) {
                    return;
                  } else {
                    L1: {
                      var4 = param1.field_m;
                      param1.f(var17.field_i, 613003928);
                      var5 = 0;
                      if (param0 >= 17) {
                        break L1;
                      } else {
                        kb.j((byte) -60);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var17.field_r <= var5) {
                        int discarded$1 = param1.e(var4, -1182887024);
                        var17.a(false);
                        return;
                      } else {
                        L3: {
                          if (-1 != (var17.field_j[var5] ^ -1)) {
                            param1.b((byte) 11, var17.field_j[var5]);
                            break L3;
                          } else {
                            try {
                              L4: {
                                L5: {
                                  var6_int = var17.field_t[var5];
                                  if (0 != var6_int) {
                                    if (1 == var6_int) {
                                      var16_ref = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                                      var20 = var16_ref;
                                      var20.setInt((Object) null, var17.field_p[var5]);
                                      param1.b((byte) 11, 0);
                                      break L5;
                                    } else {
                                      if (-3 != (var6_int ^ -1)) {
                                        break L5;
                                      } else {
                                        var28 = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                                        var8 = var28.getModifiers();
                                        param1.b((byte) 11, 0);
                                        param1.f(var8, 613003928);
                                        break L5;
                                      }
                                    }
                                  } else {
                                    var27 = (java.lang.reflect.Field) var17.field_l[var5].field_e;
                                    var8 = var27.getInt((Object) null);
                                    param1.b((byte) 11, 0);
                                    param1.f(var8, 613003928);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (var6_int == 3) {
                                    var30 = (java.lang.reflect.Method) var17.field_m[var5].field_e;
                                    var26 = var17.field_k[var5];
                                    var9 = new Object[var26.length];
                                    var10_int = 0;
                                    L7: while (true) {
                                      if ((var10_int ^ -1) <= (var26.length ^ -1)) {
                                        var10 = var30.invoke((Object) null, var9);
                                        if (var10 != null) {
                                          if (!(var10 instanceof Number)) {
                                            if (var10 instanceof String) {
                                              param1.b((byte) 11, 2);
                                              param1.a((String) var10, false);
                                              break L6;
                                            } else {
                                              param1.b((byte) 11, 4);
                                              break L6;
                                            }
                                          } else {
                                            param1.b((byte) 11, 1);
                                            param1.b(1290648728, ((Number) var10).longValue());
                                            break L6;
                                          }
                                        } else {
                                          param1.b((byte) 11, 0);
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
                                    if (4 != var6_int) {
                                      break L6;
                                    } else {
                                      var29 = (java.lang.reflect.Method) var17.field_m[var5].field_e;
                                      var8 = var29.getModifiers();
                                      param1.b((byte) 11, 0);
                                      param1.f(var8, 613003928);
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
                                param1.b((byte) 11, -15);
                                break L13;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter8) {
                              decompiledCaughtException = decompiledCaughtParameter8;
                              L16: {
                                var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                param1.b((byte) 11, -18);
                                break L16;
                              }
                            } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                              decompiledCaughtException = decompiledCaughtParameter9;
                              L17: {
                                var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                param1.b((byte) 11, -19);
                                break L17;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter10) {
                              decompiledCaughtException = decompiledCaughtParameter10;
                              L18: {
                                var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                param1.b((byte) 11, -20);
                                break L18;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter11) {
                              decompiledCaughtException = decompiledCaughtParameter11;
                              L19: {
                                var6_ref11 = decompiledCaughtException;
                                param1.b((byte) 11, -21);
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
                    if (null == var13.field_l[var4]) {
                      break L20;
                    } else {
                      L21: {
                        if (var13.field_l[var4].field_a != 2) {
                          break L21;
                        } else {
                          var13.field_j[var4] = -5;
                          break L21;
                        }
                      }
                      if (-1 == (var13.field_l[var4].field_a ^ -1)) {
                        var3 = 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (var13.field_m[var4] != null) {
                      L23: {
                        if ((var13.field_m[var4].field_a ^ -1) != -3) {
                          break L23;
                        } else {
                          var13.field_j[var4] = -6;
                          break L23;
                        }
                      }
                      if (-1 != (var13.field_m[var4].field_a ^ -1)) {
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
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(ub param0, int param1) {
        super.c(param0, -119);
        if (param1 > -109) {
            field_jb = null;
        }
    }

    public static void l(int param0) {
        if (param0 != 1) {
            field_jb = null;
        }
        field_jb = null;
    }

    static {
    }
}
