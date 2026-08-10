/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fb {
    gk field_o;
    int field_p;
    static pj field_s;
    byte field_q;
    static int field_r;

    public static void f(int param0) {
        if (param0 != 8364) {
            field_s = (pj) null;
        }
        field_s = null;
    }

    final static void b(byte param0) {
        if (null != tj.field_d) {
          if (!tj.field_d.h()) {
            return;
          } else {
            L0: {
              if (param0 == -19) {
                break L0;
              } else {
                ob.f(119);
                break L0;
              }
            }
            tj.field_d = li.a(ke.field_h[7], 100, 96);
            na.a((byte) 85, tj.field_d);
            return;
          }
        } else {
          L1: {
            if (param0 == -19) {
              break L1;
            } else {
              ob.f(119);
              break L1;
            }
          }
          tj.field_d = li.a(ke.field_h[7], 100, 96);
          na.a((byte) 85, tj.field_d);
          return;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -73;
        }
        if (!(null != this.field_o)) {
            return 0;
        }
        return this.field_o.field_h * 100 / (-this.field_q + this.field_o.field_g.length);
    }

    ob() {
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param5 + -param3;
              if (param0 < -71) {
                break L1;
              } else {
                var10 = (byte[]) null;
                ob.a(-46, (CharSequence) null, (byte[]) null, 83, 110, -101);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var6_int <= var7) {
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param1.charAt(param3 + var7);
                      if (0 >= var8) {
                        break L5;
                      } else {
                        if (128 > var8) {
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
                        if (255 >= var8) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param2[param4 - -var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param2[param4 + var7] = (byte)-125;
                          break L3;
                        } else {
                          if (var8 == 8222) {
                            param2[var7 + param4] = (byte)-124;
                            break L3;
                          } else {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param2[param4 - -var7] = (byte)-122;
                                break L3;
                              } else {
                                if (8225 != var8) {
                                  if (var8 != 710) {
                                    if (8240 != var8) {
                                      if (352 != var8) {
                                        if (var8 != 8249) {
                                          if (338 == var8) {
                                            param2[param4 - -var7] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param2[param4 - -var7] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var8 != 8217) {
                                                  if (var8 != 8220) {
                                                    if (var8 != 8221) {
                                                      if (var8 != 8226) {
                                                        if (8211 == var8) {
                                                          param2[var7 + param4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (8212 == var8) {
                                                            param2[var7 + param4] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param2[var7 + param4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var8 == 353) {
                                                                  param2[param4 + var7] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param2[var7 + param4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param2[param4 - -var7] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 == 382) {
                                                                        param2[param4 - -var7] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param2[var7 + param4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          param2[var7 + param4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param2[param4 + var7] = (byte)-104;
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        param2[var7 + param4] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      param2[var7 + param4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param2[var7 + param4] = (byte)-109;
                                                    break L3;
                                                  }
                                                } else {
                                                  param2[var7 + param4] = (byte)-110;
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              param2[var7 + param4] = (byte)-114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param2[param4 + var7] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        param2[param4 - -var7] = (byte)-118;
                                        break L3;
                                      }
                                    } else {
                                      param2[param4 - -var7] = (byte)-119;
                                      break L3;
                                    }
                                  } else {
                                    param2[param4 + var7] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  param2[param4 + var7] = (byte)-121;
                                  break L3;
                                }
                              }
                            } else {
                              param2[var7 + param4] = (byte)-123;
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      param2[param4 - -var7] = (byte)-128;
                      break L3;
                    }
                  }
                  param2[param4 + var7] = (byte)var8;
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
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("ob.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param2 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final byte[] e(int param0) {
        int var2;
        if (!this.field_j) {
          if (this.field_o.field_h < -this.field_q + this.field_o.field_g.length) {
            throw new RuntimeException();
          } else {
            var2 = 38 % ((25 - param0) / 41);
            return this.field_o.field_g;
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        field_s = new pj();
        field_r = 0;
    }
}
