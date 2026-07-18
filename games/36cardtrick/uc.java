/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends pe {
    static String field_r;
    private int field_q;
    private int field_k;
    private gj field_m;
    private int field_d;
    private ch field_v;
    private hc field_p;
    private byte[] field_t;
    private la field_u;
    private byte[] field_f;
    private d field_l;
    static String field_o;
    private hc field_h;
    private vb field_n;
    private int field_c;
    private boolean field_s;
    private bk field_e;
    private boolean field_w;
    private bk field_j;
    private long field_i;
    private boolean field_g;

    private final la a(byte param0, int param1, int param2) {
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
        Object stackIn_26_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        Object stackIn_148_0 = null;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        Object stackIn_160_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        Object stackOut_147_0 = null;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        Object stackOut_159_0 = null;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_111_0 = null;
        Object stackOut_56_0 = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (la) (Object) ((uc) this).field_n.a(false, (long)param1);
              if (null == var4) {
                break L1;
              } else {
                if (0 != param2) {
                  break L1;
                } else {
                  if (((la) var4).field_o) {
                    break L1;
                  } else {
                    if (!((la) var4).field_n) {
                      break L1;
                    } else {
                      ((la) var4).c(98);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 == null) {
                L3: {
                  L4: {
                    if (param2 != 0) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (((uc) this).field_p == null) {
                            break L6;
                          } else {
                            if (((uc) this).field_t[param1] != -1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (!((uc) this).field_v.a(false)) {
                          var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackOut_25_0 = null;
                          stackIn_26_0 = stackOut_25_0;
                          return (la) (Object) stackIn_26_0;
                        }
                      }
                      var4 = (Object) (Object) ((uc) this).field_m.a(param0 ^ 125, ((uc) this).field_p, param1);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    if (1 != param2) {
                      break L7;
                    } else {
                      if (null != ((uc) this).field_p) {
                        var4 = (Object) (Object) ((uc) this).field_m.a(param1, -3, ((uc) this).field_p);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (param2 == 2) {
                    if (null != ((uc) this).field_p) {
                      if (((uc) this).field_t[param1] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((uc) this).field_v.c(param0 + -170)) {
                          var4 = (Object) (Object) ((uc) this).field_v.a(false, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                          break L3;
                        } else {
                          stackOut_51_0 = null;
                          stackIn_52_0 = stackOut_51_0;
                          return (la) (Object) stackIn_52_0;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((uc) this).field_n.a((long)param1, (byte) 69, (qb) var4);
                break L2;
              } else {
                break L2;
              }
            }
            if (!((la) var4).field_n) {
              L8: {
                var5 = ((la) var4).b(true);
                if (param0 == 124) {
                  break L8;
                } else {
                  ((uc) this).field_f = null;
                  break L8;
                }
              }
              if (!(var4 instanceof ab)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length > 2) {
                          fl.field_c.reset();
                          fl.field_c.update(var5, 0, -2 + var5.length);
                          var6_int = (int)fl.field_c.getValue();
                          if (((uc) this).field_l.field_i[param1] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (((uc) this).field_l.field_l == null) {
                                break L11;
                              } else {
                                if (((uc) this).field_l.field_l[param1] != null) {
                                  var7 = ((uc) this).field_l.field_l[param1];
                                  var8 = ti.a(0, var5, -2 + var5.length, 0);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (64 <= var9) {
                                      break L11;
                                    } else {
                                      stackOut_131_0 = ~var8[var9];
                                      stackOut_131_1 = ~var7[var9];
                                      stackIn_152_0 = stackOut_131_0;
                                      stackIn_152_1 = stackOut_131_1;
                                      stackIn_132_0 = stackOut_131_0;
                                      stackIn_132_1 = stackOut_131_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_132_0 != stackIn_132_1) {
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
                            ((uc) this).field_v.field_b = 0;
                            ((uc) this).field_v.field_l = 0;
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
                    ((uc) this).field_v.c((byte) 0);
                    ((la) var4).c(82);
                    if (((la) var4).field_o) {
                      if (!((uc) this).field_v.a(false)) {
                        var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                        ((uc) this).field_n.a((long)param1, (byte) 110, (qb) var4);
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_147_0 = null;
                  stackIn_148_0 = stackOut_147_0;
                  return (la) (Object) stackIn_148_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((uc) this).field_l.field_n[param1] >>> -948312632);
                      var5[-1 + var5.length] = (byte)((uc) this).field_l.field_n[param1];
                      if (null == ((uc) this).field_p) {
                        break L14;
                      } else {
                        ab discarded$1 = ((uc) this).field_m.a(((uc) this).field_p, var5, param1, param0 ^ -23043);
                        stackOut_150_0 = ~((uc) this).field_t[param1];
                        stackOut_150_1 = -2;
                        stackIn_152_0 = stackOut_150_0;
                        stackIn_152_1 = stackOut_150_1;
                        break L15;
                      }
                    }
                  }
                  if (stackIn_152_0 != stackIn_152_1) {
                    ((uc) this).field_t[param1] = (byte) 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (!((la) var4).field_o) {
                    ((la) var4).c(83);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                stackOut_159_0 = var4;
                stackIn_160_0 = stackOut_159_0;
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
                          fl.field_c.reset();
                          fl.field_c.update(var5, 0, -2 + var5.length);
                          var6_int = (int)fl.field_c.getValue();
                          if (~((uc) this).field_l.field_i[param1] != ~var6_int) {
                            throw new RuntimeException();
                          } else {
                            L19: {
                              L20: {
                                if (null == ((uc) this).field_l.field_l) {
                                  break L20;
                                } else {
                                  if (((uc) this).field_l.field_l[param1] != null) {
                                    var7 = ((uc) this).field_l.field_l[param1];
                                    var8 = ti.a(0, var5, var5.length - 2, param0 + -124);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_81_0 = ~var8[var9];
                                        stackOut_81_1 = ~var7[var9];
                                        stackIn_89_0 = stackOut_81_0;
                                        stackIn_89_1 = stackOut_81_1;
                                        stackIn_82_0 = stackOut_81_0;
                                        stackIn_82_1 = stackOut_81_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_82_0 != stackIn_82_1) {
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
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              stackOut_88_0 = var5[-1 + var5.length] & 255;
                              stackOut_88_1 = 65280 & var5[-2 + var5.length] << -67561912;
                              stackIn_89_0 = stackOut_88_0;
                              stackIn_89_1 = stackOut_88_1;
                              break L19;
                            }
                            var7_int = stackIn_89_0 + stackIn_89_1;
                            if (~(65535 & ((uc) this).field_l.field_n[param1]) != ~var7_int) {
                              throw new RuntimeException();
                            } else {
                              L22: {
                                if (((uc) this).field_t[param1] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((uc) this).field_t[param1] == 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((uc) this).field_t[param1] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (!((la) var4).field_o) {
                                  ((la) var4).c(param0 ^ 34);
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              stackOut_102_0 = var4;
                              stackIn_103_0 = stackOut_102_0;
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
                    ((uc) this).field_t[param1] = (byte) -1;
                    ((la) var4).c(param0 ^ 7);
                    if (((la) var4).field_o) {
                      if (!((uc) this).field_v.a(false)) {
                        var4 = (Object) (Object) ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                        ((uc) this).field_n.a((long)param1, (byte) 79, (qb) var4);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  stackOut_111_0 = null;
                  stackIn_112_0 = stackOut_111_0;
                  return (la) (Object) stackIn_112_0;
                }
                return (la) (Object) stackIn_103_0;
              }
            } else {
              stackOut_56_0 = null;
              stackIn_57_0 = stackOut_56_0;
              return (la) (Object) stackIn_57_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw ma.a((Throwable) var4, "uc.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (la) (Object) stackIn_160_0;
    }

    final d b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        d stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_48_0 = null;
        d stackIn_54_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_28_0 = null;
        d stackOut_53_0 = null;
        Object stackOut_47_0 = null;
        Object stackOut_12_0 = null;
        d stackOut_2_0 = null;
        var4 = Main.field_T;
        try {
          L0: {
            if (((uc) this).field_l == null) {
              L1: {
                if (((uc) this).field_u != null) {
                  break L1;
                } else {
                  if (!((uc) this).field_v.a(false)) {
                    ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (d) (Object) stackIn_9_0;
                  }
                }
              }
              if (!((uc) this).field_u.field_n) {
                L2: {
                  var2_array = ((uc) this).field_u.b(true);
                  if (!(((uc) this).field_u instanceof ab)) {
                    try {
                      L3: {
                        if (var2_array != null) {
                          ((uc) this).field_l = new d(var2_array, ((uc) this).field_k, ((uc) this).field_f);
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var3 = decompiledCaughtException;
                          ((uc) this).field_v.c((byte) 0);
                          ((uc) this).field_l = null;
                          if (((uc) this).field_v.a(false)) {
                            break L5;
                          } else {
                            ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((uc) this).field_u = null;
                        break L4;
                      }
                      stackOut_41_0 = null;
                      stackIn_42_0 = stackOut_41_0;
                      return (d) (Object) stackIn_42_0;
                    }
                    if (null == ((uc) this).field_h) {
                      break L2;
                    } else {
                      ab discarded$1 = ((uc) this).field_m.a(((uc) this).field_h, var2_array, ((uc) this).field_d, -23167);
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (null != var2_array) {
                          ((uc) this).field_l = new d(var2_array, ((uc) this).field_k, ((uc) this).field_f);
                          if (((uc) this).field_l.field_k == ((uc) this).field_q) {
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
                          ((uc) this).field_l = null;
                          if (((uc) this).field_v.a(false)) {
                            break L8;
                          } else {
                            ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((uc) this).field_u = null;
                        break L7;
                      }
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      return (d) (Object) stackIn_29_0;
                    }
                    break L2;
                  }
                }
                if (param0 <= -35) {
                  L9: {
                    ((uc) this).field_u = null;
                    if (((uc) this).field_p != null) {
                      ((uc) this).field_t = new byte[((uc) this).field_l.field_b];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  stackOut_53_0 = ((uc) this).field_l;
                  stackIn_54_0 = stackOut_53_0;
                  break L0;
                } else {
                  stackOut_47_0 = null;
                  stackIn_48_0 = stackOut_47_0;
                  return (d) (Object) stackIn_48_0;
                }
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (d) (Object) stackIn_13_0;
              }
            } else {
              stackOut_2_0 = ((uc) this).field_l;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "uc.D(" + param0 + ')');
        }
        return stackIn_54_0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        qb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 >= 89) {
                break L1;
              } else {
                ((uc) this).c((byte) -55);
                break L1;
              }
            }
            if (null == ((uc) this).field_j) {
              return;
            } else {
              if (((uc) this).b((byte) -71) == null) {
                return;
              } else {
                var2_ref = ((uc) this).field_e.a((byte) 74);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_e;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((uc) this).field_l.field_b) {
                                    break L7;
                                  } else {
                                    if (((uc) this).field_l.field_q[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.c(109);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (0 != ((uc) this).field_t[var3]) {
                                break L8;
                              } else {
                                la discarded$2 = this.a((byte) 124, var3, 1);
                                break L8;
                              }
                            }
                            L9: {
                              if (((uc) this).field_t[var3] != -1) {
                                break L9;
                              } else {
                                la discarded$3 = this.a((byte) 124, var3, 2);
                                break L9;
                              }
                            }
                            if (((uc) this).field_t[var3] == 1) {
                              var2_ref.c(85);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((uc) this).field_e.b((byte) -99);
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
          throw ma.a((Throwable) (Object) var2, "uc.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        la var2_ref = null;
        qb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        byte stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        byte stackIn_62_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_99_0 = 0;
        boolean stackIn_109_0 = false;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        byte stackOut_17_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        byte stackOut_61_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_98_0 = 0;
        boolean stackOut_108_0 = false;
        int stackOut_130_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((uc) this).field_j) {
                  if (((uc) this).b((byte) -56) == null) {
                    return;
                  } else {
                    L3: {
                      if (((uc) this).field_s) {
                        break L3;
                      } else {
                        L4: {
                          if (((uc) this).field_w) {
                            break L4;
                          } else {
                            ((uc) this).field_j = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((uc) this).field_j.a((byte) 74);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_17_0 = 1;
                                stackOut_17_1 = ((uc) this).field_t[var4];
                                stackIn_30_0 = stackOut_17_0;
                                stackIn_30_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_30_0 >= stackIn_30_1) {
                                      break L6;
                                    } else {
                                      stackOut_31_0 = ~((uc) this).field_l.field_q[((uc) this).field_c];
                                      stackOut_31_1 = -1;
                                      stackIn_132_0 = stackOut_31_0;
                                      stackIn_132_1 = stackOut_31_1;
                                      stackIn_32_0 = stackOut_31_0;
                                      stackIn_32_1 = stackOut_31_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = stackIn_32_1;
                                        stackIn_34_0 = stackOut_32_0;
                                        stackIn_34_1 = stackOut_32_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_34_0 == stackIn_34_1) {
                                              ((uc) this).field_c = ((uc) this).field_c + 1;
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
                                            if (((uc) this).field_v.c(param0 + 3129)) {
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
                                            if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                              la discarded$4 = this.a((byte) 124, ((uc) this).field_c, 2);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                              var3 = new qb();
                                              var3.field_e = (long)((uc) this).field_c;
                                              ((uc) this).field_j.a(var3, 27362);
                                              var2_int = 0;
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((uc) this).field_c = ((uc) this).field_c + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_29_0 = ~((uc) this).field_l.field_q.length;
                                        stackOut_29_1 = ~((uc) this).field_c;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_18_0 != stackIn_18_1) {
                                      la discarded$5 = this.a((byte) 124, var4, 2);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((uc) this).field_t[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.c(124);
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
                                  var3 = ((uc) this).field_j.b((byte) -104);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_29_0 = ~((uc) this).field_l.field_q.length;
                              stackOut_29_1 = ~((uc) this).field_c;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (stackIn_30_0 >= stackIn_30_1) {
                                break L6;
                              } else {
                                stackOut_31_0 = ~((uc) this).field_l.field_q[((uc) this).field_c];
                                stackOut_31_1 = -1;
                                stackIn_132_0 = stackOut_31_0;
                                stackIn_132_1 = stackOut_31_1;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_32_0 = stackIn_32_0;
                                  stackOut_32_1 = stackIn_32_1;
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  L18: {
                                    if (stackIn_34_0 == stackIn_34_1) {
                                      ((uc) this).field_c = ((uc) this).field_c + 1;
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
                                    if (((uc) this).field_v.c(param0 + 3129)) {
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
                                    if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                      la discarded$4 = this.a((byte) 124, ((uc) this).field_c, 2);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                      var3 = new qb();
                                      var3.field_e = (long)((uc) this).field_c;
                                      ((uc) this).field_j.a(var3, 27362);
                                      var2_int = 0;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((uc) this).field_c = ((uc) this).field_c + 1;
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
                              ((uc) this).field_c = 0;
                              ((uc) this).field_w = false;
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
                    var3 = ((uc) this).field_j.a((byte) 74);
                    L23: while (true) {
                      L24: {
                        L25: {
                          L26: {
                            if (null == var3) {
                              break L26;
                            } else {
                              var4 = (int)var3.field_e;
                              stackOut_61_0 = ((uc) this).field_t[var4];
                              stackIn_74_0 = stackOut_61_0;
                              stackIn_62_0 = stackOut_61_0;
                              if (var5 != 0) {
                                L27: while (true) {
                                  if (stackIn_74_0 <= ((uc) this).field_c) {
                                    break L25;
                                  } else {
                                    stackOut_75_0 = ((uc) this).field_l.field_q[((uc) this).field_c];
                                    stackIn_99_0 = stackOut_75_0;
                                    stackIn_76_0 = stackOut_75_0;
                                    if (var5 != 0) {
                                      break L24;
                                    } else {
                                      stackOut_76_0 = stackIn_76_0;
                                      stackIn_78_0 = stackOut_76_0;
                                      L28: {
                                        L29: {
                                          if (stackIn_78_0 == 0) {
                                            ((uc) this).field_c = ((uc) this).field_c + 1;
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
                                          if (((uc) this).field_m.field_b >= 250) {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L25;
                                            } else {
                                              break L30;
                                            }
                                          } else {
                                            break L30;
                                          }
                                        }
                                        L31: {
                                          if (0 == ((uc) this).field_t[((uc) this).field_c]) {
                                            la discarded$6 = this.a((byte) 124, ((uc) this).field_c, 1);
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                        L32: {
                                          if (((uc) this).field_t[((uc) this).field_c] == 0) {
                                            var3 = new qb();
                                            var3.field_e = (long)((uc) this).field_c;
                                            var2_int = 0;
                                            ((uc) this).field_j.a(var3, param0 + 30390);
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        ((uc) this).field_c = ((uc) this).field_c + 1;
                                        if (var5 == 0) {
                                          break L28;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      stackOut_73_0 = ((uc) this).field_l.field_q.length;
                                      stackIn_74_0 = stackOut_73_0;
                                      continue L27;
                                    }
                                  }
                                }
                              } else {
                                L33: {
                                  if (stackIn_62_0 != 0) {
                                    break L33;
                                  } else {
                                    la discarded$7 = this.a((byte) 124, var4, 1);
                                    break L33;
                                  }
                                }
                                L34: {
                                  L35: {
                                    if (((uc) this).field_t[var4] == 0) {
                                      break L35;
                                    } else {
                                      var3.c(98);
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
                                var3 = ((uc) this).field_j.b((byte) -101);
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L36: while (true) {
                            stackOut_73_0 = ((uc) this).field_l.field_q.length;
                            stackIn_74_0 = stackOut_73_0;
                            if (stackIn_74_0 <= ((uc) this).field_c) {
                              break L25;
                            } else {
                              stackOut_75_0 = ((uc) this).field_l.field_q[((uc) this).field_c];
                              stackIn_99_0 = stackOut_75_0;
                              stackIn_76_0 = stackOut_75_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                stackOut_76_0 = stackIn_76_0;
                                stackIn_78_0 = stackOut_76_0;
                                L37: {
                                  if (stackIn_78_0 == 0) {
                                    ((uc) this).field_c = ((uc) this).field_c + 1;
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
                                  if (((uc) this).field_m.field_b >= 250) {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L25;
                                    } else {
                                      break L38;
                                    }
                                  } else {
                                    break L38;
                                  }
                                }
                                L39: {
                                  if (0 == ((uc) this).field_t[((uc) this).field_c]) {
                                    la discarded$6 = this.a((byte) 124, ((uc) this).field_c, 1);
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (((uc) this).field_t[((uc) this).field_c] == 0) {
                                    var3 = new qb();
                                    var3.field_e = (long)((uc) this).field_c;
                                    var2_int = 0;
                                    ((uc) this).field_j.a(var3, param0 + 30390);
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                ((uc) this).field_c = ((uc) this).field_c + 1;
                                if (var5 == 0) {
                                  continue L36;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        stackOut_98_0 = var2_int;
                        stackIn_99_0 = stackOut_98_0;
                        break L24;
                      }
                      if (stackIn_99_0 == 0) {
                        break L2;
                      } else {
                        ((uc) this).field_s = false;
                        ((uc) this).field_c = 0;
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L41: {
                L42: {
                  if (!((uc) this).field_g) {
                    break L42;
                  } else {
                    if (~id.a(36) > ~((uc) this).field_i) {
                      break L42;
                    } else {
                      var2_ref = (la) (Object) ((uc) this).field_n.b(-119);
                      L43: while (true) {
                        L44: {
                          if (null == var2_ref) {
                            break L44;
                          } else {
                            stackOut_108_0 = var2_ref.field_n;
                            stackIn_131_0 = stackOut_108_0 ? 1 : 0;
                            stackIn_109_0 = stackOut_108_0;
                            if (var5 != 0) {
                              break L41;
                            } else {
                              L45: {
                                L46: {
                                  if (!stackIn_109_0) {
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
                                  if (var2_ref.field_l) {
                                    break L47;
                                  } else {
                                    var2_ref.field_l = true;
                                    if (var5 == 0) {
                                      break L45;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                                if (!var2_ref.field_o) {
                                  throw new RuntimeException();
                                } else {
                                  var2_ref.c(86);
                                  break L45;
                                }
                              }
                              var2_ref = (la) (Object) ((uc) this).field_n.a(true);
                              if (var5 == 0) {
                                continue L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                        ((uc) this).field_i = 1000L + id.a(109);
                        break L42;
                      }
                    }
                  }
                }
                stackOut_130_0 = param0;
                stackIn_131_0 = stackOut_130_0;
                break L41;
              }
              stackOut_131_0 = stackIn_131_0;
              stackOut_131_1 = -3028;
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              break L1;
            }
            L48: {
              if (stackIn_132_0 == stackIn_132_1) {
                break L48;
              } else {
                ((uc) this).field_v = null;
                break L48;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "uc.F(" + param0 + ')');
        }
    }

    final static void a(pb param0, java.math.BigInteger param1, int param2, byte param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var7_int = qa.a(param2, 8);
              if (null == bl.field_a) {
                bl.field_a = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new int[4];
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var9 >= 4) {
                      break L5;
                    } else {
                      var8[var9] = bl.field_a.nextInt();
                      var9++;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (vc.field_b == null) {
                    break L4;
                  } else {
                    if (~vc.field_b.field_g.length <= ~var7_int) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                vc.field_b = new pb(var7_int);
                break L3;
              }
              L6: {
                L7: {
                  vc.field_b.field_i = 0;
                  vc.field_b.a(param2, param4, param6, (byte) -121);
                  vc.field_b.c(1442653008, var7_int);
                  vc.field_b.a(var8, 8);
                  if (null == oj.field_a) {
                    break L7;
                  } else {
                    if (oj.field_a.field_g.length >= 100) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                oj.field_a = new pb(100);
                break L6;
              }
              L8: {
                if (param3 == 0) {
                  break L8;
                } else {
                  uc.b(57);
                  break L8;
                }
              }
              oj.field_a.field_i = 0;
              oj.field_a.b(-9469, 10);
              var9 = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (var9 >= 4) {
                      break L11;
                    } else {
                      oj.field_a.a(-246, var8[var9]);
                      var9++;
                      if (var10 != 0) {
                        break L10;
                      } else {
                        if (var10 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  oj.field_a.e(param2, 26040);
                  oj.field_a.a(param1, param5, -15792);
                  param0.a(oj.field_a.field_i, 0, oj.field_a.field_g, (byte) -84);
                  param0.a(vc.field_b.field_i, 0, vc.field_b.field_g, (byte) -113);
                  break L10;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var7;
            stackOut_33_1 = new StringBuilder().append("uc.H(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L12;
            }
          }
          L13: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L13;
            }
          }
          L14: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param5 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L14;
            }
          }
          L15: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param6 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L15;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L15;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
    }

    public static void b(int param0) {
        try {
            field_r = null;
            field_o = null;
            if (param0 != 0) {
                uc.a((pb) null, (java.math.BigInteger) null, 16, (byte) 108, 83, (java.math.BigInteger) null, (byte[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "uc.I(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            var3 = (la) (Object) ((uc) this).field_n.a(false, (long)param0);
            if (var3 != null) {
              stackOut_3_0 = var3.a(false);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var4 = 10 / ((-27 - param1) / 58);
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3_ref, "uc.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((uc) this).field_p == null) {
              return;
            } else {
              L1: {
                ((uc) this).field_w = true;
                if (null != ((uc) this).field_j) {
                  break L1;
                } else {
                  ((uc) this).field_j = new bk();
                  break L1;
                }
              }
              L2: {
                if (param0 == -25350) {
                  break L2;
                } else {
                  ((uc) this).field_m = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "uc.J(" + param0 + ')');
        }
    }

    final byte[] a(int param0, boolean param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a((byte) 124, param0, 0);
            if (null != var3) {
              var4 = var3.b(param1);
              var3.c(109);
              stackOut_3_0 = (byte[]) var4;
              stackIn_4_0 = stackOut_3_0;
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
          throw ma.a((Throwable) (Object) var3_ref, "uc.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    uc(int param0, hc param1, hc param2, ch param3, gj param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((uc) this).field_n = new vb(16);
        ((uc) this).field_c = 0;
        ((uc) this).field_e = new bk();
        ((uc) this).field_i = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((uc) this).field_d = param0;
                ((uc) this).field_p = param1;
                if (((uc) this).field_p == null) {
                  break L2;
                } else {
                  ((uc) this).field_s = true;
                  ((uc) this).field_j = new bk();
                  if (Main.field_T == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((uc) this).field_s = false;
              break L1;
            }
            L3: {
              ((uc) this).field_m = param4;
              ((uc) this).field_k = param5;
              ((uc) this).field_f = param6;
              ((uc) this).field_h = param2;
              ((uc) this).field_g = param8;
              ((uc) this).field_q = param7;
              ((uc) this).field_v = param3;
              if (((uc) this).field_h == null) {
                break L3;
              } else {
                ((uc) this).field_u = (la) (Object) ((uc) this).field_m.a(1, ((uc) this).field_h, ((uc) this).field_d);
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
            stackOut_9_1 = new StringBuilder().append("uc.<init>(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Back";
        field_o = "TIME";
    }
}
