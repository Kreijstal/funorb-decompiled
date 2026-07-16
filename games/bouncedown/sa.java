/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa extends ai {
    int field_g;
    int field_m;
    static int field_k;
    static char[] field_j;
    int[][] field_o;
    long[][] field_l;
    int field_n;
    boolean field_i;
    String[][] field_h;

    final static void a(byte param0, ii param1) {
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
            hh var14 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            hh var17 = null;
            java.lang.reflect.Field var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var16 = null;
              var19 = null;
              var20 = null;
              var22 = null;
              var23 = null;
              var12 = Bounce.field_N;
              var14 = (hh) (Object) ob.field_c.a((byte) -83);
              var17 = var14;
              if (param0 == -97) {
                break L0;
              } else {
                var13 = null;
                int discarded$2 = sa.a((String) null, true, -1, (String) null, 30, 22, (String) null);
                break L0;
              }
            }
            if (var17 != null) {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var17.field_j <= var4) {
                  if (var3 == 0) {
                    var4 = param1.field_h;
                    param1.b(var17.field_g, (byte) 51);
                    var5 = 0;
                    L2: while (true) {
                      if (var17.field_j <= var5) {
                        int discarded$3 = param1.b(var4, -1);
                        var17.c(2);
                        return;
                      } else {
                        L3: {
                          if (-1 == (var17.field_i[var5] ^ -1)) {
                            try {
                              L4: {
                                L5: {
                                  var6_int = var17.field_o[var5];
                                  if (var6_int == 0) {
                                    var28 = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                    var8 = var28.getInt((Object) null);
                                    param1.a(0, (byte) 77);
                                    param1.b(var8, (byte) 50);
                                    break L5;
                                  } else {
                                    if ((var6_int ^ -1) != -2) {
                                      if (2 != var6_int) {
                                        break L5;
                                      } else {
                                        var27 = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                        var8 = var27.getModifiers();
                                        param1.a(0, (byte) 82);
                                        param1.b(var8, (byte) 62);
                                        break L5;
                                      }
                                    } else {
                                      var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_e;
                                      var18 = var16_ref;
                                      var18.setInt((Object) null, var17.field_l[var5]);
                                      param1.a(0, (byte) 85);
                                      break L5;
                                    }
                                  }
                                }
                                L6: {
                                  if ((var6_int ^ -1) != -4) {
                                    if (var6_int == 4) {
                                      var30 = (java.lang.reflect.Method) var17.field_s[var5].field_e;
                                      var8 = var30.getModifiers();
                                      param1.a(0, (byte) 80);
                                      param1.b(var8, (byte) 111);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    var29 = (java.lang.reflect.Method) var17.field_s[var5].field_e;
                                    var26 = var17.field_m[var5];
                                    var9 = new Object[var26.length];
                                    var10_int = 0;
                                    L7: while (true) {
                                      if (var26.length <= var10_int) {
                                        var10 = var29.invoke((Object) null, var9);
                                        if (var10 == null) {
                                          param1.a(0, (byte) 52);
                                          break L6;
                                        } else {
                                          if (!(var10 instanceof Number)) {
                                            if (var10 instanceof String) {
                                              param1.a(2, (byte) 125);
                                              param1.a(param0 ^ 159, (String) var10);
                                              break L6;
                                            } else {
                                              param1.a(4, (byte) 100);
                                              break L6;
                                            }
                                          } else {
                                            param1.a(1, (byte) 61);
                                            param1.a(252186072, ((Number) var10).longValue());
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                        var9[var10_int] = var11.readObject();
                                        var10_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                break L4;
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                              decompiledCaughtException = decompiledCaughtParameter5;
                              L13: {
                                var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                param1.a(-15, (byte) 63);
                                break L13;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter8) {
                              decompiledCaughtException = decompiledCaughtParameter8;
                              L16: {
                                var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                param1.a(-18, (byte) 96);
                                break L16;
                              }
                            } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                              decompiledCaughtException = decompiledCaughtParameter9;
                              L17: {
                                var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                param1.a(-19, (byte) 68);
                                break L17;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter10) {
                              decompiledCaughtException = decompiledCaughtParameter10;
                              L18: {
                                var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                param1.a(-20, (byte) 48);
                                break L18;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter11) {
                              decompiledCaughtException = decompiledCaughtParameter11;
                              L19: {
                                var6_ref11 = decompiledCaughtException;
                                param1.a(-21, (byte) 79);
                                break L19;
                              }
                            }
                            break L3;
                          } else {
                            param1.a(var17.field_i[var5], (byte) 75);
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
                    if (null != var14.field_n[var4]) {
                      L21: {
                        if ((var14.field_n[var4].field_f ^ -1) != -3) {
                          break L21;
                        } else {
                          var14.field_i[var4] = -5;
                          break L21;
                        }
                      }
                      if (var14.field_n[var4].field_f == 0) {
                        var3 = 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                  if (null != var14.field_s[var4]) {
                    L22: {
                      if ((var14.field_s[var4].field_f ^ -1) != -3) {
                        break L22;
                      } else {
                        var14.field_i[var4] = -6;
                        break L22;
                      }
                    }
                    if (var14.field_s[var4].field_f == 0) {
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

    final static int a(String param0, boolean param1, int param2, String param3, int param4, int param5, String param6) {
        ve var7 = null;
        ve var8 = null;
        if (param4 <= 53) {
          return -104;
        } else {
          var7 = new ve(param3);
          var8 = new ve(param0);
          return vb.a(param1, param6, 49, param5, var7, param2, var8);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            int discarded$0 = sa.a((String) null, true, -118, (String) null, -72, 70, (String) null);
        }
        field_j = null;
    }

    sa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
