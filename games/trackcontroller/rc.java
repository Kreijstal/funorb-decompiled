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
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            String stackIn_68_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            var19 = null;
            var20 = null;
            var17 = null;
            var23 = null;
            var24 = null;
            var12 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                var14 = (kj) (Object) si.field_a.b(2);
                var18 = var14;
                if (var18 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (~var4 <= ~var18.field_n) {
                      if (var3 != 0) {
                        return;
                      } else {
                        L2: {
                          if (param0 >= 45) {
                            break L2;
                          } else {
                            var13 = null;
                            rc.a(92, (la) null);
                            break L2;
                          }
                        }
                        var4 = param1.field_k;
                        param1.b(false, var18.field_w);
                        var5 = 0;
                        L3: while (true) {
                          if (~var5 <= ~var18.field_n) {
                            int discarded$1 = param1.a(var4, false);
                            var18.a(-79);
                            break L0;
                          } else {
                            L4: {
                              if (var18.field_i[var5] != 0) {
                                param1.a(var18.field_i[var5], (byte) -75);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var18.field_m[var5];
                                      if (var6_int != 0) {
                                        if (var6_int == 1) {
                                          var17_ref = (java.lang.reflect.Field) var18.field_j[var5].field_e;
                                          var21 = var17_ref;
                                          var21.setInt((Object) null, var18.field_u[var5]);
                                          param1.a(0, (byte) -117);
                                          break L6;
                                        } else {
                                          if (var6_int == 2) {
                                            var29 = (java.lang.reflect.Field) var18.field_j[var5].field_e;
                                            var8 = var29.getModifiers();
                                            param1.a(0, (byte) -100);
                                            param1.b(false, var8);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var28 = (java.lang.reflect.Field) var18.field_j[var5].field_e;
                                        var8 = var28.getInt((Object) null);
                                        param1.a(0, (byte) -122);
                                        param1.b(false, var8);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (3 != var6_int) {
                                        L8: {
                                          if (var6_int != 4) {
                                            break L8;
                                          } else {
                                            var31 = (java.lang.reflect.Method) var18.field_v[var5].field_e;
                                            var8 = var31.getModifiers();
                                            param1.a(0, (byte) -110);
                                            param1.b(false, var8);
                                            break L8;
                                          }
                                        }
                                        break L7;
                                      } else {
                                        var30 = (java.lang.reflect.Method) var18.field_v[var5].field_e;
                                        var27 = var18.field_p[var5];
                                        var9 = new Object[var27.length];
                                        var10_int = 0;
                                        L9: while (true) {
                                          if (var27.length <= var10_int) {
                                            var10 = var30.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.a(0, (byte) -114);
                                              break L7;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param1.a(2, (byte) -127);
                                                  param1.a((byte) -57, (String) var10);
                                                  break L7;
                                                } else {
                                                  param1.a(4, (byte) -91);
                                                  break L7;
                                                }
                                              } else {
                                                param1.a(1, (byte) -60);
                                                param1.a(((Number) var10).longValue(), 2147483647);
                                                break L7;
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var27[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L9;
                                          }
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L14: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.a(-14, (byte) -112);
                                    break L14;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L15: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(-15, (byte) -83);
                                    break L15;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L16: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(-16, (byte) -62);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L18: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(-18, (byte) -79);
                                    break L18;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L19: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(-19, (byte) -85);
                                    break L19;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L20: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(-20, (byte) -97);
                                    break L20;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L21: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.a(-21, (byte) -67);
                                    break L21;
                                  }
                                }
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L22: {
                        if (null != var14.field_j[var4]) {
                          L23: {
                            if (var14.field_j[var4].field_f != 2) {
                              break L23;
                            } else {
                              var14.field_i[var4] = -5;
                              break L23;
                            }
                          }
                          if (var14.field_j[var4].field_f == 0) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      L24: {
                        if (var14.field_v[var4] == null) {
                          break L24;
                        } else {
                          L25: {
                            if (var14.field_v[var4].field_f == 2) {
                              var14.field_i[var4] = -6;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          if (var14.field_v[var4].field_f != 0) {
                            break L24;
                          } else {
                            var3 = 1;
                            break L24;
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
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L26: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_65_0 = (RuntimeException) var2;
                stackOut_65_1 = new StringBuilder().append("rc.E(").append(param0).append(',');
                stackIn_67_0 = stackOut_65_0;
                stackIn_67_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param1 == null) {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "null";
                  stackIn_68_0 = stackOut_67_0;
                  stackIn_68_1 = stackOut_67_1;
                  stackIn_68_2 = stackOut_67_2;
                  break L26;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  break L26;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ')');
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
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = param1.a((byte) 48);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rc.B(").append(-25).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
