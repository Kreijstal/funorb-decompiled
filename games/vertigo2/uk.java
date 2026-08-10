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
        double var2 = 0.0;
        int var1_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        try {
            if (null == eh.field_b || null == qb.field_b) {
                qb.field_b = new int[256];
                eh.field_b = new int[256];
                for (var1_int = 0; 256 > var1_int; var1_int++) {
                    var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                    eh.field_b[var1_int] = (int)(4096.0 * Math.sin(var2));
                    qb.field_b[var1_int] = (int)(Math.cos(var2) * 4096.0);
                }
            }
            var1_int = -28 / ((param0 - -6) / 43);
        } catch (RuntimeException runtimeException) {
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
        rk discarded$0 = null;
        rk discarded$1 = null;
        li var2;
        int var3;
        int var4;
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
                                discarded$0 = this.a(101, 1, var3);
                                break L3;
                              }
                            }
                            L4: {
                              if ((this.field_g[var3] ^ -1) == 0) {
                                discarded$1 = this.a(-66, 2, var3);
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
        rk discarded$0 = null;
        rk discarded$1 = null;
        rk discarded$2 = null;
        rk discarded$3 = null;
        int var2_int;
        rk var2;
        li var3;
        int var4;
        int var5;
        li var6;
        li var7;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (null == this.field_j) {
            break L0;
          } else {
            if (this.a(true) != null) {
              if (this.field_m) {
                var2_int = 1;
                var3 = this.field_j.a((byte) 100);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_B >= this.field_x.field_h.length) {
                          break L3;
                        } else {
                          if (this.field_x.field_h[this.field_B] != 0) {
                            if (-251 >= (this.field_p.field_d ^ -1)) {
                              var2_int = 0;
                              break L3;
                            } else {
                              L4: {
                                if (this.field_g[this.field_B] != 0) {
                                  break L4;
                                } else {
                                  discarded$0 = this.a(92, 1, this.field_B);
                                  break L4;
                                }
                              }
                              L5: {
                                if (-1 == (this.field_g[this.field_B] ^ -1)) {
                                  var7 = new li();
                                  var7.field_k = (long)this.field_B;
                                  var2_int = 0;
                                  this.field_j.a(var7, false);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              this.field_B = this.field_B + 1;
                              continue L2;
                            }
                          } else {
                            this.field_B = this.field_B + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        this.field_B = 0;
                        this.field_m = false;
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_k;
                      if ((this.field_g[var4] ^ -1) == -1) {
                        discarded$1 = this.a(112, 1, var4);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (0 == this.field_g[var4]) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.c(2);
                        break L7;
                      }
                    }
                    var3 = this.field_j.b(27);
                    continue L1;
                  }
                }
              } else {
                if (!this.field_n) {
                  this.field_j = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = this.field_j.a((byte) 100);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_B >= this.field_x.field_h.length) {
                            break L10;
                          } else {
                            if (this.field_x.field_h[this.field_B] != 0) {
                              if (!this.field_w.f(6)) {
                                L11: {
                                  if (-2 != (this.field_g[this.field_B] ^ -1)) {
                                    discarded$2 = this.a(-102, 2, this.field_B);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (1 == this.field_g[this.field_B]) {
                                    break L12;
                                  } else {
                                    var6 = new li();
                                    var6.field_k = (long)this.field_B;
                                    this.field_j.a(var6, false);
                                    var2_int = 0;
                                    break L12;
                                  }
                                }
                                this.field_B = this.field_B + 1;
                                continue L9;
                              } else {
                                var2_int = 0;
                                break L10;
                              }
                            } else {
                              this.field_B = this.field_B + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int != 0) {
                          this.field_n = false;
                          this.field_B = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_k;
                        if (-2 != (this.field_g[var4] ^ -1)) {
                          discarded$3 = this.a(123, 2, var4);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (-2 == (this.field_g[var4] ^ -1)) {
                          var3.c(2);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = this.field_j.b(88);
                      continue L8;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        }
        L15: {
          if (param0 >= 86) {
            break L15;
          } else {
            this.a((byte) 81);
            break L15;
          }
        }
        L16: {
          if (!this.field_f) {
            break L16;
          } else {
            L17: {
              if ((gk.a(85) ^ -1L) > (this.field_o ^ -1L)) {
                break L17;
              } else {
                var2 = (rk) ((Object) this.field_q.b(0));
                L18: while (true) {
                  if (var2 == null) {
                    this.field_o = 1000L + gk.a(127);
                    break L17;
                  } else {
                    L19: {
                      if (!var2.field_z) {
                        if (var2.field_t) {
                          if (var2.field_u) {
                            var2.c(2);
                            break L19;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_t = true;
                          break L19;
                        }
                      } else {
                        break L19;
                      }
                    }
                    var2 = (rk) ((Object) this.field_q.c(-86));
                    continue L18;
                  }
                }
              }
            }
            break L16;
          }
        }
    }

    final ff a(boolean param0) {
        Object stackIn_31_0;
        tk stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_31_5;
        Object stackIn_32_0;
        tk stackIn_32_1;
        int stackIn_32_2;
        int stackIn_32_3;
        int stackIn_32_4;
        int stackIn_32_5;
        int stackIn_32_6;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
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
                        stackIn_31_0 = this;

                        stackIn_31_1 = this.field_w;

                        stackIn_31_2 = this.field_t;

                        stackIn_31_3 = 255;

                        stackIn_31_4 = 1;

                        stackIn_31_5 = 0;

                        if (param0) {
                          stackIn_32_0 = this;
                          stackIn_32_1 = (tk) ((Object) stackIn_31_1);
                          stackIn_32_2 = stackIn_31_2;
                          stackIn_32_3 = stackIn_31_3;
                          stackIn_32_4 = stackIn_31_4;
                          stackIn_32_5 = stackIn_31_5;
                          stackIn_32_6 = 0;
                          break L5;
                        } else {
                          stackIn_32_0 = this;
                          stackIn_32_1 = (tk) ((Object) stackIn_31_1);
                          stackIn_32_2 = stackIn_31_2;
                          stackIn_32_3 = stackIn_31_3;
                          stackIn_32_4 = stackIn_31_4;
                          stackIn_32_5 = stackIn_31_5;
                          stackIn_32_6 = 1;
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
                  this.field_p.a(-19932, this.field_t, this.field_k, var7);
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
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var6 = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        Exception var7_ref = null;
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
                                  if ((var30[var12] ^ -1) == (var31[var12] ^ -1)) {
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
              var7 = (RuntimeException) (Object) decompiledCaughtException;
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
                this.field_p.a(-19932, param2, this.field_i, var19);
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
                          stackIn_59_0 = var5;
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
                var7_ref = (Exception) (Object) decompiledCaughtException;
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
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("uk.<init>(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_y = "No options available";
    }
}
