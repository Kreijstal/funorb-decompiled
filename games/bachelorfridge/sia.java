/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sia extends kj {
    private kv field_l;
    static kv field_j;
    static boolean field_h;
    static kv field_g;
    private int field_f;
    static java.awt.Canvas field_i;
    private ad field_k;

    public static void c(int param0) {
        field_j = null;
        if (param0 != 10371) {
            sia.c(13);
        }
        field_g = null;
        field_i = null;
    }

    sia(gj param0, int param1, int param2, ad param3) {
        super(param0, param1, param2);
        try {
            this.field_k = param3;
            this.field_f = 100;
            this.field_l = en.field_a.a();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 < 21) {
            sia.c(-46);
        }
        int fieldTemp$0 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        return 0 >= fieldTemp$0 ? true : false;
    }

    final static void a(pf param0, int param1) {
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
            fka var13 = null;
            java.lang.reflect.Field var15 = null;
            fka var16 = null;
            java.lang.reflect.Field var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
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
            var19 = null;
            var20 = null;
            var22 = null;
            var12 = BachelorFridge.field_y;
            try {
              L0: {
                var13 = (fka) ((Object) fd.field_z.b((byte) 90));
                var16 = var13;
                if (var16 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var16.field_k) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = param0.field_g;
                        param0.e(var16.field_n, -1615464796);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var16.field_k) {
                            L3: {
                              if (param1 > 66) {
                                break L3;
                              } else {
                                field_g = (kv) null;
                                break L3;
                              }
                            }
                            discarded$1 = param0.a(var4, 19);
                            var16.a(false);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (-1 != (var16.field_l[var5] ^ -1)) {
                                param0.d(var16.field_l[var5], 0);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var16.field_g[var5];
                                      if (var6_int == 0) {
                                        var27 = (java.lang.reflect.Field) (var16.field_i[var5].field_e);
                                        var8 = var27.getInt((Object) null);
                                        param0.d(0, 0);
                                        param0.e(var8, -1615464796);
                                        break L6;
                                      } else {
                                        if (1 != var6_int) {
                                          if ((var6_int ^ -1) == -3) {
                                            var26 = (java.lang.reflect.Field) (var16.field_i[var5].field_e);
                                            var8 = var26.getModifiers();
                                            param0.d(0, 0);
                                            param0.e(var8, -1615464796);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) (var16.field_i[var5].field_e);
                                          var17 = var15;
                                          var17.setInt((Object) null, var16.field_m[var5]);
                                          param0.d(0, 0);
                                          break L6;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var6_int == 3) {
                                        var29 = (java.lang.reflect.Method) (var16.field_j[var5].field_e);
                                        var25 = var16.field_f[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.d(0, 0);
                                              break L7;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param0.d(2, 0);
                                                  param0.a((byte) -50, (String) (var10));
                                                  break L7;
                                                } else {
                                                  param0.d(4, 0);
                                                  break L7;
                                                }
                                              } else {
                                                param0.d(1, 0);
                                                param0.b(1686281208, ((Number) (var10)).longValue());
                                                break L7;
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (4 == var6_int) {
                                          var28 = (java.lang.reflect.Method) (var16.field_j[var5].field_e);
                                          var8 = var28.getModifiers();
                                          param0.d(0, 0);
                                          param0.e(var8, -1615464796);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param0.d(-10, 0);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.d(-11, 0);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.d(-12, 0);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.d(-13, 0);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.d(-14, 0);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.d(-15, 0);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.d(-16, 0);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.d(-17, 0);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.d(-18, 0);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.d(-19, 0);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.d(-20, 0);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.d(-21, 0);
                                    break L20;
                                  }
                                }
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
                        if (null == var13.field_i[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if (2 != var13.field_i[var4].field_f) {
                              break L22;
                            } else {
                              var13.field_l[var4] = -5;
                              break L22;
                            }
                          }
                          if (var13.field_i[var4].field_f != 0) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      if (null != var13.field_j[var4]) {
                        L23: {
                          if ((var13.field_j[var4].field_f ^ -1) == -3) {
                            var13.field_l[var4] = -6;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (var13.field_j[var4].field_f == 0) {
                            var3 = 1;
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) (var2);
                stackOut_66_1 = new StringBuilder().append("sia.A(");
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
                  break L25;
                } else {
                  stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L25;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ')');
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

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kv var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          param2 -= 4;
          var4 = 128;
          param0 -= 120;
          if ((this.field_f ^ -1) >= -81) {
            break L0;
          } else {
            param0 = param0 + (-80 + this.field_f);
            var4 = (100 - this.field_f) * var4 / 20;
            break L0;
          }
        }
        L1: {
          if (40 <= this.field_f) {
            break L1;
          } else {
            param0 = param0 - (-this.field_f + 40 >> 855516289);
            var4 = this.field_f * var4 / 40;
            break L1;
          }
        }
        L2: {
          this.field_k.field_f.a(-10 + param0, 2048, param2 - 10, 2048, var4, (byte) 119);
          if (param1) {
            break L2;
          } else {
            this.field_k = (ad) null;
            break L2;
          }
        }
        var5 = 0;
        L3: while (true) {
          if (3 <= var5) {
            return;
          } else {
            var6 = 50 * vr.field_b - -(65536 * var5 / 3);
            var7 = via.a(var6, (byte) 106);
            var8 = ft.a(var6, (byte) -128);
            var9 = this.field_l;
            var10 = var9.field_n >> 1498983105;
            var11 = var9.field_o >> -1392920671;
            var12 = 20;
            var8 = (var12 * var8 >> 630273520) + param0 + 60;
            var7 = param2 - -70 - -(var7 * var12 >> -1426565520);
            var9.c(var7 - (var10 >> 208139649), var8 - (var11 >> 1985393793), var10, var11, var4);
            var5++;
            continue L3;
          }
        }
    }

    static {
    }
}
