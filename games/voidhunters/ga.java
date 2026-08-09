/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends fnb {
    private pfa field_f;
    private int field_n;
    private gnb field_u;
    private qp field_t;
    private fo field_l;
    private int field_p;
    private fo field_j;
    static llb field_s;
    private byte[] field_k;
    private int field_w;
    private ona field_g;
    private byte[] field_d;
    private jtb field_r;
    private boolean field_o;
    private ij field_v;
    private ij field_i;
    private int field_h;
    private boolean field_q;
    private long field_e;
    private boolean field_m;

    final qp a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = VoidHunters.field_G;
        if (this.field_t != null) {
          return this.field_t;
        } else {
          L0: {
            if (null == this.field_r) {
              if (!this.field_g.d(126)) {
                this.field_r = (jtb) ((Object) this.field_g.a(true, param0 ^ -30, this.field_p, (byte) 0, 255));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!this.field_r.field_n) {
            if (param0 == 9) {
              L1: {
                var7 = this.field_r.a(param0 ^ -97);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (!(this.field_r instanceof jma)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_t = new qp(var7, this.field_n, this.field_k);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_g.a((byte) -25);
                      this.field_t = null;
                      if (this.field_g.d(param0 ^ 89)) {
                        this.field_r = null;
                        break L3;
                      } else {
                        this.field_r = (jtb) ((Object) this.field_g.a(true, param0 + -30, this.field_p, (byte) 0, 255));
                        break L3;
                      }
                    }
                    return null;
                  }
                  if (null != this.field_j) {
                    this.field_f.a(this.field_j, var7, (byte) 92, this.field_p);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_t = new qp(var7, this.field_n, this.field_k);
                        if (this.field_t.field_e == this.field_w) {
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
                      this.field_t = null;
                      if (this.field_g.d(121)) {
                        this.field_r = null;
                        break L5;
                      } else {
                        this.field_r = (jtb) ((Object) this.field_g.a(true, -21, this.field_p, (byte) 0, 255));
                        break L5;
                      }
                    }
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                this.field_r = null;
                if (null != this.field_l) {
                  this.field_d = new byte[this.field_t.field_l];
                  break L6;
                } else {
                  break L6;
                }
              }
              return this.field_t;
            } else {
              return (qp) null;
            }
          } else {
            return null;
          }
        }
    }

    final int a(int param0, boolean param1) {
        jtb var3 = (jtb) ((Object) this.field_u.a((long)param0, 122));
        if (!(var3 == null)) {
            return var3.e((byte) -4);
        }
        if (param1) {
            ga.c((byte) 114);
        }
        return 0;
    }

    final void b(int param0) {
        jtb discarded$0 = null;
        jtb discarded$1 = null;
        jtb discarded$2 = null;
        jtb discarded$3 = null;
        int var2_int;
        jtb var2;
        ksa var3;
        int var4;
        int var5;
        ksa var6;
        ksa var7;
        L0: {
          L1: {
            L2: {
              var5 = VoidHunters.field_G;
              if (this.field_i == null) {
                break L2;
              } else {
                if (this.a((byte) 9) != null) {
                  if (!this.field_o) {
                    if (!this.field_q) {
                      this.field_i = null;
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = this.field_i.d(0);
                      L3: while (true) {
                        if (var3 == null) {
                          L4: while (true) {
                            L5: {
                              if (this.field_h >= this.field_t.field_j.length) {
                                break L5;
                              } else {
                                L6: {
                                  if (-1 == (this.field_t.field_j[this.field_h] ^ -1)) {
                                    break L6;
                                  } else {
                                    if (!this.field_g.b((byte) 32)) {
                                      L7: {
                                        if (-2 != (this.field_d[this.field_h] ^ -1)) {
                                          discarded$0 = this.a(2, -26489, this.field_h);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      if (1 != this.field_d[this.field_h]) {
                                        var7 = new ksa();
                                        var7.field_b = (long)this.field_h;
                                        this.field_i.b(-10258, var7);
                                        var2_int = 0;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      var2_int = 0;
                                      break L5;
                                    }
                                  }
                                }
                                this.field_h = this.field_h + 1;
                                continue L4;
                              }
                            }
                            if (var2_int != 0) {
                              this.field_h = 0;
                              this.field_q = false;
                              break L2;
                            } else {
                              L8: {
                                if (param0 <= -27) {
                                  break L8;
                                } else {
                                  this.b((byte) -14);
                                  break L8;
                                }
                              }
                              if (!this.field_m) {
                                break L0;
                              } else {
                                if (this.field_e <= wt.a(false)) {
                                  var2 = (jtb) ((Object) this.field_u.c((byte) 48));
                                  L9: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L10: {
                                        if (var2.field_n) {
                                          break L10;
                                        } else {
                                          if (var2.field_k) {
                                            if (var2.field_l) {
                                              var2.b(-3846);
                                              break L10;
                                            } else {
                                              throw new RuntimeException();
                                            }
                                          } else {
                                            var2.field_k = true;
                                            break L10;
                                          }
                                        }
                                      }
                                      var2 = (jtb) ((Object) this.field_u.b(-91));
                                      continue L9;
                                    }
                                  }
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        } else {
                          L11: {
                            var4 = (int)var3.field_b;
                            if (this.field_d[var4] != 1) {
                              discarded$1 = this.a(2, -26489, var4);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if (-2 != (this.field_d[var4] ^ -1)) {
                              var2_int = 0;
                              break L12;
                            } else {
                              var3.b(-3846);
                              break L12;
                            }
                          }
                          var3 = this.field_i.a((byte) 121);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_i.d(0);
                    L13: while (true) {
                      if (var3 == null) {
                        L14: while (true) {
                          L15: {
                            if (this.field_t.field_j.length <= this.field_h) {
                              break L15;
                            } else {
                              L16: {
                                if (0 == this.field_t.field_j[this.field_h]) {
                                  break L16;
                                } else {
                                  if ((this.field_f.field_e ^ -1) > -251) {
                                    L17: {
                                      if (this.field_d[this.field_h] == 0) {
                                        discarded$2 = this.a(1, -26489, this.field_h);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    if (this.field_d[this.field_h] == 0) {
                                      var6 = new ksa();
                                      var6.field_b = (long)this.field_h;
                                      var2_int = 0;
                                      this.field_i.b(-10258, var6);
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    var2_int = 0;
                                    break L15;
                                  }
                                }
                              }
                              this.field_h = this.field_h + 1;
                              continue L14;
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            this.field_o = false;
                            this.field_h = 0;
                            break L2;
                          }
                        }
                      } else {
                        L18: {
                          var4 = (int)var3.field_b;
                          if (-1 == (this.field_d[var4] ^ -1)) {
                            discarded$3 = this.a(1, -26489, var4);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (this.field_d[var4] != 0) {
                            var3.b(-3846);
                            break L19;
                          } else {
                            var2_int = 0;
                            break L19;
                          }
                        }
                        var3 = this.field_i.a((byte) 80);
                        continue L13;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L20: {
              if (param0 <= -27) {
                break L20;
              } else {
                this.b((byte) -14);
                break L20;
              }
            }
            if (!this.field_m) {
              break L0;
            } else {
              if (this.field_e <= wt.a(false)) {
                var2 = (jtb) ((Object) this.field_u.c((byte) 48));
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (var2.field_n) {
                        break L22;
                      } else {
                        if (var2.field_k) {
                          if (var2.field_l) {
                            var2.b(-3846);
                            break L22;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_k = true;
                          break L22;
                        }
                      }
                    }
                    var2 = (jtb) ((Object) this.field_u.b(-91));
                    continue L21;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          this.field_e = wt.a(false) + 1000L;
          break L0;
        }
    }

    final void b(byte param0) {
        if (param0 > -9) {
            return;
        }
        if (null == this.field_l) {
            return;
        }
        this.field_q = true;
        if (this.field_i == null) {
            this.field_i = new ij();
        }
    }

    final byte[] a(int param0, int param1) {
        jtb var3 = this.a(0, -26489, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.a(-95);
        if (param0 <= 112) {
            return (byte[]) null;
        }
        var3.b(-3846);
        return var4;
    }

    final void c(int param0) {
        jtb discarded$0 = null;
        jtb discarded$1 = null;
        ksa var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (this.field_i != null) {
          if (this.a((byte) 9) != null) {
            var2 = this.field_v.d(param0);
            L0: while (true) {
              if (var2 == null) {
                return;
              } else {
                L1: {
                  L2: {
                    var3 = (int)var2.field_b;
                    if (0 > var3) {
                      break L2;
                    } else {
                      if (var3 >= this.field_t.field_l) {
                        break L2;
                      } else {
                        if (this.field_t.field_j[var3] == 0) {
                          break L2;
                        } else {
                          L3: {
                            if (-1 == (this.field_d[var3] ^ -1)) {
                              discarded$0 = this.a(1, -26489, var3);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            if (this.field_d[var3] == -1) {
                              discarded$1 = this.a(2, -26489, var3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if ((this.field_d[var3] ^ -1) != -2) {
                            break L1;
                          } else {
                            var2.b(-3846);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  var2.b(param0 + -3846);
                  break L1;
                }
                var2 = this.field_v.a((byte) 10);
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        int var1 = 110 % ((param0 - -65) / 33);
        field_s = null;
    }

    private final jtb a(int param0, int param1, int param2) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
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
        jtb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = VoidHunters.field_G;
        if (param1 == -26489) {
          L0: {
            var12 = (jtb) ((Object) this.field_u.a((long)param2, 100));
            var4 = var12;
            if (var12 == null) {
              break L0;
            } else {
              if (0 != param0) {
                break L0;
              } else {
                if (var12.field_l) {
                  break L0;
                } else {
                  if (!var12.field_n) {
                    break L0;
                  } else {
                    var12.b(-3846);
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
                if (param0 != 0) {
                  if (param0 != 1) {
                    if (param0 == 2) {
                      if (this.field_l == null) {
                        throw new RuntimeException();
                      } else {
                        if (this.field_d[param2] != -1) {
                          throw new RuntimeException();
                        } else {
                          if (!this.field_g.b((byte) 32)) {
                            var4 = this.field_g.a(false, -21, param2, (byte) 2, this.field_p);
                            break L2;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if (this.field_l == null) {
                      throw new RuntimeException();
                    } else {
                      var4 = this.field_f.a((byte) 121, this.field_l, param2);
                      break L2;
                    }
                  }
                } else {
                  L3: {
                    if (null == this.field_l) {
                      break L3;
                    } else {
                      if ((this.field_d[param2] ^ -1) == 0) {
                        break L3;
                      } else {
                        var4 = this.field_f.a(param2, this.field_l, (byte) 104);
                        break L2;
                      }
                    }
                  }
                  if (!this.field_g.d(104)) {
                    var4 = this.field_g.a(true, -21, param2, (byte) 2, this.field_p);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              this.field_u.a((long)param2, (ksa) (var4), (byte) -119);
              break L1;
            } else {
              break L1;
            }
          }
          if (!((jtb) (var4)).field_n) {
            var18 = ((jtb) (var4)).a(77);
            var13 = var18;
            var5 = var13;
            if (var4 instanceof jma) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if (-3 > (var18.length ^ -1)) {
                        gkb.field_p.reset();
                        gkb.field_p.update(var5, 0, var18.length - 2);
                        var6_int = (int)gkb.field_p.getValue();
                        if (this.field_t.field_d[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L6: {
                            if (this.field_t.field_c == null) {
                              break L6;
                            } else {
                              if (this.field_t.field_c[param2] != null) {
                                var29 = this.field_t.field_c[param2];
                                var30 = fqb.a((byte) 25, -2 + var18.length, var18, 0);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if (64 <= var11) {
                                    break L6;
                                  } else {
                                    if (var29[var11] != var30[var11]) {
                                      throw new RuntimeException();
                                    } else {
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          var7 = ((255 & var5[-2 + var18.length]) << 970126280) + (255 & var5[-1 + var18.length]);
                          if (var7 != (65535 & this.field_t.field_h[param2])) {
                            throw new RuntimeException();
                          } else {
                            L8: {
                              if ((this.field_d[param2] ^ -1) == -2) {
                                break L8;
                              } else {
                                L9: {
                                  if (this.field_d[param2] != 0) {
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.field_d[param2] = (byte) 1;
                                break L8;
                              }
                            }
                            L10: {
                              if (((jtb) (var4)).field_l) {
                                break L10;
                              } else {
                                ((jtb) (var4)).b(-3846);
                                break L10;
                              }
                            }
                            stackIn_92_0 = var4;
                            break L4;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_d[param2] = (byte)-1;
                ((jtb) (var4)).b(-3846);
                if (((jtb) (var4)).field_l) {
                  if (!this.field_g.d(92)) {
                    var4 = this.field_g.a(true, -21, param2, (byte) 2, this.field_p);
                    this.field_u.a((long)param2, (ksa) (var4), (byte) -127);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (jtb) ((Object) stackIn_92_0);
            } else {
              try {
                L11: {
                  L12: {
                    if (var5 == null) {
                      break L12;
                    } else {
                      if (2 < var18.length) {
                        gkb.field_p.reset();
                        gkb.field_p.update(var5, 0, var18.length - 2);
                        var6_int = (int)gkb.field_p.getValue();
                        if (this.field_t.field_d[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L13: {
                            if (this.field_t.field_c == null) {
                              break L13;
                            } else {
                              if (this.field_t.field_c[param2] != null) {
                                var28 = this.field_t.field_c[param2];
                                var27 = fqb.a((byte) 25, -2 + var18.length, var18, 0);
                                var9 = 0;
                                L14: while (true) {
                                  if ((var9 ^ -1) <= -65) {
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
                              } else {
                                break L13;
                              }
                            }
                          }
                          this.field_g.field_g = 0;
                          this.field_g.field_k = 0;
                          break L11;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L15: {
                  var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                  this.field_g.a((byte) -25);
                  ((jtb) (var4)).b(-3846);
                  if (((jtb) (var4)).field_l) {
                    if (!this.field_g.d(54)) {
                      var4 = this.field_g.a(true, -21, param2, (byte) 2, this.field_p);
                      this.field_u.a((long)param2, (ksa) (var4), (byte) -118);
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
              L16: {
                var5[var18.length + -2] = (byte)(this.field_t.field_h[param2] >>> 1040722088);
                var5[-1 + var18.length] = (byte)this.field_t.field_h[param2];
                if (null == this.field_l) {
                  break L16;
                } else {
                  this.field_f.a(this.field_l, var18, (byte) 111, param2);
                  stackIn_61_0 = -2;
                  stackIn_61_1 = this.field_d[param2] ^ -1;
                  if (stackIn_61_0 == stackIn_61_1) {
                    break L16;
                  } else {
                    this.field_d[param2] = (byte) 1;
                    break L16;
                  }
                }
              }
              L17: {
                if (((jtb) (var4)).field_l) {
                  break L17;
                } else {
                  ((jtb) (var4)).b(-3846);
                  break L17;
                }
              }
              return (jtb) (var4);
            }
          } else {
            return null;
          }
        } else {
          return (jtb) null;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (!li.field_i) {
            dma.e(param2, param3, param5, param4, param6, param0);
        } else {
            if (ne.field_v) {
                og.field_r.a(param5, (byte) 120, param6 | param0 << 246114328, param4, param3, param2);
            }
        }
        if (param1) {
            field_s = (llb) null;
        }
    }

    ga(int param0, fo param1, fo param2, ona param3, pfa param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_u = new gnb(16);
        this.field_h = 0;
        this.field_v = new ij();
        this.field_e = 0L;
        try {
          L0: {
            L1: {
              this.field_p = param0;
              this.field_l = param1;
              if (null == this.field_l) {
                this.field_o = false;
                break L1;
              } else {
                this.field_o = true;
                this.field_i = new ij();
                break L1;
              }
            }
            L2: {
              this.field_j = param2;
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
              ((ga) (this)).field_m = stackIn_7_1 != 0;
              this.field_f = param4;
              this.field_g = param3;
              this.field_k = param6;
              this.field_w = param7;
              this.field_n = param5;
              if (this.field_j == null) {
                break L3;
              } else {
                this.field_r = (jtb) ((Object) this.field_f.a(this.field_p, this.field_j, (byte) -65));
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

            stackIn_12_1 = new StringBuilder().append("ga.<init>(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
