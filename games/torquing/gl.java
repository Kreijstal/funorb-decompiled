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
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = Torquing.field_u;
        if (null != ((gl) this).field_v) {
          return ((gl) this).field_v;
        } else {
          L0: {
            if (param0 == -126) {
              break L0;
            } else {
              ((gl) this).field_s = null;
              break L0;
            }
          }
          L1: {
            if (null == ((gl) this).field_i) {
              if (!((gl) this).field_j.a(20)) {
                ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (!((gl) this).field_i.field_r) {
            L2: {
              var5 = ((gl) this).field_i.c((byte) 114);
              var2 = var5;
              if (((gl) this).field_i instanceof lb) {
                break L2;
              } else {
                if (var5 == null) {
                  throw new RuntimeException();
                } else {
                  ((gl) this).field_v = new fd(var5, ((gl) this).field_r, ((gl) this).field_g);
                  if (null != ((gl) this).field_h) {
                    lb discarded$1 = ((gl) this).field_u.a(var5, ((gl) this).field_c, ((gl) this).field_h, (byte) 120);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (((gl) this).field_k != null) {
                          ((gl) this).field_f = new byte[((gl) this).field_v.field_c];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((gl) this).field_i = null;
                      return ((gl) this).field_v;
                    }
                  } else {
                    L4: {
                      if (((gl) this).field_k != null) {
                        ((gl) this).field_f = new byte[((gl) this).field_v.field_c];
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((gl) this).field_i = null;
                    return ((gl) this).field_v;
                  }
                }
              }
            }
            if (var5 == null) {
              throw new RuntimeException();
            } else {
              ((gl) this).field_v = new fd(var5, ((gl) this).field_r, ((gl) this).field_g);
              if (((gl) this).field_p != ((gl) this).field_v.field_r) {
                throw new RuntimeException();
              } else {
                L5: {
                  if (((gl) this).field_k != null) {
                    ((gl) this).field_f = new byte[((gl) this).field_v.field_c];
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((gl) this).field_i = null;
                return ((gl) this).field_v;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void d(int param0) {
        if (((gl) this).field_k != null) {
          ((gl) this).field_l = true;
          if (param0 >= -107) {
            return;
          } else {
            L0: {
              if (((gl) this).field_e == null) {
                ((gl) this).field_e = new ei();
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final byte[] a(int param0, boolean param1) {
        nk var3 = null;
        byte[] var4 = null;
        if (param1) {
          var3 = this.a(param0, 121, 0);
          if (var3 == null) {
            return null;
          } else {
            var4 = var3.c((byte) 112);
            var3.f(0);
            return var4;
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        field_d = null;
        int var1 = 109 % ((-37 - param0) / 37);
    }

    final int a(int param0, int param1) {
        nk var3 = null;
        L0: {
          if (param1 == -26954) {
            break L0;
          } else {
            gl.c(83);
            break L0;
          }
        }
        var3 = (nk) (Object) ((gl) this).field_t.a((long)param0, (byte) 101);
        if (var3 != null) {
          return var3.b(param1 + 27066);
        } else {
          return 0;
        }
    }

    final void c(byte param0) {
        q var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (null != ((gl) this).field_e) {
          if (null == ((gl) this).b((byte) -126)) {
            return;
          } else {
            L0: {
              var2 = ((gl) this).field_s.b(0);
              if (param0 == -94) {
                break L0;
              } else {
                ((gl) this).field_m = false;
                break L0;
              }
            }
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_f;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (-1 < (var3 ^ -1)) {
                            break L5;
                          } else {
                            if (((gl) this).field_v.field_c <= var3) {
                              break L5;
                            } else {
                              if (((gl) this).field_v.field_l[var3] != 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var2.f(0);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((gl) this).field_f[var3] != 0) {
                          break L6;
                        } else {
                          nk discarded$4 = this.a(var3, 121, 1);
                          break L6;
                        }
                      }
                      L7: {
                        if (((gl) this).field_f[var3] != -1) {
                          break L7;
                        } else {
                          nk discarded$5 = this.a(var3, 104, 2);
                          break L7;
                        }
                      }
                      if ((((gl) this).field_f[var3] ^ -1) != -2) {
                        break L3;
                      } else {
                        var2.f(0);
                        break L3;
                      }
                    }
                    var2 = ((gl) this).field_s.f(-24059);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final nk a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        Object stackOut_64_0 = null;
        L0: {
          var10 = Torquing.field_u;
          if (param1 >= 76) {
            break L0;
          } else {
            ((gl) this).b(-28);
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (nk) (Object) ((gl) this).field_t.a((long)param0, (byte) 85);
          if (var4 == null) {
            break L1;
          } else {
            if (0 != param2) {
              break L1;
            } else {
              if (((nk) var4).field_w) {
                break L1;
              } else {
                if (((nk) var4).field_r) {
                  ((nk) var4).f(0);
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
                if (0 != param2) {
                  break L4;
                } else {
                  L5: {
                    if (((gl) this).field_k == null) {
                      break L5;
                    } else {
                      if (0 != (((gl) this).field_f[param0] ^ -1)) {
                        var4 = (Object) (Object) ((gl) this).field_u.a(param0, 23538, ((gl) this).field_k);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!((gl) this).field_j.a(20)) {
                    var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (1 == param2) {
                if (((gl) this).field_k == null) {
                  throw new RuntimeException();
                } else {
                  var4 = (Object) (Object) ((gl) this).field_u.b(param0, 3, ((gl) this).field_k);
                  break L3;
                }
              } else {
                if (param2 == 2) {
                  if (((gl) this).field_k == null) {
                    throw new RuntimeException();
                  } else {
                    if (((gl) this).field_f[param0] != -1) {
                      throw new RuntimeException();
                    } else {
                      if (((gl) this).field_j.a((byte) 105)) {
                        return null;
                      } else {
                        var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, false, (byte) -51, param0);
                        return null;
                      }
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            ((gl) this).field_t.a(false, (long)param0, (q) var4);
            break L2;
          }
        }
        if (!((nk) var4).field_r) {
          var5 = ((nk) var4).c((byte) 106);
          if (!(var4 instanceof lb)) {
            L6: {
              if (var5 == null) {
                break L6;
              } else {
                if ((var5.length ^ -1) < -3) {
                  nn.field_d.reset();
                  nn.field_d.update(var5, 0, -2 + var5.length);
                  var6 = (int)nn.field_d.getValue();
                  if (((gl) this).field_v.field_p[param0] != var6) {
                    throw new RuntimeException();
                  } else {
                    if (((gl) this).field_v.field_e != null) {
                      if (((gl) this).field_v.field_e[param0] != null) {
                        var7 = ((gl) this).field_v.field_e[param0];
                        var8 = np.a(0, var5, -2 + var5.length, -107);
                        var9 = 0;
                        L7: while (true) {
                          if (64 > var9) {
                            stackOut_101_0 = var7[var9] ^ -1;
                            stackOut_101_1 = var8[var9] ^ -1;
                            stackIn_107_0 = stackOut_101_0;
                            stackIn_107_1 = stackOut_101_1;
                            stackIn_102_0 = stackOut_101_0;
                            stackIn_102_1 = stackOut_101_1;
                            if (var10 == 0) {
                              if (stackIn_107_0 != stackIn_107_1) {
                                throw new RuntimeException();
                              } else {
                                var9++;
                                continue L7;
                              }
                            } else {
                              L8: {
                                if (stackIn_102_0 == stackIn_102_1) {
                                  break L8;
                                } else {
                                  ((gl) this).field_f[param0] = (byte) 1;
                                  break L8;
                                }
                              }
                              L9: {
                                if (((nk) var4).field_w) {
                                  break L9;
                                } else {
                                  ((nk) var4).f(0);
                                  break L9;
                                }
                              }
                              return (nk) var4;
                            }
                          } else {
                            ((gl) this).field_j.field_g = 0;
                            ((gl) this).field_j.field_k = 0;
                            L10: {
                              var5[-2 + var5.length] = (byte)(((gl) this).field_v.field_q[param0] >>> -1637583128);
                              var5[var5.length + -1] = (byte)((gl) this).field_v.field_q[param0];
                              if (((gl) this).field_k != null) {
                                lb discarded$3 = ((gl) this).field_u.a(var5, param0, ((gl) this).field_k, (byte) 64);
                                if (-2 == (((gl) this).field_f[param0] ^ -1)) {
                                  break L10;
                                } else {
                                  ((gl) this).field_f[param0] = (byte) 1;
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              if (((nk) var4).field_w) {
                                break L11;
                              } else {
                                ((nk) var4).f(0);
                                break L11;
                              }
                            }
                            return (nk) var4;
                          }
                        }
                      } else {
                        ((gl) this).field_j.field_g = 0;
                        ((gl) this).field_j.field_k = 0;
                        L12: {
                          var5[-2 + var5.length] = (byte)(((gl) this).field_v.field_q[param0] >>> -1637583128);
                          var5[var5.length + -1] = (byte)((gl) this).field_v.field_q[param0];
                          if (((gl) this).field_k != null) {
                            lb discarded$4 = ((gl) this).field_u.a(var5, param0, ((gl) this).field_k, (byte) 64);
                            if (-2 == (((gl) this).field_f[param0] ^ -1)) {
                              break L12;
                            } else {
                              ((gl) this).field_f[param0] = (byte) 1;
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (((nk) var4).field_w) {
                            break L13;
                          } else {
                            ((nk) var4).f(0);
                            break L13;
                          }
                        }
                        return (nk) var4;
                      }
                    } else {
                      ((gl) this).field_j.field_g = 0;
                      ((gl) this).field_j.field_k = 0;
                      L14: {
                        var5[-2 + var5.length] = (byte)(((gl) this).field_v.field_q[param0] >>> -1637583128);
                        var5[var5.length + -1] = (byte)((gl) this).field_v.field_q[param0];
                        if (((gl) this).field_k != null) {
                          lb discarded$5 = ((gl) this).field_u.a(var5, param0, ((gl) this).field_k, (byte) 64);
                          if (-2 == (((gl) this).field_f[param0] ^ -1)) {
                            break L14;
                          } else {
                            ((gl) this).field_f[param0] = (byte) 1;
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (((nk) var4).field_w) {
                          break L15;
                        } else {
                          ((nk) var4).f(0);
                          break L15;
                        }
                      }
                      return (nk) var4;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (-3 <= (var5.length ^ -1)) {
                      break L17;
                    } else {
                      nn.field_d.reset();
                      nn.field_d.update(var5, 0, var5.length + -2);
                      var6 = (int)nn.field_d.getValue();
                      if (((gl) this).field_v.field_p[param0] == var6) {
                        L18: {
                          L19: {
                            if (null == ((gl) this).field_v.field_e) {
                              break L19;
                            } else {
                              if (((gl) this).field_v.field_e[param0] != null) {
                                var7 = ((gl) this).field_v.field_e[param0];
                                var8 = np.a(0, var5, var5.length + -2, -70);
                                var9 = 0;
                                L20: while (true) {
                                  if (var9 >= 64) {
                                    break L19;
                                  } else {
                                    stackOut_50_0 = var7[var9] ^ -1;
                                    stackOut_50_1 = var8[var9] ^ -1;
                                    stackIn_56_0 = stackOut_50_0;
                                    stackIn_56_1 = stackOut_50_1;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    if (var10 != 0) {
                                      break L18;
                                    } else {
                                      if (stackIn_51_0 != stackIn_51_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                          }
                          stackOut_55_0 = (var5[var5.length + -2] & 255) << 458770376;
                          stackOut_55_1 = var5[var5.length + -1] & 255;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          break L18;
                        }
                        var7_int = stackIn_56_0 + stackIn_56_1;
                        if ((65535 & ((gl) this).field_v.field_q[param0]) == var7_int) {
                          L21: {
                            if (((gl) this).field_f[param0] == -2) {
                              break L21;
                            } else {
                              L22: {
                                if (-1 != ((gl) this).field_f[param0]) {
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              ((gl) this).field_f[param0] = (byte) 1;
                              break L21;
                            }
                          }
                          L23: {
                            if (((nk) var4).field_w) {
                              break L23;
                            } else {
                              ((nk) var4).f(0);
                              break L23;
                            }
                          }
                          stackOut_64_0 = var4;
                          stackIn_65_0 = stackOut_64_0;
                          break L16;
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
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((gl) this).field_f[param0] = (byte)-1;
              ((nk) var4).f(0);
              if (((nk) var4).field_w) {
                if (((gl) this).field_j.a(20)) {
                  return null;
                } else {
                  var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                  ((gl) this).field_t.a(false, (long)param0, (q) var4);
                  return null;
                }
              } else {
                return null;
              }
            }
            return (nk) (Object) stackIn_65_0;
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        nk var2 = null;
        int var2_int = 0;
        q var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        byte stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        byte stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_48_0 = 0;
        byte stackOut_37_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_61_0 = 0;
        var5 = Torquing.field_u;
        if (param0 == -1) {
          L0: {
            if (((gl) this).field_e == null) {
              break L0;
            } else {
              if (((gl) this).b((byte) -126) != null) {
                L1: {
                  if (((gl) this).field_b) {
                    break L1;
                  } else {
                    L2: {
                      if (((gl) this).field_l) {
                        break L2;
                      } else {
                        ((gl) this).field_e = null;
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((gl) this).field_e.b(0);
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                if (var3 == null) {
                                  break L8;
                                } else {
                                  var4 = (int)var3.field_f;
                                  stackOut_11_0 = ((gl) this).field_f[var4];
                                  stackOut_11_1 = -2;
                                  stackIn_98_0 = stackOut_11_0;
                                  stackIn_98_1 = stackOut_11_1;
                                  stackIn_12_0 = stackOut_11_0;
                                  stackIn_12_1 = stackOut_11_1;
                                  if (var5 != 0) {
                                    L9: while (true) {
                                      if (stackIn_98_0 <= stackIn_98_1) {
                                        break L5;
                                      } else {
                                        stackOut_96_0 = -1;
                                        stackIn_32_0 = stackOut_96_0;
                                        stackIn_97_0 = stackOut_96_0;
                                        if (var5 != 0) {
                                          break L4;
                                        } else {
                                          stackOut_97_0 = stackIn_97_0;
                                          stackIn_94_0 = stackOut_97_0;
                                          if (stackIn_94_0 != (((gl) this).field_v.field_l[((gl) this).field_n] ^ -1)) {
                                            break L6;
                                          } else {
                                            ((gl) this).field_n = ((gl) this).field_n + 1;
                                            if (var5 == 0) {
                                              stackOut_100_0 = ((gl) this).field_v.field_l.length;
                                              stackOut_100_1 = ((gl) this).field_n;
                                              stackIn_98_0 = stackOut_100_0;
                                              stackIn_98_1 = stackOut_100_1;
                                              continue L9;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L10: {
                                      if (stackIn_12_0 == stackIn_12_1) {
                                        break L10;
                                      } else {
                                        nk discarded$4 = this.a(var4, 124, 2);
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      L12: {
                                        if (-2 == ((gl) this).field_f[var4]) {
                                          break L12;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var3.f(param0 ^ -1);
                                      break L11;
                                    }
                                    var3 = ((gl) this).field_e.f(param0 ^ 24058);
                                    if (var5 == 0) {
                                      continue L3;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              L13: while (true) {
                                if (((gl) this).field_v.field_l.length <= ((gl) this).field_n) {
                                  break L5;
                                } else {
                                  stackOut_20_0 = -1;
                                  stackIn_32_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    if (stackIn_21_0 != (((gl) this).field_v.field_l[((gl) this).field_n] ^ -1)) {
                                      break L6;
                                    } else {
                                      ((gl) this).field_n = ((gl) this).field_n + 1;
                                      if (var5 == 0) {
                                        continue L13;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L6;
                          }
                          L14: {
                            if (!((gl) this).field_j.a((byte) 101)) {
                              break L14;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (((gl) this).field_f[((gl) this).field_n] == 1) {
                              break L15;
                            } else {
                              nk discarded$5 = this.a(((gl) this).field_n, 101, 2);
                              break L15;
                            }
                          }
                          L16: {
                            if (1 == ((gl) this).field_f[((gl) this).field_n]) {
                              break L16;
                            } else {
                              var3 = new q();
                              var3.field_f = (long)((gl) this).field_n;
                              ((gl) this).field_e.a((byte) 54, var3);
                              var2_int = 0;
                              break L16;
                            }
                          }
                          ((gl) this).field_n = ((gl) this).field_n + 1;
                          break L5;
                        }
                        stackOut_31_0 = var2_int;
                        stackIn_32_0 = stackOut_31_0;
                        break L4;
                      }
                      L17: {
                        if (stackIn_32_0 == 0) {
                          break L17;
                        } else {
                          ((gl) this).field_n = 0;
                          ((gl) this).field_l = false;
                          break L17;
                        }
                      }
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var2_int = 1;
                var3 = ((gl) this).field_e.b(0);
                L18: while (true) {
                  L19: {
                    L20: {
                      L21: {
                        if (var3 == null) {
                          L22: while (true) {
                            if (((gl) this).field_n >= ((gl) this).field_v.field_l.length) {
                              break L20;
                            } else {
                              stackOut_48_0 = -1;
                              stackIn_62_0 = stackOut_48_0;
                              stackIn_49_0 = stackOut_48_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_49_0 == ((gl) this).field_v.field_l[((gl) this).field_n]) {
                                  ((gl) this).field_n = ((gl) this).field_n + 1;
                                  continue L22;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        } else {
                          var4 = (int)var3.field_f;
                          stackOut_37_0 = ((gl) this).field_f[var4];
                          stackIn_89_0 = stackOut_37_0;
                          stackIn_38_0 = stackOut_37_0;
                          if (var5 != 0) {
                            L23: while (true) {
                              if (stackIn_89_0 >= ((gl) this).field_v.field_l.length) {
                                break L20;
                              } else {
                                stackOut_87_0 = -1;
                                stackIn_62_0 = stackOut_87_0;
                                stackIn_88_0 = stackOut_87_0;
                                if (var5 != 0) {
                                  break L19;
                                } else {
                                  stackOut_88_0 = stackIn_88_0;
                                  stackIn_85_0 = stackOut_88_0;
                                  if (stackIn_85_0 == ((gl) this).field_v.field_l[((gl) this).field_n]) {
                                    ((gl) this).field_n = ((gl) this).field_n + 1;
                                    stackOut_91_0 = ((gl) this).field_n;
                                    stackIn_89_0 = stackOut_91_0;
                                    continue L23;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          } else {
                            L24: {
                              if (stackIn_38_0 == 0) {
                                nk discarded$6 = this.a(var4, 97, 1);
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            L25: {
                              L26: {
                                if (((gl) this).field_f[var4] == 0) {
                                  break L26;
                                } else {
                                  var3.f(0);
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              var2_int = 0;
                              break L25;
                            }
                            var3 = ((gl) this).field_e.f(-24059);
                            continue L18;
                          }
                        }
                      }
                      L27: {
                        if (-251 > ((gl) this).field_u.field_a) {
                          break L27;
                        } else {
                          var2_int = 0;
                          if (var5 == 0) {
                            break L20;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (0 == ((gl) this).field_f[((gl) this).field_n]) {
                          nk discarded$7 = this.a(((gl) this).field_n, param0 + 123, 1);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (((gl) this).field_f[((gl) this).field_n] == 0) {
                          var3 = new q();
                          var3.field_f = (long)((gl) this).field_n;
                          var2_int = 0;
                          ((gl) this).field_e.a((byte) 54, var3);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      ((gl) this).field_n = ((gl) this).field_n + 1;
                      break L20;
                    }
                    stackOut_61_0 = var2_int;
                    stackIn_62_0 = stackOut_61_0;
                    break L19;
                  }
                  if (stackIn_62_0 == 0) {
                    break L0;
                  } else {
                    ((gl) this).field_b = false;
                    ((gl) this).field_n = 0;
                    break L0;
                  }
                }
              } else {
                return;
              }
            }
          }
          if (((gl) this).field_m) {
            if (km.b(-1) >= ((gl) this).field_o) {
              var2 = (nk) (Object) ((gl) this).field_t.c((byte) -119);
              L30: while (true) {
                if (var2 != null) {
                  if (var5 == 0) {
                    L31: {
                      if (var2.field_r) {
                        break L31;
                      } else {
                        L32: {
                          if (var2.field_v) {
                            break L32;
                          } else {
                            var2.field_v = true;
                            if (var5 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        if (var2.field_w) {
                          var2.f(0);
                          break L31;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    var2 = (nk) (Object) ((gl) this).field_t.b((byte) 105);
                    continue L30;
                  } else {
                    return;
                  }
                } else {
                  ((gl) this).field_o = km.b(-1) + 1000L;
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    gl(int param0, pb param1, pb param2, jp param3, co param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((gl) this).field_t = new eb(16);
            ((gl) this).field_n = 0;
            ((gl) this).field_s = new ei();
            ((gl) this).field_o = 0L;
            ((gl) this).field_k = param1;
            ((gl) this).field_c = param0;
            if (((gl) this).field_k != null) {
              break L1;
            } else {
              ((gl) this).field_b = false;
              if (Torquing.field_u == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((gl) this).field_b = true;
          ((gl) this).field_e = new ei();
          break L0;
        }
        L2: {
          ((gl) this).field_p = param7;
          ((gl) this).field_j = param3;
          ((gl) this).field_h = param2;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((gl) this).field_m = stackIn_6_1 != 0;
          ((gl) this).field_g = param6;
          ((gl) this).field_u = param4;
          ((gl) this).field_r = param5;
          if (((gl) this).field_h == null) {
            break L3;
          } else {
            ((gl) this).field_i = (nk) (Object) ((gl) this).field_u.a(((gl) this).field_c, 23538, ((gl) this).field_h);
            break L3;
          }
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
