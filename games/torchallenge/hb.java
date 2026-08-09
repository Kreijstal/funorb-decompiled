/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static int[] field_b;
    static int field_d;
    static int[] field_a;
    static int field_f;
    static String field_h;
    static ka field_c;
    private String field_e;
    static String[] field_g;

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_d = 17;
                break L1;
              }
            }
            stackIn_3_0 = this.field_e.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hb.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static StringBuilder a(int param0, byte param1, StringBuilder param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              param2.setLength(param0);
              var5 = var4_int;
              if (param1 == 30) {
                break L1;
              } else {
                hb.a(false);
                break L1;
              }
            }
            L2: while (true) {
              if (param0 <= var5) {
                stackIn_6_0 = (StringBuilder) (param2);
                break L0;
              } else {
                param2.setCharAt(var5, param3);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("hb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(pa param0, int param1) {
        try {
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            gh var14 = null;
            Object var16 = null;
            Object var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var18_ref = null;
            gh var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var21 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            var18 = null;
            var17 = null;
            var16 = null;
            var21 = null;
            var23 = null;
            var13 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                var14 = (gh) ((Object) pf.field_d.c((byte) -79));
                var19 = var14;
                if (var19 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = -59 % ((21 - param1) / 51);
                  var3 = 0;
                  var5 = 0;
                  L1: while (true) {
                    if (var19.field_p <= var5) {
                      if (var3 == 0) {
                        var5 = param0.field_q;
                        param0.a(var19.field_l, false);
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= var19.field_p) {
                            param0.b(var5, 14430);
                            var19.a(true);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L3: {
                              if (var19.field_o[var6] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var7_int = var19.field_t[var6];
                                      if (var7_int == 0) {
                                        var28 = (java.lang.reflect.Field) (var19.field_j[var6].field_g);
                                        var9 = var28.getInt((Object) null);
                                        param0.d(0, (byte) 122);
                                        param0.a(var9, false);
                                        break L5;
                                      } else {
                                        if ((var7_int ^ -1) != -2) {
                                          if ((var7_int ^ -1) != -3) {
                                            break L5;
                                          } else {
                                            var27 = (java.lang.reflect.Field) (var19.field_j[var6].field_g);
                                            var9 = var27.getModifiers();
                                            param0.d(0, (byte) 122);
                                            param0.a(var9, false);
                                            break L5;
                                          }
                                        } else {
                                          var18_ref = (java.lang.reflect.Field) (var19.field_j[var6].field_g);
                                          var20 = var18_ref;
                                          var20.setInt((Object) null, var19.field_u[var6]);
                                          param0.d(0, (byte) 122);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (-4 == (var7_int ^ -1)) {
                                        var30 = (java.lang.reflect.Method) (var19.field_q[var6].field_g);
                                        var26 = var19.field_s[var6];
                                        var10 = new Object[var26.length];
                                        var11_int = 0;
                                        L7: while (true) {
                                          if (var26.length <= var11_int) {
                                            var11 = var30.invoke((Object) null, var10);
                                            if (var11 != null) {
                                              if (!(var11 instanceof Number)) {
                                                if (!(var11 instanceof String)) {
                                                  param0.d(4, (byte) 122);
                                                  break L6;
                                                } else {
                                                  param0.d(2, (byte) 122);
                                                  param0.a((String) (var11), (byte) 123);
                                                  break L6;
                                                }
                                              } else {
                                                param0.d(1, (byte) 122);
                                                param0.a(true, ((Number) (var11)).longValue());
                                                break L6;
                                              }
                                            } else {
                                              param0.d(0, (byte) 122);
                                              break L6;
                                            }
                                          } else {
                                            var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var11_int])));
                                            var10[var11_int] = var12.readObject();
                                            var11_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var7_int != 4) {
                                          break L6;
                                        } else {
                                          var29 = (java.lang.reflect.Method) (var19.field_q[var6].field_g);
                                          var9 = var29.getModifiers();
                                          param0.d(0, (byte) 122);
                                          param0.a(var9, false);
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L8: {
                                    var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param0.d(-10, (byte) 122);
                                    break L8;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L9: {
                                    var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.d(-11, (byte) 122);
                                    break L9;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.d(-12, (byte) 122);
                                    break L10;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L11: {
                                    var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.d(-13, (byte) 122);
                                    break L11;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.d(-14, (byte) 122);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.d(-15, (byte) 122);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.d(-16, (byte) 122);
                                    break L14;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L15: {
                                    var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.d(-17, (byte) 122);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.d(-18, (byte) 122);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.d(-19, (byte) 122);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.d(-20, (byte) 122);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var7_ref11 = decompiledCaughtException;
                                    param0.d(-21, (byte) 122);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param0.d(var19.field_o[var6], (byte) 122);
                                break L3;
                              }
                            }
                            var6++;
                            continue L2;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L20: {
                        if (null == var14.field_j[var5]) {
                          break L20;
                        } else {
                          L21: {
                            if (2 == var14.field_j[var5].field_d) {
                              var14.field_o[var5] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (0 == var14.field_j[var5].field_d) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      if (null != var14.field_q[var5]) {
                        L22: {
                          if ((var14.field_q[var5].field_d ^ -1) != -3) {
                            break L22;
                          } else {
                            var14.field_o[var5] = -6;
                            break L22;
                          }
                        }
                        L23: {
                          if (0 == var14.field_q[var5].field_d) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        var5++;
                        continue L1;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_64_0 = (RuntimeException) (var2);

                stackIn_64_1 = new StringBuilder().append("hb.E(");

                if (param0 == null) {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackIn_65_2 = "null";
                  break L24;
                } else {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackIn_65_2 = "{...}";
                  break L24;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param1 + ')');
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

    final void a(java.applet.Applet param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              oh.a(31536000L, this.field_e, param0, "jagex-last-login-method", 0);
              if (!param1) {
                break L1;
              } else {
                field_f = 78;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hb.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        field_c = null;
        if (param0) {
            field_c = (ka) null;
        }
        field_g = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    hb(String param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[4];
        field_b = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256};
        field_h = "Checking";
        field_f = 0;
    }
}
