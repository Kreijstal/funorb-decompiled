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
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
              L3: {
                var5 = ((gl) this).field_i.c((byte) 114);
                var2 = var5;
                if (((gl) this).field_i instanceof lb) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((gl) this).field_v = new fd(var5, ((gl) this).field_r, ((gl) this).field_g);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((gl) this).field_j.e((byte) -127);
                    ((gl) this).field_v = null;
                    if (((gl) this).field_j.a(param0 ^ -106)) {
                      ((gl) this).field_i = null;
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                        return null;
                      }
                    } else {
                      ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                      return null;
                    }
                  }
                  if (null == ((gl) this).field_h) {
                    break L2;
                  } else {
                    lb discarded$1 = ((gl) this).field_u.a(var5, ((gl) this).field_c, ((gl) this).field_h, (byte) 120);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              try {
                L5: {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((gl) this).field_v = new fd(var5, ((gl) this).field_r, ((gl) this).field_g);
                    if (((gl) this).field_p != ((gl) this).field_v.field_r) {
                      throw new RuntimeException();
                    } else {
                      break L5;
                    }
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3 = decompiledCaughtException;
                ((gl) this).field_v = null;
                if (!((gl) this).field_j.a(20)) {
                  ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                  if (var4 == 0) {
                    return null;
                  } else {
                    ((gl) this).field_i = null;
                    return null;
                  }
                } else {
                  ((gl) this).field_i = null;
                  return null;
                }
              }
              break L2;
            }
            L6: {
              if (((gl) this).field_k != null) {
                ((gl) this).field_f = new byte[((gl) this).field_v.field_c];
                break L6;
              } else {
                break L6;
              }
            }
            ((gl) this).field_i = null;
            return ((gl) this).field_v;
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
        int var1 = 1;
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
                          if (var3 < 0) {
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
                      if (((gl) this).field_f[var3] != 1) {
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
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
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
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
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
                      if (((gl) this).field_f[param0] != -1) {
                        var4 = (Object) (Object) ((gl) this).field_u.a(param0, 23538, ((gl) this).field_k);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
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
                      if (!((gl) this).field_j.a((byte) 105)) {
                        var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, false, (byte) -51, param0);
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
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (var5.length > 2) {
                      nn.field_d.reset();
                      nn.field_d.update(var5, 0, -2 + var5.length);
                      var6_int = (int)nn.field_d.getValue();
                      if (((gl) this).field_v.field_p[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          L9: {
                            if (((gl) this).field_v.field_e == null) {
                              break L9;
                            } else {
                              if (((gl) this).field_v.field_e[param0] != null) {
                                var7 = ((gl) this).field_v.field_e[param0];
                                var8 = np.a(0, var5, -2 + var5.length, -107);
                                var9 = 0;
                                L10: while (true) {
                                  if (64 <= var9) {
                                    break L9;
                                  } else {
                                    stackOut_85_0 = ~var7[var9];
                                    stackOut_85_1 = ~var8[var9];
                                    stackIn_101_0 = stackOut_85_0;
                                    stackIn_101_1 = stackOut_85_1;
                                    stackIn_86_0 = stackOut_85_0;
                                    stackIn_86_1 = stackOut_85_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L6;
                                    } else {
                                      if (stackIn_86_0 != stackIn_86_1) {
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
                              } else {
                                ((gl) this).field_j.field_g = 0;
                                ((gl) this).field_j.field_k = 0;
                                break L8;
                              }
                            }
                          }
                          ((gl) this).field_j.field_g = 0;
                          ((gl) this).field_j.field_k = 0;
                          break L8;
                        }
                        decompiledRegionSelector0 = 0;
                        break L6;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((gl) this).field_j.e((byte) -58);
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
            L11: {
              L12: {
                if (decompiledRegionSelector0 == 0) {
                  var5[-2 + var5.length] = (byte)(((gl) this).field_v.field_q[param0] >>> 8);
                  var5[var5.length + -1] = (byte)((gl) this).field_v.field_q[param0];
                  if (((gl) this).field_k != null) {
                    lb discarded$1 = ((gl) this).field_u.a(var5, param0, ((gl) this).field_k, (byte) 64);
                    stackOut_100_0 = -2;
                    stackOut_100_1 = ~((gl) this).field_f[param0];
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    break L12;
                  } else {
                    break L11;
                  }
                } else {
                  break L12;
                }
              }
              if (stackIn_101_0 == stackIn_101_1) {
                break L11;
              } else {
                ((gl) this).field_f[param0] = (byte) 1;
                break L11;
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
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (var5.length <= 2) {
                      break L15;
                    } else {
                      nn.field_d.reset();
                      nn.field_d.update(var5, 0, var5.length + -2);
                      var6_int = (int)nn.field_d.getValue();
                      if (((gl) this).field_v.field_p[param0] == var6_int) {
                        L16: {
                          L17: {
                            if (null == ((gl) this).field_v.field_e) {
                              break L17;
                            } else {
                              if (((gl) this).field_v.field_e[param0] != null) {
                                var7 = ((gl) this).field_v.field_e[param0];
                                var8 = np.a(0, var5, var5.length + -2, -70);
                                var9 = 0;
                                L18: while (true) {
                                  if (var9 >= 64) {
                                    break L17;
                                  } else {
                                    stackOut_50_0 = ~var7[var9];
                                    stackOut_50_1 = ~var8[var9];
                                    stackIn_56_0 = stackOut_50_0;
                                    stackIn_56_1 = stackOut_50_1;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      if (stackIn_51_0 != stackIn_51_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L18;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          stackOut_55_0 = (var5[var5.length + -2] & 255) << 8;
                          stackOut_55_1 = var5[var5.length + -1] & 255;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          break L16;
                        }
                        var7_int = stackIn_56_0 + stackIn_56_1;
                        if ((65535 & ((gl) this).field_v.field_q[param0]) == var7_int) {
                          L19: {
                            if (((gl) this).field_f[param0] == -2) {
                              break L19;
                            } else {
                              L20: {
                                if (-1 != ((gl) this).field_f[param0]) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ((gl) this).field_f[param0] = (byte) 1;
                              break L19;
                            }
                          }
                          L21: {
                            if (((nk) var4).field_w) {
                              break L21;
                            } else {
                              ((nk) var4).f(0);
                              break L21;
                            }
                          }
                          stackOut_64_0 = var4;
                          stackIn_65_0 = stackOut_64_0;
                          break L14;
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
              var6 = (Exception) (Object) decompiledCaughtException;
              ((gl) this).field_f[param0] = (byte) -1;
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
        byte stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        byte stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_77_0 = 0;
        byte stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_45_0 = 0;
        byte stackOut_51_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_76_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    if (param0 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (((gl) this).field_e == null) {
                        statePc = 79;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (((gl) this).b((byte) -126) != null) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (((gl) this).field_b) {
                        statePc = 49;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (((gl) this).field_l) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((gl) this).field_e = null;
                    if (var5 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2_int = 1;
                    var3 = ((gl) this).field_e.b(0);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3 == null) {
                        statePc = 33;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = (int)var3.field_f;
                    stackOut_11_0 = ((gl) this).field_f[var4];
                    stackOut_11_1 = -2;
                    stackIn_19_0 = stackOut_11_0;
                    stackIn_19_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 == stackIn_12_1) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    nk discarded$5 = this.a(var4, 124, 2);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == ((gl) this).field_f[var4]) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3.f(~param0);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var3 = ((gl) this).field_e.f(param0 ^ 24058);
                    statePc = 10;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 <= stackIn_19_1) {
                        statePc = 45;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = -1;
                    stackIn_46_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var5 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 != ~((gl) this).field_v.field_l[((gl) this).field_n]) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((gl) this).field_n = ((gl) this).field_n + 1;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!((gl) this).field_j.a((byte) 101)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (((gl) this).field_f[((gl) this).field_n] == 1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    nk discarded$6 = this.a(((gl) this).field_n, 101, 2);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (1 == ((gl) this).field_f[((gl) this).field_n]) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var3 = new q();
                    var3.field_f = (long)((gl) this).field_n;
                    ((gl) this).field_e.a((byte) 54, var3);
                    var2_int = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((gl) this).field_n = ((gl) this).field_n + 1;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (((gl) this).field_v.field_l.length <= ((gl) this).field_n) {
                        statePc = 45;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = -1;
                    stackIn_46_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (var5 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 != ~((gl) this).field_v.field_l[((gl) this).field_n]) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((gl) this).field_n = ((gl) this).field_n + 1;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!((gl) this).field_j.a((byte) 101)) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (((gl) this).field_f[((gl) this).field_n] == 1) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    nk discarded$7 = this.a(((gl) this).field_n, 101, 2);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (1 == ((gl) this).field_f[((gl) this).field_n]) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var3 = new q();
                    var3.field_f = (long)((gl) this).field_n;
                    ((gl) this).field_e.a((byte) 54, var3);
                    var2_int = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    ((gl) this).field_n = ((gl) this).field_n + 1;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackOut_45_0 = var2_int;
                    stackIn_46_0 = stackOut_45_0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((gl) this).field_n = 0;
                    ((gl) this).field_l = false;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var5 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var2_int = 1;
                    var3 = ((gl) this).field_e.b(0);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var3 == null) {
                        statePc = 61;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var4 = (int)var3.field_f;
                    stackOut_51_0 = ((gl) this).field_f[var4];
                    stackIn_62_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (var5 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    nk discarded$8 = this.a(var4, 97, 1);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (((gl) this).field_f[var4] == 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var3.f(0);
                    if (var5 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var2_int = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var3 = ((gl) this).field_e.f(-24059);
                    statePc = 50;
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = ((gl) this).field_n;
                    stackIn_62_0 = stackOut_61_0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 >= ((gl) this).field_v.field_l.length) {
                        statePc = 76;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = -1;
                    stackIn_77_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (var5 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 == ((gl) this).field_v.field_l[((gl) this).field_n]) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (-251 > ((gl) this).field_u.field_a) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (0 == ((gl) this).field_f[((gl) this).field_n]) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    nk discarded$9 = this.a(((gl) this).field_n, param0 + 123, 1);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (((gl) this).field_f[((gl) this).field_n] == 0) {
                        statePc = 74;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var3 = new q();
                    var3.field_f = (long)((gl) this).field_n;
                    var2_int = 0;
                    ((gl) this).field_e.a((byte) 54, var3);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    ((gl) this).field_n = ((gl) this).field_n + 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 76: {
                    stackOut_76_0 = var2_int;
                    stackIn_77_0 = stackOut_76_0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (stackIn_77_0 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    ((gl) this).field_b = false;
                    ((gl) this).field_n = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (((gl) this).field_m) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    return;
                }
                case 81: {
                    if (km.b(-1) >= ((gl) this).field_o) {
                        statePc = 83;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var2 = (nk) (Object) ((gl) this).field_t.c((byte) -119);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (var2 != null) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ((gl) this).field_o = km.b(-1) + 1000L;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    return;
                }
                case 87: {
                    if (var5 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    return;
                }
                case 89: {
                    if (var2.field_r) {
                        statePc = 96;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var2.field_v) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var2.field_v = true;
                    if (var5 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var2.field_w) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    throw new RuntimeException();
                }
                case 95: {
                    var2.f(0);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var2 = (nk) (Object) ((gl) this).field_t.b((byte) 105);
                    statePc = 84;
                    continue stateLoop;
                }
                case 98: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    gl(int param0, pb param1, pb param2, jp param3, co param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((gl) this).field_m = stackIn_7_1 != 0;
              ((gl) this).field_g = param6;
              ((gl) this).field_u = param4;
              ((gl) this).field_r = param5;
              if (((gl) this).field_h == null) {
                break L4;
              } else {
                ((gl) this).field_i = (nk) (Object) ((gl) this).field_u.a(((gl) this).field_c, 23538, ((gl) this).field_h);
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
            stackOut_10_1 = new StringBuilder().append("gl.<init>(").append(param0).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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
