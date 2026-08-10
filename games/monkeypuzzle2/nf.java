/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class nf extends rh {
    static int field_M;
    private int field_J;
    static bg field_F;
    static int field_N;
    static String field_E;
    private int field_G;
    private int field_L;
    private int field_K;
    private int field_I;
    private int field_H;

    final static void a(int param0, hb param1) {
        try {
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
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
            i var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            i var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                var13 = (i) ((Object) ua.field_v.a((byte) -117));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var17.field_e <= var4) {
                      if (var3 == 0) {
                        L2: {
                          var4 = param1.field_h;
                          param1.a(-803539344, var17.field_l);
                          if (param0 <= -79) {
                            break L2;
                          } else {
                            nf.a(116, (byte) 63, -58, 12);
                            break L2;
                          }
                        }
                        var5 = 0;
                        L3: while (true) {
                          if (var17.field_e <= var5) {
                            param1.a((byte) -66, var4);
                            var17.c(-19822);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (0 != var17.field_o[var5]) {
                                param1.b(var17.field_o[var5], -49152);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_q[var5];
                                      if (0 == var6_int) {
                                        var15 = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                                        var8 = var15.getInt((Object) null);
                                        param1.b(0, -49152);
                                        param1.a(-803539344, var8);
                                        break L6;
                                      } else {
                                        if ((var6_int ^ -1) == -2) {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_g[var5]);
                                          param1.b(0, -49152);
                                          break L6;
                                        } else {
                                          if ((var6_int ^ -1) != -3) {
                                            break L6;
                                          } else {
                                            var26 = (java.lang.reflect.Field) (var17.field_k[var5].field_b);
                                            var8 = var26.getModifiers();
                                            param1.b(0, -49152);
                                            param1.a(-803539344, var8);
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    L7: {
                                      if ((var6_int ^ -1) == -4) {
                                        var28 = (java.lang.reflect.Method) (var17.field_s[var5].field_b);
                                        var25 = var17.field_f[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param1.b(1, -49152);
                                                param1.a(((Number) (var10)).longValue(), (byte) 84);
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param1.b(4, -49152);
                                                  break L7;
                                                } else {
                                                  param1.b(2, -49152);
                                                  param1.a(-105, (String) (var10));
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param1.b(0, -49152);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (var6_int == 4) {
                                          var27 = (java.lang.reflect.Method) (var17.field_s[var5].field_b);
                                          var8 = var27.getModifiers();
                                          param1.b(0, -49152);
                                          param1.a(-803539344, var8);
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
                                    param1.b(-10, -49152);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.b(-11, -49152);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.b(-12, -49152);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.b(-13, -49152);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.b(-14, -49152);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.b(-15, -49152);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.b(-16, -49152);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.b(-17, -49152);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.b(-18, -49152);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.b(-19, -49152);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.b(-20, -49152);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.b(-21, -49152);
                                    break L20;
                                  }
                                }
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L21: {
                        if (null == var13.field_k[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if ((var13.field_k[var4].field_g ^ -1) == -3) {
                              var13.field_o[var4] = -5;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (0 != var13.field_k[var4].field_g) {
                            break L21;
                          } else {
                            var3 = 1;
                            break L21;
                          }
                        }
                      }
                      if (var13.field_s[var4] != null) {
                        L23: {
                          if ((var13.field_s[var4].field_g ^ -1) != -3) {
                            break L23;
                          } else {
                            var13.field_o[var4] = -6;
                            break L23;
                          }
                        }
                        if (var13.field_s[var4].field_g == 0) {
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_66_0 = (RuntimeException) (var2);

                stackIn_66_1 = new StringBuilder().append("nf.GB(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackIn_67_2 = "null";
                  break L24;
                } else {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackIn_67_2 = "{...}";
                  break L24;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ')');
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

    void e(byte param0) {
        if (param0 != 10) {
            this.a(false, -117, 77);
        }
    }

    nf(kj param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_K = 0;
        this.field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            this.a(param0, (byte) 124, param2);
            return;
        }
        this.field_G = this.field_l;
        this.field_K = param3;
        this.field_I = param0;
        this.field_L = param1;
        this.field_J = param2;
        this.field_H = this.field_p;
    }

    final static void n(int param0) {
        if (param0 >= -34) {
            return;
        }
        int var1 = pf.a((byte) 97, 3);
        cj.a((byte) 105, ke.field_h[28 + var1]);
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        if (param0 < 0 || 65536 <= param0) {
            param0 = param0 >>> 16;
            var2 += 16;
        }
        if (param0 >= 256) {
            var2 += 8;
            param0 = param0 >>> 8;
        }
        if (!((param0 ^ -1) > -17)) {
            param0 = param0 >>> 4;
            var2 += 4;
        }
        if (!param1) {
            return 95;
        }
        if (param0 >= 4) {
            param0 = param0 >>> 2;
            var2 += 2;
        }
        if (param0 >= 1) {
            var2++;
            param0 = param0 >>> 1;
        }
        return param0 + var2;
    }

    final static short[] a(boolean param0, hb param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param1.f(8, param2);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L1;
              }
              L3: {
                if (!param0) {
                  break L3;
                } else {
                  nf.a(113, (byte) 53, 71, -3);
                  break L3;
                }
              }
              L4: {
                var5 = param1.f(8, 4);
                var6 = (short)param1.f(8, 16);
                if ((var5 ^ -1) < -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (short)(var6 + param1.f(8, var5));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (short[]) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("nf.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        ve.a(74, param2, param3, ah.field_g[param0]);
        if (param1 != 115) {
            field_M = 40;
        }
    }

    void p(int param0) {
        if (param0 != -21) {
            nf.a(-27, (byte) -88, -52, -108);
        }
        if ((this.field_K ^ -1) >= -1) {
            return;
        }
        this.a(this.field_I, (byte) -109, this.field_J);
        this.field_K = 0;
        this.e((byte) 10);
    }

    void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        ge.a(6 + param1, param2 - -35, this.field_l + -12, -40 + this.field_p, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (!param0) {
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            if (var4 <= var7) {
              var4 = 22;
              var5 = 194;
              var6 = 169;
              var7 = 0;
              var8 = param2 - -35;
              L1: while (true) {
                if (var4 <= var7) {
                  af.field_e.c(this.field_l + param1 + -90, 10 + param2);
                  qb.a(param2 - -35, pe.field_a, (byte) -108, 5 + param1, this.field_l - 10);
                  qb.a(-22 + param2 + this.field_p, ra.field_Z, (byte) -109, param1, this.field_l);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + this.field_p;
                  var7 = 0;
                  var8 = 57 + param2;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = var5 + (var6 + -var5) * var7 / var4;
                      var9 = var9 | (var9 << -1939856496 | var9 << 673181288);
                      ge.a(param1, var8, 6, var9);
                      ge.a(-6 + (this.field_l + param1), var8, 6, var9);
                      var7++;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = var7 * (-var5 + var6) / var4 + var5;
                  var9 = var9 | (var9 << -1147390800 | var9 << 1837289992);
                  ge.a(param1, var8, 6, var9);
                  ge.a(param1 - -this.field_l + -6, var8, 6, var9);
                  var8++;
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= ge.field_f) {
                if (ge.field_k > var8) {
                  L3: {
                    var9 = var5 + var7 * (-var5 + var6) / var4;
                    var10 = 0;
                    var11 = this.field_l;
                    if (-21 <= (var7 ^ -1)) {
                      L4: while (true) {
                        if ((var10 ^ -1) < -21) {
                          break L3;
                        } else {
                          var12 = (20 + -var7) * (-var7 + 20) + (-var10 + 20) * (-var10 + 20);
                          if ((var12 ^ -1) >= -463) {
                            if (var12 < 420) {
                              break L3;
                            } else {
                              var13 = (462 + -var12) * var9 / 42;
                              var13 = var13 | (var13 << 446319696 | var13 << -838844024);
                              ge.field_i[var10 + var8 * ge.field_h + param1] = var13;
                              var10++;
                              continue L4;
                            }
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if ((var7 ^ -1) < -21) {
                      break L5;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L6: while (true) {
                        L7: {
                          if (var13 > 20) {
                            break L7;
                          } else {
                            var14 = (-var7 + 20) * (20 - var7) + var13 * var13;
                            if (-463 > (var14 ^ -1)) {
                              break L7;
                            } else {
                              if (420 <= var14) {
                                var15 = var9 * (462 + -var14) / 42;
                                var15 = var15 | (var15 << 223973264 | var15 << -1223379096);
                                ge.field_i[var11 + ge.field_h * var8 + param1] = var15;
                                var11++;
                                var13++;
                                continue L6;
                              } else {
                                var12 = var11 - -1;
                                var11++;
                                var13++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var11 = var12;
                        break L5;
                      }
                    }
                  }
                  var9 = var9 | (var9 << -1122122416 | var9 << -1360539448);
                  ge.a(param1 + var10, var8, var11 + -var10, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean b(boolean param0) {
        if (param0) {
            this.k(-110);
        }
        this.p(-21);
        return super.b(false);
    }

    public static void o(int param0) {
        if (param0 != -4110) {
            nf.n(73);
        }
        field_F = null;
        field_E = null;
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -23913) {
            nf.a(-124, true);
        }
        if ((this.field_K ^ -1) >= -1) {
        } else {
            var2 = this.field_J;
            var3 = this.field_I;
            fieldTemp$0 = this.field_L + 1;
            this.field_L = this.field_L + 1;
            if (this.field_K <= fieldTemp$0) {
                this.field_K = 0;
                this.e((byte) 10);
            } else {
                var4 = (this.field_K * 2 + -this.field_L) * this.field_L;
                var5 = this.field_K * this.field_K;
                var3 = var4 * (-this.field_H + this.field_I) / var5 + this.field_H;
                var2 = this.field_G + var4 * (-this.field_G + this.field_J) / var5;
            }
            this.a(var3, (byte) 115, var2);
        }
        return super.k(-23913);
    }

    static {
        field_N = 0;
        field_E = "Back";
    }
}
