/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends wf {
    private gi field_h;
    static String field_z;
    private int field_A;
    private int field_g;
    private int field_E;
    static String field_l;
    private byte[] field_w;
    static int field_y;
    static pb field_s;
    private gi field_j;
    private ki field_o;
    private byte[] field_B;
    private rk field_r;
    static boolean[] field_x;
    private uh field_f;
    static java.awt.Image field_C;
    private lh field_k;
    static String field_p;
    private fb field_q;
    private int field_m;
    private oj field_v;
    private boolean field_t;
    private oj field_u;
    private boolean field_i;
    private long field_D;
    private boolean field_n;

    private final ki a(int param0, int param1, int param2) {
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
        Object stackIn_29_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_107_0 = null;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        Object stackIn_143_0 = null;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        Object stackIn_154_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        Object stackOut_142_0 = null;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        Object stackOut_153_0 = null;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_106_0 = null;
        Object stackOut_59_0 = null;
        var10 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 == -28529) {
                break L1;
              } else {
                ((wc) this).field_f = null;
                break L1;
              }
            }
            L2: {
              var4 = (Object) (Object) (ki) (Object) ((wc) this).field_f.a((long)param1, param0 + 28538);
              if (var4 == null) {
                break L2;
              } else {
                if (param2 != 0) {
                  break L2;
                } else {
                  if (((ki) var4).field_u) {
                    break L2;
                  } else {
                    if (!((ki) var4).field_w) {
                      break L2;
                    } else {
                      ((ki) var4).c(20);
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
                  L5: {
                    if (param2 != 0) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          if (null == ((wc) this).field_h) {
                            break L7;
                          } else {
                            if (((wc) this).field_B[param1] != -1) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (!((wc) this).field_q.d(2)) {
                          var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, true, ((wc) this).field_g, true);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        } else {
                          stackOut_28_0 = null;
                          stackIn_29_0 = stackOut_28_0;
                          return (ki) (Object) stackIn_29_0;
                        }
                      }
                      var4 = (Object) (Object) ((wc) this).field_r.a(((wc) this).field_h, (byte) 90, param1);
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (param2 != 1) {
                      break L8;
                    } else {
                      if (null != ((wc) this).field_h) {
                        var4 = (Object) (Object) ((wc) this).field_r.a(((wc) this).field_h, 3, param1);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (param2 == 2) {
                    if (((wc) this).field_h == null) {
                      throw new RuntimeException();
                    } else {
                      if (((wc) this).field_B[param1] == -1) {
                        if (!((wc) this).field_q.e(-88)) {
                          var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, false, ((wc) this).field_g, true);
                          break L4;
                        } else {
                          stackOut_54_0 = null;
                          stackIn_55_0 = stackOut_54_0;
                          return (ki) (Object) stackIn_55_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((wc) this).field_f.a((gg) var4, (long)param1, 1);
                break L3;
              } else {
                break L3;
              }
            }
            if (!((ki) var4).field_w) {
              var5 = ((ki) var4).g(-27203);
              if (!(var4 instanceof el)) {
                try {
                  L9: {
                    L10: {
                      if (var5 == null) {
                        break L10;
                      } else {
                        if (2 < var5.length) {
                          nj.field_q.reset();
                          nj.field_q.update(var5, 0, var5.length + -2);
                          var6_int = (int)nj.field_q.getValue();
                          if (~var6_int != ~((wc) this).field_k.field_l[param1]) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (null == ((wc) this).field_k.field_h) {
                                break L11;
                              } else {
                                if (null != ((wc) this).field_k.field_h[param1]) {
                                  var7 = ((wc) this).field_k.field_h[param1];
                                  var8 = bc.a(param0 + 28529, 0, var5.length + -2, var5);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_126_0 = ~var8[var9];
                                      stackOut_126_1 = ~var7[var9];
                                      stackIn_147_0 = stackOut_126_0;
                                      stackIn_147_1 = stackOut_126_1;
                                      stackIn_127_0 = stackOut_126_0;
                                      stackIn_127_1 = stackOut_126_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_127_0 != stackIn_127_1) {
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
                                } else {
                                  break L11;
                                }
                              }
                            }
                            ((wc) this).field_q.field_i = 0;
                            ((wc) this).field_q.field_g = 0;
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
                    ((wc) this).field_q.b(-116);
                    ((ki) var4).c(param0 + 28549);
                    if (!((ki) var4).field_u) {
                      break L13;
                    } else {
                      if (!((wc) this).field_q.d(2)) {
                        var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, true, ((wc) this).field_g, true);
                        ((wc) this).field_f.a((gg) var4, (long)param1, 1);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  stackOut_142_0 = null;
                  stackIn_143_0 = stackOut_142_0;
                  return (ki) (Object) stackIn_143_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((wc) this).field_k.field_j[param1] >>> -1051771352);
                      var5[-1 + var5.length] = (byte)((wc) this).field_k.field_j[param1];
                      if (null == ((wc) this).field_h) {
                        break L14;
                      } else {
                        el discarded$1 = ((wc) this).field_r.a(((wc) this).field_h, -115, param1, var5);
                        stackOut_145_0 = ~((wc) this).field_B[param1];
                        stackOut_145_1 = -2;
                        stackIn_147_0 = stackOut_145_0;
                        stackIn_147_1 = stackOut_145_1;
                        break L15;
                      }
                    }
                  }
                  if (stackIn_147_0 == stackIn_147_1) {
                    break L14;
                  } else {
                    ((wc) this).field_B[param1] = (byte) 1;
                    break L14;
                  }
                }
                L16: {
                  if (((ki) var4).field_u) {
                    break L16;
                  } else {
                    ((ki) var4).c(20);
                    break L16;
                  }
                }
                stackOut_153_0 = var4;
                stackIn_154_0 = stackOut_153_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (null == var5) {
                        break L18;
                      } else {
                        if (var5.length <= 2) {
                          break L18;
                        } else {
                          nj.field_q.reset();
                          nj.field_q.update(var5, 0, -2 + var5.length);
                          var6_int = (int)nj.field_q.getValue();
                          if (var6_int == ((wc) this).field_k.field_l[param1]) {
                            L19: {
                              L20: {
                                if (((wc) this).field_k.field_h == null) {
                                  break L20;
                                } else {
                                  if (((wc) this).field_k.field_h[param1] != null) {
                                    var7 = ((wc) this).field_k.field_h[param1];
                                    var8 = bc.a(0, 0, -2 + var5.length, var5);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_80_0 = ~var7[var9];
                                        stackOut_80_1 = ~var8[var9];
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
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              stackOut_87_0 = 65280 & var5[-2 + var5.length] << 88294888;
                              stackOut_87_1 = -(var5[var5.length + -1] & 255);
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              break L19;
                            }
                            var7_int = stackIn_88_0 - stackIn_88_1;
                            if (~var7_int == ~(65535 & ((wc) this).field_k.field_j[param1])) {
                              L22: {
                                if (((wc) this).field_B[param1] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((wc) this).field_B[param1] != 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((wc) this).field_B[param1] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (((ki) var4).field_u) {
                                  break L24;
                                } else {
                                  ((ki) var4).c(20);
                                  break L24;
                                }
                              }
                              stackOut_99_0 = var4;
                              stackIn_100_0 = stackOut_99_0;
                              break L17;
                            } else {
                              throw new RuntimeException();
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
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((wc) this).field_B[param1] = (byte) -1;
                    ((ki) var4).c(20);
                    if (!((ki) var4).field_u) {
                      break L25;
                    } else {
                      if (((wc) this).field_q.d(2)) {
                        break L25;
                      } else {
                        var4 = (Object) (Object) ((wc) this).field_q.a((byte) 2, param1, true, ((wc) this).field_g, true);
                        ((wc) this).field_f.a((gg) var4, (long)param1, 1);
                        break L25;
                      }
                    }
                  }
                  stackOut_106_0 = null;
                  stackIn_107_0 = stackOut_106_0;
                  return (ki) (Object) stackIn_107_0;
                }
                return (ki) (Object) stackIn_100_0;
              }
            } else {
              stackOut_59_0 = null;
              stackIn_60_0 = stackOut_59_0;
              return (ki) (Object) stackIn_60_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw ma.a((Throwable) var4, "wc.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ki) (Object) stackIn_154_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        gg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            if (((wc) this).field_v != null) {
              if (null != ((wc) this).a(-100)) {
                L1: {
                  if (param0 == 13596) {
                    break L1;
                  } else {
                    ((wc) this).field_j = null;
                    break L1;
                  }
                }
                var2_ref = ((wc) this).field_u.b(-84);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_j;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((wc) this).field_k.field_e) {
                                    break L7;
                                  } else {
                                    if (((wc) this).field_k.field_p[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.c(20);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (0 != ((wc) this).field_B[var3]) {
                                break L8;
                              } else {
                                ki discarded$2 = this.a(-28529, var3, 1);
                                break L8;
                              }
                            }
                            L9: {
                              if (((wc) this).field_B[var3] != -1) {
                                break L9;
                              } else {
                                ki discarded$3 = this.a(-28529, var3, 2);
                                break L9;
                              }
                            }
                            if (((wc) this).field_B[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.c(20);
                              break L5;
                            }
                          }
                          var2_ref = ((wc) this).field_u.b((byte) 65);
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "wc.K(" + param0 + ')');
        }
    }

    final lh a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        lh stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_45_0 = null;
        lh stackIn_57_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_30_0 = null;
        lh stackOut_56_0 = null;
        Object stackOut_14_0 = null;
        lh stackOut_2_0 = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            if (null == ((wc) this).field_k) {
              L1: {
                if (((wc) this).field_o != null) {
                  break L1;
                } else {
                  if (((wc) this).field_q.d(2)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (lh) (Object) stackIn_11_0;
                  } else {
                    ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                    break L1;
                  }
                }
              }
              if (!((wc) this).field_o.field_w) {
                L2: {
                  var2_array = ((wc) this).field_o.g(-27203);
                  if (!(((wc) this).field_o instanceof el)) {
                    try {
                      L3: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((wc) this).field_k = new lh(var2_array, ((wc) this).field_A, ((wc) this).field_w);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var3 = decompiledCaughtException;
                          ((wc) this).field_q.b(-127);
                          ((wc) this).field_k = null;
                          if (!((wc) this).field_q.d(2)) {
                            break L5;
                          } else {
                            ((wc) this).field_o = null;
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                        break L4;
                      }
                      stackOut_44_0 = null;
                      stackIn_45_0 = stackOut_44_0;
                      return (lh) (Object) stackIn_45_0;
                    }
                    if (((wc) this).field_j == null) {
                      break L2;
                    } else {
                      el discarded$1 = ((wc) this).field_r.a(((wc) this).field_j, 106, ((wc) this).field_g, var2_array);
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (var2_array != null) {
                          ((wc) this).field_k = new lh(var2_array, ((wc) this).field_A, ((wc) this).field_w);
                          if (~((wc) this).field_k.field_r == ~((wc) this).field_E) {
                            break L6;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        L8: {
                          var3 = decompiledCaughtException;
                          ((wc) this).field_k = null;
                          if (((wc) this).field_q.d(2)) {
                            break L8;
                          } else {
                            ((wc) this).field_o = (ki) (Object) ((wc) this).field_q.a((byte) 0, ((wc) this).field_g, true, 255, true);
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((wc) this).field_o = null;
                        break L7;
                      }
                      stackOut_30_0 = null;
                      stackIn_31_0 = stackOut_30_0;
                      return (lh) (Object) stackIn_31_0;
                    }
                    break L2;
                  }
                }
                L9: {
                  ((wc) this).field_o = null;
                  if (param0 <= -8) {
                    break L9;
                  } else {
                    wc.a(false);
                    break L9;
                  }
                }
                L10: {
                  if (null != ((wc) this).field_h) {
                    ((wc) this).field_B = new byte[((wc) this).field_k.field_e];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                stackOut_56_0 = ((wc) this).field_k;
                stackIn_57_0 = stackOut_56_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (lh) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((wc) this).field_k;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "wc.B(" + param0 + ')');
        }
        return stackIn_57_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((wc) this).field_h != null) {
              L1: {
                ((wc) this).field_i = true;
                if (null != ((wc) this).field_v) {
                  break L1;
                } else {
                  ((wc) this).field_v = new oj();
                  break L1;
                }
              }
              L2: {
                if (param0 == 2) {
                  break L2;
                } else {
                  ((wc) this).d(49);
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
          throw ma.a((Throwable) (Object) var2, "wc.I(" + param0 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        ki var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            var3 = this.a(-28529, param1, 0);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                var4 = var3.g(-27203);
                var3.c(20);
                if (param0 == 35) {
                  break L1;
                } else {
                  ((wc) this).c(-36);
                  break L1;
                }
              }
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3_ref, "wc.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0, int param1) {
        ki var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (ki) (Object) ((wc) this).field_f.a((long)param1, 36);
              if (param0 == 0) {
                break L1;
              } else {
                ((wc) this).field_g = -63;
                break L1;
              }
            }
            if (null != var3) {
              stackOut_6_0 = var3.a(true);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3_ref, "wc.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            field_l = null;
            field_C = null;
            field_s = null;
            field_p = null;
            field_z = null;
            field_x = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "wc.G(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ki var2_ref = null;
        gg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_85_0 = 0;
        var5 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (((wc) this).field_v == null) {
                break L1;
              } else {
                if (null != ((wc) this).a(-94)) {
                  L2: {
                    if (!((wc) this).field_t) {
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = ((wc) this).field_v.b(-87);
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (var3 == null) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_j;
                                stackOut_7_0 = ~((wc) this).field_B[var4];
                                stackOut_7_1 = -1;
                                stackIn_19_0 = stackOut_7_0;
                                stackIn_19_1 = stackOut_7_1;
                                stackIn_8_0 = stackOut_7_0;
                                stackIn_8_1 = stackOut_7_1;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_19_0 <= stackIn_19_1) {
                                      break L5;
                                    } else {
                                      stackOut_20_0 = ((wc) this).field_k.field_p[((wc) this).field_m];
                                      stackIn_43_0 = stackOut_20_0;
                                      stackIn_21_0 = stackOut_20_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_21_0 = stackIn_21_0;
                                        stackIn_23_0 = stackOut_21_0;
                                        L8: {
                                          L9: {
                                            if (stackIn_23_0 == 0) {
                                              ((wc) this).field_m = ((wc) this).field_m + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          L10: {
                                            if (250 <= ((wc) this).field_r.field_e) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (((wc) this).field_B[((wc) this).field_m] != 0) {
                                              break L11;
                                            } else {
                                              ki discarded$4 = this.a(-28529, ((wc) this).field_m, 1);
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 == ((wc) this).field_B[((wc) this).field_m]) {
                                              var3 = new gg();
                                              var3.field_j = (long)((wc) this).field_m;
                                              var2_int = 0;
                                              ((wc) this).field_v.b(-93, var3);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((wc) this).field_m = ((wc) this).field_m + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_18_0 = ((wc) this).field_k.field_p.length;
                                        stackOut_18_1 = ((wc) this).field_m;
                                        stackIn_19_0 = stackOut_18_0;
                                        stackIn_19_1 = stackOut_18_1;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_8_0 == stackIn_8_1) {
                                      ki discarded$5 = this.a(-28529, var4, 1);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((wc) this).field_B[var4] != 0) {
                                        break L15;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var3.c(20);
                                    break L14;
                                  }
                                  var3 = ((wc) this).field_v.b((byte) -113);
                                  if (var5 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_18_0 = ((wc) this).field_k.field_p.length;
                              stackOut_18_1 = ((wc) this).field_m;
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              if (stackIn_19_0 <= stackIn_19_1) {
                                break L5;
                              } else {
                                stackOut_20_0 = ((wc) this).field_k.field_p[((wc) this).field_m];
                                stackIn_43_0 = stackOut_20_0;
                                stackIn_21_0 = stackOut_20_0;
                                if (var5 != 0) {
                                  break L4;
                                } else {
                                  stackOut_21_0 = stackIn_21_0;
                                  stackIn_23_0 = stackOut_21_0;
                                  L17: {
                                    if (stackIn_23_0 == 0) {
                                      ((wc) this).field_m = ((wc) this).field_m + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (250 <= ((wc) this).field_r.field_e) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (((wc) this).field_B[((wc) this).field_m] != 0) {
                                      break L19;
                                    } else {
                                      ki discarded$4 = this.a(-28529, ((wc) this).field_m, 1);
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 == ((wc) this).field_B[((wc) this).field_m]) {
                                      var3 = new gg();
                                      var3.field_j = (long)((wc) this).field_m;
                                      var2_int = 0;
                                      ((wc) this).field_v.b(-93, var3);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((wc) this).field_m = ((wc) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_42_0 = var2_int;
                          stackIn_43_0 = stackOut_42_0;
                          break L4;
                        }
                        L21: {
                          if (stackIn_43_0 == 0) {
                            break L21;
                          } else {
                            ((wc) this).field_m = 0;
                            ((wc) this).field_t = false;
                            break L21;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L22: {
                    if (!((wc) this).field_i) {
                      break L22;
                    } else {
                      var2_int = 1;
                      var3 = ((wc) this).field_v.b(-125);
                      L23: while (true) {
                        L24: {
                          L25: {
                            L26: {
                              if (var3 == null) {
                                break L26;
                              } else {
                                var4 = (int)var3.field_j;
                                stackOut_52_0 = -2;
                                stackOut_52_1 = ~((wc) this).field_B[var4];
                                stackIn_65_0 = stackOut_52_0;
                                stackIn_65_1 = stackOut_52_1;
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                if (var5 != 0) {
                                  L27: while (true) {
                                    if (stackIn_65_0 <= stackIn_65_1) {
                                      break L25;
                                    } else {
                                      stackOut_66_0 = ~((wc) this).field_k.field_p[((wc) this).field_m];
                                      stackIn_86_0 = stackOut_66_0;
                                      stackIn_67_0 = stackOut_66_0;
                                      if (var5 != 0) {
                                        break L24;
                                      } else {
                                        stackOut_67_0 = stackIn_67_0;
                                        stackIn_69_0 = stackOut_67_0;
                                        L28: {
                                          L29: {
                                            if (stackIn_69_0 == -1) {
                                              ((wc) this).field_m = ((wc) this).field_m + 1;
                                              if (var5 == 0) {
                                                break L28;
                                              } else {
                                                break L29;
                                              }
                                            } else {
                                              break L29;
                                            }
                                          }
                                          L30: {
                                            if (!((wc) this).field_q.e(-105)) {
                                              break L30;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L25;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          L31: {
                                            if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                              break L31;
                                            } else {
                                              ki discarded$6 = this.a(-28529, ((wc) this).field_m, 2);
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                              break L32;
                                            } else {
                                              var3 = new gg();
                                              var3.field_j = (long)((wc) this).field_m;
                                              var2_int = 0;
                                              ((wc) this).field_v.b(-80, var3);
                                              break L32;
                                            }
                                          }
                                          ((wc) this).field_m = ((wc) this).field_m + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        stackOut_64_0 = ~((wc) this).field_m;
                                        stackOut_64_1 = ~((wc) this).field_k.field_p.length;
                                        stackIn_65_0 = stackOut_64_0;
                                        stackIn_65_1 = stackOut_64_1;
                                        continue L27;
                                      }
                                    }
                                  }
                                } else {
                                  L33: {
                                    if (stackIn_53_0 == stackIn_53_1) {
                                      break L33;
                                    } else {
                                      ki discarded$7 = this.a(-28529, var4, 2);
                                      break L33;
                                    }
                                  }
                                  L34: {
                                    L35: {
                                      if (((wc) this).field_B[var4] != 1) {
                                        break L35;
                                      } else {
                                        var3.c(20);
                                        if (var5 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L34;
                                  }
                                  var3 = ((wc) this).field_v.b((byte) -44);
                                  if (var5 == 0) {
                                    continue L23;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            L36: while (true) {
                              stackOut_64_0 = ~((wc) this).field_m;
                              stackOut_64_1 = ~((wc) this).field_k.field_p.length;
                              stackIn_65_0 = stackOut_64_0;
                              stackIn_65_1 = stackOut_64_1;
                              if (stackIn_65_0 <= stackIn_65_1) {
                                break L25;
                              } else {
                                stackOut_66_0 = ~((wc) this).field_k.field_p[((wc) this).field_m];
                                stackIn_86_0 = stackOut_66_0;
                                stackIn_67_0 = stackOut_66_0;
                                if (var5 != 0) {
                                  break L24;
                                } else {
                                  stackOut_67_0 = stackIn_67_0;
                                  stackIn_69_0 = stackOut_67_0;
                                  L37: {
                                    if (stackIn_69_0 == -1) {
                                      ((wc) this).field_m = ((wc) this).field_m + 1;
                                      if (var5 == 0) {
                                        continue L36;
                                      } else {
                                        break L37;
                                      }
                                    } else {
                                      break L37;
                                    }
                                  }
                                  L38: {
                                    if (!((wc) this).field_q.e(-105)) {
                                      break L38;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                  L39: {
                                    if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                      break L39;
                                    } else {
                                      ki discarded$6 = this.a(-28529, ((wc) this).field_m, 2);
                                      break L39;
                                    }
                                  }
                                  L40: {
                                    if (((wc) this).field_B[((wc) this).field_m] == 1) {
                                      break L40;
                                    } else {
                                      var3 = new gg();
                                      var3.field_j = (long)((wc) this).field_m;
                                      var2_int = 0;
                                      ((wc) this).field_v.b(-80, var3);
                                      break L40;
                                    }
                                  }
                                  ((wc) this).field_m = ((wc) this).field_m + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_85_0 = var2_int;
                          stackIn_86_0 = stackOut_85_0;
                          break L24;
                        }
                        L41: {
                          if (stackIn_86_0 == 0) {
                            break L41;
                          } else {
                            ((wc) this).field_m = 0;
                            ((wc) this).field_i = false;
                            break L41;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  ((wc) this).field_v = null;
                  break L1;
                } else {
                  return;
                }
              }
            }
            if (!param0) {
              L42: {
                if (!((wc) this).field_n) {
                  break L42;
                } else {
                  if (ih.a((byte) -98) >= ((wc) this).field_D) {
                    var2_ref = (ki) (Object) ((wc) this).field_f.a((byte) 104);
                    L43: while (true) {
                      L44: {
                        if (null == var2_ref) {
                          break L44;
                        } else {
                          if (var5 != 0) {
                            break L42;
                          } else {
                            L45: {
                              L46: {
                                if (!var2_ref.field_w) {
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
                                if (var2_ref.field_y) {
                                  break L47;
                                } else {
                                  var2_ref.field_y = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              if (var2_ref.field_u) {
                                var2_ref.c(20);
                                break L45;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                            var2_ref = (ki) (Object) ((wc) this).field_f.b((byte) 118);
                            if (var5 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      ((wc) this).field_D = 1000L + ih.a((byte) -98);
                      break L42;
                    }
                  } else {
                    break L42;
                  }
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
          throw ma.a((Throwable) (Object) var2, "wc.H(" + param0 + ')');
        }
    }

    wc(int param0, gi param1, gi param2, fb param3, rk param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((wc) this).field_f = new uh(16);
        ((wc) this).field_m = 0;
        ((wc) this).field_u = new oj();
        ((wc) this).field_D = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((wc) this).field_g = param0;
                ((wc) this).field_h = param1;
                if (((wc) this).field_h == null) {
                  break L2;
                } else {
                  ((wc) this).field_t = true;
                  ((wc) this).field_v = new oj();
                  if (stellarshard.field_B == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((wc) this).field_t = false;
              break L1;
            }
            L3: {
              ((wc) this).field_E = param7;
              ((wc) this).field_A = param5;
              ((wc) this).field_j = param2;
              ((wc) this).field_n = param8;
              ((wc) this).field_w = param6;
              ((wc) this).field_q = param3;
              ((wc) this).field_r = param4;
              if (null != ((wc) this).field_j) {
                ((wc) this).field_o = (ki) (Object) ((wc) this).field_r.a(((wc) this).field_j, (byte) 101, ((wc) this).field_g);
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
            stackOut_10_1 = new StringBuilder().append("wc.<init>(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Quit to website";
        field_x = new boolean[64];
        field_l = " of 50<br>Current score : ";
        field_p = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
