/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class de {
    static ci field_d;
    static String field_a;
    static le field_c;
    static String field_b;

    final static void a(nk param0, byte param1) {
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
            Object var13 = null;
            fl var14 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            fl var18 = null;
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
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            String stackIn_62_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            String stackOut_61_2 = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            String stackOut_60_2 = null;
            var19 = null;
            var20 = null;
            var17 = null;
            var23 = null;
            var24 = null;
            var12 = Chess.field_G;
            try {
              L0: {
                var14 = (fl) (Object) vj.field_c.g(param1 ^ -18175);
                var18 = var14;
                if (var18 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var18.field_l <= var4) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_l;
                        param0.d(var18.field_t, (byte) -81);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var18.field_l) {
                            L3: {
                              if (param1 == 67) {
                                break L3;
                              } else {
                                var13 = null;
                                de.a((nk) null, (byte) -43);
                                break L3;
                              }
                            }
                            int discarded$1 = param0.b(var4, (byte) -126);
                            var18.c(-2193);
                            break L0;
                          } else {
                            L4: {
                              if (0 == var18.field_o[var5]) {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var18.field_q[var5];
                                      if (var6_int != 0) {
                                        if (var6_int == 1) {
                                          var17_ref = (java.lang.reflect.Field) var18.field_w[var5].field_b;
                                          var21 = var17_ref;
                                          var21.setInt((Object) null, var18.field_v[var5]);
                                          param0.c(0, (byte) 75);
                                          break L6;
                                        } else {
                                          if (var6_int == 2) {
                                            var29 = (java.lang.reflect.Field) var18.field_w[var5].field_b;
                                            var8 = var29.getModifiers();
                                            param0.c(0, (byte) -96);
                                            param0.d(var8, (byte) -81);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var28 = (java.lang.reflect.Field) var18.field_w[var5].field_b;
                                        var8 = var28.getInt((Object) null);
                                        param0.c(0, (byte) 116);
                                        param0.d(var8, (byte) -81);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (3 != var6_int) {
                                        if (var6_int != 4) {
                                          break L7;
                                        } else {
                                          var31 = (java.lang.reflect.Method) var18.field_u[var5].field_b;
                                          var8 = var31.getModifiers();
                                          param0.c(0, (byte) 111);
                                          param0.d(var8, (byte) -81);
                                          break L7;
                                        }
                                      } else {
                                        var30 = (java.lang.reflect.Method) var18.field_u[var5].field_b;
                                        var27 = var18.field_r[var5];
                                        var9 = new Object[var27.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var27.length <= var10_int) {
                                            var10 = var30.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.c(1, (byte) -100);
                                                param0.a(-98, ((Number) var10).longValue());
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.c(4, (byte) -51);
                                                  break L7;
                                                } else {
                                                  param0.c(2, (byte) -90);
                                                  param0.a(-108, (String) var10);
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param0.c(0, (byte) -67);
                                              break L7;
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
                                    break L5;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.c(-14, (byte) -115);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.c(-15, (byte) 123);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.c(-16, (byte) 79);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.c(-18, (byte) -56);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.c(-19, (byte) -114);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.c(-20, (byte) -113);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.c(-21, (byte) 118);
                                    break L20;
                                  }
                                }
                                break L4;
                              } else {
                                param0.c(var18.field_o[var5], (byte) 48);
                                break L4;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (null == var14.field_w[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if (var14.field_w[var4].field_f != 2) {
                              break L22;
                            } else {
                              var14.field_o[var4] = -5;
                              break L22;
                            }
                          }
                          if (var14.field_w[var4].field_f != 0) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      L23: {
                        if (null == var14.field_u[var4]) {
                          break L23;
                        } else {
                          break L23;
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
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_59_0 = (RuntimeException) var2;
                stackOut_59_1 = new StringBuilder().append("de.B(");
                stackIn_61_0 = stackOut_59_0;
                stackIn_61_1 = stackOut_59_1;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                if (param0 == null) {
                  stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                  stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                  stackOut_61_2 = "null";
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  stackIn_62_2 = stackOut_61_2;
                  break L24;
                } else {
                  stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                  stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                  stackOut_60_2 = "{...}";
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  stackIn_62_2 = stackOut_60_2;
                  break L24;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1) {
        if (!(pc.field_Mb == null)) {
            int discarded$0 = 85;
            sj.a(pc.field_Mb);
        }
        if (null != pi.field_d) {
            pi.field_d.b(-65, param1);
        }
        k.a(param1, 100);
        if (!(pj.field_h == null)) {
            pj.field_h.a(false, param1);
        }
        vk.a(false, param1);
    }

    final static void a(int param0) {
        if (qk.field_h == jc.field_f) {
            return;
        }
        if (0 <= jc.field_f) {
            ae.field_e[jc.field_f].c((byte) -57);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Owner";
        field_b = "This password contains repeated characters, and would be easy to guess";
    }
}
