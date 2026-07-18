/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends kl {
    private rb field_y;
    private int field_s;
    static ka[] field_t;
    private vb field_G;
    private la field_v;
    private sh field_u;
    private int field_z;
    private int field_l;
    private byte[] field_k;
    private byte[] field_i;
    private tf field_C;
    static vi field_g;
    static int field_A;
    static byte[][] field_E;
    private ha field_j;
    private la field_o;
    static char field_m;
    private boolean field_q;
    private sl field_D;
    private boolean field_h;
    private int field_r;
    static k field_F;
    static String field_B;
    static String field_n;
    private sl field_w;
    private boolean field_x;
    private long field_p;

    final tf b(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tf stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_56_0 = null;
        tf stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_7_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_55_0 = null;
        tf stackOut_60_0 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            if (null != ((di) this).field_C) {
              stackOut_7_0 = ((di) this).field_C;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              L2: {
                if (((di) this).field_u != null) {
                  break L2;
                } else {
                  if (((di) this).field_G.b((byte) 100)) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (tf) (Object) stackIn_16_0;
                  } else {
                    ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, param0 + 63);
                    break L2;
                  }
                }
              }
              if (((di) this).field_u.field_v) {
                stackOut_21_0 = null;
                stackIn_22_0 = stackOut_21_0;
                return (tf) (Object) stackIn_22_0;
              } else {
                L3: {
                  L4: {
                    var2_array = ((di) this).field_u.e(2);
                    if (((di) this).field_u instanceof al) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (null != var2_array) {
                            ((di) this).field_C = new tf(var2_array, ((di) this).field_l, ((di) this).field_i);
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((di) this).field_G.c(-30317);
                            ((di) this).field_C = null;
                            if (!((di) this).field_G.b((byte) 100)) {
                              break L7;
                            } else {
                              ((di) this).field_u = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, 90);
                          break L6;
                        }
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
                        return (tf) (Object) stackIn_36_0;
                      }
                      if (null != ((di) this).field_o) {
                        al discarded$1 = ((di) this).field_y.a(((di) this).field_z, ((di) this).field_o, (byte) 111, var2_array);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L8: {
                      if (null == var2_array) {
                        throw new RuntimeException();
                      } else {
                        ((di) this).field_C = new tf(var2_array, ((di) this).field_l, ((di) this).field_i);
                        if (((di) this).field_s == ((di) this).field_C.field_b) {
                          break L8;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((di) this).field_C = null;
                        if (!((di) this).field_G.b((byte) 100)) {
                          break L10;
                        } else {
                          ((di) this).field_u = null;
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, 75);
                      break L9;
                    }
                    stackOut_55_0 = null;
                    stackIn_56_0 = stackOut_55_0;
                    return (tf) (Object) stackIn_56_0;
                  }
                  break L3;
                }
                L11: {
                  ((di) this).field_u = null;
                  if (((di) this).field_v == null) {
                    break L11;
                  } else {
                    ((di) this).field_k = new byte[((di) this).field_C.field_r];
                    break L11;
                  }
                }
                stackOut_60_0 = ((di) this).field_C;
                stackIn_61_0 = stackOut_60_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "di.H(" + param0 + ')');
        }
        return stackIn_61_0;
    }

    private final sh a(int param0, int param1, boolean param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_63_0 = null;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_110_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        Object stackIn_143_0 = null;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        Object stackIn_155_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        Object stackOut_142_0 = null;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        Object stackOut_154_0 = null;
        byte stackOut_80_0 = 0;
        byte stackOut_80_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_109_0 = null;
        Object stackOut_62_0 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (sh) (Object) ((di) this).field_j.a((byte) 112, (long)param0);
              if (null == var4) {
                break L1;
              } else {
                if (param1 != 0) {
                  break L1;
                } else {
                  if (((sh) var4).field_s) {
                    break L1;
                  } else {
                    if (((sh) var4).field_v) {
                      ((sh) var4).a(true);
                      var4 = null;
                      break L1;
                    } else {
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
                  L4: {
                    if (param1 != 0) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (((di) this).field_v == null) {
                            break L6;
                          } else {
                            if (((di) this).field_k[param0] != -1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (!((di) this).field_G.b((byte) 100)) {
                          var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 92);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackOut_27_0 = null;
                          stackIn_28_0 = stackOut_27_0;
                          return (sh) (Object) stackIn_28_0;
                        }
                      }
                      var4 = (Object) (Object) ((di) this).field_y.a(((di) this).field_v, true, param0);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (1 == param1) {
                    if (null == ((di) this).field_v) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((di) this).field_y.a(param0, 3, ((di) this).field_v);
                      break L3;
                    }
                  } else {
                    if (2 != param1) {
                      throw new RuntimeException();
                    } else {
                      if (((di) this).field_v == null) {
                        throw new RuntimeException();
                      } else {
                        if (-1 != ((di) this).field_k[param0]) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            if (((di) this).field_G.a(true)) {
                              break L7;
                            } else {
                              var4 = (Object) (Object) ((di) this).field_G.a(false, ((di) this).field_z, param0, (byte) 2, 60);
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            }
                          }
                          stackOut_49_0 = null;
                          stackIn_50_0 = stackOut_49_0;
                          return (sh) (Object) stackIn_50_0;
                        }
                      }
                    }
                  }
                }
                ((di) this).field_j.a(-111, (da) var4, (long)param0);
                break L2;
              }
            }
            L8: {
              if (!param2) {
                break L8;
              } else {
                ((di) this).field_q = true;
                break L8;
              }
            }
            if (!((sh) var4).field_v) {
              var5 = ((sh) var4).e(2);
              if (!(var4 instanceof al)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length <= 2) {
                          break L10;
                        } else {
                          vc.field_c.reset();
                          vc.field_c.update(var5, 0, -2 + var5.length);
                          var6_int = (int)vc.field_c.getValue();
                          if (((di) this).field_C.field_t[param0] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (null == ((di) this).field_C.field_n) {
                                break L11;
                              } else {
                                if (null == ((di) this).field_C.field_n[param0]) {
                                  break L11;
                                } else {
                                  var7 = ((di) this).field_C.field_n[param0];
                                  var8 = qc.a(var5, -2 + var5.length, (byte) -82, 0);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_128_0 = ~var7[var9];
                                      stackOut_128_1 = ~var8[var9];
                                      stackIn_148_0 = stackOut_128_0;
                                      stackIn_148_1 = stackOut_128_1;
                                      stackIn_129_0 = stackOut_128_0;
                                      stackIn_129_1 = stackOut_128_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_129_0 != stackIn_129_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((di) this).field_G.field_h = 0;
                            ((di) this).field_G.field_b = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((di) this).field_G.c(-30317);
                    ((sh) var4).a(true);
                    if (((sh) var4).field_s) {
                      if (((di) this).field_G.b((byte) 100)) {
                        break L13;
                      } else {
                        var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 108);
                        ((di) this).field_j.a(47, (da) var4, (long)param0);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_142_0 = null;
                  stackIn_143_0 = stackOut_142_0;
                  return (sh) (Object) stackIn_143_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((di) this).field_C.field_d[param0] >>> -452775096);
                      var5[-1 + var5.length] = (byte)((di) this).field_C.field_d[param0];
                      if (null != ((di) this).field_v) {
                        al discarded$1 = ((di) this).field_y.a(param0, ((di) this).field_v, (byte) 111, var5);
                        stackOut_147_0 = -2;
                        stackOut_147_1 = ~((di) this).field_k[param0];
                        stackIn_148_0 = stackOut_147_0;
                        stackIn_148_1 = stackOut_147_1;
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (stackIn_148_0 == stackIn_148_1) {
                    break L14;
                  } else {
                    ((di) this).field_k[param0] = (byte) 1;
                    break L14;
                  }
                }
                L16: {
                  if (((sh) var4).field_s) {
                    break L16;
                  } else {
                    ((sh) var4).a(true);
                    break L16;
                  }
                }
                stackOut_154_0 = var4;
                stackIn_155_0 = stackOut_154_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (null == var5) {
                        break L18;
                      } else {
                        if (2 < var5.length) {
                          vc.field_c.reset();
                          vc.field_c.update(var5, 0, var5.length + -2);
                          var6_int = (int)vc.field_c.getValue();
                          if (((di) this).field_C.field_t[param0] == var6_int) {
                            L19: {
                              L20: {
                                if (((di) this).field_C.field_n == null) {
                                  break L20;
                                } else {
                                  if (null == ((di) this).field_C.field_n[param0]) {
                                    break L20;
                                  } else {
                                    var7 = ((di) this).field_C.field_n[param0];
                                    var8 = qc.a(var5, var5.length - 2, (byte) -117, 0);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_80_0 = var7[var9];
                                        stackOut_80_1 = var8[var9];
                                        stackIn_88_0 = stackOut_80_0;
                                        stackIn_88_1 = stackOut_80_1;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_81_0 == stackIn_81_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L21;
                                            } else {
                                              break L20;
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
                              stackOut_87_0 = 65280 & var5[-2 + var5.length] << 178669832;
                              stackOut_87_1 = var5[var5.length + -1] & 255;
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              break L19;
                            }
                            var7_int = stackIn_88_0 + stackIn_88_1;
                            if (~var7_int != ~(((di) this).field_C.field_d[param0] & 65535)) {
                              throw new RuntimeException();
                            } else {
                              L22: {
                                if (((di) this).field_k[param0] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((di) this).field_k[param0] != 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((di) this).field_k[param0] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (((sh) var4).field_s) {
                                  break L24;
                                } else {
                                  ((sh) var4).a(true);
                                  break L24;
                                }
                              }
                              stackOut_100_0 = var4;
                              stackIn_101_0 = stackOut_100_0;
                              break L17;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((di) this).field_k[param0] = (byte) -1;
                    ((sh) var4).a(true);
                    if (!((sh) var4).field_s) {
                      break L25;
                    } else {
                      if (!((di) this).field_G.b((byte) 100)) {
                        var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 79);
                        ((di) this).field_j.a(-100, (da) var4, (long)param0);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  stackOut_109_0 = null;
                  stackIn_110_0 = stackOut_109_0;
                  return (sh) (Object) stackIn_110_0;
                }
                return (sh) (Object) stackIn_101_0;
              }
            } else {
              stackOut_62_0 = null;
              stackIn_63_0 = stackOut_62_0;
              return (sh) (Object) stackIn_63_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw oj.a((Throwable) var4, "di.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (sh) (Object) stackIn_155_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 14) {
                break L1;
              } else {
                int discarded$2 = ((di) this).a(-90, -21);
                break L1;
              }
            }
            if (null == ((di) this).field_v) {
              return;
            } else {
              L2: {
                ((di) this).field_h = true;
                if (((di) this).field_D == null) {
                  ((di) this).field_D = new sl();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "di.D(" + param0 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
        sh var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(param0, 0, false);
            if (null != var3) {
              L1: {
                if (param1 == -72) {
                  break L1;
                } else {
                  di.a(true);
                  break L1;
                }
              }
              var4 = var3.e(param1 + 74);
              var3.a(true);
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
          throw oj.a((Throwable) (Object) var3_ref, "di.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        sh var2_ref = null;
        int var2_int = 0;
        da var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_15_0 = 0;
        byte stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_51_0 = 0;
        byte stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        byte stackOut_14_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_50_0 = 0;
        byte stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_98_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -43) {
                break L1;
              } else {
                byte[] discarded$5 = ((di) this).a(92, (byte) -25);
                break L1;
              }
            }
            L2: {
              if (((di) this).field_D == null) {
                break L2;
              } else {
                if (null == ((di) this).b(0)) {
                  return;
                } else {
                  L3: {
                    if (!((di) this).field_q) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((di) this).field_D.c((byte) 114);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_d;
                                stackOut_14_0 = 0;
                                stackOut_14_1 = ((di) this).field_k[var4];
                                stackIn_26_0 = stackOut_14_0;
                                stackIn_26_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_26_0 <= stackIn_26_1) {
                                      break L6;
                                    } else {
                                      stackOut_27_0 = ((di) this).field_C.field_e[((di) this).field_r];
                                      stackIn_51_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackIn_30_0 = stackOut_28_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_30_0 != 0) {
                                              break L10;
                                            } else {
                                              ((di) this).field_r = ((di) this).field_r + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (250 <= ((di) this).field_y.field_e) {
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
                                            if (0 != ((di) this).field_k[((di) this).field_r]) {
                                              break L12;
                                            } else {
                                              sh discarded$6 = this.a(((di) this).field_r, 1, false);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (0 == ((di) this).field_k[((di) this).field_r]) {
                                              var3 = new da();
                                              var3.field_d = (long)((di) this).field_r;
                                              var2_int = 0;
                                              ((di) this).field_D.a(var3, -36);
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((di) this).field_r = ((di) this).field_r + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_25_0 = ((di) this).field_C.field_e.length;
                                        stackOut_25_1 = ((di) this).field_r;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_15_0 == stackIn_15_1) {
                                      sh discarded$7 = this.a(var4, 1, false);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((di) this).field_k[var4] != 0) {
                                        break L16;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var3.a(true);
                                    break L15;
                                  }
                                  var3 = ((di) this).field_D.c(-270);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_25_0 = ((di) this).field_C.field_e.length;
                              stackOut_25_1 = ((di) this).field_r;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              if (stackIn_26_0 <= stackIn_26_1) {
                                break L6;
                              } else {
                                stackOut_27_0 = ((di) this).field_C.field_e[((di) this).field_r];
                                stackIn_51_0 = stackOut_27_0;
                                stackIn_28_0 = stackOut_27_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_28_0 = stackIn_28_0;
                                  stackIn_30_0 = stackOut_28_0;
                                  L18: {
                                    if (stackIn_30_0 != 0) {
                                      break L18;
                                    } else {
                                      ((di) this).field_r = ((di) this).field_r + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (250 <= ((di) this).field_y.field_e) {
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
                                    if (0 != ((di) this).field_k[((di) this).field_r]) {
                                      break L20;
                                    } else {
                                      sh discarded$6 = this.a(((di) this).field_r, 1, false);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (0 == ((di) this).field_k[((di) this).field_r]) {
                                      var3 = new da();
                                      var3.field_d = (long)((di) this).field_r;
                                      var2_int = 0;
                                      ((di) this).field_D.a(var3, -36);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((di) this).field_r = ((di) this).field_r + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_50_0 = var2_int;
                          stackIn_51_0 = stackOut_50_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_51_0 != 0) {
                            ((di) this).field_q = false;
                            ((di) this).field_r = 0;
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
                  L23: {
                    if (((di) this).field_h) {
                      break L23;
                    } else {
                      ((di) this).field_D = null;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((di) this).field_D.c((byte) 123);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (var3 == null) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_63_0 = ((di) this).field_k[var4];
                            stackOut_63_1 = 1;
                            stackIn_76_0 = stackOut_63_0;
                            stackIn_76_1 = stackOut_63_1;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_76_0 >= stackIn_76_1) {
                                  break L26;
                                } else {
                                  stackOut_77_0 = -1;
                                  stackIn_99_0 = stackOut_77_0;
                                  stackIn_78_0 = stackOut_77_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_78_0 = stackIn_78_0;
                                    stackIn_80_0 = stackOut_78_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_80_0 == ~((di) this).field_C.field_e[((di) this).field_r]) {
                                          ((di) this).field_r = ((di) this).field_r + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (!((di) this).field_G.a(true)) {
                                          break L31;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L26;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      L32: {
                                        if (((di) this).field_k[((di) this).field_r] == 1) {
                                          break L32;
                                        } else {
                                          sh discarded$8 = this.a(((di) this).field_r, 2, false);
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (((di) this).field_k[((di) this).field_r] != 1) {
                                          var3 = new da();
                                          var3.field_d = (long)((di) this).field_r;
                                          ((di) this).field_D.a(var3, -62);
                                          var2_int = 0;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      ((di) this).field_r = ((di) this).field_r + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_75_0 = ~((di) this).field_C.field_e.length;
                                    stackOut_75_1 = ~((di) this).field_r;
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_64_0 != stackIn_64_1) {
                                  sh discarded$9 = this.a(var4, 2, false);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((di) this).field_k[var4] != 1) {
                                    break L36;
                                  } else {
                                    var3.a(true);
                                    if (var5 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L35;
                              }
                              var3 = ((di) this).field_D.c(-270);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_75_0 = ~((di) this).field_C.field_e.length;
                          stackOut_75_1 = ~((di) this).field_r;
                          stackIn_76_0 = stackOut_75_0;
                          stackIn_76_1 = stackOut_75_1;
                          if (stackIn_76_0 >= stackIn_76_1) {
                            break L26;
                          } else {
                            stackOut_77_0 = -1;
                            stackIn_99_0 = stackOut_77_0;
                            stackIn_78_0 = stackOut_77_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_78_0 = stackIn_78_0;
                              stackIn_80_0 = stackOut_78_0;
                              L38: {
                                if (stackIn_80_0 == ~((di) this).field_C.field_e[((di) this).field_r]) {
                                  ((di) this).field_r = ((di) this).field_r + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (!((di) this).field_G.a(true)) {
                                  break L39;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              L40: {
                                if (((di) this).field_k[((di) this).field_r] == 1) {
                                  break L40;
                                } else {
                                  sh discarded$8 = this.a(((di) this).field_r, 2, false);
                                  break L40;
                                }
                              }
                              L41: {
                                if (((di) this).field_k[((di) this).field_r] != 1) {
                                  var3 = new da();
                                  var3.field_d = (long)((di) this).field_r;
                                  ((di) this).field_D.a(var3, -62);
                                  var2_int = 0;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              ((di) this).field_r = ((di) this).field_r + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_98_0 = var2_int;
                      stackIn_99_0 = stackOut_98_0;
                      break L25;
                    }
                    if (stackIn_99_0 != 0) {
                      ((di) this).field_r = 0;
                      ((di) this).field_h = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L42: {
              if (!((di) this).field_x) {
                break L42;
              } else {
                if (~((di) this).field_p >= ~ol.a(256)) {
                  var2_ref = (sh) (Object) ((di) this).field_j.a((byte) -73);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            L46: {
                              if (!var2_ref.field_v) {
                                break L46;
                              } else {
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L47: {
                              if (!var2_ref.field_p) {
                                break L47;
                              } else {
                                if (!var2_ref.field_s) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.a(true);
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            var2_ref.field_p = true;
                            break L45;
                          }
                          var2_ref = (sh) (Object) ((di) this).field_j.a(-27377);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((di) this).field_p = ol.a(256) + 1000L;
                    break L42;
                  }
                } else {
                  break L42;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "di.E(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        try {
            field_B = null;
            field_t = null;
            field_n = null;
            field_F = null;
            field_E = null;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "di.F(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        da var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((di) this).field_D) {
              return;
            } else {
              if (((di) this).b(0) == null) {
                return;
              } else {
                L1: {
                  if (param0 < -107) {
                    break L1;
                  } else {
                    ((di) this).field_p = 74L;
                    break L1;
                  }
                }
                var2_ref = ((di) this).field_w.c((byte) -61);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_d;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~((di) this).field_C.field_r >= ~var3) {
                                    break L7;
                                  } else {
                                    if (((di) this).field_C.field_e[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(true);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((di) this).field_k[var3] != 0) {
                                break L8;
                              } else {
                                sh discarded$2 = this.a(var3, 1, false);
                                break L8;
                              }
                            }
                            L9: {
                              if (((di) this).field_k[var3] != -1) {
                                break L9;
                              } else {
                                sh discarded$3 = this.a(var3, 2, false);
                                break L9;
                              }
                            }
                            if (((di) this).field_k[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.a(true);
                              break L5;
                            }
                          }
                          var2_ref = ((di) this).field_w.c(-270);
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
          throw oj.a((Throwable) (Object) var2, "di.A(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        sh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (sh) (Object) ((di) this).field_j.a((byte) 91, (long)param1);
              if (param0 == 0) {
                break L1;
              } else {
                tf discarded$2 = ((di) this).b(124);
                break L1;
              }
            }
            if (var3 == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.f(100);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3_ref, "di.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    di(int param0, la param1, la param2, vb param3, rb param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((di) this).field_j = new ha(16);
        ((di) this).field_r = 0;
        ((di) this).field_w = new sl();
        ((di) this).field_p = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((di) this).field_v = param1;
                ((di) this).field_z = param0;
                if (null != ((di) this).field_v) {
                  break L2;
                } else {
                  ((di) this).field_q = false;
                  if (!TorChallenge.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((di) this).field_q = true;
              ((di) this).field_D = new sl();
              break L1;
            }
            L3: {
              ((di) this).field_s = param7;
              ((di) this).field_x = param8;
              ((di) this).field_o = param2;
              ((di) this).field_i = param6;
              ((di) this).field_G = param3;
              ((di) this).field_y = param4;
              ((di) this).field_l = param5;
              if (null != ((di) this).field_o) {
                ((di) this).field_u = (sh) (Object) ((di) this).field_y.a(((di) this).field_o, true, ((di) this).field_z);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("di.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new byte[1000][];
        field_g = new vi();
        field_F = new k(14, 0, 4, 1);
        field_B = " - Not available to this monk.";
        field_n = "achievements to collect";
    }
}
