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
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
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
        int var16 = 0;
        byte[] var17 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var25 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          L1: {
            var16 = TombRacer.field_G ? 1 : 0;
            if (null == this.field_f) {
              L2: {
                if (null != ui.field_c) {
                  break L2;
                } else {
                  var25 = gaa.a(4.0f, 16.0f, 128, new tda(419684), 8, 128, 0.5f, 16, 4, 4.0f, 0.6000000238418579f);
                  ui.field_c = bw.a(270, var25, false);
                  break L2;
                }
              }
              var22 = ir.a(ui.field_c, 13588, false);
              var19 = var22;
              var17 = var19;
              var2_ref_byte__ = var17;
              var23 = new byte[var22.length * 4];
              var20 = var23;
              var3 = var20;
              var4 = 0;
              var5 = 0;
              L3: while (true) {
                stackOut_5_0 = 16;
                stackIn_6_0 = stackOut_5_0;
                L4: while (true) {
                  L5: {
                    if (stackIn_6_0 <= var5) {
                      break L5;
                    } else {
                      var6 = 16384 * var5;
                      var7 = var6;
                      stackOut_7_0 = 0;
                      stackIn_21_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var16 != 0) {
                        break L0;
                      } else {
                        var8 = stackIn_8_0;
                        L6: while (true) {
                          L7: {
                            if (-129 >= (var8 ^ -1)) {
                              break L7;
                            } else {
                              var9 = 128 * var8 + var7;
                              var10 = var7 - -((127 & var8 + -1) * 128);
                              var11 = var7 - -((127 & var8 - -1) * 128);
                              stackOut_10_0 = 0;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var16 != 0) {
                                continue L4;
                              } else {
                                var12 = stackIn_11_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      if (128 <= var12) {
                                        break L10;
                                      } else {
                                        var13 = (float)((var17[var12 + var10] & 255) + -(255 & var17[var12 + var11]));
                                        var14 = (float)((var2_ref_byte__[(127 & var12 + -1) + var9] & 255) - (255 & var2_ref_byte__[var9 - -(127 & 1 + var12)]));
                                        var15 = (float)(128.0 / Math.sqrt((double)(var14 * var14 + 16384.0f + var13 * var13)));
                                        incrementValue$5 = var4;
                                        var4++;
                                        var3[incrementValue$5] = (byte)(int)(127.0f + var14 * var15);
                                        incrementValue$6 = var4;
                                        var4++;
                                        var3[incrementValue$6] = (byte)(int)(128.0f * var15 + 127.0f);
                                        incrementValue$7 = var4;
                                        var4++;
                                        var3[incrementValue$7] = (byte)(int)(var15 * var13 + 127.0f);
                                        incrementValue$8 = var4;
                                        var4++;
                                        incrementValue$9 = var6;
                                        var6++;
                                        var3[incrementValue$8] = var17[incrementValue$9];
                                        var12++;
                                        if (var16 != 0) {
                                          break L9;
                                        } else {
                                          if (var16 == 0) {
                                            continue L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    var8++;
                                    break L9;
                                  }
                                  if (var16 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          if (var16 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  this.field_f = this.field_b.a(var23, gpa.field_a, (byte) -41, 128, 128, 16);
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_20_0 = -20 % ((23 - param0) / 48);
          stackIn_21_0 = stackOut_20_0;
          break L0;
        }
        L11: {
          var2 = stackIn_21_0;
          if (null == this.field_f) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L11;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L11;
          }
        }
        return stackIn_24_0 != 0;
    }

    final static void a(boolean param0, kh param1) {
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
            int stackIn_29_0 = 0;
            int stackIn_29_1 = 0;
            int stackIn_71_0 = 0;
            int stackIn_71_1 = 0;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            String stackIn_77_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_28_0 = 0;
            int stackOut_28_1 = 0;
            boolean stackOut_70_0 = false;
            int stackOut_70_1 = 0;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            String stackOut_76_2 = null;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            String stackOut_75_2 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var12 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                var13 = (aj) ((Object) al.field_g.f(-80));
                var16 = var13;
                if (var16 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if ((var4 ^ -1) <= (var16.field_f ^ -1)) {
                          break L3;
                        } else {
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (var13.field_j[var4] != null) {
                                L5: {
                                  if (2 == var13.field_j[var4].field_b) {
                                    var13.field_m[var4] = -5;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (var13.field_j[var4].field_b == 0) {
                                  var3 = 1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (var13.field_k[var4] != null) {
                                L7: {
                                  if (var13.field_k[var4].field_b == 2) {
                                    var13.field_m[var4] = -6;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                if (var13.field_k[var4].field_b != 0) {
                                  break L6;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              } else {
                                break L6;
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
                        param1.a(var16.field_n, (byte) -59);
                        break L2;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                    var5 = 0;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var5 >= var16.field_f) {
                            break L10;
                          } else {
                            stackOut_28_0 = 0;
                            stackOut_28_1 = var13.field_m[var5];
                            stackIn_71_0 = stackOut_28_0;
                            stackIn_71_1 = stackOut_28_1;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            if (var12 != 0) {
                              break L9;
                            } else {
                              L11: {
                                L12: {
                                  if (stackIn_29_0 == stackIn_29_1) {
                                    break L12;
                                  } else {
                                    param1.i(var13.field_m[var5], 0);
                                    if (var12 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                try {
                                  L13: {
                                    L14: {
                                      L15: {
                                        var6_int = var13.field_i[var5];
                                        if ((var6_int ^ -1) == -1) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (var6_int != 1) {
                                              break L16;
                                            } else {
                                              var15 = (java.lang.reflect.Field) (var13.field_j[var5].field_f);
                                              var17 = var15;
                                              var17.setInt((Object) null, var13.field_h[var5]);
                                              param1.i(0, 0);
                                              if (var12 == 0) {
                                                break L14;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          if (var6_int != 2) {
                                            break L14;
                                          } else {
                                            var26 = (java.lang.reflect.Field) (var13.field_j[var5].field_f);
                                            var8 = var26.getModifiers();
                                            param1.i(0, 0);
                                            param1.a(var8, (byte) 126);
                                            if (var12 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var27 = (java.lang.reflect.Field) (var13.field_j[var5].field_f);
                                      var8 = var27.getInt((Object) null);
                                      param1.i(0, 0);
                                      param1.a(var8, (byte) 102);
                                      break L14;
                                    }
                                    L17: {
                                      L18: {
                                        L19: {
                                          if (-4 == (var6_int ^ -1)) {
                                            break L19;
                                          } else {
                                            if (-5 != (var6_int ^ -1)) {
                                              break L18;
                                            } else {
                                              var28 = (java.lang.reflect.Method) (var13.field_k[var5].field_f);
                                              var8 = var28.getModifiers();
                                              param1.i(0, 0);
                                              param1.a(var8, (byte) 93);
                                              if (var12 == 0) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                        }
                                        var29 = (java.lang.reflect.Method) (var13.field_k[var5].field_f);
                                        var25 = var13.field_g[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L20: while (true) {
                                          L21: {
                                            if (var25.length <= var10_int) {
                                              break L21;
                                            } else {
                                              var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                              var9[var10_int] = var11.readObject();
                                              var10_int++;
                                              if (var12 != 0) {
                                                break L18;
                                              } else {
                                                if (var12 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                          }
                                          L22: {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              break L22;
                                            } else {
                                              L23: {
                                                if (var10 instanceof Number) {
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    if (var10 instanceof String) {
                                                      break L24;
                                                    } else {
                                                      param1.i(4, 0);
                                                      if (var12 == 0) {
                                                        break L18;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                  param1.i(2, 0);
                                                  param1.a((String) (var10), false);
                                                  if (var12 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              param1.i(1, 0);
                                              param1.a(1736565456, ((Number) (var10)).longValue());
                                              if (var12 == 0) {
                                                break L18;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          param1.i(0, 0);
                                          break L17;
                                        }
                                      }
                                      break L17;
                                    }
                                    break L13;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L25: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.i(-10, 0);
                                    break L25;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L26: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.i(-11, 0);
                                    break L26;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L27: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.i(-12, 0);
                                    break L27;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L28: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.i(-13, 0);
                                    break L28;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L29: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.i(-14, 0);
                                    break L29;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L30: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.i(-15, 0);
                                    break L30;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L31: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.i(-16, 0);
                                    break L31;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L32: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.i(-17, 0);
                                    break L32;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L33: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.i(-18, 0);
                                    break L33;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L34: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.i(-19, 0);
                                    break L34;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L35: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.i(-20, 0);
                                    break L35;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L36: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.i(-21, 0);
                                    break L36;
                                  }
                                }
                                break L11;
                              }
                              var5++;
                              if (var12 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        discarded$1 = param1.g(var4, 64);
                        var16.p(75);
                        stackOut_70_0 = param0;
                        stackOut_70_1 = 1;
                        stackIn_71_0 = stackOut_70_0 ? 1 : 0;
                        stackIn_71_1 = stackOut_70_1;
                        break L9;
                      }
                      if (stackIn_71_0 == stackIn_71_1) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L37: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_74_0 = (RuntimeException) (var2);
                stackOut_74_1 = new StringBuilder().append("hk.E(").append(param0).append(',');
                stackIn_76_0 = stackOut_74_0;
                stackIn_76_1 = stackOut_74_1;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                if (param1 == null) {
                  stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
                  stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
                  stackOut_76_2 = "null";
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  stackIn_77_2 = stackOut_76_2;
                  break L37;
                } else {
                  stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
                  stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
                  stackOut_75_2 = "{...}";
                  stackIn_77_0 = stackOut_75_0;
                  stackIn_77_1 = stackOut_75_1;
                  stackIn_77_2 = stackOut_75_2;
                  break L37;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ')');
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
        lv discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var4 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
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
              L4: {
                L5: {
                  tra.g(12890);
                  if (!this.field_g) {
                    break L5;
                  } else {
                    var15 = ir.a(ak.field_o, 13588, false);
                    this.field_c = this.field_b.a(var15, wo.field_i, (byte) -97, 128, 128, 16);
                    var16 = ir.a(lt.field_f, 13588, false);
                    discarded$1 = this.field_b.a(var16, wo.field_i, (byte) -84, 128, 128, 16);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_d = new gf[16];
                var2_int = 0;
                L6: while (true) {
                  L7: {
                    L8: {
                      if (-17 >= (var2_int ^ -1)) {
                        break L8;
                      } else {
                        var17 = ua.a(ak.field_o, 32768, 32768 * var2_int, false);
                        this.field_d[var2_int] = this.field_b.a(128, var17, true, wo.field_i, -117, 128);
                        var2_int++;
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    this.field_a = new gf[16];
                    break L7;
                  }
                  var2_int = 0;
                  L9: while (true) {
                    if (16 <= var2_int) {
                      break L4;
                    } else {
                      var18 = ua.a(lt.field_f, 32768, var2_int * 32768, false);
                      this.field_a[var2_int] = this.field_b.a(128, var18, true, wo.field_i, -77, 128);
                      var2_int++;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          continue L9;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("hk.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        int incrementValue$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
              if ((param2 ^ -1) <= (param0 ^ -1)) {
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
                  L5: {
                    L6: {
                      if (var11 >= param0) {
                        break L6;
                      } else {
                        stackOut_9_0 = (((long)(var11 & var10) + var7 ^ -1L) < (param1[var11] ^ -1L) ? -1 : (((long)(var11 & var10) + var7 ^ -1L) == (param1[var11] ^ -1L) ? 0 : 1));
                        stackIn_14_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var15 != 0) {
                          break L5;
                        } else {
                          L7: {
                            if (stackIn_10_0 >= 0) {
                              break L7;
                            } else {
                              var12 = param1[var11];
                              param1[var11] = param1[var6];
                              param1[var6] = var12;
                              var14 = param3[var11];
                              param3[var11] = param3[var6];
                              incrementValue$1 = var6;
                              var6++;
                              param3[incrementValue$1] = var14;
                              break L7;
                            }
                          }
                          var11++;
                          if (var15 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    param1[param0] = param1[var6];
                    param1[var6] = var7;
                    param3[param0] = param3[var6];
                    param3[var6] = var9;
                    hk.a(-1 + var6, param1, param2, param3, -2646);
                    stackOut_13_0 = param0;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  }
                  hk.a(stackIn_14_0, param1, 1 + var6, param3, -2646);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("hk.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          L9: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
    }

    static {
    }
}
