/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class fl {
    private int field_a;
    static java.util.zip.CRC32 field_c;
    static String field_b;
    private boolean field_d;
    private int[] field_f;
    static int[] field_e;
    private int field_g;
    static int[] field_h;

    final int a(byte param0) {
        if (param0 <= 89) {
            ((fl) this).e(21, -99);
        }
        return 1 + ((fl) this).field_g;
    }

    final void a(int param0, int param1) {
        this.a(((fl) this).field_g + param1, -11, param0);
    }

    private final void a(int param0, int param1, int param2) {
        if (((fl) this).field_g < param0) {
            ((fl) this).field_g = param0;
        }
        if (!(((fl) this).field_f.length > param0)) {
            this.f(param0, -34);
        }
        ((fl) this).field_f[param0] = param2;
    }

    final static void b(int param0, int param1) {
        w var2 = na.field_r;
        var2.h(4, 0);
        var2.b(-9469, 1);
        var2.b(-9469, 2);
    }

    private final void f(int param0, int param1) {
        int var4 = 0;
        int[] var5 = new int[this.d(16912, param0)];
        int[] var3 = var5;
        og.a(((fl) this).field_f, 0, var5, 0, ((fl) this).field_f.length);
        ((fl) this).field_f = var5;
    }

    final static void a(w param0, boolean param1) {
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
            fd var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            fd var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = Main.field_T;
            try {
              L0: {
                var13 = (fd) (Object) vb.field_e.a((byte) 74);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_o) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_i;
                        param0.a(-246, var17.field_j);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_o <= var5) {
                            int discarded$1 = param0.b(var4, (byte) 5);
                            var17.c(121);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_i[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_k[var5];
                                      if (var6_int != 0) {
                                        if (1 != var6_int) {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var15 = (java.lang.reflect.Field) var17.field_p[var5].field_e;
                                            var8 = var15.getModifiers();
                                            param0.b(-9469, 0);
                                            param0.a(-246, var8);
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) var17.field_p[var5].field_e;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_m[var5]);
                                          param0.b(-9469, 0);
                                          break L5;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) var17.field_p[var5].field_e;
                                        var8 = var26.getInt((Object) null);
                                        param0.b(-9469, 0);
                                        param0.a(-246, var8);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) var17.field_r[var5].field_e;
                                        var25 = var17.field_l[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.b(-9469, 0);
                                              break L6;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param0.b(-9469, 2);
                                                  param0.a((String) var10, 19235);
                                                  break L6;
                                                } else {
                                                  param0.b(-9469, 4);
                                                  break L6;
                                                }
                                              } else {
                                                param0.b(-9469, 1);
                                                param0.a(((Number) var10).longValue(), (byte) 98);
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
                                      } else {
                                        if (var6_int == 4) {
                                          var27 = (java.lang.reflect.Method) var17.field_r[var5].field_e;
                                          var8 = var27.getModifiers();
                                          param0.b(-9469, 0);
                                          param0.a(-246, var8);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.b(-9469, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.b(-9469, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.b(-9469, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.b(-9469, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.b(-9469, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.b(-9469, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.b(-9469, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param0.b(-9469, var17.field_i[var5]);
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
                        if (var13.field_p[var4] != null) {
                          L21: {
                            if (2 == var13.field_p[var4].field_a) {
                              var13.field_i[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (0 != var13.field_p[var4].field_a) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var13.field_r[var4] != null) {
                          L23: {
                            if (2 == var13.field_r[var4].field_a) {
                              var13.field_i[var4] = -6;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (0 == var13.field_r[var4].field_a) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
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
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_64_0 = (RuntimeException) var2;
                stackOut_64_1 = new StringBuilder().append("fl.F(");
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                if (param0 == null) {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "null";
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  break L24;
                } else {
                  stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                  stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                  stackOut_65_2 = "{...}";
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_67_1 = stackOut_65_1;
                  stackIn_67_2 = stackOut_65_2;
                  break L24;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + ',' + false + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        var3 = ((fl) this).field_f.length;
        L0: while (true) {
          if (param1 < var3) {
            return var3;
          } else {
            if (!((fl) this).field_d) {
              var3 = var3 + ((fl) this).field_a;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((fl) this).field_a;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    final int c(int param0, int param1) {
        int var3 = -78 / ((29 - param1) / 32);
        if (param0 > ((fl) this).field_g) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((fl) this).field_f[param0];
    }

    final void e(int param0, int param1) {
        L0: {
          if (param1 < param0) {
            break L0;
          } else {
            if (param1 > ((fl) this).field_g) {
              break L0;
            } else {
              L1: {
                if (((fl) this).field_g != param1) {
                  og.a(((fl) this).field_f, param1 - -1, ((fl) this).field_f, param1, -param1 + ((fl) this).field_g);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((fl) this).field_g = ((fl) this).field_g - 1;
              return;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private fl() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 != 31237) {
            field_h = null;
        }
        field_c = null;
        field_b = null;
        field_h = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password: ";
        field_e = new int[8192];
        field_h = new int[8192];
        field_c = new java.util.zip.CRC32();
    }
}
