/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld {
    static int field_d;
    static int[] field_a;
    static int field_e;
    static ci field_c;
    static int[] field_h;
    static boolean field_b;
    em[] field_f;
    static String field_g;

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 5859) {
              L1: {
                L2: {
                  if (((ld) this).field_f == null) {
                    break L2;
                  } else {
                    if (0 < ((ld) this).field_f.length) {
                      stackOut_9_0 = ((ld) this).field_f[-1 + ((ld) this).field_f.length].field_a - ((ld) this).field_f[0].field_e;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = -6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ld.K(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final static int a(char param0, CharSequence param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= var4) {
                    break L3;
                  } else {
                    stackOut_6_0 = ~param0;
                    stackIn_14_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_7_0 != ~param1.charAt(var5)) {
                          break L4;
                        } else {
                          var3_int++;
                          break L4;
                        }
                      }
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = var3_int;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ld.H(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 124 + ')');
        }
        return stackIn_14_0;
    }

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = 0;
            if (param1) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7 <= var8) {
                      break L3;
                    } else {
                      var9 = param0.charAt(var8);
                      stackOut_5_0 = var9;
                      stackOut_5_1 = 60;
                      stackIn_25_0 = stackOut_5_0;
                      stackIn_25_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_6_0 == stackIn_6_1) {
                              break L5;
                            } else {
                              L6: {
                                if (var9 != 62) {
                                  break L6;
                                } else {
                                  var6 = 0;
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              if (var6 != 0) {
                                break L4;
                              } else {
                                if (var9 == 32) {
                                  var5_int++;
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var6 = 1;
                          break L4;
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackOut_24_1 = var5_int;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L2;
                }
                if (stackIn_25_0 < stackIn_25_1) {
                  stackOut_27_0 = (param2 - param3 << 8) / var5_int;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0;
                } else {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 100;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("ld.F(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_30_0;
    }

    final int a(int param0, int param1) {
        em[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var3 = ((ld) this).field_f;
            var4 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3.length >= ~var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackOut_3_0 = var5.field_d.length;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 > param0) {
                        stackOut_9_0 = var5.field_d[param0];
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0;
                      } else {
                        param0 = param0 - (var5.field_d.length + -1);
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3_ref, "ld.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    public static void a() {
        try {
            field_g = null;
            field_h = null;
            int var1_int = 0;
            field_c = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ld.D(" + -115 + ')');
        }
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        em[] var3 = null;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                var2_int = -1;
                if (null != ((ld) this).field_f) {
                  var3 = ((ld) this).field_f;
                  var4 = 0;
                  L2: while (true) {
                    if (~var3.length >= ~var4) {
                      break L1;
                    } else {
                      L3: {
                        var5 = var3[var4];
                        if (null == var5) {
                          break L3;
                        } else {
                          var6 = var5.b(-1);
                          if (~var6 < ~var2_int) {
                            var2_int = var6;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_15_0 = var2_int;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = 25;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "ld.C(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        em var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (((ld) this).field_f.length <= var3_int) {
                    break L3;
                  } else {
                    var4 = ((ld) this).field_f[var3_int];
                    stackOut_3_0 = ~var4.field_d.length;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 >= ~param0) {
                        param0 = param0 - (-1 + var4.field_d.length);
                        var3_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_7_0 = var3_int;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      }
                    }
                  }
                }
                stackOut_10_0 = ((ld) this).field_f.length;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "ld.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              fg.field_e = param1;
              bm.a(12, (byte) 1);
              if (param0 == -29) {
                break L1;
              } else {
                ld.a((byte) 95, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ld.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            hl.a((byte) -93, (String) null, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "ld.G(" + 1 + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        em var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_10_0 = 0;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (null == ((ld) this).field_f) {
                break L1;
              } else {
                if (((ld) this).field_f.length == 0) {
                  break L1;
                } else {
                  if (param2 < ((ld) this).field_f[0].field_e) {
                    break L1;
                  } else {
                    if (~param2 < ~((ld) this).field_f[((ld) this).field_f.length - 1].field_a) {
                      stackOut_15_0 = -1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      L2: {
                        if (param1 == -1) {
                          break L2;
                        } else {
                          int discarded$1 = ((ld) this).a(106, 85);
                          break L2;
                        }
                      }
                      if (1 == ((ld) this).field_f.length) {
                        stackOut_23_0 = ((ld) this).field_f[0].a(param0, -119);
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      } else {
                        var4_int = 0;
                        var5 = 0;
                        L3: while (true) {
                          L4: {
                            L5: {
                              if (~((ld) this).field_f.length >= ~var5) {
                                break L5;
                              } else {
                                var6 = ((ld) this).field_f[var5];
                                stackOut_27_0 = ~param2;
                                stackIn_45_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (var8 != 0) {
                                  break L4;
                                } else {
                                  L6: {
                                    if (stackIn_28_0 > ~var6.field_e) {
                                      break L6;
                                    } else {
                                      if (~var6.field_a <= ~param2) {
                                        var7 = var6.a(param0, -118);
                                        if (var7 == -1) {
                                          stackOut_39_0 = -1;
                                          stackIn_40_0 = stackOut_39_0;
                                          return stackIn_40_0;
                                        } else {
                                          stackOut_41_0 = var4_int + var7;
                                          stackIn_42_0 = stackOut_41_0;
                                          return stackIn_42_0;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var4_int = var4_int + (-1 + var6.field_d.length);
                                  var5++;
                                  if (var8 == 0) {
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            stackOut_44_0 = -1;
                            stackIn_45_0 = stackOut_44_0;
                            break L4;
                          }
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_10_0 = -1;
            stackIn_11_0 = stackOut_10_0;
            return stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "ld.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_45_0;
    }

    final static void a(int param0, boolean param1, ee param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_43_0 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = je.a(-101, 3 * (-param3 + param0));
              var6 = 3 * param3;
              var7 = var5_int + -10;
              int discarded$2 = -3;
              am.g();
              if (param2.field_I <= 0) {
                break L1;
              } else {
                if (param2.field_f != null) {
                  int discarded$3 = 87;
                  sd.a();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ae.field_I = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param2.field_l >= ~var8) {
                    break L4;
                  } else {
                    var9 = param2.field_E[var8];
                    var10 = param2.field_n[var8];
                    var11 = param2.field_p[var8];
                    stackOut_10_0 = 0;
                    stackIn_44_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_11_0 == 0) {
                            break L6;
                          } else {
                            var12 = gm.field_l[var9];
                            var13 = nb.field_c[var9];
                            var14 = gm.field_l[var10] - var12;
                            var15 = -var12 + gm.field_l[var11];
                            var16 = nb.field_c[var10] - var13;
                            var17 = nb.field_c[var11] - var13;
                            if (0 <= -(var16 * var15) + var14 * var17) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var12 = gd.field_e[var9];
                        if (var12 == -2147483648) {
                          break L5;
                        } else {
                          var13 = gd.field_e[var10];
                          if (var13 == -2147483648) {
                            break L5;
                          } else {
                            L7: {
                              var14 = gd.field_e[var11];
                              if (var14 != -2147483648) {
                                break L7;
                              } else {
                                if (var19 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              var15 = var14 + (var12 - -var13) + -var6;
                              stackOut_21_0 = fc.field_e.length + -1;
                              stackIn_24_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var7 < 0) {
                                stackOut_24_0 = stackIn_24_0;
                                stackOut_24_1 = var15 << -var7;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                break L8;
                              } else {
                                stackOut_22_0 = stackIn_22_0;
                                stackOut_22_1 = var15 >> var7;
                                stackIn_25_0 = stackOut_22_0;
                                stackIn_25_1 = stackOut_22_1;
                                break L8;
                              }
                            }
                            var16 = stackIn_25_0 + -stackIn_25_1;
                            var17 = fc.field_e[var16];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (0 == var17 >> 4) {
                                    break L11;
                                  } else {
                                    var16--;
                                    stackOut_27_0 = -1;
                                    stackOut_27_1 = ~var16;
                                    stackIn_35_0 = stackOut_27_0;
                                    stackIn_35_1 = stackOut_27_1;
                                    stackIn_28_0 = stackOut_27_0;
                                    stackIn_28_1 = stackOut_27_1;
                                    if (var19 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_28_0 < stackIn_28_1) {
                                          System.err.println("Out of range!");
                                          if (var19 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      var17 = fc.field_e[var16];
                                      if (var19 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_34_0 = var17;
                                stackOut_34_1 = var16 << 4;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                break L10;
                              }
                              L13: {
                                var18 = stackIn_35_0 + stackIn_35_1;
                                qh.field_c[var18] = var8;
                                fc.field_e[var16] = 1 + var17;
                                if (param2.field_I <= 0) {
                                  break L13;
                                } else {
                                  if (null == param2.field_f) {
                                    break L13;
                                  } else {
                                    dk.field_c[param2.field_f[var8]] = dk.field_c[param2.field_f[var8]] + 1;
                                    break L13;
                                  }
                                }
                              }
                              ae.field_I = ae.field_I + 1;
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_43_0 = 124;
                stackIn_44_0 = stackOut_43_0;
                break L3;
              }
              if (stackIn_44_0 > 121) {
                L14: {
                  L15: {
                    if (0 >= param2.field_I) {
                      break L15;
                    } else {
                      if (null == param2.field_f) {
                        break L15;
                      } else {
                        var8 = 0;
                        var9 = 0;
                        L16: while (true) {
                          if (dk.field_c.length <= var9) {
                            break L15;
                          } else {
                            var10 = dk.field_c[var9];
                            dk.field_c[var9] = var8;
                            var8 = var8 + var10;
                            var9++;
                            if (var19 != 0) {
                              break L14;
                            } else {
                              if (var19 == 0) {
                                continue L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L14;
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var5;
            stackOut_57_1 = new StringBuilder().append("ld.B(").append(param0).append(',').append(false).append(',');
            stackIn_60_0 = stackOut_57_0;
            stackIn_60_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param2 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L17;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L17;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ',' + param3 + ',' + 124 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Please try again in a few minutes.";
        field_h = new int[8192];
    }
}
