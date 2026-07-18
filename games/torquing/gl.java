/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends me {
    private pb field_k;
    private nk field_i;
    private byte[] field_f;
    private byte[] field_g;
    private fd field_v;
    private int field_r;
    private jp field_j;
    private co field_u;
    private int field_c;
    static ei field_d;
    private pb field_h;
    private eb field_t;
    static int field_q;
    private int field_p;
    private int field_n;
    private ei field_s;
    private boolean field_l;
    private ei field_e;
    private boolean field_b;
    private long field_o;
    private boolean field_m;

    final fd b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        fd stackIn_5_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_56_0 = null;
        fd stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_4_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_55_0 = null;
        fd stackOut_61_0 = null;
        Object stackOut_19_0 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (null != ((gl) this).field_v) {
              stackOut_4_0 = ((gl) this).field_v;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (param0 == -126) {
                  break L1;
                } else {
                  ((gl) this).field_s = null;
                  break L1;
                }
              }
              L2: {
                if (null == ((gl) this).field_i) {
                  if (((gl) this).field_j.a(20)) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (fd) (Object) stackIn_16_0;
                  } else {
                    ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (!((gl) this).field_i.field_r) {
                L3: {
                  L4: {
                    var2_array = ((gl) this).field_i.c((byte) 114);
                    if (((gl) this).field_i instanceof lb) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((gl) this).field_v = new fd(var2_array, ((gl) this).field_r, ((gl) this).field_g);
                            break L5;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((gl) this).field_j.e((byte) -127);
                            ((gl) this).field_v = null;
                            if (!((gl) this).field_j.a(param0 ^ -106)) {
                              break L7;
                            } else {
                              ((gl) this).field_i = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                          break L6;
                        }
                        stackOut_34_0 = null;
                        stackIn_35_0 = stackOut_34_0;
                        return (fd) (Object) stackIn_35_0;
                      }
                      if (null == ((gl) this).field_h) {
                        break L3;
                      } else {
                        lb discarded$1 = ((gl) this).field_u.a(var2_array, ((gl) this).field_c, ((gl) this).field_h, (byte) 120);
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
                      if (var2_array == null) {
                        throw new RuntimeException();
                      } else {
                        ((gl) this).field_v = new fd(var2_array, ((gl) this).field_r, ((gl) this).field_g);
                        if (((gl) this).field_p != ((gl) this).field_v.field_r) {
                          throw new RuntimeException();
                        } else {
                          break L8;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((gl) this).field_v = null;
                        if (((gl) this).field_j.a(20)) {
                          break L10;
                        } else {
                          ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((gl) this).field_i = null;
                      break L9;
                    }
                    stackOut_55_0 = null;
                    stackIn_56_0 = stackOut_55_0;
                    return (fd) (Object) stackIn_56_0;
                  }
                  break L3;
                }
                L11: {
                  if (((gl) this).field_k != null) {
                    ((gl) this).field_f = new byte[((gl) this).field_v.field_c];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((gl) this).field_i = null;
                stackOut_61_0 = ((gl) this).field_v;
                stackIn_62_0 = stackOut_61_0;
                break L0;
              } else {
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                return (fd) (Object) stackIn_20_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "gl.F(" + param0 + ')');
        }
        return stackIn_62_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((gl) this).field_k != null) {
              ((gl) this).field_l = true;
              if (param0 < -107) {
                L1: {
                  if (((gl) this).field_e == null) {
                    ((gl) this).field_e = new ei();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
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
          throw rb.a((Throwable) (Object) var2, "gl.C(" + param0 + ')');
        }
    }

    final byte[] a(int param0, boolean param1) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1) {
              var3 = this.a(param0, 121, 0);
              if (var3 != null) {
                var4 = var3.c((byte) 112);
                var3.f(0);
                stackOut_6_0 = (byte[]) var4;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3_ref, "gl.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void c(int param0) {
        try {
            field_d = null;
            int var1_int = 109 % ((-37 - param0) / 37);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "gl.A(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -26954) {
                break L1;
              } else {
                gl.c(83);
                break L1;
              }
            }
            var3 = (nk) (Object) ((gl) this).field_t.a((long)param0, (byte) 101);
            if (var3 == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.b(param1 + 27066);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3_ref, "gl.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        q var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (null != ((gl) this).field_e) {
              if (null == ((gl) this).b((byte) -126)) {
                return;
              } else {
                L1: {
                  var2_ref = ((gl) this).field_s.b(0);
                  if (param0 == -94) {
                    break L1;
                  } else {
                    ((gl) this).field_m = false;
                    break L1;
                  }
                }
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
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
                                  if (((gl) this).field_v.field_c <= var3) {
                                    break L7;
                                  } else {
                                    if (((gl) this).field_v.field_l[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.f(0);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((gl) this).field_f[var3] != 0) {
                                break L8;
                              } else {
                                nk discarded$2 = this.a(var3, 121, 1);
                                break L8;
                              }
                            }
                            L9: {
                              if (((gl) this).field_f[var3] != -1) {
                                break L9;
                              } else {
                                nk discarded$3 = this.a(var3, 104, 2);
                                break L9;
                              }
                            }
                            if (((gl) this).field_f[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.f(0);
                              break L5;
                            }
                          }
                          var2_ref = ((gl) this).field_s.f(-24059);
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "gl.D(" + param0 + ')');
        }
    }

    private final nk a(int param0, int param1, int param2) {
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
        Object stackIn_32_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        Object stackIn_102_0 = null;
        Object stackIn_109_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        Object stackIn_143_0 = null;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        Object stackIn_155_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_31_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        Object stackOut_142_0 = null;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        Object stackOut_154_0 = null;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        Object stackOut_101_0 = null;
        Object stackOut_108_0 = null;
        Object stackOut_61_0 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 >= 76) {
                break L1;
              } else {
                ((gl) this).b(-28);
                break L1;
              }
            }
            L2: {
              var4 = (Object) (Object) (nk) (Object) ((gl) this).field_t.a((long)param0, (byte) 85);
              if (null == var4) {
                break L2;
              } else {
                if (0 != param2) {
                  break L2;
                } else {
                  if (((nk) var4).field_w) {
                    break L2;
                  } else {
                    if (((nk) var4).field_r) {
                      ((nk) var4).f(0);
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
                  L5: {
                    if (0 != param2) {
                      break L5;
                    } else {
                      L6: {
                        if (((gl) this).field_k == null) {
                          break L6;
                        } else {
                          if (((gl) this).field_f[param0] != -1) {
                            var4 = (Object) (Object) ((gl) this).field_u.a(param0, 23538, ((gl) this).field_k);
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (((gl) this).field_j.a(20)) {
                          break L7;
                        } else {
                          var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackOut_31_0 = null;
                      stackIn_32_0 = stackOut_31_0;
                      return (nk) (Object) stackIn_32_0;
                    }
                  }
                  if (1 == param2) {
                    if (((gl) this).field_k == null) {
                      throw new RuntimeException();
                    } else {
                      var4 = (Object) (Object) ((gl) this).field_u.b(param0, 3, ((gl) this).field_k);
                      break L4;
                    }
                  } else {
                    if (param2 == 2) {
                      if (((gl) this).field_k == null) {
                        throw new RuntimeException();
                      } else {
                        if (((gl) this).field_f[param0] != -1) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if (((gl) this).field_j.a((byte) 105)) {
                              break L8;
                            } else {
                              var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, false, (byte) -51, param0);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          stackOut_52_0 = null;
                          stackIn_53_0 = stackOut_52_0;
                          return (nk) (Object) stackIn_53_0;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                ((gl) this).field_t.a(false, (long)param0, (q) var4);
                break L3;
              }
            }
            if (!((nk) var4).field_r) {
              var5 = ((nk) var4).c((byte) 106);
              if (!(var4 instanceof lb)) {
                try {
                  L9: {
                    L10: {
                      if (null == var5) {
                        break L10;
                      } else {
                        if (var5.length > 2) {
                          nn.field_d.reset();
                          nn.field_d.update(var5, 0, -2 + var5.length);
                          var6_int = (int)nn.field_d.getValue();
                          if (((gl) this).field_v.field_p[param0] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (((gl) this).field_v.field_e == null) {
                                break L11;
                              } else {
                                if (((gl) this).field_v.field_e[param0] != null) {
                                  var7 = ((gl) this).field_v.field_e[param0];
                                  var8 = np.a(0, var5, -2 + var5.length, -107);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (64 <= var9) {
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
                                } else {
                                  break L11;
                                }
                              }
                            }
                            ((gl) this).field_j.field_g = 0;
                            ((gl) this).field_j.field_k = 0;
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
                    ((gl) this).field_j.e((byte) -58);
                    ((nk) var4).f(0);
                    if (!((nk) var4).field_w) {
                      break L13;
                    } else {
                      if (((gl) this).field_j.a(20)) {
                        break L13;
                      } else {
                        var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                        ((gl) this).field_t.a(false, (long)param0, (q) var4);
                        break L13;
                      }
                    }
                  }
                  stackOut_142_0 = null;
                  stackIn_143_0 = stackOut_142_0;
                  return (nk) (Object) stackIn_143_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[-2 + var5.length] = (byte)(((gl) this).field_v.field_q[param0] >>> -1637583128);
                      var5[var5.length + -1] = (byte)((gl) this).field_v.field_q[param0];
                      if (((gl) this).field_k != null) {
                        lb discarded$1 = ((gl) this).field_u.a(var5, param0, ((gl) this).field_k, (byte) 64);
                        stackOut_147_0 = -2;
                        stackOut_147_1 = ~((gl) this).field_f[param0];
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
                    ((gl) this).field_f[param0] = (byte) 1;
                    break L14;
                  }
                }
                L16: {
                  if (((nk) var4).field_w) {
                    break L16;
                  } else {
                    ((nk) var4).f(0);
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
                        if (var5.length <= 2) {
                          break L18;
                        } else {
                          nn.field_d.reset();
                          nn.field_d.update(var5, 0, var5.length + -2);
                          var6_int = (int)nn.field_d.getValue();
                          if (((gl) this).field_v.field_p[param0] == var6_int) {
                            L19: {
                              L20: {
                                if (null == ((gl) this).field_v.field_e) {
                                  break L20;
                                } else {
                                  if (((gl) this).field_v.field_e[param0] != null) {
                                    var7 = ((gl) this).field_v.field_e[param0];
                                    var8 = np.a(0, var5, var5.length + -2, -70);
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
                                          if (stackIn_83_0 != stackIn_83_1) {
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
                              stackOut_89_0 = (var5[var5.length + -2] & 255) << 458770376;
                              stackOut_89_1 = var5[var5.length + -1] & 255;
                              stackIn_90_0 = stackOut_89_0;
                              stackIn_90_1 = stackOut_89_1;
                              break L19;
                            }
                            var7_int = stackIn_90_0 + stackIn_90_1;
                            if (~(65535 & ((gl) this).field_v.field_q[param0]) == ~var7_int) {
                              L22: {
                                if (((gl) this).field_f[param0] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (((gl) this).field_f[param0] != 0) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((gl) this).field_f[param0] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (((nk) var4).field_w) {
                                  break L24;
                                } else {
                                  ((nk) var4).f(0);
                                  break L24;
                                }
                              }
                              stackOut_101_0 = var4;
                              stackIn_102_0 = stackOut_101_0;
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
                    ((gl) this).field_f[param0] = (byte) -1;
                    ((nk) var4).f(0);
                    if (((nk) var4).field_w) {
                      if (((gl) this).field_j.a(20)) {
                        break L25;
                      } else {
                        var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                        ((gl) this).field_t.a(false, (long)param0, (q) var4);
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  stackOut_108_0 = null;
                  stackIn_109_0 = stackOut_108_0;
                  return (nk) (Object) stackIn_109_0;
                }
                return (nk) (Object) stackIn_102_0;
              }
            } else {
              stackOut_61_0 = null;
              stackIn_62_0 = stackOut_61_0;
              return (nk) (Object) stackIn_62_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw rb.a((Throwable) var4, "gl.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (nk) (Object) stackIn_155_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        nk var2_ref = null;
        int var2_int = 0;
        q var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_48_0 = 0;
        byte stackIn_55_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_47_0 = 0;
        byte stackOut_54_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_90_0 = 0;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (((gl) this).field_e == null) {
                  break L1;
                } else {
                  if (((gl) this).b((byte) -126) != null) {
                    L2: {
                      if (((gl) this).field_b) {
                        break L2;
                      } else {
                        L3: {
                          if (((gl) this).field_l) {
                            break L3;
                          } else {
                            ((gl) this).field_e = null;
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((gl) this).field_e.b(0);
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 == null) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_f;
                                  stackOut_15_0 = ~((gl) this).field_f[var4];
                                  stackOut_15_1 = -2;
                                  stackIn_27_0 = stackOut_15_0;
                                  stackIn_27_1 = stackOut_15_1;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_27_0 >= stackIn_27_1) {
                                        break L6;
                                      } else {
                                        stackOut_28_0 = -1;
                                        stackIn_48_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if (var5 != 0) {
                                          break L5;
                                        } else {
                                          stackOut_29_0 = stackIn_29_0;
                                          stackIn_31_0 = stackOut_29_0;
                                          L9: {
                                            L10: {
                                              if (stackIn_31_0 != ~((gl) this).field_v.field_l[((gl) this).field_n]) {
                                                break L10;
                                              } else {
                                                ((gl) this).field_n = ((gl) this).field_n + 1;
                                                if (var5 == 0) {
                                                  break L9;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            L11: {
                                              if (!((gl) this).field_j.a((byte) 101)) {
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
                                              if (((gl) this).field_f[((gl) this).field_n] == 1) {
                                                break L12;
                                              } else {
                                                nk discarded$4 = this.a(((gl) this).field_n, 101, 2);
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (1 == ((gl) this).field_f[((gl) this).field_n]) {
                                                break L13;
                                              } else {
                                                var3 = new q();
                                                var3.field_f = (long)((gl) this).field_n;
                                                ((gl) this).field_e.a((byte) 54, var3);
                                                var2_int = 0;
                                                break L13;
                                              }
                                            }
                                            ((gl) this).field_n = ((gl) this).field_n + 1;
                                            if (var5 == 0) {
                                              break L9;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          stackOut_26_0 = ~((gl) this).field_v.field_l.length;
                                          stackOut_26_1 = ~((gl) this).field_n;
                                          stackIn_27_0 = stackOut_26_0;
                                          stackIn_27_1 = stackOut_26_1;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (stackIn_16_0 == stackIn_16_1) {
                                        break L14;
                                      } else {
                                        nk discarded$5 = this.a(var4, 124, 2);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (((gl) this).field_f[var4] == 1) {
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
                                      var3.f(~param0);
                                      break L15;
                                    }
                                    var3 = ((gl) this).field_e.f(param0 ^ 24058);
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L17: while (true) {
                                stackOut_26_0 = ~((gl) this).field_v.field_l.length;
                                stackOut_26_1 = ~((gl) this).field_n;
                                stackIn_27_0 = stackOut_26_0;
                                stackIn_27_1 = stackOut_26_1;
                                if (stackIn_27_0 >= stackIn_27_1) {
                                  break L6;
                                } else {
                                  stackOut_28_0 = -1;
                                  stackIn_48_0 = stackOut_28_0;
                                  stackIn_29_0 = stackOut_28_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    stackOut_29_0 = stackIn_29_0;
                                    stackIn_31_0 = stackOut_29_0;
                                    L18: {
                                      if (stackIn_31_0 != ~((gl) this).field_v.field_l[((gl) this).field_n]) {
                                        break L18;
                                      } else {
                                        ((gl) this).field_n = ((gl) this).field_n + 1;
                                        if (var5 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (!((gl) this).field_j.a((byte) 101)) {
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
                                      if (((gl) this).field_f[((gl) this).field_n] == 1) {
                                        break L20;
                                      } else {
                                        nk discarded$4 = this.a(((gl) this).field_n, 101, 2);
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (1 == ((gl) this).field_f[((gl) this).field_n]) {
                                        break L21;
                                      } else {
                                        var3 = new q();
                                        var3.field_f = (long)((gl) this).field_n;
                                        ((gl) this).field_e.a((byte) 54, var3);
                                        var2_int = 0;
                                        break L21;
                                      }
                                    }
                                    ((gl) this).field_n = ((gl) this).field_n + 1;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_47_0 = var2_int;
                            stackIn_48_0 = stackOut_47_0;
                            break L5;
                          }
                          L22: {
                            if (stackIn_48_0 == 0) {
                              break L22;
                            } else {
                              ((gl) this).field_n = 0;
                              ((gl) this).field_l = false;
                              break L22;
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
                    var2_int = 1;
                    var3 = ((gl) this).field_e.b(0);
                    L23: while (true) {
                      L24: {
                        L25: {
                          L26: {
                            if (var3 == null) {
                              break L26;
                            } else {
                              var4 = (int)var3.field_f;
                              stackOut_54_0 = ((gl) this).field_f[var4];
                              stackIn_67_0 = stackOut_54_0;
                              stackIn_55_0 = stackOut_54_0;
                              if (var5 != 0) {
                                L27: while (true) {
                                  if (stackIn_67_0 >= ((gl) this).field_v.field_l.length) {
                                    break L25;
                                  } else {
                                    stackOut_68_0 = -1;
                                    stackIn_91_0 = stackOut_68_0;
                                    stackIn_69_0 = stackOut_68_0;
                                    if (var5 != 0) {
                                      break L24;
                                    } else {
                                      stackOut_69_0 = stackIn_69_0;
                                      stackIn_71_0 = stackOut_69_0;
                                      L28: {
                                        L29: {
                                          if (stackIn_71_0 == ~((gl) this).field_v.field_l[((gl) this).field_n]) {
                                            ((gl) this).field_n = ((gl) this).field_n + 1;
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
                                          if (((gl) this).field_u.field_a < 250) {
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
                                          if (0 == ((gl) this).field_f[((gl) this).field_n]) {
                                            nk discarded$6 = this.a(((gl) this).field_n, param0 + 123, 1);
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                        L32: {
                                          if (((gl) this).field_f[((gl) this).field_n] == 0) {
                                            var3 = new q();
                                            var3.field_f = (long)((gl) this).field_n;
                                            var2_int = 0;
                                            ((gl) this).field_e.a((byte) 54, var3);
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        ((gl) this).field_n = ((gl) this).field_n + 1;
                                        if (var5 == 0) {
                                          break L28;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      stackOut_66_0 = ((gl) this).field_n;
                                      stackIn_67_0 = stackOut_66_0;
                                      continue L27;
                                    }
                                  }
                                }
                              } else {
                                L33: {
                                  if (stackIn_55_0 == 0) {
                                    nk discarded$7 = this.a(var4, 97, 1);
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                                L34: {
                                  L35: {
                                    if (((gl) this).field_f[var4] == 0) {
                                      break L35;
                                    } else {
                                      var3.f(0);
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
                                var3 = ((gl) this).field_e.f(-24059);
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L36: while (true) {
                            stackOut_66_0 = ((gl) this).field_n;
                            stackIn_67_0 = stackOut_66_0;
                            if (stackIn_67_0 >= ((gl) this).field_v.field_l.length) {
                              break L25;
                            } else {
                              stackOut_68_0 = -1;
                              stackIn_91_0 = stackOut_68_0;
                              stackIn_69_0 = stackOut_68_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                stackOut_69_0 = stackIn_69_0;
                                stackIn_71_0 = stackOut_69_0;
                                L37: {
                                  if (stackIn_71_0 == ~((gl) this).field_v.field_l[((gl) this).field_n]) {
                                    ((gl) this).field_n = ((gl) this).field_n + 1;
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
                                  if (((gl) this).field_u.field_a < 250) {
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
                                  if (0 == ((gl) this).field_f[((gl) this).field_n]) {
                                    nk discarded$6 = this.a(((gl) this).field_n, param0 + 123, 1);
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (((gl) this).field_f[((gl) this).field_n] == 0) {
                                    var3 = new q();
                                    var3.field_f = (long)((gl) this).field_n;
                                    var2_int = 0;
                                    ((gl) this).field_e.a((byte) 54, var3);
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                ((gl) this).field_n = ((gl) this).field_n + 1;
                                if (var5 == 0) {
                                  continue L36;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        stackOut_90_0 = var2_int;
                        stackIn_91_0 = stackOut_90_0;
                        break L24;
                      }
                      if (stackIn_91_0 == 0) {
                        break L1;
                      } else {
                        ((gl) this).field_b = false;
                        ((gl) this).field_n = 0;
                        break L1;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              L41: {
                if (!((gl) this).field_m) {
                  break L41;
                } else {
                  if (km.b(-1) >= ((gl) this).field_o) {
                    var2_ref = (nk) (Object) ((gl) this).field_t.c((byte) -119);
                    L42: while (true) {
                      L43: {
                        if (var2_ref == null) {
                          break L43;
                        } else {
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L44: {
                              if (var2_ref.field_r) {
                                break L44;
                              } else {
                                L45: {
                                  if (var2_ref.field_v) {
                                    break L45;
                                  } else {
                                    var2_ref.field_v = true;
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                if (var2_ref.field_w) {
                                  var2_ref.f(0);
                                  break L44;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                            var2_ref = (nk) (Object) ((gl) this).field_t.b((byte) 105);
                            if (var5 == 0) {
                              continue L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      ((gl) this).field_o = km.b(-1) + 1000L;
                      break L41;
                    }
                  } else {
                    break L41;
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
          throw rb.a((Throwable) (Object) var2, "gl.B(" + param0 + ')');
        }
    }

    gl(int param0, pb param1, pb param2, jp param3, co param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((gl) this).field_t = new eb(16);
        ((gl) this).field_n = 0;
        ((gl) this).field_s = new ei();
        ((gl) this).field_o = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((gl) this).field_k = param1;
                ((gl) this).field_c = param0;
                if (((gl) this).field_k != null) {
                  break L2;
                } else {
                  ((gl) this).field_b = false;
                  if (Torquing.field_u == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((gl) this).field_b = true;
              ((gl) this).field_e = new ei();
              break L1;
            }
            L3: {
              ((gl) this).field_p = param7;
              ((gl) this).field_j = param3;
              ((gl) this).field_h = param2;
              ((gl) this).field_m = param8;
              ((gl) this).field_g = param6;
              ((gl) this).field_u = param4;
              ((gl) this).field_r = param5;
              if (((gl) this).field_h != null) {
                ((gl) this).field_i = (nk) (Object) ((gl) this).field_u.a(((gl) this).field_c, 23538, ((gl) this).field_h);
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
            stackOut_10_1 = new StringBuilder().append("gl.<init>(").append(param0).append(',');
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
          throw rb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ei();
        field_q = 0;
    }
}
