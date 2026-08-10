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
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            String stackIn_70_2 = null;
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
            ud var14 = null;
            Object var16 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            ud var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var21 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            var19 = null;
            var17 = null;
            var16 = null;
            var21 = null;
            var23 = null;
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
                    if (var5 >= var18.field_o) {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var5 = param1.field_i;
                        param1.b(var18.field_k, -1);
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= var18.field_o) {
                            param1.e(-18951, var5);
                            var18.b(57);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L3: {
                              if (var18.field_m[var6] != 0) {
                                param1.a(var18.field_m[var6], -17);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var7_int = var18.field_l[var6];
                                      if (-1 != (var7_int ^ -1)) {
                                        if (var7_int != 1) {
                                          if (2 != var7_int) {
                                            break L5;
                                          } else {
                                            var28 = (java.lang.reflect.Field) (var18.field_h[var6].field_g);
                                            var9 = var28.getModifiers();
                                            param1.a(0, -48);
                                            param1.b(var9, -1);
                                            break L5;
                                          }
                                        } else {
                                          var17_ref = (java.lang.reflect.Field) (var18.field_h[var6].field_g);
                                          var20 = var17_ref;
                                          var20.setInt((Object) null, var18.field_n[var6]);
                                          param1.a(0, -36);
                                          break L5;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) (var18.field_h[var6].field_g);
                                        var9 = var27.getInt((Object) null);
                                        param1.a(0, -127);
                                        param1.b(var9, -1);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var7_int == 3) {
                                        var30 = (java.lang.reflect.Method) (var18.field_i[var6].field_g);
                                        var26 = var18.field_g[var6];
                                        var10 = new Object[var26.length];
                                        var11_int = 0;
                                        L7: while (true) {
                                          if (var26.length <= var11_int) {
                                            var11 = var30.invoke((Object) null, var10);
                                            if (var11 != null) {
                                              if (!(var11 instanceof Number)) {
                                                if (!(var11 instanceof String)) {
                                                  param1.a(4, -48);
                                                  break L6;
                                                } else {
                                                  param1.a(2, -26);
                                                  param1.a((String) (var11), -6528);
                                                  break L6;
                                                }
                                              } else {
                                                param1.a(1, -62);
                                                param1.a(((Number) (var11)).longValue(), -16943);
                                                break L6;
                                              }
                                            } else {
                                              param1.a(0, -76);
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
                                        if ((var7_int ^ -1) == -5) {
                                          var29 = (java.lang.reflect.Method) (var18.field_i[var6].field_g);
                                          var9 = var29.getModifiers();
                                          param1.a(0, -120);
                                          param1.b(var9, -1);
                                          break L6;
                                        } else {
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
                                    param1.a(-10, -16);
                                    break L8;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L9: {
                                    var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.a(-11, -119);
                                    break L9;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.a(-12, -123);
                                    break L10;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L11: {
                                    var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.a(-13, -9);
                                    break L11;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.a(-14, -99);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(-15, -86);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(-16, -73);
                                    break L14;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L15: {
                                    var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.a(-17, -58);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(-18, -96);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(-19, -7);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(-20, -108);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var7_ref11 = decompiledCaughtException;
                                    param1.a(-21, -71);
                                    break L19;
                                  }
                                }
                                break L3;
                              }
                            }
                            var6++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L20: {
                        if (var14.field_h[var5] != null) {
                          L21: {
                            if ((var14.field_h[var5].field_a ^ -1) == -3) {
                              var14.field_m[var5] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (var14.field_h[var5].field_a == 0) {
                            var4 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var14.field_i[var5] != null) {
                          L23: {
                            if ((var14.field_i[var5].field_a ^ -1) == -3) {
                              var14.field_m[var5] = -6;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          if (0 == var14.field_i[var5].field_a) {
                            var4 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_69_0 = (RuntimeException) (var2);

                stackIn_69_1 = new StringBuilder().append("dk.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackIn_70_2 = "null";
                  break L24;
                } else {
                  stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                  stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                  stackIn_70_2 = "{...}";
                  break L24;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ')');
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = tj.a(false, param1 + -5408, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("dk.D(");

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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                          stackIn_16_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (param2.b((byte) -110, "button.gif")) {
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("dk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
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
