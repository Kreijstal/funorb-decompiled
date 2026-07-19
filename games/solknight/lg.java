/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends wd {
    private sk field_x;
    private int field_n;
    private va field_h;
    private bi field_v;
    private byte[] field_u;
    private int field_o;
    private byte[] field_t;
    private ha field_j;
    private qd field_w;
    private int field_k;
    private bi field_f;
    private ae field_p;
    static dl field_l;
    private boolean field_s;
    static String field_r;
    private nc field_e;
    private boolean field_y;
    private nc field_m;
    private int field_q;
    private long field_g;
    private boolean field_i;

    private final sk a(int param0, byte param1, int param2) {
        ha discarded$2 = null;
        md discarded$3 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sk var12 = null;
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
          var10 = SolKnight.field_L ? 1 : 0;
          var12 = (sk) ((Object) this.field_w.a(true, (long)param0));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L0;
            } else {
              if (var12.field_r) {
                break L0;
              } else {
                if (!var12.field_m) {
                  break L0;
                } else {
                  var12.c(param1 ^ 10);
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
              if (0 != param2) {
                if (-2 == (param2 ^ -1)) {
                  if (this.field_v == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_p.a(-72, this.field_v, param0);
                    break L2;
                  }
                } else {
                  if ((param2 ^ -1) != -3) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_v != null) {
                      if (this.field_u[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_h.a(param1 ^ -5868)) {
                          var4 = this.field_h.a(this.field_o, false, param0, param1 ^ 437409504, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                L3: {
                  if (this.field_v == null) {
                    break L3;
                  } else {
                    if ((this.field_u[param0] ^ -1) != 0) {
                      var4 = this.field_p.a(this.field_v, param0, -112);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_h.b(-21)) {
                  var4 = this.field_h.a(this.field_o, true, param0, 437409504, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_w.a((byte) 126, (gg) (var4), (long)param0);
            break L1;
          } else {
            break L1;
          }
        }
        L4: {
          if (param1 == 0) {
            break L4;
          } else {
            discarded$2 = this.c(-104);
            break L4;
          }
        }
        if (!((sk) (var4)).field_m) {
          var18 = ((sk) (var4)).f(0);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof md)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (2 < var18.length) {
                      gl.field_g.reset();
                      gl.field_g.update(var5, 0, var18.length - 2);
                      var6_int = (int)gl.field_g.getValue();
                      if (var6_int != this.field_j.field_b[param0]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_j.field_q) {
                            break L7;
                          } else {
                            if (null != this.field_j.field_q[param0]) {
                              var29 = this.field_j.field_q[param0];
                              var30 = q.a(var18.length - 2, 0, 100, var18);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (64 <= var11) {
                                  break L7;
                                } else {
                                  if (var29[var11] == var30[var11]) {
                                    var11++;
                                    continue L8;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.field_h.field_l = 0;
                        this.field_h.field_c = 0;
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
              L9: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_h.c((byte) 59);
                ((sk) (var4)).c(10);
                if (((sk) (var4)).field_r) {
                  if (!this.field_h.b(-21)) {
                    var4 = this.field_h.a(this.field_o, true, param0, 437409504, (byte) 2);
                    this.field_w.a((byte) 79, (gg) (var4), (long)param0);
                    break L9;
                  } else {
                    return null;
                  }
                } else {
                  break L9;
                }
              }
              return null;
            }
            L10: {
              var5[-2 + var18.length] = (byte)(this.field_j.field_s[param0] >>> 80469384);
              var5[var18.length - 1] = (byte)this.field_j.field_s[param0];
              if (null != this.field_v) {
                discarded$3 = this.field_p.a(95, param0, this.field_v, var18);
                if ((this.field_u[param0] ^ -1) == -2) {
                  break L10;
                } else {
                  this.field_u[param0] = (byte) 1;
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (((sk) (var4)).field_r) {
                break L11;
              } else {
                ((sk) (var4)).c(param1 + 10);
                break L11;
              }
            }
            return (sk) (var4);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (-3 <= (var18.length ^ -1)) {
                      break L13;
                    } else {
                      gl.field_g.reset();
                      gl.field_g.update(var5, 0, -2 + var18.length);
                      var6_int = (int)gl.field_g.getValue();
                      if (var6_int == this.field_j.field_b[param0]) {
                        L14: {
                          if (this.field_j.field_q == null) {
                            break L14;
                          } else {
                            if (this.field_j.field_q[param0] != null) {
                              var27 = this.field_j.field_q[param0];
                              var28 = q.a(var18.length + -2, 0, -110, var18);
                              var9 = 0;
                              L15: while (true) {
                                if (var9 >= 64) {
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
                        var7 = ((var5[var18.length + -2] & 255) << 924867656) - -(255 & var5[-1 + var18.length]);
                        if (var7 == (this.field_j.field_s[param0] & 65535)) {
                          L16: {
                            if (-2 == (this.field_u[param0] ^ -1)) {
                              break L16;
                            } else {
                              L17: {
                                if (this.field_u[param0] != 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_u[param0] = (byte) 1;
                              break L16;
                            }
                          }
                          L18: {
                            if (!((sk) (var4)).field_r) {
                              ((sk) (var4)).c(param1 ^ 10);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          stackOut_59_0 = var4;
                          stackIn_60_0 = stackOut_59_0;
                          break L12;
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
              this.field_u[param0] = (byte)-1;
              ((sk) (var4)).c(param1 + 10);
              if (((sk) (var4)).field_r) {
                L19: {
                  if (!this.field_h.b(-21)) {
                    var4 = this.field_h.a(this.field_o, true, param0, 437409504, (byte) 2);
                    this.field_w.a((byte) 73, (gg) (var4), (long)param0);
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
            return (sk) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final void e(int param0) {
        ha discarded$5 = null;
        sk discarded$6 = null;
        sk discarded$7 = null;
        sk discarded$8 = null;
        sk discarded$9 = null;
        int var2_int = 0;
        sk var2 = null;
        gg var3 = null;
        int var4 = 0;
        int var5 = 0;
        gg var6 = null;
        gg var7 = null;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if (param0 == 18055) {
            break L0;
          } else {
            discarded$5 = this.c(79);
            break L0;
          }
        }
        L1: {
          if (null != this.field_m) {
            if (null == this.c(-110)) {
              return;
            } else {
              if (this.field_s) {
                var2_int = 1;
                var3 = this.field_m.a((byte) 51);
                L2: while (true) {
                  if (var3 == null) {
                    L3: while (true) {
                      L4: {
                        if (this.field_j.field_r.length <= this.field_q) {
                          break L4;
                        } else {
                          if (this.field_j.field_r[this.field_q] != 0) {
                            if ((this.field_p.field_a ^ -1) > -251) {
                              L5: {
                                if (0 == this.field_u[this.field_q]) {
                                  discarded$6 = this.a(this.field_q, (byte) 0, 1);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              L6: {
                                if (0 != this.field_u[this.field_q]) {
                                  break L6;
                                } else {
                                  var7 = new gg();
                                  var7.field_g = (long)this.field_q;
                                  this.field_m.a(var7, -7044);
                                  var2_int = 0;
                                  break L6;
                                }
                              }
                              this.field_q = this.field_q + 1;
                              continue L3;
                            } else {
                              var2_int = 0;
                              break L4;
                            }
                          } else {
                            this.field_q = this.field_q + 1;
                            continue L3;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        this.field_q = 0;
                        this.field_s = false;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    L7: {
                      var4 = (int)var3.field_g;
                      if (0 == this.field_u[var4]) {
                        discarded$7 = this.a(var4, (byte) 0, 1);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (this.field_u[var4] != 0) {
                        var3.c(10);
                        break L8;
                      } else {
                        var2_int = 0;
                        break L8;
                      }
                    }
                    var3 = this.field_m.b(-84);
                    continue L2;
                  }
                }
              } else {
                if (this.field_y) {
                  var2_int = 1;
                  var3 = this.field_m.a((byte) 51);
                  L9: while (true) {
                    if (var3 == null) {
                      L10: while (true) {
                        L11: {
                          if (this.field_j.field_r.length <= this.field_q) {
                            break L11;
                          } else {
                            if (-1 != (this.field_j.field_r[this.field_q] ^ -1)) {
                              if (!this.field_h.a(-5868)) {
                                L12: {
                                  if (-2 == (this.field_u[this.field_q] ^ -1)) {
                                    break L12;
                                  } else {
                                    discarded$8 = this.a(this.field_q, (byte) 0, 2);
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (-2 == (this.field_u[this.field_q] ^ -1)) {
                                    break L13;
                                  } else {
                                    var6 = new gg();
                                    var6.field_g = (long)this.field_q;
                                    var2_int = 0;
                                    this.field_m.a(var6, -7044);
                                    break L13;
                                  }
                                }
                                this.field_q = this.field_q + 1;
                                continue L10;
                              } else {
                                var2_int = 0;
                                break L11;
                              }
                            } else {
                              this.field_q = this.field_q + 1;
                              continue L10;
                            }
                          }
                        }
                        if (var2_int != 0) {
                          this.field_q = 0;
                          this.field_y = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L14: {
                        var4 = (int)var3.field_g;
                        if (1 != this.field_u[var4]) {
                          discarded$9 = this.a(var4, (byte) 0, 2);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (-2 != (this.field_u[var4] ^ -1)) {
                          var2_int = 0;
                          break L15;
                        } else {
                          var3.c(param0 + -18045);
                          break L15;
                        }
                      }
                      var3 = this.field_m.b(-47);
                      continue L9;
                    }
                  }
                } else {
                  this.field_m = null;
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        L16: {
          if (!this.field_i) {
            break L16;
          } else {
            if ((je.a(1) ^ -1L) > (this.field_g ^ -1L)) {
              break L16;
            } else {
              var2 = (sk) ((Object) this.field_w.b(0));
              L17: while (true) {
                if (var2 == null) {
                  this.field_g = 1000L + je.a(param0 + -18054);
                  break L16;
                } else {
                  L18: {
                    if (var2.field_m) {
                      break L18;
                    } else {
                      if (var2.field_q) {
                        if (!var2.field_r) {
                          throw new RuntimeException();
                        } else {
                          var2.c(10);
                          break L18;
                        }
                      } else {
                        var2.field_q = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (sk) ((Object) this.field_w.c((byte) 122));
                  continue L17;
                }
              }
            }
          }
        }
    }

    final ha c(int param0) {
        md discarded$1 = null;
        int var2 = 0;
        byte[] var3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = -106 / ((param0 - 9) / 62);
        if (this.field_j == null) {
          L0: {
            if (null == this.field_x) {
              if (!this.field_h.b(-21)) {
                this.field_x = (sk) ((Object) this.field_h.a(255, true, this.field_o, 437409504, (byte) 0));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_x.field_m) {
            L1: {
              var7 = this.field_x.f(0);
              var6 = var7;
              var3 = var6;
              if (this.field_x instanceof md) {
                try {
                  L2: {
                    if (var3 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_j = new ha(var7, this.field_k, this.field_t);
                      if (this.field_n != this.field_j.field_m) {
                        throw new RuntimeException();
                      } else {
                        break L2;
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = decompiledCaughtException;
                    this.field_j = null;
                    if (!this.field_h.b(-21)) {
                      this.field_x = (sk) ((Object) this.field_h.a(255, true, this.field_o, 437409504, (byte) 0));
                      break L3;
                    } else {
                      this.field_x = null;
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var3 != null) {
                      this.field_j = new ha(var7, this.field_k, this.field_t);
                      break L4;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var4 = decompiledCaughtException;
                    this.field_h.c((byte) 59);
                    this.field_j = null;
                    if (this.field_h.b(-21)) {
                      this.field_x = null;
                      break L5;
                    } else {
                      this.field_x = (sk) ((Object) this.field_h.a(255, true, this.field_o, 437409504, (byte) 0));
                      break L5;
                    }
                  }
                  return null;
                }
                if (null != this.field_f) {
                  discarded$1 = this.field_p.a(83, this.field_o, this.field_f, var7);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              this.field_x = null;
              if (null == this.field_v) {
                break L6;
              } else {
                this.field_u = new byte[this.field_j.field_l];
                break L6;
              }
            }
            return this.field_j;
          } else {
            return null;
          }
        } else {
          return this.field_j;
        }
    }

    final void d(int param0) {
        sk discarded$2 = null;
        sk discarded$3 = null;
        gg var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == -1) {
          if (null == this.field_m) {
            return;
          } else {
            if (this.c(123) == null) {
              return;
            } else {
              var2 = this.field_e.a((byte) 51);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var3 = (int)var2.field_g;
                      if (-1 < (var3 ^ -1)) {
                        break L2;
                      } else {
                        if (var3 >= this.field_j.field_l) {
                          break L2;
                        } else {
                          if (-1 == (this.field_j.field_r[var3] ^ -1)) {
                            break L2;
                          } else {
                            L3: {
                              if (0 == this.field_u[var3]) {
                                discarded$2 = this.a(var3, (byte) 0, 1);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            L4: {
                              if (0 != (this.field_u[var3] ^ -1)) {
                                break L4;
                              } else {
                                discarded$3 = this.a(var3, (byte) 0, 2);
                                break L4;
                              }
                            }
                            if (1 == this.field_u[var3]) {
                              var2.c(10);
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    var2.c(param0 + 11);
                    break L1;
                  }
                  var2 = this.field_e.b(-41);
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        sk var3 = (sk) ((Object) this.field_w.a(true, (long)param0));
        if (!(var3 == null)) {
            return var3.a((byte) -126);
        }
        int var4 = -38 / ((param1 - -68) / 58);
        return 0;
    }

    final byte[] a(int param0, int param1) {
        sk var3 = this.a(param0, (byte) 0, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.f(param1);
        var3.c(10);
        return var4;
    }

    final void a(byte param0) {
        if (!(null != this.field_v)) {
            return;
        }
        this.field_y = true;
        if (this.field_m == null) {
            this.field_m = new nc();
        }
        if (param0 != 0) {
            this.e(-121);
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_r = null;
        if (param0 != 0) {
            field_l = (dl) null;
        }
    }

    lg(int param0, bi param1, bi param2, va param3, ae param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_w = new qd(16);
        this.field_q = 0;
        this.field_e = new nc();
        this.field_g = 0L;
        try {
          L0: {
            L1: {
              this.field_o = param0;
              this.field_v = param1;
              if (null == this.field_v) {
                this.field_s = false;
                break L1;
              } else {
                this.field_s = true;
                this.field_m = new nc();
                break L1;
              }
            }
            L2: {
              this.field_f = param2;
              this.field_t = param6;
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
              ((lg) (this)).field_i = stackIn_7_1 != 0;
              this.field_p = param4;
              this.field_n = param7;
              this.field_h = param3;
              this.field_k = param5;
              if (null == this.field_f) {
                break L3;
              } else {
                this.field_x = (sk) ((Object) this.field_p.a(this.field_f, this.field_o, -122));
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
            stackOut_10_1 = new StringBuilder().append("lg.<init>(").append(param0).append(',');
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
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = "to return to the normal view.";
    }
}
