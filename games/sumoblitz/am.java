/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rb {
    private te field_k;
    private sg field_x;
    static hr[] field_j;
    private ti field_q;
    static int[] field_z;
    static vf field_e;
    private int field_y;
    private int field_u;
    private wl field_f;
    private gd field_r;
    private wl field_h;
    private byte[] field_p;
    private byte[] field_w;
    private rw field_i;
    private int field_v;
    private boolean field_l;
    private int field_g;
    private jn field_s;
    private boolean field_o;
    private jn field_n;
    private long field_t;
    private boolean field_m;

    public static void d(byte param0) {
        field_j = null;
        field_z = null;
        if (param0 > -78) {
            field_z = (int[]) null;
        }
        field_e = null;
    }

    final sg b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (null == this.field_x) {
          L0: {
            if (this.field_i == null) {
              if (!this.field_r.a(-88)) {
                this.field_i = (rw) ((Object) this.field_r.a(255, true, this.field_u, (byte) -88, (byte) 0));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_i.field_u) {
            if (param0 < -62) {
              L1: {
                var7 = this.field_i.d(false);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (!(this.field_i instanceof ql)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_x = new sg(var7, this.field_y, this.field_w);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_r.b(14702);
                      this.field_x = null;
                      if (!this.field_r.a(-6)) {
                        this.field_i = (rw) ((Object) this.field_r.a(255, true, this.field_u, (byte) 90, (byte) 0));
                        break L3;
                      } else {
                        this.field_i = null;
                        break L3;
                      }
                    }
                    return null;
                  }
                  if (this.field_f != null) {
                    this.field_q.a(this.field_u, var7, 2, this.field_f);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_x = new sg(var7, this.field_y, this.field_w);
                        if (this.field_x.field_l != this.field_v) {
                          throw new RuntimeException();
                        } else {
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_x = null;
                      if (!this.field_r.a(122)) {
                        this.field_i = (rw) ((Object) this.field_r.a(255, true, this.field_u, (byte) -81, (byte) 0));
                        break L5;
                      } else {
                        this.field_i = null;
                        break L5;
                      }
                    }
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                this.field_i = null;
                if (this.field_h == null) {
                  break L6;
                } else {
                  this.field_p = new byte[this.field_x.field_d];
                  break L6;
                }
              }
              return this.field_x;
            } else {
              return (sg) null;
            }
          } else {
            return null;
          }
        } else {
          return this.field_x;
        }
    }

    final void b(int param0) {
        rw discarded$0 = null;
        rw discarded$1 = null;
        ms var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_n != null) {
          L0: {
            if (param0 <= -18) {
              break L0;
            } else {
              this.c((byte) 124);
              break L0;
            }
          }
          if (this.b((byte) -120) == null) {
            return;
          } else {
            var2 = this.field_s.b(-72);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_h;
                  if (var3 >= 0) {
                    if (this.field_x.field_d > var3) {
                      if (this.field_x.field_m[var3] == 0) {
                        var2.b(false);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_p[var3] != 0) {
                            break L3;
                          } else {
                            discarded$0 = this.a(var3, 1, 30561);
                            break L3;
                          }
                        }
                        L4: {
                          if (-1 == this.field_p[var3]) {
                            discarded$1 = this.a(var3, 2, 30561);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (this.field_p[var3] != 1) {
                          break L2;
                        } else {
                          var2.b(false);
                          break L2;
                        }
                      }
                    } else {
                      var2.b(false);
                      break L2;
                    }
                  } else {
                    var2.b(false);
                    break L2;
                  }
                }
                var2 = this.field_s.d((byte) 18);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    private final rw a(int param0, int param1, int param2) {
        Object stackIn_92_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rw var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          var12 = (rw) ((Object) this.field_k.a(120, (long)param0));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (var12.field_t) {
                break L0;
              } else {
                if (!var12.field_u) {
                  break L0;
                } else {
                  var12.b(false);
                  var4 = null;
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
              if (param1 != 0) {
                if (1 == param1) {
                  if (null == this.field_h) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_q.a(param0, -82, this.field_h);
                    break L2;
                  }
                } else {
                  if (2 == param1) {
                    if (this.field_h == null) {
                      throw new RuntimeException();
                    } else {
                      if (this.field_p[param0] == -1) {
                        if (!this.field_r.b(true)) {
                          var4 = this.field_r.a(this.field_u, false, param0, (byte) -126, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (null == this.field_h) {
                    break L3;
                  } else {
                    if (0 != (this.field_p[param0] ^ -1)) {
                      var4 = this.field_q.a(this.field_h, -128, param0);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_r.a(119)) {
                  var4 = this.field_r.a(this.field_u, true, param0, (byte) -87, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_k.a((ms) (var4), param2 ^ -30562, (long)param0);
            break L1;
          }
        }
        if (!((rw) (var4)).field_u) {
          L4: {
            var18 = ((rw) (var4)).d(false);
            var13 = var18;
            var5 = var13;
            if (param2 == 30561) {
              break L4;
            } else {
              this.field_p = (byte[]) null;
              break L4;
            }
          }
          if (var4 instanceof ql) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var18.length > 2) {
                      pt.field_c.reset();
                      pt.field_c.update(var5, 0, -2 + var18.length);
                      var6_int = (int)pt.field_c.getValue();
                      if (this.field_x.field_b[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (this.field_x.field_a == null) {
                            break L7;
                          } else {
                            if (this.field_x.field_a[param0] != null) {
                              var29 = this.field_x.field_a[param0];
                              var30 = gn.a(var5, (byte) -109, 0, var18.length + -2);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (-65 >= (var11 ^ -1)) {
                                  break L7;
                                } else {
                                  if ((var29[var11] ^ -1) == (var30[var11] ^ -1)) {
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
                        var7 = (var5[-1 + var18.length] & 255) + (65280 & var5[-2 + var18.length] << 1213445768);
                        if (var7 != (65535 & this.field_x.field_c[param0])) {
                          throw new RuntimeException();
                        } else {
                          L9: {
                            if (1 == this.field_p[param0]) {
                              break L9;
                            } else {
                              L10: {
                                if (-1 == (this.field_p[param0] ^ -1)) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_p[param0] = (byte) 1;
                              break L9;
                            }
                          }
                          L11: {
                            if (((rw) (var4)).field_t) {
                              break L11;
                            } else {
                              ((rw) (var4)).b(false);
                              break L11;
                            }
                          }
                          stackIn_92_0 = var4;
                          break L5;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L12: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_p[param0] = (byte)-1;
                ((rw) (var4)).b(false);
                if (((rw) (var4)).field_t) {
                  if (!this.field_r.a(param2 + -30551)) {
                    var4 = this.field_r.a(this.field_u, true, param0, (byte) 78, (byte) 2);
                    this.field_k.a((ms) (var4), -1, (long)param0);
                    break L12;
                  } else {
                    return null;
                  }
                } else {
                  break L12;
                }
              }
              return null;
            }
            return (rw) ((Object) stackIn_92_0);
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if ((var18.length ^ -1) < -3) {
                      pt.field_c.reset();
                      pt.field_c.update(var5, 0, var18.length - 2);
                      var6_int = (int)pt.field_c.getValue();
                      if (this.field_x.field_b[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L15: {
                          if (null == this.field_x.field_a) {
                            break L15;
                          } else {
                            if (this.field_x.field_a[param0] == null) {
                              break L15;
                            } else {
                              var28 = this.field_x.field_a[param0];
                              var27 = gn.a(var5, (byte) -110, 0, -2 + var18.length);
                              var9 = 0;
                              L16: while (true) {
                                if (64 <= var9) {
                                  break L15;
                                } else {
                                  if (var27[var9] != var28[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_r.field_d = 0;
                        this.field_r.field_j = 0;
                        break L13;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L17: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_r.b(14702);
                ((rw) (var4)).b(false);
                if (((rw) (var4)).field_t) {
                  if (!this.field_r.a(param2 + -30435)) {
                    var4 = this.field_r.a(this.field_u, true, param0, (byte) -69, (byte) 2);
                    this.field_k.a((ms) (var4), -1, (long)param0);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              return null;
            }
            L18: {
              var5[var18.length - 2] = (byte)(this.field_x.field_c[param0] >>> 368142120);
              var5[-1 + var18.length] = (byte)this.field_x.field_c[param0];
              if (null != this.field_h) {
                this.field_q.a(param0, var18, 2, this.field_h);
                if ((this.field_p[param0] ^ -1) != -2) {
                  this.field_p[param0] = (byte) 1;
                  break L18;
                } else {
                  break L18;
                }
              } else {
                break L18;
              }
            }
            L19: {
              if (!((rw) (var4)).field_t) {
                ((rw) (var4)).b(false);
                break L19;
              } else {
                break L19;
              }
            }
            return (rw) (var4);
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, boolean param1) {
        rw var3 = this.a(param0, 0, 30561);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.d(param1);
        var3.b(param1);
        return var4;
    }

    final void c(byte param0) {
        if (this.field_h == null) {
            return;
        }
        this.field_o = true;
        if (this.field_n == null) {
            this.field_n = new jn();
        }
        int var2 = -71 / ((param0 - -2) / 46);
    }

    final int a(int param0, int param1) {
        rw var3 = (rw) ((Object) this.field_k.a(param1 + 120, (long)param0));
        if (!(var3 == null)) {
            return var3.a(-1);
        }
        if (param1 != 0) {
            this.field_o = true;
            return 0;
        }
        return 0;
    }

    final void c(int param0) {
        rw discarded$0 = null;
        rw discarded$1 = null;
        rw discarded$2 = null;
        rw discarded$3 = null;
        int var2_int;
        rw var2;
        ms var3;
        int var4;
        int var5;
        ms var6;
        ms var7;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (null != this.field_n) {
            if (null == this.b((byte) -102)) {
              return;
            } else {
              if (this.field_l) {
                var2_int = 1;
                var3 = this.field_n.b(122);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_g >= this.field_x.field_m.length) {
                          break L3;
                        } else {
                          L4: {
                            if (-1 == (this.field_x.field_m[this.field_g] ^ -1)) {
                              break L4;
                            } else {
                              if (250 <= this.field_q.field_e) {
                                var2_int = 0;
                                break L3;
                              } else {
                                L5: {
                                  if (this.field_p[this.field_g] != 0) {
                                    break L5;
                                  } else {
                                    discarded$0 = this.a(this.field_g, 1, 30561);
                                    break L5;
                                  }
                                }
                                if (0 != this.field_p[this.field_g]) {
                                  break L4;
                                } else {
                                  var7 = new ms();
                                  var7.field_h = (long)this.field_g;
                                  this.field_n.a(var7, (byte) 39);
                                  var2_int = 0;
                                  break L4;
                                }
                              }
                            }
                          }
                          this.field_g = this.field_g + 1;
                          continue L2;
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        this.field_g = 0;
                        this.field_l = false;
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_h;
                      if (-1 != (this.field_p[var4] ^ -1)) {
                        break L6;
                      } else {
                        discarded$1 = this.a(var4, 1, 30561);
                        break L6;
                      }
                    }
                    L7: {
                      if (0 != this.field_p[var4]) {
                        var3.b(false);
                        break L7;
                      } else {
                        var2_int = 0;
                        break L7;
                      }
                    }
                    var3 = this.field_n.d((byte) 18);
                    continue L1;
                  }
                }
              } else {
                if (this.field_o) {
                  var2_int = 1;
                  var3 = this.field_n.b(89);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_x.field_m.length <= this.field_g) {
                            break L10;
                          } else {
                            L11: {
                              if ((this.field_x.field_m[this.field_g] ^ -1) == -1) {
                                break L11;
                              } else {
                                if (this.field_r.b(true)) {
                                  var2_int = 0;
                                  break L10;
                                } else {
                                  L12: {
                                    if (-2 != (this.field_p[this.field_g] ^ -1)) {
                                      discarded$2 = this.a(this.field_g, 2, 30561);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if ((this.field_p[this.field_g] ^ -1) == -2) {
                                    break L11;
                                  } else {
                                    var6 = new ms();
                                    var6.field_h = (long)this.field_g;
                                    var2_int = 0;
                                    this.field_n.a(var6, (byte) 39);
                                    break L11;
                                  }
                                }
                              }
                            }
                            this.field_g = this.field_g + 1;
                            continue L9;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_g = 0;
                          this.field_o = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_h;
                        if (-2 != (this.field_p[var4] ^ -1)) {
                          discarded$3 = this.a(var4, 2, 30561);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (this.field_p[var4] != 1) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.b(false);
                          break L14;
                        }
                      }
                      var3 = this.field_n.d((byte) 18);
                      continue L8;
                    }
                  }
                } else {
                  this.field_n = null;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (param0 <= -29) {
            break L15;
          } else {
            this.a(30, -8);
            break L15;
          }
        }
        L16: {
          if (!this.field_m) {
            break L16;
          } else {
            if ((wq.a(-91) ^ -1L) <= (this.field_t ^ -1L)) {
              var2 = (rw) ((Object) this.field_k.a(84));
              L17: while (true) {
                if (var2 == null) {
                  this.field_t = 1000L + wq.a(-42);
                  break L16;
                } else {
                  L18: {
                    if (var2.field_u) {
                      break L18;
                    } else {
                      if (!var2.field_s) {
                        var2.field_s = true;
                        break L18;
                      } else {
                        if (var2.field_t) {
                          var2.b(false);
                          break L18;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                  var2 = (rw) ((Object) this.field_k.a(true));
                  continue L17;
                }
              }
            } else {
              break L16;
            }
          }
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -87 % ((-27 - param2) / 41);
            stackIn_1_0 = rd.a(param1, 0, param0, 1001);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("am.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    am(int param0, wl param1, wl param2, gd param3, ti param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_k = new te(16);
        this.field_g = 0;
        this.field_s = new jn();
        this.field_t = 0L;
        try {
          L0: {
            L1: {
              this.field_h = param1;
              this.field_u = param0;
              if (this.field_h != null) {
                this.field_l = true;
                this.field_n = new jn();
                break L1;
              } else {
                this.field_l = false;
                break L1;
              }
            }
            L2: {
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
              ((am) (this)).field_m = stackIn_7_1 != 0;
              this.field_y = param5;
              this.field_v = param7;
              this.field_r = param3;
              this.field_w = param6;
              this.field_q = param4;
              this.field_f = param2;
              if (this.field_f == null) {
                break L3;
              } else {
                this.field_i = (rw) ((Object) this.field_q.a(this.field_f, 91, this.field_u));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("am.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_z = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_e = new vf();
    }
}
