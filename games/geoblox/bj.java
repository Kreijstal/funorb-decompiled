/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends nh {
    private fi field_g;
    static boolean field_s;
    private int field_h;
    static int[] field_j;
    private ji field_f;
    private pb field_l;
    private int field_p;
    private uf field_i;
    private int field_m;
    private jh field_y;
    static na field_r;
    private byte[] field_k;
    private byte[] field_x;
    private bm field_u;
    private jh field_e;
    private int field_o;
    private boolean field_v;
    private tf field_t;
    private boolean field_q;
    private tf field_d;
    private boolean field_w;
    private long field_n;

    final bm a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        bm stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_57_0 = null;
        bm stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_56_0 = null;
        bm stackOut_61_0 = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (null != ((bj) this).field_u) {
              stackOut_4_0 = ((bj) this).field_u;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (((bj) this).field_l == null) {
                  if (((bj) this).field_f.g(20)) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (bm) (Object) stackIn_13_0;
                  } else {
                    ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 > 111) {
                  break L2;
                } else {
                  ((bj) this).b((byte) 65);
                  break L2;
                }
              }
              if (((bj) this).field_l.field_u) {
                stackOut_21_0 = null;
                stackIn_22_0 = stackOut_21_0;
                return (bm) (Object) stackIn_22_0;
              } else {
                L3: {
                  L4: {
                    var2_array = ((bj) this).field_l.e(397);
                    if (((bj) this).field_l instanceof o) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((bj) this).field_u = new bm(var2_array, ((bj) this).field_m, ((bj) this).field_x);
                            break L5;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((bj) this).field_f.e(20);
                            ((bj) this).field_u = null;
                            if (((bj) this).field_f.g(20)) {
                              break L7;
                            } else {
                              ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((bj) this).field_l = null;
                          break L6;
                        }
                        stackOut_36_0 = null;
                        stackIn_37_0 = stackOut_36_0;
                        return (bm) (Object) stackIn_37_0;
                      }
                      if (null == ((bj) this).field_y) {
                        break L3;
                      } else {
                        o discarded$1 = ((bj) this).field_i.a((byte) 88, ((bj) this).field_p, ((bj) this).field_y, var2_array);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  try {
                    L8: {
                      if (null != var2_array) {
                        ((bj) this).field_u = new bm(var2_array, ((bj) this).field_m, ((bj) this).field_x);
                        if (((bj) this).field_u.field_g != ((bj) this).field_h) {
                          throw new RuntimeException();
                        } else {
                          break L8;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((bj) this).field_u = null;
                        if (!((bj) this).field_f.g(20)) {
                          break L10;
                        } else {
                          ((bj) this).field_l = null;
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((bj) this).field_l = (pb) (Object) ((bj) this).field_f.a((byte) 0, 255, -21, ((bj) this).field_p, true);
                      break L9;
                    }
                    stackOut_56_0 = null;
                    stackIn_57_0 = stackOut_56_0;
                    return (bm) (Object) stackIn_57_0;
                  }
                  break L3;
                }
                L11: {
                  ((bj) this).field_l = null;
                  if (((bj) this).field_e == null) {
                    break L11;
                  } else {
                    ((bj) this).field_k = new byte[((bj) this).field_u.field_b];
                    break L11;
                  }
                }
                stackOut_61_0 = ((bj) this).field_u;
                stackIn_62_0 = stackOut_61_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "bj.E(" + param0 + ')');
        }
        return stackIn_62_0;
    }

    private final pb a(byte param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        Object stackIn_98_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        Object stackIn_141_0 = null;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        Object stackIn_153_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_42_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        Object stackOut_140_0 = null;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        Object stackOut_152_0 = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        Object stackOut_97_0 = null;
        Object stackOut_104_0 = null;
        Object stackOut_58_0 = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (pb) (Object) ((bj) this).field_g.a((long)param2, (byte) -124);
              if (null == var4) {
                break L1;
              } else {
                if (param1 != 0) {
                  break L1;
                } else {
                  if (((pb) var4).field_q) {
                    break L1;
                  } else {
                    if (!((pb) var4).field_u) {
                      break L1;
                    } else {
                      ((pb) var4).a(false);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 != null) {
                break L2;
              } else {
                L3: {
                  if (param1 != 0) {
                    if (param1 == 1) {
                      if (null != ((bj) this).field_e) {
                        var4 = (Object) (Object) ((bj) this).field_i.a(param0 + 131, ((bj) this).field_e, param2);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      L4: {
                        if (param1 != 2) {
                          break L4;
                        } else {
                          if (null != ((bj) this).field_e) {
                            if (((bj) this).field_k[param2] == -1) {
                              if (!((bj) this).field_f.b(-21)) {
                                var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, param0 + 50, param2, false);
                                if (var10 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                stackOut_42_0 = null;
                                stackIn_43_0 = stackOut_42_0;
                                return (pb) (Object) stackIn_43_0;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } else {
                    L5: {
                      if (null == ((bj) this).field_e) {
                        break L5;
                      } else {
                        if (-1 == ((bj) this).field_k[param2]) {
                          break L5;
                        } else {
                          var4 = (Object) (Object) ((bj) this).field_i.a(((bj) this).field_e, param2, 15079962);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((bj) this).field_f.g(20)) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_27_0 = null;
                    stackIn_28_0 = stackOut_27_0;
                    return (pb) (Object) stackIn_28_0;
                  }
                }
                ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                break L2;
              }
            }
            if (((pb) var4).field_u) {
              stackOut_55_0 = null;
              stackIn_56_0 = stackOut_55_0;
              return (pb) (Object) stackIn_56_0;
            } else {
              var5 = ((pb) var4).e(397);
              if (param0 == -71) {
                if (!(var4 instanceof o)) {
                  try {
                    L7: {
                      L8: {
                        if (null == var5) {
                          break L8;
                        } else {
                          if (var5.length <= 2) {
                            break L8;
                          } else {
                            ge.field_f.reset();
                            ge.field_f.update(var5, 0, var5.length + -2);
                            var6_int = (int)ge.field_f.getValue();
                            if (~var6_int == ~((bj) this).field_u.field_q[param2]) {
                              L9: {
                                if (null == ((bj) this).field_u.field_r) {
                                  break L9;
                                } else {
                                  if (null != ((bj) this).field_u.field_r[param2]) {
                                    var7 = ((bj) this).field_u.field_r[param2];
                                    var8 = wh.a(-2 + var5.length, 0, var5, 8);
                                    var9 = 0;
                                    L10: while (true) {
                                      if (var9 >= 64) {
                                        break L9;
                                      } else {
                                        stackOut_124_0 = ~var8[var9];
                                        stackOut_124_1 = ~var7[var9];
                                        stackIn_145_0 = stackOut_124_0;
                                        stackIn_145_1 = stackOut_124_1;
                                        stackIn_125_0 = stackOut_124_0;
                                        stackIn_125_1 = stackOut_124_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L7;
                                        } else {
                                          if (stackIn_125_0 == stackIn_125_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L10;
                                            } else {
                                              break L9;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((bj) this).field_f.field_b = 0;
                              ((bj) this).field_f.field_q = 0;
                              decompiledRegionSelector0 = 1;
                              break L7;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L11: {
                      var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                      ((bj) this).field_f.e(20);
                      ((pb) var4).a(false);
                      if (((pb) var4).field_q) {
                        if (!((bj) this).field_f.g(param0 ^ -83)) {
                          var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                          ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                          break L11;
                        } else {
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    stackOut_140_0 = null;
                    stackIn_141_0 = stackOut_140_0;
                    return (pb) (Object) stackIn_141_0;
                  }
                  L12: {
                    L13: {
                      if (decompiledRegionSelector0 == 0) {
                        break L13;
                      } else {
                        var5[var5.length - 2] = (byte)(((bj) this).field_u.field_t[param2] >>> -52028856);
                        var5[-1 + var5.length] = (byte)((bj) this).field_u.field_t[param2];
                        if (null == ((bj) this).field_e) {
                          break L12;
                        } else {
                          o discarded$1 = ((bj) this).field_i.a((byte) 66, param2, ((bj) this).field_e, var5);
                          stackOut_143_0 = ~((bj) this).field_k[param2];
                          stackOut_143_1 = -2;
                          stackIn_145_0 = stackOut_143_0;
                          stackIn_145_1 = stackOut_143_1;
                          break L13;
                        }
                      }
                    }
                    if (stackIn_145_0 != stackIn_145_1) {
                      ((bj) this).field_k[param2] = (byte) 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L14: {
                    if (!((pb) var4).field_q) {
                      ((pb) var4).a(false);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  stackOut_152_0 = var4;
                  stackIn_153_0 = stackOut_152_0;
                  break L0;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null == var5) {
                          break L16;
                        } else {
                          if (var5.length <= 2) {
                            break L16;
                          } else {
                            ge.field_f.reset();
                            ge.field_f.update(var5, 0, var5.length + -2);
                            var6_int = (int)ge.field_f.getValue();
                            if (var6_int == ((bj) this).field_u.field_q[param2]) {
                              L17: {
                                L18: {
                                  if (((bj) this).field_u.field_r == null) {
                                    break L18;
                                  } else {
                                    if (null == ((bj) this).field_u.field_r[param2]) {
                                      break L18;
                                    } else {
                                      var7 = ((bj) this).field_u.field_r[param2];
                                      var8 = wh.a(-2 + var5.length, 0, var5, 8);
                                      var9 = 0;
                                      L19: while (true) {
                                        if (var9 >= 64) {
                                          break L18;
                                        } else {
                                          stackOut_77_0 = ~var7[var9];
                                          stackOut_77_1 = ~var8[var9];
                                          stackIn_85_0 = stackOut_77_0;
                                          stackIn_85_1 = stackOut_77_1;
                                          stackIn_78_0 = stackOut_77_0;
                                          stackIn_78_1 = stackOut_77_1;
                                          if (var10 != 0) {
                                            break L17;
                                          } else {
                                            if (stackIn_78_0 == stackIn_78_1) {
                                              var9++;
                                              if (var10 == 0) {
                                                continue L19;
                                              } else {
                                                break L18;
                                              }
                                            } else {
                                              throw new RuntimeException();
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_84_0 = var5[-2 + var5.length] << -2130145656 & 65280;
                                stackOut_84_1 = var5[var5.length - 1] & 255;
                                stackIn_85_0 = stackOut_84_0;
                                stackIn_85_1 = stackOut_84_1;
                                break L17;
                              }
                              var7_int = stackIn_85_0 + stackIn_85_1;
                              if (~(65535 & ((bj) this).field_u.field_t[param2]) != ~var7_int) {
                                throw new RuntimeException();
                              } else {
                                L20: {
                                  if (((bj) this).field_k[param2] != 1) {
                                    L21: {
                                      if (((bj) this).field_k[param2] != 0) {
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    ((bj) this).field_k[param2] = (byte) 1;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L22: {
                                  if (((pb) var4).field_q) {
                                    break L22;
                                  } else {
                                    ((pb) var4).a(false);
                                    break L22;
                                  }
                                }
                                stackOut_97_0 = var4;
                                stackIn_98_0 = stackOut_97_0;
                                break L15;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L23: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      ((bj) this).field_k[param2] = (byte) -1;
                      ((pb) var4).a(false);
                      if (!((pb) var4).field_q) {
                        break L23;
                      } else {
                        if (((bj) this).field_f.g(20)) {
                          break L23;
                        } else {
                          var4 = (Object) (Object) ((bj) this).field_f.a((byte) 2, ((bj) this).field_p, -21, param2, true);
                          ((bj) this).field_g.a((byte) 102, (hf) var4, (long)param2);
                          break L23;
                        }
                      }
                    }
                    stackOut_104_0 = null;
                    stackIn_105_0 = stackOut_104_0;
                    return (pb) (Object) stackIn_105_0;
                  }
                  return (pb) (Object) stackIn_98_0;
                }
              } else {
                stackOut_58_0 = null;
                stackIn_59_0 = stackOut_58_0;
                return (pb) (Object) stackIn_59_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw t.a((Throwable) var4, "bj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (pb) (Object) stackIn_153_0;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var2_int) {
                    break L3;
                  } else {
                    var3[-var4 + (-1 + var2_int)] = param1.charAt(var4);
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 >= 26) {
                  break L2;
                } else {
                  String discarded$2 = bj.a(68, (String) null);
                  break L2;
                }
              }
              stackOut_10_0 = new String(var3);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("bj.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    final byte[] b(int param0, int param1) {
        pb var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a((byte) -71, 0, param1);
            if (var3 != null) {
              L1: {
                var4 = var3.e(397);
                var3.a(false);
                if (param0 == 4) {
                  break L1;
                } else {
                  ((bj) this).b(49);
                  break L1;
                }
              }
              stackOut_6_0 = (byte[]) var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3_ref, "bj.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1) {
        pb var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (pb) (Object) ((bj) this).field_g.a((long)param1, (byte) -102);
            if (param0 >= 125) {
              if (var3 == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = var3.g(0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -119;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3_ref, "bj.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        try {
            field_r = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bj.I(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((bj) this).field_e != null) {
              L1: {
                if (param0 >= 80) {
                  break L1;
                } else {
                  ((bj) this).field_n = -51L;
                  break L1;
                }
              }
              L2: {
                ((bj) this).field_v = true;
                if (((bj) this).field_d == null) {
                  ((bj) this).field_d = new tf();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "bj.F(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        hf var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 6924) {
                break L1;
              } else {
                ((bj) this).b((byte) -7);
                break L1;
              }
            }
            if (((bj) this).field_d == null) {
              return;
            } else {
              if (null == ((bj) this).a((byte) 126)) {
                return;
              } else {
                var2_ref = ((bj) this).field_t.g(0);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_a;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((bj) this).field_u.field_b) {
                                    break L7;
                                  } else {
                                    if (((bj) this).field_u.field_a[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(false);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((bj) this).field_k[var3] != 0) {
                                break L8;
                              } else {
                                pb discarded$2 = this.a((byte) -71, 1, var3);
                                break L8;
                              }
                            }
                            L9: {
                              if (-1 != ((bj) this).field_k[var3]) {
                                break L9;
                              } else {
                                pb discarded$3 = this.a((byte) -71, 2, var3);
                                break L9;
                              }
                            }
                            if (((bj) this).field_k[var3] == 1) {
                              var2_ref.a(false);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((bj) this).field_t.d(1);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "bj.H(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        pb var2_ref = null;
        hf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        byte stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        byte stackOut_54_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_65_0 = 0;
        byte stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        var5 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                if (((bj) this).field_d == null) {
                  break L2;
                } else {
                  if (null != ((bj) this).a((byte) 118)) {
                    L3: {
                      if (((bj) this).field_q) {
                        break L3;
                      } else {
                        L4: {
                          if (((bj) this).field_v) {
                            break L4;
                          } else {
                            ((bj) this).field_d = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((bj) this).field_d.g(0);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_a;
                                stackOut_13_0 = ~((bj) this).field_k[var4];
                                stackOut_13_1 = -2;
                                stackIn_26_0 = stackOut_13_0;
                                stackIn_26_1 = stackOut_13_1;
                                stackIn_14_0 = stackOut_13_0;
                                stackIn_14_1 = stackOut_13_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_26_0 >= stackIn_26_1) {
                                      break L6;
                                    } else {
                                      stackOut_27_0 = -1;
                                      stackOut_27_1 = ~((bj) this).field_u.field_a[((bj) this).field_o];
                                      stackIn_94_0 = stackOut_27_0;
                                      stackIn_94_1 = stackOut_27_1;
                                      stackIn_28_0 = stackOut_27_0;
                                      stackIn_28_1 = stackOut_27_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackOut_28_1 = stackIn_28_1;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_30_1 = stackOut_28_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_30_0 == stackIn_30_1) {
                                              ((bj) this).field_o = ((bj) this).field_o + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (((bj) this).field_f.b(-21)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                              break L12;
                                            } else {
                                              pb discarded$5 = this.a((byte) -71, 2, ((bj) this).field_o);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                              break L13;
                                            } else {
                                              var3 = new hf();
                                              var3.field_a = (long)((bj) this).field_o;
                                              var2_int = 0;
                                              ((bj) this).field_d.a(-97, var3);
                                              break L13;
                                            }
                                          }
                                          ((bj) this).field_o = ((bj) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_25_0 = ((bj) this).field_o;
                                        stackOut_25_1 = ((bj) this).field_u.field_a.length;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_14_0 != stackIn_14_1) {
                                      pb discarded$6 = this.a((byte) -71, 2, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((bj) this).field_k[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.a(false);
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L15;
                                  }
                                  var3 = ((bj) this).field_d.d(1);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_25_0 = ((bj) this).field_o;
                              stackOut_25_1 = ((bj) this).field_u.field_a.length;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              if (stackIn_26_0 >= stackIn_26_1) {
                                break L6;
                              } else {
                                stackOut_27_0 = -1;
                                stackOut_27_1 = ~((bj) this).field_u.field_a[((bj) this).field_o];
                                stackIn_94_0 = stackOut_27_0;
                                stackIn_94_1 = stackOut_27_1;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_28_0 = stackIn_28_0;
                                  stackOut_28_1 = stackIn_28_1;
                                  stackIn_30_0 = stackOut_28_0;
                                  stackIn_30_1 = stackOut_28_1;
                                  L18: {
                                    if (stackIn_30_0 == stackIn_30_1) {
                                      ((bj) this).field_o = ((bj) this).field_o + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (((bj) this).field_f.b(-21)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                      break L20;
                                    } else {
                                      pb discarded$5 = this.a((byte) -71, 2, ((bj) this).field_o);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((bj) this).field_k[((bj) this).field_o] == 1) {
                                      break L21;
                                    } else {
                                      var3 = new hf();
                                      var3.field_a = (long)((bj) this).field_o;
                                      var2_int = 0;
                                      ((bj) this).field_d.a(-97, var3);
                                      break L21;
                                    }
                                  }
                                  ((bj) this).field_o = ((bj) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (var2_int != 0) {
                              ((bj) this).field_v = false;
                              ((bj) this).field_o = 0;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((bj) this).field_d.g(0);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (var3 == null) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_a;
                            stackOut_54_0 = ((bj) this).field_k[var4];
                            stackIn_66_0 = stackOut_54_0;
                            stackIn_55_0 = stackOut_54_0;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_66_0 >= ((bj) this).field_u.field_a.length) {
                                  break L24;
                                } else {
                                  stackOut_67_0 = 0;
                                  stackOut_67_1 = ((bj) this).field_u.field_a[((bj) this).field_o];
                                  stackIn_94_0 = stackOut_67_0;
                                  stackIn_94_1 = stackOut_67_1;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_68_0 = stackIn_68_0;
                                    stackOut_68_1 = stackIn_68_1;
                                    stackIn_70_0 = stackOut_68_0;
                                    stackIn_70_1 = stackOut_68_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_70_0 != stackIn_70_1) {
                                          break L28;
                                        } else {
                                          ((bj) this).field_o = ((bj) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (((bj) this).field_i.field_d >= 250) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (((bj) this).field_k[((bj) this).field_o] != 0) {
                                          break L30;
                                        } else {
                                          pb discarded$7 = this.a((byte) -71, 1, ((bj) this).field_o);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (0 == ((bj) this).field_k[((bj) this).field_o]) {
                                          var3 = new hf();
                                          var3.field_a = (long)((bj) this).field_o;
                                          var2_int = 0;
                                          ((bj) this).field_d.a(-45, var3);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      ((bj) this).field_o = ((bj) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_65_0 = ((bj) this).field_o;
                                    stackIn_66_0 = stackOut_65_0;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_55_0 != 0) {
                                  break L32;
                                } else {
                                  pb discarded$8 = this.a((byte) -71, 1, var4);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (((bj) this).field_k[var4] != 0) {
                                    break L34;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var3.a(false);
                                break L33;
                              }
                              var3 = ((bj) this).field_d.d(1);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_65_0 = ((bj) this).field_o;
                          stackIn_66_0 = stackOut_65_0;
                          if (stackIn_66_0 >= ((bj) this).field_u.field_a.length) {
                            break L24;
                          } else {
                            stackOut_67_0 = 0;
                            stackOut_67_1 = ((bj) this).field_u.field_a[((bj) this).field_o];
                            stackIn_94_0 = stackOut_67_0;
                            stackIn_94_1 = stackOut_67_1;
                            stackIn_68_0 = stackOut_67_0;
                            stackIn_68_1 = stackOut_67_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_68_0 = stackIn_68_0;
                              stackOut_68_1 = stackIn_68_1;
                              stackIn_70_0 = stackOut_68_0;
                              stackIn_70_1 = stackOut_68_1;
                              L36: {
                                if (stackIn_70_0 != stackIn_70_1) {
                                  break L36;
                                } else {
                                  ((bj) this).field_o = ((bj) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (((bj) this).field_i.field_d >= 250) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (((bj) this).field_k[((bj) this).field_o] != 0) {
                                  break L38;
                                } else {
                                  pb discarded$7 = this.a((byte) -71, 1, ((bj) this).field_o);
                                  break L38;
                                }
                              }
                              L39: {
                                if (0 == ((bj) this).field_k[((bj) this).field_o]) {
                                  var3 = new hf();
                                  var3.field_a = (long)((bj) this).field_o;
                                  var2_int = 0;
                                  ((bj) this).field_d.a(-45, var3);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              ((bj) this).field_o = ((bj) this).field_o + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        ((bj) this).field_o = 0;
                        ((bj) this).field_q = false;
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              stackOut_93_0 = param0;
              stackOut_93_1 = -38;
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              break L1;
            }
            L40: {
              if (stackIn_94_0 == stackIn_94_1) {
                break L40;
              } else {
                byte[] discarded$9 = ((bj) this).b(25, 41);
                break L40;
              }
            }
            L41: {
              if (!((bj) this).field_w) {
                break L41;
              } else {
                if (~oa.a(-12520) > ~((bj) this).field_n) {
                  break L41;
                } else {
                  var2_ref = (pb) (Object) ((bj) this).field_g.a((byte) 125);
                  L42: while (true) {
                    L43: {
                      if (null == var2_ref) {
                        break L43;
                      } else {
                        if (var5 != 0) {
                          break L41;
                        } else {
                          L44: {
                            L45: {
                              if (!var2_ref.field_u) {
                                break L45;
                              } else {
                                if (var5 == 0) {
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            L46: {
                              if (var2_ref.field_n) {
                                break L46;
                              } else {
                                var2_ref.field_n = true;
                                if (var5 == 0) {
                                  break L44;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (!var2_ref.field_q) {
                              throw new RuntimeException();
                            } else {
                              var2_ref.a(false);
                              break L44;
                            }
                          }
                          var2_ref = (pb) (Object) ((bj) this).field_g.b(74);
                          if (var5 == 0) {
                            continue L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    ((bj) this).field_n = 1000L + oa.a(param0 + -12482);
                    break L41;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "bj.G(" + param0 + ')');
        }
    }

    bj(int param0, jh param1, jh param2, ji param3, uf param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((bj) this).field_g = new fi(16);
        ((bj) this).field_o = 0;
        ((bj) this).field_t = new tf();
        ((bj) this).field_n = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((bj) this).field_e = param1;
                ((bj) this).field_p = param0;
                if (null == ((bj) this).field_e) {
                  break L2;
                } else {
                  ((bj) this).field_q = true;
                  ((bj) this).field_d = new tf();
                  if (Geoblox.field_C == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((bj) this).field_q = false;
              break L1;
            }
            L3: {
              ((bj) this).field_i = param4;
              ((bj) this).field_y = param2;
              ((bj) this).field_w = param8;
              ((bj) this).field_x = param6;
              ((bj) this).field_f = param3;
              ((bj) this).field_h = param7;
              ((bj) this).field_m = param5;
              if (((bj) this).field_y == null) {
                break L3;
              } else {
                ((bj) this).field_l = (pb) (Object) ((bj) this).field_i.a(((bj) this).field_y, ((bj) this).field_p, 15079962);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("bj.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
    }
}
