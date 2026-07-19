/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_b;
    static ea[] field_a;
    static int field_c;
    static ki field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        ed.a((String) null, km.field_b, -1);
        if (param0 >= -93) {
            field_c = 16;
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 125) {
            r.b((byte) 54);
        }
    }

    final static int a(CharSequence param0, byte[] param1, int param2, int param3, int param4, int param5) {
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
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var6_int = -param3 + param4;
              if (param5 == 8211) {
                break L1;
              } else {
                field_c = -5;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param0.charAt(param3 + var7);
                      if (var8 <= 0) {
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
                        if (255 < var8) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param1[param2 - -var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param1[var7 + param2] = (byte)-125;
                          break L3;
                        } else {
                          if (8222 == var8) {
                            param1[var7 + param2] = (byte)-124;
                            break L3;
                          } else {
                            if (8230 != var8) {
                              if (var8 == 8224) {
                                param1[var7 + param2] = (byte)-122;
                                break L3;
                              } else {
                                if (8225 == var8) {
                                  param1[param2 + var7] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var8 == 710) {
                                    param1[param2 - -var7] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (8240 != var8) {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param1[param2 + var7] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param1[param2 - -var7] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var8 == 8216) {
                                                param1[var7 + param2] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (8217 == var8) {
                                                  param1[var7 + param2] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param1[var7 + param2] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var8 == 8221) {
                                                      param1[param2 - -var7] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var8 == 8226) {
                                                        param1[param2 - -var7] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var8) {
                                                          param1[param2 + var7] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var8 == 8212) {
                                                            param1[var7 + param2] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 == 732) {
                                                              param1[param2 - -var7] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (8482 == var8) {
                                                                param1[param2 + var7] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var8 == 353) {
                                                                  param1[var7 + param2] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (8250 != var8) {
                                                                    if (var8 == 339) {
                                                                      param1[param2 + var7] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 == var8) {
                                                                        param1[param2 + var7] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param1[param2 + var7] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          param1[var7 + param2] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param1[var7 + param2] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          param1[param2 - -var7] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        param1[param2 + var7] = (byte)-118;
                                        break L3;
                                      }
                                    } else {
                                      param1[var7 + param2] = (byte)-119;
                                      break L3;
                                    }
                                  }
                                }
                              }
                            } else {
                              param1[var7 + param2] = (byte)-123;
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      param1[var7 + param2] = (byte)-128;
                      break L3;
                    }
                  }
                  param1[param2 - -var7] = (byte)var8;
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
            stackOut_70_0 = (RuntimeException) (var6);
            stackOut_70_1 = new StringBuilder().append("r.C(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final static ea[] a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = -91 / ((param0 - -27) / 36);
        return sc.a(3, param1, 1, param3, param4, 1, (byte) -81, param2, 1);
    }

    final static void a(int param0) {
        if (!qc.field_b) {
            throw new IllegalStateException();
        }
        if (param0 != -14475) {
            return;
        }
        jb.field_q = true;
        ed.a((byte) -101, false);
        fh.field_b = 0;
    }

    static {
        field_b = "Eaten Alive";
    }
}
