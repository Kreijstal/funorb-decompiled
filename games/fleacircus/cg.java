/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gi {
    private ah field_x;
    private hc field_n;
    private rf field_j;
    private ah field_r;
    static int field_y;
    private w field_f;
    private int field_A;
    static String field_v;
    private byte[] field_i;
    static fh field_h;
    static volatile long field_z;
    private int field_e;
    private byte[] field_u;
    private int field_m;
    private af field_o;
    private dl field_g;
    private boolean field_t;
    private boolean field_q;
    private int field_l;
    private vc field_p;
    private vc field_s;
    private boolean field_k;
    private long field_w;

    final static void a(byte param0, int param1) {
        if (param0 != -105) {
            field_h = (fh) null;
        }
        cl.field_b = param1;
    }

    final rf a(int param0) {
        qh discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        if (null == this.field_j) {
          L0: {
            if (this.field_g != null) {
              break L0;
            } else {
              if (!this.field_f.a(param0 + 1805)) {
                this.field_g = (dl) ((Object) this.field_f.a(param0 ^ -1745, true, this.field_m, 255, (byte) 0));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_g.field_q) {
            L1: {
              var7 = this.field_g.g(100);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_g instanceof qh)) {
                try {
                  L2: {
                    if (var5 != null) {
                      this.field_j = new rf(var7, this.field_A, this.field_u);
                      break L2;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_f.a((byte) 80);
                    this.field_j = null;
                    if (!this.field_f.a(param0 + 1612)) {
                      this.field_g = (dl) ((Object) this.field_f.a(127, true, this.field_m, 255, (byte) 0));
                      break L3;
                    } else {
                      this.field_g = null;
                      break L3;
                    }
                  }
                  return null;
                }
                if (null != this.field_r) {
                  discarded$1 = this.field_o.a(83, this.field_m, this.field_r, var7);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_j = new rf(var7, this.field_A, this.field_u);
                      if (this.field_e == this.field_j.field_t) {
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    this.field_j = null;
                    if (!this.field_f.a(-95)) {
                      this.field_g = (dl) ((Object) this.field_f.a(127, true, this.field_m, 255, (byte) 0));
                      break L5;
                    } else {
                      this.field_g = null;
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              if (param0 == -1712) {
                break L6;
              } else {
                this.c(117);
                break L6;
              }
            }
            L7: {
              if (null == this.field_x) {
                break L7;
              } else {
                this.field_i = new byte[this.field_j.field_i];
                break L7;
              }
            }
            this.field_g = null;
            return this.field_j;
          } else {
            return null;
          }
        } else {
          return this.field_j;
        }
    }

    final void c(int param0) {
        dl discarded$0 = null;
        if (!(this.field_x != null)) {
            return;
        }
        if (param0 >= -57) {
            discarded$0 = this.a(81, -1, 27);
        }
        this.field_q = true;
        if (!(this.field_p != null)) {
            this.field_p = new vc();
        }
    }

    final int a(int param0, byte param1) {
        byte[] discarded$0 = null;
        if (param1 != -5) {
            discarded$0 = this.b(60, true);
        }
        dl var3 = (dl) ((Object) this.field_n.a((long)param0, param1 ^ 1105));
        if (var3 == null) {
            return 0;
        }
        return var3.f(8651);
    }

    final void b(byte param0) {
        dl discarded$4 = null;
        dl discarded$5 = null;
        dl discarded$6 = null;
        dl discarded$7 = null;
        dl var2 = null;
        int var2_int = 0;
        lh var3 = null;
        int var4 = 0;
        int var5 = 0;
        lh var6 = null;
        lh var7 = null;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0 > 119) {
            break L0;
          } else {
            field_z = -93L;
            break L0;
          }
        }
        L1: {
          if (null == this.field_p) {
            break L1;
          } else {
            if (this.a(-1712) != null) {
              if (this.field_t) {
                var2_int = 1;
                var3 = this.field_p.c((byte) 47);
                L2: while (true) {
                  if (var3 == null) {
                    L3: while (true) {
                      L4: {
                        if (this.field_l >= this.field_j.field_f.length) {
                          break L4;
                        } else {
                          L5: {
                            if (-1 == (this.field_j.field_f[this.field_l] ^ -1)) {
                              break L5;
                            } else {
                              if ((this.field_o.field_d ^ -1) <= -251) {
                                var2_int = 0;
                                break L4;
                              } else {
                                L6: {
                                  if (this.field_i[this.field_l] == 0) {
                                    discarded$4 = this.a(2, 1, this.field_l);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                if (0 == this.field_i[this.field_l]) {
                                  var7 = new lh();
                                  var7.field_c = (long)this.field_l;
                                  var2_int = 0;
                                  this.field_p.a(false, var7);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          this.field_l = this.field_l + 1;
                          continue L3;
                        }
                      }
                      if (var2_int == 0) {
                        break L1;
                      } else {
                        this.field_l = 0;
                        this.field_t = false;
                        break L1;
                      }
                    }
                  } else {
                    L7: {
                      var4 = (int)var3.field_c;
                      if (0 == this.field_i[var4]) {
                        discarded$5 = this.a(2, 1, var4);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (-1 != (this.field_i[var4] ^ -1)) {
                        var3.c(-1);
                        break L8;
                      } else {
                        var2_int = 0;
                        break L8;
                      }
                    }
                    var3 = this.field_p.b((byte) -105);
                    continue L2;
                  }
                }
              } else {
                if (!this.field_q) {
                  this.field_p = null;
                  break L1;
                } else {
                  var2_int = 1;
                  var3 = this.field_p.c((byte) 47);
                  L9: while (true) {
                    if (var3 == null) {
                      L10: while (true) {
                        L11: {
                          if (this.field_j.field_f.length <= this.field_l) {
                            break L11;
                          } else {
                            if (-1 != (this.field_j.field_f[this.field_l] ^ -1)) {
                              if (this.field_f.b(113)) {
                                var2_int = 0;
                                break L11;
                              } else {
                                L12: {
                                  if (this.field_i[this.field_l] != 1) {
                                    discarded$6 = this.a(2, 2, this.field_l);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  if ((this.field_i[this.field_l] ^ -1) != -2) {
                                    var6 = new lh();
                                    var6.field_c = (long)this.field_l;
                                    var2_int = 0;
                                    this.field_p.a(false, var6);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                this.field_l = this.field_l + 1;
                                continue L10;
                              }
                            } else {
                              this.field_l = this.field_l + 1;
                              continue L10;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          this.field_q = false;
                          this.field_l = 0;
                          break L1;
                        }
                      }
                    } else {
                      L14: {
                        var4 = (int)var3.field_c;
                        if ((this.field_i[var4] ^ -1) == -2) {
                          break L14;
                        } else {
                          discarded$7 = this.a(2, 2, var4);
                          break L14;
                        }
                      }
                      L15: {
                        if (-2 != (this.field_i[var4] ^ -1)) {
                          var2_int = 0;
                          break L15;
                        } else {
                          var3.c(-1);
                          break L15;
                        }
                      }
                      var3 = this.field_p.b((byte) -105);
                      continue L9;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        }
        L16: {
          if (!this.field_k) {
            break L16;
          } else {
            if ((this.field_w ^ -1L) >= (lj.a((byte) -56) ^ -1L)) {
              var2 = (dl) ((Object) this.field_n.a(true));
              L17: while (true) {
                if (var2 == null) {
                  this.field_w = 1000L + lj.a((byte) -28);
                  break L16;
                } else {
                  L18: {
                    if (var2.field_q) {
                      break L18;
                    } else {
                      if (var2.field_r) {
                        if (!var2.field_v) {
                          throw new RuntimeException();
                        } else {
                          var2.c(-1);
                          break L18;
                        }
                      } else {
                        var2.field_r = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (dl) ((Object) this.field_n.b((byte) 97));
                  continue L17;
                }
              }
            } else {
              break L16;
            }
          }
        }
    }

    final static void a(java.math.BigInteger param0, int param1, ni param2, ni param3, java.math.BigInteger param4) {
        try {
            if (param1 >= -104) {
                field_v = (String) null;
            }
            qi.a(param4, param2.field_i, 0, param2.field_k, param3, param0, (byte) -60);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "cg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final dl a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        qh discarded$3 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var12 = null;
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
          var10 = fleas.field_A ? 1 : 0;
          if (param0 == 2) {
            break L0;
          } else {
            discarded$2 = this.a(-58, (byte) -93);
            break L0;
          }
        }
        L1: {
          var12 = (dl) ((Object) this.field_n.a((long)param2, -1110));
          var4 = var12;
          if (var12 == null) {
            break L1;
          } else {
            if (param1 != 0) {
              break L1;
            } else {
              if (var12.field_v) {
                break L1;
              } else {
                if (var12.field_q) {
                  var12.c(-1);
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
          if (var4 == null) {
            L3: {
              if (0 != param1) {
                if (-2 != (param1 ^ -1)) {
                  if (-3 != (param1 ^ -1)) {
                    throw new RuntimeException();
                  } else {
                    if (null == this.field_x) {
                      throw new RuntimeException();
                    } else {
                      if ((this.field_i[param2] ^ -1) == 0) {
                        if (!this.field_f.b(-49)) {
                          var4 = this.field_f.a(127, false, param2, this.field_m, (byte) 2);
                          break L3;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } else {
                  if (this.field_x == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_o.a(126, param2, this.field_x);
                    break L3;
                  }
                }
              } else {
                L4: {
                  if (null == this.field_x) {
                    break L4;
                  } else {
                    if ((this.field_i[param2] ^ -1) != 0) {
                      var4 = this.field_o.a(param2, this.field_x, true);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_f.a(-112)) {
                  var4 = this.field_f.a(param0 + 125, true, param2, this.field_m, (byte) 2);
                  break L3;
                } else {
                  return null;
                }
              }
            }
            this.field_n.a((lh) (var4), true, (long)param2);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((dl) (var4)).field_q) {
          var18 = ((dl) (var4)).g(100);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof qh)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var18.length <= 2) {
                      break L6;
                    } else {
                      ql.field_j.reset();
                      ql.field_j.update(var5, 0, var18.length + -2);
                      var6_int = (int)ql.field_j.getValue();
                      if (var6_int != this.field_j.field_u[param2]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (this.field_j.field_o == null) {
                            break L7;
                          } else {
                            if (null == this.field_j.field_o[param2]) {
                              break L7;
                            } else {
                              var30 = this.field_j.field_o[param2];
                              var29 = kb.a(var5, var18.length + -2, (byte) 99, 0);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (-65 >= (var11 ^ -1)) {
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
                            }
                          }
                        }
                        this.field_f.field_c = 0;
                        this.field_f.field_b = 0;
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
              this.field_f.a((byte) 88);
              ((dl) (var4)).c(param0 ^ -3);
              if (((dl) (var4)).field_v) {
                L9: {
                  if (!this.field_f.a(-99)) {
                    var4 = this.field_f.a(param0 ^ 125, true, param2, this.field_m, (byte) 2);
                    this.field_n.a((lh) (var4), true, (long)param2);
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
              var5[var18.length - 2] = (byte)(this.field_j.field_n[param2] >>> 932087816);
              var5[-1 + var18.length] = (byte)this.field_j.field_n[param2];
              if (null == this.field_x) {
                break L10;
              } else {
                discarded$3 = this.field_o.a(param0 + -125, param2, this.field_x, var18);
                if (this.field_i[param2] != 1) {
                  this.field_i[param2] = (byte) 1;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (((dl) (var4)).field_v) {
                break L11;
              } else {
                ((dl) (var4)).c(-1);
                break L11;
              }
            }
            return (dl) (var4);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var18.length) {
                      ql.field_j.reset();
                      ql.field_j.update(var5, 0, var18.length - 2);
                      var6_int = (int)ql.field_j.getValue();
                      if (var6_int == this.field_j.field_u[param2]) {
                        L14: {
                          if (this.field_j.field_o == null) {
                            break L14;
                          } else {
                            if (this.field_j.field_o[param2] == null) {
                              break L14;
                            } else {
                              var28 = this.field_j.field_o[param2];
                              var27 = kb.a(var5, -2 + var18.length, (byte) 124, 0);
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
                            }
                          }
                        }
                        var7 = ((var5[-2 + var18.length] & 255) << 519320712) + (var5[var18.length + -1] & 255);
                        if ((65535 & this.field_j.field_n[param2]) != var7) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            if ((this.field_i[param2] ^ -1) != -2) {
                              L17: {
                                if (-1 != (this.field_i[param2] ^ -1)) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_i[param2] = (byte) 1;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L18: {
                            if (((dl) (var4)).field_v) {
                              break L18;
                            } else {
                              ((dl) (var4)).c(-1);
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
              this.field_i[param2] = (byte)-1;
              ((dl) (var4)).c(param0 + -3);
              if (((dl) (var4)).field_v) {
                if (!this.field_f.a(-92)) {
                  var4 = this.field_f.a(param0 ^ 125, true, param2, this.field_m, (byte) 2);
                  this.field_n.a((lh) (var4), true, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (dl) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        dl discarded$0 = null;
        dl discarded$1 = null;
        int var4 = fleas.field_A ? 1 : 0;
        if (param0) {
            return;
        }
        if (!(null != this.field_p)) {
            return;
        }
        if (this.a(-1712) == null) {
            return;
        }
        lh var2 = this.field_s.c((byte) 47);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if ((var3 ^ -1) > -1) {
                var2.c(-1);
            } else {
                if (this.field_j.field_i <= var3) {
                    var2.c(-1);
                } else {
                    if (-1 == (this.field_j.field_f[var3] ^ -1)) {
                        var2.c(-1);
                    } else {
                        if (!(this.field_i[var3] != 0)) {
                            discarded$0 = this.a(2, 1, var3);
                        }
                        if (!(0 != (this.field_i[var3] ^ -1))) {
                            discarded$1 = this.a(2, 2, var3);
                        }
                        if (this.field_i[var3] == 1) {
                            var2.c(-1);
                        }
                    }
                }
            }
            var2 = this.field_s.b((byte) -105);
        }
    }

    final byte[] b(int param0, boolean param1) {
        dl var3 = this.a(2, 0, param0);
        if (var3 == null) {
            return null;
        }
        if (param1) {
            this.field_A = 116;
        }
        byte[] var4 = var3.g(100);
        var3.c(-1);
        return var4;
    }

    public static void b(int param0) {
        field_h = null;
        field_v = null;
        if (param0 != 1) {
            cg.a((java.math.BigInteger) null, -72, (ni) null, (ni) null, (java.math.BigInteger) null);
        }
    }

    cg(int param0, ah param1, ah param2, w param3, af param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_n = new hc(16);
        this.field_l = 0;
        this.field_s = new vc();
        this.field_w = 0L;
        try {
          L0: {
            L1: {
              this.field_m = param0;
              this.field_x = param1;
              if (this.field_x == null) {
                this.field_t = false;
                break L1;
              } else {
                this.field_t = true;
                this.field_p = new vc();
                break L1;
              }
            }
            L2: {
              this.field_e = param7;
              this.field_u = param6;
              this.field_r = param2;
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
              ((cg) (this)).field_k = stackIn_7_1 != 0;
              this.field_o = param4;
              this.field_f = param3;
              this.field_A = param5;
              if (null == this.field_r) {
                break L3;
              } else {
                this.field_g = (dl) ((Object) this.field_o.a(this.field_m, this.field_r, true));
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
            stackOut_10_1 = new StringBuilder().append("cg.<init>(").append(param0).append(',');
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
          throw pf.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_v = "Type your email address again to make sure it's correct";
        field_z = 0L;
        field_h = new fh(4, 1, 1, 1);
    }
}
