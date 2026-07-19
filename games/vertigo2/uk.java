/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ab {
    private int field_A;
    private byte[] field_g;
    static er[] field_r;
    static od field_v;
    private int field_z;
    private t field_p;
    private rk field_s;
    private jl field_q;
    static cr field_e;
    private tk field_w;
    private int field_t;
    static String field_u;
    private qh field_k;
    private qh field_i;
    static String field_y;
    private ff field_x;
    private byte[] field_l;
    private nj field_j;
    private boolean field_m;
    private nj field_h;
    private int field_B;
    private boolean field_n;
    private long field_o;
    private boolean field_f;

    final static void d(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == eh.field_b) {
                  break L2;
                } else {
                  if (null != qb.field_b) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qb.field_b = new int[256];
              eh.field_b = new int[256];
              var1_int = 0;
              L3: while (true) {
                if (256 <= var1_int) {
                  break L1;
                } else {
                  var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                  eh.field_b[var1_int] = (int)(4096.0 * Math.sin(var2));
                  qb.field_b[var1_int] = (int)(Math.cos(var2) * 4096.0);
                  var1_int++;
                  continue L3;
                }
              }
            }
            var1_int = -28 / ((param0 - -6) / 43);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "uk.D(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        if (!(null != this.field_i)) {
            return;
        }
        this.field_n = true;
        if (this.field_j == null) {
            this.field_j = new nj();
        }
        if (param0 < 74) {
            this.field_h = (nj) null;
        }
    }

    public static void b(byte param0) {
        field_u = null;
        field_v = null;
        field_e = null;
        field_y = null;
        field_r = null;
        int var1 = -43 % ((param0 - 23) / 39);
    }

    final byte[] a(boolean param0, int param1) {
        if (!param0) {
            uk.b((byte) 0);
        }
        rk var3 = this.a(101, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.a((byte) -106);
        var3.c(2);
        return var4;
    }

    final void c(byte param0) {
        rk discarded$2 = null;
        rk discarded$3 = null;
        li var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != this.field_j) {
          if (param0 == -94) {
            if (this.a(true) != null) {
              var2 = this.field_h.a((byte) 100);
              L0: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  L1: {
                    L2: {
                      var3 = (int)var2.field_k;
                      if (-1 < (var3 ^ -1)) {
                        break L2;
                      } else {
                        if (var3 >= this.field_x.field_p) {
                          break L2;
                        } else {
                          if (this.field_x.field_h[var3] != 0) {
                            L3: {
                              if (this.field_g[var3] != 0) {
                                break L3;
                              } else {
                                discarded$2 = this.a(101, 1, var3);
                                break L3;
                              }
                            }
                            L4: {
                              if ((this.field_g[var3] ^ -1) == 0) {
                                discarded$3 = this.a(-66, 2, var3);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            if (1 != this.field_g[var3]) {
                              break L1;
                            } else {
                              var2.c(2);
                              break L1;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var2.c(param0 + 96);
                    break L1;
                  }
                  var2 = this.field_h.b(27);
                  continue L0;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        rk discarded$4 = null;
        rk discarded$5 = null;
        rk discarded$6 = null;
        rk discarded$7 = null;
        int var2_int = 0;
        rk var2 = null;
        li var3 = null;
        int var4 = 0;
        int var5 = 0;
        li var6 = null;
        li var7 = null;
        L0: {
          L1: {
            L2: {
              var5 = Vertigo2.field_L ? 1 : 0;
              if (null == this.field_j) {
                break L2;
              } else {
                if (this.a(true) != null) {
                  if (this.field_m) {
                    var2_int = 1;
                    var3 = this.field_j.a((byte) 100);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (this.field_B >= this.field_x.field_h.length) {
                              break L5;
                            } else {
                              if (this.field_x.field_h[this.field_B] != 0) {
                                if (-251 >= (this.field_p.field_d ^ -1)) {
                                  var2_int = 0;
                                  break L5;
                                } else {
                                  L6: {
                                    if (this.field_g[this.field_B] != 0) {
                                      break L6;
                                    } else {
                                      discarded$4 = this.a(92, 1, this.field_B);
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (-1 == (this.field_g[this.field_B] ^ -1)) {
                                      var7 = new li();
                                      var7.field_k = (long)this.field_B;
                                      var2_int = 0;
                                      this.field_j.a(var7, false);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  this.field_B = this.field_B + 1;
                                  continue L4;
                                }
                              } else {
                                this.field_B = this.field_B + 1;
                                continue L4;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            this.field_B = 0;
                            this.field_m = false;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_k;
                          if (this.field_g[var4] == 0) {
                            discarded$5 = this.a(112, 1, var4);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (0 == this.field_g[var4]) {
                            var2_int = 0;
                            break L9;
                          } else {
                            var3.c(2);
                            break L9;
                          }
                        }
                        var3 = this.field_j.b(27);
                        continue L3;
                      }
                    }
                  } else {
                    if (!this.field_n) {
                      this.field_j = null;
                      break L2;
                    } else {
                      var2_int = 1;
                      var3 = this.field_j.a((byte) 100);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (this.field_B >= this.field_x.field_h.length) {
                                break L12;
                              } else {
                                if (this.field_x.field_h[this.field_B] != 0) {
                                  if (!this.field_w.f(6)) {
                                    L13: {
                                      if (-2 != (this.field_g[this.field_B] ^ -1)) {
                                        discarded$6 = this.a(-102, 2, this.field_B);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (1 == this.field_g[this.field_B]) {
                                        break L14;
                                      } else {
                                        var6 = new li();
                                        var6.field_k = (long)this.field_B;
                                        this.field_j.a(var6, false);
                                        var2_int = 0;
                                        break L14;
                                      }
                                    }
                                    this.field_B = this.field_B + 1;
                                    continue L11;
                                  } else {
                                    var2_int = 0;
                                    break L12;
                                  }
                                } else {
                                  this.field_B = this.field_B + 1;
                                  continue L11;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              this.field_n = false;
                              this.field_B = 0;
                              break L2;
                            } else {
                              L15: {
                                if (param0 >= 86) {
                                  break L15;
                                } else {
                                  this.a((byte) 81);
                                  break L15;
                                }
                              }
                              if (!this.field_f) {
                                break L0;
                              } else {
                                if ((gk.a(85) ^ -1L) > (this.field_o ^ -1L)) {
                                  break L0;
                                } else {
                                  var2 = (rk) ((Object) this.field_q.b(0));
                                  L16: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L17: {
                                        if (!var2.field_z) {
                                          if (var2.field_t) {
                                            if (var2.field_u) {
                                              var2.c(2);
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
                                      var2 = (rk) ((Object) this.field_q.c(-86));
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            var4 = (int)var3.field_k;
                            if (-2 != (this.field_g[var4] ^ -1)) {
                              discarded$7 = this.a(123, 2, var4);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if (-2 == (this.field_g[var4] ^ -1)) {
                              var3.c(2);
                              break L19;
                            } else {
                              var2_int = 0;
                              break L19;
                            }
                          }
                          var3 = this.field_j.b(88);
                          continue L10;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L20: {
              if (param0 >= 86) {
                break L20;
              } else {
                this.a((byte) 81);
                break L20;
              }
            }
            if (!this.field_f) {
              break L0;
            } else {
              if ((gk.a(85) ^ -1L) > (this.field_o ^ -1L)) {
                break L0;
              } else {
                var2 = (rk) ((Object) this.field_q.b(0));
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (!var2.field_z) {
                        if (var2.field_t) {
                          if (var2.field_u) {
                            var2.c(2);
                            break L22;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_t = true;
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                    var2 = (rk) ((Object) this.field_q.c(-86));
                    continue L21;
                  }
                }
              }
            }
          }
          this.field_o = 1000L + gk.a(127);
          break L0;
        }
    }

    final ff a(boolean param0) {
        nq discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        Object stackIn_30_0 = null;
        tk stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_30_5 = 0;
        Object stackIn_31_0 = null;
        tk stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        Object stackIn_32_0 = null;
        tk stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        int stackIn_32_6 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_29_0 = null;
        tk stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        Object stackOut_31_0 = null;
        tk stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        Object stackOut_30_0 = null;
        tk stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != this.field_x) {
          return this.field_x;
        } else {
          L0: {
            if (this.field_s != null) {
              break L0;
            } else {
              if (!this.field_w.a(20)) {
                this.field_s = (rk) ((Object) this.field_w.a(this.field_t, 255, true, (byte) 0, false));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_s.field_z) {
            L1: {
              var7 = this.field_s.a((byte) -106);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (param0) {
                break L1;
              } else {
                this.field_l = (byte[]) null;
                break L1;
              }
            }
            L2: {
              if (!(this.field_s instanceof nq)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_x = new ff(var7, this.field_z, this.field_l);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_w.e(0);
                    this.field_x = null;
                    if (!this.field_w.a(20)) {
                      L5: {
                        stackOut_29_0 = this;
                        stackOut_29_1 = this.field_w;
                        stackOut_29_2 = this.field_t;
                        stackOut_29_3 = 255;
                        stackOut_29_4 = 1;
                        stackOut_29_5 = 0;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        stackIn_31_5 = stackOut_29_5;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        stackIn_30_3 = stackOut_29_3;
                        stackIn_30_4 = stackOut_29_4;
                        stackIn_30_5 = stackOut_29_5;
                        if (param0) {
                          stackOut_31_0 = this;
                          stackOut_31_1 = (tk) ((Object) stackIn_31_1);
                          stackOut_31_2 = stackIn_31_2;
                          stackOut_31_3 = stackIn_31_3;
                          stackOut_31_4 = stackIn_31_4;
                          stackOut_31_5 = stackIn_31_5;
                          stackOut_31_6 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          stackIn_32_1 = stackOut_31_1;
                          stackIn_32_2 = stackOut_31_2;
                          stackIn_32_3 = stackOut_31_3;
                          stackIn_32_4 = stackOut_31_4;
                          stackIn_32_5 = stackOut_31_5;
                          stackIn_32_6 = stackOut_31_6;
                          break L5;
                        } else {
                          stackOut_30_0 = this;
                          stackOut_30_1 = (tk) ((Object) stackIn_30_1);
                          stackOut_30_2 = stackIn_30_2;
                          stackOut_30_3 = stackIn_30_3;
                          stackOut_30_4 = stackIn_30_4;
                          stackOut_30_5 = stackIn_30_5;
                          stackOut_30_6 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_32_1 = stackOut_30_1;
                          stackIn_32_2 = stackOut_30_2;
                          stackIn_32_3 = stackOut_30_3;
                          stackIn_32_4 = stackOut_30_4;
                          stackIn_32_5 = stackOut_30_5;
                          stackIn_32_6 = stackOut_30_6;
                          break L5;
                        }
                      }
                      ((uk) (this)).field_s = (rk) ((Object) ((tk) (Object) stackIn_32_1).a(stackIn_32_2, stackIn_32_3, stackIn_32_4 != 0, (byte) stackIn_32_5, stackIn_32_6 != 0));
                      break L4;
                    } else {
                      this.field_s = null;
                      break L4;
                    }
                  }
                  return null;
                }
                if (this.field_k != null) {
                  discarded$1 = this.field_p.a(-19932, this.field_t, this.field_k, var7);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L6: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_x = new ff(var7, this.field_z, this.field_l);
                      if (this.field_x.field_c == this.field_A) {
                        break L6;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3 = decompiledCaughtException;
                    this.field_x = null;
                    if (!this.field_w.a(20)) {
                      this.field_s = (rk) ((Object) this.field_w.a(this.field_t, 255, true, (byte) 0, false));
                      break L7;
                    } else {
                      this.field_s = null;
                      break L7;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L8: {
              if (this.field_i != null) {
                this.field_g = new byte[this.field_x.field_p];
                break L8;
              } else {
                break L8;
              }
            }
            this.field_s = null;
            return this.field_x;
          } else {
            return null;
          }
        }
    }

    private final rk a(int param0, int param1, int param2) {
        nq discarded$1 = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var6 = null;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rk var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_58_0 = null;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var4 = 38 / ((33 - param0) / 55);
          var13 = (rk) ((Object) this.field_q.a((long)param2, (byte) 64));
          var5 = var13;
          if (var13 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (var13.field_u) {
                break L0;
              } else {
                if (!var13.field_z) {
                  break L0;
                } else {
                  var13.c(2);
                  var5 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var5 != null) {
            break L1;
          } else {
            L2: {
              if (0 != param1) {
                if (param1 != 1) {
                  if (-3 == (param1 ^ -1)) {
                    if (this.field_i == null) {
                      throw new RuntimeException();
                    } else {
                      if ((this.field_g[param2] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_w.f(6)) {
                          var5 = this.field_w.a(param2, this.field_t, false, (byte) 2, false);
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
                  if (null == this.field_i) {
                    throw new RuntimeException();
                  } else {
                    var5 = this.field_p.a(this.field_i, param2, (byte) 48);
                    break L2;
                  }
                }
              } else {
                L3: {
                  if (this.field_i == null) {
                    break L3;
                  } else {
                    if (-1 != this.field_g[param2]) {
                      var5 = this.field_p.a(true, this.field_i, param2);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_w.a(20)) {
                  var5 = this.field_w.a(param2, this.field_t, true, (byte) 2, false);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_q.a((li) (var5), (long)param2, false);
            break L1;
          }
        }
        if (!((rk) (var5)).field_z) {
          var19 = ((rk) (var5)).a((byte) -106);
          var14 = var19;
          var6 = var14;
          if (!(var5 instanceof nq)) {
            try {
              L4: {
                L5: {
                  if (var6 == null) {
                    break L5;
                  } else {
                    if (var19.length > 2) {
                      kc.field_d.reset();
                      kc.field_d.update(var6, 0, var19.length + -2);
                      var7_int = (int)kc.field_d.getValue();
                      if (this.field_x.field_j[param2] != var7_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (null == this.field_x.field_s) {
                            break L6;
                          } else {
                            if (this.field_x.field_s[param2] != null) {
                              var31 = this.field_x.field_s[param2];
                              var30 = de.a(0, (byte) -126, var19.length + -2, var19);
                              var12 = 0;
                              var10 = var12;
                              L7: while (true) {
                                if (-65 >= (var12 ^ -1)) {
                                  break L6;
                                } else {
                                  if (var30[var12] == var31[var12]) {
                                    var12++;
                                    continue L7;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.field_w.field_m = 0;
                        this.field_w.field_j = 0;
                        break L4;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_w.e(0);
              ((rk) (var5)).c(2);
              if (((rk) (var5)).field_u) {
                L8: {
                  if (!this.field_w.a(20)) {
                    var5 = this.field_w.a(param2, this.field_t, true, (byte) 2, false);
                    this.field_q.a((li) (var5), (long)param2, false);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L9: {
              var6[-2 + var19.length] = (byte)(this.field_x.field_l[param2] >>> 1155415752);
              var6[var19.length + -1] = (byte)this.field_x.field_l[param2];
              if (null != this.field_i) {
                discarded$1 = this.field_p.a(-19932, param2, this.field_i, var19);
                if (this.field_g[param2] == 1) {
                  break L9;
                } else {
                  this.field_g[param2] = (byte) 1;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if (((rk) (var5)).field_u) {
                break L10;
              } else {
                ((rk) (var5)).c(2);
                break L10;
              }
            }
            return (rk) (var5);
          } else {
            try {
              L11: {
                L12: {
                  if (var6 == null) {
                    break L12;
                  } else {
                    if (-3 <= (var19.length ^ -1)) {
                      break L12;
                    } else {
                      kc.field_d.reset();
                      kc.field_d.update(var6, 0, -2 + var19.length);
                      var7_int = (int)kc.field_d.getValue();
                      if (this.field_x.field_j[param2] == var7_int) {
                        L13: {
                          if (null == this.field_x.field_s) {
                            break L13;
                          } else {
                            if (this.field_x.field_s[param2] != null) {
                              var28 = this.field_x.field_s[param2];
                              var29 = de.a(0, (byte) -91, -2 + var19.length, var19);
                              var10 = 0;
                              L14: while (true) {
                                if (-65 >= (var10 ^ -1)) {
                                  break L13;
                                } else {
                                  if (var28[var10] != var29[var10]) {
                                    throw new RuntimeException();
                                  } else {
                                    var10++;
                                    continue L14;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var8 = (var6[var19.length - 1] & 255) + ((var6[var19.length - 2] & 255) << -1727840152);
                        if ((this.field_x.field_l[param2] & 65535) == var8) {
                          L15: {
                            if (this.field_g[param2] != 1) {
                              L16: {
                                if (this.field_g[param2] == 0) {
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              this.field_g[param2] = (byte) 1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (!((rk) (var5)).field_u) {
                              ((rk) (var5)).c(2);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          stackOut_58_0 = var5;
                          stackIn_59_0 = stackOut_58_0;
                          break L11;
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
              L18: {
                var7 = (Exception) (Object) decompiledCaughtException;
                this.field_g[param2] = (byte)-1;
                ((rk) (var5)).c(2);
                if (((rk) (var5)).field_u) {
                  if (!this.field_w.a(20)) {
                    var5 = this.field_w.a(param2, this.field_t, true, (byte) 2, false);
                    this.field_q.a((li) (var5), (long)param2, false);
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
            return (rk) ((Object) stackIn_59_0);
          }
        } else {
          return null;
        }
    }

    final static void a(r param0, r param1, int param2) {
        try {
            if (param2 < 115) {
                field_u = (String) null;
            }
            oc.field_r = param0;
            hd.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "uk.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 57) {
            return 100;
        }
        rk var3 = (rk) ((Object) this.field_q.a((long)param0, (byte) 64));
        if (var3 == null) {
            return 0;
        }
        return var3.i(109);
    }

    uk(int param0, qh param1, qh param2, tk param3, t param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_q = new jl(16);
        this.field_B = 0;
        this.field_h = new nj();
        this.field_o = 0L;
        try {
          L0: {
            L1: {
              this.field_t = param0;
              this.field_i = param1;
              if (null == this.field_i) {
                this.field_m = false;
                break L1;
              } else {
                this.field_m = true;
                this.field_j = new nj();
                break L1;
              }
            }
            L2: {
              this.field_l = param6;
              this.field_w = param3;
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
              ((uk) (this)).field_f = stackIn_7_1 != 0;
              this.field_A = param7;
              this.field_z = param5;
              this.field_k = param2;
              this.field_p = param4;
              if (this.field_k == null) {
                break L3;
              } else {
                this.field_s = (rk) ((Object) this.field_p.a(true, this.field_k, this.field_t));
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
            stackOut_10_1 = new StringBuilder().append("uk.<init>(").append(param0).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_y = "No options available";
    }
}
