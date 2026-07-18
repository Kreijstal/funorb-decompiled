/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sd {
    private int field_d;
    private hl field_h;
    private int field_g;
    static fs field_e;
    static String field_b;
    private um field_c;
    static ri[] field_a;
    static int field_f;

    final static ov a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            ov var5 = null;
            fh var5_ref = null;
            ov stackIn_3_0 = null;
            fh stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            ov stackOut_2_0 = null;
            fh stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                var4 = Class.forName("rk");
                var5 = (ov) var4.newInstance();
                var5.a(param3, param0, param1, -119);
                stackOut_2_0 = (ov) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new fh();
                ((ov) (Object) var5_ref).a(param3, param0, param1, -125);
                stackOut_4_0 = (fh) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (ov) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("sd.I(").append(param0).append(',').append(param1).append(',').append(0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param3 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object a(byte param0) {
        jt var2 = null;
        Object var3 = null;
        jt var4 = null;
        int var5 = 0;
        Object var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (jt) (Object) ((sd) this).field_c.a(-1);
        L0: while (true) {
          if (var2 == null) {
            if (param0 != -92) {
              var6 = null;
              String discarded$1 = sd.a((byte[]) null, 41, -100, 63);
              return null;
            } else {
              return null;
            }
          } else {
            var3 = var2.c((byte) 107);
            if (var3 != null) {
              return var3;
            } else {
              var4 = var2;
              var2 = (jt) (Object) ((sd) this).field_c.a(-1);
              var4.b(false);
              var4.c(-5106);
              ((sd) this).field_d = ((sd) this).field_d + var4.field_z;
              continue L0;
            }
          }
        }
    }

    final Object a(long param0, int param1) {
        av var6 = null;
        jt var7 = (jt) (Object) ((sd) this).field_c.a(575, param0);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.c((byte) -81);
        if (var5 == null) {
            var7.b(false);
            var7.c(-5106);
            ((sd) this).field_d = ((sd) this).field_d + var7.field_z;
            return null;
        }
        if (var7.e(115)) {
            var6 = new av(var5, var7.field_z);
            ((sd) this).field_c.a(-20657, (ms) (Object) var6, var7.field_h);
            ((sd) this).field_h.a((pj) (Object) var6, (byte) -122);
            ((jt) (Object) var6).field_l = 0L;
            var7.b(false);
            var7.c(-5106);
        } else {
            ((sd) this).field_h.a((pj) (Object) var7, (byte) -124);
            var7.field_l = 0L;
        }
        if (param1 <= 43) {
            ((sd) this).field_d = 126;
        }
        return var5;
    }

    final void a(int param0, int param1) {
        jt var3 = null;
        kl var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param1 == 22663) {
          var3 = (jt) (Object) ((sd) this).field_h.b(-1);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                if (var3.e(param1 ^ -22690)) {
                  if (var3.c((byte) -62) != null) {
                    break L1;
                  } else {
                    var3.b(false);
                    var3.c(-5106);
                    ((sd) this).field_d = ((sd) this).field_d + var3.field_z;
                    break L1;
                  }
                } else {
                  long fieldTemp$53 = var3.field_l + 1L;
                  var3.field_l = var3.field_l + 1L;
                  if (~fieldTemp$53 < ~(long)param0) {
                    var4 = new kl(var3.c((byte) -102), var3.field_z);
                    ((sd) this).field_c.a(param1 ^ -2104, (ms) (Object) var4, var3.field_h);
                    pt.a((pj) (Object) var3, 2066481250, (pj) (Object) var4);
                    var3.b(false);
                    var3.c(-5106);
                    break L1;
                  } else {
                    var3 = (jt) (Object) ((sd) this).field_h.a((byte) -122);
                    continue L0;
                  }
                }
              }
              var3 = (jt) (Object) ((sd) this).field_h.a((byte) -122);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(pl param0) {
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
            rd var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            rd var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            String stackOut_63_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                var13 = (rd) (Object) qr.field_c.b(-77);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var17.field_p <= var4) {
                      if (var3 == 0) {
                        var4 = param0.field_p;
                        param0.e(48, var17.field_t);
                        var5 = 0;
                        L2: while (true) {
                          if (~var17.field_p >= ~var5) {
                            int discarded$1 = param0.a(var4, false);
                            var17.b(false);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_k[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_r[var5];
                                      if (var6_int == 0) {
                                        var15 = (java.lang.reflect.Field) var17.field_o[var5].field_d;
                                        var8 = var15.getInt((Object) null);
                                        param0.b((byte) 106, 0);
                                        param0.e(48, var8);
                                        break L5;
                                      } else {
                                        if (1 == var6_int) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_o[var5].field_d;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_n[var5]);
                                          param0.b((byte) 92, 0);
                                          break L5;
                                        } else {
                                          if (var6_int == 2) {
                                            var26 = (java.lang.reflect.Field) var17.field_o[var5].field_d;
                                            var8 = var26.getModifiers();
                                            param0.b((byte) 88, 0);
                                            param0.e(48, var8);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) var17.field_s[var5].field_d;
                                        var25 = var17.field_u[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.b((byte) 39, 0);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param0.b((byte) 56, 1);
                                                param0.a(false, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.b((byte) 49, 4);
                                                  break L6;
                                                } else {
                                                  param0.b((byte) 34, 2);
                                                  param0.a((String) var10, (byte) -104);
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
                                        if (4 != var6_int) {
                                          break L6;
                                        } else {
                                          var27 = (java.lang.reflect.Method) var17.field_s[var5].field_d;
                                          var8 = var27.getModifiers();
                                          param0.b((byte) 93, 0);
                                          param0.e(48, var8);
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
                                    param0.b((byte) 53, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.b((byte) 86, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.b((byte) 106, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.b((byte) 18, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.b((byte) 48, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.b((byte) 125, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.b((byte) 86, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param0.b((byte) 118, var17.field_k[var5]);
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
                        if (var13.field_o[var4] == null) {
                          break L20;
                        } else {
                          L21: {
                            if (2 == var13.field_o[var4].field_c) {
                              var13.field_k[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (0 != var13.field_o[var4].field_c) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (null == var13.field_s[var4]) {
                          break L22;
                        } else {
                          L23: {
                            if (2 != var13.field_s[var4].field_c) {
                              break L23;
                            } else {
                              var13.field_k[var4] = -6;
                              break L23;
                            }
                          }
                          if (var13.field_s[var4].field_c == 0) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
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
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_62_0 = (RuntimeException) var2;
                stackOut_62_1 = new StringBuilder().append("sd.G(");
                stackIn_64_0 = stackOut_62_0;
                stackIn_64_1 = stackOut_62_1;
                stackIn_63_0 = stackOut_62_0;
                stackIn_63_1 = stackOut_62_1;
                if (param0 == null) {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "null";
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  stackIn_65_2 = stackOut_64_2;
                  break L24;
                } else {
                  stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                  stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                  stackOut_63_2 = "{...}";
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  stackIn_65_2 = stackOut_63_2;
                  break L24;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ',' + 127 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    sd(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          if (param4 > param5) {
            if (param4 < param2) {
              uw.a(lk.field_a, param6, param5, param2, param1, param0, 1955582416, param7, param4);
              break L0;
            } else {
              if (param2 <= param5) {
                uw.a(lk.field_a, param0, param2, param4, param1, param7, 1955582416, param6, param5);
                break L0;
              } else {
                uw.a(lk.field_a, param0, param5, param4, param1, param6, 1955582416, param7, param2);
                break L0;
              }
            }
          } else {
            if (param2 <= param5) {
              if (param2 > param4) {
                uw.a(lk.field_a, param7, param4, param5, param1, param6, 1955582416, param0, param2);
                break L0;
              } else {
                uw.a(lk.field_a, param7, param2, param5, param1, param0, 1955582416, param6, param4);
                break L0;
              }
            } else {
              uw.a(lk.field_a, param6, param4, param2, param1, param7, 1955582416, param0, param5);
              break L0;
            }
          }
        }
    }

    private final void a(jt param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 != null) {
                param0.b(false);
                param0.c(-5106);
                ((sd) this).field_d = ((sd) this).field_d + param0.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sd.M(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -124 + ')');
        }
    }

    final void a(long param0, Object param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(1, (byte) -95, param1, param0);
              if (param2 == 19) {
                break L1;
              } else {
                int discarded$2 = 0;
                this.a(-95L);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sd.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final Object b(int param0) {
        jt var2 = null;
        Object var3 = null;
        jt var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (jt) (Object) ((sd) this).field_c.c(-1);
        if (param0 == 0) {
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.c((byte) 103);
              if (var3 != null) {
                return var3;
              } else {
                var4 = var2;
                var2 = (jt) (Object) ((sd) this).field_c.a(-1);
                var4.b(false);
                var4.c(-5106);
                ((sd) this).field_d = ((sd) this).field_d + var4.field_z;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        Object stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var13 = new char[param2];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            if (param3 == 26564) {
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                if (var6 >= param2) {
                  stackOut_17_0 = new String(var13, 0, var5);
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L2: {
                    var7 = 255 & param0[param1 - -var6];
                    if (0 != var7) {
                      L3: {
                        if (var7 < 128) {
                          break L3;
                        } else {
                          if (var7 < 160) {
                            L4: {
                              var8 = uk.field_lb[var7 + -128];
                              if (var8 == 0) {
                                var8 = 63;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      int incrementValue$2 = var5;
                      var5++;
                      var4[incrementValue$2] = (char)var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("sd.H(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(long param0) {
        jt var4 = (jt) (Object) ((sd) this).field_c.a(575, param0);
        int discarded$0 = -124;
        this.a(var4);
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_e = null;
    }

    private final void a(int param0, byte param1, Object param2, long param3) {
        jt var6 = null;
        av var6_ref = null;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        try {
            if (!(((sd) this).field_g >= 1)) {
                throw new IllegalStateException();
            }
            int discarded$0 = 0;
            this.a(param3);
            ((sd) this).field_d = ((sd) this).field_d - 1;
            while (0 > ((sd) this).field_d) {
                var6 = (jt) (Object) ((sd) this).field_h.b((byte) -61);
                int discarded$1 = -124;
                this.a(var6);
            }
            var6_ref = new av(param2, 1);
            ((sd) this).field_c.a(-20657, (ms) (Object) var6_ref, param3);
            int var7 = 2;
            ((sd) this).field_h.a((pj) (Object) var6_ref, (byte) -122);
            ((jt) (Object) var6_ref).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "sd.B(" + 1 + ',' + -95 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private sd(int param0, int param1) {
        int var3 = 0;
        ((sd) this).field_h = new hl();
        ((sd) this).field_d = param0;
        ((sd) this).field_g = param0;
        var3 = 1;
        L0: while (true) {
          L1: {
            if (var3 + var3 >= param0) {
              break L1;
            } else {
              if (param1 <= var3) {
                break L1;
              } else {
                var3 = var3 + var3;
                continue L0;
              }
            }
          }
          ((sd) this).field_c = new um(var3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new fs(256);
        field_b = "ACHIEVEMENTS THIS GAME";
    }
}
