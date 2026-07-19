/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ob {
    private byte[] field_f;
    private int field_p;
    static String[] field_r;
    private byte[] field_g;
    private int field_l;
    private f field_m;
    private int field_s;
    private sb field_t;
    private jg field_o;
    private oa field_y;
    private ib field_q;
    private kk field_k;
    private jg field_x;
    private boolean field_v;
    private cn field_e;
    private cn field_u;
    private boolean field_j;
    private int field_z;
    static int field_n;
    private long field_h;
    private boolean field_i;
    static te[] field_w;

    final void c(int param0) {
        byte[] discarded$5 = null;
        oa discarded$6 = null;
        oa discarded$7 = null;
        oa discarded$8 = null;
        oa discarded$9 = null;
        oa var2 = null;
        int var2_int = 0;
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        hg var6 = null;
        hg var7 = null;
        L0: {
          var5 = EscapeVector.field_A;
          if (param0 < -21) {
            break L0;
          } else {
            discarded$5 = this.a((byte) -107, 43);
            break L0;
          }
        }
        L1: {
          if (null == this.field_u) {
            break L1;
          } else {
            if (null != this.a(29192)) {
              if (!this.field_v) {
                if (this.field_j) {
                  var2_int = 1;
                  var3 = this.field_u.a(false);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (this.field_z >= this.field_m.field_i.length) {
                            break L4;
                          } else {
                            if (this.field_m.field_i[this.field_z] != 0) {
                              if (this.field_t.b(20)) {
                                var2_int = 0;
                                break L4;
                              } else {
                                L5: {
                                  if ((this.field_f[this.field_z] ^ -1) == -2) {
                                    break L5;
                                  } else {
                                    discarded$6 = this.a(this.field_z, 2, 23874);
                                    break L5;
                                  }
                                }
                                L6: {
                                  if (1 != this.field_f[this.field_z]) {
                                    var7 = new hg();
                                    var7.field_e = (long)this.field_z;
                                    var2_int = 0;
                                    this.field_u.a(-12328, var7);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                this.field_z = this.field_z + 1;
                                continue L3;
                              }
                            } else {
                              this.field_z = this.field_z + 1;
                              continue L3;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          this.field_j = false;
                          this.field_z = 0;
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_e;
                        if ((this.field_f[var4] ^ -1) == -2) {
                          break L7;
                        } else {
                          discarded$7 = this.a(var4, 2, 23874);
                          break L7;
                        }
                      }
                      L8: {
                        if (-2 != (this.field_f[var4] ^ -1)) {
                          var2_int = 0;
                          break L8;
                        } else {
                          var3.c((byte) -24);
                          break L8;
                        }
                      }
                      var3 = this.field_u.b((byte) 70);
                      continue L2;
                    }
                  }
                } else {
                  this.field_u = null;
                  break L1;
                }
              } else {
                var2_int = 1;
                var3 = this.field_u.a(false);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (this.field_m.field_i.length <= this.field_z) {
                          break L11;
                        } else {
                          L12: {
                            if (this.field_m.field_i[this.field_z] == 0) {
                              break L12;
                            } else {
                              if (250 <= this.field_k.field_f) {
                                var2_int = 0;
                                break L11;
                              } else {
                                L13: {
                                  if (0 != this.field_f[this.field_z]) {
                                    break L13;
                                  } else {
                                    discarded$8 = this.a(this.field_z, 1, 23874);
                                    break L13;
                                  }
                                }
                                if (-1 != (this.field_f[this.field_z] ^ -1)) {
                                  break L12;
                                } else {
                                  var6 = new hg();
                                  var6.field_e = (long)this.field_z;
                                  this.field_u.a(-12328, var6);
                                  var2_int = 0;
                                  break L12;
                                }
                              }
                            }
                          }
                          this.field_z = this.field_z + 1;
                          continue L10;
                        }
                      }
                      if (var2_int == 0) {
                        break L1;
                      } else {
                        this.field_z = 0;
                        this.field_v = false;
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_e;
                      if (this.field_f[var4] == 0) {
                        discarded$9 = this.a(var4, 1, 23874);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (this.field_f[var4] != 0) {
                        var3.c((byte) -53);
                        break L15;
                      } else {
                        var2_int = 0;
                        break L15;
                      }
                    }
                    var3 = this.field_u.b((byte) 70);
                    continue L9;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
        if (this.field_i) {
          if (td.b(128) >= this.field_h) {
            var2 = (oa) ((Object) this.field_q.a(false));
            L16: while (true) {
              if (var2 != null) {
                L17: {
                  if (!var2.field_u) {
                    if (var2.field_s) {
                      if (!var2.field_r) {
                        throw new RuntimeException();
                      } else {
                        var2.c((byte) -117);
                        break L17;
                      }
                    } else {
                      var2.field_s = true;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
                var2 = (oa) ((Object) this.field_q.a((byte) 62));
                continue L16;
              } else {
                this.field_h = td.b(128) + 1000L;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final byte[] a(byte param0, int param1) {
        oa var3 = null;
        byte[] var4 = null;
        var3 = this.a(param1, 0, 23874);
        if (var3 != null) {
          if (param0 > -9) {
            return (byte[]) null;
          } else {
            var4 = var3.a(true);
            var3.c((byte) -81);
            return var4;
          }
        } else {
          return null;
        }
    }

    final int a(int param0, int param1) {
        oa var3 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_q = (ib) null;
            break L0;
          }
        }
        var3 = (oa) ((Object) this.field_q.a((long)param1, -1));
        if (var3 == null) {
          return 0;
        } else {
          return var3.g(100);
        }
    }

    final void b(byte param0) {
        if (!(null != this.field_x)) {
            return;
        }
        int var2 = -123 / ((53 - param0) / 42);
        this.field_j = true;
        if (null == this.field_u) {
            this.field_u = new cn();
        }
    }

    final static void b(int param0) {
        if (!bj.e((byte) 113)) {
            return;
        }
        if (!(he.field_u != null)) {
            return;
        }
        if (param0 != 2) {
            return;
        }
        if (!(he.field_u.b(0))) {
            return;
        }
        if (!he.field_u.a((byte) -119)) {
            return;
        }
        if (!(dd.field_h != null)) {
            dd.field_h = ci.a(5, 0, -1, 2);
            return;
        }
        if (!(dd.field_h.field_j != null)) {
            return;
        }
        ld.field_h = pn.a(dd.field_h.field_j, he.field_u, ld.field_h, bj.field_B, (byte) 112);
        if (se.field_b == null) {
            se.field_b = ve.a(1, he.field_u, fi.field_j, dd.field_h.field_j);
        }
        if (null != se.field_b) {
            dd.field_h = null;
            he.field_u = null;
        }
    }

    final f a(int param0) {
        int discarded$2 = 0;
        cm discarded$3 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        if (this.field_m == null) {
          L0: {
            if (null == this.field_y) {
              if (!this.field_t.c(20)) {
                this.field_y = (oa) ((Object) this.field_t.a(255, true, (byte) 0, this.field_s, (byte) 0));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_y.field_u) {
            L1: {
              var7 = this.field_y.a(true);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (param0 == 29192) {
                break L1;
              } else {
                discarded$2 = hk.a((byte) 93, -10, 70);
                break L1;
              }
            }
            L2: {
              if (this.field_y instanceof cm) {
                try {
                  L3: {
                    if (var5 != null) {
                      this.field_m = new f(var7, this.field_p, this.field_g);
                      if (this.field_m.field_n == this.field_l) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_m = null;
                    if (!this.field_t.c(20)) {
                      this.field_y = (oa) ((Object) this.field_t.a(255, true, (byte) 0, this.field_s, (byte) 0));
                      break L4;
                    } else {
                      this.field_y = null;
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      this.field_m = new f(var7, this.field_p, this.field_g);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_t.b((byte) -125);
                    this.field_m = null;
                    if (!this.field_t.c(20)) {
                      this.field_y = (oa) ((Object) this.field_t.a(255, true, (byte) 0, this.field_s, (byte) 0));
                      break L6;
                    } else {
                      this.field_y = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (this.field_o != null) {
                  discarded$3 = this.field_k.a(var7, this.field_s, param0 ^ 29194, this.field_o);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              this.field_y = null;
              if (null == this.field_x) {
                break L7;
              } else {
                this.field_f = new byte[this.field_m.field_k];
                break L7;
              }
            }
            return this.field_m;
          } else {
            return null;
          }
        } else {
          return this.field_m;
        }
    }

    private final oa a(int param0, int param1, int param2) {
        f discarded$2 = null;
        cm discarded$3 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        oa var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_61_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_60_0 = null;
        L0: {
          var10 = EscapeVector.field_A;
          var12 = (oa) ((Object) this.field_q.a((long)param0, -1));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (var12.field_r) {
                break L0;
              } else {
                if (!var12.field_u) {
                  break L0;
                } else {
                  var12.c((byte) -16);
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
              if (param1 != 0) {
                if (param1 != 1) {
                  if ((param1 ^ -1) == -3) {
                    if (this.field_x != null) {
                      if (0 != (this.field_f[param0] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_t.b(20)) {
                          var4 = this.field_t.a(this.field_s, false, (byte) 0, param0, (byte) 2);
                          break L2;
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
                  if (this.field_x == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_k.a((byte) -127, this.field_x, param0);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (this.field_x == null) {
                    break L3;
                  } else {
                    if (-1 != this.field_f[param0]) {
                      var4 = this.field_k.a(this.field_x, param2 ^ 23908, param0);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_t.c(20)) {
                  var4 = this.field_t.a(this.field_s, true, (byte) 0, param0, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_q.a((hg) (var4), 10901, (long)param0);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((oa) (var4)).field_u) {
          L4: {
            if (param2 == 23874) {
              break L4;
            } else {
              discarded$2 = this.a(1);
              break L4;
            }
          }
          var18 = ((oa) (var4)).a(true);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof cm)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (-3 <= (var18.length ^ -1)) {
                      break L6;
                    } else {
                      qf.field_m.reset();
                      qf.field_m.update(var5, 0, var18.length - 2);
                      var6_int = (int)qf.field_m.getValue();
                      if (var6_int != this.field_m.field_l[param0]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (this.field_m.field_h == null) {
                            break L7;
                          } else {
                            if (null != this.field_m.field_h[param0]) {
                              var30 = this.field_m.field_h[param0];
                              var29 = vn.a(var5, 0, -2 + var18.length, 0);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (-65 >= (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  if (var29[var11] != var30[var11]) {
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
                        this.field_t.field_g = 0;
                        this.field_t.field_d = 0;
                        break L5;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_t.b((byte) -110);
              ((oa) (var4)).c((byte) -86);
              if (((oa) (var4)).field_r) {
                if (this.field_t.c(param2 + -23854)) {
                  return null;
                } else {
                  var4 = this.field_t.a(this.field_s, true, (byte) 0, param0, (byte) 2);
                  this.field_q.a((hg) (var4), 10901, (long)param0);
                  return null;
                }
              } else {
                return null;
              }
            }
            L9: {
              var5[var18.length - 2] = (byte)(this.field_m.field_q[param0] >>> -1549180536);
              var5[var18.length + -1] = (byte)this.field_m.field_q[param0];
              if (null != this.field_x) {
                discarded$3 = this.field_k.a(var18, param0, param2 ^ 23872, this.field_x);
                if ((this.field_f[param0] ^ -1) != -2) {
                  this.field_f[param0] = (byte) 1;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((oa) (var4)).field_r) {
                break L10;
              } else {
                ((oa) (var4)).c((byte) -86);
                break L10;
              }
            }
            return (oa) (var4);
          } else {
            try {
              L11: {
                L12: {
                  if (var5 == null) {
                    break L12;
                  } else {
                    if (2 < var18.length) {
                      qf.field_m.reset();
                      qf.field_m.update(var5, 0, var18.length - 2);
                      var6_int = (int)qf.field_m.getValue();
                      if (var6_int == this.field_m.field_l[param0]) {
                        L13: {
                          if (this.field_m.field_h == null) {
                            break L13;
                          } else {
                            if (this.field_m.field_h[param0] == null) {
                              break L13;
                            } else {
                              var27 = this.field_m.field_h[param0];
                              var28 = vn.a(var5, 0, var18.length - 2, param2 + -23874);
                              var9 = 0;
                              L14: while (true) {
                                if (-65 >= (var9 ^ -1)) {
                                  break L13;
                                } else {
                                  if (var27[var9] == var28[var9]) {
                                    var9++;
                                    continue L14;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            }
                          }
                        }
                        var7 = (var5[-2 + var18.length] << 2066150792 & 65280) - -(255 & var5[-1 + var18.length]);
                        if (var7 != (this.field_m.field_q[param0] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            if (-2 != (this.field_f[param0] ^ -1)) {
                              L16: {
                                if (-1 != (this.field_f[param0] ^ -1)) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              this.field_f[param0] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (!((oa) (var4)).field_r) {
                              ((oa) (var4)).c((byte) -93);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_60_0 = var4;
                          stackIn_61_0 = stackOut_60_0;
                          break L11;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L18: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_f[param0] = (byte)-1;
                ((oa) (var4)).c((byte) -92);
                if (((oa) (var4)).field_r) {
                  if (!this.field_t.c(20)) {
                    var4 = this.field_t.a(this.field_s, true, (byte) 0, param0, (byte) 2);
                    this.field_q.a((hg) (var4), 10901, (long)param0);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              return null;
            }
            return (oa) ((Object) stackIn_61_0);
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        byte[] discarded$0 = null;
        int var3 = 0;
        oa discarded$1 = null;
        oa discarded$2 = null;
        int var4 = EscapeVector.field_A;
        if (!(null != this.field_u)) {
            return;
        }
        if (!(this.a(29192) != null)) {
            return;
        }
        if (param0 != -1) {
            discarded$0 = this.a((byte) -27, -44);
        }
        hg var2 = this.field_e.a(false);
        while (var2 != null) {
            var3 = (int)var2.field_e;
            if (-1 < (var3 ^ -1)) {
                var2.c((byte) -57);
            } else {
                if (var3 >= this.field_m.field_k) {
                    var2.c((byte) -57);
                } else {
                    if (-1 == (this.field_m.field_i[var3] ^ -1)) {
                        var2.c((byte) -57);
                    } else {
                        if (this.field_f[var3] == 0) {
                            discarded$1 = this.a(var3, 1, param0 ^ -23875);
                        }
                        if (!(0 != (this.field_f[var3] ^ -1))) {
                            discarded$2 = this.a(var3, 2, 23874);
                        }
                        if (-2 == (this.field_f[var3] ^ -1)) {
                            var2.c((byte) -118);
                        }
                    }
                }
            }
            var2 = this.field_e.b((byte) 70);
        }
    }

    final static ed a(mf param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ed stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                hk.c((byte) 80);
                break L1;
              }
            }
            if (uc.a(param0, 116, param3, param2)) {
              stackOut_5_0 = je.b(100);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("hk.H(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ed) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 != 8) {
            field_r = (String[]) null;
        }
        field_w = null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = hi.field_o;
              if (param0 == 122) {
                break L1;
              } else {
                hk.b(91);
                break L1;
              }
            }
            L2: while (true) {
              if (s.field_I.length <= var3_int) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = jj.field_a[var3_int];
                  if (0 <= var5) {
                    var6 = ee.a(98, s.field_I[var3_int], true);
                    var4 = var4 + hn.field_s;
                    var7 = -(var6 >> 2455489) + rn.field_e;
                    if (!fl.a(param1, (en.field_k << -568138623) + ok.field_a, param0 ^ -123, var4, -fe.field_k + var7, (fe.field_k << 54019649) + var6, param2)) {
                      var4 = var4 + (hn.field_s + (en.field_k << -1476189695) + ok.field_a);
                      break L3;
                    } else {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var4 = var4 + je.field_b;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "hk.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_12_0;
        }
    }

    hk(int param0, jg param1, jg param2, sb param3, kk param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_q = new ib(16);
        this.field_z = 0;
        this.field_e = new cn();
        this.field_h = 0L;
        try {
          L0: {
            L1: {
              this.field_s = param0;
              this.field_x = param1;
              if (null == this.field_x) {
                this.field_v = false;
                break L1;
              } else {
                this.field_v = true;
                this.field_u = new cn();
                break L1;
              }
            }
            L2: {
              this.field_l = param7;
              this.field_o = param2;
              this.field_k = param4;
              this.field_t = param3;
              this.field_g = param6;
              this.field_p = param5;
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
              ((hk) (this)).field_i = stackIn_7_1 != 0;
              if (this.field_o == null) {
                break L3;
              } else {
                this.field_y = (oa) ((Object) this.field_k.a(this.field_o, 106, this.field_s));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("hk.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = new String[]{"Belter Award", "Moon Runner", "Moon Raker", "Hero of Earth", "Star Pilot", "Ace Pilot", "Fuel Filler", "Tough Destroyer", "Speed Nitwit", "Speed Freak", "Speed Demon", "Power Pilot", "Spirit of Vengeance", "Force King", "Seeker Shaker", "Flak Dancer", "Seeker Slingshot", "G Force", "Belter Award (Normal)", "Moon Runner (Normal)", "Moon Raker (Normal)", "Hero of Earth (Normal)", "High Octane", "Ore Crusher", "Cold Fusion", "Saviour of Earth", "Heroic Pilot", "Ultimate Pilot", "Total Annihilation", "Virtual Reality", "Bouncing Around", "Free Fall"};
        ld.a(50, (byte) -6);
    }
}
