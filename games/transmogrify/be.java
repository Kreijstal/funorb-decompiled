/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends ih {
    private uh field_t;
    private rh field_f;
    private int field_o;
    private fl field_m;
    private int field_r;
    private ak field_p;
    private cd field_g;
    private ak field_z;
    private byte[] field_i;
    static int field_q;
    private byte[] field_k;
    private el field_v;
    private int field_A;
    private qj field_y;
    private int field_e;
    private qj field_s;
    private boolean field_h;
    private boolean field_u;
    private boolean field_j;
    private long field_l;
    static nk field_w;
    static ci field_n;
    static int field_x;

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 92) {
                break L1;
              } else {
                int discarded$2 = be.b(-13);
                break L1;
              }
            }
            field_n = null;
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "be.L(" + param0 + ')');
        }
    }

    private final rh a(int param0, byte param1, int param2) {
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
        Object stackIn_29_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_62_0 = null;
        byte stackIn_86_0 = 0;
        byte stackIn_86_1 = 0;
        Object stackIn_100_0 = null;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        Object stackIn_112_0 = null;
        byte stackIn_132_0 = 0;
        byte stackIn_132_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        Object stackIn_152_0 = null;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        Object stackOut_55_0 = null;
        Object stackOut_61_0 = null;
        byte stackOut_131_0 = 0;
        byte stackOut_131_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        Object stackOut_151_0 = null;
        byte stackOut_85_0 = 0;
        byte stackOut_85_1 = 0;
        Object stackOut_99_0 = null;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        Object stackOut_111_0 = null;
        Object stackOut_158_0 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (rh) (Object) ((be) this).field_m.a((long)param0, 0);
              if (null == var4) {
                break L0;
              } else {
                if (param2 != 0) {
                  break L0;
                } else {
                  if (((rh) var4).field_p) {
                    break L0;
                  } else {
                    if (((rh) var4).field_m) {
                      ((rh) var4).c(5);
                      var4 = null;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L1: {
              if (null == var4) {
                L2: {
                  L3: {
                    if (param2 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (((be) this).field_p == null) {
                          break L4;
                        } else {
                          if (((be) this).field_k[param0] == -1) {
                            break L4;
                          } else {
                            var4 = (Object) (Object) ((be) this).field_g.a(((be) this).field_p, param0, true);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (!((be) this).field_t.b(6)) {
                        var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, true, (byte) 2, param0);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_28_0 = null;
                        stackIn_29_0 = stackOut_28_0;
                        return (rh) (Object) stackIn_29_0;
                      }
                    }
                  }
                  L5: {
                    if (param2 != 1) {
                      break L5;
                    } else {
                      if (((be) this).field_p != null) {
                        var4 = (Object) (Object) ((be) this).field_g.a(param0, ((be) this).field_p, (byte) 67);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (2 == param2) {
                    if (((be) this).field_p == null) {
                      throw new RuntimeException();
                    } else {
                      if (((be) this).field_k[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (((be) this).field_t.b((byte) 95)) {
                            break L6;
                          } else {
                            var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, false, (byte) 2, param0);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          }
                        }
                        stackOut_55_0 = null;
                        stackIn_56_0 = stackOut_55_0;
                        return (rh) (Object) stackIn_56_0;
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((be) this).field_m.a((long)param0, (byte) -98, (wf) var4);
                break L1;
              } else {
                break L1;
              }
            }
            if (((rh) var4).field_m) {
              stackOut_61_0 = null;
              stackIn_62_0 = stackOut_61_0;
              return (rh) (Object) stackIn_62_0;
            } else {
              L7: {
                var5 = ((rh) var4).e(256);
                if (param1 == 2) {
                  break L7;
                } else {
                  int discarded$2 = ((be) this).b(-44, 48);
                  break L7;
                }
              }
              if (var4 instanceof cl) {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length <= 2) {
                      break L8;
                    } else {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var5.length + -2);
                      var6_int = (int)hc.field_v.getValue();
                      if (~var6_int == ~((be) this).field_v.field_j[param0]) {
                        L9: {
                          L10: {
                            if (((be) this).field_v.field_p == null) {
                              break L10;
                            } else {
                              if (null != ((be) this).field_v.field_p[param0]) {
                                var7_ref_byte__ = ((be) this).field_v.field_p[param0];
                                var8 = n.a(var5, var5.length - 2, -5705, 0);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_131_0 = var8[var9];
                                    stackOut_131_1 = var7_ref_byte__[var9];
                                    stackIn_139_0 = stackOut_131_0;
                                    stackIn_139_1 = stackOut_131_1;
                                    stackIn_132_0 = stackOut_131_0;
                                    stackIn_132_1 = stackOut_131_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_132_0 == stackIn_132_1) {
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
                          stackOut_138_0 = var5[var5.length - 2] << -224592664 & 65280;
                          stackOut_138_1 = var5[-1 + var5.length] & 255;
                          stackIn_139_0 = stackOut_138_0;
                          stackIn_139_1 = stackOut_138_1;
                          break L9;
                        }
                        var7 = stackIn_139_0 + stackIn_139_1;
                        if (~(65535 & ((be) this).field_v.field_q[param0]) == ~var7) {
                          L12: {
                            if (((be) this).field_k[param0] != 1) {
                              L13: {
                                if (0 == ((be) this).field_k[param0]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((be) this).field_k[param0] = (byte) 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (!((rh) var4).field_p) {
                              ((rh) var4).c(param1 + 3);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          stackOut_151_0 = var4;
                          stackIn_152_0 = stackOut_151_0;
                          return (rh) (Object) stackIn_152_0;
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
              } else {
                try {
                  L15: {
                    L16: {
                      if (null == var5) {
                        break L16;
                      } else {
                        if (var5.length > 2) {
                          hc.field_v.reset();
                          hc.field_v.update(var5, 0, var5.length - 2);
                          var6_int = (int)hc.field_v.getValue();
                          if (~var6_int != ~((be) this).field_v.field_j[param0]) {
                            throw new RuntimeException();
                          } else {
                            L17: {
                              if (((be) this).field_v.field_p == null) {
                                break L17;
                              } else {
                                if (null != ((be) this).field_v.field_p[param0]) {
                                  var7_ref_byte__ = ((be) this).field_v.field_p[param0];
                                  var8 = n.a(var5, var5.length - 2, -5705, 0);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (var9 >= 64) {
                                      break L17;
                                    } else {
                                      stackOut_85_0 = var7_ref_byte__[var9];
                                      stackOut_85_1 = var8[var9];
                                      stackIn_104_0 = stackOut_85_0;
                                      stackIn_104_1 = stackOut_85_1;
                                      stackIn_86_0 = stackOut_85_0;
                                      stackIn_86_1 = stackOut_85_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_86_0 == stackIn_86_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                            ((be) this).field_t.field_p = 0;
                            ((be) this).field_t.field_k = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L19: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((be) this).field_t.d(126);
                    ((rh) var4).c(5);
                    if (!((rh) var4).field_p) {
                      break L19;
                    } else {
                      if (((be) this).field_t.b(6)) {
                        break L19;
                      } else {
                        var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, true, (byte) 2, param0);
                        ((be) this).field_m.a((long)param0, (byte) -102, (wf) var4);
                        break L19;
                      }
                    }
                  }
                  stackOut_99_0 = null;
                  stackIn_100_0 = stackOut_99_0;
                  return (rh) (Object) stackIn_100_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[-2 + var5.length] = (byte)(((be) this).field_v.field_q[param0] >>> 1140682824);
                      var5[-1 + var5.length] = (byte)((be) this).field_v.field_q[param0];
                      if (null == ((be) this).field_p) {
                        break L20;
                      } else {
                        cl discarded$3 = ((be) this).field_g.a(((be) this).field_p, var5, -122, param0);
                        stackOut_102_0 = ~((be) this).field_k[param0];
                        stackOut_102_1 = -2;
                        stackIn_104_0 = stackOut_102_0;
                        stackIn_104_1 = stackOut_102_1;
                        break L21;
                      }
                    }
                  }
                  if (stackIn_104_0 != stackIn_104_1) {
                    ((be) this).field_k[param0] = (byte) 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L22: {
                  if (!((rh) var4).field_p) {
                    ((rh) var4).c(5);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                stackOut_111_0 = var4;
                stackIn_112_0 = stackOut_111_0;
                return (rh) (Object) stackIn_112_0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((be) this).field_k[param0] = (byte) -1;
              ((rh) var4).c(param1 ^ 7);
              if (((rh) var4).field_p) {
                if (((be) this).field_t.b(6)) {
                  break L23;
                } else {
                  var4 = (Object) (Object) ((be) this).field_t.a(((be) this).field_r, false, true, (byte) 2, param0);
                  ((be) this).field_m.a((long)param0, (byte) 98, (wf) var4);
                  break L23;
                }
              } else {
                break L23;
              }
            }
            stackOut_158_0 = null;
            stackIn_159_0 = stackOut_158_0;
            return (rh) (Object) stackIn_159_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw ch.a((Throwable) var4, "be.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final el a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        el stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_50_0 = null;
        el stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_4_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_49_0 = null;
        Object stackOut_35_0 = null;
        el stackOut_58_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_7_0 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null != ((be) this).field_v) {
              stackOut_4_0 = ((be) this).field_v;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param0 <= -88) {
                L1: {
                  if (null == ((be) this).field_f) {
                    if (((be) this).field_t.b(6)) {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (el) (Object) stackIn_16_0;
                    } else {
                      ((be) this).field_f = (rh) (Object) ((be) this).field_t.a(255, false, true, (byte) 0, ((be) this).field_r);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (!((be) this).field_f.field_m) {
                  L2: {
                    var2_array = ((be) this).field_f.e(256);
                    if (!(((be) this).field_f instanceof cl)) {
                      try {
                        L3: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((be) this).field_v = new el(var2_array, ((be) this).field_A, ((be) this).field_i);
                            break L3;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          L5: {
                            var3 = decompiledCaughtException;
                            ((be) this).field_t.d(121);
                            ((be) this).field_v = null;
                            if (!((be) this).field_t.b(6)) {
                              break L5;
                            } else {
                              ((be) this).field_f = null;
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((be) this).field_f = (rh) (Object) ((be) this).field_t.a(255, false, true, (byte) 0, ((be) this).field_r);
                          break L4;
                        }
                        stackOut_49_0 = null;
                        stackIn_50_0 = stackOut_49_0;
                        return (el) (Object) stackIn_50_0;
                      }
                      if (null == ((be) this).field_z) {
                        break L2;
                      } else {
                        cl discarded$1 = ((be) this).field_g.a(((be) this).field_z, var2_array, -78, ((be) this).field_r);
                        break L2;
                      }
                    } else {
                      try {
                        L6: {
                          if (null != var2_array) {
                            ((be) this).field_v = new el(var2_array, ((be) this).field_A, ((be) this).field_i);
                            if (((be) this).field_v.field_b == ((be) this).field_o) {
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
                            ((be) this).field_v = null;
                            if (((be) this).field_t.b(6)) {
                              break L8;
                            } else {
                              ((be) this).field_f = (rh) (Object) ((be) this).field_t.a(255, false, true, (byte) 0, ((be) this).field_r);
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ((be) this).field_f = null;
                          break L7;
                        }
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
                        return (el) (Object) stackIn_36_0;
                      }
                      break L2;
                    }
                  }
                  L9: {
                    if (null != ((be) this).field_p) {
                      ((be) this).field_k = new byte[((be) this).field_v.field_l];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((be) this).field_f = null;
                  stackOut_58_0 = ((be) this).field_v;
                  stackIn_59_0 = stackOut_58_0;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (el) (Object) stackIn_20_0;
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (el) (Object) stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "be.A(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        wf var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null == ((be) this).field_s) {
              return;
            } else {
              if (null != ((be) this).a(-119)) {
                var2_ref = ((be) this).field_y.a((byte) -95);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (null == var2_ref) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_c;
                        stackOut_8_0 = -1;
                        stackOut_8_1 = ~var3;
                        stackIn_35_0 = stackOut_8_0;
                        stackIn_35_1 = stackOut_8_1;
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
                                  if (((be) this).field_v.field_l <= var3) {
                                    break L6;
                                  } else {
                                    if (0 != ((be) this).field_v.field_s[var3]) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.c(5);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (0 == ((be) this).field_k[var3]) {
                                rh discarded$2 = this.a(var3, (byte) 2, 1);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (((be) this).field_k[var3] != -1) {
                                break L8;
                              } else {
                                rh discarded$3 = this.a(var3, (byte) 2, 2);
                                break L8;
                              }
                            }
                            if (((be) this).field_k[var3] != 1) {
                              break L4;
                            } else {
                              var2_ref.c(param0 ^ 23884);
                              break L4;
                            }
                          }
                          var2_ref = ((be) this).field_y.a(true);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_34_0 = param0;
                    stackOut_34_1 = 23881;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L2;
                  }
                  L9: {
                    if (stackIn_35_0 == stackIn_35_1) {
                      break L9;
                    } else {
                      ((be) this).field_v = null;
                      break L9;
                    }
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
          throw ch.a((Throwable) (Object) var2, "be.E(" + param0 + ')');
        }
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 71) {
                break L1;
              } else {
                field_q = -78;
                break L1;
              }
            }
            if (bi.field_L >= 2) {
              L2: {
                if (0 == w.field_f) {
                  if (!cj.field_c.a((byte) -126)) {
                    stackOut_48_0 = 20;
                    stackIn_49_0 = stackOut_48_0;
                    return stackIn_49_0;
                  } else {
                    if (!cj.field_c.a((byte) 120, "commonui")) {
                      stackOut_53_0 = 40;
                      stackIn_54_0 = stackOut_53_0;
                      return stackIn_54_0;
                    } else {
                      if (!wi.field_e.a((byte) -127)) {
                        stackOut_58_0 = 50;
                        stackIn_59_0 = stackOut_58_0;
                        return stackIn_59_0;
                      } else {
                        if (wi.field_e.a((byte) 112, "commonui")) {
                          if (!nd.field_n.a((byte) -118)) {
                            stackOut_66_0 = 70;
                            stackIn_67_0 = stackOut_66_0;
                            return stackIn_67_0;
                          } else {
                            if (nd.field_n.c(param0 ^ 32088)) {
                              break L2;
                            } else {
                              stackOut_69_0 = 80;
                              stackIn_70_0 = stackOut_69_0;
                              return stackIn_70_0;
                            }
                          }
                        } else {
                          stackOut_61_0 = 60;
                          stackIn_62_0 = stackOut_61_0;
                          return stackIn_62_0;
                        }
                      }
                    }
                  }
                } else {
                  L3: {
                    if (null == hg.field_a) {
                      break L3;
                    } else {
                      if (hg.field_a.a((byte) -114)) {
                        if (!hg.field_a.b((byte) -120, "")) {
                          stackOut_18_0 = 29;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        } else {
                          if (!hg.field_a.a((byte) -98, "")) {
                            stackOut_23_0 = 29;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        stackOut_13_0 = 14;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                  if (cj.field_c.a((byte) -125)) {
                    if (cj.field_c.a((byte) 120, "commonui")) {
                      if (wi.field_e.a((byte) -118)) {
                        if (wi.field_e.a((byte) -42, "commonui")) {
                          if (nd.field_n.a((byte) -118)) {
                            if (!nd.field_n.c(param0 ^ 32088)) {
                              stackOut_43_0 = 86;
                              stackIn_44_0 = stackOut_43_0;
                              return stackIn_44_0;
                            } else {
                              break L2;
                            }
                          } else {
                            stackOut_38_0 = 82;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0;
                          }
                        } else {
                          stackOut_35_0 = 80;
                          stackIn_36_0 = stackOut_35_0;
                          return stackIn_36_0;
                        }
                      } else {
                        stackOut_32_0 = 71;
                        stackIn_33_0 = stackOut_32_0;
                        return stackIn_33_0;
                      }
                    } else {
                      stackOut_29_0 = 57;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0;
                    }
                  } else {
                    stackOut_26_0 = 43;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0;
                  }
                }
              }
              stackOut_71_0 = 100;
              stackIn_72_0 = stackOut_71_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "be.H(" + param0 + ')');
        }
        return stackIn_72_0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ((be) this).field_p) {
              L1: {
                ((be) this).field_h = param0;
                if (null == ((be) this).field_s) {
                  ((be) this).field_s = new qj();
                  break L1;
                } else {
                  break L1;
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
          throw ch.a((Throwable) (Object) var2, "be.J(" + param0 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            if (ga.a(param0, 3336)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (ve.a(1, param0)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (!vj.a(-23424, param0)) {
                  if (param2.length() != param1) {
                    if (!fc.a((byte) 19, param0, param2)) {
                      if (fk.a(param2, (byte) 34, param0)) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0 != 0;
                      } else {
                        if (me.a(param2, (byte) 117, param0)) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_30_0 = stackOut_29_0;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    }
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("be.I(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L1;
            }
          }
          L2: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L2;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_30_0 != 0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rh var2_ref = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_92_0 = 0;
        byte stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((be) this).field_s) {
                  if (null != ((be) this).a(-95)) {
                    L3: {
                      if (((be) this).field_u) {
                        break L3;
                      } else {
                        L4: {
                          if (!((be) this).field_h) {
                            break L4;
                          } else {
                            var2_int = 1;
                            var3 = ((be) this).field_s.a((byte) -95);
                            L5: while (true) {
                              L6: {
                                L7: {
                                  if (null == var3) {
                                    break L7;
                                  } else {
                                    var4 = (int)var3.field_c;
                                    stackOut_12_0 = ~((be) this).field_k[var4];
                                    stackOut_12_1 = -2;
                                    stackIn_24_0 = stackOut_12_0;
                                    stackIn_24_1 = stackOut_12_1;
                                    stackIn_13_0 = stackOut_12_0;
                                    stackIn_13_1 = stackOut_12_1;
                                    if (var5 != 0) {
                                      L8: while (true) {
                                        if (stackIn_24_0 <= stackIn_24_1) {
                                          break L6;
                                        } else {
                                          stackOut_25_0 = -1;
                                          stackOut_25_1 = ~((be) this).field_v.field_s[((be) this).field_e];
                                          stackIn_97_0 = stackOut_25_0;
                                          stackIn_97_1 = stackOut_25_1;
                                          stackIn_26_0 = stackOut_25_0;
                                          stackIn_26_1 = stackOut_25_1;
                                          if (var5 != 0) {
                                            break L1;
                                          } else {
                                            stackOut_26_0 = stackIn_26_0;
                                            stackOut_26_1 = stackIn_26_1;
                                            stackIn_28_0 = stackOut_26_0;
                                            stackIn_28_1 = stackOut_26_1;
                                            L9: {
                                              L10: {
                                                if (stackIn_28_0 != stackIn_28_1) {
                                                  break L10;
                                                } else {
                                                  ((be) this).field_e = ((be) this).field_e + 1;
                                                  if (var5 == 0) {
                                                    break L9;
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                              }
                                              L11: {
                                                if (!((be) this).field_t.b((byte) 122)) {
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
                                                if (((be) this).field_k[((be) this).field_e] == 1) {
                                                  break L12;
                                                } else {
                                                  rh discarded$4 = this.a(((be) this).field_e, (byte) 2, 2);
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                if (1 != ((be) this).field_k[((be) this).field_e]) {
                                                  var3 = new wf();
                                                  var3.field_c = (long)((be) this).field_e;
                                                  ((be) this).field_s.a(var3, -89);
                                                  var2_int = 0;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              ((be) this).field_e = ((be) this).field_e + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L6;
                                              }
                                            }
                                            stackOut_23_0 = ((be) this).field_v.field_s.length;
                                            stackOut_23_1 = ((be) this).field_e;
                                            stackIn_24_0 = stackOut_23_0;
                                            stackIn_24_1 = stackOut_23_1;
                                            continue L8;
                                          }
                                        }
                                      }
                                    } else {
                                      L14: {
                                        if (stackIn_13_0 != stackIn_13_1) {
                                          rh discarded$5 = this.a(var4, (byte) 2, 2);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        L16: {
                                          if (1 == ((be) this).field_k[var4]) {
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
                                        var3.c(5);
                                        break L15;
                                      }
                                      var3 = ((be) this).field_s.a(true);
                                      if (var5 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                L17: while (true) {
                                  stackOut_23_0 = ((be) this).field_v.field_s.length;
                                  stackOut_23_1 = ((be) this).field_e;
                                  stackIn_24_0 = stackOut_23_0;
                                  stackIn_24_1 = stackOut_23_1;
                                  if (stackIn_24_0 <= stackIn_24_1) {
                                    break L6;
                                  } else {
                                    stackOut_25_0 = -1;
                                    stackOut_25_1 = ~((be) this).field_v.field_s[((be) this).field_e];
                                    stackIn_97_0 = stackOut_25_0;
                                    stackIn_97_1 = stackOut_25_1;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    if (var5 != 0) {
                                      break L1;
                                    } else {
                                      stackOut_26_0 = stackIn_26_0;
                                      stackOut_26_1 = stackIn_26_1;
                                      stackIn_28_0 = stackOut_26_0;
                                      stackIn_28_1 = stackOut_26_1;
                                      L18: {
                                        if (stackIn_28_0 != stackIn_28_1) {
                                          break L18;
                                        } else {
                                          ((be) this).field_e = ((be) this).field_e + 1;
                                          if (var5 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      L19: {
                                        if (!((be) this).field_t.b((byte) 122)) {
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
                                        if (((be) this).field_k[((be) this).field_e] == 1) {
                                          break L20;
                                        } else {
                                          rh discarded$4 = this.a(((be) this).field_e, (byte) 2, 2);
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (1 != ((be) this).field_k[((be) this).field_e]) {
                                          var3 = new wf();
                                          var3.field_c = (long)((be) this).field_e;
                                          ((be) this).field_s.a(var3, -89);
                                          var2_int = 0;
                                          break L21;
                                        } else {
                                          break L21;
                                        }
                                      }
                                      ((be) this).field_e = ((be) this).field_e + 1;
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
                                  ((be) this).field_h = false;
                                  ((be) this).field_e = 0;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        ((be) this).field_s = null;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((be) this).field_s.a((byte) -95);
                    L23: while (true) {
                      L24: {
                        L25: {
                          L26: {
                            if (var3 == null) {
                              break L26;
                            } else {
                              var4 = (int)var3.field_c;
                              stackOut_56_0 = -1;
                              stackOut_56_1 = ~((be) this).field_k[var4];
                              stackIn_69_0 = stackOut_56_0;
                              stackIn_69_1 = stackOut_56_1;
                              stackIn_57_0 = stackOut_56_0;
                              stackIn_57_1 = stackOut_56_1;
                              if (var5 != 0) {
                                L27: while (true) {
                                  if (stackIn_69_0 >= stackIn_69_1) {
                                    break L25;
                                  } else {
                                    stackOut_70_0 = ((be) this).field_v.field_s[((be) this).field_e];
                                    stackIn_93_0 = stackOut_70_0;
                                    stackIn_71_0 = stackOut_70_0;
                                    if (var5 != 0) {
                                      break L24;
                                    } else {
                                      stackOut_71_0 = stackIn_71_0;
                                      stackIn_73_0 = stackOut_71_0;
                                      L28: {
                                        L29: {
                                          if (stackIn_73_0 == 0) {
                                            ((be) this).field_e = ((be) this).field_e + 1;
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
                                          if (250 <= ((be) this).field_g.field_e) {
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
                                          if (((be) this).field_k[((be) this).field_e] != 0) {
                                            break L31;
                                          } else {
                                            rh discarded$6 = this.a(((be) this).field_e, (byte) 2, 1);
                                            break L31;
                                          }
                                        }
                                        L32: {
                                          if (((be) this).field_k[((be) this).field_e] == 0) {
                                            var3 = new wf();
                                            var3.field_c = (long)((be) this).field_e;
                                            var2_int = 0;
                                            ((be) this).field_s.a(var3, -115);
                                            break L32;
                                          } else {
                                            break L32;
                                          }
                                        }
                                        ((be) this).field_e = ((be) this).field_e + 1;
                                        if (var5 == 0) {
                                          break L28;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      stackOut_68_0 = ((be) this).field_e;
                                      stackOut_68_1 = ((be) this).field_v.field_s.length;
                                      stackIn_69_0 = stackOut_68_0;
                                      stackIn_69_1 = stackOut_68_1;
                                      continue L27;
                                    }
                                  }
                                }
                              } else {
                                L33: {
                                  if (stackIn_57_0 == stackIn_57_1) {
                                    rh discarded$7 = this.a(var4, (byte) 2, 1);
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                                L34: {
                                  L35: {
                                    if (((be) this).field_k[var4] == 0) {
                                      break L35;
                                    } else {
                                      var3.c(5);
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
                                var3 = ((be) this).field_s.a(true);
                                if (var5 == 0) {
                                  continue L23;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          L36: while (true) {
                            stackOut_68_0 = ((be) this).field_e;
                            stackOut_68_1 = ((be) this).field_v.field_s.length;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            if (stackIn_69_0 >= stackIn_69_1) {
                              break L25;
                            } else {
                              stackOut_70_0 = ((be) this).field_v.field_s[((be) this).field_e];
                              stackIn_93_0 = stackOut_70_0;
                              stackIn_71_0 = stackOut_70_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                stackOut_71_0 = stackIn_71_0;
                                stackIn_73_0 = stackOut_71_0;
                                L37: {
                                  if (stackIn_73_0 == 0) {
                                    ((be) this).field_e = ((be) this).field_e + 1;
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
                                  if (250 <= ((be) this).field_g.field_e) {
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
                                  if (((be) this).field_k[((be) this).field_e] != 0) {
                                    break L39;
                                  } else {
                                    rh discarded$6 = this.a(((be) this).field_e, (byte) 2, 1);
                                    break L39;
                                  }
                                }
                                L40: {
                                  if (((be) this).field_k[((be) this).field_e] == 0) {
                                    var3 = new wf();
                                    var3.field_c = (long)((be) this).field_e;
                                    var2_int = 0;
                                    ((be) this).field_s.a(var3, -115);
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                ((be) this).field_e = ((be) this).field_e + 1;
                                if (var5 == 0) {
                                  continue L36;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                        }
                        stackOut_92_0 = var2_int;
                        stackIn_93_0 = stackOut_92_0;
                        break L24;
                      }
                      if (stackIn_93_0 != 0) {
                        ((be) this).field_e = 0;
                        ((be) this).field_u = false;
                        break L2;
                      } else {
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
              stackOut_96_0 = param0;
              stackOut_96_1 = 122;
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              break L1;
            }
            L41: {
              if (stackIn_97_0 >= stackIn_97_1) {
                break L41;
              } else {
                ((be) this).field_g = null;
                break L41;
              }
            }
            L42: {
              if (!((be) this).field_j) {
                break L42;
              } else {
                if (~((be) this).field_l < ~lk.a(0)) {
                  break L42;
                } else {
                  var2_ref = (rh) (Object) ((be) this).field_m.b(1000);
                  L43: while (true) {
                    L44: {
                      if (null == var2_ref) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_m) {
                              break L45;
                            } else {
                              L46: {
                                if (var2_ref.field_o) {
                                  break L46;
                                } else {
                                  var2_ref.field_o = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (var2_ref.field_p) {
                                var2_ref.c(5);
                                break L45;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                          var2_ref = (rh) (Object) ((be) this).field_m.a(58);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((be) this).field_l = lk.a(0) + 1000L;
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "be.K(" + param0 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rh var4 = null;
        byte[] var5 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_5_0 = null;
        try {
          L0: {
            var3_int = 76 / ((-41 - param1) / 60);
            var4 = this.a(param0, (byte) 2, 0);
            if (null == var4) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var5 = var4.e(256);
              var4.c(5);
              stackOut_5_0 = (byte[]) var5;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "be.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static hg c(int param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        Object stackIn_7_0 = null;
        hg stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            L1: {
              var1 = cd.b(-89);
              if (null == var1) {
                break L1;
              } else {
                if (0 > var1.indexOf('@')) {
                  break L1;
                } else {
                  var1 = "";
                  break L1;
                }
              }
            }
            if (param0 >= 5) {
              stackOut_8_0 = new hg(cd.b(-127), cf.d(4819119));
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (hg) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1_ref, "be.F(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final int b(int param0, int param1) {
        rh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (rh) (Object) ((be) this).field_m.a((long)param1, 0);
            if (var3 == null) {
              L1: {
                if (param0 <= -13) {
                  break L1;
                } else {
                  ((be) this).field_r = 65;
                  break L1;
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = var3.f(0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3_ref, "be.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    be(int param0, ak param1, ak param2, uh param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((be) this).field_m = new fl(16);
        ((be) this).field_e = 0;
        ((be) this).field_y = new qj();
        ((be) this).field_l = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((be) this).field_r = param0;
                ((be) this).field_p = param1;
                if (null != ((be) this).field_p) {
                  break L2;
                } else {
                  ((be) this).field_u = false;
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((be) this).field_u = true;
              ((be) this).field_s = new qj();
              break L1;
            }
            L3: {
              ((be) this).field_A = param5;
              ((be) this).field_t = param3;
              ((be) this).field_i = param6;
              ((be) this).field_j = param8;
              ((be) this).field_z = param2;
              ((be) this).field_o = param7;
              ((be) this).field_g = param4;
              if (null == ((be) this).field_z) {
                break L3;
              } else {
                ((be) this).field_f = (rh) (Object) ((be) this).field_g.a(((be) this).field_z, ((be) this).field_r, true);
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
            stackOut_9_1 = new StringBuilder().append("be.<init>(").append(param0).append(',');
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
          throw ch.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new nk(0);
    }
}
