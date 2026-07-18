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
              var5 = ((gl) this).field_i.c((byte) 114);
              var2 = var5;
              if (((gl) this).field_i instanceof lb) {
                try {
                  L3: {
                    if (var2 == null) {
                      throw new RuntimeException();
                    } else {
                      ((gl) this).field_v = new fd(var2, ((gl) this).field_r, ((gl) this).field_g);
                      if (((gl) this).field_p != ((gl) this).field_v.field_r) {
                        throw new RuntimeException();
                      } else {
                        break L3;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    ((gl) this).field_v = null;
                    if (((gl) this).field_j.a(20)) {
                      ((gl) this).field_i = null;
                      break L4;
                    } else {
                      ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((gl) this).field_v = new fd(var5, ((gl) this).field_r, ((gl) this).field_g);
                      break L5;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    ((gl) this).field_j.e((byte) -127);
                    ((gl) this).field_v = null;
                    if (!((gl) this).field_j.a(param0 ^ -106)) {
                      ((gl) this).field_i = (nk) (Object) ((gl) this).field_j.a((byte) 0, 255, true, (byte) -51, ((gl) this).field_c);
                      break L6;
                    } else {
                      ((gl) this).field_i = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (null == ((gl) this).field_h) {
                  break L2;
                } else {
                  lb discarded$1 = ((gl) this).field_u.a(var5, ((gl) this).field_c, ((gl) this).field_h, (byte) 120);
                  break L2;
                }
              }
            }
            L7: {
              if (((gl) this).field_k != null) {
                ((gl) this).field_f = new byte[((gl) this).field_v.field_c];
                break L7;
              } else {
                break L7;
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
        if (((gl) this).field_k == null) {
            return;
        }
        ((gl) this).field_l = true;
        if (param0 >= -107) {
            return;
        }
        if (!(((gl) this).field_e != null)) {
            ((gl) this).field_e = new ei();
        }
    }

    final byte[] a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        nk var3 = this.a(param0, 121, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c((byte) 112);
        var3.f(0);
        return var4;
    }

    public static void c(int param0) {
        field_d = null;
        int var1 = 109 % ((-37 - param0) / 37);
    }

    final int a(int param0, int param1) {
        if (param1 != -26954) {
            gl.c(83);
        }
        nk var3 = (nk) (Object) ((gl) this).field_t.a((long)param0, (byte) 101);
        if (var3 != null) {
            return var3.b(param1 + 27066);
        }
        return 0;
    }

    final void c(byte param0) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        if (null == ((gl) this).field_e) {
            return;
        }
        if (!(null != ((gl) this).b((byte) -126))) {
            return;
        }
        q var2 = ((gl) this).field_s.b(0);
        if (param0 != -94) {
            ((gl) this).field_m = false;
        }
        while (var2 != null) {
            var3 = (int)var2.field_f;
            if (var3 < 0) {
                var2.f(0);
            } else {
                if (((gl) this).field_v.field_c <= var3) {
                    var2.f(0);
                } else {
                    if (((gl) this).field_v.field_l[var3] == 0) {
                        var2.f(0);
                    } else {
                        if (((gl) this).field_f[var3] == 0) {
                            nk discarded$0 = this.a(var3, 121, 1);
                        }
                        if (((gl) this).field_f[var3] == -1) {
                            nk discarded$1 = this.a(var3, 104, 2);
                        }
                        if (((gl) this).field_f[var3] == 1) {
                            var2.f(0);
                        }
                    }
                }
            }
            var2 = ((gl) this).field_s.f(-24059);
        }
    }

    private final nk a(int param0, int param1, int param2) {
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
        int var11 = 0;
        Object stackIn_61_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_60_0 = null;
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
              if (0 != param2) {
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
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L4: {
                  if (((gl) this).field_k == null) {
                    break L4;
                  } else {
                    if (((gl) this).field_f[param0] != -1) {
                      var4 = (Object) (Object) ((gl) this).field_u.a(param0, 23538, ((gl) this).field_k);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!((gl) this).field_j.a(20)) {
                  var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                  break L3;
                } else {
                  return null;
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
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var5.length > 2) {
                      nn.field_d.reset();
                      nn.field_d.update(var5, 0, -2 + var5.length);
                      var6_int = (int)nn.field_d.getValue();
                      if (((gl) this).field_v.field_p[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (((gl) this).field_v.field_e == null) {
                            break L7;
                          } else {
                            if (((gl) this).field_v.field_e[param0] != null) {
                              var7 = ((gl) this).field_v.field_e[param0];
                              var8 = np.a(0, var5, -2 + var5.length, -107);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (64 <= var11) {
                                  break L7;
                                } else {
                                  if (var7[var11] != var8[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L8;
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        ((gl) this).field_j.field_g = 0;
                        ((gl) this).field_j.field_k = 0;
                        break L5;
                      }
                    } else {
                      break L6;
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
                if (!((gl) this).field_j.a(20)) {
                  var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                  ((gl) this).field_t.a(false, (long)param0, (q) var4);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L9: {
              var5[-2 + var5.length] = (byte)(((gl) this).field_v.field_q[param0] >>> 8);
              var5[var5.length + -1] = (byte)((gl) this).field_v.field_q[param0];
              if (((gl) this).field_k != null) {
                lb discarded$1 = ((gl) this).field_u.a(var5, param0, ((gl) this).field_k, (byte) 64);
                if (((gl) this).field_f[param0] == 1) {
                  break L9;
                } else {
                  ((gl) this).field_f[param0] = (byte) 1;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((nk) var4).field_w) {
                break L10;
              } else {
                ((nk) var4).f(0);
                break L10;
              }
            }
            return (nk) var4;
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (var5.length <= 2) {
                      break L12;
                    } else {
                      nn.field_d.reset();
                      nn.field_d.update(var5, 0, var5.length + -2);
                      var6_int = (int)nn.field_d.getValue();
                      if (((gl) this).field_v.field_p[param0] == var6_int) {
                        L13: {
                          if (null == ((gl) this).field_v.field_e) {
                            break L13;
                          } else {
                            if (((gl) this).field_v.field_e[param0] != null) {
                              var7 = ((gl) this).field_v.field_e[param0];
                              var8 = np.a(0, var5, var5.length + -2, -70);
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= 64) {
                                  break L13;
                                } else {
                                  if (var7[var9] != var8[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L14;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var7_int = ((var5[var5.length + -2] & 255) << 8) + (var5[var5.length + -1] & 255);
                        if ((65535 & ((gl) this).field_v.field_q[param0]) == var7_int) {
                          L15: {
                            if (((gl) this).field_f[param0] == -2) {
                              break L15;
                            } else {
                              L16: {
                                if (-1 != ((gl) this).field_f[param0]) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              ((gl) this).field_f[param0] = (byte) 1;
                              break L15;
                            }
                          }
                          L17: {
                            if (((nk) var4).field_w) {
                              break L17;
                            } else {
                              ((nk) var4).f(0);
                              break L17;
                            }
                          }
                          stackOut_60_0 = var4;
                          stackIn_61_0 = stackOut_60_0;
                          break L11;
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
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((gl) this).field_f[param0] = (byte) -1;
                ((nk) var4).f(0);
                if (((nk) var4).field_w) {
                  if (!((gl) this).field_j.a(20)) {
                    var4 = (Object) (Object) ((gl) this).field_j.a((byte) 2, ((gl) this).field_c, true, (byte) -51, param0);
                    ((gl) this).field_t.a(false, (long)param0, (q) var4);
                    break L18;
                  } else {
                    return null;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (nk) (Object) stackIn_61_0;
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
        var5 = Torquing.field_u;
        if (param0 == -1) {
          L0: {
            if (((gl) this).field_e == null) {
              break L0;
            } else {
              if (((gl) this).b((byte) -126) != null) {
                if (((gl) this).field_b) {
                  var2_int = 1;
                  var3 = ((gl) this).field_e.b(0);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (((gl) this).field_n >= ((gl) this).field_v.field_l.length) {
                            break L3;
                          } else {
                            L4: {
                              if (-1 == ((gl) this).field_v.field_l[((gl) this).field_n]) {
                                break L4;
                              } else {
                                if (-251 > ((gl) this).field_u.field_a) {
                                  L5: {
                                    if (0 == ((gl) this).field_f[((gl) this).field_n]) {
                                      nk discarded$4 = this.a(((gl) this).field_n, param0 + 123, 1);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (((gl) this).field_f[((gl) this).field_n] == 0) {
                                    var3 = new q();
                                    var3.field_f = (long)((gl) this).field_n;
                                    var2_int = 0;
                                    ((gl) this).field_e.a((byte) 54, var3);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L3;
                                }
                              }
                            }
                            ((gl) this).field_n = ((gl) this).field_n + 1;
                            continue L2;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((gl) this).field_b = false;
                          ((gl) this).field_n = 0;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_f;
                        if (((gl) this).field_f[var4] == 0) {
                          nk discarded$5 = this.a(var4, 97, 1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((gl) this).field_f[var4] == 0) {
                          var2_int = 0;
                          break L7;
                        } else {
                          var3.f(0);
                          break L7;
                        }
                      }
                      var3 = ((gl) this).field_e.f(-24059);
                      continue L1;
                    }
                  }
                } else {
                  if (((gl) this).field_l) {
                    var2_int = 1;
                    var3 = ((gl) this).field_e.b(0);
                    L8: while (true) {
                      if (var3 == null) {
                        L9: while (true) {
                          L10: {
                            if (((gl) this).field_v.field_l.length <= ((gl) this).field_n) {
                              break L10;
                            } else {
                              if (((gl) this).field_v.field_l[((gl) this).field_n] != 0) {
                                if (!((gl) this).field_j.a((byte) 101)) {
                                  L11: {
                                    if (((gl) this).field_f[((gl) this).field_n] == 1) {
                                      break L11;
                                    } else {
                                      nk discarded$6 = this.a(((gl) this).field_n, 101, 2);
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (1 == ((gl) this).field_f[((gl) this).field_n]) {
                                      break L12;
                                    } else {
                                      var3 = new q();
                                      var3.field_f = (long)((gl) this).field_n;
                                      ((gl) this).field_e.a((byte) 54, var3);
                                      var2_int = 0;
                                      break L12;
                                    }
                                  }
                                  ((gl) this).field_n = ((gl) this).field_n + 1;
                                  continue L9;
                                } else {
                                  var2_int = 0;
                                  break L10;
                                }
                              } else {
                                ((gl) this).field_n = ((gl) this).field_n + 1;
                                continue L9;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L0;
                          } else {
                            ((gl) this).field_n = 0;
                            ((gl) this).field_l = false;
                            break L0;
                          }
                        }
                      } else {
                        L13: {
                          var4 = (int)var3.field_f;
                          if (((gl) this).field_f[var4] == -2) {
                            break L13;
                          } else {
                            nk discarded$7 = this.a(var4, 124, 2);
                            break L13;
                          }
                        }
                        L14: {
                          if (-2 == ((gl) this).field_f[var4]) {
                            var3.f(~param0);
                            break L14;
                          } else {
                            var2_int = 0;
                            break L14;
                          }
                        }
                        var3 = ((gl) this).field_e.f(param0 ^ 24058);
                        continue L8;
                      }
                    }
                  } else {
                    ((gl) this).field_e = null;
                    break L0;
                  }
                }
              } else {
                return;
              }
            }
          }
          L15: {
            if (!((gl) this).field_m) {
              break L15;
            } else {
              if (km.b(-1) >= ((gl) this).field_o) {
                var2 = (nk) (Object) ((gl) this).field_t.c((byte) -119);
                L16: while (true) {
                  if (var2 == null) {
                    ((gl) this).field_o = km.b(-1) + 1000L;
                    break L15;
                  } else {
                    L17: {
                      if (var2.field_r) {
                        break L17;
                      } else {
                        if (var2.field_v) {
                          if (var2.field_w) {
                            var2.f(0);
                            break L17;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_v = true;
                          break L17;
                        }
                      }
                    }
                    var2 = (nk) (Object) ((gl) this).field_t.b((byte) 105);
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
          }
          return;
        } else {
          return;
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
              ((gl) this).field_k = param1;
              ((gl) this).field_c = param0;
              if (((gl) this).field_k != null) {
                ((gl) this).field_b = true;
                ((gl) this).field_e = new ei();
                break L1;
              } else {
                ((gl) this).field_b = false;
                break L1;
              }
            }
            L2: {
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
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((gl) this).field_m = stackIn_7_1 != 0;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("gl.<init>(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
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
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
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
