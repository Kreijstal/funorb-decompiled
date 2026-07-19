/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static int field_b;
    static cc field_a;

    final static void a(dl param0, int param1) {
        try {
            RuntimeException var2 = null;
            bb var2_ref = null;
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
            java.lang.reflect.Method var7_ref = null;
            int var8_int = 0;
            byte[][] var8 = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            Object stackIn_6_0 = null;
            Object stackIn_35_0 = null;
            int stackIn_39_0 = 0;
            int stackIn_101_0 = 0;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object stackOut_5_0 = null;
            Object stackOut_33_0 = null;
            int stackOut_38_0 = 0;
            int stackOut_100_0 = 0;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            String stackOut_104_2 = null;
            var12 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                var2_ref = (bb) ((Object) av.field_c.d(param1 + 268410723));
                if (var2_ref != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        L4: {
                          if ((var4 ^ -1) <= (var2_ref.field_g ^ -1)) {
                            break L4;
                          } else {
                            stackOut_5_0 = null;
                            stackIn_35_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (var12 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_6_0 == var2_ref.field_f[var4]) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var2_ref.field_f[var4].field_a ^ -1) == -3) {
                                      var2_ref.field_e[var4] = -5;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  if ((var2_ref.field_f[var4].field_a ^ -1) != -1) {
                                    break L5;
                                  } else {
                                    var3 = 1;
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                if (null != var2_ref.field_h[var4]) {
                                  L8: {
                                    if ((var2_ref.field_h[var4].field_a ^ -1) != -3) {
                                      break L8;
                                    } else {
                                      var2_ref.field_e[var4] = -6;
                                      break L8;
                                    }
                                  }
                                  if (-1 == (var2_ref.field_h[var4].field_a ^ -1)) {
                                    var3 = 1;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              var4++;
                              if (var12 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if (var3 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var4 = param0.field_g;
                          if (param1 == 24732) {
                            break L2;
                          } else {
                            stackOut_33_0 = null;
                            stackIn_35_0 = stackOut_33_0;
                            break L3;
                          }
                        }
                      }
                      field_a = (cc) ((Object) stackIn_35_0);
                      break L2;
                    }
                    param0.a((byte) 87, var2_ref.field_j);
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (var5 >= var2_ref.field_g) {
                            break L11;
                          } else {
                            stackOut_38_0 = 0;
                            stackIn_101_0 = stackOut_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            if (var12 != 0) {
                              break L10;
                            } else {
                              L12: {
                                L13: {
                                  if (stackIn_39_0 == var2_ref.field_e[var5]) {
                                    break L13;
                                  } else {
                                    param0.b(param1 ^ -1336888268, var2_ref.field_e[var5]);
                                    if (var12 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                try {
                                  L14: {
                                    L15: {
                                      L16: {
                                        var6_int = var2_ref.field_l[var5];
                                        if (-1 != (var6_int ^ -1)) {
                                          break L16;
                                        } else {
                                          var7 = (java.lang.reflect.Field) (var2_ref.field_f[var5].field_f);
                                          var8_int = var7.getInt((Object) null);
                                          param0.b(-1336879960, 0);
                                          param0.a((byte) 90, var8_int);
                                          if (var12 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (1 != var6_int) {
                                          break L17;
                                        } else {
                                          var7 = (java.lang.reflect.Field) (var2_ref.field_f[var5].field_f);
                                          var7.setInt((Object) null, var2_ref.field_i[var5]);
                                          param0.b(-1336879960, 0);
                                          if (var12 == 0) {
                                            break L15;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      if (-3 != (var6_int ^ -1)) {
                                        break L15;
                                      } else {
                                        var7 = (java.lang.reflect.Field) (var2_ref.field_f[var5].field_f);
                                        var8_int = var7.getModifiers();
                                        param0.b(-1336879960, 0);
                                        param0.a((byte) 28, var8_int);
                                        break L15;
                                      }
                                    }
                                    L18: {
                                      L19: {
                                        if (3 == var6_int) {
                                          break L19;
                                        } else {
                                          if (var6_int == 4) {
                                            var7_ref = (java.lang.reflect.Method) (var2_ref.field_h[var5].field_f);
                                            var8_int = var7_ref.getModifiers();
                                            param0.b(param1 + -1336904692, 0);
                                            param0.a((byte) 65, var8_int);
                                            if (var12 == 0) {
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var7_ref = (java.lang.reflect.Method) (var2_ref.field_h[var5].field_f);
                                      var8 = var2_ref.field_k[var5];
                                      var9 = new Object[var8.length];
                                      var10_int = 0;
                                      L20: while (true) {
                                        L21: {
                                          if ((var10_int ^ -1) <= (var8.length ^ -1)) {
                                            break L21;
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var8[var10_int])));
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
                                          var10 = var7_ref.invoke((Object) null, var9);
                                          if (var10 != null) {
                                            break L22;
                                          } else {
                                            param0.b(-1336879960, 0);
                                            if (var12 == 0) {
                                              break L18;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        L23: {
                                          if (var10 instanceof Number) {
                                            break L23;
                                          } else {
                                            L24: {
                                              if (var10 instanceof String) {
                                                break L24;
                                              } else {
                                                param0.b(-1336879960, 4);
                                                if (var12 == 0) {
                                                  break L18;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                            param0.b(-1336879960, 2);
                                            param0.a(-47, (String) (var10));
                                            if (var12 == 0) {
                                              break L18;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        param0.b(-1336879960, 1);
                                        param0.b((byte) -102, ((Number) (var10)).longValue());
                                        break L18;
                                      }
                                    }
                                    break L14;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L25: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -10);
                                    break L25;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L26: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -11);
                                    break L26;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L27: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -12);
                                    break L27;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L28: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.b(param1 + -1336904692, -13);
                                    break L28;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L29: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -14);
                                    break L29;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L30: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -15);
                                    break L30;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L31: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -16);
                                    break L31;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L32: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -17);
                                    break L32;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L33: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -18);
                                    break L33;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L34: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -19);
                                    break L34;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L35: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.b(-1336879960, -20);
                                    break L35;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L36: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.b(-1336879960, -21);
                                    break L36;
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
                        stackOut_100_0 = param0.e(var4, 56);
                        stackIn_101_0 = stackOut_100_0;
                        break L10;
                      }
                      var2_ref.c(-125);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L37: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_103_0 = (RuntimeException) (var2);
                stackOut_103_1 = new StringBuilder().append("hb.C(");
                stackIn_106_0 = stackOut_103_0;
                stackIn_106_1 = stackOut_103_1;
                stackIn_104_0 = stackOut_103_0;
                stackIn_104_1 = stackOut_103_1;
                if (param0 == null) {
                  stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
                  stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackOut_106_2 = "null";
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  stackIn_107_2 = stackOut_106_2;
                  break L37;
                } else {
                  stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
                  stackOut_104_2 = "{...}";
                  stackIn_107_0 = stackOut_104_0;
                  stackIn_107_1 = stackOut_104_1;
                  stackIn_107_2 = stackOut_104_2;
                  break L37;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_107_0), stackIn_107_2 + ',' + param1 + ')');
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ha param7, byte param8, pa[] param9) {
        RuntimeException var10 = null;
        bo var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        String stackIn_122_2 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        var28 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var10_ref = fa.a(param7, true);
            if (param9 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if (-1 <= (param6 ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (null == param9[3]) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L2;
                      } else {
                        stackOut_13_0 = param9[3].d();
                        stackIn_16_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                    L3: {
                      var11 = stackIn_16_0;
                      if (param9[5] == null) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L3;
                      } else {
                        stackOut_17_0 = param9[5].d();
                        stackIn_20_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    L4: {
                      var12 = stackIn_20_0;
                      if (null == param9[1]) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L4;
                      } else {
                        stackOut_21_0 = param9[1].c();
                        stackIn_24_0 = stackOut_21_0;
                        break L4;
                      }
                    }
                    L5: {
                      var13 = stackIn_24_0;
                      if (param9[7] != null) {
                        stackOut_27_0 = param9[7].c();
                        stackIn_28_0 = stackOut_27_0;
                        break L5;
                      } else {
                        stackOut_25_0 = 0;
                        stackIn_28_0 = stackOut_25_0;
                        break L5;
                      }
                    }
                    L6: {
                      var14 = stackIn_28_0;
                      var15 = param2 - -param5;
                      var16 = param0 + param6;
                      var17 = var11 + param2;
                      var18 = var15 + -var12;
                      var19 = var13 + param0;
                      var21 = 49 / ((7 - param8) / 47);
                      var20 = var16 - var14;
                      var22 = var17;
                      var23 = var18;
                      if ((var23 ^ -1) <= (var22 ^ -1)) {
                        break L6;
                      } else {
                        var23 = param5 * var11 / (var12 + var11) + param2;
                        var22 = param5 * var11 / (var12 + var11) + param2;
                        break L6;
                      }
                    }
                    L7: {
                      var24 = var19;
                      var25 = var20;
                      if ((var24 ^ -1) < (var25 ^ -1)) {
                        var25 = var13 * param6 / (var14 + var13) + param0;
                        var24 = var13 * param6 / (var14 + var13) + param0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null == param9[0]) {
                        break L8;
                      } else {
                        var10_ref.a(var22, param2, var24, param0, 77);
                        param9[0].a(param2, param0, param3, param1, param4);
                        var10_ref.a(true);
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param9[2]) {
                        var10_ref.a(var15, var23, var24, param0, 84);
                        param9[2].a(var18, param0, param3, param1, param4);
                        var10_ref.a(true);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param9[6] != null) {
                        var10_ref.a(var22, param2, var16, var25, -99);
                        param9[6].a(param2, var20, param3, param1, param4);
                        var10_ref.a(true);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param9[8]) {
                        break L11;
                      } else {
                        var10_ref.a(var15, var23, var16, var25, 118);
                        param9[8].a(var18, var20, param3, param1, param4);
                        var10_ref.a(true);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param9[1]) {
                        break L12;
                      } else {
                        if (-1 != (param9[1].d() ^ -1)) {
                          var10_ref.a(var23, var22, var24, param0, 76);
                          var26 = var17;
                          L13: while (true) {
                            L14: {
                              if ((var18 ^ -1) >= (var26 ^ -1)) {
                                break L14;
                              } else {
                                param9[1].a(var26, param0, param3, param1, param4);
                                var26 = var26 + param9[1].d();
                                if (var28 != 0) {
                                  break L12;
                                } else {
                                  if (var28 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var10_ref.a(true);
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L15: {
                      if (null == param9[7]) {
                        break L15;
                      } else {
                        if (-1 == (param9[7].d() ^ -1)) {
                          break L15;
                        } else {
                          var10_ref.a(var23, var22, var16, var25, 121);
                          var26 = var17;
                          L16: while (true) {
                            L17: {
                              if ((var18 ^ -1) >= (var26 ^ -1)) {
                                break L17;
                              } else {
                                param9[7].a(var26, var20, param3, param1, param4);
                                var26 = var26 + param9[7].d();
                                if (var28 != 0) {
                                  break L15;
                                } else {
                                  if (var28 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            var10_ref.a(true);
                            break L15;
                          }
                        }
                      }
                    }
                    L18: {
                      if (param9[3] == null) {
                        break L18;
                      } else {
                        if (0 == param9[3].c()) {
                          break L18;
                        } else {
                          var10_ref.a(var22, param2, var25, var24, -112);
                          var26 = var19;
                          L19: while (true) {
                            L20: {
                              if (var26 >= var20) {
                                break L20;
                              } else {
                                param9[3].a(param2, var26, param3, param1, param4);
                                var26 = var26 + param9[3].c();
                                if (var28 != 0) {
                                  break L18;
                                } else {
                                  if (var28 == 0) {
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            var10_ref.a(true);
                            break L18;
                          }
                        }
                      }
                    }
                    L21: {
                      if (null == param9[5]) {
                        break L21;
                      } else {
                        if (-1 != (param9[5].c() ^ -1)) {
                          var10_ref.a(var15, var23, var25, var24, 100);
                          var26 = var19;
                          L22: while (true) {
                            L23: {
                              if (var20 <= var26) {
                                break L23;
                              } else {
                                param9[5].a(var18, var26, param3, param1, param4);
                                var26 = var26 + param9[5].c();
                                if (var28 != 0) {
                                  break L21;
                                } else {
                                  if (var28 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            var10_ref.a(true);
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                    }
                    L24: {
                      if (param9[4] == null) {
                        break L24;
                      } else {
                        if (0 == param9[4].d()) {
                          break L24;
                        } else {
                          if ((param9[4].c() ^ -1) != -1) {
                            var10_ref.a(var23, var22, var25, var24, 93);
                            var26 = var19;
                            L25: while (true) {
                              L26: {
                                if (var26 >= var20) {
                                  break L26;
                                } else {
                                  if (var28 != 0) {
                                    break L24;
                                  } else {
                                    var27 = var17;
                                    L27: while (true) {
                                      L28: {
                                        L29: {
                                          if (var27 >= var18) {
                                            break L29;
                                          } else {
                                            param9[4].a(var27, var26, param3, param1, param4);
                                            var27 = var27 + param9[4].d();
                                            if (var28 != 0) {
                                              break L28;
                                            } else {
                                              if (var28 == 0) {
                                                continue L27;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                        var26 = var26 + param9[4].c();
                                        break L28;
                                      }
                                      if (var28 == 0) {
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                              var10_ref.a(true);
                              break L24;
                            }
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var10 = decompiledCaughtException;
            stackOut_118_0 = (RuntimeException) (var10);
            stackOut_118_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_121_0 = stackOut_118_0;
            stackIn_121_1 = stackOut_118_1;
            stackIn_119_0 = stackOut_118_0;
            stackIn_119_1 = stackOut_118_1;
            if (param7 == null) {
              stackOut_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackOut_121_1 = (StringBuilder) ((Object) stackIn_121_1);
              stackOut_121_2 = "null";
              stackIn_122_0 = stackOut_121_0;
              stackIn_122_1 = stackOut_121_1;
              stackIn_122_2 = stackOut_121_2;
              break L30;
            } else {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "{...}";
              stackIn_122_0 = stackOut_119_0;
              stackIn_122_1 = stackOut_119_1;
              stackIn_122_2 = stackOut_119_2;
              break L30;
            }
          }
          L31: {
            stackOut_122_0 = (RuntimeException) ((Object) stackIn_122_0);
            stackOut_122_1 = ((StringBuilder) (Object) stackIn_122_1).append(stackIn_122_2).append(',').append(param8).append(',');
            stackIn_125_0 = stackOut_122_0;
            stackIn_125_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param9 == null) {
              stackOut_125_0 = (RuntimeException) ((Object) stackIn_125_0);
              stackOut_125_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L31;
            } else {
              stackOut_123_0 = (RuntimeException) ((Object) stackIn_123_0);
              stackOut_123_1 = (StringBuilder) ((Object) stackIn_123_1);
              stackOut_123_2 = "{...}";
              stackIn_126_0 = stackOut_123_0;
              stackIn_126_1 = stackOut_123_1;
              stackIn_126_2 = stackOut_123_2;
              break L31;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_126_0), stackIn_126_2 + ')');
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

    public static void a(int param0) {
        if (param0 != -12029) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hb.B(" + param0 + ')');
        }
    }

    static {
    }
}
