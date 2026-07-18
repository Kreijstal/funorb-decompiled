/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends jl {
    private byte[] field_A;
    private mh field_p;
    static ki field_y;
    private int field_t;
    static int field_z;
    private eh field_l;
    private hd field_i;
    private int field_r;
    private byte[] field_g;
    private ge field_n;
    private eh field_w;
    private wj field_q;
    private int field_k;
    private vl field_j;
    private im field_x;
    private boolean field_s;
    private boolean field_h;
    private int field_o;
    private im field_m;
    private long field_v;
    private boolean field_u;

    private final wj a(int param0, byte param1, int param2) {
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
        Object stackIn_27_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_113_0 = null;
        byte stackIn_131_0 = 0;
        byte stackIn_131_1 = 0;
        Object stackIn_147_0 = null;
        int stackIn_151_0 = 0;
        byte stackIn_151_1 = 0;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_59_0 = null;
        byte stackOut_130_0 = 0;
        byte stackOut_130_1 = 0;
        Object stackOut_146_0 = null;
        int stackOut_149_0 = 0;
        byte stackOut_149_1 = 0;
        Object stackOut_158_0 = null;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_112_0 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (wj) (Object) ((ak) this).field_p.a((long)param0, -1);
              if (var4 == null) {
                break L1;
              } else {
                if (0 != param2) {
                  break L1;
                } else {
                  if (((wj) var4).field_n) {
                    break L1;
                  } else {
                    if (!((wj) var4).field_l) {
                      break L1;
                    } else {
                      ((wj) var4).b(57);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4) {
                L3: {
                  L4: {
                    if (param2 != 0) {
                      break L4;
                    } else {
                      L5: {
                        if (null == ((ak) this).field_l) {
                          break L5;
                        } else {
                          if (((ak) this).field_g[param0] == -1) {
                            break L5;
                          } else {
                            var4 = (Object) (Object) ((ak) this).field_j.a(((ak) this).field_l, param0, -126);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (!((ak) this).field_n.d(-110)) {
                        var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, true, ((ak) this).field_t, (byte) 2);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        return (wj) (Object) stackIn_27_0;
                      }
                    }
                  }
                  L6: {
                    if (1 != param2) {
                      break L6;
                    } else {
                      if (((ak) this).field_l == null) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((ak) this).field_j.a((byte) 123, ((ak) this).field_l, param0);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (2 == param2) {
                    if (((ak) this).field_l != null) {
                      if (-1 != ((ak) this).field_g[param0]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (((ak) this).field_n.a(false)) {
                            break L7;
                          } else {
                            var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, false, ((ak) this).field_t, (byte) 2);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                        stackOut_53_0 = null;
                        stackIn_54_0 = stackOut_53_0;
                        return (wj) (Object) stackIn_54_0;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((ak) this).field_p.a((long)param0, (byte) 127, (ca) var4);
                break L2;
              } else {
                break L2;
              }
            }
            if (((wj) var4).field_l) {
              stackOut_59_0 = null;
              stackIn_60_0 = stackOut_59_0;
              return (wj) (Object) stackIn_60_0;
            } else {
              L8: {
                if (param1 > 30) {
                  break L8;
                } else {
                  field_z = -77;
                  break L8;
                }
              }
              var5 = ((wj) var4).f(0);
              if (!(var4 instanceof uc)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length <= 2) {
                          break L10;
                        } else {
                          ee.field_f.reset();
                          ee.field_f.update(var5, 0, -2 + var5.length);
                          var6_int = (int)ee.field_f.getValue();
                          if (~var6_int == ~((ak) this).field_i.field_r[param0]) {
                            L11: {
                              if (null == ((ak) this).field_i.field_k) {
                                break L11;
                              } else {
                                if (null == ((ak) this).field_i.field_k[param0]) {
                                  break L11;
                                } else {
                                  var7 = ((ak) this).field_i.field_k[param0];
                                  var8 = ee.a(-1, var5.length + -2, 0, var5);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (64 <= var9) {
                                      break L11;
                                    } else {
                                      stackOut_130_0 = var7[var9];
                                      stackOut_130_1 = var8[var9];
                                      stackIn_151_0 = stackOut_130_0;
                                      stackIn_151_1 = stackOut_130_1;
                                      stackIn_131_0 = stackOut_130_0;
                                      stackIn_131_1 = stackOut_130_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_131_0 != stackIn_131_1) {
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
                            ((ak) this).field_n.field_b = 0;
                            ((ak) this).field_n.field_n = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
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
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((ak) this).field_n.f(-105);
                    ((wj) var4).b(57);
                    if (!((wj) var4).field_n) {
                      break L13;
                    } else {
                      if (!((ak) this).field_n.d(-88)) {
                        var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, true, ((ak) this).field_t, (byte) 2);
                        ((ak) this).field_p.a((long)param0, (byte) -99, (ca) var4);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  stackOut_146_0 = null;
                  stackIn_147_0 = stackOut_146_0;
                  return (wj) (Object) stackIn_147_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((ak) this).field_i.field_i[param0] >>> -724231640);
                      var5[-1 + var5.length] = (byte)((ak) this).field_i.field_i[param0];
                      if (null == ((ak) this).field_l) {
                        break L14;
                      } else {
                        uc discarded$1 = ((ak) this).field_j.a(param0, ((ak) this).field_l, var5, 2);
                        stackOut_149_0 = 1;
                        stackOut_149_1 = ((ak) this).field_g[param0];
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_151_1 = stackOut_149_1;
                        break L15;
                      }
                    }
                  }
                  if (stackIn_151_0 == stackIn_151_1) {
                    break L14;
                  } else {
                    ((ak) this).field_g[param0] = (byte) 1;
                    break L14;
                  }
                }
                L16: {
                  if (!((wj) var4).field_n) {
                    ((wj) var4).b(57);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                stackOut_158_0 = var4;
                stackIn_159_0 = stackOut_158_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (null == var5) {
                        break L18;
                      } else {
                        if (2 < var5.length) {
                          ee.field_f.reset();
                          ee.field_f.update(var5, 0, var5.length - 2);
                          var6_int = (int)ee.field_f.getValue();
                          if (~var6_int == ~((ak) this).field_i.field_r[param0]) {
                            L19: {
                              L20: {
                                if (((ak) this).field_i.field_k == null) {
                                  break L20;
                                } else {
                                  if (((ak) this).field_i.field_k[param0] != null) {
                                    var7 = ((ak) this).field_i.field_k[param0];
                                    var8 = ee.a(-1, var5.length - 2, 0, var5);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_82_0 = ~var7[var9];
                                        stackOut_82_1 = ~var8[var9];
                                        stackIn_90_0 = stackOut_82_0;
                                        stackIn_90_1 = stackOut_82_1;
                                        stackIn_83_0 = stackOut_82_0;
                                        stackIn_83_1 = stackOut_82_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_83_0 == stackIn_83_1) {
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
                              stackOut_89_0 = 255 & var5[var5.length + -1];
                              stackOut_89_1 = var5[-2 + var5.length] << 205404776 & 65280;
                              stackIn_90_0 = stackOut_89_0;
                              stackIn_90_1 = stackOut_89_1;
                              break L19;
                            }
                            var7_int = stackIn_90_0 + stackIn_90_1;
                            if (~(((ak) this).field_i.field_i[param0] & 65535) != ~var7_int) {
                              throw new RuntimeException();
                            } else {
                              L22: {
                                if (1 == ((ak) this).field_g[param0]) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((ak) this).field_g[param0] != 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((ak) this).field_g[param0] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (!((wj) var4).field_n) {
                                  ((wj) var4).b(57);
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              stackOut_103_0 = var4;
                              stackIn_104_0 = stackOut_103_0;
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
                    ((ak) this).field_g[param0] = (byte) -1;
                    ((wj) var4).b(57);
                    if (!((wj) var4).field_n) {
                      break L25;
                    } else {
                      if (!((ak) this).field_n.d(-9)) {
                        var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, true, ((ak) this).field_t, (byte) 2);
                        ((ak) this).field_p.a((long)param0, (byte) -8, (ca) var4);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  stackOut_112_0 = null;
                  stackIn_113_0 = stackOut_112_0;
                  return (wj) (Object) stackIn_113_0;
                }
                return (wj) (Object) stackIn_104_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw dd.a((Throwable) var4, "ak.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (wj) (Object) stackIn_159_0;
    }

    final hd a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        hd stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_54_0 = null;
        hd stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_4_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_39_0 = null;
        hd stackOut_62_0 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (null != ((ak) this).field_i) {
              stackOut_4_0 = ((ak) this).field_i;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (((ak) this).field_q == null) {
                  if (((ak) this).field_n.d(-105)) {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (hd) (Object) stackIn_13_0;
                  } else {
                    ((ak) this).field_q = (wj) (Object) ((ak) this).field_n.a(15937, ((ak) this).field_t, true, 255, (byte) 0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (((ak) this).field_q.field_l) {
                stackOut_18_0 = null;
                stackIn_19_0 = stackOut_18_0;
                return (hd) (Object) stackIn_19_0;
              } else {
                L2: {
                  if (param0 == -23879) {
                    break L2;
                  } else {
                    ak.b(26);
                    break L2;
                  }
                }
                L3: {
                  var2_array = ((ak) this).field_q.f(0);
                  if (!(((ak) this).field_q instanceof uc)) {
                    try {
                      L4: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((ak) this).field_i = new hd(var2_array, ((ak) this).field_r, ((ak) this).field_A);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        L6: {
                          var3 = decompiledCaughtException;
                          ((ak) this).field_n.f(-128);
                          ((ak) this).field_i = null;
                          if (((ak) this).field_n.d(-20)) {
                            break L6;
                          } else {
                            ((ak) this).field_q = (wj) (Object) ((ak) this).field_n.a(param0 ^ -25352, ((ak) this).field_t, true, 255, (byte) 0);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((ak) this).field_q = null;
                        break L5;
                      }
                      stackOut_53_0 = null;
                      stackIn_54_0 = stackOut_53_0;
                      return (hd) (Object) stackIn_54_0;
                    }
                    if (((ak) this).field_w == null) {
                      break L3;
                    } else {
                      uc discarded$1 = ((ak) this).field_j.a(((ak) this).field_t, ((ak) this).field_w, var2_array, 2);
                      break L3;
                    }
                  } else {
                    try {
                      L7: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((ak) this).field_i = new hd(var2_array, ((ak) this).field_r, ((ak) this).field_A);
                          if (~((ak) this).field_k != ~((ak) this).field_i.field_b) {
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
                          var3 = decompiledCaughtException;
                          ((ak) this).field_i = null;
                          if (!((ak) this).field_n.d(-13)) {
                            break L9;
                          } else {
                            ((ak) this).field_q = null;
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((ak) this).field_q = (wj) (Object) ((ak) this).field_n.a(15937, ((ak) this).field_t, true, 255, (byte) 0);
                        break L8;
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = stackOut_39_0;
                      return (hd) (Object) stackIn_40_0;
                    }
                    break L3;
                  }
                }
                L10: {
                  ((ak) this).field_q = null;
                  if (null != ((ak) this).field_l) {
                    ((ak) this).field_g = new byte[((ak) this).field_i.field_s];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                stackOut_62_0 = ((ak) this).field_i;
                stackIn_63_0 = stackOut_62_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ak.C(" + param0 + ')');
        }
        return stackIn_63_0;
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        ca var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        byte stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (((ak) this).field_m != null) {
              if (null == ((ak) this).a(-23879)) {
                return;
              } else {
                var2_ref = ((ak) this).field_x.b((byte) -16);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_ref == null) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_d;
                        stackOut_8_0 = -1;
                        stackOut_8_1 = ~var3;
                        stackIn_34_0 = stackOut_8_0;
                        stackIn_34_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (stackIn_9_0 < stackIn_9_1) {
                                  break L6;
                                } else {
                                  if (((ak) this).field_i.field_s <= var3) {
                                    break L6;
                                  } else {
                                    if (0 == ((ak) this).field_i.field_d[var3]) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var2_ref.b(57);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((ak) this).field_g[var3] != 0) {
                                break L7;
                              } else {
                                wj discarded$2 = this.a(var3, (byte) 122, 1);
                                break L7;
                              }
                            }
                            L8: {
                              if (((ak) this).field_g[var3] != -1) {
                                break L8;
                              } else {
                                wj discarded$3 = this.a(var3, (byte) 76, 2);
                                break L8;
                              }
                            }
                            if (((ak) this).field_g[var3] != 1) {
                              break L4;
                            } else {
                              var2_ref.b(57);
                              break L4;
                            }
                          }
                          var2_ref = ((ak) this).field_x.d(853);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_33_0 = param0;
                    stackOut_33_1 = 57;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    break L2;
                  }
                  L9: {
                    if (stackIn_34_0 == stackIn_34_1) {
                      break L9;
                    } else {
                      ak.b(-86);
                      break L9;
                    }
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ak.J(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((ak) this).field_l == null) {
              return;
            } else {
              L1: {
                ((ak) this).field_h = true;
                if (null != ((ak) this).field_m) {
                  break L1;
                } else {
                  ((ak) this).field_m = new im();
                  break L1;
                }
              }
              var2_int = 123 % ((param0 - -14) / 40);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ak.I(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        e.field_a = null;
        if (param0 != 22176) {
            return;
        }
        try {
            gj.field_f = null;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ak.L(" + param0 + ')');
        }
    }

    final int b(int param0, int param1) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            var3 = (wj) (Object) ((ak) this).field_p.a((long)param0, -1);
            if (null != var3) {
              stackOut_3_0 = var3.e(param1 ^ -7334);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == -7362) {
                  break L1;
                } else {
                  ((ak) this).e((byte) -116);
                  break L1;
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3_ref, "ak.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final byte[] a(int param0, int param1) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        try {
          L0: {
            var3 = this.a(param1, (byte) 54, 0);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param0 == -15861) {
                  break L1;
                } else {
                  ((ak) this).field_m = null;
                  break L1;
                }
              }
              var4 = var3.f(0);
              var3.b(param0 + 15918);
              stackOut_8_0 = (byte[]) var4;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3_ref, "ak.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        wj var2_ref = null;
        ca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        byte stackIn_16_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        ge stackIn_38_0 = null;
        ge stackIn_40_0 = null;
        ge stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        byte stackOut_15_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        ge stackOut_37_0 = null;
        ge stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        ge stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_97_0 = 0;
        boolean stackOut_101_0 = false;
        int stackOut_101_1 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((ak) this).field_m) {
                  if (((ak) this).a(-23879) != null) {
                    L3: {
                      if (((ak) this).field_s) {
                        break L3;
                      } else {
                        L4: {
                          if (((ak) this).field_h) {
                            break L4;
                          } else {
                            ((ak) this).field_m = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((ak) this).field_m.b((byte) -17);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_d;
                                stackOut_15_0 = 1;
                                stackOut_15_1 = ((ak) this).field_g[var4];
                                stackIn_27_0 = stackOut_15_0;
                                stackIn_27_1 = stackOut_15_1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_27_0 <= stackIn_27_1) {
                                      break L6;
                                    } else {
                                      stackOut_28_0 = 0;
                                      stackOut_28_1 = ((ak) this).field_i.field_d[((ak) this).field_o];
                                      stackIn_102_0 = stackOut_28_0;
                                      stackIn_102_1 = stackOut_28_1;
                                      stackIn_29_0 = stackOut_28_0;
                                      stackIn_29_1 = stackOut_28_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackOut_29_1 = stackIn_29_1;
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_31_1 = stackOut_29_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_31_0 != stackIn_31_1) {
                                              break L10;
                                            } else {
                                              ((ak) this).field_o = ((ak) this).field_o + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            stackOut_37_0 = ((ak) this).field_n;
                                            stackIn_40_0 = stackOut_37_0;
                                            stackIn_38_0 = stackOut_37_0;
                                            if (param0) {
                                              stackOut_40_0 = (ge) (Object) stackIn_40_0;
                                              stackOut_40_1 = 0;
                                              stackIn_41_0 = stackOut_40_0;
                                              stackIn_41_1 = stackOut_40_1;
                                              break L11;
                                            } else {
                                              stackOut_38_0 = (ge) (Object) stackIn_38_0;
                                              stackOut_38_1 = 1;
                                              stackIn_41_0 = stackOut_38_0;
                                              stackIn_41_1 = stackOut_38_1;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((ge) (Object) stackIn_41_0).a(stackIn_41_1 != 0)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L12;
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (1 == ((ak) this).field_g[((ak) this).field_o]) {
                                              break L13;
                                            } else {
                                              wj discarded$4 = this.a(((ak) this).field_o, (byte) 63, 2);
                                              break L13;
                                            }
                                          }
                                          L14: {
                                            if (((ak) this).field_g[((ak) this).field_o] != 1) {
                                              var3 = new ca();
                                              var3.field_d = (long)((ak) this).field_o;
                                              ((ak) this).field_m.a(-90, var3);
                                              var2_int = 0;
                                              break L14;
                                            } else {
                                              break L14;
                                            }
                                          }
                                          ((ak) this).field_o = ((ak) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_26_0 = ~((ak) this).field_o;
                                        stackOut_26_1 = ~((ak) this).field_i.field_d.length;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L15: {
                                    if (stackIn_16_0 != stackIn_16_1) {
                                      wj discarded$5 = this.a(var4, (byte) 107, 2);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      if (((ak) this).field_g[var4] == 1) {
                                        break L17;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var3.b(57);
                                    break L16;
                                  }
                                  var3 = ((ak) this).field_m.d(853);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L18: while (true) {
                              stackOut_26_0 = ~((ak) this).field_o;
                              stackOut_26_1 = ~((ak) this).field_i.field_d.length;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              if (stackIn_27_0 <= stackIn_27_1) {
                                break L6;
                              } else {
                                stackOut_28_0 = 0;
                                stackOut_28_1 = ((ak) this).field_i.field_d[((ak) this).field_o];
                                stackIn_102_0 = stackOut_28_0;
                                stackIn_102_1 = stackOut_28_1;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_29_0 = stackIn_29_0;
                                  stackOut_29_1 = stackIn_29_1;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_31_1 = stackOut_29_1;
                                  L19: {
                                    if (stackIn_31_0 != stackIn_31_1) {
                                      break L19;
                                    } else {
                                      ((ak) this).field_o = ((ak) this).field_o + 1;
                                      if (var5 == 0) {
                                        continue L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    stackOut_37_0 = ((ak) this).field_n;
                                    stackIn_40_0 = stackOut_37_0;
                                    stackIn_38_0 = stackOut_37_0;
                                    if (param0) {
                                      stackOut_40_0 = (ge) (Object) stackIn_40_0;
                                      stackOut_40_1 = 0;
                                      stackIn_41_0 = stackOut_40_0;
                                      stackIn_41_1 = stackOut_40_1;
                                      break L20;
                                    } else {
                                      stackOut_38_0 = (ge) (Object) stackIn_38_0;
                                      stackOut_38_1 = 1;
                                      stackIn_41_0 = stackOut_38_0;
                                      stackIn_41_1 = stackOut_38_1;
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((ge) (Object) stackIn_41_0).a(stackIn_41_1 != 0)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L21;
                                      }
                                    } else {
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    if (1 == ((ak) this).field_g[((ak) this).field_o]) {
                                      break L22;
                                    } else {
                                      wj discarded$4 = this.a(((ak) this).field_o, (byte) 63, 2);
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (((ak) this).field_g[((ak) this).field_o] != 1) {
                                      var3 = new ca();
                                      var3.field_d = (long)((ak) this).field_o;
                                      ((ak) this).field_m.a(-90, var3);
                                      var2_int = 0;
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((ak) this).field_o = ((ak) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L18;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L24: {
                            if (var2_int != 0) {
                              ((ak) this).field_h = false;
                              ((ak) this).field_o = 0;
                              break L24;
                            } else {
                              break L24;
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
                    var3 = ((ak) this).field_m.b((byte) -12);
                    L25: while (true) {
                      L26: {
                        L27: {
                          L28: {
                            if (null == var3) {
                              break L28;
                            } else {
                              var4 = (int)var3.field_d;
                              stackOut_62_0 = ~((ak) this).field_g[var4];
                              stackOut_62_1 = -1;
                              stackIn_74_0 = stackOut_62_0;
                              stackIn_74_1 = stackOut_62_1;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              if (var5 != 0) {
                                L29: while (true) {
                                  if (stackIn_74_0 <= stackIn_74_1) {
                                    break L27;
                                  } else {
                                    stackOut_75_0 = ((ak) this).field_i.field_d[((ak) this).field_o];
                                    stackIn_98_0 = stackOut_75_0;
                                    stackIn_76_0 = stackOut_75_0;
                                    if (var5 != 0) {
                                      break L26;
                                    } else {
                                      stackOut_76_0 = stackIn_76_0;
                                      stackIn_78_0 = stackOut_76_0;
                                      L30: {
                                        L31: {
                                          if (stackIn_78_0 != 0) {
                                            break L31;
                                          } else {
                                            ((ak) this).field_o = ((ak) this).field_o + 1;
                                            if (var5 == 0) {
                                              break L30;
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                        L32: {
                                          if (250 <= ((ak) this).field_j.field_b) {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L27;
                                            } else {
                                              break L32;
                                            }
                                          } else {
                                            break L32;
                                          }
                                        }
                                        L33: {
                                          if (((ak) this).field_g[((ak) this).field_o] == 0) {
                                            wj discarded$6 = this.a(((ak) this).field_o, (byte) 43, 1);
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                        L34: {
                                          if (((ak) this).field_g[((ak) this).field_o] != 0) {
                                            break L34;
                                          } else {
                                            var3 = new ca();
                                            var3.field_d = (long)((ak) this).field_o;
                                            ((ak) this).field_m.a(-121, var3);
                                            var2_int = 0;
                                            break L34;
                                          }
                                        }
                                        ((ak) this).field_o = ((ak) this).field_o + 1;
                                        if (var5 == 0) {
                                          break L30;
                                        } else {
                                          break L27;
                                        }
                                      }
                                      stackOut_73_0 = ((ak) this).field_i.field_d.length;
                                      stackOut_73_1 = ((ak) this).field_o;
                                      stackIn_74_0 = stackOut_73_0;
                                      stackIn_74_1 = stackOut_73_1;
                                      continue L29;
                                    }
                                  }
                                }
                              } else {
                                L35: {
                                  if (stackIn_63_0 != stackIn_63_1) {
                                    break L35;
                                  } else {
                                    wj discarded$7 = this.a(var4, (byte) 55, 1);
                                    break L35;
                                  }
                                }
                                L36: {
                                  L37: {
                                    if (((ak) this).field_g[var4] != 0) {
                                      break L37;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                  var3.b(57);
                                  break L36;
                                }
                                var3 = ((ak) this).field_m.d(853);
                                if (var5 == 0) {
                                  continue L25;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                          L38: while (true) {
                            stackOut_73_0 = ((ak) this).field_i.field_d.length;
                            stackOut_73_1 = ((ak) this).field_o;
                            stackIn_74_0 = stackOut_73_0;
                            stackIn_74_1 = stackOut_73_1;
                            if (stackIn_74_0 <= stackIn_74_1) {
                              break L27;
                            } else {
                              stackOut_75_0 = ((ak) this).field_i.field_d[((ak) this).field_o];
                              stackIn_98_0 = stackOut_75_0;
                              stackIn_76_0 = stackOut_75_0;
                              if (var5 != 0) {
                                break L26;
                              } else {
                                stackOut_76_0 = stackIn_76_0;
                                stackIn_78_0 = stackOut_76_0;
                                L39: {
                                  if (stackIn_78_0 != 0) {
                                    break L39;
                                  } else {
                                    ((ak) this).field_o = ((ak) this).field_o + 1;
                                    if (var5 == 0) {
                                      continue L38;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                                L40: {
                                  if (250 <= ((ak) this).field_j.field_b) {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L27;
                                    } else {
                                      break L40;
                                    }
                                  } else {
                                    break L40;
                                  }
                                }
                                L41: {
                                  if (((ak) this).field_g[((ak) this).field_o] == 0) {
                                    wj discarded$6 = this.a(((ak) this).field_o, (byte) 43, 1);
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                                L42: {
                                  if (((ak) this).field_g[((ak) this).field_o] != 0) {
                                    break L42;
                                  } else {
                                    var3 = new ca();
                                    var3.field_d = (long)((ak) this).field_o;
                                    ((ak) this).field_m.a(-121, var3);
                                    var2_int = 0;
                                    break L42;
                                  }
                                }
                                ((ak) this).field_o = ((ak) this).field_o + 1;
                                if (var5 == 0) {
                                  continue L38;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                        }
                        stackOut_97_0 = var2_int;
                        stackIn_98_0 = stackOut_97_0;
                        break L26;
                      }
                      if (stackIn_98_0 == 0) {
                        break L2;
                      } else {
                        ((ak) this).field_s = false;
                        ((ak) this).field_o = 0;
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L2;
                }
              }
              stackOut_101_0 = param0;
              stackOut_101_1 = 1;
              stackIn_102_0 = stackOut_101_0 ? 1 : 0;
              stackIn_102_1 = stackOut_101_1;
              break L1;
            }
            if (stackIn_102_0 == stackIn_102_1) {
              L43: {
                if (!((ak) this).field_u) {
                  break L43;
                } else {
                  if (~ji.b(-40) > ~((ak) this).field_v) {
                    break L43;
                  } else {
                    var2_ref = (wj) (Object) ((ak) this).field_p.a((byte) 121);
                    L44: while (true) {
                      L45: {
                        if (null == var2_ref) {
                          break L45;
                        } else {
                          if (var5 != 0) {
                            break L43;
                          } else {
                            L46: {
                              if (var2_ref.field_l) {
                                break L46;
                              } else {
                                L47: {
                                  if (var2_ref.field_p) {
                                    break L47;
                                  } else {
                                    var2_ref.field_p = true;
                                    if (var5 == 0) {
                                      break L46;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                                if (var2_ref.field_n) {
                                  var2_ref.b(57);
                                  break L46;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                            var2_ref = (wj) (Object) ((ak) this).field_p.c((byte) -112);
                            if (var5 == 0) {
                              continue L44;
                            } else {
                              break L45;
                            }
                          }
                        }
                      }
                      ((ak) this).field_v = 1000L + ji.b(-80);
                      break L43;
                    }
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
          throw dd.a((Throwable) (Object) var2, "ak.G(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_y = null;
            int var1_int = -101 % ((-38 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ak.H(" + param0 + ')');
        }
    }

    ak(int param0, eh param1, eh param2, ge param3, vl param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((ak) this).field_p = new mh(16);
        ((ak) this).field_o = 0;
        ((ak) this).field_x = new im();
        ((ak) this).field_v = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ak) this).field_l = param1;
                ((ak) this).field_t = param0;
                if (null != ((ak) this).field_l) {
                  break L2;
                } else {
                  ((ak) this).field_s = false;
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ak) this).field_s = true;
              ((ak) this).field_m = new im();
              break L1;
            }
            L3: {
              ((ak) this).field_r = param5;
              ((ak) this).field_j = param4;
              ((ak) this).field_w = param2;
              ((ak) this).field_k = param7;
              ((ak) this).field_n = param3;
              ((ak) this).field_A = param6;
              ((ak) this).field_u = param8;
              if (null == ((ak) this).field_w) {
                break L3;
              } else {
                ((ak) this).field_q = (wj) (Object) ((ak) this).field_j.a(((ak) this).field_w, ((ak) this).field_t, -128);
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
            stackOut_9_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');
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
          throw dd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
