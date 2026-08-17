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
        Object stackIn_15_0 = null;
        Object stackIn_76_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_111_0 = null;
        Object stackIn_120_0 = null;
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
        wj var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = (wj) ((Object) this.field_p.a((long)param0, -1));
              var4 = var12;
              if (var12 == null) {
                break L1;
              } else {
                if (0 != param2) {
                  break L1;
                } else {
                  if (var12.field_n) {
                    break L1;
                  } else {
                    if (!var12.field_l) {
                      break L1;
                    } else {
                      var12.b(57);
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
                  if (-1 != (param2 ^ -1)) {
                    if (1 != param2) {
                      if (2 == param2) {
                        if (this.field_l != null) {
                          if (-1 != this.field_g[param0]) {
                            throw new RuntimeException();
                          } else {
                            if (!this.field_n.a(false)) {
                              var4 = this.field_n.a(15937, param0, false, this.field_t, (byte) 2);
                              break L3;
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
                    } else {
                      if (this.field_l == null) {
                        throw new RuntimeException();
                      } else {
                        var4 = this.field_j.a((byte) 123, this.field_l, param0);
                        break L3;
                      }
                    }
                  } else {
                    L4: {
                      if (null == this.field_l) {
                        break L4;
                      } else {
                        if (this.field_g[param0] == -1) {
                          break L4;
                        } else {
                          var4 = this.field_j.a(this.field_l, param0, -126);
                          break L3;
                        }
                      }
                    }
                    if (!this.field_n.d(-110)) {
                      var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                      break L3;
                    } else {
                      stackIn_15_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                this.field_p.a((long)param0, (byte) 127, (ca) (var4));
                break L2;
              } else {
                break L2;
              }
            }
            if (!((wj) (var4)).field_l) {
              L5: {
                if (param1 > 30) {
                  break L5;
                } else {
                  field_z = -77;
                  break L5;
                }
              }
              var18 = ((wj) (var4)).f(0);
              var13 = var18;
              var5 = var13;
              if (!(var4 instanceof uc)) {
                try {
                  L6: {
                    L7: {
                      if (var5 == null) {
                        break L7;
                      } else {
                        if (var18.length <= 2) {
                          break L7;
                        } else {
                          ee.field_f.reset();
                          ee.field_f.update(var5, 0, -2 + var18.length);
                          var6_int = (int)ee.field_f.getValue();
                          if (var6_int == this.field_i.field_r[param0]) {
                            L8: {
                              if (null == this.field_i.field_k) {
                                break L8;
                              } else {
                                if (null == this.field_i.field_k[param0]) {
                                  break L8;
                                } else {
                                  var29 = this.field_i.field_k[param0];
                                  var30 = ee.a(-1, var18.length + -2, 0, var18);
                                  var11 = 0;
                                  var9 = var11;
                                  L9: while (true) {
                                    if (64 <= var11) {
                                      break L8;
                                    } else {
                                      if (var29[var11] != var30[var11]) {
                                        throw new RuntimeException();
                                      } else {
                                        var11++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_n.field_b = 0;
                            this.field_n.field_n = 0;
                            break L6;
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
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
                  this.field_n.f(-105);
                  ((wj) (var4)).b(57);
                  if (((wj) (var4)).field_n) {
                    L10: {
                      if (!this.field_n.d(-88)) {
                        var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                        this.field_p.a((long)param0, (byte) -99, (ca) (var4));
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    stackIn_111_0 = null;
                    return (wj) ((Object) stackIn_111_0);
                  } else {
                    return null;
                  }
                }
                L11: {
                  var5[-2 + var18.length] = (byte)(this.field_i.field_i[param0] >>> -724231640);
                  var5[-1 + var18.length] = (byte)this.field_i.field_i[param0];
                  if (null == this.field_l) {
                    break L11;
                  } else {
                    this.field_j.a(param0, this.field_l, var18, 2);
                    if (1 == this.field_g[param0]) {
                      break L11;
                    } else {
                      this.field_g[param0] = (byte) 1;
                      break L11;
                    }
                  }
                }
                L12: {
                  if (!((wj) (var4)).field_n) {
                    ((wj) (var4)).b(57);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                stackIn_120_0 = var4;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                try {
                  L13: {
                    L14: {
                      if (var5 == null) {
                        break L14;
                      } else {
                        if (2 < var18.length) {
                          ee.field_f.reset();
                          ee.field_f.update(var5, 0, var18.length - 2);
                          var6_int = (int)ee.field_f.getValue();
                          if (var6_int == this.field_i.field_r[param0]) {
                            L15: {
                              if (this.field_i.field_k == null) {
                                break L15;
                              } else {
                                if (this.field_i.field_k[param0] != null) {
                                  var27 = this.field_i.field_k[param0];
                                  var28 = ee.a(-1, var18.length - 2, 0, var18);
                                  var9 = 0;
                                  L16: while (true) {
                                    if ((var9 ^ -1) <= -65) {
                                      break L15;
                                    } else {
                                      if ((var27[var9] ^ -1) == (var28[var9] ^ -1)) {
                                        var9++;
                                        continue L16;
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var7 = (255 & var5[var18.length + -1]) + (var5[-2 + var18.length] << 205404776 & 65280);
                            if ((this.field_i.field_i[param0] & 65535) != var7) {
                              throw new RuntimeException();
                            } else {
                              L17: {
                                if (1 == this.field_g[param0]) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (this.field_g[param0] != 0) {
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  this.field_g[param0] = (byte) 1;
                                  break L17;
                                }
                              }
                              L19: {
                                if (!((wj) (var4)).field_n) {
                                  ((wj) (var4)).b(57);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              stackIn_76_0 = var4;
                              break L13;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                  this.field_g[param0] = (byte)-1;
                  ((wj) (var4)).b(57);
                  if (((wj) (var4)).field_n) {
                    L20: {
                      if (!this.field_n.d(-9)) {
                        var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                        this.field_p.a((long)param0, (byte) -8, (ca) (var4));
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    stackIn_84_0 = null;
                    return (wj) ((Object) stackIn_84_0);
                  } else {
                    return null;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) (var4), "ak.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wj) ((Object) stackIn_15_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wj) ((Object) stackIn_120_0);
          } else {
            return (wj) ((Object) stackIn_76_0);
          }
        }
    }

    final hd a(int param0) {
        hd stackIn_5_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_47_0 = null;
        hd stackIn_55_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (null != this.field_i) {
              stackIn_5_0 = this.field_i;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_q == null) {
                  if (!this.field_n.d(-105)) {
                    this.field_q = (wj) ((Object) this.field_n.a(15937, this.field_t, true, 255, (byte) 0));
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_q.field_l) {
                L2: {
                  if (param0 == -23879) {
                    break L2;
                  } else {
                    ak.b(26);
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_q.f(0);
                  var6 = var7;
                  var5 = var6;
                  var2 = var5;
                  if (!(this.field_q instanceof uc)) {
                    try {
                      L4: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_i = new hd(var7, this.field_r, this.field_A);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = decompiledCaughtException;
                        this.field_n.f(-128);
                        this.field_i = null;
                        if (this.field_n.d(-20)) {
                          this.field_q = null;
                          break L5;
                        } else {
                          this.field_q = (wj) ((Object) this.field_n.a(param0 ^ -25352, this.field_t, true, 255, (byte) 0));
                          break L5;
                        }
                      }
                      stackIn_47_0 = null;
                      return (hd) ((Object) stackIn_47_0);
                    }
                    if (this.field_w == null) {
                      break L3;
                    } else {
                      this.field_j.a(this.field_t, this.field_w, var7, 2);
                      break L3;
                    }
                  } else {
                    try {
                      L6: {
                        if (var5 == null) {
                          throw new RuntimeException();
                        } else {
                          this.field_i = new hd(var7, this.field_r, this.field_A);
                          if (this.field_k != this.field_i.field_b) {
                            throw new RuntimeException();
                          } else {
                            break L6;
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        var3 = decompiledCaughtException;
                        this.field_i = null;
                        if (!this.field_n.d(-13)) {
                          this.field_q = (wj) ((Object) this.field_n.a(15937, this.field_t, true, 255, (byte) 0));
                          break L7;
                        } else {
                          this.field_q = null;
                          break L7;
                        }
                      }
                      stackIn_35_0 = null;
                      return (hd) ((Object) stackIn_35_0);
                    }
                    break L3;
                  }
                }
                L8: {
                  this.field_q = null;
                  if (null != this.field_l) {
                    this.field_g = new byte[this.field_i.field_s];
                    break L8;
                  } else {
                    break L8;
                  }
                }
                stackIn_55_0 = this.field_i;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "ak.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_55_0;
        }
    }

    final void e(byte param0) {
        wj discarded$0 = null;
        wj discarded$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ca var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (this.field_m != null) {
              if (null == this.a(-23879)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var2 = this.field_x.b((byte) -16);
                L1: while (true) {
                  if (var2 == null) {
                    L2: {
                      if (param0 == 57) {
                        break L2;
                      } else {
                        ak.b(-86);
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      var3 = (int)var2.field_d;
                      if (-1 >= (var3 ^ -1)) {
                        if (this.field_i.field_s > var3) {
                          if (0 == this.field_i.field_d[var3]) {
                            var2.b(57);
                            break L3;
                          } else {
                            L4: {
                              if (this.field_g[var3] != 0) {
                                break L4;
                              } else {
                                discarded$0 = this.a(var3, (byte) 122, 1);
                                break L4;
                              }
                            }
                            L5: {
                              if (this.field_g[var3] != -1) {
                                break L5;
                              } else {
                                discarded$1 = this.a(var3, (byte) 76, 2);
                                break L5;
                              }
                            }
                            if (-2 != (this.field_g[var3] ^ -1)) {
                              break L3;
                            } else {
                              var2.b(57);
                              break L3;
                            }
                          }
                        } else {
                          var2.b(57);
                          break L3;
                        }
                      } else {
                        var2.b(57);
                        break L3;
                      }
                    }
                    var2 = this.field_x.d(853);
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "ak.J(" + param0 + ')');
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

    final void d(byte param0) {
        if (!(this.field_l != null)) {
            return;
        }
        try {
            this.field_h = true;
            if (null == this.field_m) {
                this.field_m = new im();
            }
            int var2_int = 123 % ((param0 - -14) / 40);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ak.I(" + param0 + ')');
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
            throw dd.a((Throwable) ((Object) runtimeException), "ak.L(" + param0 + ')');
        }
    }

    final int b(int param0, int param1) {
        wj var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = (wj) ((Object) this.field_p.a((long)param0, -1));
            if (var3 != null) {
              stackIn_4_0 = var3.e(param1 ^ -7334);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -7362) {
                  break L1;
                } else {
                  this.e((byte) -116);
                  break L1;
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3_ref), "ak.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    final byte[] a(int param0, int param1) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.a(param1, (byte) 54, 0);
            if (var3 != null) {
              L1: {
                if (param0 == -15861) {
                  break L1;
                } else {
                  this.field_m = (im) null;
                  break L1;
                }
              }
              var4 = var3.f(0);
              var3.b(param0 + 15918);
              stackIn_7_0 = (byte[]) (var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3_ref), "ak.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0) {
        wj discarded$0 = null;
        wj discarded$1 = null;
        wj discarded$2 = null;
        wj discarded$3 = null;
        ge stackIn_27_0 = null;
        ge stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        wj var2_ref = null;
        RuntimeException var2_ref2 = null;
        ca var3 = null;
        int var4 = 0;
        int var5 = 0;
        ca var6 = null;
        ca var7 = null;
        var2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (null != this.field_m) {
                    if (this.a(-23879) != null) {
                      if (this.field_s) {
                        var2_int = 1;
                        var3 = this.field_m.b((byte) -12);
                        L4: while (true) {
                          if (var3 == null) {
                            L5: while (true) {
                              L6: {
                                if (this.field_i.field_d.length <= this.field_o) {
                                  break L6;
                                } else {
                                  if (this.field_i.field_d[this.field_o] != 0) {
                                    if (250 <= this.field_j.field_b) {
                                      var2_int = 0;
                                      break L6;
                                    } else {
                                      L7: {
                                        if (-1 == (this.field_g[this.field_o] ^ -1)) {
                                          discarded$0 = this.a(this.field_o, (byte) 43, 1);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      L8: {
                                        if (this.field_g[this.field_o] != 0) {
                                          break L8;
                                        } else {
                                          var7 = new ca();
                                          var7.field_d = (long)this.field_o;
                                          this.field_m.a(-121, var7);
                                          var2_int = 0;
                                          break L8;
                                        }
                                      }
                                      this.field_o = this.field_o + 1;
                                      continue L5;
                                    }
                                  } else {
                                    this.field_o = this.field_o + 1;
                                    continue L5;
                                  }
                                }
                              }
                              if (var2_int == 0) {
                                break L3;
                              } else {
                                this.field_s = false;
                                this.field_o = 0;
                                break L3;
                              }
                            }
                          } else {
                            L9: {
                              var4 = (int)var3.field_d;
                              if ((this.field_g[var4] ^ -1) != -1) {
                                break L9;
                              } else {
                                discarded$1 = this.a(var4, (byte) 55, 1);
                                break L9;
                              }
                            }
                            L10: {
                              if (-1 != (this.field_g[var4] ^ -1)) {
                                var3.b(57);
                                break L10;
                              } else {
                                var2_int = 0;
                                break L10;
                              }
                            }
                            var3 = this.field_m.d(853);
                            continue L4;
                          }
                        }
                      } else {
                        if (this.field_h) {
                          var2_int = 1;
                          var3 = this.field_m.b((byte) -17);
                          L11: while (true) {
                            if (var3 == null) {
                              L12: while (true) {
                                L13: {
                                  if (this.field_o >= this.field_i.field_d.length) {
                                    break L13;
                                  } else {
                                    if (0 != this.field_i.field_d[this.field_o]) {
                                      L14: {
                                        stackIn_27_0 = this.field_n;

                                        if (param0) {
                                          stackIn_28_0 = (ge) ((Object) stackIn_27_0);
                                          stackIn_28_1 = 0;
                                          break L14;
                                        } else {
                                          stackIn_28_0 = (ge) ((Object) stackIn_27_0);
                                          stackIn_28_1 = 1;
                                          break L14;
                                        }
                                      }
                                      if (((ge) (Object) stackIn_28_0).a(stackIn_28_1 != 0)) {
                                        var2_int = 0;
                                        break L13;
                                      } else {
                                        L15: {
                                          if (1 == this.field_g[this.field_o]) {
                                            break L15;
                                          } else {
                                            discarded$2 = this.a(this.field_o, (byte) 63, 2);
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if ((this.field_g[this.field_o] ^ -1) != -2) {
                                            var6 = new ca();
                                            var6.field_d = (long)this.field_o;
                                            this.field_m.a(-90, var6);
                                            var2_int = 0;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        this.field_o = this.field_o + 1;
                                        continue L12;
                                      }
                                    } else {
                                      this.field_o = this.field_o + 1;
                                      continue L12;
                                    }
                                  }
                                }
                                if (var2_int != 0) {
                                  this.field_h = false;
                                  this.field_o = 0;
                                  break L3;
                                } else {
                                  if (param0) {
                                    if (!this.field_u) {
                                      break L1;
                                    } else {
                                      if ((ji.b(-40) ^ -1L) > (this.field_v ^ -1L)) {
                                        break L1;
                                      } else {
                                        var2_ref = (wj) ((Object) this.field_p.a((byte) 121));
                                        L17: while (true) {
                                          if (var2_ref == null) {
                                            break L2;
                                          } else {
                                            L18: {
                                              if (var2_ref.field_l) {
                                                break L18;
                                              } else {
                                                if (var2_ref.field_p) {
                                                  if (var2_ref.field_n) {
                                                    var2_ref.b(57);
                                                    break L18;
                                                  } else {
                                                    throw new RuntimeException();
                                                  }
                                                } else {
                                                  var2_ref.field_p = true;
                                                  break L18;
                                                }
                                              }
                                            }
                                            var2_ref = (wj) ((Object) this.field_p.c((byte) -112));
                                            continue L17;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              }
                            } else {
                              L19: {
                                var4 = (int)var3.field_d;
                                if (1 != this.field_g[var4]) {
                                  discarded$3 = this.a(var4, (byte) 107, 2);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (-2 == (this.field_g[var4] ^ -1)) {
                                  var3.b(57);
                                  break L20;
                                } else {
                                  var2_int = 0;
                                  break L20;
                                }
                              }
                              var3 = this.field_m.d(853);
                              continue L11;
                            }
                          }
                        } else {
                          this.field_m = null;
                          break L3;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L3;
                  }
                }
                if (param0) {
                  if (!this.field_u) {
                    break L1;
                  } else {
                    if ((ji.b(-40) ^ -1L) > (this.field_v ^ -1L)) {
                      break L1;
                    } else {
                      var2_ref = (wj) ((Object) this.field_p.a((byte) 121));
                      L21: while (true) {
                        if (var2_ref == null) {
                          break L2;
                        } else {
                          L22: {
                            if (var2_ref.field_l) {
                              break L22;
                            } else {
                              if (var2_ref.field_p) {
                                if (var2_ref.field_n) {
                                  var2_ref.b(57);
                                  break L22;
                                } else {
                                  throw new RuntimeException();
                                }
                              } else {
                                var2_ref.field_p = true;
                                break L22;
                              }
                            }
                          }
                          var2_ref = (wj) ((Object) this.field_p.c((byte) -112));
                          continue L21;
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              this.field_v = 1000L + ji.b(-80);
              break L1;
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref2), "ak.G(" + param0 + ')');
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

    public static void c(byte param0) {
        try {
            field_y = null;
            int var1_int = -101 % ((-38 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ak.H(" + param0 + ')');
        }
    }

    ak(int param0, eh param1, eh param2, ge param3, vl param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_p = new mh(16);
        this.field_o = 0;
        this.field_x = new im();
        this.field_v = 0L;
        try {
          L0: {
            L1: {
              this.field_l = param1;
              this.field_t = param0;
              if (null != this.field_l) {
                this.field_s = true;
                this.field_m = new im();
                break L1;
              } else {
                this.field_s = false;
                break L1;
              }
            }
            L2: {
              this.field_r = param5;
              this.field_j = param4;
              this.field_w = param2;
              this.field_k = param7;
              this.field_n = param3;
              this.field_A = param6;
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
              ((ak) (this)).field_u = stackIn_7_1 != 0;
              if (null == this.field_w) {
                break L3;
              } else {
                this.field_q = (wj) ((Object) this.field_j.a(this.field_w, this.field_t, -128));
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

            stackIn_13_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
