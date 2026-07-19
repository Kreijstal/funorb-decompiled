/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ao implements Runnable {
    static sb field_e;
    static String field_i;
    static int field_c;
    static int field_d;
    volatile boolean field_a;
    volatile boolean field_f;
    cb field_g;
    volatile mm[] field_h;
    static String field_b;

    final static void a(pc param0, int param1) {
        try {
            int discarded$1 = 0;
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
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            aj var16_ref = null;
            Object var17 = null;
            java.lang.reflect.Field var18 = null;
            Object var20 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            var16 = null;
            var17 = null;
            var20 = null;
            var21 = null;
            var12 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                var16_ref = (aj) ((Object) ma.field_o.c(1504642273));
                if (var16_ref == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L1: {
                    var3 = 0;
                    var4 = 0;
                    if (param1 == -20) {
                      break L1;
                    } else {
                      ao.a(-40, -96);
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var4 >= var16_ref.field_s) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = param0.field_m;
                        param0.d(var16_ref.field_p, -66);
                        var5 = 0;
                        L3: while (true) {
                          if (var16_ref.field_s <= var5) {
                            discarded$1 = param0.b(var4, (byte) 111);
                            var16_ref.c(2779);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (var16_ref.field_u[var5] == 0) {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var16_ref.field_r[var5];
                                      if (var6_int != 0) {
                                        if (var6_int != 1) {
                                          if ((var6_int ^ -1) != -3) {
                                            break L6;
                                          } else {
                                            var14 = (java.lang.reflect.Field) (var16_ref.field_l[var5].field_e);
                                            var8 = var14.getModifiers();
                                            param0.e(160, 0);
                                            param0.d(var8, -46);
                                            break L6;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) (var16_ref.field_l[var5].field_e);
                                          var18 = var15;
                                          var18.setInt((Object) null, var16_ref.field_q[var5]);
                                          param0.e(160, 0);
                                          break L6;
                                        }
                                      } else {
                                        var25 = (java.lang.reflect.Field) (var16_ref.field_l[var5].field_e);
                                        var8 = var25.getInt((Object) null);
                                        param0.e(160, 0);
                                        param0.d(var8, -124);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if ((var6_int ^ -1) != -4) {
                                        if (4 != var6_int) {
                                          break L7;
                                        } else {
                                          var27 = (java.lang.reflect.Method) (var16_ref.field_v[var5].field_e);
                                          var8 = var27.getModifiers();
                                          param0.e(160, 0);
                                          param0.d(var8, -45);
                                          break L7;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Method) (var16_ref.field_v[var5].field_e);
                                        var24 = var16_ref.field_w[var5];
                                        var9 = new Object[var24.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var24.length <= var10_int) {
                                            var10 = var26.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.e(160, 0);
                                              break L7;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param0.e(160, 1);
                                                param0.a(false, ((Number) (var10)).longValue());
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.e(160, 4);
                                                  break L7;
                                                } else {
                                                  param0.e(160, 2);
                                                  param0.b((byte) -41, (String) (var10));
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param0.e(160, -10);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.e(160, -11);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.e(160, -12);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.e(160, -13);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.e(160, -14);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.e(160, -15);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.e(160, -16);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.e(160, -17);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.e(160, -18);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.e(160, -19);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.e(160, -20);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.e(160, -21);
                                    break L20;
                                  }
                                }
                                break L4;
                              } else {
                                param0.e(160, var16_ref.field_u[var5]);
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (null != var16_ref.field_l[var4]) {
                          L22: {
                            if ((var16_ref.field_l[var4].field_b ^ -1) == -3) {
                              var16_ref.field_u[var4] = -5;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (0 != var16_ref.field_l[var4].field_b) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      if (var16_ref.field_v[var4] != null) {
                        L23: {
                          if ((var16_ref.field_v[var4].field_b ^ -1) != -3) {
                            break L23;
                          } else {
                            var16_ref.field_u[var4] = -6;
                            break L23;
                          }
                        }
                        L24: {
                          if (-1 == (var16_ref.field_v[var4].field_b ^ -1)) {
                            var3 = 1;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_64_0 = (RuntimeException) (var2);
                stackOut_64_1 = new StringBuilder().append("ao.C(");
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                if (param0 == null) {
                  stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackOut_66_2 = "null";
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  break L25;
                } else {
                  stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
                  stackOut_65_2 = "{...}";
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_67_1 = stackOut_65_1;
                  stackIn_67_2 = stackOut_65_2;
                  break L25;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet a(int param0) {
        if (!(bd.field_b == null)) {
            return bd.field_b;
        }
        if (param0 != 13867) {
            return (java.applet.Applet) null;
        }
        return (java.applet.Applet) ((Object) ne.field_I);
    }

    final static void b(int param0) {
        if (null != wa.field_c) {
            wa.field_c.a((byte) -22);
        }
        if (null != cn.field_b) {
            cn.field_b.o(30);
        }
        int var1 = -72 % ((param0 - 48) / 43);
        hm.a((byte) -95);
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_b = (String) null;
        }
        field_i = null;
        field_e = null;
    }

    public final void run() {
        int var1_int = 0;
        mm var2 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.field_f = true;
        try {
            while (!this.field_a) {
                for (var1_int = 0; -3 < (var1_int ^ -1); var1_int++) {
                    var2 = this.field_h[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.b();
                    }
                }
                vg.a(10L, (byte) 23);
                Object var5 = (Object) null;
                fm.a(this.field_g, (Object) null, (byte) -52);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            jo.a(1, (String) null, (Throwable) ((Object) exception));
        } finally {
            this.field_f = false;
        }
    }

    ao() {
        this.field_h = new mm[2];
        this.field_a = false;
        this.field_f = false;
    }

    final static void a(int param0, int param1) {
        pc var2 = aa.field_f;
        int var3 = 77 % ((29 - param0) / 46);
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        field_c = -1;
        field_i = "Game options changed (<%0>)";
        field_b = "Unfortunately you are not eligible to create an account.";
    }
}
