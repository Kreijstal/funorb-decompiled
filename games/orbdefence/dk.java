/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dk {
    static int field_a;
    static String field_b;
    static int[] field_c;

    final static int[] a(int param0, int param1, boolean param2) {
        if (param2) {
            field_c = (int[]) null;
        }
        int var3 = lm.a(param0, (byte) -125);
        int var4 = mf.a(param0, -128);
        int var5 = lm.a(param1, (byte) -118);
        int var6 = mf.a(param1, -19);
        int var7 = (int)((long)var5 * (long)var3 >> -1429028528);
        int var8 = (int)((long)var6 * (long)var3 >> -484802672);
        int var9 = (int)((long)var5 * (long)var4 >> -1395148976);
        int var10 = (int)((long)var6 * (long)var4 >> 1056712464);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0) {
        il.a(4, 0);
        int var1 = 68 / ((-63 - param0) / 54);
    }

    final static void a(int param0) {
        bg.a(false);
        int var1 = -84 / ((15 - param0) / 63);
        vh.field_j = true;
        ca.field_b = true;
        bm.field_d.n(7920);
        vd.a(false, -536866817, hi.field_f);
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
            field_a = -40;
        }
    }

    final static void a(byte param0, se param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
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
            int var7_int = 0;
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            ud var14 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            ud var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            int stackIn_30_0 = 0;
            int stackIn_74_0 = 0;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            String stackIn_79_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_29_0 = 0;
            int stackOut_73_0 = 0;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            RuntimeException stackOut_78_0 = null;
            StringBuilder stackOut_78_1 = null;
            String stackOut_78_2 = null;
            RuntimeException stackOut_77_0 = null;
            StringBuilder stackOut_77_1 = null;
            String stackOut_77_2 = null;
            var19 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var13 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var14 = (ud) ((Object) ab.field_h.b((byte) 114));
                var18 = var14;
                if (var18 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 87 % ((param0 - 65) / 32);
                  var4 = 0;
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5 >= var18.field_o) {
                          break L3;
                        } else {
                          if (var13 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (var14.field_h[var5] != null) {
                                L5: {
                                  if ((var14.field_h[var5].field_a ^ -1) == -3) {
                                    var14.field_m[var5] = -5;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (var14.field_h[var5].field_a == 0) {
                                  var4 = 1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (var14.field_i[var5] != null) {
                                L7: {
                                  if ((var14.field_i[var5].field_a ^ -1) == -3) {
                                    var14.field_m[var5] = -6;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                if (0 == var14.field_i[var5].field_a) {
                                  var4 = 1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            var5++;
                            if (var13 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L2;
                      } else {
                        var5 = param1.field_i;
                        param1.b(var18.field_k, -1);
                        var6 = 0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (var6 >= var18.field_o) {
                                break L10;
                              } else {
                                stackOut_29_0 = var14.field_m[var6] ^ -1;
                                stackIn_74_0 = stackOut_29_0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var13 != 0) {
                                  break L9;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_30_0 != -1) {
                                        param1.a(var14.field_m[var6], -17);
                                        if (var13 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                    try {
                                      L13: {
                                        L14: {
                                          L15: {
                                            var7_int = var14.field_l[var6];
                                            if (-1 != (var7_int ^ -1)) {
                                              break L15;
                                            } else {
                                              var26 = (java.lang.reflect.Field) (var14.field_h[var6].field_g);
                                              var9 = var26.getInt((Object) null);
                                              param1.a(0, -127);
                                              param1.b(var9, -1);
                                              if (var13 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var7_int != 1) {
                                              break L16;
                                            } else {
                                              var15 = (java.lang.reflect.Field) (var14.field_h[var6].field_g);
                                              var8 = var15;
                                              var15.setInt((Object) null, var14.field_n[var6]);
                                              param1.a(0, -36);
                                              if (var13 == 0) {
                                                break L14;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          if (2 != var7_int) {
                                            break L14;
                                          } else {
                                            var27 = (java.lang.reflect.Field) (var14.field_h[var6].field_g);
                                            var9 = var27.getModifiers();
                                            param1.a(0, -48);
                                            param1.b(var9, -1);
                                            break L14;
                                          }
                                        }
                                        L17: {
                                          L18: {
                                            if (var7_int == 3) {
                                              break L18;
                                            } else {
                                              if ((var7_int ^ -1) == -5) {
                                                var28 = (java.lang.reflect.Method) (var14.field_i[var6].field_g);
                                                var9 = var28.getModifiers();
                                                param1.a(0, -120);
                                                param1.b(var9, -1);
                                                if (var13 == 0) {
                                                  break L17;
                                                } else {
                                                  break L18;
                                                }
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          var29 = (java.lang.reflect.Method) (var14.field_i[var6].field_g);
                                          var25 = var14.field_g[var6];
                                          var10 = new Object[var25.length];
                                          var11_int = 0;
                                          L19: while (true) {
                                            L20: {
                                              if (var25.length <= var11_int) {
                                                break L20;
                                              } else {
                                                var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var11_int])));
                                                var10[var11_int] = var12.readObject();
                                                var11_int++;
                                                if (var13 != 0) {
                                                  break L17;
                                                } else {
                                                  if (var13 == 0) {
                                                    continue L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                            L21: {
                                              var11 = var29.invoke((Object) null, var10);
                                              if (var11 != null) {
                                                break L21;
                                              } else {
                                                param1.a(0, -76);
                                                if (var13 == 0) {
                                                  break L17;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L22: {
                                              if (!(var11 instanceof Number)) {
                                                break L22;
                                              } else {
                                                param1.a(1, -62);
                                                param1.a(((Number) (var11)).longValue(), -16943);
                                                if (var13 == 0) {
                                                  break L17;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            if (var11 instanceof String) {
                                              param1.a(2, -26);
                                              param1.a((String) (var11), -6528);
                                              if (var13 == 0) {
                                                break L17;
                                              } else {
                                                param1.a(4, -48);
                                                break L17;
                                              }
                                            } else {
                                              param1.a(4, -48);
                                              break L17;
                                            }
                                          }
                                        }
                                        break L13;
                                      }
                                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L23: {
                                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                        param1.a(-10, -16);
                                        break L23;
                                      }
                                    } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L24: {
                                        var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                        param1.a(-11, -119);
                                        break L24;
                                      }
                                    } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                      decompiledCaughtException = decompiledCaughtParameter2;
                                      L25: {
                                        var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                        param1.a(-12, -123);
                                        break L25;
                                      }
                                    } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                      decompiledCaughtException = decompiledCaughtParameter3;
                                      L26: {
                                        var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                        param1.a(-13, -9);
                                        break L26;
                                      }
                                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                      decompiledCaughtException = decompiledCaughtParameter4;
                                      L27: {
                                        var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                        param1.a(-14, -99);
                                        break L27;
                                      }
                                    } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                      decompiledCaughtException = decompiledCaughtParameter5;
                                      L28: {
                                        var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                        param1.a(-15, -86);
                                        break L28;
                                      }
                                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                      decompiledCaughtException = decompiledCaughtParameter6;
                                      L29: {
                                        var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                        param1.a(-16, -73);
                                        break L29;
                                      }
                                    } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                      decompiledCaughtException = decompiledCaughtParameter7;
                                      L30: {
                                        var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                        param1.a(-17, -58);
                                        break L30;
                                      }
                                    } catch (java.io.IOException decompiledCaughtParameter8) {
                                      decompiledCaughtException = decompiledCaughtParameter8;
                                      L31: {
                                        var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                        param1.a(-18, -96);
                                        break L31;
                                      }
                                    } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                      decompiledCaughtException = decompiledCaughtParameter9;
                                      L32: {
                                        var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                        param1.a(-19, -7);
                                        break L32;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter10) {
                                      decompiledCaughtException = decompiledCaughtParameter10;
                                      L33: {
                                        var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                        param1.a(-20, -108);
                                        break L33;
                                      }
                                    } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                      decompiledCaughtException = decompiledCaughtParameter11;
                                      L34: {
                                        var7_ref11 = decompiledCaughtException;
                                        param1.a(-21, -71);
                                        break L34;
                                      }
                                    }
                                    break L11;
                                  }
                                  var6++;
                                  if (var13 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            stackOut_73_0 = param1.e(-18951, var5);
                            stackIn_74_0 = stackOut_73_0;
                            break L9;
                          }
                          var18.b(57);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L35: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_76_0 = (RuntimeException) (var2);
                stackOut_76_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
                stackIn_78_0 = stackOut_76_0;
                stackIn_78_1 = stackOut_76_1;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                if (param1 == null) {
                  stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
                  stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
                  stackOut_78_2 = "null";
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  stackIn_79_2 = stackOut_78_2;
                  break L35;
                } else {
                  stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
                  stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
                  stackOut_77_2 = "{...}";
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_79_1 = stackOut_77_1;
                  stackIn_79_2 = stackOut_77_2;
                  break L35;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
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

    final static boolean a(CharSequence param0, int param1) {
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
            L1: {
              if (param1 == 5408) {
                break L1;
              } else {
                dk.a(-113);
                break L1;
              }
            }
            stackOut_2_0 = tj.a(false, param1 + -5408, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("dk.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, ki param1, ki param2, ki param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.b(-1)) {
                break L1;
              } else {
                if (!param1.b((byte) 104, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 1) {
                      break L2;
                    } else {
                      field_a = -12;
                      break L2;
                    }
                  }
                  L3: {
                    if (!param3.b(-1)) {
                      break L3;
                    } else {
                      if (!param3.b((byte) 92, "commonui")) {
                        break L3;
                      } else {
                        if (!param2.b(param0 + -2)) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (param2.b((byte) -110, "button.gif")) {
                            stackOut_17_0 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          L6: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    static {
        field_b = "End Game";
    }
}
