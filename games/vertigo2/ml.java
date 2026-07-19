/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ml extends va {
    static r field_u;
    static int field_v;
    static String field_A;
    static int field_w;
    static String field_x;
    static int[] field_t;
    static r field_y;
    static int field_z;

    ml(int param0) {
        this(qc.field_x, param0);
    }

    ml(cc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_z, -1, 2147483647, false);
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        try {
            if (param0) {
                h.a(param1 - -param3.field_o, 1, param3.field_t + param4, param3.field_n, param3.field_s);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ml.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        L0: {
          L1: {
            var6 = 44 / ((param5 - -43) / 56);
            if (param1 < ap.field_e) {
              break L1;
            } else {
              if (ib.field_a < param4) {
                break L1;
              } else {
                if (param3 < ua.field_e) {
                  break L1;
                } else {
                  if (cj.field_D >= param2) {
                    bg.a(param0, 61, param4, param3, param1, param2);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          hb.b(param4, param2, 94, param0, param3, param1);
          break L0;
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_u = null;
        field_t = null;
        field_A = null;
        if (param0 != -15) {
            field_u = (r) null;
        }
        field_y = null;
    }

    final static er[] a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        er var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        er var13 = null;
        er var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          if (param0 == -13) {
            break L0;
          } else {
            ml.a(34, -51, 103, 63, -22, 15);
            break L0;
          }
        }
        L1: {
          var16 = bi.field_l;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = bi.field_e;
          var8 = bi.field_j;
          var9 = new er(16, param4);
          var9.d();
          bi.e(0, 0, 16, param4, param1, param3);
          var10 = null;
          var11 = null;
          if (!param2) {
            break L1;
          } else {
            var13 = var9.c();
            var10 = var13;
            var13.d();
            bi.b(0, 0, 5, 0);
            bi.b(0, 1, 3, 0);
            bi.b(0, 2, 2, 0);
            bi.b(0, 3, 1, 0);
            bi.b(0, 4, 1, 0);
            break L1;
          }
        }
        L2: {
          if (!param5) {
            break L2;
          } else {
            var14 = var9.c();
            var11 = var14;
            var14.d();
            bi.b(11, 0, 5, 0);
            bi.b(13, 1, 3, 0);
            bi.b(14, 2, 2, 0);
            bi.b(15, 3, 1, 0);
            bi.b(15, 4, 1, 0);
            break L2;
          }
        }
        bi.a(var16, var7, var8);
        return new er[]{null, null, null, (er) (var10), var9, (er) (var11), null, null, null};
    }

    final static void a(mi param0, byte param1) {
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
            oc var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            oc var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                var13 = (oc) ((Object) mg.field_N.a((byte) 100));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (param1 <= -2) {
                    var3 = 0;
                    var4 = 0;
                    L1: while (true) {
                      if (var4 >= var17.field_n) {
                        if (var3 != 0) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var4 = param0.field_u;
                          param0.e(var17.field_p, 0);
                          var5 = 0;
                          L2: while (true) {
                            if (var5 >= var17.field_n) {
                              discarded$1 = param0.c(var4, -123);
                              var17.c(2);
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              L3: {
                                if (0 != var17.field_y[var5]) {
                                  param0.f(var17.field_y[var5], -79);
                                  break L3;
                                } else {
                                  try {
                                    L4: {
                                      L5: {
                                        var6_int = var17.field_o[var5];
                                        if (-1 != (var6_int ^ -1)) {
                                          if ((var6_int ^ -1) != -2) {
                                            if (-3 == (var6_int ^ -1)) {
                                              var15 = (java.lang.reflect.Field) (var17.field_t[var5].field_d);
                                              var8 = var15.getModifiers();
                                              param0.f(0, -112);
                                              param0.e(var8, 0);
                                              break L5;
                                            } else {
                                              break L5;
                                            }
                                          } else {
                                            var16_ref = (java.lang.reflect.Field) (var17.field_t[var5].field_d);
                                            var19 = var16_ref;
                                            var19.setInt((Object) null, var17.field_u[var5]);
                                            param0.f(0, 107);
                                            break L5;
                                          }
                                        } else {
                                          var26 = (java.lang.reflect.Field) (var17.field_t[var5].field_d);
                                          var8 = var26.getInt((Object) null);
                                          param0.f(0, -90);
                                          param0.e(var8, 0);
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if ((var6_int ^ -1) != -4) {
                                          if (-5 != (var6_int ^ -1)) {
                                            break L6;
                                          } else {
                                            var28 = (java.lang.reflect.Method) (var17.field_w[var5].field_d);
                                            var8 = var28.getModifiers();
                                            param0.f(0, 119);
                                            param0.e(var8, 0);
                                            break L6;
                                          }
                                        } else {
                                          var27 = (java.lang.reflect.Method) (var17.field_w[var5].field_d);
                                          var25 = var17.field_q[var5];
                                          var9 = new Object[var25.length];
                                          var10_int = 0;
                                          L7: while (true) {
                                            if (var10_int >= var25.length) {
                                              var10 = var27.invoke((Object) null, var9);
                                              if (var10 != null) {
                                                if (!(var10 instanceof Number)) {
                                                  if (!(var10 instanceof String)) {
                                                    param0.f(4, -112);
                                                    break L6;
                                                  } else {
                                                    param0.f(2, -65);
                                                    param0.a((byte) 0, (String) (var10));
                                                    break L6;
                                                  }
                                                } else {
                                                  param0.f(1, 107);
                                                  param0.a((byte) -126, ((Number) (var10)).longValue());
                                                  break L6;
                                                }
                                              } else {
                                                param0.f(0, 101);
                                                break L6;
                                              }
                                            } else {
                                              var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                              var9[var10_int] = var11.readObject();
                                              var10_int++;
                                              continue L7;
                                            }
                                          }
                                        }
                                      }
                                      break L4;
                                    }
                                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L8: {
                                      var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                      param0.f(-10, -76);
                                      break L8;
                                    }
                                  } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L9: {
                                      var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                      param0.f(-11, -128);
                                      break L9;
                                    }
                                  } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                    decompiledCaughtException = decompiledCaughtParameter2;
                                    L10: {
                                      var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                      param0.f(-12, 79);
                                      break L10;
                                    }
                                  } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                    decompiledCaughtException = decompiledCaughtParameter3;
                                    L11: {
                                      var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                      param0.f(-13, 127);
                                      break L11;
                                    }
                                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                    decompiledCaughtException = decompiledCaughtParameter4;
                                    L12: {
                                      var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                      param0.f(-14, 96);
                                      break L12;
                                    }
                                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                    decompiledCaughtException = decompiledCaughtParameter5;
                                    L13: {
                                      var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                      param0.f(-15, -57);
                                      break L13;
                                    }
                                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                    decompiledCaughtException = decompiledCaughtParameter6;
                                    L14: {
                                      var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                      param0.f(-16, -60);
                                      break L14;
                                    }
                                  } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                    decompiledCaughtException = decompiledCaughtParameter7;
                                    L15: {
                                      var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                      param0.f(-17, 117);
                                      break L15;
                                    }
                                  } catch (java.io.IOException decompiledCaughtParameter8) {
                                    decompiledCaughtException = decompiledCaughtParameter8;
                                    L16: {
                                      var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                      param0.f(-18, -99);
                                      break L16;
                                    }
                                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                    decompiledCaughtException = decompiledCaughtParameter9;
                                    L17: {
                                      var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                      param0.f(-19, 88);
                                      break L17;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                                    decompiledCaughtException = decompiledCaughtParameter10;
                                    L18: {
                                      var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                      param0.f(-20, 91);
                                      break L18;
                                    }
                                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                    decompiledCaughtException = decompiledCaughtParameter11;
                                    L19: {
                                      var6_ref11 = decompiledCaughtException;
                                      param0.f(-21, -75);
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
                          if (null != var13.field_t[var4]) {
                            L21: {
                              if (var13.field_t[var4].field_b != 2) {
                                break L21;
                              } else {
                                var13.field_y[var4] = -5;
                                break L21;
                              }
                            }
                            if (var13.field_t[var4].field_b != 0) {
                              break L20;
                            } else {
                              var3 = 1;
                              break L20;
                            }
                          } else {
                            break L20;
                          }
                        }
                        if (var13.field_w[var4] != null) {
                          L22: {
                            if ((var13.field_w[var4].field_b ^ -1) == -3) {
                              var13.field_y[var4] = -6;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (-1 == (var13.field_w[var4].field_b ^ -1)) {
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
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L23: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) (var2);
                stackOut_66_1 = new StringBuilder().append("ml.D(");
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (param0 == null) {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L23;
                } else {
                  stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L23;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return;
                } else {
                  return;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_w = 0;
        field_x = "ESC - cancel this line";
        field_A = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_t = new int[8192];
    }
}
