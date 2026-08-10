/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd extends un {
    private qp field_z;
    private String field_v;
    static ao field_r;
    private boolean field_y;
    static ao field_w;
    static String field_t;
    static cj field_x;
    static fe field_s;
    static int field_q;
    static int field_u;

    hd(pm param0, pm param1) {
        super(param0);
        this.field_v = "";
        this.field_y = false;
        try {
            this.field_z = new qp(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final re a(boolean param0, String param1) {
        uc var3 = null;
        RuntimeException var3_ref = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_z.a(param0, param1) != jq.field_b) {
              L1: {
                if (param1.equals(this.field_v)) {
                  break L1;
                } else {
                  var3 = ga.a(param1, false);
                  if (!var3.d(-99)) {
                    stackIn_7_0 = ua.field_I;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_v = param1;
                    this.field_y = var3.b(18307);
                    break L1;
                  }
                }
              }
              L2: {
                if (!this.field_y) {
                  stackIn_12_0 = jq.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = db.field_b;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = jq.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("hd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_z.a(false, param0) == jq.field_b) {
              stackIn_3_0 = this.field_z.a(param0, -1276425040);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -1276425040) {
                if (this.a(false, param0) != jq.field_b) {
                  stackIn_11_0 = gi.field_h;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = eg.field_z;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hd.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        L0: {
          if (param0 == -24315) {
            break L0;
          } else {
            field_r = (ao) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (param1 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = 0;
            break L1;
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2, k param3, k param4) {
        try {
            qi.a(0, true, param0, param3.field_j, param2, param3.field_m, param4);
            int var5_int = 19 % ((-76 - param1) / 44);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "hd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(int param0) {
        field_w = null;
        field_r = null;
        field_t = null;
        if (param0 != 11702) {
            String var2 = (String) null;
            hd.a(-23, (String) null, 34);
        }
        field_x = null;
        field_s = null;
    }

    final static void a(ga param0, int param1) {
        try {
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            String stackIn_64_2 = null;
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
            lp var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lp var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var13 = (lp) ((Object) we.field_k.c(76));
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var17.field_n) {
                      if (var3 == 0) {
                        var4 = param0.field_j;
                        param0.b(param1 ^ 34, var17.field_r);
                        var5 = param1;
                        L2: while (true) {
                          if (var5 >= var17.field_n) {
                            param0.f(var4, 117);
                            var17.a(true);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_g[var5] != 0) {
                                param0.a(-99, var17.field_g[var5]);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_i[var5];
                                      if (0 != var6_int) {
                                        if ((var6_int ^ -1) != -2) {
                                          if (-3 != (var6_int ^ -1)) {
                                            break L5;
                                          } else {
                                            var15 = (java.lang.reflect.Field) (var17.field_m[var5].field_d);
                                            var8 = var15.getModifiers();
                                            param0.a(118, 0);
                                            param0.b(-126, var8);
                                            break L5;
                                          }
                                        } else {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_m[var5].field_d);
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_q[var5]);
                                          param0.a(-32, 0);
                                          break L5;
                                        }
                                      } else {
                                        var26 = (java.lang.reflect.Field) (var17.field_m[var5].field_d);
                                        var8 = var26.getInt((Object) null);
                                        param0.a(-95, 0);
                                        param0.b(-123, var8);
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var6_int != 3) {
                                        if ((var6_int ^ -1) != -5) {
                                          break L6;
                                        } else {
                                          var28 = (java.lang.reflect.Method) (var17.field_l[var5].field_d);
                                          var8 = var28.getModifiers();
                                          param0.a(125, 0);
                                          param0.b(-102, var8);
                                          break L6;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Method) (var17.field_l[var5].field_d);
                                        var25 = var17.field_o[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.a(116, 1);
                                                param0.a(((Number) (var10)).longValue(), true);
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(-45, 4);
                                                  break L6;
                                                } else {
                                                  param0.a(113, 2);
                                                  param0.a((String) (var10), (byte) 105);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param0.a(param1 + 123, 0);
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
                                    param0.a(111, -10);
                                    break L8;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L9: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.a(118, -11);
                                    break L9;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L10: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.a(126, -12);
                                    break L10;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L11: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.a(param1 ^ 125, -13);
                                    break L11;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.a(-109, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(125, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(-27, -16);
                                    break L14;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L15: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.a(param1 + 127, -17);
                                    break L15;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(-38, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(param1 ^ 115, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(124, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(-97, -21);
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
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L20: {
                        if (null == var13.field_m[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (2 != var13.field_m[var4].field_f) {
                              break L21;
                            } else {
                              var13.field_g[var4] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_m[var4].field_f == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (null != var13.field_l[var4]) {
                          L23: {
                            if (2 != var13.field_l[var4].field_f) {
                              break L23;
                            } else {
                              var13.field_g[var4] = -6;
                              break L23;
                            }
                          }
                          if (var13.field_l[var4].field_f == 0) {
                            var3 = 1;
                            break L22;
                          } else {
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
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_63_0 = (RuntimeException) (var2);

                stackIn_63_1 = new StringBuilder().append("hd.P(");

                if (param0 == null) {
                  stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
                  stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
                  stackIn_64_2 = "null";
                  break L24;
                } else {
                  stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
                  stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
                  stackIn_64_2 = "{...}";
                  break L24;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param1 + ')');
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

    final static void a(boolean param0, int param1) {
        if (!(gi.field_i == null)) {
            gi.field_i.c(param0, -1);
        }
        if (param1 != -19) {
            k var3 = (k) null;
            hd.a((java.math.BigInteger) null, (byte) -46, (java.math.BigInteger) null, (k) null, (k) null);
        }
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3) {
              stackIn_3_0 = ga.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param0 ^ -1) == -7) {
                stackIn_7_0 = gm.field_ob;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == 7) {
                  stackIn_11_0 = kb.field_w;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param0 ^ -1) != param2) {
                    if (-10 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -11) {
                        if (11 != param0) {
                          if (param0 == 14) {
                            stackIn_27_0 = vl.a(gl.field_K, new String[]{param1}, 2);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackIn_23_0 = ek.field_I;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = qi.field_b;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = la.field_b;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = fd.field_I;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("hd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_r = new ao(0, 2, 2, 1);
        field_w = new ao(13, 0, 1, 0);
        field_t = "Phantom";
        field_u = 75;
    }
}
