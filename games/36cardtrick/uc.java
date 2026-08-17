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
        Object stackIn_15_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_117_0 = null;
        Object stackIn_127_0 = null;
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
        int var11 = 0;
        la var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var12 = (la) ((Object) this.field_n.a(false, (long)param1));
              var4 = var12;
              if (var12 == null) {
                break L1;
              } else {
                if (0 != param2) {
                  break L1;
                } else {
                  if (var12.field_o) {
                    break L1;
                  } else {
                    if (!var12.field_n) {
                      break L1;
                    } else {
                      var12.c(98);
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
                  if (param2 != 0) {
                    if (1 != param2) {
                      if (param2 == 2) {
                        if (null != this.field_p) {
                          if ((this.field_t[param1] ^ -1) != 0) {
                            throw new RuntimeException();
                          } else {
                            if (!this.field_v.c(param0 + -170)) {
                              var4 = this.field_v.a(false, -1640279264, param1, (byte) 2, this.field_d);
                              break L3;
                            } else {
                              stackIn_35_0 = null;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      if (null != this.field_p) {
                        var4 = this.field_m.a(param1, -3, this.field_p);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    L4: {
                      if (this.field_p == null) {
                        break L4;
                      } else {
                        if ((this.field_t[param1] ^ -1) != 0) {
                          var4 = this.field_m.a(param0 ^ 125, this.field_p, param1);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (!this.field_v.a(false)) {
                      var4 = this.field_v.a(true, -1640279264, param1, (byte) 2, this.field_d);
                      break L3;
                    } else {
                      stackIn_15_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                this.field_n.a((long)param1, (byte) 69, (qb) (var4));
                break L2;
              } else {
                break L2;
              }
            }
            if (!((la) (var4)).field_n) {
              L5: {
                var18 = ((la) (var4)).b(true);
                var13 = var18;
                var5 = var13;
                if (param0 == 124) {
                  break L5;
                } else {
                  this.field_f = (byte[]) null;
                  break L5;
                }
              }
              if (!(var4 instanceof ab)) {
                try {
                  L6: {
                    L7: {
                      if (var5 == null) {
                        break L7;
                      } else {
                        if (-3 > (var18.length ^ -1)) {
                          fl.field_c.reset();
                          fl.field_c.update(var5, 0, -2 + var18.length);
                          var6_int = (int)fl.field_c.getValue();
                          if (this.field_l.field_i[param1] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L8: {
                              if (this.field_l.field_l == null) {
                                break L8;
                              } else {
                                if (this.field_l.field_l[param1] != null) {
                                  var30 = this.field_l.field_l[param1];
                                  var29 = ti.a(0, var5, -2 + var18.length, 0);
                                  var11 = 0;
                                  var9 = var11;
                                  L9: while (true) {
                                    if (64 <= var11) {
                                      break L8;
                                    } else {
                                      if ((var29[var11] ^ -1) != (var30[var11] ^ -1)) {
                                        throw new RuntimeException();
                                      } else {
                                        var11++;
                                        continue L9;
                                      }
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            this.field_v.field_b = 0;
                            this.field_v.field_l = 0;
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
                  L10: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    this.field_v.c((byte) 0);
                    ((la) (var4)).c(82);
                    if (((la) (var4)).field_o) {
                      if (!this.field_v.a(false)) {
                        var4 = this.field_v.a(true, -1640279264, param1, (byte) 2, this.field_d);
                        this.field_n.a((long)param1, (byte) 110, (qb) (var4));
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                  stackIn_117_0 = null;
                  return (la) ((Object) stackIn_117_0);
                }
                L11: {
                  var5[-2 + var18.length] = (byte)(this.field_l.field_n[param1] >>> -948312632);
                  var5[-1 + var18.length] = (byte)this.field_l.field_n[param1];
                  if (null == this.field_p) {
                    break L11;
                  } else {
                    this.field_m.a(this.field_p, var18, param1, param0 ^ -23043);
                    if ((this.field_t[param1] ^ -1) != -2) {
                      this.field_t[param1] = (byte) 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (!((la) (var4)).field_o) {
                    ((la) (var4)).c(83);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                stackIn_127_0 = var4;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                try {
                  L13: {
                    L14: {
                      if (var5 == null) {
                        break L14;
                      } else {
                        if (-3 <= (var18.length ^ -1)) {
                          break L14;
                        } else {
                          fl.field_c.reset();
                          fl.field_c.update(var5, 0, -2 + var18.length);
                          var6_int = (int)fl.field_c.getValue();
                          if (this.field_l.field_i[param1] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L15: {
                              if (null == this.field_l.field_l) {
                                break L15;
                              } else {
                                if (this.field_l.field_l[param1] != null) {
                                  var28 = this.field_l.field_l[param1];
                                  var27 = ti.a(0, var5, var18.length - 2, param0 + -124);
                                  var9 = 0;
                                  L16: while (true) {
                                    if (var9 >= 64) {
                                      break L15;
                                    } else {
                                      if ((var27[var9] ^ -1) != (var28[var9] ^ -1)) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        continue L16;
                                      }
                                    }
                                  }
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var7 = (var5[-1 + var18.length] & 255) + (65280 & var5[-2 + var18.length] << -67561912);
                            if ((65535 & this.field_l.field_n[param1]) != var7) {
                              throw new RuntimeException();
                            } else {
                              L17: {
                                if (-2 == (this.field_t[param1] ^ -1)) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (this.field_t[param1] == 0) {
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  this.field_t[param1] = (byte) 1;
                                  break L17;
                                }
                              }
                              L19: {
                                if (!((la) (var4)).field_o) {
                                  ((la) (var4)).c(param0 ^ 34);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              stackIn_77_0 = var4;
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L20: {
                    var6_ref = (Exception) (Object) decompiledCaughtException;
                    this.field_t[param1] = (byte)-1;
                    ((la) (var4)).c(param0 ^ 7);
                    if (((la) (var4)).field_o) {
                      if (!this.field_v.a(false)) {
                        var4 = this.field_v.a(true, -1640279264, param1, (byte) 2, this.field_d);
                        this.field_n.a((long)param1, (byte) 79, (qb) (var4));
                        break L20;
                      } else {
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                  stackIn_86_0 = null;
                  return (la) ((Object) stackIn_86_0);
                }
                decompiledRegionSelector0 = 4;
                break L0;
              }
            } else {
              stackIn_40_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) (var4), "uc.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (la) ((Object) stackIn_15_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (la) ((Object) stackIn_35_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (la) ((Object) stackIn_40_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (la) ((Object) stackIn_127_0);
              } else {
                return (la) ((Object) stackIn_77_0);
              }
            }
          }
        }
    }

    final d b(byte param0) {
        d stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_36_0 = null;
        d stackIn_41_0 = null;
        d stackIn_47_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Main.field_T;
        try {
          L0: {
            if (this.field_l == null) {
              L1: {
                if (this.field_u != null) {
                  break L1;
                } else {
                  if (!this.field_v.a(false)) {
                    this.field_u = (la) ((Object) this.field_v.a(true, -1640279264, this.field_d, (byte) 0, 255));
                    break L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (!this.field_u.field_n) {
                L2: {
                  var7 = this.field_u.b(true);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (!(this.field_u instanceof ab)) {
                    try {
                      L3: {
                        if (var5 != null) {
                          this.field_l = new d(var7, this.field_k, this.field_f);
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var3 = decompiledCaughtException;
                        this.field_v.c((byte) 0);
                        this.field_l = null;
                        if (this.field_v.a(false)) {
                          this.field_u = null;
                          break L4;
                        } else {
                          this.field_u = (la) ((Object) this.field_v.a(true, -1640279264, this.field_d, (byte) 0, 255));
                          break L4;
                        }
                      }
                      stackIn_36_0 = null;
                      return (d) ((Object) stackIn_36_0);
                    }
                    if (null == this.field_h) {
                      break L2;
                    } else {
                      this.field_m.a(this.field_h, var7, this.field_d, -23167);
                      break L2;
                    }
                  } else {
                    try {
                      L5: {
                        if (var5 != null) {
                          this.field_l = new d(var7, this.field_k, this.field_f);
                          if (this.field_l.field_k == this.field_q) {
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L6: {
                        var3 = decompiledCaughtException;
                        this.field_l = null;
                        if (this.field_v.a(false)) {
                          this.field_u = null;
                          break L6;
                        } else {
                          this.field_u = (la) ((Object) this.field_v.a(true, -1640279264, this.field_d, (byte) 0, 255));
                          break L6;
                        }
                      }
                      stackIn_25_0 = null;
                      return (d) ((Object) stackIn_25_0);
                    }
                    break L2;
                  }
                }
                if (param0 <= -35) {
                  L7: {
                    this.field_u = null;
                    if (this.field_p != null) {
                      this.field_t = new byte[this.field_l.field_b];
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  stackIn_47_0 = this.field_l;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_41_0 = (d) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = this.field_l;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "uc.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (d) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (d) ((Object) stackIn_11_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0;
              } else {
                return stackIn_47_0;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        la discarded$0 = null;
        la discarded$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 >= 89) {
                break L1;
              } else {
                this.c((byte) -55);
                break L1;
              }
            }
            if (null == this.field_j) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.b((byte) -71) == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var2 = this.field_e.a((byte) 74);
                L2: while (true) {
                  if (var2 == null) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      var3 = (int)var2.field_e;
                      if (-1 >= (var3 ^ -1)) {
                        if (var3 < this.field_l.field_b) {
                          if (this.field_l.field_q[var3] == 0) {
                            var2.c(109);
                            break L3;
                          } else {
                            L4: {
                              if (0 != this.field_t[var3]) {
                                break L4;
                              } else {
                                discarded$0 = this.a((byte) 124, var3, 1);
                                break L4;
                              }
                            }
                            L5: {
                              if (this.field_t[var3] != -1) {
                                break L5;
                              } else {
                                discarded$1 = this.a((byte) 124, var3, 2);
                                break L5;
                              }
                            }
                            if (-2 == (this.field_t[var3] ^ -1)) {
                              var2.c(85);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          var2.c(109);
                          break L3;
                        }
                      } else {
                        var2.c(109);
                        break L3;
                      }
                    }
                    var2 = this.field_e.b((byte) -99);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "uc.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void c(int param0) {
        la discarded$0 = null;
        la discarded$1 = null;
        la discarded$2 = null;
        la discarded$3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        la var2_ref = null;
        RuntimeException var2_ref2 = null;
        qb var3 = null;
        int var4 = 0;
        int var5 = 0;
        qb var6 = null;
        qb var7 = null;
        var2 = null;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              if (null != this.field_j) {
                if (this.b((byte) -56) == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (this.field_s) {
                    var2_int = 1;
                    var3 = this.field_j.a((byte) 74);
                    L2: while (true) {
                      if (var3 == null) {
                        L3: while (true) {
                          L4: {
                            if (this.field_l.field_q.length <= this.field_c) {
                              break L4;
                            } else {
                              if (this.field_l.field_q[this.field_c] == 0) {
                                this.field_c = this.field_c + 1;
                                continue L3;
                              } else {
                                if ((this.field_m.field_b ^ -1) <= -251) {
                                  var2_int = 0;
                                  break L4;
                                } else {
                                  L5: {
                                    if (0 == this.field_t[this.field_c]) {
                                      discarded$0 = this.a((byte) 124, this.field_c, 1);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (this.field_t[this.field_c] == 0) {
                                      var7 = new qb();
                                      var7.field_e = (long)this.field_c;
                                      var2_int = 0;
                                      this.field_j.a(var7, param0 + 30390);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  this.field_c = this.field_c + 1;
                                  continue L3;
                                }
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L1;
                          } else {
                            this.field_s = false;
                            this.field_c = 0;
                            break L1;
                          }
                        }
                      } else {
                        L7: {
                          var4 = (int)var3.field_e;
                          if (this.field_t[var4] != 0) {
                            break L7;
                          } else {
                            discarded$1 = this.a((byte) 124, var4, 1);
                            break L7;
                          }
                        }
                        L8: {
                          if (-1 == (this.field_t[var4] ^ -1)) {
                            var2_int = 0;
                            break L8;
                          } else {
                            var3.c(98);
                            break L8;
                          }
                        }
                        var3 = this.field_j.b((byte) -101);
                        continue L2;
                      }
                    }
                  } else {
                    if (this.field_w) {
                      var2_int = 1;
                      var3 = this.field_j.a((byte) 74);
                      L9: while (true) {
                        if (var3 == null) {
                          L10: while (true) {
                            L11: {
                              if (this.field_l.field_q.length <= this.field_c) {
                                break L11;
                              } else {
                                if ((this.field_l.field_q[this.field_c] ^ -1) == -1) {
                                  this.field_c = this.field_c + 1;
                                  continue L10;
                                } else {
                                  if (this.field_v.c(param0 + 3129)) {
                                    var2_int = 0;
                                    break L11;
                                  } else {
                                    L12: {
                                      if (this.field_t[this.field_c] != 1) {
                                        discarded$2 = this.a((byte) 124, this.field_c, 2);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if ((this.field_t[this.field_c] ^ -1) != -2) {
                                        var6 = new qb();
                                        var6.field_e = (long)this.field_c;
                                        this.field_j.a(var6, 27362);
                                        var2_int = 0;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    this.field_c = this.field_c + 1;
                                    continue L10;
                                  }
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_c = 0;
                              this.field_w = false;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          L14: {
                            var4 = (int)var3.field_e;
                            if (1 != this.field_t[var4]) {
                              discarded$3 = this.a((byte) 124, var4, 2);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (-2 != (this.field_t[var4] ^ -1)) {
                              var2_int = 0;
                              break L15;
                            } else {
                              var3.c(124);
                              break L15;
                            }
                          }
                          var3 = this.field_j.b((byte) -104);
                          continue L9;
                        }
                      }
                    } else {
                      this.field_j = null;
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L16: {
              if (!this.field_g) {
                break L16;
              } else {
                if ((id.a(36) ^ -1L) > (this.field_i ^ -1L)) {
                  break L16;
                } else {
                  var2_ref = (la) ((Object) this.field_n.b(-119));
                  L17: while (true) {
                    if (var2_ref == null) {
                      this.field_i = 1000L + id.a(109);
                      break L16;
                    } else {
                      L18: {
                        if (!var2_ref.field_n) {
                          if (var2_ref.field_l) {
                            if (!var2_ref.field_o) {
                              throw new RuntimeException();
                            } else {
                              var2_ref.c(86);
                              break L18;
                            }
                          } else {
                            var2_ref.field_l = true;
                            break L18;
                          }
                        } else {
                          break L18;
                        }
                      }
                      var2_ref = (la) ((Object) this.field_n.a(true));
                      continue L17;
                    }
                  }
                }
              }
            }
            L19: {
              if (param0 == -3028) {
                break L19;
              } else {
                this.field_v = (ch) null;
                break L19;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref2), "uc.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(pb param0, java.math.BigInteger param1, int param2, byte param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
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
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L3: {
                  L4: {
                    if (vc.field_b == null) {
                      break L4;
                    } else {
                      if (vc.field_b.field_g.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  vc.field_b = new pb(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    vc.field_b.field_i = 0;
                    vc.field_b.a(param2, param4, param6, (byte) -121);
                    vc.field_b.c(1442653008, var7_int);
                    vc.field_b.a(var13, 8);
                    if (null == oj.field_a) {
                      break L6;
                    } else {
                      if ((oj.field_a.field_g.length ^ -1) <= -101) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  oj.field_a = new pb(100);
                  break L5;
                }
                L7: {
                  if (param3 == 0) {
                    break L7;
                  } else {
                    uc.b(57);
                    break L7;
                  }
                }
                oj.field_a.field_i = 0;
                oj.field_a.b(-9469, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (var11 >= 4) {
                    oj.field_a.e(param2, 26040);
                    oj.field_a.a(param1, param5, -15792);
                    param0.a(oj.field_a.field_i, 0, oj.field_a.field_g, (byte) -84);
                    param0.a(vc.field_b.field_i, 0, vc.field_b.field_g, (byte) -113);
                    break L0;
                  } else {
                    oj.field_a.a(-246, var13[var11]);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = bl.field_a.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var7);

            stackIn_28_1 = new StringBuilder().append("uc.H(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {
            stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);

            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {
            stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);

            stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          L12: {
            stackIn_40_0 = (RuntimeException) ((Object) stackIn_37_0);

            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param6 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L12;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L12;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
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
            throw ma.a((Throwable) ((Object) runtimeException), "uc.I(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        la var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          L0: {
            var3 = (la) ((Object) this.field_n.a(false, (long)param0));
            if (var3 != null) {
              stackIn_4_0 = var3.a(false);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 10 / ((-27 - param1) / 58);
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref), "uc.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_p == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_w = true;
                if (null != this.field_j) {
                  break L1;
                } else {
                  this.field_j = new bk();
                  break L1;
                }
              }
              L2: {
                if (param0 == -25350) {
                  break L2;
                } else {
                  this.field_m = (gj) null;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "uc.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte[] a(int param0, boolean param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.a((byte) 124, param0, 0);
            if (var3 != null) {
              var4 = var3.b(param1);
              var3.c(109);
              stackIn_4_0 = (byte[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref), "uc.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    uc(int param0, hc param1, hc param2, ch param3, gj param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_n = new vb(16);
        this.field_c = 0;
        this.field_e = new bk();
        this.field_i = 0L;
        try {
          L0: {
            L1: {
              this.field_d = param0;
              this.field_p = param1;
              if (this.field_p == null) {
                this.field_s = false;
                break L1;
              } else {
                this.field_s = true;
                this.field_j = new bk();
                break L1;
              }
            }
            L2: {
              this.field_m = param4;
              this.field_k = param5;
              this.field_f = param6;
              this.field_h = param2;
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((uc) (this)).field_g = stackIn_7_1 != 0;
              this.field_q = param7;
              this.field_v = param3;
              if (this.field_h == null) {
                break L3;
              } else {
                this.field_u = (la) ((Object) this.field_m.a(1, this.field_h, this.field_d));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var10);

            stackIn_13_1 = new StringBuilder().append("uc.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);

            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);

            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);

            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);

            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = "Back";
        field_o = "TIME";
    }
}
