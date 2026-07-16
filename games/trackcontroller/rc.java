/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rc {
    int[] field_b;
    int field_c;
    int field_a;
    java.awt.Image field_d;

    abstract void a(int param0, int param1, java.awt.Component param2, int param3);

    final static void a(int param0, la param1) {
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
            Object var13 = null;
            kj var14 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            kj var18 = null;
            Object var19 = null;
            Object var20 = null;
            java.lang.reflect.Field var21 = null;
            Object var23 = null;
            Object var24 = null;
            byte[][] var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Field var29 = null;
            java.lang.reflect.Method var30 = null;
            java.lang.reflect.Method var31 = null;
            Throwable decompiledCaughtException = null;
            var19 = null;
            var20 = null;
            var17 = null;
            var23 = null;
            var24 = null;
            var12 = TrackController.field_F ? 1 : 0;
            var14 = (kj) (Object) si.field_a.b(2);
            var18 = var14;
            if (var18 != null) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if ((var4 ^ -1) <= (var18.field_n ^ -1)) {
                  if (var3 != 0) {
                    return;
                  } else {
                    L1: {
                      if (param0 >= 45) {
                        break L1;
                      } else {
                        var13 = null;
                        rc.a(92, (la) null);
                        break L1;
                      }
                    }
                    var4 = param1.field_k;
                    param1.b(false, var18.field_w);
                    var5 = 0;
                    L2: while (true) {
                      if ((var5 ^ -1) <= (var18.field_n ^ -1)) {
                        int discarded$1 = param1.a(var4, false);
                        var18.a(-79);
                        return;
                      } else {
                        L3: {
                          if ((var18.field_i[var5] ^ -1) != -1) {
                            param1.a(var18.field_i[var5], (byte) -75);
                            break L3;
                          } else {
                            try {
                              L4: {
                                L5: {
                                  var6_int = var18.field_m[var5];
                                  if (-1 != (var6_int ^ -1)) {
                                    if ((var6_int ^ -1) == -2) {
                                      var17_ref = (java.lang.reflect.Field) var18.field_j[var5].field_e;
                                      var21 = var17_ref;
                                      var21.setInt((Object) null, var18.field_u[var5]);
                                      param1.a(0, (byte) -117);
                                      break L5;
                                    } else {
                                      if ((var6_int ^ -1) == -3) {
                                        var29 = (java.lang.reflect.Field) var18.field_j[var5].field_e;
                                        var8 = var29.getModifiers();
                                        param1.a(0, (byte) -100);
                                        param1.b(false, var8);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    var28 = (java.lang.reflect.Field) var18.field_j[var5].field_e;
                                    var8 = var28.getInt((Object) null);
                                    param1.a(0, (byte) -122);
                                    param1.b(false, var8);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (3 != var6_int) {
                                    L7: {
                                      if ((var6_int ^ -1) != -5) {
                                        break L7;
                                      } else {
                                        var31 = (java.lang.reflect.Method) var18.field_v[var5].field_e;
                                        var8 = var31.getModifiers();
                                        param1.a(0, (byte) -110);
                                        param1.b(false, var8);
                                        break L7;
                                      }
                                    }
                                    break L6;
                                  } else {
                                    var30 = (java.lang.reflect.Method) var18.field_v[var5].field_e;
                                    var27 = var18.field_p[var5];
                                    var9 = new Object[var27.length];
                                    var10_int = 0;
                                    L8: while (true) {
                                      if (var27.length <= var10_int) {
                                        var10 = var30.invoke((Object) null, var9);
                                        if (var10 == null) {
                                          param1.a(0, (byte) -114);
                                          break L6;
                                        } else {
                                          if (!(var10 instanceof Number)) {
                                            if (var10 instanceof String) {
                                              param1.a(2, (byte) -127);
                                              param1.a((byte) -57, (String) var10);
                                              break L6;
                                            } else {
                                              param1.a(4, (byte) -91);
                                              break L6;
                                            }
                                          } else {
                                            param1.a(1, (byte) -60);
                                            param1.a(((Number) var10).longValue(), 2147483647);
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var27[var10_int]));
                                        var9[var10_int] = var11.readObject();
                                        var10_int++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                                break L4;
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                              decompiledCaughtException = decompiledCaughtParameter5;
                              L14: {
                                var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                param1.a(-15, (byte) -83);
                                break L14;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter8) {
                              decompiledCaughtException = decompiledCaughtParameter8;
                              L17: {
                                var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                param1.a(-18, (byte) -79);
                                break L17;
                              }
                            } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                              decompiledCaughtException = decompiledCaughtParameter9;
                              L18: {
                                var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                param1.a(-19, (byte) -85);
                                break L18;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter10) {
                              decompiledCaughtException = decompiledCaughtParameter10;
                              L19: {
                                var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                param1.a(-20, (byte) -97);
                                break L19;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter11) {
                              decompiledCaughtException = decompiledCaughtParameter11;
                              L20: {
                                var6_ref11 = decompiledCaughtException;
                                param1.a(-21, (byte) -67);
                                break L20;
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
                  L21: {
                    if (null != var14.field_j[var4]) {
                      L22: {
                        if ((var14.field_j[var4].field_f ^ -1) != -3) {
                          break L22;
                        } else {
                          var14.field_i[var4] = -5;
                          break L22;
                        }
                      }
                      if (-1 == (var14.field_j[var4].field_f ^ -1)) {
                        var3 = 1;
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  L23: {
                    if (var14.field_v[var4] == null) {
                      break L23;
                    } else {
                      L24: {
                        if (-3 == (var14.field_v[var4].field_f ^ -1)) {
                          var14.field_i[var4] = -6;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      if (-1 != (var14.field_v[var4].field_f ^ -1)) {
                        break L23;
                      } else {
                        var3 = 1;
                        break L23;
                      }
                    }
                  }
                  var4++;
                  continue L0;
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

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final void a(int param0) {
        if (param0 != -91) {
            Object var3 = null;
            ((rc) this).a(-118, (java.awt.Graphics) null, -61, 99);
        }
        ll.a(((rc) this).field_b, ((rc) this).field_c, ((rc) this).field_a);
    }

    final static boolean a(int param0, kk param1) {
        if (param0 > -23) {
            return true;
        }
        return param1.a((byte) 48);
    }

    static {
    }
}
