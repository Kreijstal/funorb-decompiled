/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jm extends bw {
    static StringBuilder field_g;
    static String[] field_k;
    static String field_l;
    int field_j;
    static String field_h;
    static kv[] field_f;
    static lna field_i;

    public static void c() {
        field_k = null;
        field_f = null;
        field_h = null;
        int var1 = 120;
        field_l = null;
        field_g = null;
        field_i = null;
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        L0: {
          if (gs.field_f != null) {
            gs.field_f.a(2, 0, param0);
            break L0;
          } else {
            break L0;
          }
        }
        if (dj.field_c == null) {
          L1: {
            if (null != sna.field_fb) {
              sna.field_fb.b(106, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (vla.field_w) {
            if (!sia.field_h) {
              return;
            } else {
              L2: {
                if (vs.field_d) {
                  if (lna.field_q) {
                    stackOut_51_0 = 1;
                    stackIn_53_0 = stackOut_51_0;
                    break L2;
                  } else {
                    stackOut_50_0 = 0;
                    stackIn_53_0 = stackOut_50_0;
                    break L2;
                  }
                } else {
                  stackOut_48_0 = 0;
                  stackIn_53_0 = stackOut_48_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var2 = stackIn_53_0;
                  if (!param0) {
                    break L4;
                  } else {
                    int discarded$6 = 11;
                    if (!aja.e()) {
                      break L4;
                    } else {
                      if (var2 != 0) {
                        break L4;
                      } else {
                        stackOut_56_0 = 1;
                        stackIn_58_0 = stackOut_56_0;
                        break L3;
                      }
                    }
                  }
                }
                stackOut_57_0 = 0;
                stackIn_58_0 = stackOut_57_0;
                break L3;
              }
              L5: {
                ji.a(stackIn_58_0 != 0, 76);
                if (var2 == 0) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      stackOut_59_0 = 0;
                      stackIn_62_0 = stackOut_59_0;
                      stackIn_60_0 = stackOut_59_0;
                      if (!param0) {
                        break L7;
                      } else {
                        int discarded$7 = 11;
                        stackOut_60_0 = stackIn_60_0;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_61_0 = stackOut_60_0;
                        if (!aja.e()) {
                          break L7;
                        } else {
                          stackOut_61_0 = stackIn_61_0;
                          stackOut_61_1 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          break L6;
                        }
                      }
                    }
                    stackOut_62_0 = stackIn_62_0;
                    stackOut_62_1 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    break L6;
                  }
                  av.a(stackIn_63_0, stackIn_63_1 != 0);
                  break L5;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          L8: {
            dj.field_c.b(78, param0);
            if (null != sna.field_fb) {
              sna.field_fb.b(106, param0);
              break L8;
            } else {
              break L8;
            }
          }
          if (vla.field_w) {
            if (sia.field_h) {
              if (!vs.field_d) {
                L9: {
                  L10: {
                    var2 = 0;
                    if (!param0) {
                      break L10;
                    } else {
                      int discarded$8 = 11;
                      if (!aja.e()) {
                        break L10;
                      } else {
                        if (var2 != 0) {
                          break L10;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L9;
                        }
                      }
                    }
                  }
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L9;
                }
                L11: {
                  ji.a(stackIn_33_0 != 0, 76);
                  if (var2 == 0) {
                    break L11;
                  } else {
                    L12: {
                      L13: {
                        stackOut_34_0 = 0;
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (!param0) {
                          break L13;
                        } else {
                          int discarded$9 = 11;
                          stackOut_35_0 = stackIn_35_0;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (!aja.e()) {
                            break L13;
                          } else {
                            stackOut_36_0 = stackIn_36_0;
                            stackOut_36_1 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            break L12;
                          }
                        }
                      }
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L12;
                    }
                    av.a(stackIn_38_0, stackIn_38_1 != 0);
                    break L11;
                  }
                }
                return;
              } else {
                L14: {
                  if (!lna.field_q) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L14;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L14;
                  }
                }
                L15: {
                  L16: {
                    var2 = stackIn_16_0;
                    if (!param0) {
                      break L16;
                    } else {
                      int discarded$10 = 11;
                      if (!aja.e()) {
                        break L16;
                      } else {
                        if (var2 != 0) {
                          break L16;
                        } else {
                          stackOut_19_0 = 1;
                          stackIn_21_0 = stackOut_19_0;
                          break L15;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L15;
                }
                L17: {
                  ji.a(stackIn_21_0 != 0, 76);
                  if (var2 == 0) {
                    break L17;
                  } else {
                    L18: {
                      L19: {
                        stackOut_22_0 = 0;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (!param0) {
                          break L19;
                        } else {
                          int discarded$11 = 11;
                          stackOut_23_0 = stackIn_23_0;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (!aja.e()) {
                            break L19;
                          } else {
                            stackOut_24_0 = stackIn_24_0;
                            stackOut_24_1 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            break L18;
                          }
                        }
                      }
                      stackOut_25_0 = stackIn_25_0;
                      stackOut_25_1 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L18;
                    }
                    av.a(stackIn_26_0, stackIn_26_1 != 0);
                    break L17;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static String a(byte param0, String param1, char param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (var7 == 0) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param1.indexOf((int) param2, var8_int);
                  if (var8_int >= 0) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param1.indexOf((int) param2, var9);
              if (var10 < 0) {
                StringBuilder discarded$3 = var8.append(param1.substring(var9));
                stackOut_9_0 = var8.toString();
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                StringBuilder discarded$4 = var8.append(param1.substring(var9, var10));
                StringBuilder discarded$5 = var8.append(param3);
                var9 = var10 + 1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("jm.I(").append(75).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final void a(lu param0, byte param1) {
        try {
            param0.d(((jm) this).field_j, 0);
            if (param1 != -63) {
                field_f = null;
            }
            ((jm) this).b(param0, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jm.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(lu param0, byte param1) {
        try {
            int var3_int = -10 / ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    jm() {
    }

    abstract void a(boolean param0, op param1);

    final static String a(byte param0, int param1) {
        return 1 + param1 + "/6";
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = param0;
              if (param1 <= -46) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var6_int <= var7) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(var7);
                      if (0 >= var8) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 == var8) {
                      param4[var7 + param2] = (byte) -128;
                      break L3;
                    } else {
                      if (var8 == 8218) {
                        param4[param2 + var7] = (byte) -126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param4[var7 + param2] = (byte) -125;
                          break L3;
                        } else {
                          if (var8 == 8222) {
                            param4[param2 + var7] = (byte) -124;
                            break L3;
                          } else {
                            if (var8 == 8230) {
                              param4[var7 + param2] = (byte) -123;
                              break L3;
                            } else {
                              if (8224 == var8) {
                                param4[var7 + param2] = (byte) -122;
                                break L3;
                              } else {
                                if (var8 != 8225) {
                                  if (var8 != 710) {
                                    if (var8 == 8240) {
                                      param4[param2 + var7] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (338 == var8) {
                                            param4[var7 + param2] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (8216 != var8) {
                                                if (var8 == 8217) {
                                                  param4[var7 + param2] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param4[param2 + var7] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (8226 == var8) {
                                                        param4[var7 + param2] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var8) {
                                                          param4[param2 + var7] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (8212 != var8) {
                                                            if (var8 == 732) {
                                                              param4[var7 + param2] = (byte) -104;
                                                              break L3;
                                                            } else {
                                                              if (var8 != 8482) {
                                                                if (var8 != 353) {
                                                                  if (var8 != 8250) {
                                                                    if (var8 == 339) {
                                                                      param4[var7 + param2] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 == var8) {
                                                                        param4[var7 + param2] = (byte) -98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param4[param2 - -var7] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          param4[var7 + param2] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param4[param2 + var7] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  param4[var7 + param2] = (byte) -102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                param4[var7 + param2] = (byte) -103;
                                                                break L3;
                                                              }
                                                            }
                                                          } else {
                                                            param4[param2 + var7] = (byte) -105;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param4[param2 + var7] = (byte) -108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param4[var7 + param2] = (byte) -111;
                                                break L3;
                                              }
                                            } else {
                                              param4[param2 + var7] = (byte) -114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param4[var7 + param2] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        param4[param2 + var7] = (byte) -118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param4[var7 + param2] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  param4[var7 + param2] = (byte) -121;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  param4[var7 + param2] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("jm.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + 0 + ')');
        }
        return stackIn_69_0;
    }

    void a(ub param0, int param1) {
        try {
            if (param1 > -2) {
                field_i = null;
            }
            ((jm) this).a(false, param0.field_o.field_h);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Please try changing the following settings:  ";
        field_k = new String[]{"Attempting to Identify Mystery Meat", "Calculating Chunk Density", "Tenderising Roast Beef", "Smoking Kippers for Breakfast", "Toasting Hot Cross Buns", "Nerfing Tofu", "Reticulating Slimes", "Awaiting Pizza Delivery", "Distributing Gas Masks", "Searching for Cutlery", "Attempting to Force Lid", "Recharging Energy Drink", "Discarding Fish Heads", "Wrestling with Shellfish", "Compiling Grocery List", "Retrieving Last Year's Data", "Pondering Purpose of Trainer", "Lying about Cake", "Fetching Filth", "P-P-P-Picking up Packets", "Decoding Sell-By Date", "Corrupting Vegetables", "Saving up Sporx", "Shaking Cola Bottles", "Cutting off Mouldy Bits", "Prepping Flies for Launch", "Crying over Spilt Milk", "Churning Memory (into Butter)", "Cerealizing Objects", "Loading Haggis. Reluctantly", "Going to Brussels for Sprouts"};
        field_h = "Most objects in the fridge can be used by clicking or dragging. Mouse over objects to see what they are, when you're done click here to continue. <br><col=BBFF00> Next</col>";
        field_g = new StringBuilder(80);
    }
}
