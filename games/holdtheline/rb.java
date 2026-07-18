/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ff {
    static int field_m;
    private int field_k;
    static float field_g;
    private og field_w;
    private byte[] field_z;
    private qb field_n;
    private int field_h;
    private ca field_s;
    private sk field_y;
    private byte[] field_o;
    private int field_q;
    private sk field_d;
    private kn field_v;
    static int field_x;
    static int[] field_p;
    private wj field_A;
    private int field_l;
    private boolean field_e;
    static int field_t;
    private ah field_j;
    private boolean field_f;
    private ah field_r;
    static String field_B;
    private long field_i;
    private boolean field_u;

    private final ca a(int param0, int param1, int param2) {
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
        Object stackIn_45_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_109_0 = null;
        byte stackIn_126_0 = 0;
        byte stackIn_126_1 = 0;
        Object stackIn_142_0 = null;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        Object stackIn_154_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_53_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_61_0 = null;
        byte stackOut_125_0 = 0;
        byte stackOut_125_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        Object stackOut_153_0 = null;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_108_0 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (ca) (Object) ((rb) this).field_w.a((byte) 122, (long)param2);
              if (param1 >= 48) {
                break L1;
              } else {
                ((rb) this).field_z = null;
                break L1;
              }
            }
            L2: {
              if (null == var4) {
                break L2;
              } else {
                if (param0 != 0) {
                  break L2;
                } else {
                  if (((ca) var4).field_t) {
                    break L2;
                  } else {
                    if (((ca) var4).field_u) {
                      ((ca) var4).d(0);
                      var4 = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (var4 != null) {
                break L3;
              } else {
                L4: {
                  if (param0 == 0) {
                    L5: {
                      L6: {
                        if (((rb) this).field_d == null) {
                          break L6;
                        } else {
                          if (-1 != ((rb) this).field_o[param2]) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (!((rb) this).field_A.c(92)) {
                        var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      } else {
                        stackOut_53_0 = null;
                        stackIn_54_0 = stackOut_53_0;
                        return (ca) (Object) stackIn_54_0;
                      }
                    }
                    var4 = (Object) (Object) ((rb) this).field_n.a(((rb) this).field_d, -18017, param2);
                    break L4;
                  } else {
                    L7: {
                      if (param0 != 1) {
                        break L7;
                      } else {
                        if (null != ((rb) this).field_d) {
                          var4 = (Object) (Object) ((rb) this).field_n.a(3, ((rb) this).field_d, param2);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    if (param0 == 2) {
                      if (null != ((rb) this).field_d) {
                        if (((rb) this).field_o[param2] != -1) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (((rb) this).field_A.d(20)) {
                              break L8;
                            } else {
                              var4 = (Object) (Object) ((rb) this).field_A.a(param2, false, (byte) 2, (byte) -60, ((rb) this).field_q);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          stackOut_44_0 = null;
                          stackIn_45_0 = stackOut_44_0;
                          return (ca) (Object) stackIn_45_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                ((rb) this).field_w.a((hl) var4, (long)param2, false);
                break L3;
              }
            }
            if (((ca) var4).field_u) {
              stackOut_61_0 = null;
              stackIn_62_0 = stackOut_61_0;
              return (ca) (Object) stackIn_62_0;
            } else {
              var5 = ((ca) var4).i(-20324);
              if (!(var4 instanceof bk)) {
                try {
                  L9: {
                    L10: {
                      if (var5 == null) {
                        break L10;
                      } else {
                        if (var5.length > 2) {
                          te.field_a.reset();
                          te.field_a.update(var5, 0, -2 + var5.length);
                          var6_int = (int)te.field_a.getValue();
                          if (~((rb) this).field_v.field_e[param2] == ~var6_int) {
                            L11: {
                              if (null == ((rb) this).field_v.field_g) {
                                break L11;
                              } else {
                                if (null == ((rb) this).field_v.field_g[param2]) {
                                  break L11;
                                } else {
                                  var7 = ((rb) this).field_v.field_g[param2];
                                  var8 = wc.a(var5, -6408, 0, -2 + var5.length);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_125_0 = var7[var9];
                                      stackOut_125_1 = var8[var9];
                                      stackIn_147_0 = stackOut_125_0;
                                      stackIn_147_1 = stackOut_125_1;
                                      stackIn_126_0 = stackOut_125_0;
                                      stackIn_126_1 = stackOut_125_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_126_0 != stackIn_126_1) {
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
                            ((rb) this).field_A.field_c = 0;
                            ((rb) this).field_A.field_f = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            throw new RuntimeException();
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
                    ((rb) this).field_A.a(false);
                    ((ca) var4).d(0);
                    if (((ca) var4).field_t) {
                      if (!((rb) this).field_A.c(90)) {
                        var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                        ((rb) this).field_w.a((hl) var4, (long)param2, false);
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_141_0 = null;
                  stackIn_142_0 = stackOut_141_0;
                  return (ca) (Object) stackIn_142_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[var5.length - 2] = (byte)(((rb) this).field_v.field_p[param2] >>> -245365304);
                      var5[-1 + var5.length] = (byte)((rb) this).field_v.field_p[param2];
                      if (null != ((rb) this).field_d) {
                        bk discarded$1 = ((rb) this).field_n.a(param2, ((rb) this).field_d, var5, 11998);
                        stackOut_146_0 = ~((rb) this).field_o[param2];
                        stackOut_146_1 = -2;
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (stackIn_147_0 == stackIn_147_1) {
                    break L14;
                  } else {
                    ((rb) this).field_o[param2] = (byte) 1;
                    break L14;
                  }
                }
                L16: {
                  if (((ca) var4).field_t) {
                    break L16;
                  } else {
                    ((ca) var4).d(0);
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
                        if (2 >= var5.length) {
                          break L18;
                        } else {
                          te.field_a.reset();
                          te.field_a.update(var5, 0, -2 + var5.length);
                          var6_int = (int)te.field_a.getValue();
                          if (~((rb) this).field_v.field_e[param2] == ~var6_int) {
                            L19: {
                              L20: {
                                if (null == ((rb) this).field_v.field_g) {
                                  break L20;
                                } else {
                                  if (null == ((rb) this).field_v.field_g[param2]) {
                                    break L20;
                                  } else {
                                    var7 = ((rb) this).field_v.field_g[param2];
                                    var8 = wc.a(var5, -6408, 0, var5.length - 2);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_80_0 = ~var8[var9];
                                        stackOut_80_1 = ~var7[var9];
                                        stackIn_88_0 = stackOut_80_0;
                                        stackIn_88_1 = stackOut_80_1;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_81_0 != stackIn_81_1) {
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
                              stackOut_87_0 = var5[-1 + var5.length] & 255;
                              stackOut_87_1 = 65280 & var5[var5.length + -2] << -1377695416;
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              break L19;
                            }
                            var7_int = stackIn_88_0 + stackIn_88_1;
                            if (~(((rb) this).field_v.field_p[param2] & 65535) == ~var7_int) {
                              L22: {
                                if (((rb) this).field_o[param2] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((rb) this).field_o[param2] == 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((rb) this).field_o[param2] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (((ca) var4).field_t) {
                                  break L24;
                                } else {
                                  ((ca) var4).d(0);
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
                    ((rb) this).field_o[param2] = (byte) -1;
                    ((ca) var4).d(0);
                    if (!((ca) var4).field_t) {
                      break L25;
                    } else {
                      if (!((rb) this).field_A.c(104)) {
                        var4 = (Object) (Object) ((rb) this).field_A.a(param2, true, (byte) 2, (byte) -60, ((rb) this).field_q);
                        ((rb) this).field_w.a((hl) var4, (long)param2, false);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  stackOut_108_0 = null;
                  stackIn_109_0 = stackOut_108_0;
                  return (ca) (Object) stackIn_109_0;
                }
                return (ca) (Object) stackIn_100_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw kk.a((Throwable) var4, "rb.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (ca) (Object) stackIn_154_0;
    }

    final kn a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kn stackIn_5_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_55_0 = null;
        kn stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        kn stackOut_4_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_54_0 = null;
        kn stackOut_60_0 = null;
        Object stackOut_19_0 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            if (null != ((rb) this).field_v) {
              stackOut_4_0 = ((rb) this).field_v;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (param0 >= 70) {
                  break L1;
                } else {
                  ((rb) this).field_r = null;
                  break L1;
                }
              }
              L2: {
                if (((rb) this).field_s == null) {
                  if (((rb) this).field_A.c(77)) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (kn) (Object) stackIn_16_0;
                  } else {
                    ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (!((rb) this).field_s.field_u) {
                L3: {
                  L4: {
                    var2_array = ((rb) this).field_s.i(-20324);
                    if (((rb) this).field_s instanceof bk) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (var2_array == null) {
                            throw new RuntimeException();
                          } else {
                            ((rb) this).field_v = new kn(var2_array, ((rb) this).field_h, ((rb) this).field_z);
                            break L5;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((rb) this).field_A.a(false);
                            ((rb) this).field_v = null;
                            if (!((rb) this).field_A.c(75)) {
                              break L7;
                            } else {
                              ((rb) this).field_s = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                          break L6;
                        }
                        stackOut_34_0 = null;
                        stackIn_35_0 = stackOut_34_0;
                        return (kn) (Object) stackIn_35_0;
                      }
                      if (null != ((rb) this).field_y) {
                        bk discarded$1 = ((rb) this).field_n.a(((rb) this).field_q, ((rb) this).field_y, var2_array, 11998);
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
                      if (null != var2_array) {
                        ((rb) this).field_v = new kn(var2_array, ((rb) this).field_h, ((rb) this).field_z);
                        if (~((rb) this).field_v.field_s != ~((rb) this).field_k) {
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
                        ((rb) this).field_v = null;
                        if (!((rb) this).field_A.c(98)) {
                          break L10;
                        } else {
                          ((rb) this).field_s = null;
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((rb) this).field_s = (ca) (Object) ((rb) this).field_A.a(((rb) this).field_q, true, (byte) 0, (byte) -60, 255);
                      break L9;
                    }
                    stackOut_54_0 = null;
                    stackIn_55_0 = stackOut_54_0;
                    return (kn) (Object) stackIn_55_0;
                  }
                  break L3;
                }
                L11: {
                  if (null != ((rb) this).field_d) {
                    ((rb) this).field_o = new byte[((rb) this).field_v.field_o];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((rb) this).field_s = null;
                stackOut_60_0 = ((rb) this).field_v;
                stackIn_61_0 = stackOut_60_0;
                break L0;
              } else {
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                return (kn) (Object) stackIn_20_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "rb.A(" + param0 + ')');
        }
        return stackIn_61_0;
    }

    final byte[] a(byte param0, int param1) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a(0, 92, param1);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              if (param0 <= -54) {
                var4 = var3.i(-20324);
                var3.d(0);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var3_ref, "rb.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 > -103) {
            return;
        }
        try {
            field_B = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "rb.G(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((rb) this).field_d != null) {
              L1: {
                ((rb) this).field_e = true;
                if (((rb) this).field_r == null) {
                  ((rb) this).field_r = new ah();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 < -10) {
                  break L2;
                } else {
                  ((rb) this).b(-110);
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
          throw kk.a((Throwable) (Object) var2, "rb.E(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        hl var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            if (((rb) this).field_r == null) {
              return;
            } else {
              if (null != ((rb) this).a((byte) 104)) {
                L1: {
                  if (param0 == 2) {
                    break L1;
                  } else {
                    ((rb) this).field_h = -32;
                    break L1;
                  }
                }
                var2_ref = ((rb) this).field_j.b((byte) 121);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_f;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~((rb) this).field_v.field_o >= ~var3) {
                                    break L7;
                                  } else {
                                    if (((rb) this).field_v.field_u[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.d(0);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (0 != ((rb) this).field_o[var3]) {
                                break L8;
                              } else {
                                ca discarded$2 = this.a(1, 62, var3);
                                break L8;
                              }
                            }
                            L9: {
                              if (((rb) this).field_o[var3] != -1) {
                                break L9;
                              } else {
                                ca discarded$3 = this.a(2, 120, var3);
                                break L9;
                              }
                            }
                            if (((rb) this).field_o[var3] == 1) {
                              var2_ref.d(0);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((rb) this).field_j.c((byte) 117);
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
          throw kk.a((Throwable) (Object) var2, "rb.B(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        ca var2_ref = null;
        int var2_int = 0;
        hl var3 = null;
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
        int stackIn_54_0 = 0;
        byte stackIn_54_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_121_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_53_0 = 0;
        byte stackOut_53_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        boolean stackOut_99_0 = false;
        int stackOut_120_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              L2: {
                if (((rb) this).field_r == null) {
                  break L2;
                } else {
                  if (((rb) this).a((byte) 73) != null) {
                    L3: {
                      if (((rb) this).field_f) {
                        break L3;
                      } else {
                        L4: {
                          if (((rb) this).field_e) {
                            break L4;
                          } else {
                            ((rb) this).field_r = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((rb) this).field_r.b((byte) 92);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_f;
                                stackOut_13_0 = ~((rb) this).field_o[var4];
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
                                      stackOut_27_0 = ~((rb) this).field_v.field_u[((rb) this).field_l];
                                      stackOut_27_1 = -1;
                                      stackIn_122_0 = stackOut_27_0;
                                      stackIn_122_1 = stackOut_27_1;
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
                                              ((rb) this).field_l = ((rb) this).field_l + 1;
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
                                            if (!((rb) this).field_A.d(param0 ^ 22)) {
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
                                            if (((rb) this).field_o[((rb) this).field_l] != 1) {
                                              ca discarded$4 = this.a(2, 74, ((rb) this).field_l);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (1 == ((rb) this).field_o[((rb) this).field_l]) {
                                              break L13;
                                            } else {
                                              var3 = new hl();
                                              var3.field_f = (long)((rb) this).field_l;
                                              var2_int = 0;
                                              ((rb) this).field_r.a((byte) -125, var3);
                                              break L13;
                                            }
                                          }
                                          ((rb) this).field_l = ((rb) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_25_0 = ((rb) this).field_l;
                                        stackOut_25_1 = ((rb) this).field_v.field_u.length;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_14_0 != stackIn_14_1) {
                                      ca discarded$5 = this.a(2, 53, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((rb) this).field_o[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.d(0);
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
                                  var3 = ((rb) this).field_r.c((byte) -86);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_25_0 = ((rb) this).field_l;
                              stackOut_25_1 = ((rb) this).field_v.field_u.length;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              if (stackIn_26_0 >= stackIn_26_1) {
                                break L6;
                              } else {
                                stackOut_27_0 = ~((rb) this).field_v.field_u[((rb) this).field_l];
                                stackOut_27_1 = -1;
                                stackIn_122_0 = stackOut_27_0;
                                stackIn_122_1 = stackOut_27_1;
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
                                      ((rb) this).field_l = ((rb) this).field_l + 1;
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
                                    if (!((rb) this).field_A.d(param0 ^ 22)) {
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
                                    if (((rb) this).field_o[((rb) this).field_l] != 1) {
                                      ca discarded$4 = this.a(2, 74, ((rb) this).field_l);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (1 == ((rb) this).field_o[((rb) this).field_l]) {
                                      break L21;
                                    } else {
                                      var3 = new hl();
                                      var3.field_f = (long)((rb) this).field_l;
                                      var2_int = 0;
                                      ((rb) this).field_r.a((byte) -125, var3);
                                      break L21;
                                    }
                                  }
                                  ((rb) this).field_l = ((rb) this).field_l + 1;
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
                              ((rb) this).field_l = 0;
                              ((rb) this).field_e = false;
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
                    var3 = ((rb) this).field_r.b((byte) 99);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (var3 == null) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_f;
                            stackOut_53_0 = 0;
                            stackOut_53_1 = ((rb) this).field_o[var4];
                            stackIn_65_0 = stackOut_53_0;
                            stackIn_65_1 = stackOut_53_1;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_65_0 <= stackIn_65_1) {
                                  break L24;
                                } else {
                                  stackOut_66_0 = -1;
                                  stackOut_66_1 = ~((rb) this).field_v.field_u[((rb) this).field_l];
                                  stackIn_122_0 = stackOut_66_0;
                                  stackIn_122_1 = stackOut_66_1;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_67_0 = stackIn_67_0;
                                    stackOut_67_1 = stackIn_67_1;
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_69_0 != stackIn_69_1) {
                                          break L28;
                                        } else {
                                          ((rb) this).field_l = ((rb) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (((rb) this).field_n.field_c < 250) {
                                          break L29;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((rb) this).field_o[((rb) this).field_l] != 0) {
                                          break L30;
                                        } else {
                                          ca discarded$6 = this.a(1, 106, ((rb) this).field_l);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((rb) this).field_o[((rb) this).field_l] == 0) {
                                          var3 = new hl();
                                          var3.field_f = (long)((rb) this).field_l;
                                          var2_int = 0;
                                          ((rb) this).field_r.a((byte) -82, var3);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      ((rb) this).field_l = ((rb) this).field_l + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_64_0 = ~((rb) this).field_l;
                                    stackOut_64_1 = ~((rb) this).field_v.field_u.length;
                                    stackIn_65_0 = stackOut_64_0;
                                    stackIn_65_1 = stackOut_64_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_54_0 == stackIn_54_1) {
                                  ca discarded$7 = this.a(1, param0 ^ 102, var4);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (0 != ((rb) this).field_o[var4]) {
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
                                var3.d(0);
                                break L33;
                              }
                              var3 = ((rb) this).field_r.c((byte) 113);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_64_0 = ~((rb) this).field_l;
                          stackOut_64_1 = ~((rb) this).field_v.field_u.length;
                          stackIn_65_0 = stackOut_64_0;
                          stackIn_65_1 = stackOut_64_1;
                          if (stackIn_65_0 <= stackIn_65_1) {
                            break L24;
                          } else {
                            stackOut_66_0 = -1;
                            stackOut_66_1 = ~((rb) this).field_v.field_u[((rb) this).field_l];
                            stackIn_122_0 = stackOut_66_0;
                            stackIn_122_1 = stackOut_66_1;
                            stackIn_67_0 = stackOut_66_0;
                            stackIn_67_1 = stackOut_66_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_67_0 = stackIn_67_0;
                              stackOut_67_1 = stackIn_67_1;
                              stackIn_69_0 = stackOut_67_0;
                              stackIn_69_1 = stackOut_67_1;
                              L36: {
                                if (stackIn_69_0 != stackIn_69_1) {
                                  break L36;
                                } else {
                                  ((rb) this).field_l = ((rb) this).field_l + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (((rb) this).field_n.field_c < 250) {
                                  break L37;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((rb) this).field_o[((rb) this).field_l] != 0) {
                                  break L38;
                                } else {
                                  ca discarded$6 = this.a(1, 106, ((rb) this).field_l);
                                  break L38;
                                }
                              }
                              L39: {
                                if (((rb) this).field_o[((rb) this).field_l] == 0) {
                                  var3 = new hl();
                                  var3.field_f = (long)((rb) this).field_l;
                                  var2_int = 0;
                                  ((rb) this).field_r.a((byte) -82, var3);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              ((rb) this).field_l = ((rb) this).field_l + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((rb) this).field_f = false;
                        ((rb) this).field_l = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              L40: {
                L41: {
                  if (!((rb) this).field_u) {
                    break L41;
                  } else {
                    if (((rb) this).field_i <= bb.b(-1)) {
                      var2_ref = (ca) (Object) ((rb) this).field_w.a(0);
                      L42: while (true) {
                        L43: {
                          if (var2_ref == null) {
                            break L43;
                          } else {
                            stackOut_99_0 = var2_ref.field_u;
                            stackIn_121_0 = stackOut_99_0 ? 1 : 0;
                            stackIn_100_0 = stackOut_99_0;
                            if (var5 != 0) {
                              break L40;
                            } else {
                              L44: {
                                L45: {
                                  if (!stackIn_100_0) {
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
                                  if (var2_ref.field_q) {
                                    break L46;
                                  } else {
                                    var2_ref.field_q = true;
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                                if (var2_ref.field_t) {
                                  var2_ref.d(0);
                                  break L44;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                              var2_ref = (ca) (Object) ((rb) this).field_w.b(-1);
                              if (var5 == 0) {
                                continue L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        ((rb) this).field_i = 1000L + bb.b(-1);
                        break L41;
                      }
                    } else {
                      break L41;
                    }
                  }
                }
                stackOut_120_0 = param0;
                stackIn_121_0 = stackOut_120_0;
                break L40;
              }
              stackOut_121_0 = stackIn_121_0;
              stackOut_121_1 = 2;
              stackIn_122_0 = stackOut_121_0;
              stackIn_122_1 = stackOut_121_1;
              break L1;
            }
            L47: {
              if (stackIn_122_0 == stackIn_122_1) {
                break L47;
              } else {
                ((rb) this).field_y = null;
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "rb.C(" + param0 + ')');
        }
    }

    final int a(boolean param0, int param1) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              var3 = (ca) (Object) ((rb) this).field_w.a((byte) 113, (long)param1);
              if (!param0) {
                break L1;
              } else {
                ((rb) this).field_v = null;
                break L1;
              }
            }
            if (null != var3) {
              stackOut_6_0 = var3.g(0);
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
          throw kk.a((Throwable) (Object) var3_ref, "rb.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    rb(int param0, sk param1, sk param2, wj param3, qb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((rb) this).field_w = new og(16);
        ((rb) this).field_l = 0;
        ((rb) this).field_j = new ah();
        ((rb) this).field_i = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((rb) this).field_q = param0;
                ((rb) this).field_d = param1;
                if (((rb) this).field_d != null) {
                  break L2;
                } else {
                  ((rb) this).field_f = false;
                  if (HoldTheLine.field_D == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((rb) this).field_f = true;
              ((rb) this).field_r = new ah();
              break L1;
            }
            L3: {
              ((rb) this).field_z = param6;
              ((rb) this).field_u = param8;
              ((rb) this).field_A = param3;
              ((rb) this).field_y = param2;
              ((rb) this).field_n = param4;
              ((rb) this).field_k = param7;
              ((rb) this).field_h = param5;
              if (null == ((rb) this).field_y) {
                break L3;
              } else {
                ((rb) this).field_s = (ca) (Object) ((rb) this).field_n.a(((rb) this).field_y, -18017, ((rb) this).field_q);
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
            stackOut_9_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 10;
        field_t = 0;
        field_B = "Start Game";
    }
}
