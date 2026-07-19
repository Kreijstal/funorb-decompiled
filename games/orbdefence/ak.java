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
        uc discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
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
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_59_0 = null;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          var12 = (wj) ((Object) this.field_p.a((long)param0, -1));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (0 != param2) {
              break L0;
            } else {
              if (var12.field_n) {
                break L0;
              } else {
                if (!var12.field_l) {
                  break L0;
                } else {
                  var12.b(57);
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
              if (-1 != (param2 ^ -1)) {
                if (1 != param2) {
                  if (2 == param2) {
                    if (this.field_l != null) {
                      if (-1 != this.field_g[param0]) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_n.a(false)) {
                          var4 = this.field_n.a(15937, param0, false, this.field_t, (byte) 2);
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
                  if (this.field_l == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_j.a((byte) 123, this.field_l, param0);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (null == this.field_l) {
                    break L3;
                  } else {
                    if (this.field_g[param0] == -1) {
                      break L3;
                    } else {
                      var4 = this.field_j.a(this.field_l, param0, -126);
                      break L2;
                    }
                  }
                }
                if (!this.field_n.d(-110)) {
                  var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_p.a((long)param0, (byte) 127, (ca) (var4));
            break L1;
          } else {
            break L1;
          }
        }
        if (!((wj) (var4)).field_l) {
          L4: {
            if (param1 > 30) {
              break L4;
            } else {
              field_z = -77;
              break L4;
            }
          }
          var18 = ((wj) (var4)).f(0);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof uc)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var18.length <= 2) {
                      break L6;
                    } else {
                      ee.field_f.reset();
                      ee.field_f.update(var5, 0, -2 + var18.length);
                      var6_int = (int)ee.field_f.getValue();
                      if (var6_int == this.field_i.field_r[param0]) {
                        L7: {
                          if (null == this.field_i.field_k) {
                            break L7;
                          } else {
                            if (null == this.field_i.field_k[param0]) {
                              break L7;
                            } else {
                              var29 = this.field_i.field_k[param0];
                              var30 = ee.a(-1, var18.length + -2, 0, var18);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (64 <= var11) {
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
                            }
                          }
                        }
                        this.field_n.field_b = 0;
                        this.field_n.field_n = 0;
                        break L5;
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
              this.field_n.f(-105);
              ((wj) (var4)).b(57);
              if (((wj) (var4)).field_n) {
                L9: {
                  if (!this.field_n.d(-88)) {
                    var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                    this.field_p.a((long)param0, (byte) -99, (ca) (var4));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L10: {
              var5[-2 + var18.length] = (byte)(this.field_i.field_i[param0] >>> -724231640);
              var5[-1 + var18.length] = (byte)this.field_i.field_i[param0];
              if (null == this.field_l) {
                break L10;
              } else {
                discarded$1 = this.field_j.a(param0, this.field_l, var18, 2);
                if (1 == this.field_g[param0]) {
                  break L10;
                } else {
                  this.field_g[param0] = (byte) 1;
                  break L10;
                }
              }
            }
            L11: {
              if (!((wj) (var4)).field_n) {
                ((wj) (var4)).b(57);
                break L11;
              } else {
                break L11;
              }
            }
            return (wj) (var4);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var18.length) {
                      ee.field_f.reset();
                      ee.field_f.update(var5, 0, var18.length - 2);
                      var6_int = (int)ee.field_f.getValue();
                      if (var6_int == this.field_i.field_r[param0]) {
                        L14: {
                          if (this.field_i.field_k == null) {
                            break L14;
                          } else {
                            if (this.field_i.field_k[param0] != null) {
                              var27 = this.field_i.field_k[param0];
                              var28 = ee.a(-1, var18.length - 2, 0, var18);
                              var9 = 0;
                              L15: while (true) {
                                if ((var9 ^ -1) <= -65) {
                                  break L14;
                                } else {
                                  if (var27[var9] == var28[var9]) {
                                    var9++;
                                    continue L15;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        var7 = (255 & var5[var18.length + -1]) + (var5[-2 + var18.length] << 205404776 & 65280);
                        if ((this.field_i.field_i[param0] & 65535) != var7) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            if (1 == this.field_g[param0]) {
                              break L16;
                            } else {
                              L17: {
                                if (this.field_g[param0] != 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_g[param0] = (byte) 1;
                              break L16;
                            }
                          }
                          L18: {
                            if (!((wj) (var4)).field_n) {
                              ((wj) (var4)).b(57);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L12;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              this.field_g[param0] = (byte)-1;
              ((wj) (var4)).b(57);
              if (((wj) (var4)).field_n) {
                L19: {
                  if (!this.field_n.d(-9)) {
                    var4 = this.field_n.a(15937, param0, true, this.field_t, (byte) 2);
                    this.field_p.a((long)param0, (byte) -8, (ca) (var4));
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (wj) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final hd a(int param0) {
        uc discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (null != this.field_i) {
          return this.field_i;
        } else {
          L0: {
            if (this.field_q == null) {
              if (!this.field_n.d(-105)) {
                this.field_q = (wj) ((Object) this.field_n.a(15937, this.field_t, true, 255, (byte) 0));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_q.field_l) {
            L1: {
              if (param0 == -23879) {
                break L1;
              } else {
                ak.b(26);
                break L1;
              }
            }
            L2: {
              var7 = this.field_q.f(0);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_q instanceof uc)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_i = new hd(var7, this.field_r, this.field_A);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_n.f(-128);
                    this.field_i = null;
                    if (this.field_n.d(-20)) {
                      this.field_q = null;
                      break L4;
                    } else {
                      this.field_q = (wj) ((Object) this.field_n.a(param0 ^ -25352, this.field_t, true, 255, (byte) 0));
                      break L4;
                    }
                  }
                  return null;
                }
                if (this.field_w == null) {
                  break L2;
                } else {
                  discarded$1 = this.field_j.a(this.field_t, this.field_w, var7, 2);
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_i = new hd(var7, this.field_r, this.field_A);
                      if (this.field_k != this.field_i.field_b) {
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
                    this.field_i = null;
                    if (!this.field_n.d(-13)) {
                      this.field_q = (wj) ((Object) this.field_n.a(15937, this.field_t, true, 255, (byte) 0));
                      break L6;
                    } else {
                      this.field_q = null;
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              this.field_q = null;
              if (null != this.field_l) {
                this.field_g = new byte[this.field_i.field_s];
                break L7;
              } else {
                break L7;
              }
            }
            return this.field_i;
          } else {
            return null;
          }
        }
    }

    final void e(byte param0) {
        wj discarded$2 = null;
        wj discarded$3 = null;
        ca var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (this.field_m != null) {
          if (null == this.a(-23879)) {
            return;
          } else {
            var2 = this.field_x.b((byte) -16);
            L0: while (true) {
              if (var2 == null) {
                L1: {
                  if (param0 == 57) {
                    break L1;
                  } else {
                    ak.b(-86);
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_d;
                  if (-1 >= (var3 ^ -1)) {
                    if (this.field_i.field_s > var3) {
                      if (0 == this.field_i.field_d[var3]) {
                        var2.b(57);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_g[var3] != 0) {
                            break L3;
                          } else {
                            discarded$2 = this.a(var3, (byte) 122, 1);
                            break L3;
                          }
                        }
                        L4: {
                          if (this.field_g[var3] != -1) {
                            break L4;
                          } else {
                            discarded$3 = this.a(var3, (byte) 76, 2);
                            break L4;
                          }
                        }
                        if (-2 != (this.field_g[var3] ^ -1)) {
                          break L2;
                        } else {
                          var2.b(57);
                          break L2;
                        }
                      }
                    } else {
                      var2.b(57);
                      break L2;
                    }
                  } else {
                    var2.b(57);
                    break L2;
                  }
                }
                var2 = this.field_x.d(853);
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (!(this.field_l != null)) {
            return;
        }
        this.field_h = true;
        if (null == this.field_m) {
            this.field_m = new im();
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
        wj var3 = (wj) ((Object) this.field_p.a((long)param0, -1));
        if (!(var3 == null)) {
            return var3.e(param1 ^ -7334);
        }
        if (param1 != -7362) {
            this.e((byte) -116);
        }
        return 0;
    }

    final byte[] a(int param0, int param1) {
        wj var3 = this.a(param1, (byte) 54, 0);
        if (var3 == null) {
            return null;
        }
        if (param0 != -15861) {
            this.field_m = (im) null;
        }
        byte[] var4 = var3.f(0);
        var3.b(param0 + 15918);
        return var4;
    }

    final void a(boolean param0) {
        wj discarded$4 = null;
        wj discarded$5 = null;
        wj discarded$6 = null;
        wj discarded$7 = null;
        int var2_int = 0;
        wj var2 = null;
        ca var3 = null;
        int var4 = 0;
        int var5 = 0;
        ca var6 = null;
        ca var7 = null;
        ge stackIn_20_0 = null;
        ge stackIn_21_0 = null;
        ge stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        ge stackOut_19_0 = null;
        ge stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ge stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        L0: {
          L1: {
            L2: {
              var5 = OrbDefence.field_D ? 1 : 0;
              if (null != this.field_m) {
                if (this.a(-23879) != null) {
                  if (this.field_s) {
                    var2_int = 1;
                    var3 = this.field_m.b((byte) -12);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (this.field_i.field_d.length <= this.field_o) {
                              break L5;
                            } else {
                              if (this.field_i.field_d[this.field_o] != 0) {
                                if (250 <= this.field_j.field_b) {
                                  var2_int = 0;
                                  break L5;
                                } else {
                                  L6: {
                                    if (-1 == (this.field_g[this.field_o] ^ -1)) {
                                      discarded$4 = this.a(this.field_o, (byte) 43, 1);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (this.field_g[this.field_o] != 0) {
                                      break L7;
                                    } else {
                                      var7 = new ca();
                                      var7.field_d = (long)this.field_o;
                                      this.field_m.a(-121, var7);
                                      var2_int = 0;
                                      break L7;
                                    }
                                  }
                                  this.field_o = this.field_o + 1;
                                  continue L4;
                                }
                              } else {
                                this.field_o = this.field_o + 1;
                                continue L4;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            this.field_s = false;
                            this.field_o = 0;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_d;
                          if (this.field_g[var4] != 0) {
                            break L8;
                          } else {
                            discarded$5 = this.a(var4, (byte) 55, 1);
                            break L8;
                          }
                        }
                        L9: {
                          if (-1 != (this.field_g[var4] ^ -1)) {
                            var3.b(57);
                            break L9;
                          } else {
                            var2_int = 0;
                            break L9;
                          }
                        }
                        var3 = this.field_m.d(853);
                        continue L3;
                      }
                    }
                  } else {
                    if (this.field_h) {
                      var2_int = 1;
                      var3 = this.field_m.b((byte) -17);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (this.field_o >= this.field_i.field_d.length) {
                                break L12;
                              } else {
                                if (0 != this.field_i.field_d[this.field_o]) {
                                  L13: {
                                    stackOut_19_0 = this.field_n;
                                    stackIn_21_0 = stackOut_19_0;
                                    stackIn_20_0 = stackOut_19_0;
                                    if (param0) {
                                      stackOut_21_0 = (ge) ((Object) stackIn_21_0);
                                      stackOut_21_1 = 0;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackIn_22_1 = stackOut_21_1;
                                      break L13;
                                    } else {
                                      stackOut_20_0 = (ge) ((Object) stackIn_20_0);
                                      stackOut_20_1 = 1;
                                      stackIn_22_0 = stackOut_20_0;
                                      stackIn_22_1 = stackOut_20_1;
                                      break L13;
                                    }
                                  }
                                  if (((ge) (Object) stackIn_22_0).a(stackIn_22_1 != 0)) {
                                    var2_int = 0;
                                    break L12;
                                  } else {
                                    L14: {
                                      if (1 == this.field_g[this.field_o]) {
                                        break L14;
                                      } else {
                                        discarded$6 = this.a(this.field_o, (byte) 63, 2);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if ((this.field_g[this.field_o] ^ -1) != -2) {
                                        var6 = new ca();
                                        var6.field_d = (long)this.field_o;
                                        this.field_m.a(-90, var6);
                                        var2_int = 0;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    this.field_o = this.field_o + 1;
                                    continue L11;
                                  }
                                } else {
                                  this.field_o = this.field_o + 1;
                                  continue L11;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_h = false;
                              this.field_o = 0;
                              break L2;
                            } else {
                              if (param0) {
                                if (!this.field_u) {
                                  break L0;
                                } else {
                                  if ((ji.b(-40) ^ -1L) > (this.field_v ^ -1L)) {
                                    break L0;
                                  } else {
                                    var2 = (wj) ((Object) this.field_p.a((byte) 121));
                                    L16: while (true) {
                                      if (var2 == null) {
                                        break L1;
                                      } else {
                                        L17: {
                                          if (var2.field_l) {
                                            break L17;
                                          } else {
                                            if (var2.field_p) {
                                              if (var2.field_n) {
                                                var2.b(57);
                                                break L17;
                                              } else {
                                                throw new RuntimeException();
                                              }
                                            } else {
                                              var2.field_p = true;
                                              break L17;
                                            }
                                          }
                                        }
                                        var2 = (wj) ((Object) this.field_p.c((byte) -112));
                                        continue L16;
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
                          L18: {
                            var4 = (int)var3.field_d;
                            if (1 != this.field_g[var4]) {
                              discarded$7 = this.a(var4, (byte) 107, 2);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if (-2 == (this.field_g[var4] ^ -1)) {
                              var3.b(57);
                              break L19;
                            } else {
                              var2_int = 0;
                              break L19;
                            }
                          }
                          var3 = this.field_m.d(853);
                          continue L10;
                        }
                      }
                    } else {
                      this.field_m = null;
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
            if (param0) {
              if (!this.field_u) {
                break L0;
              } else {
                if ((ji.b(-40) ^ -1L) > (this.field_v ^ -1L)) {
                  break L0;
                } else {
                  var2 = (wj) ((Object) this.field_p.a((byte) 121));
                  L20: while (true) {
                    if (var2 == null) {
                      break L1;
                    } else {
                      L21: {
                        if (var2.field_l) {
                          break L21;
                        } else {
                          if (var2.field_p) {
                            if (var2.field_n) {
                              var2.b(57);
                              break L21;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            var2.field_p = true;
                            break L21;
                          }
                        }
                      }
                      var2 = (wj) ((Object) this.field_p.c((byte) -112));
                      continue L20;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
          this.field_v = 1000L + ji.b(-80);
          break L0;
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
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
