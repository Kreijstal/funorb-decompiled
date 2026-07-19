/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends qa {
    private ln field_D;
    static String field_v;
    private int field_w;
    static pp field_A;
    private int field_p;
    private tm field_y;
    private bb field_t;
    private byte[] field_s;
    static String field_n;
    static boolean field_f;
    static boolean field_i;
    static byte[] field_q;
    private byte[] field_h;
    private int field_o;
    private wa field_l;
    private ln field_g;
    private vf field_C;
    private cc field_B;
    private boolean field_r;
    private boolean field_x;
    private md field_j;
    private md field_u;
    private int field_z;
    private long field_m;
    private boolean field_k;

    private final vf a(byte param0, int param1, int param2) {
        co discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_89_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_88_0 = null;
        L0: {
          var10 = DungeonAssault.field_K;
          if (param0 >= 81) {
            break L0;
          } else {
            this.field_k = false;
            break L0;
          }
        }
        L1: {
          var12 = (vf) ((Object) this.field_l.a((long)param1, 8));
          var4 = var12;
          if (var12 == null) {
            break L1;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L1;
            } else {
              if (var12.field_B) {
                break L1;
              } else {
                if (!var12.field_v) {
                  break L1;
                } else {
                  var12.a(false);
                  var4 = null;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 == null) {
            L3: {
              if (param2 == 0) {
                L4: {
                  if (this.field_D == null) {
                    break L4;
                  } else {
                    if (this.field_h[param1] != -1) {
                      var4 = this.field_B.a(this.field_D, param1, -6319);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_t.b(-21431)) {
                  var4 = this.field_t.a(true, this.field_p, (byte) 2, param1, (byte) 73);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (1 != param2) {
                  if ((param2 ^ -1) == -3) {
                    if (null != this.field_D) {
                      if (this.field_h[param1] == -1) {
                        if (!this.field_t.d(20)) {
                          var4 = this.field_t.a(false, this.field_p, (byte) 2, param1, (byte) 118);
                          break L3;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (this.field_D == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_B.a((byte) -78, this.field_D, param1);
                    break L3;
                  }
                }
              }
            }
            this.field_l.a((ne) (var4), 12460, (long)param1);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((vf) (var4)).field_v) {
          var18 = ((vf) (var4)).b(true);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof co) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if ((var18.length ^ -1) >= -3) {
                      break L6;
                    } else {
                      jl.field_a.reset();
                      jl.field_a.update(var5, 0, var18.length - 2);
                      var6_int = (int)jl.field_a.getValue();
                      if (this.field_y.field_q[param1] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_y.field_g) {
                            break L7;
                          } else {
                            if (null != this.field_y.field_g[param1]) {
                              var29 = this.field_y.field_g[param1];
                              var30 = rn.a(var18.length + -2, 0, 8, var18);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
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
                        var7 = (var5[-1 + var18.length] & 255) + (var5[-2 + var18.length] << -1686127864 & 65280);
                        if ((this.field_y.field_o[param1] & 65535) != var7) {
                          throw new RuntimeException();
                        } else {
                          L9: {
                            if (1 == this.field_h[param1]) {
                              break L9;
                            } else {
                              L10: {
                                if (0 == this.field_h[param1]) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_h[param1] = (byte) 1;
                              break L9;
                            }
                          }
                          L11: {
                            if (!((vf) (var4)).field_B) {
                              ((vf) (var4)).a(false);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          stackOut_88_0 = var4;
                          stackIn_89_0 = stackOut_88_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_h[param1] = (byte)-1;
              ((vf) (var4)).a(false);
              if (((vf) (var4)).field_B) {
                if (!this.field_t.b(-21431)) {
                  var4 = this.field_t.a(true, this.field_p, (byte) 2, param1, (byte) 77);
                  this.field_l.a((ne) (var4), 12460, (long)param1);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (vf) ((Object) stackIn_89_0);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if ((var18.length ^ -1) < -3) {
                      jl.field_a.reset();
                      jl.field_a.update(var5, 0, var18.length - 2);
                      var6_int = (int)jl.field_a.getValue();
                      if (var6_int == this.field_y.field_q[param1]) {
                        L14: {
                          if (null == this.field_y.field_g) {
                            break L14;
                          } else {
                            if (null == this.field_y.field_g[param1]) {
                              break L14;
                            } else {
                              var28 = this.field_y.field_g[param1];
                              var27 = rn.a(-2 + var18.length, 0, 8, var18);
                              var9 = 0;
                              L15: while (true) {
                                if (64 <= var9) {
                                  break L14;
                                } else {
                                  if (var27[var9] != var28[var9]) {
                                    throw new RuntimeException();
                                  } else {
                                    var9++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_t.field_h = 0;
                        this.field_t.field_c = 0;
                        break L12;
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
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              this.field_t.f(-118);
              ((vf) (var4)).a(false);
              if (((vf) (var4)).field_B) {
                if (!this.field_t.b(-21431)) {
                  var4 = this.field_t.a(true, this.field_p, (byte) 2, param1, (byte) 105);
                  this.field_l.a((ne) (var4), 12460, (long)param1);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L16: {
              var5[-2 + var18.length] = (byte)(this.field_y.field_o[param1] >>> 1024223272);
              var5[var18.length - 1] = (byte)this.field_y.field_o[param1];
              if (this.field_D != null) {
                discarded$1 = this.field_B.a(this.field_D, 15958, param1, var18);
                if (-2 == (this.field_h[param1] ^ -1)) {
                  break L16;
                } else {
                  this.field_h[param1] = (byte) 1;
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L17: {
              if (((vf) (var4)).field_B) {
                break L17;
              } else {
                ((vf) (var4)).a(false);
                break L17;
              }
            }
            return (vf) (var4);
          }
        } else {
          return null;
        }
    }

    final void c(int param0) {
        vf discarded$4 = null;
        vf discarded$5 = null;
        vf discarded$6 = null;
        vf discarded$7 = null;
        int var2_int = 0;
        vf var2 = null;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        ne var6 = null;
        ne var7 = null;
        L0: {
          var5 = DungeonAssault.field_K;
          if (this.field_j != null) {
            if (null != this.a(26538)) {
              if (this.field_x) {
                var2_int = 1;
                var3 = this.field_j.e(-24172);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_y.field_k.length <= this.field_z) {
                          break L3;
                        } else {
                          if (-1 != (this.field_y.field_k[this.field_z] ^ -1)) {
                            if (250 <= this.field_B.field_f) {
                              var2_int = 0;
                              break L3;
                            } else {
                              L4: {
                                if (this.field_h[this.field_z] != 0) {
                                  break L4;
                                } else {
                                  discarded$4 = this.a((byte) 126, this.field_z, 1);
                                  break L4;
                                }
                              }
                              L5: {
                                if (this.field_h[this.field_z] != 0) {
                                  break L5;
                                } else {
                                  var7 = new ne();
                                  var7.field_h = (long)this.field_z;
                                  var2_int = 0;
                                  this.field_j.a(var7, false);
                                  break L5;
                                }
                              }
                              this.field_z = this.field_z + 1;
                              continue L2;
                            }
                          } else {
                            this.field_z = this.field_z + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        this.field_z = 0;
                        this.field_x = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_h;
                      if (0 == this.field_h[var4]) {
                        discarded$5 = this.a((byte) 127, var4, 1);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (0 != this.field_h[var4]) {
                        var3.a(false);
                        break L7;
                      } else {
                        var2_int = 0;
                        break L7;
                      }
                    }
                    var3 = this.field_j.a(param0 ^ -10786);
                    continue L1;
                  }
                }
              } else {
                if (this.field_r) {
                  var2_int = 1;
                  var3 = this.field_j.e(-24172);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_z >= this.field_y.field_k.length) {
                            break L10;
                          } else {
                            L11: {
                              if (-1 == (this.field_y.field_k[this.field_z] ^ -1)) {
                                break L11;
                              } else {
                                if (!this.field_t.d(20)) {
                                  L12: {
                                    if (-2 == (this.field_h[this.field_z] ^ -1)) {
                                      break L12;
                                    } else {
                                      discarded$6 = this.a((byte) 112, this.field_z, 2);
                                      break L12;
                                    }
                                  }
                                  if (1 != this.field_h[this.field_z]) {
                                    var6 = new ne();
                                    var6.field_h = (long)this.field_z;
                                    this.field_j.a(var6, false);
                                    var2_int = 0;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L10;
                                }
                              }
                            }
                            this.field_z = this.field_z + 1;
                            continue L9;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_r = false;
                          this.field_z = 0;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_h;
                        if (1 == this.field_h[var4]) {
                          break L13;
                        } else {
                          discarded$7 = this.a((byte) 107, var4, 2);
                          break L13;
                        }
                      }
                      L14: {
                        if ((this.field_h[var4] ^ -1) != -2) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.a(false);
                          break L14;
                        }
                      }
                      var3 = this.field_j.a(4);
                      continue L8;
                    }
                  }
                } else {
                  this.field_j = null;
                  break L0;
                }
              }
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        L15: {
          if (!this.field_k) {
            break L15;
          } else {
            if (kd.c(param0 ^ 9138) >= this.field_m) {
              var2 = (vf) ((Object) this.field_l.a(true));
              L16: while (true) {
                if (var2 == null) {
                  this.field_m = kd.c(-2456) - -1000L;
                  break L15;
                } else {
                  L17: {
                    if (!var2.field_v) {
                      if (!var2.field_z) {
                        var2.field_z = true;
                        break L17;
                      } else {
                        if (var2.field_B) {
                          var2.a(false);
                          break L17;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                  var2 = (vf) ((Object) this.field_l.a(param0 + 15108));
                  continue L16;
                }
              }
            } else {
              break L15;
            }
          }
        }
        L18: {
          if (param0 == -10790) {
            break L18;
          } else {
            this.field_k = false;
            break L18;
          }
        }
    }

    final byte[] a(int param0, int param1) {
        vf var3 = this.a((byte) 90, param0, 0);
        if (var3 == null) {
            return null;
        }
        if (param1 != -7249) {
            return (byte[]) null;
        }
        byte[] var4 = var3.b(true);
        var3.a(false);
        return var4;
    }

    final tm a(int param0) {
        co discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        if (null == this.field_y) {
          L0: {
            if (this.field_C == null) {
              if (!this.field_t.b(-21431)) {
                this.field_C = (vf) ((Object) this.field_t.a(true, 255, (byte) 0, this.field_p, (byte) 79));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (param0 == 26538) {
            if (!this.field_C.field_v) {
              L1: {
                var7 = this.field_C.b(true);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (this.field_C instanceof co) {
                  try {
                    L2: {
                      if (var5 != null) {
                        this.field_y = new tm(var7, this.field_w, this.field_s);
                        if (this.field_y.field_s == this.field_o) {
                          break L2;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_y = null;
                      if (this.field_t.b(-21431)) {
                        this.field_C = null;
                        break L3;
                      } else {
                        this.field_C = (vf) ((Object) this.field_t.a(true, 255, (byte) 0, this.field_p, (byte) 69));
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
                        this.field_y = new tm(var7, this.field_w, this.field_s);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_t.f(99);
                      this.field_y = null;
                      if (this.field_t.b(-21431)) {
                        this.field_C = null;
                        break L5;
                      } else {
                        this.field_C = (vf) ((Object) this.field_t.a(true, 255, (byte) 0, this.field_p, (byte) 71));
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (this.field_g != null) {
                    discarded$1 = this.field_B.a(this.field_g, param0 ^ 23036, this.field_p, var7);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                this.field_C = null;
                if (this.field_D == null) {
                  break L6;
                } else {
                  this.field_h = new byte[this.field_y.field_l];
                  break L6;
                }
              }
              return this.field_y;
            } else {
              return null;
            }
          } else {
            return (tm) null;
          }
        } else {
          return this.field_y;
        }
    }

    final void d(int param0) {
        if (param0 != 6833) {
            return;
        }
        if (this.field_D == null) {
            return;
        }
        this.field_r = true;
        if (!(null != this.field_j)) {
            this.field_j = new md();
        }
    }

    final void b(boolean param0) {
        int var3 = 0;
        vf discarded$0 = null;
        vf discarded$1 = null;
        int var4 = DungeonAssault.field_K;
        if (!(null != this.field_j)) {
            return;
        }
        if (param0) {
            this.field_y = (tm) null;
        }
        if (null == this.a(26538)) {
            return;
        }
        ne var2 = this.field_u.e(-24172);
        while (var2 != null) {
            var3 = (int)var2.field_h;
            if (var3 < 0) {
                var2.a(param0);
            } else {
                if (var3 >= this.field_y.field_l) {
                    var2.a(param0);
                } else {
                    if (0 == this.field_y.field_k[var3]) {
                        var2.a(param0);
                    } else {
                        if (!(this.field_h[var3] != 0)) {
                            discarded$0 = this.a((byte) 95, var3, 1);
                        }
                        if (!((this.field_h[var3] ^ -1) != 0)) {
                            discarded$1 = this.a((byte) 123, var3, 2);
                        }
                        if (!(this.field_h[var3] != 1)) {
                            var2.a(false);
                        }
                    }
                }
            }
            var2 = this.field_u.a(4);
        }
    }

    final int b(int param0, int param1) {
        vf var3 = (vf) ((Object) this.field_l.a((long)param0, 8));
        if (param1 != 27318) {
            this.field_t = (bb) null;
        }
        if (var3 != null) {
            return var3.d((byte) 107);
        }
        return 0;
    }

    final static void c(boolean param0) {
        if (!param0) {
            return;
        }
        i var1 = (i) ((Object) id.field_e.c(0));
        if (var1 == null) {
            throw new IllegalStateException();
        }
        gf.a(var1.field_j, var1.field_i, var1.field_q);
        gf.e(var1.field_m, var1.field_p, var1.field_z, var1.field_k);
        var1.field_j = null;
        cd.field_g.a(var1, !param0 ? true : false);
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
            return;
        }
        field_A = null;
        field_q = null;
        field_n = null;
    }

    ti(int param0, ln param1, ln param2, bb param3, cc param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_l = new wa(16);
        this.field_z = 0;
        this.field_u = new md();
        this.field_m = 0L;
        try {
          L0: {
            L1: {
              this.field_p = param0;
              this.field_D = param1;
              if (null != this.field_D) {
                this.field_x = true;
                this.field_j = new md();
                break L1;
              } else {
                this.field_x = false;
                break L1;
              }
            }
            L2: {
              this.field_o = param7;
              this.field_w = param5;
              this.field_g = param2;
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
              ((ti) (this)).field_k = stackIn_7_1 != 0;
              this.field_s = param6;
              this.field_B = param4;
              this.field_t = param3;
              if (null == this.field_g) {
                break L3;
              } else {
                this.field_C = (vf) ((Object) this.field_B.a(this.field_g, this.field_p, -6319));
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
            stackOut_10_1 = new StringBuilder().append("ti.<init>(").append(param0).append(',');
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
          throw vk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_n = "Imps may be small and carry a cheeky, indeed, impish look, but they'll not give a second thought to whether or not to stab your raiders.";
        field_f = false;
        field_v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
