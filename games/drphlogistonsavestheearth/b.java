/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends gi {
    static int field_h;
    static he field_k;
    int field_n;
    static sa field_i;
    static int field_m;
    int field_j;
    static int field_l;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -382) {
            b.a(true, 23);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static void e(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                if (param0 <= -115) {
                  break L0;
                } else {
                  b.a(-17, 112);
                  break L0;
                }
              }
              var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1 != null) {
                try {
                  L1: {
                    var2 = Runtime.getRuntime();
                    var4 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                    pe.field_g = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1) {
        int var2 = 85 % ((-66 - param0) / 36);
        return param1 == (param1 & -param1) ? true : false;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            if (param0 < -107) {
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackIn_70_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 <= 0) {
                          break L4;
                        } else {
                          if (128 > var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var5 < 160) {
                          break L5;
                        } else {
                          if (var5 > 255) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (var5 != 8364) {
                        if (var5 != 8218) {
                          if (var5 == 402) {
                            var3[var4] = (byte)-125;
                            break L2;
                          } else {
                            if (var5 != 8222) {
                              if (var5 == 8230) {
                                var3[var4] = (byte)-123;
                                break L2;
                              } else {
                                if (var5 != 8224) {
                                  if (8225 == var5) {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (710 != var5) {
                                      if (var5 == 8240) {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (352 == var5) {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var5 == 8249) {
                                            var3[var4] = (byte)-117;
                                            break L2;
                                          } else {
                                            if (338 != var5) {
                                              if (var5 == 381) {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var5 != 8216) {
                                                  if (8217 != var5) {
                                                    if (8220 != var5) {
                                                      if (var5 != 8221) {
                                                        if (var5 != 8226) {
                                                          if (var5 != 8211) {
                                                            if (var5 != 8212) {
                                                              if (732 == var5) {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 353) {
                                                                    if (8250 != var5) {
                                                                      if (var5 == 339) {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 == 376) {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                }
                              }
                            } else {
                              var3[var4] = (byte)-124;
                              break L2;
                            }
                          }
                        } else {
                          var3[var4] = (byte)-126;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte)-128;
                        break L2;
                      }
                    }
                    var3[var4] = (byte)var5;
                    break L2;
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var2);

            stackIn_73_1 = new StringBuilder().append("b.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static og a(boolean param0, int param1) {
        og var2;
        og stackIn_3_0 = null;
        og stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        og stackIn_7_0 = null;
        og stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 < 24) {
          L0: {
            field_i = (sa) null;
            var2 = new og(true);
            stackIn_7_0 = (og) (var2);

            if (!param0) {
              stackIn_8_0 = (og) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (og) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_d = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new og(true);
            stackIn_3_0 = (og) (var2);

            if (!param0) {
              stackIn_4_0 = (og) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (og) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    private b() throws Throwable {
        throw new Error();
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        nj var5 = null;
        byte[] var6 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 > 0) {
              L1: {
                if (0 >= param0) {
                  var4 = param2;
                  break L1;
                } else {
                  var8 = new byte[param3];
                  var4 = var8;
                  var5_int = 0;
                  L2: while (true) {
                    if (param3 <= var5_int) {
                      break L1;
                    } else {
                      var8[var5_int] = param2[param0 + var5_int];
                      var5_int++;
                      continue L2;
                    }
                  }
                }
              }
              var5 = new nj();
              var5.a(true);
              var5.a((byte) -115, var4, (long)(param3 * 8));
              var6 = new byte[64];
              var5.a(0, (byte) -114, var6);
              stackIn_10_0 = (byte[]) (var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("b.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_m = 9;
        field_l = 0;
        field_i = new sa(9, 0, 4, 1);
    }
}
