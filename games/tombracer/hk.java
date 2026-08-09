/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hk {
    lv field_c;
    gf[] field_d;
    lv field_f;
    boolean field_g;
    static jea field_e;
    private eo field_b;
    private gf[] field_a;

    final boolean c(int param0) {
        if (param0 != -30634) {
            return true;
        }
        return !this.field_g ? this.field_d != null ? true : false : null != this.field_c ? true : false;
    }

    final boolean b(int param0) {
        byte[] var25 = null;
        byte[] var22 = null;
        byte[] var19 = null;
        byte[] var17 = null;
        byte[] var2_ref_byte__ = null;
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int var16 = TombRacer.field_G ? 1 : 0;
        if (!(null != this.field_f)) {
            if (null == ui.field_c) {
                var25 = gaa.a(4.0f, 16.0f, 128, new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                ui.field_c = bw.a(270, var25, false);
            }
            var22 = ir.a(ui.field_c, 13588, false);
            var19 = var22;
            var17 = var19;
            var2_ref_byte__ = var17;
            var23 = new byte[var22.length * 4];
            var20 = var23;
            var3 = var20;
            var4 = 0;
            for (var5 = 0; 16 > var5; var5++) {
                var6 = 16384 * var5;
                var7 = var6;
                for (var8 = 0; -129 < (var8 ^ -1); var8++) {
                    var9 = 128 * var8 + var7;
                    var10 = var7 - -((127 & var8 + -1) * 128);
                    var11 = var7 - -((127 & var8 - -1) * 128);
                    for (var12 = 0; 128 > var12; var12++) {
                        var13 = (float)((var2_ref_byte__[var12 + var10] & 255) + -(255 & var2_ref_byte__[var12 + var11]));
                        var14 = (float)((var2_ref_byte__[(127 & var12 + -1) + var9] & 255) - (255 & var2_ref_byte__[var9 - -(127 & 1 + var12)]));
                        var15 = (float)(128.0 / Math.sqrt((double)(var14 * var14 + 16384.0f + var13 * var13)));
                        incrementValue$0 = var4;
                        var4++;
                        var3[incrementValue$0] = (byte)(int)(127.0f + var14 * var15);
                        incrementValue$1 = var4;
                        var4++;
                        var3[incrementValue$1] = (byte)(int)(128.0f * var15 + 127.0f);
                        incrementValue$2 = var4;
                        var4++;
                        var3[incrementValue$2] = (byte)(int)(var15 * var13 + 127.0f);
                        incrementValue$3 = var4;
                        var4++;
                        incrementValue$4 = var6;
                        var6++;
                        var3[incrementValue$3] = var2_ref_byte__[incrementValue$4];
                    }
                }
            }
            this.field_f = this.field_b.a(var23, gpa.field_a, (byte) -41, 128, 128, 16);
        }
        int var2 = -20 % ((23 - param0) / 48);
        return null != this.field_f ? true : false;
    }

    final static void a(boolean param0, kh param1) {
        try {
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            String stackIn_68_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6_int = 0;
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
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            aj var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            aj var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            var17 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                var13 = (aj) ((Object) al.field_g.f(-80));
                var18 = var13;
                if (var18 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var18.field_f) {
                      if (var3 == 0) {
                        var4 = param1.field_h;
                        param1.a(var18.field_n, (byte) -59);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var18.field_f) {
                            param1.g(var4, 64);
                            var18.p(75);
                            if (param0) {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          } else {
                            L3: {
                              if (0 == var18.field_m[var5]) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var18.field_i[var5];
                                      if (var6_int == 0) {
                                        var15 = (java.lang.reflect.Field) (var18.field_j[var5].field_f);
                                        var8 = var15.getInt((Object) null);
                                        param1.i(0, 0);
                                        param1.a(var8, (byte) 102);
                                        break L5;
                                      } else {
                                        if (var6_int != 1) {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var26 = (java.lang.reflect.Field) (var18.field_j[var5].field_f);
                                            var8 = var26.getModifiers();
                                            param1.i(0, 0);
                                            param1.a(var8, (byte) 126);
                                            break L5;
                                          }
                                        } else {
                                          var17_ref = (java.lang.reflect.Field) (var18.field_j[var5].field_f);
                                          var19 = var17_ref;
                                          var19.setInt((Object) null, var18.field_h[var5]);
                                          param1.i(0, 0);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (-4 == (var6_int ^ -1)) {
                                        var28 = (java.lang.reflect.Method) (var18.field_k[var5].field_f);
                                        var25 = var18.field_g[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.i(0, 0);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param1.i(1, 0);
                                                param1.a(1736565456, ((Number) (var10)).longValue());
                                                break L6;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param1.i(2, 0);
                                                  param1.a((String) (var10), false);
                                                  break L6;
                                                } else {
                                                  param1.i(4, 0);
                                                  break L6;
                                                }
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (-5 != (var6_int ^ -1)) {
                                          break L6;
                                        } else {
                                          var27 = (java.lang.reflect.Method) (var18.field_k[var5].field_f);
                                          var8 = var27.getModifiers();
                                          param1.i(0, 0);
                                          param1.a(var8, (byte) 93);
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L8: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.i(-10, 0);
                                    break L8;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L9: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.i(-11, 0);
                                    break L9;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.i(-12, 0);
                                    break L10;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L11: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.i(-13, 0);
                                    break L11;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.i(-14, 0);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.i(-15, 0);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.i(-16, 0);
                                    break L14;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L15: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.i(-17, 0);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.i(-18, 0);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.i(-19, 0);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.i(-20, 0);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.i(-21, 0);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param1.i(var18.field_m[var5], 0);
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L20: {
                        if (var13.field_j[var4] != null) {
                          L21: {
                            if (2 == var13.field_j[var4].field_b) {
                              var13.field_m[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var13.field_j[var4].field_b == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var13.field_k[var4] != null) {
                          L23: {
                            if (var13.field_k[var4].field_b == 2) {
                              var13.field_m[var4] = -6;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (var13.field_k[var4].field_b == 0) {
                            var3 = 1;
                            break L22;
                          } else {
                            var4++;
                            continue L1;
                          }
                        } else {
                          break L22;
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
                stackIn_67_0 = (RuntimeException) (var2);

                stackIn_67_1 = new StringBuilder().append("hk.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
                  stackIn_68_2 = "null";
                  break L24;
                } else {
                  stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
                  stackIn_68_2 = "{...}";
                  break L24;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ')');
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

    public static void a(int param0) {
        if (param0 != 8) {
            field_e = (jea) null;
        }
        field_e = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 > -81) {
            hk.a(-35);
        }
        return (param0 & 50560) != 0 ? true : false;
    }

    hk(eo param0) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        this.field_c = null;
        this.field_f = null;
        this.field_a = null;
        this.field_d = null;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              this.field_g = this.field_b.field_x;
              if (!this.field_g) {
                break L1;
              } else {
                if (this.field_b.a(una.field_g, -1, wo.field_i)) {
                  break L1;
                } else {
                  this.field_g = false;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_g) {
                break L2;
              } else {
                if (this.field_b.a(false, una.field_g, wo.field_i)) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              tra.g(12890);
              if (!this.field_g) {
                this.field_d = new gf[16];
                var2_int = 0;
                L4: while (true) {
                  if (-17 >= (var2_int ^ -1)) {
                    this.field_a = new gf[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (16 <= var2_int) {
                        break L3;
                      } else {
                        var18 = ua.a(lt.field_f, 32768, var2_int * 32768, false);
                        this.field_a[var2_int] = this.field_b.a(128, var18, true, wo.field_i, -77, 128);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var17 = ua.a(ak.field_o, 32768, 32768 * var2_int, false);
                    this.field_d[var2_int] = this.field_b.a(128, var17, true, wo.field_i, -117, 128);
                    var2_int++;
                    continue L4;
                  }
                }
              } else {
                var15 = ir.a(ak.field_o, 13588, false);
                this.field_c = this.field_b.a(var15, wo.field_i, (byte) -97, 128, 128, 16);
                var16 = ir.a(lt.field_f, 13588, false);
                this.field_b.a(var16, wo.field_i, (byte) -84, 128, 128, 16);
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("hk.<init>(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -2646) {
                break L1;
              } else {
                var16 = (int[]) null;
                hk.a(-57, (long[]) null, -21, (int[]) null, -66);
                break L1;
              }
            }
            L2: {
              if (param2 >= param0) {
                break L2;
              } else {
                L3: {
                  var5_int = (param2 - -param0) / 2;
                  var6 = param2;
                  var7 = param1[var5_int];
                  param1[var5_int] = param1[param0];
                  param1[param0] = var7;
                  var9 = param3[var5_int];
                  param3[var5_int] = param3[param0];
                  param3[param0] = var9;
                  if (9223372036854775807L == var7) {
                    stackIn_7_0 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = 1;
                    break L3;
                  }
                }
                var10 = stackIn_7_0;
                var11 = param2;
                L4: while (true) {
                  if (var11 >= param0) {
                    param1[param0] = param1[var6];
                    param1[var6] = var7;
                    param3[param0] = param3[var6];
                    param3[var6] = var9;
                    hk.a(-1 + var6, param1, param2, param3, -2646);
                    hk.a(param0, param1, 1 + var6, param3, -2646);
                    break L2;
                  } else {
                    if (((long)(var11 & var10) + var7 ^ -1L) < (param1[var11] ^ -1L)) {
                      var12 = param1[var11];
                      param1[var11] = param1[var6];
                      param1[var6] = var12;
                      var14 = param3[var11];
                      param3[var11] = param3[var6];
                      incrementValue$0 = var6;
                      var6++;
                      param3[incrementValue$0] = var14;
                      var11++;
                      continue L4;
                    } else {
                      var11++;
                      continue L4;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("hk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
    }

    static {
    }
}
