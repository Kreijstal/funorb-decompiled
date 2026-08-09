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
        if (param0 <= 92) {
            be.b(-13);
        }
        field_n = null;
        field_w = null;
    }

    private final rh a(int param0, byte param1, int param2) {
        byte stackIn_50_0 = 0;
        byte stackIn_50_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        Object stackIn_95_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_80_0;
        byte stackOut_80_1;
        byte stackOut_49_0;
        byte stackOut_49_1;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        rh var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        L0: {
          var10 = Transmogrify.field_A ? 1 : 0;
          var11 = (rh) ((Object) this.field_m.a((long)param0, 0));
          var4 = var11;
          if (var11 == null) {
            break L0;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L0;
            } else {
              if (var11.field_p) {
                break L0;
              } else {
                if (var11.field_m) {
                  var11.c(5);
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
          if (var4 == null) {
            L2: {
              L3: {
                if (param2 != 0) {
                  break L3;
                } else {
                  L4: {
                    if (this.field_p == null) {
                      break L4;
                    } else {
                      if (this.field_k[param0] == -1) {
                        break L4;
                      } else {
                        var4 = this.field_g.a(this.field_p, param0, true);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (!this.field_t.b(6)) {
                    var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
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
                if (param2 != 1) {
                  break L5;
                } else {
                  if (this.field_p != null) {
                    var4 = this.field_g.a(param0, this.field_p, (byte) 67);
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
                if (this.field_p == null) {
                  throw new RuntimeException();
                } else {
                  if (this.field_k[param0] != -1) {
                    throw new RuntimeException();
                  } else {
                    if (!this.field_t.b((byte) 95)) {
                      var4 = this.field_t.a(this.field_r, false, false, (byte) 2, param0);
                      if (var10 == 0) {
                        break L2;
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
            this.field_m.a((long)param0, (byte) -98, (wf) (var4));
            break L1;
          } else {
            break L1;
          }
        }
        if (!((rh) (var4)).field_m) {
          L6: {
            var17 = ((rh) (var4)).e(256);
            var12 = var17;
            var5 = var12;
            if (param1 == 2) {
              break L6;
            } else {
              this.b(-44, 48);
              break L6;
            }
          }
          if (var4 instanceof cl) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
                    break L8;
                  } else {
                    if (var17.length <= 2) {
                      break L8;
                    } else {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var17.length + -2);
                      var6_int = (int)hc.field_v.getValue();
                      if ((var6_int ^ -1) == (this.field_v.field_j[param0] ^ -1)) {
                        L9: {
                          L10: {
                            if (this.field_v.field_p == null) {
                              break L10;
                            } else {
                              if (null != this.field_v.field_p[param0]) {
                                var29 = this.field_v.field_p[param0];
                                var28 = n.a(var5, var17.length - 2, -5705, 0);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_80_0 = var28[var9];
                                    stackIn_85_0 = stackOut_80_0;
                                    stackIn_81_0 = stackOut_80_0;
                                    stackOut_80_1 = var29[var9];
                                    stackIn_85_1 = stackOut_80_1;
                                    stackIn_81_1 = stackOut_80_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_81_0 == stackIn_81_1) {
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
                          stackIn_85_0 = var5[var17.length - 2] << -224592664 & 65280;
                          stackIn_85_1 = var5[-1 + var17.length] & 255;
                          break L9;
                        }
                        var7 = stackIn_85_0 + stackIn_85_1;
                        if ((65535 & this.field_v.field_q[param0] ^ -1) == (var7 ^ -1)) {
                          L12: {
                            if ((this.field_k[param0] ^ -1) != -2) {
                              L13: {
                                if (0 == this.field_k[param0]) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.field_k[param0] = (byte) 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (!((rh) (var4)).field_p) {
                              ((rh) (var4)).c(param1 + 3);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          stackIn_95_0 = var4;
                          break L7;
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
              L15: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_k[param0] = (byte)-1;
                ((rh) (var4)).c(param1 ^ 7);
                if (((rh) (var4)).field_p) {
                  if (!this.field_t.b(6)) {
                    var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
                    this.field_m.a((long)param0, (byte) 98, (wf) (var4));
                    break L15;
                  } else {
                    return null;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            return (rh) ((Object) stackIn_95_0);
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if ((var17.length ^ -1) < -3) {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var17.length - 2);
                      var6_int = (int)hc.field_v.getValue();
                      if ((var6_int ^ -1) != (this.field_v.field_j[param0] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        L18: {
                          L19: {
                            if (this.field_v.field_p == null) {
                              break L19;
                            } else {
                              if (null != this.field_v.field_p[param0]) {
                                var26 = this.field_v.field_p[param0];
                                var27 = n.a(var5, var17.length - 2, -5705, 0);
                                var9 = 0;
                                L20: while (true) {
                                  if (-65 >= (var9 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackOut_49_0 = var26[var9];
                                    stackIn_62_0 = stackOut_49_0;
                                    stackIn_50_0 = stackOut_49_0;
                                    stackOut_49_1 = var27[var9];
                                    stackIn_62_1 = stackOut_49_1;
                                    stackIn_50_1 = stackOut_49_1;
                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L16;
                                    } else {
                                      if (stackIn_50_0 == stackIn_50_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_t.field_p = 0;
                                this.field_t.field_k = 0;
                                break L18;
                              }
                            }
                          }
                          this.field_t.field_p = 0;
                          this.field_t.field_k = 0;
                          break L18;
                        }
                        decompiledRegionSelector0 = 0;
                        break L16;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_t.d(126);
              ((rh) (var4)).c(5);
              if (((rh) (var4)).field_p) {
                if (!this.field_t.b(6)) {
                  var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
                  this.field_m.a((long)param0, (byte) -102, (wf) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L21: {
              L22: {
                if (decompiledRegionSelector0 == 0) {
                  var5[-2 + var17.length] = (byte)(this.field_v.field_q[param0] >>> 1140682824);
                  var5[-1 + var17.length] = (byte)this.field_v.field_q[param0];
                  if (null == this.field_p) {
                    break L21;
                  } else {
                    this.field_g.a(this.field_p, var17, -122, param0);
                    stackIn_62_0 = this.field_k[param0] ^ -1;
                    stackIn_62_1 = -2;
                    break L22;
                  }
                } else {
                  break L22;
                }
              }
              if (stackIn_62_0 != stackIn_62_1) {
                this.field_k[param0] = (byte) 1;
                break L21;
              } else {
                break L21;
              }
            }
            L23: {
              if (!((rh) (var4)).field_p) {
                ((rh) (var4)).c(5);
                break L23;
              } else {
                break L23;
              }
            }
            return (rh) (var4);
          }
        } else {
          return null;
        }
    }

    final el a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_v) {
          return this.field_v;
        } else {
          if (param0 <= -88) {
            L0: {
              if (null == this.field_f) {
                if (!this.field_t.b(6)) {
                  this.field_f = (rh) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (!this.field_f.field_m) {
              L1: {
                var7 = this.field_f.e(256);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (!(this.field_f instanceof cl)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_v = new el(var7, this.field_A, this.field_i);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_t.d(121);
                      this.field_v = null;
                      if (!this.field_t.b(6)) {
                        break L3;
                      } else {
                        this.field_f = null;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                    this.field_f = (rh) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
                    return null;
                  }
                  if (null == this.field_z) {
                    break L1;
                  } else {
                    this.field_g.a(this.field_z, var7, -78, this.field_r);
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_v = new el(var7, this.field_A, this.field_i);
                        if (this.field_v.field_b == this.field_o) {
                          break L4;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_v = null;
                      if (this.field_t.b(6)) {
                        break L5;
                      } else {
                        this.field_f = (rh) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    this.field_f = null;
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                if (null != this.field_p) {
                  this.field_k = new byte[this.field_v.field_l];
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_f = null;
              return this.field_v;
            } else {
              return null;
            }
          } else {
            return (el) null;
          }
        }
    }

    final void d(int param0) {
        rh discarded$2 = null;
        rh discarded$3 = null;
        wf var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    if (null == this.field_s) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (null != this.a(-119)) {
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
                    var2 = this.field_y.a((byte) -95);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var2 == null) {
                        statePc = 22;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = (int)var2.field_c;
                    stackIn_23_0 = -1;
                    stackIn_8_0 = stackIn_23_0;
                    stackIn_23_1 = var3 ^ -1;
                    stackIn_8_1 = stackIn_23_1;
                    if (var4 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 < stackIn_8_1) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_v.field_l <= var3) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (0 != this.field_v.field_s[var3]) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2.c(5);
                    if (var4 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (0 == this.field_k[var3]) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    discarded$2 = this.a(var3, (byte) 2, 1);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_k[var3] != -1) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    discarded$3 = this.a(var3, (byte) 2, 2);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_k[var3] != 1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var2.c(param0 ^ 23884);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var2 = this.field_y.a(true);
                    if (var4 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = param0;
                    stackIn_23_1 = 23881;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 == stackIn_23_1) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_v = (el) null;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(int param0) {
        L0: {
          if (param0 == 71) {
            break L0;
          } else {
            field_q = -78;
            break L0;
          }
        }
        if (bi.field_L >= 2) {
          L1: {
            if (0 == w.field_f) {
              if (!cj.field_c.a((byte) -126)) {
                return 20;
              } else {
                if (!cj.field_c.a((byte) 120, "commonui")) {
                  return 40;
                } else {
                  if (!wi.field_e.a((byte) -127)) {
                    return 50;
                  } else {
                    if (wi.field_e.a((byte) 112, "commonui")) {
                      if (!nd.field_n.a((byte) -118)) {
                        return 70;
                      } else {
                        if (nd.field_n.c(param0 ^ 32088)) {
                          break L1;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  }
                }
              }
            } else {
              L2: {
                if (null == hg.field_a) {
                  break L2;
                } else {
                  if (hg.field_a.a((byte) -114)) {
                    if (!hg.field_a.b((byte) -120, "")) {
                      return 29;
                    } else {
                      if (!hg.field_a.a((byte) -98, "")) {
                        return 29;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (cj.field_c.a((byte) -125)) {
                if (cj.field_c.a((byte) 120, "commonui")) {
                  if (wi.field_e.a((byte) -118)) {
                    if (wi.field_e.a((byte) -42, "commonui")) {
                      if (nd.field_n.a((byte) -118)) {
                        if (!nd.field_n.c(param0 ^ 32088)) {
                          return 86;
                        } else {
                          break L1;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final void a(boolean param0) {
        if (null == this.field_p) {
            return;
        }
        this.field_h = param0 ? true : false;
        if (!(null != this.field_s)) {
            this.field_s = new qj();
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ga.a(param0, 3336)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ve.a(1, param0)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!vj.a(-23424, param0)) {
                  if (param2.length() != param1) {
                    if (!fc.a((byte) 19, param0, param2)) {
                      if (fk.a(param2, (byte) 34, param0)) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (me.a(param2, (byte) 117, param0)) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("be.I(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L1;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    return stackIn_24_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void b(byte param0) {
        rh discarded$0 = null;
        rh discarded$1 = null;
        rh discarded$2 = null;
        rh discarded$3 = null;
        rh discarded$4 = null;
        rh discarded$5 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int statePc = 0;
        int var2_int = 0;
        rh var2 = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        wf var6 = null;
        wf var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    if (null != this.field_s) {
                        statePc = 2;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (null != this.a(-95)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (this.field_u) {
                        statePc = 37;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!this.field_h) {
                        statePc = 35;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2_int = 1;
                    var3 = this.field_s.a((byte) -95);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var3 == null) {
                        statePc = 133;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = (int)var3.field_c;
                    stackIn_18_0 = this.field_k[var4] ^ -1;
                    stackIn_9_0 = stackIn_18_0;
                    stackIn_18_1 = -2;
                    stackIn_9_1 = stackIn_18_1;
                    if (var5 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != stackIn_9_1) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    discarded$0 = this.a(var4, (byte) 2, 2);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 == this.field_k[var4]) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3.c(5);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var3 = this.field_s.a(true);
                    if (var5 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = this.field_v.field_s.length;
                    stackIn_18_1 = this.field_e;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 <= stackIn_18_1) {
                        statePc = 31;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_69_0 = -1;
                    stackIn_20_0 = stackIn_69_0;
                    stackIn_69_1 = this.field_v.field_s[this.field_e] ^ -1;
                    stackIn_20_1 = stackIn_69_1;
                    if (var5 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 != stackIn_20_1) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (!this.field_t.b((byte) 122)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (-2 == (this.field_k[this.field_e] ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    discarded$1 = this.a(this.field_e, (byte) 2, 2);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (1 != this.field_k[this.field_e]) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6 = new wf();
                    var6.field_c = (long)this.field_e;
                    this.field_s.a(var6, -89);
                    var2_int = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var2_int != 0) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_h = false;
                    this.field_e = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var5 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_s = null;
                    if (var5 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var2_int = 1;
                    var3 = this.field_s.a((byte) -95);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var3 == null) {
                        statePc = 110;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var4 = (int)var3.field_c;
                    stackIn_50_0 = -1;
                    stackIn_40_0 = stackIn_50_0;
                    stackIn_50_1 = this.field_k[var4] ^ -1;
                    stackIn_40_1 = stackIn_50_1;
                    if (var5 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 == stackIn_40_1) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    discarded$2 = this.a(var4, (byte) 2, 1);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_k[var4] ^ -1) == -1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var3.c(5);
                    if (var5 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2_int = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var3 = this.field_s.a(true);
                    if (var5 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = this.field_e;
                    stackIn_50_1 = this.field_v.field_s.length;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 >= stackIn_50_1) {
                        statePc = 64;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_65_0 = this.field_v.field_s[this.field_e];
                    stackIn_52_0 = stackIn_65_0;
                    if (var5 != 0) {
                        statePc = 65;
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
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (250 <= this.field_g.field_e) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((this.field_k[this.field_e] ^ -1) != -1) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    discarded$3 = this.a(this.field_e, (byte) 2, 1);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if ((this.field_k[this.field_e] ^ -1) == -1) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var7 = new wf();
                    var7.field_c = (long)this.field_e;
                    var2_int = 0;
                    this.field_s.a(var7, -115);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = var2_int;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_e = 0;
                    this.field_u = false;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = param0;
                    stackIn_69_1 = 122;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 >= stackIn_69_1) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_g = (cd) null;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (!this.field_j) {
                        statePc = 86;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((this.field_l ^ -1L) < (lk.a(0) ^ -1L)) {
                        statePc = 86;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var2 = (rh) ((Object) this.field_m.b(1000));
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var2 == null) {
                        statePc = 84;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var5 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var2.field_m) {
                        statePc = 83;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var2.field_o) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var2.field_o = true;
                    if (var5 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var2.field_p) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    throw new RuntimeException();
                }
                case 82: {
                    var2.c(5);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var2 = (rh) ((Object) this.field_m.a(58));
                    if (var5 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_l = lk.a(0) + 1000L;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    return;
                }
                case 89: {
                    discarded$4 = this.a(this.field_e, (byte) 2, 1);
                    statePc = 94;
                    continue stateLoop;
                }
                case 91: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var7 = new wf();
                    var7.field_c = (long)this.field_e;
                    var2_int = 0;
                    this.field_s.a(var7, -115);
                    statePc = 91;
                    continue stateLoop;
                }
                case 94: {
                    if ((this.field_k[this.field_e] ^ -1) == -1) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((this.field_k[this.field_e] ^ -1) != -1) {
                        statePc = 94;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (250 <= this.field_g.field_e) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (stackIn_104_0 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_65_0 = this.field_v.field_s[this.field_e];
                    stackIn_107_0 = stackIn_65_0;
                    if (var5 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_104_0 = stackIn_107_0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 >= stackIn_108_1) {
                        statePc = 64;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_108_0 = this.field_e;
                    stackIn_108_1 = this.field_v.field_s.length;
                    statePc = 108;
                    continue stateLoop;
                }
                case 112: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 116: {
                    discarded$5 = this.a(this.field_e, (byte) 2, 2);
                    statePc = 121;
                    continue stateLoop;
                }
                case 118: {
                    this.field_e = this.field_e + 1;
                    if (var5 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var6 = new wf();
                    var6.field_c = (long)this.field_e;
                    this.field_s.a(var6, -89);
                    var2_int = 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 121: {
                    if (1 != this.field_k[this.field_e]) {
                        statePc = 120;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-2 == (this.field_k[this.field_e] ^ -1)) {
                        statePc = 121;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (!this.field_t.b((byte) 122)) {
                        statePc = 123;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0 != stackIn_127_1) {
                        statePc = 125;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_69_0 = -1;
                    stackIn_130_0 = stackIn_69_0;
                    stackIn_69_1 = this.field_v.field_s[this.field_e] ^ -1;
                    stackIn_130_1 = stackIn_69_1;
                    if (var5 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_127_0 = stackIn_130_0;
                    stackIn_127_1 = stackIn_130_1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 <= stackIn_131_1) {
                        statePc = 31;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackIn_131_0 = this.field_v.field_s.length;
                    stackIn_131_1 = this.field_e;
                    statePc = 131;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, int param1) {
        int var3 = 76 / ((-41 - param1) / 60);
        rh var4 = this.a(param0, (byte) 2, 0);
        if (var4 == null) {
            return null;
        }
        byte[] var5 = var4.e(256);
        var4.c(5);
        return var5;
    }

    final static hg c(int param0) {
        String var1 = cd.b(-89);
        if (var1 != null && 0 <= var1.indexOf('@')) {
            var1 = "";
        }
        if (param0 < 5) {
            return (hg) null;
        }
        return new hg(cd.b(-127), cf.d(4819119));
    }

    final int b(int param0, int param1) {
        rh var3 = (rh) ((Object) this.field_m.a((long)param1, 0));
        if (var3 != null) {
            return var3.f(0);
        }
        if (param0 > -13) {
            this.field_r = 65;
            return 0;
        }
        return 0;
    }

    be(int param0, ak param1, ak param2, uh param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_m = new fl(16);
        this.field_e = 0;
        this.field_y = new qj();
        this.field_l = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_r = param0;
                this.field_p = param1;
                if (null != this.field_p) {
                  break L2;
                } else {
                  this.field_u = false;
                  if (!Transmogrify.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_u = true;
              this.field_s = new qj();
              break L1;
            }
            L3: {
              this.field_A = param5;
              this.field_t = param3;
              this.field_i = param6;
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L3;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L3;
              }
            }
            L4: {
              ((be) (this)).field_j = stackIn_7_1 != 0;
              this.field_z = param2;
              this.field_o = param7;
              this.field_g = param4;
              if (null == this.field_z) {
                break L4;
              } else {
                this.field_f = (rh) ((Object) this.field_g.a(this.field_z, this.field_r, true));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("be.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_w = new nk(0);
    }
}
