/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md {
    static String field_b;
    static int field_a;

    final static void d(int param0) {
        if (param0 >= -86) {
            field_a = 92;
        }
        ef.field_tb = 0;
        rm.field_f = new eg(0);
        hc.field_u = mn.field_c;
        bg.field_f = -1;
    }

    final static void b(int param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        qn var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        bj var6_ref_bj = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hb var28 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -10964) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              var28 = e.field_c;
              var2 = var28.c(32);
              if (var2 == 0) {
                var3 = var28.a((byte) 25);
                var4 = (qn) ((Object) na.field_T.a(86));
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (var3 != var4.field_w) {
                        var4 = (qn) ((Object) na.field_T.d(2123));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 != null) {
                    L5: {
                      var5 = var28.c(32);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        var6 = var4.field_o;
                        in.field_e[0].field_a = false;
                        in.field_e[0].field_g = qc.field_m;
                        var7 = var4.field_s;
                        in.field_e[0].field_b = null;
                        var8_int = 1;
                        L6: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$6 = new String[3][var6];
                            var4.field_u = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            dupTemp$7 = new long[3][var6];
                            var4.field_p = dupTemp$7;
                            var10 = dupTemp$7;
                            dupTemp$8 = new int[3][var6 * var7];
                            var4.field_q = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.c(32);
                            if (var18 > 0) {
                              var19 = 0;
                              L7: while (true) {
                                if (var18 <= var19) {
                                  break L5;
                                } else {
                                  L8: {
                                    var20 = var28.c(32);
                                    var21 = in.field_e[var20].field_g;
                                    var22 = var28.h((byte) -68);
                                    var24 = var28.field_n;
                                    if (var19 >= var6) {
                                      break L8;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = in.field_e[var20].field_b;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L8;
                                        } else {
                                          incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.f((byte) 52);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var21 == null) {
                                      break L10;
                                    } else {
                                      if (!im.a(var21, 61)) {
                                        break L10;
                                      } else {
                                        var8[1][var13] = qc.field_m;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var28.field_n = var24;
                                        var13++;
                                        var25 = 0;
                                        L11: while (true) {
                                          if (var7 <= var25) {
                                            break L10;
                                          } else {
                                            incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var28.f((byte) 37);
                                            var25++;
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var14 >= var6) {
                                      break L12;
                                    } else {
                                      if (!in.field_e[var20].field_a) {
                                        in.field_e[var20].field_a = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = in.field_e[var20].field_b;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_n = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var7 <= var25) {
                                            break L12;
                                          } else {
                                            incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var28.f((byte) 100);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L5;
                            }
                          } else {
                            L14: {
                              in.field_e[var8_int].field_g = var28.d(true);
                              in.field_e[var8_int].field_a = false;
                              if (-2 != (var28.c(param0 + 10996) ^ -1)) {
                                in.field_e[var8_int].field_b = null;
                                break L14;
                              } else {
                                in.field_e[var8_int].field_b = var28.d(true);
                                break L14;
                              }
                            }
                            var8_int++;
                            continue L6;
                          }
                        }
                      }
                    }
                    var4.field_t = true;
                    var4.a(true);
                    break L2;
                  } else {
                    dc.d(117);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                if (1 != var2) {
                  mb.a("HS1: " + ui.a(param0 ^ -10970), true, (Throwable) null);
                  dc.d(102);
                  break L2;
                } else {
                  var3 = var28.a((byte) 25);
                  var4_long = var28.h((byte) -68);
                  var6_ref_bj = (bj) ((Object) lf.field_k.a(82));
                  L15: while (true) {
                    L16: {
                      if (var6_ref_bj == null) {
                        break L16;
                      } else {
                        if (var6_ref_bj.field_p == var3) {
                          break L16;
                        } else {
                          var6_ref_bj = (bj) ((Object) lf.field_k.d(2123));
                          continue L15;
                        }
                      }
                    }
                    if (var6_ref_bj == null) {
                      dc.d(108);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var6_ref_bj.field_v = var4_long;
                      var6_ref_bj.a(true);
                      break L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "md.C(" + param0 + ')');
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
    }

    final static void a(hb param0, byte param1) {
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
            dg var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            dg var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            String stackIn_66_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                var13 = (dg) ((Object) af.field_cb.a(26));
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_r) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = param0.field_n;
                        param0.d(-116, var17.field_t);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var17.field_r) {
                            L3: {
                              if (param1 > 125) {
                                break L3;
                              } else {
                                md.b((byte) 97);
                                break L3;
                              }
                            }
                            discarded$1 = param0.e(26199, var4);
                            var17.a(true);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (0 == var17.field_u[var5]) {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_o[var5];
                                      if (-1 != (var6_int ^ -1)) {
                                        if ((var6_int ^ -1) == -2) {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_m[var5].field_f);
                                          var20 = var16_ref;
                                          var20.setInt((Object) null, var17.field_v[var5]);
                                          param0.f(94, 0);
                                          break L6;
                                        } else {
                                          if (-3 == (var6_int ^ -1)) {
                                            var28 = (java.lang.reflect.Field) (var17.field_m[var5].field_f);
                                            var8 = var28.getModifiers();
                                            param0.f(117, 0);
                                            param0.d(-121, var8);
                                            break L6;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Field) (var17.field_m[var5].field_f);
                                        var8 = var27.getInt((Object) null);
                                        param0.f(120, 0);
                                        param0.d(-110, var8);
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (var6_int != 3) {
                                        if (4 != var6_int) {
                                          break L7;
                                        } else {
                                          var30 = (java.lang.reflect.Method) (var17.field_q[var5].field_f);
                                          var8 = var30.getModifiers();
                                          param0.f(90, 0);
                                          param0.d(-126, var8);
                                          break L7;
                                        }
                                      } else {
                                        var29 = (java.lang.reflect.Method) (var17.field_q[var5].field_f);
                                        var26 = var17.field_s[var5];
                                        var9 = new Object[var26.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var26.length <= var10_int) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.f(104, 1);
                                                param0.a(((Number) (var10)).longValue(), (byte) 110);
                                                break L7;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param0.f(102, 2);
                                                  param0.a((String) (var10), -67);
                                                  break L7;
                                                } else {
                                                  param0.f(94, 4);
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param0.f(96, 0);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
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
                                    param0.f(95, -10);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.f(100, -11);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.f(103, -12);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.f(88, -13);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.f(100, -14);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.f(103, -15);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.f(114, -16);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.f(93, -17);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.f(115, -18);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.f(106, -19);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.f(125, -20);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.f(97, -21);
                                    break L20;
                                  }
                                }
                                break L4;
                              } else {
                                param0.f(99, var17.field_u[var5]);
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
                        if (null == var13.field_m[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if ((var13.field_m[var4].field_g ^ -1) != -3) {
                              break L22;
                            } else {
                              var13.field_u[var4] = -5;
                              break L22;
                            }
                          }
                          if (var13.field_m[var4].field_g == 0) {
                            var3 = 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (null != var13.field_q[var4]) {
                        L23: {
                          if ((var13.field_q[var4].field_g ^ -1) != -3) {
                            break L23;
                          } else {
                            var13.field_u[var4] = -6;
                            break L23;
                          }
                        }
                        if (var13.field_q[var4].field_g == 0) {
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
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_63_0 = (RuntimeException) (var2);
                stackOut_63_1 = new StringBuilder().append("md.G(");
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (param0 == null) {
                  stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
                  stackOut_65_2 = "null";
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  stackIn_66_2 = stackOut_65_2;
                  break L24;
                } else {
                  stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackOut_64_2 = "{...}";
                  stackIn_66_0 = stackOut_64_0;
                  stackIn_66_1 = stackOut_64_1;
                  stackIn_66_2 = stackOut_64_2;
                  break L24;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param1 + ')');
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

    public static void b(byte param0) {
        int var1 = 84 % ((param0 - 33) / 48);
        field_b = null;
    }

    final static bn c(int param0) {
        if (param0 < 6) {
            md.b((byte) 101);
        }
        String var1 = mc.a(16);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        return new bn(mc.a(16), hf.l(50));
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        sf var12 = null;
        hb var13 = null;
        gd var14 = null;
        int[] var15 = null;
        Object var16 = null;
        gd var16_ref = null;
        int[] var17 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 85) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              var13 = e.field_c;
              var2 = var13.c(32);
              if (-1 == (var2 ^ -1)) {
                var11 = ek.c(16317);
                var17 = var11;
                var15 = var17;
                var3 = var15;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((kg) ((Object) var5)).c(32);
                var7 = 0;
                L3: while (true) {
                  if (var6 <= var7) {
                    var16_ref = (gd) ((Object) ra.field_d.a(-120));
                    if (var16_ref == null) {
                      dc.d(105);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var16_ref.field_p = var3;
                      var16_ref.field_s = var17[0];
                      var16_ref.field_o = true;
                      var16_ref.a(true);
                      break L2;
                    }
                  } else {
                    var10[var7] = ((kg) ((Object) var5)).f((byte) 61);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if (1 == var2) {
                  var12 = (sf) ((Object) sm.field_y.a(-125));
                  if (var12 == null) {
                    dc.d(118);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var12.a(true);
                    break L2;
                  }
                } else {
                  if (var2 != 2) {
                    mb.a("A1: " + ui.a(10), true, (Throwable) null);
                    dc.d(122);
                    break L2;
                  } else {
                    var14 = (gd) ((Object) ra.field_d.a(121));
                    if (var14 != null) {
                      var14.field_p = ek.c(16317);
                      var14.field_o = true;
                      var14.field_s = var14.field_p[0];
                      var14.a(true);
                      break L2;
                    } else {
                      dc.d(126);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "md.B(" + param0 + ')');
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
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -73) {
            break L0;
          } else {
            md.d(-115);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!qc.field_n) {
              break L2;
            } else {
              if (qn.field_v.field_B.field_z) {
                break L2;
              } else {
                if (qn.field_v.field_K != null) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_b = "1 homing missile";
        field_a = 500;
    }
}
