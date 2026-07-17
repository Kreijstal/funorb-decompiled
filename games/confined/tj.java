/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends tk {
    private pc field_o;
    static String field_E;
    private int field_u;
    private byte[] field_B;
    static al field_n;
    private byte[] field_p;
    private rl field_y;
    private vh field_i;
    private int field_x;
    private ae field_v;
    private ae field_s;
    static int[] field_z;
    static int[][] field_l;
    static String field_F;
    private int field_D;
    static int[] field_A;
    private we field_h;
    private jf field_q;
    private boolean field_m;
    private mn field_r;
    private int field_j;
    private boolean field_k;
    private mn field_C;
    private long field_t;
    private boolean field_w;

    final int a(int param0, boolean param1) {
        rl var3 = (rl) (Object) ((tj) this).field_i.a(1, (long)param0);
        if (!param1) {
            Object var4 = null;
            tj.a(17, (String) null, (String) null);
        }
        if (var3 != null) {
            return var3.f((byte) 100);
        }
        return 0;
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 != -1) {
            return;
        }
        try {
            if (null != ki.field_c) {
                ki.field_c.n(10);
            }
            om.field_p = new w(param1, param2, false, true, true);
            dn.field_b.a((fj) (Object) om.field_p, (byte) -72);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "tj.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final rl a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        byte stackIn_82_0 = 0;
        byte stackIn_82_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        Object stackIn_95_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        Object stackOut_94_0 = null;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        L0: {
          var10 = Confined.field_J ? 1 : 0;
          var4 = (Object) (Object) (rl) (Object) ((tj) this).field_i.a(param0 + -13859, (long)param2);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((rl) var4).field_t) {
                break L0;
              } else {
                if (!((rl) var4).field_v) {
                  break L0;
                } else {
                  ((rl) var4).a(true);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              L3: {
                if (0 != param1) {
                  break L3;
                } else {
                  L4: {
                    if (((tj) this).field_s == null) {
                      break L4;
                    } else {
                      if (-1 == ((tj) this).field_p[param2]) {
                        break L4;
                      } else {
                        var4 = (Object) (Object) ((tj) this).field_o.a(param2, ((tj) this).field_s, (byte) 53);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (!((tj) this).field_q.c(93)) {
                    var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, true, -1911606496, param2, (byte) 2);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return null;
                  }
                }
              }
              L5: {
                if (param1 != 1) {
                  break L5;
                } else {
                  if (null == ((tj) this).field_s) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((tj) this).field_o.a(((tj) this).field_s, 0, param2);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (param1 == 2) {
                if (((tj) this).field_s == null) {
                  throw new RuntimeException();
                } else {
                  if (-1 == ((tj) this).field_p[param2]) {
                    if (!((tj) this).field_q.b(-125)) {
                      var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, false, -1911606496, param2, (byte) 2);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                throw new RuntimeException();
              }
            }
            ((tj) this).field_i.a((rk) var4, param0 ^ 13871, (long)param2);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((rl) var4).field_v) {
          L6: {
            var5 = ((rl) var4).e((byte) 94);
            if (param0 == 13860) {
              break L6;
            } else {
              we discarded$2 = ((tj) this).a((byte) 127);
              break L6;
            }
          }
          if (var4 instanceof sm) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      al.field_e.reset();
                      al.field_e.update(var5, 0, -2 + var5.length);
                      var6_int = (int)al.field_e.getValue();
                      if (var6_int != ((tj) this).field_h.field_l[param2]) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (null == ((tj) this).field_h.field_d) {
                              break L10;
                            } else {
                              if (((tj) this).field_h.field_d[param2] != null) {
                                var7_ref_byte__ = ((tj) this).field_h.field_d[param2];
                                var8 = in.a(0, var5, var5.length + -2, -26879);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_81_0 = var7_ref_byte__[var9];
                                    stackOut_81_1 = var8[var9];
                                    stackIn_86_0 = stackOut_81_0;
                                    stackIn_86_1 = stackOut_81_1;
                                    stackIn_82_0 = stackOut_81_0;
                                    stackIn_82_1 = stackOut_81_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_82_0 == stackIn_82_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_85_0 = var5[var5.length + -1] & 255;
                          stackOut_85_1 = (var5[var5.length + -2] & 255) << 8;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          break L9;
                        }
                        var7 = stackIn_86_0 + stackIn_86_1;
                        if (var7 == (((tj) this).field_h.field_o[param2] & 65535)) {
                          L12: {
                            if (((tj) this).field_p[param2] == 1) {
                              break L12;
                            } else {
                              L13: {
                                if (((tj) this).field_p[param2] != 0) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((tj) this).field_p[param2] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (((rl) var4).field_t) {
                              break L14;
                            } else {
                              ((rl) var4).a(true);
                              break L14;
                            }
                          }
                          stackOut_94_0 = var4;
                          stackIn_95_0 = stackOut_94_0;
                          break L7;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L15: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((tj) this).field_p[param2] = (byte) -1;
                ((rl) var4).a(true);
                if (((rl) var4).field_t) {
                  if (!((tj) this).field_q.c(92)) {
                    var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, true, -1911606496, param2, (byte) 2);
                    ((tj) this).field_i.a((rk) var4, 11, (long)param2);
                    break L15;
                  } else {
                    return null;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            return (rl) (Object) stackIn_95_0;
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (var5.length > 2) {
                      al.field_e.reset();
                      al.field_e.update(var5, 0, var5.length + -2);
                      var6_int = (int)al.field_e.getValue();
                      if (~var6_int == ~((tj) this).field_h.field_l[param2]) {
                        L18: {
                          L19: {
                            if (null == ((tj) this).field_h.field_d) {
                              break L19;
                            } else {
                              if (null != ((tj) this).field_h.field_d[param2]) {
                                var7_ref_byte__ = ((tj) this).field_h.field_d[param2];
                                var8 = in.a(0, var5, var5.length - 2, -26879);
                                var9 = 0;
                                L20: while (true) {
                                  if (var9 >= 64) {
                                    break L19;
                                  } else {
                                    stackOut_47_0 = var7_ref_byte__[var9];
                                    stackOut_47_1 = var8[var9];
                                    stackIn_62_0 = stackOut_47_0;
                                    stackIn_62_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L16;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                ((tj) this).field_q.field_a = 0;
                                ((tj) this).field_q.field_e = 0;
                                break L18;
                              }
                            }
                          }
                          ((tj) this).field_q.field_a = 0;
                          ((tj) this).field_q.field_e = 0;
                          break L18;
                        }
                        decompiledRegionSelector0 = 0;
                        break L16;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              ((tj) this).field_q.a(true);
              ((rl) var4).a(true);
              if (((rl) var4).field_t) {
                L21: {
                  if (!((tj) this).field_q.c(param0 + -13755)) {
                    var4 = (Object) (Object) ((tj) this).field_q.a(((tj) this).field_u, true, -1911606496, param2, (byte) 2);
                    ((tj) this).field_i.a((rk) var4, 11, (long)param2);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L22: {
              L23: {
                if (decompiledRegionSelector0 == 0) {
                  var5[var5.length + -2] = (byte)(((tj) this).field_h.field_o[param2] >>> 8);
                  var5[var5.length - 1] = (byte)((tj) this).field_h.field_o[param2];
                  if (((tj) this).field_s != null) {
                    sm discarded$3 = ((tj) this).field_o.a(((tj) this).field_s, -127, var5, param2);
                    stackOut_61_0 = ~((tj) this).field_p[param2];
                    stackOut_61_1 = -2;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    break L23;
                  } else {
                    break L22;
                  }
                } else {
                  break L23;
                }
              }
              if (stackIn_62_0 != stackIn_62_1) {
                ((tj) this).field_p[param2] = (byte) 1;
                break L22;
              } else {
                break L22;
              }
            }
            L24: {
              if (!((rl) var4).field_t) {
                ((rl) var4).a(true);
                break L24;
              } else {
                break L24;
              }
            }
            return (rl) var4;
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, int param1) {
        rl var3 = this.a(13860, param1, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e((byte) 119);
        var3.a(true);
        return var4;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        fn.f(-1 + param4, param1 + -1, param3 - 1, -1 + param5, param0);
        fn.f(param4, param1 + -1, param3, -1 + param5, param0);
        fn.f(param4 + -1, param1, param3 - 1, param5, param0);
        if (param2 <= 13) {
            field_l = null;
        }
        fn.f(param4, param1, param3, param5, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
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
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = param2 - -param4;
            if (param1 == 1) {
              L1: {
                var6 = param3 + param0;
                if (param2 > fn.field_c) {
                  stackOut_5_0 = param2;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = fn.field_c;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (param3 <= fn.field_b) {
                  stackOut_8_0 = fn.field_b;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = param3;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (var5_int >= fn.field_i) {
                  stackOut_11_0 = fn.field_i;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = var5_int;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (var6 >= fn.field_j) {
                  stackOut_14_0 = fn.field_j;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = var6;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        var10 = stackIn_15_0;
                        if (fn.field_c > param2) {
                          break L9;
                        } else {
                          if (~fn.field_i >= ~param2) {
                            break L9;
                          } else {
                            var11 = param2 + fn.field_g * var8;
                            var12 = 1 - (-var10 + var8) >> 1;
                            L10: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L9;
                              } else {
                                fn.field_h[var11] = 16777215;
                                var11 = var11 + 2 * fn.field_g;
                                if (var13 != 0) {
                                  break L8;
                                } else {
                                  if (var13 == 0) {
                                    continue L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (~fn.field_b < ~param3) {
                        break L8;
                      } else {
                        if (fn.field_j > var6) {
                          var11 = var7 + fn.field_g * param3;
                          var12 = var9 + (1 + -var7) >> 1;
                          L11: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L8;
                            } else {
                              fn.field_h[var11] = 16777215;
                              var11 += 2;
                              if (var13 != 0) {
                                break L7;
                              } else {
                                if (var13 == 0) {
                                  continue L11;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (~fn.field_c < ~var5_int) {
                      break L7;
                    } else {
                      if (fn.field_i <= var5_int) {
                        break L7;
                      } else {
                        var11 = fn.field_g * ((1 & -param2 + var5_int) + var8) + var5_int;
                        var12 = 1 - (-var10 + var8) >> 1;
                        L12: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L7;
                          } else {
                            fn.field_h[var11] = 16777215;
                            var11 = var11 + fn.field_g * 2;
                            if (var13 != 0) {
                              break L6;
                            } else {
                              if (var13 == 0) {
                                continue L12;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param3 < fn.field_b) {
                    break L6;
                  } else {
                    if (fn.field_j <= var6) {
                      break L6;
                    } else {
                      var11 = (1 & -param3 + var6) + var7 + fn.field_g * var6;
                      var12 = -var7 + 1 + var9 >> 1;
                      L13: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L6;
                        } else {
                          fn.field_h[var11] = 16777215;
                          var11 += 2;
                          if (var13 != 0) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (var13 == 0) {
                              continue L13;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L5;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var5, "tj.L(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        rk var3 = null;
        rl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        L0: {
          L1: {
            var5 = Confined.field_J ? 1 : 0;
            if (((tj) this).field_r != null) {
              if (((tj) this).a((byte) -61) == null) {
                return;
              } else {
                L2: {
                  if (((tj) this).field_m) {
                    break L2;
                  } else {
                    L3: {
                      if (!((tj) this).field_k) {
                        break L3;
                      } else {
                        var2 = 1;
                        var3 = ((tj) this).field_r.a(87);
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 == null) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_i;
                                  stackOut_9_0 = ~((tj) this).field_p[var4];
                                  stackOut_9_1 = -2;
                                  stackIn_19_0 = stackOut_9_0;
                                  stackIn_19_1 = stackOut_9_1;
                                  stackIn_10_0 = stackOut_9_0;
                                  stackIn_10_1 = stackOut_9_1;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_19_0 <= stackIn_19_1) {
                                        break L6;
                                      } else {
                                        stackOut_20_0 = ((tj) this).field_h.field_t[((tj) this).field_j];
                                        stackIn_34_0 = stackOut_20_0;
                                        stackIn_21_0 = stackOut_20_0;
                                        if (var5 != 0) {
                                          break L5;
                                        } else {
                                          L9: {
                                            L10: {
                                              if (stackIn_21_0 == 0) {
                                                ((tj) this).field_j = ((tj) this).field_j + 1;
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
                                              if (((tj) this).field_q.b(-124)) {
                                                var2 = 0;
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
                                              if (((tj) this).field_p[((tj) this).field_j] == 1) {
                                                break L12;
                                              } else {
                                                rl discarded$6 = this.a(13860, 2, ((tj) this).field_j);
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (((tj) this).field_p[((tj) this).field_j] != 1) {
                                                var3 = new rk();
                                                var3.field_i = (long)((tj) this).field_j;
                                                ((tj) this).field_r.a(var3, (byte) -84);
                                                var2 = 0;
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            ((tj) this).field_j = ((tj) this).field_j + 1;
                                            if (var5 == 0) {
                                              break L9;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          stackOut_18_0 = ~((tj) this).field_j;
                                          stackOut_18_1 = ~((tj) this).field_h.field_t.length;
                                          stackIn_19_0 = stackOut_18_0;
                                          stackIn_19_1 = stackOut_18_1;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (stackIn_10_0 != stackIn_10_1) {
                                        rl discarded$7 = this.a(13860, 2, var4);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (((tj) this).field_p[var4] == 1) {
                                          break L16;
                                        } else {
                                          var2 = 0;
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
                                    var3 = ((tj) this).field_r.d(2123);
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L17: while (true) {
                                stackOut_131_0 = ~((tj) this).field_j;
                                stackOut_131_1 = ~((tj) this).field_h.field_t.length;
                                stackIn_129_0 = stackOut_131_0;
                                stackIn_129_1 = stackOut_131_1;
                                if (stackIn_129_0 <= stackIn_129_1) {
                                  break L6;
                                } else {
                                  stackOut_127_0 = ((tj) this).field_h.field_t[((tj) this).field_j];
                                  stackIn_34_0 = stackOut_127_0;
                                  stackIn_128_0 = stackOut_127_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    stackOut_128_0 = stackIn_128_0;
                                    stackIn_125_0 = stackOut_128_0;
                                    L18: {
                                      if (stackIn_125_0 == 0) {
                                        ((tj) this).field_j = ((tj) this).field_j + 1;
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
                                      if (((tj) this).field_q.b(-124)) {
                                        var2 = 0;
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
                                      if (((tj) this).field_p[((tj) this).field_j] == 1) {
                                        break L20;
                                      } else {
                                        rl discarded$8 = this.a(13860, 2, ((tj) this).field_j);
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (((tj) this).field_p[((tj) this).field_j] != 1) {
                                        var3 = new rk();
                                        var3.field_i = (long)((tj) this).field_j;
                                        ((tj) this).field_r.a(var3, (byte) -84);
                                        var2 = 0;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    ((tj) this).field_j = ((tj) this).field_j + 1;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_33_0 = var2;
                            stackIn_34_0 = stackOut_33_0;
                            break L5;
                          }
                          L22: {
                            if (stackIn_34_0 != 0) {
                              ((tj) this).field_k = false;
                              ((tj) this).field_j = 0;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ((tj) this).field_r = null;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = 1;
                var3 = ((tj) this).field_r.a(-125);
                L23: while (true) {
                  L24: {
                    L25: {
                      if (var3 == null) {
                        break L25;
                      } else {
                        var4 = (int)var3.field_i;
                        stackOut_42_0 = ~((tj) this).field_p[var4];
                        stackOut_42_1 = -1;
                        stackIn_51_0 = stackOut_42_0;
                        stackIn_51_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (var5 != 0) {
                          L26: while (true) {
                            if (stackIn_51_0 >= stackIn_51_1) {
                              break L24;
                            } else {
                              stackOut_52_0 = ~((tj) this).field_h.field_t[((tj) this).field_j];
                              stackOut_52_1 = -1;
                              stackIn_68_0 = stackOut_52_0;
                              stackIn_68_1 = stackOut_52_1;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                L27: {
                                  L28: {
                                    if (stackIn_53_0 == stackIn_53_1) {
                                      ((tj) this).field_j = ((tj) this).field_j + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    } else {
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (((tj) this).field_o.field_b >= 250) {
                                      var2 = 0;
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
                                    if (((tj) this).field_p[((tj) this).field_j] != 0) {
                                      break L30;
                                    } else {
                                      rl discarded$9 = this.a(13860, 1, ((tj) this).field_j);
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (0 == ((tj) this).field_p[((tj) this).field_j]) {
                                      var3 = new rk();
                                      var3.field_i = (long)((tj) this).field_j;
                                      ((tj) this).field_r.a(var3, (byte) -98);
                                      var2 = 0;
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  ((tj) this).field_j = ((tj) this).field_j + 1;
                                  if (var5 == 0) {
                                    break L27;
                                  } else {
                                    break L24;
                                  }
                                }
                                stackOut_50_0 = ((tj) this).field_j;
                                stackOut_50_1 = ((tj) this).field_h.field_t.length;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                continue L26;
                              }
                            }
                          }
                        } else {
                          L32: {
                            if (stackIn_43_0 != stackIn_43_1) {
                              break L32;
                            } else {
                              rl discarded$10 = this.a(13860, 1, var4);
                              break L32;
                            }
                          }
                          L33: {
                            L34: {
                              if (((tj) this).field_p[var4] != 0) {
                                break L34;
                              } else {
                                var2 = 0;
                                if (var5 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            var3.a(true);
                            break L33;
                          }
                          var3 = ((tj) this).field_r.d(2123);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    L35: while (true) {
                      stackOut_107_0 = ((tj) this).field_j;
                      stackOut_107_1 = ((tj) this).field_h.field_t.length;
                      stackIn_105_0 = stackOut_107_0;
                      stackIn_105_1 = stackOut_107_1;
                      if (stackIn_105_0 >= stackIn_105_1) {
                        break L24;
                      } else {
                        stackOut_103_0 = ~((tj) this).field_h.field_t[((tj) this).field_j];
                        stackOut_103_1 = -1;
                        stackIn_68_0 = stackOut_103_0;
                        stackIn_68_1 = stackOut_103_1;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          stackOut_104_0 = stackIn_104_0;
                          stackOut_104_1 = stackIn_104_1;
                          stackIn_101_0 = stackOut_104_0;
                          stackIn_101_1 = stackOut_104_1;
                          L36: {
                            if (stackIn_101_0 == stackIn_101_1) {
                              ((tj) this).field_j = ((tj) this).field_j + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L36;
                              }
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (((tj) this).field_o.field_b >= 250) {
                              var2 = 0;
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
                            if (((tj) this).field_p[((tj) this).field_j] != 0) {
                              break L38;
                            } else {
                              rl discarded$11 = this.a(13860, 1, ((tj) this).field_j);
                              break L38;
                            }
                          }
                          L39: {
                            if (0 == ((tj) this).field_p[((tj) this).field_j]) {
                              var3 = new rk();
                              var3.field_i = (long)((tj) this).field_j;
                              ((tj) this).field_r.a(var3, (byte) -98);
                              var2 = 0;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          ((tj) this).field_j = ((tj) this).field_j + 1;
                          if (var5 == 0) {
                            continue L35;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L1;
                  } else {
                    ((tj) this).field_m = false;
                    ((tj) this).field_j = 0;
                    break L1;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_67_0 = -50;
          stackOut_67_1 = (-13 - param0) / 63;
          stackIn_68_0 = stackOut_67_0;
          stackIn_68_1 = stackOut_67_1;
          break L0;
        }
        L40: {
          var2 = stackIn_68_0 / stackIn_68_1;
          if (!((tj) this).field_w) {
            break L40;
          } else {
            if (((tj) this).field_t <= ri.a(-3)) {
              var3_ref = (rl) (Object) ((tj) this).field_i.a(true);
              L41: while (true) {
                L42: {
                  L43: {
                    if (var3_ref == null) {
                      break L43;
                    } else {
                      if (var5 != 0) {
                        break L42;
                      } else {
                        L44: {
                          if (var3_ref.field_v) {
                            break L44;
                          } else {
                            L45: {
                              if (!var3_ref.field_w) {
                                break L45;
                              } else {
                                if (var3_ref.field_t) {
                                  var3_ref.a(true);
                                  if (var5 == 0) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                            var3_ref.field_w = true;
                            break L44;
                          }
                        }
                        var3_ref = (rl) (Object) ((tj) this).field_i.a(70);
                        if (var5 == 0) {
                          continue L41;
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                  ((tj) this).field_t = ri.a(-3) - -1000L;
                  break L42;
                }
                break L40;
              }
            } else {
              break L40;
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param1 == 480) {
          L0: {
            L1: {
              if (0 >= sg.field_x) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (null == gg.field_m) {
                      break L3;
                    } else {
                      dn.field_d = gg.field_m.a(20742);
                      jk.a(2, false);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  dn.field_d = id.a(2401, ki.field_d, 640, 0, 0, 480);
                  break L2;
                }
                L4: {
                  if (dn.field_d == null) {
                    break L4;
                  } else {
                    ac.a((java.awt.Canvas) (Object) dn.field_d, (byte) -79);
                    var2 = 2;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                var2 = 3;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (!tj.a(true)) {
                break L5;
              } else {
                var2 = 0;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            var2 = 1;
            break L0;
          }
          L6: {
            if (null != gg.field_m) {
              break L6;
            } else {
              if (eh.field_gb) {
                q.a(var2, param0, (byte) -107);
                break L6;
              } else {
                break L6;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final we a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        if (null == ((tj) this).field_h) {
          L0: {
            if (null == ((tj) this).field_y) {
              if (!((tj) this).field_q.c(91)) {
                ((tj) this).field_y = (rl) (Object) ((tj) this).field_q.a(255, true, -1911606496, ((tj) this).field_u, (byte) 0);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (param0 < -26) {
            if (!((tj) this).field_y.field_v) {
              L1: {
                var5 = ((tj) this).field_y.e((byte) 116);
                var2 = var5;
                if (!(((tj) this).field_y instanceof sm)) {
                  try {
                    L2: {
                      if (var5 != null) {
                        ((tj) this).field_h = new we(var5, ((tj) this).field_x, ((tj) this).field_B);
                        break L2;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      ((tj) this).field_q.a(true);
                      ((tj) this).field_h = null;
                      if (((tj) this).field_q.c(-45)) {
                        break L3;
                      } else {
                        ((tj) this).field_y = (rl) (Object) ((tj) this).field_q.a(255, true, -1911606496, ((tj) this).field_u, (byte) 0);
                        if (var4 != 0) {
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((tj) this).field_y = null;
                    return null;
                  }
                  if (null == ((tj) this).field_v) {
                    break L1;
                  } else {
                    sm discarded$1 = ((tj) this).field_o.a(((tj) this).field_v, -123, var5, ((tj) this).field_u);
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((tj) this).field_h = new we(var5, ((tj) this).field_x, ((tj) this).field_B);
                        if (~((tj) this).field_h.field_m == ~((tj) this).field_D) {
                          break L4;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((tj) this).field_h = null;
                      if (!((tj) this).field_q.c(-69)) {
                        break L5;
                      } else {
                        ((tj) this).field_y = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((tj) this).field_y = (rl) (Object) ((tj) this).field_q.a(255, true, -1911606496, ((tj) this).field_u, (byte) 0);
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                ((tj) this).field_y = null;
                if (((tj) this).field_s != null) {
                  ((tj) this).field_p = new byte[((tj) this).field_h.field_i];
                  break L6;
                } else {
                  break L6;
                }
              }
              return ((tj) this).field_h;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((tj) this).field_h;
        }
    }

    final void c(byte param0) {
        rk var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (((tj) this).field_r == null) {
          return;
        } else {
          if (((tj) this).a((byte) -49) == null) {
            return;
          } else {
            if (param0 < -106) {
              var2 = ((tj) this).field_C.a(-115);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_i;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if (var3 < 0) {
                              break L4;
                            } else {
                              if (((tj) this).field_h.field_i <= var3) {
                                break L4;
                              } else {
                                if (((tj) this).field_h.field_t[var3] != 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.a(true);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (((tj) this).field_p[var3] != 0) {
                            break L5;
                          } else {
                            rl discarded$4 = this.a(13860, 1, var3);
                            break L5;
                          }
                        }
                        L6: {
                          if (((tj) this).field_p[var3] == -1) {
                            rl discarded$5 = this.a(13860, 2, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (((tj) this).field_p[var3] != 1) {
                          break L2;
                        } else {
                          var2.a(true);
                          break L2;
                        }
                      }
                      var2 = ((tj) this).field_C.d(2123);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_n = null;
        field_l = null;
        int var1 = 115 % ((param0 - -31) / 61);
        field_E = null;
        field_F = null;
        field_A = null;
    }

    final void b(int param0) {
        if (null == ((tj) this).field_s) {
            return;
        }
        ((tj) this).field_k = true;
        if (param0 != -2) {
            field_A = null;
        }
        if (!(null != ((tj) this).field_r)) {
            ((tj) this).field_r = new mn();
        }
    }

    final static boolean a(boolean param0) {
        return fd.field_j;
    }

    tj(int param0, ae param1, ae param2, jf param3, pc param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((tj) this).field_i = new vh(16);
        ((tj) this).field_j = 0;
        ((tj) this).field_C = new mn();
        ((tj) this).field_t = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((tj) this).field_u = param0;
                ((tj) this).field_s = param1;
                if (((tj) this).field_s == null) {
                  break L2;
                } else {
                  ((tj) this).field_m = true;
                  ((tj) this).field_r = new mn();
                  if (!Confined.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((tj) this).field_m = false;
              break L1;
            }
            L3: {
              ((tj) this).field_q = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((tj) this).field_w = stackIn_7_1 != 0;
              ((tj) this).field_o = param4;
              ((tj) this).field_x = param5;
              ((tj) this).field_v = param2;
              ((tj) this).field_D = param7;
              ((tj) this).field_B = param6;
              if (((tj) this).field_v == null) {
                break L4;
              } else {
                ((tj) this).field_y = (rl) (Object) ((tj) this).field_o.a(((tj) this).field_u, ((tj) this).field_v, (byte) 53);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("tj.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "If you get it right, the bolt of#energy it delivers is devastating.#Do not fly through the explosion!";
        field_n = new al("usename");
        field_F = "Extra lives";
        field_A = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_z = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
