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
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -30634) {
          L0: {
            if (((hk) this).field_g) {
              if (null == ((hk) this).field_c) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            } else {
              if (((hk) this).field_d == null) {
                stackOut_5_0 = 0;
                stackIn_9_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_9_0 = stackOut_4_0;
                break L0;
              }
            }
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    final boolean b(int param0) {
        byte[] var2_ref_byte__ = null;
        byte[] var24 = null;
        byte[] var22 = null;
        byte[] var20 = null;
        byte[] var18 = null;
        byte[] var17 = null;
        byte[] var25 = null;
        byte[] var23 = null;
        byte[] var21 = null;
        byte[] var19 = null;
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
        int var16 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((hk) this).field_f)) {
            if (null == ui.field_c) {
                var2_ref_byte__ = gaa.a(4.0f, 16.0f, 128, (jg) (Object) new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                int discarded$0 = 0;
                ui.field_c = bw.a(270, var2_ref_byte__);
            }
            var24 = ir.a(ui.field_c, 13588, false);
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var17 = var18;
            var2_ref_byte__ = var17;
            var25 = new byte[var24.length * 4];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var3 = var19;
            var4 = 0;
            for (var5 = 0; 16 > var5; var5++) {
                var6 = 16384 * var5;
                var7 = var6;
                for (var8 = 0; var8 < 128; var8++) {
                    var9 = 128 * var8 + var7;
                    var10 = var7 - -((127 & var8 + -1) * 128);
                    var11 = var7 - -((127 & var8 - -1) * 128);
                    for (var12 = 0; 128 > var12; var12++) {
                        var13 = (float)((var2_ref_byte__[var12 + var10] & 255) + -(255 & var2_ref_byte__[var12 + var11]));
                        var14 = (float)((var2_ref_byte__[(127 & var12 + -1) + var9] & 255) - (255 & var2_ref_byte__[var9 - -(127 & 1 + var12)]));
                        var15 = (float)(128.0 / Math.sqrt((double)(var14 * var14 + 16384.0f + var13 * var13)));
                        int incrementValue$1 = var4;
                        var4++;
                        var3[incrementValue$1] = (byte)(int)(127.0f + var14 * var15);
                        int incrementValue$2 = var4;
                        var4++;
                        var3[incrementValue$2] = (byte)(int)(128.0f * var15 + 127.0f);
                        int incrementValue$3 = var4;
                        var4++;
                        var3[incrementValue$3] = (byte)(int)(var15 * var13 + 127.0f);
                        int incrementValue$4 = var4;
                        var4++;
                        int incrementValue$5 = var6;
                        var6++;
                        var3[incrementValue$4] = var2_ref_byte__[incrementValue$5];
                    }
                }
            }
            ((hk) this).field_f = ((hk) this).field_b.a(var25, gpa.field_a, (byte) -41, 128, 128, 16);
        }
        int var2 = -20 % ((23 - param0) / 48);
        return null != ((hk) this).field_f ? true : false;
    }

    final static void a(boolean param0, kh param1) {
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
            aj var13 = null;
            java.lang.reflect.Field var15 = null;
            aj var16 = null;
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
            var19 = null;
            var20 = null;
            var22 = null;
            var12 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                var13 = (aj) (Object) al.field_g.f(-80);
                var16 = var13;
                if (var16 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (~var4 <= ~var16.field_f) {
                      if (var3 == 0) {
                        var4 = param1.field_h;
                        param1.a(var16.field_n, (byte) -59);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var16.field_f) {
                            int discarded$1 = param1.g(var4, 64);
                            var16.p(75);
                            break L0;
                          } else {
                            L3: {
                              if (0 == var16.field_m[var5]) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var16.field_i[var5];
                                      if (var6_int == 0) {
                                        var27 = (java.lang.reflect.Field) var16.field_j[var5].field_f;
                                        var8 = var27.getInt((Object) null);
                                        param1.i(0, 0);
                                        param1.a(var8, (byte) 102);
                                        break L5;
                                      } else {
                                        if (var6_int != 1) {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var26 = (java.lang.reflect.Field) var16.field_j[var5].field_f;
                                            var8 = var26.getModifiers();
                                            param1.i(0, 0);
                                            param1.a(var8, (byte) 126);
                                            break L5;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) var16.field_j[var5].field_f;
                                          var17 = var15;
                                          var17.setInt((Object) null, var16.field_h[var5]);
                                          param1.i(0, 0);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var29 = (java.lang.reflect.Method) var16.field_k[var5].field_f;
                                        var25 = var16.field_g[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.i(0, 0);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param1.i(1, 0);
                                                param1.a(1736565456, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param1.i(2, 0);
                                                  param1.a((String) var10, false);
                                                  break L6;
                                                } else {
                                                  param1.i(4, 0);
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
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          var28 = (java.lang.reflect.Method) var16.field_k[var5].field_f;
                                          var8 = var28.getModifiers();
                                          param1.i(0, 0);
                                          param1.a(var8, (byte) 93);
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
                                param1.i(var16.field_m[var5], 0);
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
                          if (var13.field_k[var4].field_b != 0) {
                            break L22;
                          } else {
                            var3 = 1;
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_64_0 = (RuntimeException) var2;
                stackOut_64_1 = new StringBuilder().append("hk.E(").append(1).append(44);
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                if (param1 == null) {
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
              throw tba.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            field_e = null;
        }
        field_e = null;
    }

    final static boolean a(int param0, int param1) {
        return (param0 & 50560) != 0;
    }

    hk(eo param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        ((hk) this).field_c = null;
        ((hk) this).field_f = null;
        ((hk) this).field_a = null;
        ((hk) this).field_d = null;
        try {
          L0: {
            L1: {
              ((hk) this).field_b = param0;
              ((hk) this).field_g = ((hk) this).field_b.field_x;
              if (!((hk) this).field_g) {
                break L1;
              } else {
                if (((hk) this).field_b.a(una.field_g, -1, wo.field_i)) {
                  break L1;
                } else {
                  ((hk) this).field_g = false;
                  break L1;
                }
              }
            }
            L2: {
              if (((hk) this).field_g) {
                break L2;
              } else {
                if (((hk) this).field_b.a(false, una.field_g, wo.field_i)) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              tra.g(12890);
              if (!((hk) this).field_g) {
                ((hk) this).field_d = new gf[16];
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= 16) {
                    ((hk) this).field_a = new gf[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (16 <= var2_int) {
                        break L3;
                      } else {
                        int discarded$3 = 0;
                        var18 = ua.a(lt.field_f, 32768, var2_int * 32768);
                        ((hk) this).field_a[var2_int] = ((hk) this).field_b.a(128, var18, true, wo.field_i, -77, 128);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    int discarded$4 = 0;
                    var17 = ua.a(ak.field_o, 32768, 32768 * var2_int);
                    ((hk) this).field_d[var2_int] = ((hk) this).field_b.a(128, var17, true, wo.field_i, -117, 128);
                    var2_int++;
                    continue L4;
                  }
                }
              } else {
                var15 = ir.a(ak.field_o, 13588, false);
                ((hk) this).field_c = ((hk) this).field_b.a(var15, wo.field_i, (byte) -97, 128, 128, 16);
                var16 = ir.a(lt.field_f, 13588, false);
                lv discarded$5 = ((hk) this).field_b.a(var16, wo.field_i, (byte) -84, 128, 128, 16);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("hk.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var15 = 0;
        Object var16 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == -2646) {
                break L1;
              } else {
                var16 = null;
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
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
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
                    L5: {
                      if (~((long)(var11 & var10) + var7) >= ~param1[var11]) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var11++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("hk.B(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param4 + 41);
        }
    }

    static {
    }
}
