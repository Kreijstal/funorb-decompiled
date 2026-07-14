/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj {
    static String field_h;
    static String field_c;
    static gh field_e;
    static int field_d;
    static boolean field_f;
    static String field_k;
    static String field_g;
    static String field_a;
    static String field_b;
    static String field_l;
    static int[] field_i;
    static gh field_j;

    final static int a(int param0, int param1) {
        int var2 = (param0 & 16760920) >> 1304178064;
        int var3 = 255 & param0 >> 761880424;
        var2 = 255 + -((-var2 + 255) / 2);
        int var4 = 255 & param0;
        var3 = 255 + -((-var3 + 255) / 2);
        if (param1 < 90) {
            return -125;
        }
        var4 = -((255 - var4) / 2) + 255;
        return (var2 << 1489162704) - (-(var3 << -734660440) - var4);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, wk param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        wk var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        L0: {
          var19 = SteelSentinels.field_G;
          if (pb.field_i > param1) {
            param7 = param7 - (-param1 + pb.field_i);
            param1 = pb.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (pb.field_b < param7 + param1) {
            param7 = pb.field_b + -param1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (pb.field_l > param2) {
            param4 = param4 - (pb.field_l + -param2);
            param2 = pb.field_l;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param4 + param2 > pb.field_d) {
            param4 = -param2 + pb.field_d;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if ((param7 ^ -1) >= -1) {
            break L4;
          } else {
            if (0 >= param4) {
              break L4;
            } else {
              L5: {
                var22 = param6.g();
                if (param3 <= -16) {
                  break L5;
                } else {
                  var20 = null;
                  uj.a(-28, -57, -101, (byte) 67, 90, 52, (wk) null, -77);
                  break L5;
                }
              }
              var33 = pb.field_g;
              var10 = pb.field_c;
              var11 = pb.field_j;
              var31 = new int[4];
              pb.b(var31);
              param6.d();
              pb.h(var31[0], var31[1], var31[2], var31[3]);
              var13 = param1 - -(param2 * param6.field_A);
              var14 = -param7 + param6.field_A;
              var32 = var22.field_E;
              var29 = var32;
              var26 = var29;
              var23 = var26;
              var15 = var23;
              var16 = param2;
              L6: while (true) {
                if (var16 >= param2 + param4) {
                  var22.a(-param6.field_D, -param6.field_H);
                  pb.a(var33, var10, var11);
                  pb.a(var31);
                  return;
                } else {
                  var17 = param1;
                  L7: while (true) {
                    if (param7 + param1 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L6;
                    } else {
                      var18 = var32[var13];
                      if (-1 != (var18 ^ -1)) {
                        L8: {
                          L9: {
                            if ((var17 ^ -1) >= -1) {
                              break L9;
                            } else {
                              if (var15[var13 + -1] == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var16 <= 0) {
                              break L10;
                            } else {
                              if (var15[var13 + -param6.field_A] == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (var17 >= param6.field_A - 1) {
                              break L11;
                            } else {
                              if (var15[1 + var13] == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (var16 < param6.field_F + -1) {
                            if (-1 == (var15[var13 - -param6.field_A] ^ -1)) {
                              break L8;
                            } else {
                              var13++;
                              var17++;
                              continue L7;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                        pb.e(var17, var16, param0, param5);
                        var13++;
                        var17++;
                        continue L7;
                      } else {
                        var13++;
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_g = null;
        field_k = null;
        field_e = null;
        field_j = null;
        field_c = null;
        field_a = null;
        field_l = null;
        field_i = null;
    }

    final static void a(boolean param0, kj param1) {
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
            ua var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            ua var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            Throwable decompiledCaughtException = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = SteelSentinels.field_G;
            var13 = (ua) (Object) rg.field_d.e(13058);
            var17 = var13;
            if (var17 == null) {
              return;
            } else {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var17.field_B) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var4 = param1.field_p;
                    param1.b(param0, var17.field_q);
                    var5 = 0;
                    L1: while (true) {
                      if (var17.field_B <= var5) {
                        var5++;
                      } else {
                        L2: {
                          if (var17.field_A[var5] != 0) {
                            param1.a((byte) 116, var17.field_A[var5]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var6_int = var17.field_s[var5];
                                if (var6_int == 0) {
                                  var15 = (java.lang.reflect.Field) var17.field_y[var5].field_c;
                                  var8 = var15.getInt((Object) null);
                                  param1.a((byte) 124, 0);
                                  param1.b(true, var8);
                                  break L3;
                                } else {
                                  if ((var6_int ^ -1) == -2) {
                                    var16_ref = (java.lang.reflect.Field) var17.field_y[var5].field_c;
                                    var19 = var16_ref;
                                    var19.setInt((Object) null, var17.field_w[var5]);
                                    param1.a((byte) 117, 0);
                                    break L3;
                                  } else {
                                    if (var6_int == 2) {
                                      var26 = (java.lang.reflect.Field) var17.field_y[var5].field_c;
                                      var8 = var26.getModifiers();
                                      param1.a((byte) 110, 0);
                                      param1.b(true, var8);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                              L4: {
                                if ((var6_int ^ -1) != -4) {
                                  if (4 == var6_int) {
                                    var28 = (java.lang.reflect.Method) var17.field_K[var5].field_c;
                                    var8 = var28.getModifiers();
                                    param1.a((byte) 112, 0);
                                    param1.b(true, var8);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Method) var17.field_K[var5].field_c;
                                  var25 = var17.field_F[var5];
                                  var9 = new Object[var25.length];
                                  var10_int = 0;
                                  L5: while (true) {
                                    if (var25.length <= var10_int) {
                                      var10 = var27.invoke((Object) null, var9);
                                      if (var10 == null) {
                                        param1.a((byte) 125, 0);
                                        break L4;
                                      } else {
                                        if (var10 instanceof Number) {
                                          param1.a((byte) 120, 1);
                                          param1.b(-28875, ((Number) var10).longValue());
                                          break L4;
                                        } else {
                                          if (!(var10 instanceof String)) {
                                            param1.a((byte) 111, 4);
                                            break L4;
                                          } else {
                                            param1.a((byte) 108, 2);
                                            param1.a((String) var10, -120);
                                            break L4;
                                          }
                                        }
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param1.a((byte) 119, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param1.a((byte) 127, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param1.a((byte) 117, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param1.a((byte) 114, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param1.a((byte) 121, -20);
                            }
                            break L2;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param1.a((byte) 113, -21);
                        continue L1;
                      }
                    }
                  }
                } else {
                  L6: {
                    if (var13.field_y[var4] == null) {
                      break L6;
                    } else {
                      L7: {
                        if (var13.field_y[var4].field_a != 2) {
                          break L7;
                        } else {
                          var13.field_A[var4] = -5;
                          break L7;
                        }
                      }
                      if (var13.field_y[var4].field_a != 0) {
                        break L6;
                      } else {
                        var3 = 1;
                        break L6;
                      }
                    }
                  }
                  if (var13.field_K[var4] != null) {
                    L8: {
                      if (var13.field_K[var4].field_a != -3) {
                        break L8;
                      } else {
                        var13.field_A[var4] = -6;
                        break L8;
                      }
                    }
                    if (-1 == var13.field_K[var4].field_a) {
                      var3 = 1;
                      var4++;
                      continue L0;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
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

    final static void b(int param0) {
        if (vn.field_h != 0 + -vc.field_c) {
            if (250 + -vc.field_c != vn.field_h) {
            }
        }
        if (param0 != 29) {
            Object var2 = null;
            uj.a(17, 76, 105, (byte) 99, -38, -93, (wk) null, 68);
        }
        vn.field_h = vn.field_h + 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_g = "Name";
        field_b = "Searching for opponents";
        field_f = false;
        field_l = "You are advised to complete all training missions before attempting this mission.";
        field_h = "Steel Sentinels";
        field_i = new int[]{84, 104, 29, 87, 29, 24, 24, 24, 86, 85, 47, 17, 3, 8, 31, 29, 16, 30, 17, -1};
    }
}
