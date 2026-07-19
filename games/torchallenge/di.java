/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends kl {
    private rb field_y;
    private int field_s;
    static ka[] field_t;
    private vb field_G;
    private la field_v;
    private sh field_u;
    private int field_z;
    private int field_l;
    private byte[] field_k;
    private byte[] field_i;
    private tf field_C;
    static vi field_g;
    static int field_A;
    static byte[][] field_E;
    private ha field_j;
    private la field_o;
    static char field_m;
    private boolean field_q;
    private sl field_D;
    private boolean field_h;
    private int field_r;
    static k field_F;
    static String field_B;
    static String field_n;
    private sl field_w;
    private boolean field_x;
    private long field_p;

    final tf b(int param0) {
        al discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_g = (vi) null;
            break L0;
          }
        }
        if (null != this.field_C) {
          return this.field_C;
        } else {
          L1: {
            if (this.field_u != null) {
              break L1;
            } else {
              if (!this.field_G.b((byte) 100)) {
                this.field_u = (sh) ((Object) this.field_G.a(true, 255, this.field_z, (byte) 0, param0 + 63));
                break L1;
              } else {
                return null;
              }
            }
          }
          if (!this.field_u.field_v) {
            L2: {
              var7 = this.field_u.e(2);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (this.field_u instanceof al) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_C = new tf(var7, this.field_l, this.field_i);
                      if (this.field_s == this.field_C.field_b) {
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_C = null;
                    if (!this.field_G.b((byte) 100)) {
                      this.field_u = (sh) ((Object) this.field_G.a(true, 255, this.field_z, (byte) 0, 75));
                      break L4;
                    } else {
                      this.field_u = null;
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
                      this.field_C = new tf(var7, this.field_l, this.field_i);
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_G.c(-30317);
                    this.field_C = null;
                    if (!this.field_G.b((byte) 100)) {
                      this.field_u = (sh) ((Object) this.field_G.a(true, 255, this.field_z, (byte) 0, 90));
                      break L6;
                    } else {
                      this.field_u = null;
                      break L6;
                    }
                  }
                  return null;
                }
                if (null != this.field_o) {
                  discarded$1 = this.field_y.a(this.field_z, this.field_o, (byte) 111, var7);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L7: {
              this.field_u = null;
              if (this.field_v == null) {
                break L7;
              } else {
                this.field_k = new byte[this.field_C.field_r];
                break L7;
              }
            }
            return this.field_C;
          } else {
            return null;
          }
        }
    }

    private final sh a(int param0, int param1, boolean param2) {
        al discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sh var12 = null;
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
          var10 = TorChallenge.field_F ? 1 : 0;
          var12 = (sh) ((Object) this.field_j.a((byte) 112, (long)param0));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (-1 != (param1 ^ -1)) {
              break L0;
            } else {
              if (var12.field_s) {
                break L0;
              } else {
                if (var12.field_v) {
                  var12.a(true);
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
              if (param1 != 0) {
                if (1 == param1) {
                  if (null == this.field_v) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_y.a(param0, 3, this.field_v);
                    break L2;
                  }
                } else {
                  if (2 != param1) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_v == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 != this.field_k[param0]) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_G.a(true)) {
                          var4 = this.field_G.a(false, this.field_z, param0, (byte) 2, 60);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              } else {
                L3: {
                  if (this.field_v == null) {
                    break L3;
                  } else {
                    if (this.field_k[param0] != -1) {
                      var4 = this.field_y.a(this.field_v, true, param0);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_G.b((byte) 100)) {
                  var4 = this.field_G.a(true, this.field_z, param0, (byte) 2, 92);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_j.a(-111, (da) (var4), (long)param0);
            break L1;
          }
        }
        L4: {
          if (!param2) {
            break L4;
          } else {
            this.field_q = true;
            break L4;
          }
        }
        if (!((sh) (var4)).field_v) {
          var18 = ((sh) (var4)).e(2);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof al)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var18.length <= 2) {
                      break L6;
                    } else {
                      vc.field_c.reset();
                      vc.field_c.update(var5, 0, -2 + var18.length);
                      var6_int = (int)vc.field_c.getValue();
                      if (this.field_C.field_t[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_C.field_n) {
                            break L7;
                          } else {
                            if (null == this.field_C.field_n[param0]) {
                              break L7;
                            } else {
                              var29 = this.field_C.field_n[param0];
                              var30 = qc.a(var5, -2 + var18.length, (byte) -82, 0);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
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
                        this.field_G.field_h = 0;
                        this.field_G.field_b = 0;
                        break L5;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_G.c(-30317);
                ((sh) (var4)).a(true);
                if (((sh) (var4)).field_s) {
                  if (!this.field_G.b((byte) 100)) {
                    var4 = this.field_G.a(true, this.field_z, param0, (byte) 2, 108);
                    this.field_j.a(47, (da) (var4), (long)param0);
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
              var5[-2 + var18.length] = (byte)(this.field_C.field_d[param0] >>> -452775096);
              var5[-1 + var18.length] = (byte)this.field_C.field_d[param0];
              if (null != this.field_v) {
                discarded$1 = this.field_y.a(param0, this.field_v, (byte) 111, var18);
                if (-2 == (this.field_k[param0] ^ -1)) {
                  break L10;
                } else {
                  this.field_k[param0] = (byte) 1;
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (((sh) (var4)).field_s) {
                break L11;
              } else {
                ((sh) (var4)).a(true);
                break L11;
              }
            }
            return (sh) (var4);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var18.length) {
                      vc.field_c.reset();
                      vc.field_c.update(var5, 0, var18.length + -2);
                      var6_int = (int)vc.field_c.getValue();
                      if (this.field_C.field_t[param0] == var6_int) {
                        L14: {
                          if (this.field_C.field_n == null) {
                            break L14;
                          } else {
                            if (null == this.field_C.field_n[param0]) {
                              break L14;
                            } else {
                              var27 = this.field_C.field_n[param0];
                              var28 = qc.a(var5, var18.length - 2, (byte) -117, 0);
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
                            }
                          }
                        }
                        var7 = (65280 & var5[-2 + var18.length] << 178669832) + (var5[var18.length + -1] & 255);
                        if (var7 != (this.field_C.field_d[param0] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            if (this.field_k[param0] == 1) {
                              break L16;
                            } else {
                              L17: {
                                if (this.field_k[param0] != 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_k[param0] = (byte) 1;
                              break L16;
                            }
                          }
                          L18: {
                            if (((sh) (var4)).field_s) {
                              break L18;
                            } else {
                              ((sh) (var4)).a(true);
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
              this.field_k[param0] = (byte)-1;
              ((sh) (var4)).a(true);
              if (((sh) (var4)).field_s) {
                L19: {
                  if (!this.field_G.b((byte) 100)) {
                    var4 = this.field_G.a(true, this.field_z, param0, (byte) 2, 79);
                    this.field_j.a(-100, (da) (var4), (long)param0);
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
            return (sh) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        int discarded$0 = 0;
        if (param0 != 14) {
            discarded$0 = this.a(-90, -21);
        }
        if (!(null != this.field_v)) {
            return;
        }
        this.field_h = true;
        if (!(this.field_D != null)) {
            this.field_D = new sl();
        }
    }

    final byte[] a(int param0, byte param1) {
        sh var3 = this.a(param0, 0, false);
        if (var3 == null) {
            return null;
        }
        if (param1 != -72) {
            di.a(true);
        }
        byte[] var4 = var3.e(param1 + 74);
        var3.a(true);
        return var4;
    }

    final void c(int param0) {
        byte[] discarded$5 = null;
        sh discarded$6 = null;
        sh discarded$7 = null;
        sh discarded$8 = null;
        sh discarded$9 = null;
        sh var2 = null;
        int var2_int = 0;
        da var3 = null;
        int var4 = 0;
        int var5 = 0;
        da var6 = null;
        da var7 = null;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 <= -43) {
            break L0;
          } else {
            discarded$5 = this.a(92, (byte) -25);
            break L0;
          }
        }
        L1: {
          if (this.field_D == null) {
            break L1;
          } else {
            if (null == this.b(0)) {
              return;
            } else {
              if (!this.field_q) {
                if (this.field_h) {
                  var2_int = 1;
                  var3 = this.field_D.c((byte) 123);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (this.field_C.field_e.length <= this.field_r) {
                            break L4;
                          } else {
                            L5: {
                              if (-1 == (this.field_C.field_e[this.field_r] ^ -1)) {
                                break L5;
                              } else {
                                if (!this.field_G.a(true)) {
                                  L6: {
                                    if ((this.field_k[this.field_r] ^ -1) == -2) {
                                      break L6;
                                    } else {
                                      discarded$6 = this.a(this.field_r, 2, false);
                                      break L6;
                                    }
                                  }
                                  if (this.field_k[this.field_r] != 1) {
                                    var7 = new da();
                                    var7.field_d = (long)this.field_r;
                                    this.field_D.a(var7, -62);
                                    var2_int = 0;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L4;
                                }
                              }
                            }
                            this.field_r = this.field_r + 1;
                            continue L3;
                          }
                        }
                        if (var2_int != 0) {
                          this.field_r = 0;
                          this.field_h = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_d;
                        if (this.field_k[var4] != 1) {
                          discarded$7 = this.a(var4, 2, false);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (-2 != (this.field_k[var4] ^ -1)) {
                          var2_int = 0;
                          break L8;
                        } else {
                          var3.a(true);
                          break L8;
                        }
                      }
                      var3 = this.field_D.c(-270);
                      continue L2;
                    }
                  }
                } else {
                  this.field_D = null;
                  break L1;
                }
              } else {
                var2_int = 1;
                var3 = this.field_D.c((byte) 114);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (this.field_C.field_e.length <= this.field_r) {
                          break L11;
                        } else {
                          if (this.field_C.field_e[this.field_r] != 0) {
                            if (250 <= this.field_y.field_e) {
                              var2_int = 0;
                              break L11;
                            } else {
                              L12: {
                                if (0 != this.field_k[this.field_r]) {
                                  break L12;
                                } else {
                                  discarded$8 = this.a(this.field_r, 1, false);
                                  break L12;
                                }
                              }
                              L13: {
                                if (0 == this.field_k[this.field_r]) {
                                  var6 = new da();
                                  var6.field_d = (long)this.field_r;
                                  var2_int = 0;
                                  this.field_D.a(var6, -36);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.field_r = this.field_r + 1;
                              continue L10;
                            }
                          } else {
                            this.field_r = this.field_r + 1;
                            continue L10;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        this.field_q = false;
                        this.field_r = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_d;
                      if (0 == this.field_k[var4]) {
                        discarded$9 = this.a(var4, 1, false);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (this.field_k[var4] != 0) {
                        var3.a(true);
                        break L15;
                      } else {
                        var2_int = 0;
                        break L15;
                      }
                    }
                    var3 = this.field_D.c(-270);
                    continue L9;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (!this.field_x) {
            break L16;
          } else {
            if ((this.field_p ^ -1L) >= (ol.a(256) ^ -1L)) {
              var2 = (sh) ((Object) this.field_j.a((byte) -73));
              L17: while (true) {
                if (var2 == null) {
                  this.field_p = ol.a(256) + 1000L;
                  break L16;
                } else {
                  L18: {
                    if (!var2.field_v) {
                      if (!var2.field_p) {
                        var2.field_p = true;
                        break L18;
                      } else {
                        if (!var2.field_s) {
                          throw new RuntimeException();
                        } else {
                          var2.a(true);
                          break L18;
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  var2 = (sh) ((Object) this.field_j.a(-27377));
                  continue L17;
                }
              }
            } else {
              break L16;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_B = null;
        field_t = null;
        field_n = null;
        field_F = null;
        field_E = (byte[][]) null;
    }

    final void a(byte param0) {
        sh discarded$2 = null;
        sh discarded$3 = null;
        da var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null == this.field_D) {
          return;
        } else {
          if (this.b(0) == null) {
            return;
          } else {
            L0: {
              if (param0 < -107) {
                break L0;
              } else {
                this.field_p = 74L;
                break L0;
              }
            }
            var2 = this.field_w.c((byte) -61);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_d;
                  if ((var3 ^ -1) <= -1) {
                    if (this.field_C.field_r > var3) {
                      if (-1 == (this.field_C.field_e[var3] ^ -1)) {
                        var2.a(true);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_k[var3] != 0) {
                            break L3;
                          } else {
                            discarded$2 = this.a(var3, 1, false);
                            break L3;
                          }
                        }
                        L4: {
                          if ((this.field_k[var3] ^ -1) != 0) {
                            break L4;
                          } else {
                            discarded$3 = this.a(var3, 2, false);
                            break L4;
                          }
                        }
                        if (this.field_k[var3] != 1) {
                          break L2;
                        } else {
                          var2.a(true);
                          break L2;
                        }
                      }
                    } else {
                      var2.a(true);
                      break L2;
                    }
                  } else {
                    var2.a(true);
                    break L2;
                  }
                }
                var2 = this.field_w.c(-270);
                continue L1;
              }
            }
          }
        }
    }

    final int a(int param0, int param1) {
        tf discarded$0 = null;
        sh var3 = (sh) ((Object) this.field_j.a((byte) 91, (long)param1));
        if (param0 != 0) {
            discarded$0 = this.b(124);
        }
        if (var3 != null) {
            return var3.f(100);
        }
        return 0;
    }

    di(int param0, la param1, la param2, vb param3, rb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_j = new ha(16);
        this.field_r = 0;
        this.field_w = new sl();
        this.field_p = 0L;
        try {
          L0: {
            L1: {
              this.field_v = param1;
              this.field_z = param0;
              if (null != this.field_v) {
                this.field_q = true;
                this.field_D = new sl();
                break L1;
              } else {
                this.field_q = false;
                break L1;
              }
            }
            L2: {
              this.field_s = param7;
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
              ((di) (this)).field_x = stackIn_7_1 != 0;
              this.field_o = param2;
              this.field_i = param6;
              this.field_G = param3;
              this.field_y = param4;
              this.field_l = param5;
              if (null == this.field_o) {
                break L3;
              } else {
                this.field_u = (sh) ((Object) this.field_y.a(this.field_o, true, this.field_z));
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
            stackOut_10_1 = new StringBuilder().append("di.<init>(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_E = new byte[1000][];
        field_g = new vi();
        field_F = new k(14, 0, 4, 1);
        field_B = " - Not available to this monk.";
        field_n = "achievements to collect";
    }
}
