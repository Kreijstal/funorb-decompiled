/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements uj {
    static int field_a;
    static int field_b;
    static String field_d;
    static ea[] field_e;
    static th field_c;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 2) {
            field_c = null;
        }
        field_d = null;
    }

    final static void a(byte param0, ld param1) {
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
            gl var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            gl var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var18 = null;
              var16 = null;
              var20 = null;
              var22 = null;
              var12 = MinerDisturbance.field_ab;
              var13 = (gl) (Object) on.field_t.b(105);
              var17 = var13;
              if (param0 == 119) {
                break L0;
              } else {
                field_e = null;
                break L0;
              }
            }
            if (var17 == null) {
              return;
            } else {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var17.field_y) {
                  if (var3 == 0) {
                    var4 = param1.field_o;
                    param1.a((byte) 107, var17.field_n);
                    var5 = 0;
                    L2: while (true) {
                      if (var17.field_y <= var5) {
                        int discarded$1 = param1.e(-84, var4);
                        var17.b(param0 + -85);
                        return;
                      } else {
                        L3: {
                          if (0 != var17.field_w[var5]) {
                            param1.c(var17.field_w[var5], 25564);
                            break L3;
                          } else {
                            try {
                              L4: {
                                L5: {
                                  var6_int = var17.field_s[var5];
                                  if (var6_int != 0) {
                                    if ((var6_int ^ -1) != -2) {
                                      if (var6_int == 2) {
                                        var15 = (java.lang.reflect.Field) var17.field_r[var5].field_a;
                                        var8 = var15.getModifiers();
                                        param1.c(0, 25564);
                                        param1.a((byte) 95, var8);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    } else {
                                      var16_ref = (java.lang.reflect.Field) var17.field_r[var5].field_a;
                                      var19 = var16_ref;
                                      var19.setInt((Object) null, var17.field_p[var5]);
                                      param1.c(0, 25564);
                                      break L5;
                                    }
                                  } else {
                                    var26 = (java.lang.reflect.Field) var17.field_r[var5].field_a;
                                    var8 = var26.getInt((Object) null);
                                    param1.c(0, 25564);
                                    param1.a((byte) 120, var8);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (var6_int == 3) {
                                    var28 = (java.lang.reflect.Method) var17.field_q[var5].field_a;
                                    var25 = var17.field_v[var5];
                                    var9 = new Object[var25.length];
                                    var10_int = 0;
                                    L7: while (true) {
                                      if (var10_int >= var25.length) {
                                        var10 = var28.invoke((Object) null, var9);
                                        if (var10 == null) {
                                          param1.c(0, 25564);
                                          break L6;
                                        } else {
                                          if (var10 instanceof Number) {
                                            param1.c(1, 25564);
                                            param1.b(-1, ((Number) var10).longValue());
                                            break L6;
                                          } else {
                                            if (!(var10 instanceof String)) {
                                              param1.c(4, 25564);
                                              break L6;
                                            } else {
                                              param1.c(2, 25564);
                                              param1.b(23446, (String) var10);
                                              break L6;
                                            }
                                          }
                                        }
                                      } else {
                                        var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                        var9[var10_int] = var11.readObject();
                                        var10_int++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    if (-5 == (var6_int ^ -1)) {
                                      var27 = (java.lang.reflect.Method) var17.field_q[var5].field_a;
                                      var8 = var27.getModifiers();
                                      param1.c(0, 25564);
                                      param1.a((byte) 108, var8);
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
                                param1.c(-15, 25564);
                                break L13;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter8) {
                              decompiledCaughtException = decompiledCaughtParameter8;
                              L16: {
                                var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                param1.c(-18, param0 + 25445);
                                break L16;
                              }
                            } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                              decompiledCaughtException = decompiledCaughtParameter9;
                              L17: {
                                var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                param1.c(-19, 25564);
                                break L17;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter10) {
                              decompiledCaughtException = decompiledCaughtParameter10;
                              L18: {
                                var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                param1.c(-20, 25564);
                                break L18;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter11) {
                              decompiledCaughtException = decompiledCaughtParameter11;
                              L19: {
                                var6_ref11 = decompiledCaughtException;
                                param1.c(-21, 25564);
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
                  } else {
                    return;
                  }
                } else {
                  L20: {
                    if (var13.field_r[var4] == null) {
                      break L20;
                    } else {
                      L21: {
                        if (var13.field_r[var4].field_c == 2) {
                          var13.field_w[var4] = -5;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      if (-1 != (var13.field_r[var4].field_c ^ -1)) {
                        break L20;
                      } else {
                        var3 = 1;
                        break L20;
                      }
                    }
                  }
                  if (null != var13.field_q[var4]) {
                    L22: {
                      if (-3 == (var13.field_q[var4].field_c ^ -1)) {
                        var13.field_w[var4] = -6;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if (0 == var13.field_q[var4].field_c) {
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
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(boolean param0) {
        tb.field_a = 4;
        om.field_g = 9;
        if (param0) {
            Object var3 = null;
            p discarded$0 = pj.a(106, 69, (bj) null, 17, (bj) null);
        }
    }

    public final String a(byte param0) {
        int var2 = -73 % ((param0 - -33) / 62);
        return "Add Myth";
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          if ((field_a ^ -1) < -1) {
            L1: {
              if (null == ij.field_o) {
                kf.field_d = pe.a((byte) -124, 640, 0, 480, 0, qa.field_a);
                break L1;
              } else {
                kf.field_d = ij.field_o.a((byte) -70);
                le.a((byte) -128, 2);
                break L1;
              }
            }
            if (null != kf.field_d) {
              var2 = 2;
              ab.a((byte) -13, (java.awt.Canvas) (Object) kf.field_d);
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          } else {
            if (!kj.a(false)) {
              var2 = 1;
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        if (param1 <= -117) {
          L2: {
            if (ij.field_o != null) {
              break L2;
            } else {
              if (em.field_w) {
                qd.a(126, param0, var2);
                break L2;
              } else {
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static p a(int param0, int param1, bj param2, int param3, bj param4) {
        if (param0 != -10) {
            field_a = 81;
        }
        if (!cn.a(param3, 258, param1, param2)) {
            return null;
        }
        return lg.a(param4.a(false, param1, param3), param0 + -6623);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid password.";
    }
}
