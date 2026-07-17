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
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_63_0 = null;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        int stackIn_95_0 = 0;
        byte stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_80_0 = 0;
        byte stackOut_80_1 = 0;
        int stackOut_94_0 = 0;
        byte stackOut_94_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_62_0 = null;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          var4 = (Object) (Object) (wj) (Object) ((ak) this).field_p.a((long)param0, -1);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param2) {
              break L0;
            } else {
              if (((wj) var4).field_n) {
                break L0;
              } else {
                if (!((wj) var4).field_l) {
                  break L0;
                } else {
                  ((wj) var4).b(57);
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
                if (param2 != 0) {
                  break L3;
                } else {
                  L4: {
                    if (null == ((ak) this).field_l) {
                      break L4;
                    } else {
                      if (((ak) this).field_g[param0] == -1) {
                        break L4;
                      } else {
                        var4 = (Object) (Object) ((ak) this).field_j.a(((ak) this).field_l, param0, -126);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (!((ak) this).field_n.d(-110)) {
                    var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, true, ((ak) this).field_t, (byte) 2);
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
                if (1 != param2) {
                  break L5;
                } else {
                  if (((ak) this).field_l == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((ak) this).field_j.a((byte) 123, ((ak) this).field_l, param0);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (2 == param2) {
                if (((ak) this).field_l != null) {
                  if (-1 != ((ak) this).field_g[param0]) {
                    throw new RuntimeException();
                  } else {
                    if (!((ak) this).field_n.a(false)) {
                      var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, false, ((ak) this).field_t, (byte) 2);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                throw new RuntimeException();
              }
            }
            ((ak) this).field_p.a((long)param0, (byte) 127, (ca) var4);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((wj) var4).field_l) {
          L6: {
            if (param1 > 30) {
              break L6;
            } else {
              field_z = -77;
              break L6;
            }
          }
          var5 = ((wj) var4).f(0);
          if (!(var4 instanceof uc)) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var5.length <= 2) {
                      break L8;
                    } else {
                      ee.field_f.reset();
                      ee.field_f.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ee.field_f.getValue();
                      if (~var6_int == ~((ak) this).field_i.field_r[param0]) {
                        L9: {
                          if (null == ((ak) this).field_i.field_k) {
                            break L9;
                          } else {
                            if (null == ((ak) this).field_i.field_k[param0]) {
                              break L9;
                            } else {
                              var7 = ((ak) this).field_i.field_k[param0];
                              var8 = ee.a(-1, var5.length + -2, 0, var5);
                              var9 = 0;
                              L10: while (true) {
                                if (64 <= var9) {
                                  break L9;
                                } else {
                                  stackOut_80_0 = var7[var9];
                                  stackOut_80_1 = var8[var9];
                                  stackIn_95_0 = stackOut_80_0;
                                  stackIn_95_1 = stackOut_80_1;
                                  stackIn_81_0 = stackOut_80_0;
                                  stackIn_81_1 = stackOut_80_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L7;
                                  } else {
                                    if (stackIn_81_0 != stackIn_81_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
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
                        }
                        ((ak) this).field_n.field_b = 0;
                        ((ak) this).field_n.field_n = 0;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((ak) this).field_n.f(-105);
              ((wj) var4).b(57);
              if (((wj) var4).field_n) {
                L11: {
                  if (!((ak) this).field_n.d(-88)) {
                    var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, true, ((ak) this).field_t, (byte) 2);
                    ((ak) this).field_p.a((long)param0, (byte) -99, (ca) var4);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L12: {
              L13: {
                if (decompiledRegionSelector0 == 0) {
                  break L13;
                } else {
                  var5[-2 + var5.length] = (byte)(((ak) this).field_i.field_i[param0] >>> 8);
                  var5[-1 + var5.length] = (byte)((ak) this).field_i.field_i[param0];
                  if (null == ((ak) this).field_l) {
                    break L12;
                  } else {
                    uc discarded$1 = ((ak) this).field_j.a(param0, ((ak) this).field_l, var5, 2);
                    stackOut_94_0 = 1;
                    stackOut_94_1 = ((ak) this).field_g[param0];
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    break L13;
                  }
                }
              }
              if (stackIn_95_0 == stackIn_95_1) {
                break L12;
              } else {
                ((ak) this).field_g[param0] = (byte) 1;
                break L12;
              }
            }
            L14: {
              if (!((wj) var4).field_n) {
                ((wj) var4).b(57);
                break L14;
              } else {
                break L14;
              }
            }
            return (wj) var4;
          } else {
            try {
              L15: {
                L16: {
                  if (var5 == null) {
                    break L16;
                  } else {
                    if (2 < var5.length) {
                      ee.field_f.reset();
                      ee.field_f.update(var5, 0, var5.length - 2);
                      var6_int = (int)ee.field_f.getValue();
                      if (~var6_int == ~((ak) this).field_i.field_r[param0]) {
                        L17: {
                          L18: {
                            if (((ak) this).field_i.field_k == null) {
                              break L18;
                            } else {
                              if (((ak) this).field_i.field_k[param0] != null) {
                                var7 = ((ak) this).field_i.field_k[param0];
                                var8 = ee.a(-1, var5.length - 2, 0, var5);
                                var9 = 0;
                                L19: while (true) {
                                  if (var9 >= 64) {
                                    break L18;
                                  } else {
                                    stackOut_47_0 = ~var7[var9];
                                    stackOut_47_1 = ~var8[var9];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      break L17;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
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
                              } else {
                                break L18;
                              }
                            }
                          }
                          stackOut_51_0 = 255 & var5[var5.length + -1];
                          stackOut_51_1 = var5[-2 + var5.length] << 8 & 65280;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L17;
                        }
                        var7_int = stackIn_52_0 + stackIn_52_1;
                        if (~(((ak) this).field_i.field_i[param0] & 65535) != ~var7_int) {
                          throw new RuntimeException();
                        } else {
                          L20: {
                            if (1 == ((ak) this).field_g[param0]) {
                              break L20;
                            } else {
                              L21: {
                                if (((ak) this).field_g[param0] != 0) {
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              ((ak) this).field_g[param0] = (byte) 1;
                              break L20;
                            }
                          }
                          L22: {
                            if (!((wj) var4).field_n) {
                              ((wj) var4).b(57);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          stackOut_62_0 = var4;
                          stackIn_63_0 = stackOut_62_0;
                          break L15;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((ak) this).field_g[param0] = (byte) -1;
              ((wj) var4).b(57);
              if (((wj) var4).field_n) {
                L23: {
                  if (!((ak) this).field_n.d(-9)) {
                    var4 = (Object) (Object) ((ak) this).field_n.a(15937, param0, true, ((ak) this).field_t, (byte) 2);
                    ((ak) this).field_p.a((long)param0, (byte) -8, (ca) var4);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (wj) (Object) stackIn_63_0;
          }
        } else {
          return null;
        }
    }

    final hd a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (null != ((ak) this).field_i) {
          return ((ak) this).field_i;
        } else {
          L0: {
            if (((ak) this).field_q == null) {
              if (!((ak) this).field_n.d(-105)) {
                ((ak) this).field_q = (wj) (Object) ((ak) this).field_n.a(15937, ((ak) this).field_t, true, 255, (byte) 0);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((ak) this).field_q.field_l) {
            L1: {
              if (param0 == -23879) {
                break L1;
              } else {
                ak.b(26);
                break L1;
              }
            }
            L2: {
              var5 = ((ak) this).field_q.f(0);
              var2 = var5;
              if (!(((ak) this).field_q instanceof uc)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((ak) this).field_i = new hd(var5, ((ak) this).field_r, ((ak) this).field_A);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((ak) this).field_n.f(-128);
                    ((ak) this).field_i = null;
                    if (((ak) this).field_n.d(-20)) {
                      break L4;
                    } else {
                      ((ak) this).field_q = (wj) (Object) ((ak) this).field_n.a(param0 ^ -25352, ((ak) this).field_t, true, 255, (byte) 0);
                      if (var4 != 0) {
                        break L4;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((ak) this).field_q = null;
                  return null;
                }
                if (((ak) this).field_w == null) {
                  break L2;
                } else {
                  uc discarded$1 = ((ak) this).field_j.a(((ak) this).field_t, ((ak) this).field_w, var5, 2);
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((ak) this).field_i = new hd(var5, ((ak) this).field_r, ((ak) this).field_A);
                      if (~((ak) this).field_k != ~((ak) this).field_i.field_b) {
                        throw new RuntimeException();
                      } else {
                        break L5;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((ak) this).field_i = null;
                    if (!((ak) this).field_n.d(-13)) {
                      break L6;
                    } else {
                      ((ak) this).field_q = null;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        return null;
                      }
                    }
                  }
                  ((ak) this).field_q = (wj) (Object) ((ak) this).field_n.a(15937, ((ak) this).field_t, true, 255, (byte) 0);
                  return null;
                }
                break L2;
              }
            }
            L7: {
              ((ak) this).field_q = null;
              if (null != ((ak) this).field_l) {
                ((ak) this).field_g = new byte[((ak) this).field_i.field_s];
                break L7;
              } else {
                break L7;
              }
            }
            return ((ak) this).field_i;
          } else {
            return null;
          }
        }
    }

    final void e(byte param0) {
        ca var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        byte stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (((ak) this).field_m != null) {
          if (null == ((ak) this).a(-23879)) {
            return;
          } else {
            var2 = ((ak) this).field_x.b((byte) -16);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_d;
                    stackOut_7_0 = -1;
                    stackOut_7_1 = ~var3;
                    stackIn_21_0 = stackOut_7_0;
                    stackIn_21_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_8_0 < stackIn_8_1) {
                              break L5;
                            } else {
                              if (((ak) this).field_i.field_s <= var3) {
                                break L5;
                              } else {
                                if (0 == ((ak) this).field_i.field_d[var3]) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.b(57);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (((ak) this).field_g[var3] != 0) {
                            break L6;
                          } else {
                            wj discarded$4 = this.a(var3, (byte) 122, 1);
                            break L6;
                          }
                        }
                        L7: {
                          if (((ak) this).field_g[var3] != -1) {
                            break L7;
                          } else {
                            wj discarded$5 = this.a(var3, (byte) 76, 2);
                            break L7;
                          }
                        }
                        if (((ak) this).field_g[var3] != 1) {
                          break L3;
                        } else {
                          var2.b(57);
                          break L3;
                        }
                      }
                      var2 = ((ak) this).field_x.d(853);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_20_0 = param0;
                stackOut_20_1 = 57;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L1;
              }
              L8: {
                if (stackIn_21_0 == stackIn_21_1) {
                  break L8;
                } else {
                  ak.b(-86);
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (!(((ak) this).field_l != null)) {
            return;
        }
        ((ak) this).field_h = true;
        if (null == ((ak) this).field_m) {
            ((ak) this).field_m = new im();
        }
        int var2 = 123 % ((param0 - -14) / 40);
    }

    final static void b(int param0) {
        e.field_a = null;
        if (param0 != 22176) {
            return;
        }
        gj.field_f = null;
    }

    final int b(int param0, int param1) {
        wj var3 = (wj) (Object) ((ak) this).field_p.a((long)param0, -1);
        if (!(var3 == null)) {
            return var3.e(param1 ^ -7334);
        }
        if (param1 != -7362) {
            ((ak) this).e((byte) -116);
        }
        return 0;
    }

    final byte[] a(int param0, int param1) {
        wj var3 = this.a(param1, (byte) 54, 0);
        if (var3 == null) {
            return null;
        }
        if (param0 != -15861) {
            ((ak) this).field_m = null;
        }
        byte[] var4 = var3.f(0);
        var3.b(param0 + 15918);
        return var4;
    }

    final void a(boolean param0) {
        int var2_int = 0;
        wj var2 = null;
        ca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        byte stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        ge stackIn_26_0 = null;
        ge stackIn_27_0 = null;
        ge stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        ge stackIn_115_0 = null;
        ge stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        ge stackIn_130_0 = null;
        ge stackIn_132_0 = null;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackOut_10_0 = 0;
        byte stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        ge stackOut_25_0 = null;
        ge stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        ge stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_139_0 = 0;
        int stackOut_139_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        ge stackOut_131_0 = null;
        ge stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        ge stackOut_132_0 = null;
        ge stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_66_0 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_69_1 = 0;
        L0: {
          L1: {
            var5 = OrbDefence.field_D ? 1 : 0;
            if (null != ((ak) this).field_m) {
              if (((ak) this).a(-23879) != null) {
                L2: {
                  if (((ak) this).field_s) {
                    break L2;
                  } else {
                    L3: {
                      if (((ak) this).field_h) {
                        break L3;
                      } else {
                        ((ak) this).field_m = null;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((ak) this).field_m.b((byte) -17);
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_10_0 = 1;
                            stackOut_10_1 = ((ak) this).field_g[var4];
                            stackIn_20_0 = stackOut_10_0;
                            stackIn_20_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_20_0 <= stackIn_20_1) {
                                  break L5;
                                } else {
                                  stackOut_21_0 = 0;
                                  stackOut_21_1 = ((ak) this).field_i.field_d[((ak) this).field_o];
                                  stackIn_70_0 = stackOut_21_0;
                                  stackIn_70_1 = stackOut_21_1;
                                  stackIn_22_0 = stackOut_21_0;
                                  stackIn_22_1 = stackOut_21_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_22_0 != stackIn_22_1) {
                                          break L9;
                                        } else {
                                          ((ak) this).field_o = ((ak) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        stackOut_25_0 = ((ak) this).field_n;
                                        stackIn_27_0 = stackOut_25_0;
                                        stackIn_26_0 = stackOut_25_0;
                                        if (param0) {
                                          stackOut_27_0 = (ge) (Object) stackIn_27_0;
                                          stackOut_27_1 = 0;
                                          stackIn_28_0 = stackOut_27_0;
                                          stackIn_28_1 = stackOut_27_1;
                                          break L10;
                                        } else {
                                          stackOut_26_0 = (ge) (Object) stackIn_26_0;
                                          stackOut_26_1 = 1;
                                          stackIn_28_0 = stackOut_26_0;
                                          stackIn_28_1 = stackOut_26_1;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (((ge) (Object) stackIn_28_0).a(stackIn_28_1 != 0)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L11;
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (1 == ((ak) this).field_g[((ak) this).field_o]) {
                                          break L12;
                                        } else {
                                          wj discarded$6 = this.a(((ak) this).field_o, (byte) 63, 2);
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (((ak) this).field_g[((ak) this).field_o] != 1) {
                                          var3 = new ca();
                                          var3.field_d = (long)((ak) this).field_o;
                                          ((ak) this).field_m.a(-90, var3);
                                          var2_int = 0;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      ((ak) this).field_o = ((ak) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_19_0 = ~((ak) this).field_o;
                                    stackOut_19_1 = ~((ak) this).field_i.field_d.length;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L14: {
                                if (stackIn_11_0 != stackIn_11_1) {
                                  wj discarded$7 = this.a(var4, (byte) 107, 2);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                L16: {
                                  if (((ak) this).field_g[var4] == 1) {
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
                                var3.b(57);
                                break L15;
                              }
                              var3 = ((ak) this).field_m.d(853);
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L17: while (true) {
                          stackOut_139_0 = ~((ak) this).field_o;
                          stackOut_139_1 = ~((ak) this).field_i.field_d.length;
                          stackIn_137_0 = stackOut_139_0;
                          stackIn_137_1 = stackOut_139_1;
                          if (stackIn_137_0 <= stackIn_137_1) {
                            break L5;
                          } else {
                            stackOut_135_0 = 0;
                            stackOut_135_1 = ((ak) this).field_i.field_d[((ak) this).field_o];
                            stackIn_70_0 = stackOut_135_0;
                            stackIn_70_1 = stackOut_135_1;
                            stackIn_136_0 = stackOut_135_0;
                            stackIn_136_1 = stackOut_135_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_136_0 = stackIn_136_0;
                              stackOut_136_1 = stackIn_136_1;
                              stackIn_133_0 = stackOut_136_0;
                              stackIn_133_1 = stackOut_136_1;
                              L18: {
                                if (stackIn_133_0 != stackIn_133_1) {
                                  break L18;
                                } else {
                                  ((ak) this).field_o = ((ak) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                stackOut_131_0 = ((ak) this).field_n;
                                stackIn_130_0 = stackOut_131_0;
                                stackIn_132_0 = stackOut_131_0;
                                if (param0) {
                                  stackOut_130_0 = (ge) (Object) stackIn_130_0;
                                  stackOut_130_1 = 0;
                                  stackIn_128_0 = stackOut_130_0;
                                  stackIn_128_1 = stackOut_130_1;
                                  break L19;
                                } else {
                                  stackOut_132_0 = (ge) (Object) stackIn_132_0;
                                  stackIn_115_0 = stackOut_132_0;
                                  stackOut_115_0 = (ge) (Object) stackIn_115_0;
                                  stackOut_115_1 = 1;
                                  stackIn_128_0 = stackOut_115_0;
                                  stackIn_128_1 = stackOut_115_1;
                                  break L19;
                                }
                              }
                              L20: {
                                if (((ge) (Object) stackIn_128_0).a(stackIn_128_1 != 0)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L20;
                                  }
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                if (1 == ((ak) this).field_g[((ak) this).field_o]) {
                                  break L21;
                                } else {
                                  wj discarded$8 = this.a(((ak) this).field_o, (byte) 63, 2);
                                  break L21;
                                }
                              }
                              L22: {
                                if (((ak) this).field_g[((ak) this).field_o] != 1) {
                                  var3 = new ca();
                                  var3.field_d = (long)((ak) this).field_o;
                                  ((ak) this).field_m.a(-90, var3);
                                  var2_int = 0;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              ((ak) this).field_o = ((ak) this).field_o + 1;
                              if (var5 == 0) {
                                continue L17;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L23: {
                        if (var2_int != 0) {
                          ((ak) this).field_h = false;
                          ((ak) this).field_o = 0;
                          break L23;
                        } else {
                          break L23;
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
                var3 = ((ak) this).field_m.b((byte) -12);
                L24: while (true) {
                  L25: {
                    L26: {
                      L27: {
                        if (var3 == null) {
                          break L27;
                        } else {
                          var4 = (int)var3.field_d;
                          stackOut_43_0 = ~((ak) this).field_g[var4];
                          stackOut_43_1 = -1;
                          stackIn_52_0 = stackOut_43_0;
                          stackIn_52_1 = stackOut_43_1;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          if (var5 != 0) {
                            L28: while (true) {
                              if (stackIn_52_0 <= stackIn_52_1) {
                                break L26;
                              } else {
                                stackOut_53_0 = ((ak) this).field_i.field_d[((ak) this).field_o];
                                stackIn_67_0 = stackOut_53_0;
                                stackIn_54_0 = stackOut_53_0;
                                if (var5 != 0) {
                                  break L25;
                                } else {
                                  L29: {
                                    L30: {
                                      if (stackIn_54_0 != 0) {
                                        break L30;
                                      } else {
                                        ((ak) this).field_o = ((ak) this).field_o + 1;
                                        if (var5 == 0) {
                                          break L29;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                    L31: {
                                      if (250 <= ((ak) this).field_j.field_b) {
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
                                      if (((ak) this).field_g[((ak) this).field_o] == 0) {
                                        wj discarded$9 = this.a(((ak) this).field_o, (byte) 43, 1);
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      if (((ak) this).field_g[((ak) this).field_o] != 0) {
                                        break L33;
                                      } else {
                                        var3 = new ca();
                                        var3.field_d = (long)((ak) this).field_o;
                                        ((ak) this).field_m.a(-121, var3);
                                        var2_int = 0;
                                        break L33;
                                      }
                                    }
                                    ((ak) this).field_o = ((ak) this).field_o + 1;
                                    if (var5 == 0) {
                                      break L29;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  stackOut_51_0 = ((ak) this).field_i.field_d.length;
                                  stackOut_51_1 = ((ak) this).field_o;
                                  stackIn_52_0 = stackOut_51_0;
                                  stackIn_52_1 = stackOut_51_1;
                                  continue L28;
                                }
                              }
                            }
                          } else {
                            L34: {
                              if (stackIn_44_0 != stackIn_44_1) {
                                break L34;
                              } else {
                                wj discarded$10 = this.a(var4, (byte) 55, 1);
                                break L34;
                              }
                            }
                            L35: {
                              L36: {
                                if (((ak) this).field_g[var4] != 0) {
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
                              var3.b(57);
                              break L35;
                            }
                            var3 = ((ak) this).field_m.d(853);
                            if (var5 == 0) {
                              continue L24;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      L37: while (true) {
                        stackOut_111_0 = ((ak) this).field_i.field_d.length;
                        stackOut_111_1 = ((ak) this).field_o;
                        stackIn_109_0 = stackOut_111_0;
                        stackIn_109_1 = stackOut_111_1;
                        if (stackIn_109_0 <= stackIn_109_1) {
                          break L26;
                        } else {
                          stackOut_107_0 = ((ak) this).field_i.field_d[((ak) this).field_o];
                          stackIn_67_0 = stackOut_107_0;
                          stackIn_108_0 = stackOut_107_0;
                          if (var5 != 0) {
                            break L25;
                          } else {
                            stackOut_108_0 = stackIn_108_0;
                            stackIn_105_0 = stackOut_108_0;
                            L38: {
                              if (stackIn_105_0 != 0) {
                                break L38;
                              } else {
                                ((ak) this).field_o = ((ak) this).field_o + 1;
                                if (var5 == 0) {
                                  continue L37;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            L39: {
                              if (250 <= ((ak) this).field_j.field_b) {
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
                              if (((ak) this).field_g[((ak) this).field_o] == 0) {
                                wj discarded$11 = this.a(((ak) this).field_o, (byte) 43, 1);
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                            L41: {
                              if (((ak) this).field_g[((ak) this).field_o] != 0) {
                                break L41;
                              } else {
                                var3 = new ca();
                                var3.field_d = (long)((ak) this).field_o;
                                ((ak) this).field_m.a(-121, var3);
                                var2_int = 0;
                                break L41;
                              }
                            }
                            ((ak) this).field_o = ((ak) this).field_o + 1;
                            if (var5 == 0) {
                              continue L37;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                    }
                    stackOut_66_0 = var2_int;
                    stackIn_67_0 = stackOut_66_0;
                    break L25;
                  }
                  if (stackIn_67_0 == 0) {
                    break L1;
                  } else {
                    ((ak) this).field_s = false;
                    ((ak) this).field_o = 0;
                    break L1;
                  }
                }
              } else {
                return;
              }
            } else {
              break L1;
            }
          }
          stackOut_69_0 = param0;
          stackOut_69_1 = 1;
          stackIn_70_0 = stackOut_69_0 ? 1 : 0;
          stackIn_70_1 = stackOut_69_1;
          break L0;
        }
        if (stackIn_70_0 == stackIn_70_1) {
          L42: {
            if (!((ak) this).field_u) {
              break L42;
            } else {
              L43: {
                if (~ji.b(-40) > ~((ak) this).field_v) {
                  break L43;
                } else {
                  var2 = (wj) (Object) ((ak) this).field_p.a((byte) 121);
                  L44: while (true) {
                    L45: {
                      if (var2 == null) {
                        break L45;
                      } else {
                        if (var5 != 0) {
                          break L43;
                        } else {
                          L46: {
                            if (var2.field_l) {
                              break L46;
                            } else {
                              L47: {
                                if (var2.field_p) {
                                  break L47;
                                } else {
                                  var2.field_p = true;
                                  if (var5 == 0) {
                                    break L46;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              if (var2.field_n) {
                                var2.b(57);
                                break L46;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                          var2 = (wj) (Object) ((ak) this).field_p.c((byte) -112);
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
              break L42;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_y = null;
        int var1 = -101 % ((-38 - param0) / 58);
    }

    ak(int param0, eh param1, eh param2, ge param3, vl param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((ak) this).field_u = stackIn_7_1 != 0;
              if (null == ((ak) this).field_w) {
                break L4;
              } else {
                ((ak) this).field_q = (wj) (Object) ((ak) this).field_j.a(((ak) this).field_w, ((ak) this).field_t, -128);
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
            stackOut_10_1 = new StringBuilder().append("ak.<init>(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
    }
}
