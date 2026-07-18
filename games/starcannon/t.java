/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ti {
    static String field_q;
    static hl[] field_r;
    private uf field_v;
    private int field_n;
    static int field_C;
    private int field_k;
    private ak field_t;
    static String field_x;
    private byte[] field_j;
    private ef field_y;
    private uf field_p;
    private ih field_w;
    private byte[] field_i;
    private ik field_m;
    static int field_u;
    static lc field_h;
    private int field_A;
    private eh field_s;
    private boolean field_D;
    private int field_F;
    private rk field_B;
    private boolean field_l;
    private rk field_E;
    private boolean field_z;
    private long field_o;

    private final ik a(int param0, int param1, boolean param2) {
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
        Object stackIn_44_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_110_0 = null;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        Object stackIn_144_0 = null;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        Object stackIn_157_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_54_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        Object stackOut_143_0 = null;
        int stackOut_148_0 = 0;
        byte stackOut_148_1 = 0;
        Object stackOut_156_0 = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_109_0 = null;
        Object stackOut_59_0 = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                ak discarded$2 = ((t) this).b((byte) -92);
                break L1;
              }
            }
            L2: {
              var4 = (Object) (Object) (ik) (Object) ((t) this).field_w.a((long)param0, (byte) 88);
              if (null == var4) {
                break L2;
              } else {
                if (0 != param1) {
                  break L2;
                } else {
                  if (((ik) var4).field_o) {
                    break L2;
                  } else {
                    if (!((ik) var4).field_r) {
                      break L2;
                    } else {
                      ((ik) var4).b(4);
                      var4 = null;
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (null == var4) {
                L4: {
                  if (0 == param1) {
                    L5: {
                      if (((t) this).field_p == null) {
                        break L5;
                      } else {
                        if (((t) this).field_j[param0] != -1) {
                          var4 = (Object) (Object) ((t) this).field_y.a(((t) this).field_p, -118, param0);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (((t) this).field_s.b((byte) -79)) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, true, (byte) 2);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_54_0 = null;
                    stackIn_55_0 = stackOut_54_0;
                    return (ik) (Object) stackIn_55_0;
                  } else {
                    L7: {
                      if (param1 != 1) {
                        break L7;
                      } else {
                        if (((t) this).field_p == null) {
                          throw new RuntimeException();
                        } else {
                          var4 = (Object) (Object) ((t) this).field_y.a((byte) 16, param0, ((t) this).field_p);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (param1 != 2) {
                      throw new RuntimeException();
                    } else {
                      if (null != ((t) this).field_p) {
                        if (((t) this).field_j[param0] != -1) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (((t) this).field_s.f((byte) -49)) {
                              break L8;
                            } else {
                              var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, false, (byte) 2);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          stackOut_43_0 = null;
                          stackIn_44_0 = stackOut_43_0;
                          return (ik) (Object) stackIn_44_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                ((t) this).field_w.a((long)param0, (byte) -100, (rf) var4);
                break L3;
              } else {
                break L3;
              }
            }
            if (!((ik) var4).field_r) {
              var5 = ((ik) var4).f(0);
              if (!(var4 instanceof tg)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length > 2) {
                          lh.field_g.reset();
                          lh.field_g.update(var5, 0, var5.length - 2);
                          var6_int = (int)lh.field_g.getValue();
                          if (((t) this).field_t.field_c[param0] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (((t) this).field_t.field_p == null) {
                                break L11;
                              } else {
                                if (null != ((t) this).field_t.field_p[param0]) {
                                  var7 = ((t) this).field_t.field_p[param0];
                                  var8 = bd.a(var5.length + -2, var5, (byte) 108, 0);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_129_0 = ~var8[var9];
                                      stackOut_129_1 = ~var7[var9];
                                      stackIn_149_0 = stackOut_129_0;
                                      stackIn_149_1 = stackOut_129_1;
                                      stackIn_130_0 = stackOut_129_0;
                                      stackIn_130_1 = stackOut_129_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_130_0 == stackIn_130_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            ((t) this).field_s.field_p = 0;
                            ((t) this).field_s.field_d = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((t) this).field_s.a((byte) 126);
                    ((ik) var4).b(4);
                    if (((ik) var4).field_o) {
                      if (((t) this).field_s.b((byte) -119)) {
                        break L13;
                      } else {
                        var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, true, (byte) 2);
                        ((t) this).field_w.a((long)param0, (byte) -100, (rf) var4);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_143_0 = null;
                  stackIn_144_0 = stackOut_143_0;
                  return (ik) (Object) stackIn_144_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((t) this).field_t.field_d[param0] >>> 131581288);
                      var5[-1 + var5.length] = (byte)((t) this).field_t.field_d[param0];
                      if (((t) this).field_p != null) {
                        tg discarded$3 = ((t) this).field_y.a(var5, ((t) this).field_p, false, param0);
                        stackOut_148_0 = 1;
                        stackOut_148_1 = ((t) this).field_j[param0];
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (stackIn_149_0 != stackIn_149_1) {
                    ((t) this).field_j[param0] = (byte) 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (!((ik) var4).field_o) {
                    ((ik) var4).b(4);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                stackOut_156_0 = var4;
                stackIn_157_0 = stackOut_156_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (null == var5) {
                        break L18;
                      } else {
                        if (2 >= var5.length) {
                          break L18;
                        } else {
                          lh.field_g.reset();
                          lh.field_g.update(var5, 0, -2 + var5.length);
                          var6_int = (int)lh.field_g.getValue();
                          if (~var6_int != ~((t) this).field_t.field_c[param0]) {
                            throw new RuntimeException();
                          } else {
                            L19: {
                              L20: {
                                if (((t) this).field_t.field_p == null) {
                                  break L20;
                                } else {
                                  if (null == ((t) this).field_t.field_p[param0]) {
                                    break L20;
                                  } else {
                                    var7 = ((t) this).field_t.field_p[param0];
                                    var8 = bd.a(-2 + var5.length, var5, (byte) 93, 0);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_79_0 = ~var7[var9];
                                        stackOut_79_1 = ~var8[var9];
                                        stackIn_87_0 = stackOut_79_0;
                                        stackIn_87_1 = stackOut_79_1;
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_80_0 != stackIn_80_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L21;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_86_0 = (255 & var5[-2 + var5.length]) << -1300519992;
                              stackOut_86_1 = var5[-1 + var5.length] & 255;
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              break L19;
                            }
                            var7_int = stackIn_87_0 + stackIn_87_1;
                            if (~var7_int != ~(65535 & ((t) this).field_t.field_d[param0])) {
                              throw new RuntimeException();
                            } else {
                              L22: {
                                if (((t) this).field_j[param0] != 1) {
                                  L23: {
                                    if (((t) this).field_j[param0] == 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((t) this).field_j[param0] = (byte) 1;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L24: {
                                if (!((ik) var4).field_o) {
                                  ((ik) var4).b(4);
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              stackOut_100_0 = var4;
                              stackIn_101_0 = stackOut_100_0;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((t) this).field_j[param0] = (byte) -1;
                    ((ik) var4).b(4);
                    if (((ik) var4).field_o) {
                      if (!((t) this).field_s.b((byte) -124)) {
                        var4 = (Object) (Object) ((t) this).field_s.a(((t) this).field_k, param0, -28612, true, (byte) 2);
                        ((t) this).field_w.a((long)param0, (byte) -100, (rf) var4);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  stackOut_109_0 = null;
                  stackIn_110_0 = stackOut_109_0;
                  return (ik) (Object) stackIn_110_0;
                }
                return (ik) (Object) stackIn_101_0;
              }
            } else {
              stackOut_59_0 = null;
              stackIn_60_0 = stackOut_59_0;
              return (ik) (Object) stackIn_60_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw sd.a((Throwable) var4, "t.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ik) (Object) stackIn_157_0;
    }

    final void a(int param0) {
        if (param0 >= -123) {
            ((t) this).field_D = true;
        }
        if (null == ((t) this).field_p) {
            return;
        }
        try {
            ((t) this).field_D = true;
            if (null == ((t) this).field_B) {
                ((t) this).field_B = new rk();
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "t.I(" + param0 + ')');
        }
    }

    final byte[] b(int param0, boolean param1) {
        ik var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(param0, 0, true);
            if (var3 != null) {
              L1: {
                var4 = var3.f(0);
                var3.b(4);
                if (!param1) {
                  break L1;
                } else {
                  ak discarded$2 = ((t) this).b((byte) 60);
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
          throw sd.a((Throwable) (Object) var3_ref, "t.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final ak b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ak stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_51_0 = null;
        ak stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_50_0 = null;
        ak stackOut_55_0 = null;
        Object stackOut_14_0 = null;
        ak stackOut_2_0 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            if (null == ((t) this).field_t) {
              L1: {
                if (null != ((t) this).field_m) {
                  break L1;
                } else {
                  if (((t) this).field_s.b((byte) -106)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (ak) (Object) stackIn_11_0;
                  } else {
                    ((t) this).field_m = (ik) (Object) ((t) this).field_s.a(255, ((t) this).field_k, -28612, true, (byte) 0);
                    break L1;
                  }
                }
              }
              if (!((t) this).field_m.field_r) {
                L2: {
                  L3: {
                    var2_array = ((t) this).field_m.f(0);
                    var3 = -97 / ((50 - param0) / 55);
                    if (((t) this).field_m instanceof tg) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (var2_array == null) {
                            throw new RuntimeException();
                          } else {
                            ((t) this).field_t = new ak(var2_array, ((t) this).field_n, ((t) this).field_i);
                            break L4;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var4 = decompiledCaughtException;
                            ((t) this).field_s.a((byte) 124);
                            ((t) this).field_t = null;
                            if (((t) this).field_s.b((byte) -128)) {
                              break L6;
                            } else {
                              ((t) this).field_m = (ik) (Object) ((t) this).field_s.a(255, ((t) this).field_k, -28612, true, (byte) 0);
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((t) this).field_m = null;
                          break L5;
                        }
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        return (ak) (Object) stackIn_30_0;
                      }
                      if (null == ((t) this).field_v) {
                        break L2;
                      } else {
                        tg discarded$1 = ((t) this).field_y.a(var2_array, ((t) this).field_v, false, ((t) this).field_k);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  try {
                    L7: {
                      if (var2_array == null) {
                        throw new RuntimeException();
                      } else {
                        ((t) this).field_t = new ak(var2_array, ((t) this).field_n, ((t) this).field_i);
                        if (((t) this).field_t.field_q != ((t) this).field_A) {
                          throw new RuntimeException();
                        } else {
                          break L7;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var4 = decompiledCaughtException;
                        ((t) this).field_t = null;
                        if (!((t) this).field_s.b((byte) -66)) {
                          break L9;
                        } else {
                          ((t) this).field_m = null;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((t) this).field_m = (ik) (Object) ((t) this).field_s.a(255, ((t) this).field_k, -28612, true, (byte) 0);
                      break L8;
                    }
                    stackOut_50_0 = null;
                    stackIn_51_0 = stackOut_50_0;
                    return (ak) (Object) stackIn_51_0;
                  }
                  break L2;
                }
                L10: {
                  if (null == ((t) this).field_p) {
                    break L10;
                  } else {
                    ((t) this).field_j = new byte[((t) this).field_t.field_m];
                    break L10;
                  }
                }
                ((t) this).field_m = null;
                stackOut_55_0 = ((t) this).field_t;
                stackIn_56_0 = stackOut_55_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (ak) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((t) this).field_t;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "t.A(" + param0 + ')');
        }
        return stackIn_56_0;
    }

    public static void c(byte param0) {
        try {
            field_x = null;
            int var1_int = -37 % ((param0 - -4) / 33);
            field_q = null;
            field_h = null;
            field_r = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "t.J(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ik var2_ref = null;
        rf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_59_0 = 0;
        byte stackIn_59_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_58_0 = 0;
        byte stackOut_58_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_92_0 = 0;
        var5 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param0 == -12) {
                break L1;
              } else {
                int discarded$5 = ((t) this).a(-73, false);
                break L1;
              }
            }
            L2: {
              if (null != ((t) this).field_B) {
                if (((t) this).b((byte) 120) == null) {
                  return;
                } else {
                  L3: {
                    if (!((t) this).field_l) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((t) this).field_B.c(param0 + -3893);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_14_0 = -1;
                                stackOut_14_1 = ~((t) this).field_j[var4];
                                stackIn_27_0 = stackOut_14_0;
                                stackIn_27_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_27_0 <= stackIn_27_1) {
                                      break L6;
                                    } else {
                                      stackOut_28_0 = ((t) this).field_t.field_i[((t) this).field_F];
                                      stackIn_49_0 = stackOut_28_0;
                                      stackIn_29_0 = stackOut_28_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackIn_31_0 = stackOut_29_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_31_0 == 0) {
                                              ((t) this).field_F = ((t) this).field_F + 1;
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
                                            if (((t) this).field_y.field_h < 250) {
                                              break L11;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (0 != ((t) this).field_j[((t) this).field_F]) {
                                              break L12;
                                            } else {
                                              ik discarded$6 = this.a(((t) this).field_F, 1, true);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (0 == ((t) this).field_j[((t) this).field_F]) {
                                              var3 = new rf();
                                              var3.field_b = (long)((t) this).field_F;
                                              var2_int = 0;
                                              ((t) this).field_B.b(69, var3);
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((t) this).field_F = ((t) this).field_F + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_26_0 = ((t) this).field_t.field_i.length;
                                        stackOut_26_1 = ((t) this).field_F;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_15_0 != stackIn_15_1) {
                                      break L14;
                                    } else {
                                      ik discarded$7 = this.a(var4, 1, true);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((t) this).field_j[var4] == 0) {
                                        break L16;
                                      } else {
                                        var3.b(4);
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
                                  var3 = ((t) this).field_B.a(-16913);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_26_0 = ((t) this).field_t.field_i.length;
                              stackOut_26_1 = ((t) this).field_F;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              if (stackIn_27_0 <= stackIn_27_1) {
                                break L6;
                              } else {
                                stackOut_28_0 = ((t) this).field_t.field_i[((t) this).field_F];
                                stackIn_49_0 = stackOut_28_0;
                                stackIn_29_0 = stackOut_28_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_29_0 = stackIn_29_0;
                                  stackIn_31_0 = stackOut_29_0;
                                  L18: {
                                    if (stackIn_31_0 == 0) {
                                      ((t) this).field_F = ((t) this).field_F + 1;
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
                                    if (((t) this).field_y.field_h < 250) {
                                      break L19;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (0 != ((t) this).field_j[((t) this).field_F]) {
                                      break L20;
                                    } else {
                                      ik discarded$6 = this.a(((t) this).field_F, 1, true);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (0 == ((t) this).field_j[((t) this).field_F]) {
                                      var3 = new rf();
                                      var3.field_b = (long)((t) this).field_F;
                                      var2_int = 0;
                                      ((t) this).field_B.b(69, var3);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((t) this).field_F = ((t) this).field_F + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_48_0 = var2_int;
                          stackIn_49_0 = stackOut_48_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_49_0 == 0) {
                            break L22;
                          } else {
                            ((t) this).field_l = false;
                            ((t) this).field_F = 0;
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
                    if (!((t) this).field_D) {
                      break L23;
                    } else {
                      var2_int = 1;
                      var3 = ((t) this).field_B.c(-3905);
                      L24: while (true) {
                        L25: {
                          L26: {
                            L27: {
                              if (var3 == null) {
                                break L27;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_58_0 = 1;
                                stackOut_58_1 = ((t) this).field_j[var4];
                                stackIn_70_0 = stackOut_58_0;
                                stackIn_70_1 = stackOut_58_1;
                                stackIn_59_0 = stackOut_58_0;
                                stackIn_59_1 = stackOut_58_1;
                                if (var5 != 0) {
                                  L28: while (true) {
                                    if (stackIn_70_0 >= stackIn_70_1) {
                                      break L26;
                                    } else {
                                      stackOut_71_0 = -1;
                                      stackIn_93_0 = stackOut_71_0;
                                      stackIn_72_0 = stackOut_71_0;
                                      if (var5 != 0) {
                                        break L25;
                                      } else {
                                        stackOut_72_0 = stackIn_72_0;
                                        stackIn_74_0 = stackOut_72_0;
                                        L29: {
                                          L30: {
                                            if (stackIn_74_0 != ~((t) this).field_t.field_i[((t) this).field_F]) {
                                              break L30;
                                            } else {
                                              ((t) this).field_F = ((t) this).field_F + 1;
                                              if (var5 == 0) {
                                                break L29;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          L31: {
                                            if (((t) this).field_s.f((byte) -49)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L26;
                                              } else {
                                                break L31;
                                              }
                                            } else {
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((t) this).field_j[((t) this).field_F] == 1) {
                                              break L32;
                                            } else {
                                              ik discarded$8 = this.a(((t) this).field_F, 2, true);
                                              break L32;
                                            }
                                          }
                                          L33: {
                                            if (1 == ((t) this).field_j[((t) this).field_F]) {
                                              break L33;
                                            } else {
                                              var3 = new rf();
                                              var3.field_b = (long)((t) this).field_F;
                                              var2_int = 0;
                                              ((t) this).field_B.b(param0 + 83, var3);
                                              break L33;
                                            }
                                          }
                                          ((t) this).field_F = ((t) this).field_F + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        stackOut_69_0 = ~((t) this).field_t.field_i.length;
                                        stackOut_69_1 = ~((t) this).field_F;
                                        stackIn_70_0 = stackOut_69_0;
                                        stackIn_70_1 = stackOut_69_1;
                                        continue L28;
                                      }
                                    }
                                  }
                                } else {
                                  L34: {
                                    if (stackIn_59_0 != stackIn_59_1) {
                                      ik discarded$9 = this.a(var4, 2, true);
                                      break L34;
                                    } else {
                                      break L34;
                                    }
                                  }
                                  L35: {
                                    L36: {
                                      if (1 == ((t) this).field_j[var4]) {
                                        break L36;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L35;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    var3.b(4);
                                    break L35;
                                  }
                                  var3 = ((t) this).field_B.a(param0 + -16901);
                                  if (var5 == 0) {
                                    continue L24;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                            L37: while (true) {
                              stackOut_69_0 = ~((t) this).field_t.field_i.length;
                              stackOut_69_1 = ~((t) this).field_F;
                              stackIn_70_0 = stackOut_69_0;
                              stackIn_70_1 = stackOut_69_1;
                              if (stackIn_70_0 >= stackIn_70_1) {
                                break L26;
                              } else {
                                stackOut_71_0 = -1;
                                stackIn_93_0 = stackOut_71_0;
                                stackIn_72_0 = stackOut_71_0;
                                if (var5 != 0) {
                                  break L25;
                                } else {
                                  stackOut_72_0 = stackIn_72_0;
                                  stackIn_74_0 = stackOut_72_0;
                                  L38: {
                                    if (stackIn_74_0 != ~((t) this).field_t.field_i[((t) this).field_F]) {
                                      break L38;
                                    } else {
                                      ((t) this).field_F = ((t) this).field_F + 1;
                                      if (var5 == 0) {
                                        continue L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (((t) this).field_s.f((byte) -49)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L26;
                                      } else {
                                        break L39;
                                      }
                                    } else {
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (((t) this).field_j[((t) this).field_F] == 1) {
                                      break L40;
                                    } else {
                                      ik discarded$8 = this.a(((t) this).field_F, 2, true);
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    if (1 == ((t) this).field_j[((t) this).field_F]) {
                                      break L41;
                                    } else {
                                      var3 = new rf();
                                      var3.field_b = (long)((t) this).field_F;
                                      var2_int = 0;
                                      ((t) this).field_B.b(param0 + 83, var3);
                                      break L41;
                                    }
                                  }
                                  ((t) this).field_F = ((t) this).field_F + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_92_0 = var2_int;
                          stackIn_93_0 = stackOut_92_0;
                          break L25;
                        }
                        L42: {
                          if (stackIn_93_0 == 0) {
                            break L42;
                          } else {
                            ((t) this).field_D = false;
                            ((t) this).field_F = 0;
                            break L42;
                          }
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  ((t) this).field_B = null;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L43: {
              if (!((t) this).field_z) {
                break L43;
              } else {
                if (((t) this).field_o > dd.b(119)) {
                  break L43;
                } else {
                  var2_ref = (ik) (Object) ((t) this).field_w.a(-1);
                  L44: while (true) {
                    L45: {
                      if (var2_ref == null) {
                        break L45;
                      } else {
                        if (var5 != 0) {
                          break L43;
                        } else {
                          L46: {
                            if (var2_ref.field_r) {
                              break L46;
                            } else {
                              L47: {
                                if (!var2_ref.field_n) {
                                  break L47;
                                } else {
                                  if (var2_ref.field_o) {
                                    var2_ref.b(4);
                                    if (var5 == 0) {
                                      break L46;
                                    } else {
                                      break L47;
                                    }
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                              var2_ref.field_n = true;
                              break L46;
                            }
                          }
                          var2_ref = (ik) (Object) ((t) this).field_w.a((byte) -64);
                          if (var5 == 0) {
                            continue L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                    }
                    ((t) this).field_o = dd.b(114) + 1000L;
                    break L43;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "t.G(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        rf var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            if (null == ((t) this).field_B) {
              return;
            } else {
              if (null != ((t) this).b((byte) 119)) {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_C = -75;
                    break L1;
                  }
                }
                var2_ref = ((t) this).field_E.c(param0 ^ -3905);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_b;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~((t) this).field_t.field_m >= ~var3) {
                                    break L7;
                                  } else {
                                    if (((t) this).field_t.field_i[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.b(4);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (0 != ((t) this).field_j[var3]) {
                                break L8;
                              } else {
                                ik discarded$2 = this.a(var3, 1, true);
                                break L8;
                              }
                            }
                            L9: {
                              if (((t) this).field_j[var3] == -1) {
                                ik discarded$3 = this.a(var3, 2, true);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((t) this).field_j[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.b(4);
                              break L5;
                            }
                          }
                          var2_ref = ((t) this).field_E.a(param0 ^ -16913);
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
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "t.H(" + param0 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        ik var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (ik) (Object) ((t) this).field_w.a((long)param0, (byte) 120);
              if (param1) {
                break L1;
              } else {
                ((t) this).d((byte) -101);
                break L1;
              }
            }
            if (null == var3) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.e(-29144);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3_ref, "t.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    t(int param0, uf param1, uf param2, eh param3, ef param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((t) this).field_w = new ih(16);
        ((t) this).field_F = 0;
        ((t) this).field_E = new rk();
        ((t) this).field_o = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((t) this).field_k = param0;
                ((t) this).field_p = param1;
                if (((t) this).field_p != null) {
                  break L2;
                } else {
                  ((t) this).field_l = false;
                  if (StarCannon.field_A == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((t) this).field_l = true;
              ((t) this).field_B = new rk();
              break L1;
            }
            L3: {
              ((t) this).field_v = param2;
              ((t) this).field_z = param8;
              ((t) this).field_i = param6;
              ((t) this).field_n = param5;
              ((t) this).field_s = param3;
              ((t) this).field_A = param7;
              ((t) this).field_y = param4;
              if (null != ((t) this).field_v) {
                ((t) this).field_m = (ik) (Object) ((t) this).field_y.a(((t) this).field_v, -80, ((t) this).field_k);
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
            stackOut_10_1 = new StringBuilder().append("t.<init>(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = -1;
        field_x = "SHIELDS - Improves the Nova Ray's shield recharge rate.";
    }
}
