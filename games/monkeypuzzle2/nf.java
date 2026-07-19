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
            java.lang.reflect.Field var7 = null;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            i var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            i var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            int stackIn_27_0 = 0;
            int stackIn_70_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_26_0 = 0;
            int stackOut_69_0 = 0;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
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
                    L2: {
                      L3: {
                        if (var17.field_e <= var4) {
                          break L3;
                        } else {
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (null == var13.field_k[var4]) {
                                break L4;
                              } else {
                                L5: {
                                  if ((var13.field_k[var4].field_g ^ -1) == -3) {
                                    var13.field_o[var4] = -5;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (0 != var13.field_k[var4].field_g) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              if (var13.field_s[var4] == null) {
                                break L6;
                              } else {
                                L7: {
                                  if ((var13.field_s[var4].field_g ^ -1) != -3) {
                                    break L7;
                                  } else {
                                    var13.field_o[var4] = -6;
                                    break L7;
                                  }
                                }
                                if ((var13.field_s[var4].field_g ^ -1) != -1) {
                                  break L6;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              }
                            }
                            var4++;
                            if (var12 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (var3 == 0) {
                        var4 = param1.field_h;
                        param1.a(-803539344, var17.field_l);
                        break L2;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                    L8: {
                      if (param0 <= -79) {
                        break L8;
                      } else {
                        nf.a(116, (byte) 63, -58, 12);
                        break L8;
                      }
                    }
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (var17.field_e <= var5) {
                            break L11;
                          } else {
                            stackOut_26_0 = 0;
                            stackIn_70_0 = stackOut_26_0;
                            stackIn_27_0 = stackOut_26_0;
                            if (var12 != 0) {
                              break L10;
                            } else {
                              L12: {
                                L13: {
                                  if (stackIn_27_0 != var13.field_o[var5]) {
                                    param1.b(var13.field_o[var5], -49152);
                                    if (var12 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                                try {
                                  L14: {
                                    L15: {
                                      L16: {
                                        var6_int = var13.field_q[var5];
                                        if (0 == var6_int) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if ((var6_int ^ -1) == -2) {
                                              break L17;
                                            } else {
                                              if ((var6_int ^ -1) != -3) {
                                                break L15;
                                              } else {
                                                var25 = (java.lang.reflect.Field) (var13.field_k[var5].field_b);
                                                var8 = var25.getModifiers();
                                                param1.b(0, -49152);
                                                param1.a(-803539344, var8);
                                                if (var12 == 0) {
                                                  break L15;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                          }
                                          var14 = (java.lang.reflect.Field) (var13.field_k[var5].field_b);
                                          var7 = var14;
                                          var14.setInt((Object) null, var13.field_g[var5]);
                                          param1.b(0, -49152);
                                          if (var12 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var15 = (java.lang.reflect.Field) (var13.field_k[var5].field_b);
                                      var8 = var15.getInt((Object) null);
                                      param1.b(0, -49152);
                                      param1.a(-803539344, var8);
                                      break L15;
                                    }
                                    L18: {
                                      L19: {
                                        L20: {
                                          if ((var6_int ^ -1) == -4) {
                                            break L20;
                                          } else {
                                            if (var6_int == 4) {
                                              var26 = (java.lang.reflect.Method) (var13.field_s[var5].field_b);
                                              var8 = var26.getModifiers();
                                              param1.b(0, -49152);
                                              param1.a(-803539344, var8);
                                              if (var12 == 0) {
                                                break L19;
                                              } else {
                                                break L20;
                                              }
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        var27 = (java.lang.reflect.Method) (var13.field_s[var5].field_b);
                                        var24 = var13.field_f[var5];
                                        var9 = new Object[var24.length];
                                        var10_int = 0;
                                        L21: while (true) {
                                          L22: {
                                            if ((var10_int ^ -1) <= (var24.length ^ -1)) {
                                              break L22;
                                            } else {
                                              var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                                              var9[var10_int] = var11.readObject();
                                              var10_int++;
                                              if (var12 != 0) {
                                                break L19;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L21;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                          }
                                          L23: {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              break L23;
                                            } else {
                                              param1.b(0, -49152);
                                              if (var12 == 0) {
                                                break L19;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          L24: {
                                            if (var10 instanceof Number) {
                                              break L24;
                                            } else {
                                              L25: {
                                                if (!(var10 instanceof String)) {
                                                  break L25;
                                                } else {
                                                  param1.b(2, -49152);
                                                  param1.a(-105, (String) (var10));
                                                  if (var12 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              param1.b(4, -49152);
                                              if (var12 == 0) {
                                                break L19;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                          param1.b(1, -49152);
                                          param1.a(((Number) (var10)).longValue(), (byte) 84);
                                          break L18;
                                        }
                                      }
                                      break L18;
                                    }
                                    break L14;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L26: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.b(-10, -49152);
                                    break L26;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L27: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.b(-11, -49152);
                                    break L27;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L28: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.b(-12, -49152);
                                    break L28;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L29: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.b(-13, -49152);
                                    break L29;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L30: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.b(-14, -49152);
                                    break L30;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L31: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.b(-15, -49152);
                                    break L31;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L32: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.b(-16, -49152);
                                    break L32;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L33: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.b(-17, -49152);
                                    break L33;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L34: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.b(-18, -49152);
                                    break L34;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L35: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.b(-19, -49152);
                                    break L35;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L36: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.b(-20, -49152);
                                    break L36;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L37: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.b(-21, -49152);
                                    break L37;
                                  }
                                }
                                break L12;
                              }
                              var5++;
                              if (var12 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        stackOut_69_0 = param1.a((byte) -66, var4);
                        stackIn_70_0 = stackOut_69_0;
                        break L10;
                      }
                      var17.c(-19822);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L38: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_72_0 = (RuntimeException) (var2);
                stackOut_72_1 = new StringBuilder().append("nf.GB(").append(param0).append(',');
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param1 == null) {
                  stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L38;
                } else {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "{...}";
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  break L38;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
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
        L0: {
          L1: {
            var2 = 0;
            if (param0 < 0) {
              break L1;
            } else {
              if (65536 > param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param0 = param0 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (param0 < 256) {
            break L2;
          } else {
            var2 += 8;
            param0 = param0 >>> 8;
            break L2;
          }
        }
        L3: {
          if ((param0 ^ -1) <= -17) {
            param0 = param0 >>> 4;
            var2 += 4;
            break L3;
          } else {
            break L3;
          }
        }
        if (param1) {
          L4: {
            if (param0 < 4) {
              break L4;
            } else {
              param0 = param0 >>> 2;
              var2 += 2;
              break L4;
            }
          }
          L5: {
            if (param0 < 1) {
              break L5;
            } else {
              var2++;
              param0 = param0 >>> 1;
              break L5;
            }
          }
          return param0 + var2;
        } else {
          return 95;
        }
    }

    final static short[] a(boolean param0, hb param1, int param2, short[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_20_0 = null;
        short[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_19_0 = null;
        short[] stackOut_22_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
                    if ((param3.length ^ -1) != (var4_int ^ -1)) {
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
                L5: {
                  L6: {
                    var5 = param1.f(8, 4);
                    var6 = (short)param1.f(8, 16);
                    if ((var5 ^ -1) < -1) {
                      break L6;
                    } else {
                      var7 = 0;
                      L7: while (true) {
                        L8: {
                          if (var4_int <= var7) {
                            break L8;
                          } else {
                            param3[var7] = (short)var6;
                            var7++;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L9: while (true) {
                    if (var4_int <= var7) {
                      break L5;
                    } else {
                      stackOut_19_0 = (short[]) (param3);
                      stackIn_23_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        stackIn_20_0[var7] = (short)(var6 + param1.f(8, var5));
                        var7++;
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_22_0 = (short[]) (param3);
                stackIn_23_0 = stackOut_22_0;
                break L4;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("nf.EA(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_23_0;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        ge.a(6 + param1, param2 - -35, this.field_l + -12, -40 + this.field_p, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (!param0) {
          var7 = 0;
          var8 = param2;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 <= var7) {
                  break L2;
                } else {
                  stackOut_4_0 = var8;
                  stackOut_4_1 = ge.field_f;
                  stackIn_32_0 = stackOut_4_0;
                  stackIn_32_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var16 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0 < stackIn_5_1) {
                        break L3;
                      } else {
                        if (ge.field_k <= var8) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              var9 = var5 + var7 * (-var5 + var6) / var4;
                              var10 = 0;
                              var11 = this.field_l;
                              if (-21 <= (var7 ^ -1)) {
                                L6: while (true) {
                                  if ((var10 ^ -1) < -21) {
                                    break L5;
                                  } else {
                                    var12 = (20 + -var7) * (-var7 + 20) + (-var10 + 20) * (-var10 + 20);
                                    stackOut_10_0 = var12 ^ -1;
                                    stackOut_10_1 = -463;
                                    stackIn_18_0 = stackOut_10_0;
                                    stackIn_18_1 = stackOut_10_1;
                                    stackIn_11_0 = stackOut_10_0;
                                    stackIn_11_1 = stackOut_10_1;
                                    if (var16 != 0) {
                                      break L4;
                                    } else {
                                      L7: {
                                        L8: {
                                          if (stackIn_11_0 >= stackIn_11_1) {
                                            break L8;
                                          } else {
                                            if (var16 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        if (var12 < 420) {
                                          break L5;
                                        } else {
                                          var13 = (462 + -var12) * var9 / 42;
                                          var13 = var13 | (var13 << 446319696 | var13 << -838844024);
                                          ge.field_i[var10 + var8 * ge.field_h + param1] = var13;
                                          break L7;
                                        }
                                      }
                                      var10++;
                                      if (var16 == 0) {
                                        continue L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            stackOut_17_0 = var7 ^ -1;
                            stackOut_17_1 = -21;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L4;
                          }
                          L9: {
                            L10: {
                              if (stackIn_18_0 < stackIn_18_1) {
                                break L10;
                              } else {
                                var12 = var11;
                                var11 -= 21;
                                var13 = 0;
                                L11: while (true) {
                                  L12: {
                                    if (var13 > 20) {
                                      break L12;
                                    } else {
                                      var14 = (-var7 + 20) * (20 - var7) + var13 * var13;
                                      stackOut_21_0 = -463;
                                      stackOut_21_1 = var14 ^ -1;
                                      stackIn_29_0 = stackOut_21_0;
                                      stackIn_29_1 = stackOut_21_1;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackIn_22_1 = stackOut_21_1;
                                      if (var16 != 0) {
                                        break L9;
                                      } else {
                                        if (stackIn_22_0 > stackIn_22_1) {
                                          break L12;
                                        } else {
                                          L13: {
                                            L14: {
                                              if (420 <= var14) {
                                                break L14;
                                              } else {
                                                var12 = var11 - -1;
                                                if (var16 == 0) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            var15 = var9 * (462 + -var14) / 42;
                                            var15 = var15 | (var15 << 223973264 | var15 << -1223379096);
                                            ge.field_i[var11 + ge.field_h * var8 + param1] = var15;
                                            break L13;
                                          }
                                          var11++;
                                          var13++;
                                          if (var16 == 0) {
                                            continue L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var11 = var12;
                                  break L10;
                                }
                              }
                            }
                            var9 = var9 | (var9 << -1122122416 | var9 << -1360539448);
                            stackOut_28_0 = param1 + var10;
                            stackOut_28_1 = var8;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            break L9;
                          }
                          ge.a(stackIn_29_0, stackIn_29_1, var11 + -var10, var9);
                          break L3;
                        }
                      }
                    }
                    var8++;
                    var7++;
                    if (var16 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4 = 22;
              var5 = 194;
              var6 = 169;
              var7 = 0;
              stackOut_31_0 = param2;
              stackOut_31_1 = -35;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              break L1;
            }
            var8 = stackIn_32_0 - stackIn_32_1;
            L15: while (true) {
              L16: {
                L17: {
                  if (var4 <= var7) {
                    break L17;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << -1147390800 | var9 << 1837289992);
                    ge.a(param1, var8, 6, var9);
                    ge.a(param1 - -this.field_l + -6, var8, 6, var9);
                    var8++;
                    var7++;
                    if (var16 != 0) {
                      break L16;
                    } else {
                      if (var16 == 0) {
                        continue L15;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                af.field_e.c(this.field_l + param1 + -90, 10 + param2);
                qb.a(param2 - -35, pe.field_a, (byte) -108, 5 + param1, this.field_l - 10);
                qb.a(-22 + param2 + this.field_p, ra.field_Z, (byte) -109, param1, this.field_l);
                var6 = 127;
                var5 = 169;
                var4 = -79 + this.field_p;
                var7 = 0;
                break L16;
              }
              var8 = 57 + param2;
              L18: while (true) {
                L19: {
                  if (var7 >= var4) {
                    break L19;
                  } else {
                    var9 = var5 + (var6 + -var5) * var7 / var4;
                    var9 = var9 | (var9 << -1939856496 | var9 << 673181288);
                    ge.a(param1, var8, 6, var9);
                    ge.a(-6 + (this.field_l + param1), var8, 6, var9);
                    var7++;
                    var8++;
                    if (var16 != 0) {
                      break L19;
                    } else {
                      if (var16 == 0) {
                        continue L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean b(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = this.k(-110);
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
        int discarded$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param0 == -23913) {
            break L0;
          } else {
            discarded$4 = nf.a(-124, true);
            break L0;
          }
        }
        L1: {
          if ((this.field_K ^ -1) < -1) {
            L2: {
              L3: {
                var2 = this.field_J;
                var3 = this.field_I;
                fieldTemp$5 = this.field_L + 1;
                this.field_L = this.field_L + 1;
                if ((this.field_K ^ -1) < (fieldTemp$5 ^ -1)) {
                  break L3;
                } else {
                  this.field_K = 0;
                  this.e((byte) 10);
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = (this.field_K * 2 + -this.field_L) * this.field_L;
              var5 = this.field_K * this.field_K;
              var3 = var4 * (-this.field_H + this.field_I) / var5 + this.field_H;
              var2 = this.field_G + var4 * (-this.field_G + this.field_J) / var5;
              break L2;
            }
            this.a(var3, (byte) 115, var2);
            break L1;
          } else {
            break L1;
          }
        }
        return super.k(-23913);
    }

    static {
        field_N = 0;
        field_E = "Back";
    }
}
