/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends of {
    private kh field_w;
    static int field_y;
    private byte[] field_F;
    static String field_r;
    private ng field_G;
    private im field_v;
    static w[] field_D;
    private int field_q;
    private kh field_H;
    private ad field_I;
    private sf field_p;
    private byte[] field_z;
    static tb field_o;
    private dd field_l;
    private int field_n;
    private int field_x;
    static int field_t;
    private vj field_J;
    private boolean field_u;
    private vj field_k;
    private int field_j;
    static eh field_m;
    static int field_s;
    private boolean field_B;
    static ji field_E;
    private long field_A;
    private boolean field_C;

    final ad a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = client.field_A ? 1 : 0;
        if (null == this.field_I) {
          L0: {
            if (this.field_p == null) {
              if (!this.field_l.a(param0)) {
                this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, true, 255, this.field_x));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_p.field_z) {
            if (param0) {
              L1: {
                L2: {
                  var7 = this.field_p.g((byte) 70);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (this.field_p instanceof el) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_I = new ad(var7, this.field_q, this.field_z);
                          break L3;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = decompiledCaughtException;
                        this.field_l.a(8192);
                        this.field_I = null;
                        if (this.field_l.a(true)) {
                          break L4;
                        } else {
                          this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, param0, 255, this.field_x));
                          if (var4 != 0) {
                            break L4;
                          } else {
                            return null;
                          }
                        }
                      }
                      this.field_p = null;
                      return null;
                    }
                    if (this.field_H != null) {
                      this.field_v.a(this.field_x, this.field_H, var7, (byte) 67);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_I = new ad(var7, this.field_q, this.field_z);
                      if ((this.field_n ^ -1) == (this.field_I.field_m ^ -1)) {
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_I = null;
                    if (!this.field_l.a(true)) {
                      break L6;
                    } else {
                      this.field_p = null;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        return null;
                      }
                    }
                  }
                  this.field_p = (sf) ((Object) this.field_l.a(true, (byte) 0, param0, 255, this.field_x));
                  return null;
                }
                break L1;
              }
              L7: {
                if (null == this.field_w) {
                  break L7;
                } else {
                  this.field_F = new byte[this.field_I.field_n];
                  break L7;
                }
              }
              this.field_p = null;
              return this.field_I;
            } else {
              return (ad) null;
            }
          } else {
            return null;
          }
        } else {
          return this.field_I;
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_D = null;
        field_E = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final void b(int param0) {
        sf discarded$2 = null;
        sf discarded$3 = null;
        bh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    if (this.field_J != null) {
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
                    if (null != this.a(true)) {
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
                    var2 = this.field_k.c((byte) -113);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var2 == null) {
                        statePc = 22;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = (int)var2.field_i;
                    stackIn_23_0 = var3;
                    stackIn_7_0 = stackIn_23_0;
                    if (var4 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 < 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_I.field_n <= var3) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 != (this.field_I.field_B[var3] ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2.b((byte) 105);
                    if (var4 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (0 == this.field_F[var3]) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    discarded$2 = this.a(1, var3, (byte) -20);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (-1 == this.field_F[var3]) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    discarded$3 = this.a(2, var3, (byte) -20);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_F[var3] != 1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var2.b((byte) 117);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var2 = this.field_k.d(true);
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = param0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 == 16322) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.b(-71);
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

    final int a(int param0, int param1) {
        int var4 = 103 % ((param1 - 5) / 58);
        sf dupTemp$0 = (sf) ((Object) this.field_G.a((long)param0, 77));
        sf var5 = dupTemp$0;
        sf var3 = dupTemp$0;
        if (var5 != null) {
            return var5.a(false);
        }
        return 0;
    }

    final void b(byte param0) {
        if (!(null != this.field_w)) {
            return;
        }
        if (param0 != 0) {
            this.field_I = (ad) null;
        }
        this.field_B = true;
        if (!(this.field_J != null)) {
            this.field_J = new vj();
        }
    }

    private final sf a(int param0, int param1, byte param2) {
        sf dupTemp$0 = null;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        sf var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        L0: {
          var10 = client.field_A ? 1 : 0;
          dupTemp$0 = (sf) ((Object) this.field_G.a((long)param1, 95));
          var11 = dupTemp$0;
          var4 = dupTemp$0;
          if (var11 == null) {
            break L0;
          } else {
            if ((param0 ^ -1) != -1) {
              break L0;
            } else {
              if (var11.field_D) {
                break L0;
              } else {
                if (var11.field_z) {
                  var11.b((byte) 114);
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
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if (-1 == (param0 ^ -1)) {
                  break L3;
                } else {
                  if (1 == param0) {
                    if (null != this.field_w) {
                      var4 = this.field_v.a(param1, this.field_w, (byte) 61);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if (param0 != 2) {
                      throw new RuntimeException();
                    } else {
                      if (null == this.field_w) {
                        throw new RuntimeException();
                      } else {
                        if (0 != (this.field_F[param1] ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          if (!this.field_l.b(0)) {
                            var4 = this.field_l.a(false, (byte) 2, true, this.field_x, param1);
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
                    }
                  }
                }
              }
              L4: {
                if (null == this.field_w) {
                  break L4;
                } else {
                  if (0 != (this.field_F[param1] ^ -1)) {
                    var4 = this.field_v.a(param1, this.field_w, -98);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (!this.field_l.a(true)) {
                var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
                if (var10 == 0) {
                  break L2;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            this.field_G.a((long)param1, -1, (bh) (var4));
            break L1;
          }
        }
        if (!((sf) (var4)).field_z) {
          L5: {
            var17 = ((sf) (var4)).g((byte) 79);
            var12 = var17;
            var5 = var12;
            if (param2 == -20) {
              break L5;
            } else {
              this.field_q = 57;
              break L5;
            }
          }
          if (!(var4 instanceof el)) {
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (-3 > (var17.length ^ -1)) {
                      ab.field_c.reset();
                      ab.field_c.update(var5, 0, -2 + var17.length);
                      var6_int = (int)ab.field_c.getValue();
                      if ((this.field_I.field_c[param1] ^ -1) != (var6_int ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          L9: {
                            if (this.field_I.field_l == null) {
                              break L9;
                            } else {
                              if (null != this.field_I.field_l[param1]) {
                                var28 = this.field_I.field_l[param1];
                                var29 = um.a(0, var5, 0, -2 + var17.length);
                                var9 = 0;
                                L10: while (true) {
                                  if (var9 >= 64) {
                                    break L9;
                                  } else {
                                    stackIn_98_0 = var28[var9] ^ -1;

                                    stackIn_98_1 = var29[var9] ^ -1;

                                    if (var10 != 0) {
                                      decompiledRegionSelector0 = 1;
                                      break L6;
                                    } else {
                                      if (stackIn_98_0 != stackIn_98_1) {
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
                                this.field_l.field_j = 0;
                                this.field_l.field_o = 0;
                                break L8;
                              }
                            }
                          }
                          this.field_l.field_j = 0;
                          this.field_l.field_o = 0;
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
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              this.field_l.a(8192);
              ((sf) (var4)).b((byte) 117);
              if (((sf) (var4)).field_D) {
                if (!this.field_l.a(true)) {
                  var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
                  this.field_G.a((long)param1, -1, (bh) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L11: {
              L12: {
                if (decompiledRegionSelector0 == 0) {
                  var5[-2 + var17.length] = (byte)(this.field_I.field_y[param1] >>> 967493416);
                  var5[-1 + var17.length] = (byte)this.field_I.field_y[param1];
                  if (null != this.field_w) {
                    this.field_v.a(param1, this.field_w, var17, (byte) -68);
                    stackIn_98_0 = this.field_F[param1] ^ -1;
                    stackIn_98_1 = -2;
                    break L12;
                  } else {
                    break L11;
                  }
                } else {
                  break L12;
                }
              }
              if (stackIn_98_0 == stackIn_98_1) {
                break L11;
              } else {
                this.field_F[param1] = (byte) 1;
                break L11;
              }
            }
            L13: {
              if (!((sf) (var4)).field_D) {
                ((sf) (var4)).b((byte) 117);
                break L13;
              } else {
                break L13;
              }
            }
            return (sf) (var4);
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (-3 > (var17.length ^ -1)) {
                      ab.field_c.reset();
                      ab.field_c.update(var5, 0, -2 + var17.length);
                      var6_int = (int)ab.field_c.getValue();
                      if ((this.field_I.field_c[param1] ^ -1) != (var6_int ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        L16: {
                          L17: {
                            if (this.field_I.field_l == null) {
                              break L17;
                            } else {
                              if (null != this.field_I.field_l[param1]) {
                                var27 = this.field_I.field_l[param1];
                                var26 = um.a(0, var5, 0, var17.length - 2);
                                var9 = 0;
                                L18: while (true) {
                                  if (64 <= var9) {
                                    break L17;
                                  } else {
                                    stackIn_55_0 = var26[var9] ^ -1;

                                    stackIn_55_1 = var27[var9] ^ -1;

                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      if (stackIn_55_0 == stackIn_55_1) {
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
                          stackIn_55_0 = (var5[var17.length + -2] & 255) << 1262224936;
                          stackIn_55_1 = -(var5[var17.length + -1] & 255);
                          break L16;
                        }
                        var7 = stackIn_55_0 - stackIn_55_1;
                        if ((this.field_I.field_y[param1] & 65535) == var7) {
                          L19: {
                            if (this.field_F[param1] != 1) {
                              L20: {
                                if (0 != this.field_F[param1]) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              this.field_F[param1] = (byte) 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L21: {
                            if (((sf) (var4)).field_D) {
                              break L21;
                            } else {
                              ((sf) (var4)).b((byte) 115);
                              break L21;
                            }
                          }
                          stackIn_64_0 = var4;
                          break L14;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_F[param1] = (byte)-1;
              ((sf) (var4)).b((byte) 119);
              if (((sf) (var4)).field_D) {
                L22: {
                  if (!this.field_l.a(true)) {
                    var4 = this.field_l.a(true, (byte) 2, true, this.field_x, param1);
                    this.field_G.a((long)param1, param2 ^ 19, (bh) (var4));
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (sf) ((Object) stackIn_64_0);
          }
        } else {
          return null;
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 32085) {
            le.b(false);
        }
        return 500 * ((-1 + param1) * param1);
    }

    final static void a(byte param0, int param1) {
        dk.field_i = param1 * 100 / 150;
        dk.field_c = (param1 << -367606192) / 150;
        dk.field_g = param1 * 400 / 150;
        int var2 = 101 % ((8 - param0) / 52);
    }

    final void c(boolean param0) {
        sf discarded$0 = null;
        sf discarded$1 = null;
        sf discarded$2 = null;
        sf discarded$3 = null;
        sf discarded$4 = null;
        sf discarded$5 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        byte stackIn_41_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        byte stackOut_40_1;
        int statePc = 0;
        int var2_int = 0;
        sf var2 = null;
        bh var3 = null;
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        bh var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c(false);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null == this.field_J) {
                        statePc = 68;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (null == this.a(param0)) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (!this.field_u) {
                        statePc = 35;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2_int = 1;
                    var3 = this.field_J.c((byte) 54);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 == null) {
                        statePc = 130;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = (int)var3.field_i;
                    stackIn_19_0 = -1;
                    stackIn_10_0 = stackIn_19_0;
                    stackIn_19_1 = this.field_F[var4] ^ -1;
                    stackIn_10_1 = stackIn_19_1;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 == stackIn_10_1) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    discarded$0 = this.a(1, var4, (byte) -20);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_F[var4] != 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3.b((byte) 121);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var3 = this.field_J.d(true);
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = this.field_j;
                    stackIn_19_1 = this.field_I.field_B.length;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 >= stackIn_19_1) {
                        statePc = 31;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_32_0 = 0;
                    stackIn_21_0 = stackIn_32_0;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 == this.field_I.field_B[this.field_j]) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_v.field_b < 250) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((this.field_F[this.field_j] ^ -1) != -1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    discarded$1 = this.a(1, this.field_j, (byte) -20);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (0 != this.field_F[this.field_j]) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var6 = new bh();
                    var6.field_i = (long)this.field_j;
                    this.field_J.a(var6, 2777);
                    var2_int = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = var2_int;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_j = 0;
                    this.field_u = false;
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
                    if (this.field_B) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_J = null;
                    if (var5 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var2_int = 1;
                    var3 = this.field_J.c((byte) 77);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var3 == null) {
                        statePc = 108;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var4 = (int)var3.field_i;
                    stackIn_50_0 = 1;
                    stackIn_41_0 = stackIn_50_0;
                    stackOut_40_1 = this.field_F[var4];
                    stackIn_50_1 = stackOut_40_1;
                    stackIn_41_1 = stackOut_40_1;
                    if (var5 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 == stackIn_41_1) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    discarded$2 = this.a(2, var4, (byte) -20);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (-2 != (this.field_F[var4] ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var3.b((byte) 102);
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
                    var3 = this.field_J.d(true);
                    if (var5 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = this.field_j ^ -1;
                    stackIn_50_1 = this.field_I.field_B.length ^ -1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 <= stackIn_50_1) {
                        statePc = 64;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_65_0 = this.field_I.field_B[this.field_j];
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
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (this.field_l.b(0)) {
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
                    if (this.field_F[this.field_j] != 1) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    discarded$3 = this.a(2, this.field_j, (byte) -20);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (1 == this.field_F[this.field_j]) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var7 = new bh();
                    var7.field_i = (long)this.field_j;
                    this.field_J.a(var7, 2777);
                    var2_int = 0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    this.field_j = this.field_j + 1;
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
                    this.field_j = 0;
                    this.field_B = false;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (!this.field_C) {
                        statePc = 84;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if ((ik.a(4) ^ -1L) > (this.field_A ^ -1L)) {
                        statePc = 84;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2 = (sf) ((Object) this.field_G.a((byte) 126));
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var2 == null) {
                        statePc = 82;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var5 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var2.field_z) {
                        statePc = 81;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var2.field_A) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var2.field_A = true;
                    if (var5 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (!var2.field_D) {
                        statePc = 79;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 79: {
                    throw new RuntimeException();
                }
                case 80: {
                    var2.b((byte) 101);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var2 = (sf) ((Object) this.field_G.b((byte) 107));
                    if (var5 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    this.field_A = ik.a(4) + 1000L;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    return;
                }
                case 88: {
                    var7 = new bh();
                    var7.field_i = (long)this.field_j;
                    this.field_J.a(var7, 2777);
                    var2_int = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (1 == this.field_F[this.field_j]) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 93: {
                    discarded$4 = this.a(2, this.field_j, (byte) -20);
                    statePc = 91;
                    continue stateLoop;
                }
                case 94: {
                    if (this.field_F[this.field_j] != 1) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (this.field_l.b(0)) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_65_0 = this.field_I.field_B[this.field_j];
                    stackIn_105_0 = stackIn_65_0;
                    if (var5 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_102_0 = stackIn_105_0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 <= stackIn_106_1) {
                        statePc = 64;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_106_0 = this.field_j ^ -1;
                    stackIn_106_1 = this.field_I.field_B.length ^ -1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 110: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 112: {
                    discarded$5 = this.a(1, this.field_j, (byte) -20);
                    statePc = 116;
                    continue stateLoop;
                }
                case 113: {
                    var6 = new bh();
                    var6.field_i = (long)this.field_j;
                    this.field_J.a(var6, 2777);
                    var2_int = 0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (0 != this.field_F[this.field_j]) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if ((this.field_F[this.field_j] ^ -1) != -1) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (this.field_v.field_b < 250) {
                        statePc = 118;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.field_j = this.field_j + 1;
                    if (var5 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 == this.field_I.field_B[this.field_j]) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackIn_32_0 = 0;
                    stackIn_127_0 = stackIn_32_0;
                    if (var5 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackIn_124_0 = stackIn_127_0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 >= stackIn_128_1) {
                        statePc = 31;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_128_0 = this.field_j;
                    stackIn_128_1 = this.field_I.field_B.length;
                    statePc = 128;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, byte param1) {
        sf var3 = this.a(0, param0, (byte) -20);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g((byte) 126);
        var3.b((byte) 107);
        if (param1 != 91) {
            return (byte[]) null;
        }
        return var4;
    }

    le(int param0, kh param1, kh param2, dd param3, im param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_G = new ng(16);
        this.field_j = 0;
        this.field_k = new vj();
        this.field_A = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_w = param1;
                this.field_x = param0;
                if (null != this.field_w) {
                  break L2;
                } else {
                  this.field_u = false;
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_u = true;
              this.field_J = new vj();
              break L1;
            }
            L3: {
              this.field_q = param5;
              this.field_l = param3;
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
              ((le) (this)).field_C = stackIn_7_1 != 0;
              this.field_z = param6;
              this.field_H = param2;
              this.field_n = param7;
              this.field_v = param4;
              if (null == this.field_H) {
                break L4;
              } else {
                this.field_p = (sf) ((Object) this.field_v.a(this.field_x, this.field_H, -36));
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

            stackIn_12_1 = new StringBuilder().append("le.<init>(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = "No highscores";
        field_o = new tb();
    }
}
