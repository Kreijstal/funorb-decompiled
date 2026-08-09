/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends lc {
    private ua field_r;
    private byte[] field_v;
    private int field_t;
    static u field_g;
    private rn field_k;
    private ti field_f;
    private ua field_o;
    private byte[] field_u;
    private ci field_p;
    static int[] field_A;
    private ar field_w;
    private int field_z;
    private int field_j;
    static boolean field_n;
    static String field_y;
    private jc field_l;
    private int field_q;
    private pf field_h;
    private boolean field_x;
    private pf field_i;
    private boolean field_m;
    private long field_e;
    private boolean field_s;

    final void c(int param0) {
        jc discarded$0 = null;
        if (!(null != this.field_r)) {
            return;
        }
        this.field_m = true;
        if (param0 != 255) {
            discarded$0 = this.a(21, -34, 75);
        }
        if (null == this.field_h) {
            this.field_h = new pf();
        }
    }

    final void b(boolean param0) {
        jc discarded$0 = null;
        jc discarded$1 = null;
        jc discarded$2 = null;
        jc discarded$3 = null;
        int var2_int;
        jc var2;
        oh var3;
        int var4;
        int var5;
        oh var6;
        oh var7;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.field_l = (jc) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (this.field_h == null) {
                break L3;
              } else {
                if (null != this.a(6)) {
                  if (!this.field_x) {
                    if (this.field_m) {
                      var2_int = 1;
                      var3 = this.field_h.d(0);
                      L4: while (true) {
                        if (var3 == null) {
                          L5: while (true) {
                            L6: {
                              if (this.field_q >= this.field_p.field_n.length) {
                                break L6;
                              } else {
                                L7: {
                                  if (this.field_p.field_n[this.field_q] == 0) {
                                    break L7;
                                  } else {
                                    if (this.field_w.c((byte) -98)) {
                                      var2_int = 0;
                                      break L6;
                                    } else {
                                      L8: {
                                        if (this.field_u[this.field_q] == 1) {
                                          break L8;
                                        } else {
                                          discarded$0 = this.a(2, 0, this.field_q);
                                          break L8;
                                        }
                                      }
                                      if ((this.field_u[this.field_q] ^ -1) != -2) {
                                        var7 = new oh();
                                        var7.field_b = (long)this.field_q;
                                        this.field_h.a((byte) -113, var7);
                                        var2_int = 0;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                this.field_q = this.field_q + 1;
                                continue L5;
                              }
                            }
                            if (var2_int == 0) {
                              break L3;
                            } else {
                              this.field_q = 0;
                              this.field_m = false;
                              break L3;
                            }
                          }
                        } else {
                          L9: {
                            var4 = (int)var3.field_b;
                            if (this.field_u[var4] != 1) {
                              discarded$1 = this.a(2, 0, var4);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (this.field_u[var4] != 1) {
                              var2_int = 0;
                              break L10;
                            } else {
                              var3.b((byte) -70);
                              break L10;
                            }
                          }
                          var3 = this.field_h.a((byte) -71);
                          continue L4;
                        }
                      }
                    } else {
                      this.field_h = null;
                      break L3;
                    }
                  } else {
                    var2_int = 1;
                    var3 = this.field_h.d(0);
                    L11: while (true) {
                      if (var3 == null) {
                        L12: while (true) {
                          L13: {
                            if (this.field_q >= this.field_p.field_n.length) {
                              break L13;
                            } else {
                              if (-1 != (this.field_p.field_n[this.field_q] ^ -1)) {
                                if (this.field_k.field_d < 250) {
                                  L14: {
                                    if (this.field_u[this.field_q] == 0) {
                                      discarded$2 = this.a(1, 0, this.field_q);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (this.field_u[this.field_q] != 0) {
                                      break L15;
                                    } else {
                                      var6 = new oh();
                                      var6.field_b = (long)this.field_q;
                                      var2_int = 0;
                                      this.field_h.a((byte) -113, var6);
                                      break L15;
                                    }
                                  }
                                  this.field_q = this.field_q + 1;
                                  continue L12;
                                } else {
                                  var2_int = 0;
                                  break L13;
                                }
                              } else {
                                this.field_q = this.field_q + 1;
                                continue L12;
                              }
                            }
                          }
                          if (var2_int != 0) {
                            this.field_q = 0;
                            this.field_x = false;
                            break L3;
                          } else {
                            if (!this.field_s) {
                              break L1;
                            } else {
                              if (pr.a(14274) >= this.field_e) {
                                var2 = (jc) ((Object) this.field_f.c(77));
                                L16: while (true) {
                                  if (var2 == null) {
                                    break L2;
                                  } else {
                                    L17: {
                                      if (!var2.field_u) {
                                        if (var2.field_t) {
                                          if (var2.field_q) {
                                            var2.b((byte) -60);
                                            break L17;
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        } else {
                                          var2.field_t = true;
                                          break L17;
                                        }
                                      } else {
                                        break L17;
                                      }
                                    }
                                    var2 = (jc) ((Object) this.field_f.a(false));
                                    continue L16;
                                  }
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      } else {
                        L18: {
                          var4 = (int)var3.field_b;
                          if (0 != this.field_u[var4]) {
                            break L18;
                          } else {
                            discarded$3 = this.a(1, 0, var4);
                            break L18;
                          }
                        }
                        L19: {
                          if (this.field_u[var4] != 0) {
                            var3.b((byte) -76);
                            break L19;
                          } else {
                            var2_int = 0;
                            break L19;
                          }
                        }
                        var3 = this.field_h.a((byte) -71);
                        continue L11;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            if (!this.field_s) {
              break L1;
            } else {
              if (pr.a(14274) >= this.field_e) {
                var2 = (jc) ((Object) this.field_f.c(77));
                L20: while (true) {
                  if (var2 == null) {
                    break L2;
                  } else {
                    L21: {
                      if (!var2.field_u) {
                        if (var2.field_t) {
                          if (var2.field_q) {
                            var2.b((byte) -60);
                            break L21;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_t = true;
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    var2 = (jc) ((Object) this.field_f.a(false));
                    continue L20;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          this.field_e = pr.a(14274) - -1000L;
          break L1;
        }
    }

    final void a(byte param0) {
        jc discarded$0 = null;
        jc discarded$1 = null;
        oh var2;
        int var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != this.field_h) {
          if (this.a(param0 + -59) != null) {
            var2 = this.field_i.d(0);
            L0: while (true) {
              if (var2 == null) {
                L1: {
                  if (param0 == 65) {
                    break L1;
                  } else {
                    this.c(-101);
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_b;
                  if ((var3 ^ -1) <= -1) {
                    if (this.field_p.field_a > var3) {
                      if (-1 == (this.field_p.field_n[var3] ^ -1)) {
                        var2.b((byte) -85);
                        break L2;
                      } else {
                        L3: {
                          if (this.field_u[var3] == 0) {
                            discarded$0 = this.a(1, 0, var3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (this.field_u[var3] != -1) {
                            break L4;
                          } else {
                            discarded$1 = this.a(2, 0, var3);
                            break L4;
                          }
                        }
                        if ((this.field_u[var3] ^ -1) == -2) {
                          var2.b((byte) -90);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var2.b((byte) -85);
                      break L2;
                    }
                  } else {
                    var2.b((byte) -85);
                    break L2;
                  }
                }
                var2 = this.field_i.a((byte) -71);
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

    final static void d(int param0) {
        gm.field_m.a(lp.field_v.field_K - (ns.field_pb ? 42 + (pe.field_K - -2) : 0), 18, (byte) 39, 0, 0);
        sf.field_f.a(42 + pe.field_K, param0, (byte) 42, 0, -40 + (lp.field_v.field_K - (pe.field_K - -2)));
        ls.field_a.a(lp.field_v.field_K, 20, 0, 2, -122, lp.field_v.field_mb + -20, pe.field_K);
    }

    final ci a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_p) {
          L0: {
            if (null != this.field_l) {
              break L0;
            } else {
              if (!this.field_w.c(27356)) {
                this.field_l = (jc) ((Object) this.field_w.a(true, 255, (byte) 0, -2057056416, this.field_j));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_l.field_u) {
            L1: {
              var8 = this.field_l.e((byte) 50);
              var6 = var8;
              var5 = var6;
              var9 = var5;
              var7 = var9;
              var2 = var7;
              if (this.field_l instanceof ak) {
                try {
                  L2: {
                    if (var2 != null) {
                      this.field_p = new ci(var9, this.field_z, this.field_v);
                      if (this.field_t != this.field_p.field_e) {
                        throw new RuntimeException();
                      } else {
                        break L2;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_p = null;
                    if (this.field_w.c(27356)) {
                      this.field_l = null;
                      break L3;
                    } else {
                      this.field_l = (jc) ((Object) this.field_w.a(true, 255, (byte) 0, -2057056416, this.field_j));
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_p = new ci(var8, this.field_z, this.field_v);
                      break L4;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    this.field_w.b((byte) -91);
                    this.field_p = null;
                    if (this.field_w.c(27356)) {
                      this.field_l = null;
                      break L5;
                    } else {
                      this.field_l = (jc) ((Object) this.field_w.a(true, 255, (byte) 0, -2057056416, this.field_j));
                      break L5;
                    }
                  }
                  return null;
                }
                if (null == this.field_o) {
                  break L1;
                } else {
                  this.field_k.a(this.field_j, this.field_o, -51, var8);
                  break L1;
                }
              }
            }
            L6: {
              if (param0 == 6) {
                break L6;
              } else {
                field_y = (String) null;
                break L6;
              }
            }
            L7: {
              if (null == this.field_r) {
                break L7;
              } else {
                this.field_u = new byte[this.field_p.field_a];
                break L7;
              }
            }
            this.field_l = null;
            return this.field_p;
          } else {
            return null;
          }
        } else {
          return this.field_p;
        }
    }

    final int a(int param0, byte param1) {
        jc var3 = (jc) ((Object) this.field_f.a((long)param0, -25064));
        if (var3 != null) {
            return var3.e(0);
        }
        int var4 = -32 / ((param1 - -3) / 58);
        return 0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_y = null;
        if (param0 != 114) {
            p.d(24);
        }
        field_A = null;
    }

    final byte[] a(byte param0, int param1) {
        jc var3 = this.a(0, 0, param1);
        if (var3 == null) {
            return null;
        }
        int var5 = 84 % ((param0 - -51) / 33);
        byte[] var4 = var3.e((byte) 109);
        var3.b((byte) -60);
        return var4;
    }

    private final jc a(int param0, int param1, int param2) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        Object stackIn_89_0 = null;
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
        jc var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            this.a(55, (byte) -28);
            break L0;
          }
        }
        L1: {
          var12 = (jc) ((Object) this.field_f.a((long)param2, -25064));
          var4 = var12;
          if (var12 == null) {
            break L1;
          } else {
            if (param0 != 0) {
              break L1;
            } else {
              if (var12.field_q) {
                break L1;
              } else {
                if (var12.field_u) {
                  var12.b((byte) -76);
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
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              if (-1 != (param0 ^ -1)) {
                if (-2 != (param0 ^ -1)) {
                  if ((param0 ^ -1) != -3) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_r != null) {
                      if (-1 != this.field_u[param2]) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_w.c((byte) -115)) {
                          var4 = this.field_w.a(false, this.field_j, (byte) 2, -2057056416, param2);
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } else {
                  if (null != this.field_r) {
                    var4 = this.field_k.a(this.field_r, param2, 13514);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L4: {
                  if (this.field_r == null) {
                    break L4;
                  } else {
                    if ((this.field_u[param2] ^ -1) != 0) {
                      var4 = this.field_k.a(param2, this.field_r, 1);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_w.c(param1 ^ 27356)) {
                  var4 = this.field_w.a(true, this.field_j, (byte) 2, -2057056416, param2);
                  break L3;
                } else {
                  return null;
                }
              }
            }
            this.field_f.a((oh) (var4), -120, (long)param2);
            break L2;
          }
        }
        if (!((jc) (var4)).field_u) {
          var18 = ((jc) (var4)).e((byte) 82);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof ak) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (2 < var18.length) {
                      ti.field_k.reset();
                      ti.field_k.update(var5, 0, var18.length + -2);
                      var6_int = (int)ti.field_k.getValue();
                      if (this.field_p.field_f[param2] == var6_int) {
                        L7: {
                          if (null == this.field_p.field_j) {
                            break L7;
                          } else {
                            if (this.field_p.field_j[param2] == null) {
                              break L7;
                            } else {
                              var30 = this.field_p.field_j[param2];
                              var29 = dp.a(var5, var18.length + -2, param1 ^ -26131, 0);
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
                        var7 = ((var5[var18.length + -2] & 255) << 1021580552) - -(var5[var18.length + -1] & 255);
                        if (var7 == (this.field_p.field_v[param2] & 65535)) {
                          L9: {
                            if (1 == this.field_u[param2]) {
                              break L9;
                            } else {
                              L10: {
                                if (this.field_u[param2] == 0) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_u[param2] = (byte) 1;
                              break L9;
                            }
                          }
                          L11: {
                            if (!((jc) (var4)).field_q) {
                              ((jc) (var4)).b((byte) -70);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          stackIn_89_0 = var4;
                          break L5;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
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
                this.field_u[param2] = (byte)-1;
                ((jc) (var4)).b((byte) -124);
                if (((jc) (var4)).field_q) {
                  if (!this.field_w.c(27356)) {
                    var4 = this.field_w.a(true, this.field_j, (byte) 2, -2057056416, param2);
                    this.field_f.a((oh) (var4), 81, (long)param2);
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
            return (jc) ((Object) stackIn_89_0);
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if (2 >= var18.length) {
                      break L14;
                    } else {
                      ti.field_k.reset();
                      ti.field_k.update(var5, 0, var18.length - 2);
                      var6_int = (int)ti.field_k.getValue();
                      if (var6_int == this.field_p.field_f[param2]) {
                        L15: {
                          if (null == this.field_p.field_j) {
                            break L15;
                          } else {
                            if (this.field_p.field_j[param2] == null) {
                              break L15;
                            } else {
                              var27 = this.field_p.field_j[param2];
                              var28 = dp.a(var5, -2 + var18.length, param1 ^ -26131, 0);
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
                        this.field_w.field_a = 0;
                        this.field_w.field_p = 0;
                        break L13;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L17: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                this.field_w.b((byte) -91);
                ((jc) (var4)).b((byte) -68);
                if (((jc) (var4)).field_q) {
                  if (!this.field_w.c(27356)) {
                    var4 = this.field_w.a(true, this.field_j, (byte) 2, -2057056416, param2);
                    this.field_f.a((oh) (var4), 64, (long)param2);
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
              var5[var18.length + -2] = (byte)(this.field_p.field_v[param2] >>> 793013800);
              var5[-1 + var18.length] = (byte)this.field_p.field_v[param2];
              if (this.field_r == null) {
                break L18;
              } else {
                this.field_k.a(param2, this.field_r, -61, var18);
                stackIn_59_0 = -2;
                stackIn_59_1 = this.field_u[param2] ^ -1;
                if (stackIn_59_0 != stackIn_59_1) {
                  this.field_u[param2] = (byte) 1;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (((jc) (var4)).field_q) {
                break L19;
              } else {
                ((jc) (var4)).b((byte) -128);
                break L19;
              }
            }
            return (jc) (var4);
          }
        } else {
          return null;
        }
    }

    p(int param0, ua param1, ua param2, ar param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_f = new ti(16);
        this.field_q = 0;
        this.field_i = new pf();
        this.field_e = 0L;
        try {
          L0: {
            L1: {
              this.field_j = param0;
              this.field_r = param1;
              if (this.field_r != null) {
                this.field_x = true;
                this.field_h = new pf();
                break L1;
              } else {
                this.field_x = false;
                break L1;
              }
            }
            L2: {
              this.field_z = param5;
              this.field_t = param7;
              this.field_k = param4;
              this.field_v = param6;
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
              ((p) (this)).field_s = stackIn_7_1 != 0;
              this.field_w = param3;
              this.field_o = param2;
              if (null == this.field_o) {
                break L3;
              } else {
                this.field_l = (jc) ((Object) this.field_k.a(this.field_j, this.field_o, 1));
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

            stackIn_12_1 = new StringBuilder().append("p.<init>(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_g = new u();
        field_y = "<%0> has joined your game.";
    }
}
