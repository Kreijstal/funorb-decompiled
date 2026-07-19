/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends wf {
    private gi field_h;
    static String field_z;
    private int field_A;
    private int field_g;
    private int field_E;
    static String field_l;
    private byte[] field_w;
    static int field_y;
    static pb field_s;
    private gi field_j;
    private ki field_o;
    private byte[] field_B;
    private rk field_r;
    static boolean[] field_x;
    private uh field_f;
    static java.awt.Image field_C;
    private lh field_k;
    static String field_p;
    private fb field_q;
    private int field_m;
    private oj field_v;
    private boolean field_t;
    private oj field_u;
    private boolean field_i;
    private long field_D;
    private boolean field_n;

    private final ki a(int param0, int param1, int param2) {
        el discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ki var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_58_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_57_0 = null;
        L0: {
          var10 = stellarshard.field_B;
          if (param0 == -28529) {
            break L0;
          } else {
            this.field_f = (uh) null;
            break L0;
          }
        }
        L1: {
          var12 = (ki) ((Object) this.field_f.a((long)param1, param0 + 28538));
          var4 = var12;
          if (var12 == null) {
            break L1;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L1;
            } else {
              if (var12.field_u) {
                break L1;
              } else {
                if (!var12.field_w) {
                  break L1;
                } else {
                  var12.c(20);
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
              if (param2 != 0) {
                if (param2 != 1) {
                  if ((param2 ^ -1) == -3) {
                    if (this.field_h == null) {
                      throw new RuntimeException();
                    } else {
                      if (0 == (this.field_B[param1] ^ -1)) {
                        if (!this.field_q.e(-88)) {
                          var4 = this.field_q.a((byte) 2, param1, false, this.field_g, true);
                          break L3;
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
                } else {
                  if (null != this.field_h) {
                    var4 = this.field_r.a(this.field_h, 3, param1);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L4: {
                  if (null == this.field_h) {
                    break L4;
                  } else {
                    if (0 != (this.field_B[param1] ^ -1)) {
                      var4 = this.field_r.a(this.field_h, (byte) 90, param1);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_q.d(2)) {
                  var4 = this.field_q.a((byte) 2, param1, true, this.field_g, true);
                  break L3;
                } else {
                  return null;
                }
              }
            }
            this.field_f.a((gg) (var4), (long)param1, 1);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((ki) (var4)).field_w) {
          var18 = ((ki) (var4)).g(-27203);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof el)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (2 < var18.length) {
                      nj.field_q.reset();
                      nj.field_q.update(var5, 0, var18.length + -2);
                      var6_int = (int)nj.field_q.getValue();
                      if (var6_int != this.field_k.field_l[param1]) {
                        throw new RuntimeException();
                      } else {
                        L7: {
                          if (null == this.field_k.field_h) {
                            break L7;
                          } else {
                            if (null != this.field_k.field_h[param1]) {
                              var30 = this.field_k.field_h[param1];
                              var29 = bc.a(param0 + 28529, 0, var18.length + -2, var18);
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
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.field_q.field_i = 0;
                        this.field_q.field_g = 0;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_q.b(-116);
              ((ki) (var4)).c(param0 + 28549);
              if (((ki) (var4)).field_u) {
                L9: {
                  if (!this.field_q.d(2)) {
                    var4 = this.field_q.a((byte) 2, param1, true, this.field_g, true);
                    this.field_f.a((gg) (var4), (long)param1, 1);
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
              var5[-2 + var18.length] = (byte)(this.field_k.field_j[param1] >>> -1051771352);
              var5[-1 + var18.length] = (byte)this.field_k.field_j[param1];
              if (null == this.field_h) {
                break L10;
              } else {
                discarded$1 = this.field_r.a(this.field_h, -115, param1, var18);
                if ((this.field_B[param1] ^ -1) == -2) {
                  break L10;
                } else {
                  this.field_B[param1] = (byte) 1;
                  break L10;
                }
              }
            }
            L11: {
              if (((ki) (var4)).field_u) {
                break L11;
              } else {
                ((ki) (var4)).c(20);
                break L11;
              }
            }
            return (ki) (var4);
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
                      nj.field_q.reset();
                      nj.field_q.update(var5, 0, -2 + var18.length);
                      var6_int = (int)nj.field_q.getValue();
                      if (var6_int == this.field_k.field_l[param1]) {
                        L14: {
                          if (this.field_k.field_h == null) {
                            break L14;
                          } else {
                            if (this.field_k.field_h[param1] != null) {
                              var27 = this.field_k.field_h[param1];
                              var28 = bc.a(0, 0, -2 + var18.length, var18);
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
                        var7 = (65280 & var5[-2 + var18.length] << 88294888) - -(var5[var18.length + -1] & 255);
                        if (var7 == (65535 & this.field_k.field_j[param1])) {
                          L16: {
                            if ((this.field_B[param1] ^ -1) == -2) {
                              break L16;
                            } else {
                              L17: {
                                if (this.field_B[param1] != 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_B[param1] = (byte) 1;
                              break L16;
                            }
                          }
                          L18: {
                            if (((ki) (var4)).field_u) {
                              break L18;
                            } else {
                              ((ki) (var4)).c(20);
                              break L18;
                            }
                          }
                          stackOut_57_0 = var4;
                          stackIn_58_0 = stackOut_57_0;
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
              this.field_B[param1] = (byte)-1;
              ((ki) (var4)).c(20);
              if (((ki) (var4)).field_u) {
                if (!this.field_q.d(2)) {
                  var4 = this.field_q.a((byte) 2, param1, true, this.field_g, true);
                  this.field_f.a((gg) (var4), (long)param1, 1);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (ki) ((Object) stackIn_58_0);
          }
        } else {
          return null;
        }
    }

    final void c(int param0) {
        int var3 = 0;
        ki discarded$0 = null;
        ki discarded$1 = null;
        int var4 = stellarshard.field_B;
        if (this.field_v == null) {
            return;
        }
        if (null == this.a(-100)) {
            return;
        }
        if (param0 != 13596) {
            this.field_j = (gi) null;
        }
        gg var2 = this.field_u.b(-84);
        while (var2 != null) {
            var3 = (int)var2.field_j;
            if (-1 < (var3 ^ -1)) {
                var2.c(20);
            } else {
                if (var3 >= this.field_k.field_e) {
                    var2.c(20);
                } else {
                    if (-1 == (this.field_k.field_p[var3] ^ -1)) {
                        var2.c(20);
                    } else {
                        if (0 == this.field_B[var3]) {
                            discarded$0 = this.a(-28529, var3, 1);
                        }
                        if (this.field_B[var3] == -1) {
                            discarded$1 = this.a(-28529, var3, 2);
                        }
                        if (-2 == (this.field_B[var3] ^ -1)) {
                            var2.c(20);
                        }
                    }
                }
            }
            var2 = this.field_u.b((byte) 65);
        }
    }

    final lh a(int param0) {
        el discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        if (null == this.field_k) {
          L0: {
            if (this.field_o != null) {
              break L0;
            } else {
              if (!this.field_q.d(2)) {
                this.field_o = (ki) ((Object) this.field_q.a((byte) 0, this.field_g, true, 255, true));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_o.field_w) {
            L1: {
              var7 = this.field_o.g(-27203);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_o instanceof el)) {
                try {
                  L2: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_k = new lh(var7, this.field_A, this.field_w);
                      break L2;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    this.field_q.b(-127);
                    this.field_k = null;
                    if (!this.field_q.d(2)) {
                      this.field_o = (ki) ((Object) this.field_q.a((byte) 0, this.field_g, true, 255, true));
                      break L3;
                    } else {
                      this.field_o = null;
                      break L3;
                    }
                  }
                  return null;
                }
                if (this.field_j == null) {
                  break L1;
                } else {
                  discarded$1 = this.field_r.a(this.field_j, 106, this.field_g, var7);
                  break L1;
                }
              } else {
                try {
                  L4: {
                    if (var5 != null) {
                      this.field_k = new lh(var7, this.field_A, this.field_w);
                      if (this.field_k.field_r == this.field_E) {
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
                    this.field_k = null;
                    if (this.field_q.d(2)) {
                      this.field_o = null;
                      break L5;
                    } else {
                      this.field_o = (ki) ((Object) this.field_q.a((byte) 0, this.field_g, true, 255, true));
                      break L5;
                    }
                  }
                  return null;
                }
                break L1;
              }
            }
            L6: {
              this.field_o = null;
              if (param0 <= -8) {
                break L6;
              } else {
                wc.a(false);
                break L6;
              }
            }
            L7: {
              if (null != this.field_h) {
                this.field_B = new byte[this.field_k.field_e];
                break L7;
              } else {
                break L7;
              }
            }
            return this.field_k;
          } else {
            return null;
          }
        } else {
          return this.field_k;
        }
    }

    final void d(int param0) {
        if (this.field_h == null) {
            return;
        }
        this.field_i = true;
        if (null == this.field_v) {
            this.field_v = new oj();
        }
        if (param0 != 2) {
            this.d(49);
        }
    }

    final byte[] a(byte param0, int param1) {
        ki var3 = this.a(-28529, param1, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g(-27203);
        var3.c(20);
        if (param0 != 35) {
            this.c(-36);
        }
        return var4;
    }

    final int a(int param0, int param1) {
        ki var3 = (ki) ((Object) this.field_f.a((long)param1, 36));
        if (param0 != 0) {
            this.field_g = -63;
        }
        if (var3 == null) {
            return 0;
        }
        return var3.a(true);
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_s = (pb) null;
        }
        field_l = null;
        field_C = null;
        field_s = null;
        field_p = null;
        field_z = null;
        field_x = null;
    }

    final void b(boolean param0) {
        ki discarded$4 = null;
        ki discarded$5 = null;
        ki discarded$6 = null;
        ki discarded$7 = null;
        int var2_int = 0;
        ki var2 = null;
        gg var3 = null;
        int var4 = 0;
        int var5 = 0;
        gg var6 = null;
        gg var7 = null;
        L0: {
          var5 = stellarshard.field_B;
          if (this.field_v == null) {
            break L0;
          } else {
            if (null != this.a(-94)) {
              if (!this.field_t) {
                if (!this.field_i) {
                  this.field_v = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = this.field_v.b(-125);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (this.field_m >= this.field_k.field_p.length) {
                            break L3;
                          } else {
                            L4: {
                              if (this.field_k.field_p[this.field_m] == 0) {
                                break L4;
                              } else {
                                if (!this.field_q.e(-105)) {
                                  L5: {
                                    if ((this.field_B[this.field_m] ^ -1) == -2) {
                                      break L5;
                                    } else {
                                      discarded$4 = this.a(-28529, this.field_m, 2);
                                      break L5;
                                    }
                                  }
                                  if (this.field_B[this.field_m] == 1) {
                                    break L4;
                                  } else {
                                    var7 = new gg();
                                    var7.field_j = (long)this.field_m;
                                    var2_int = 0;
                                    this.field_v.b(-80, var7);
                                    break L4;
                                  }
                                } else {
                                  var2_int = 0;
                                  break L3;
                                }
                              }
                            }
                            this.field_m = this.field_m + 1;
                            continue L2;
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_m = 0;
                          this.field_i = false;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_j;
                        if (-2 == (this.field_B[var4] ^ -1)) {
                          break L6;
                        } else {
                          discarded$5 = this.a(-28529, var4, 2);
                          break L6;
                        }
                      }
                      L7: {
                        if (-2 != (this.field_B[var4] ^ -1)) {
                          var2_int = 0;
                          break L7;
                        } else {
                          var3.c(20);
                          break L7;
                        }
                      }
                      var3 = this.field_v.b((byte) -44);
                      continue L1;
                    }
                  }
                }
              } else {
                var2_int = 1;
                var3 = this.field_v.b(-87);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (this.field_k.field_p.length <= this.field_m) {
                          break L10;
                        } else {
                          L11: {
                            if (this.field_k.field_p[this.field_m] == 0) {
                              break L11;
                            } else {
                              if (250 <= this.field_r.field_e) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L12: {
                                  if (-1 != (this.field_B[this.field_m] ^ -1)) {
                                    break L12;
                                  } else {
                                    discarded$6 = this.a(-28529, this.field_m, 1);
                                    break L12;
                                  }
                                }
                                if (0 == this.field_B[this.field_m]) {
                                  var6 = new gg();
                                  var6.field_j = (long)this.field_m;
                                  var2_int = 0;
                                  this.field_v.b(-93, var6);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          this.field_m = this.field_m + 1;
                          continue L9;
                        }
                      }
                      if (var2_int == 0) {
                        break L0;
                      } else {
                        this.field_m = 0;
                        this.field_t = false;
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_j;
                      if (this.field_B[var4] == 0) {
                        discarded$7 = this.a(-28529, var4, 1);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (this.field_B[var4] != 0) {
                        var3.c(20);
                        break L14;
                      } else {
                        var2_int = 0;
                        break L14;
                      }
                    }
                    var3 = this.field_v.b((byte) -113);
                    continue L8;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
        if (!param0) {
          L15: {
            if (!this.field_n) {
              break L15;
            } else {
              if (ih.a((byte) -98) >= this.field_D) {
                var2 = (ki) ((Object) this.field_f.a((byte) 104));
                L16: while (true) {
                  if (var2 == null) {
                    this.field_D = 1000L + ih.a((byte) -98);
                    break L15;
                  } else {
                    L17: {
                      if (!var2.field_w) {
                        if (var2.field_y) {
                          if (var2.field_u) {
                            var2.c(20);
                            break L17;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_y = true;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    var2 = (ki) ((Object) this.field_f.b((byte) 118));
                    continue L16;
                  }
                }
              } else {
                break L15;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    wc(int param0, gi param1, gi param2, fb param3, rk param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_f = new uh(16);
        this.field_m = 0;
        this.field_u = new oj();
        this.field_D = 0L;
        try {
          L0: {
            L1: {
              this.field_g = param0;
              this.field_h = param1;
              if (this.field_h == null) {
                this.field_t = false;
                break L1;
              } else {
                this.field_t = true;
                this.field_v = new oj();
                break L1;
              }
            }
            L2: {
              this.field_E = param7;
              this.field_A = param5;
              this.field_j = param2;
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
              ((wc) (this)).field_n = stackIn_7_1 != 0;
              this.field_w = param6;
              this.field_q = param3;
              this.field_r = param4;
              if (null == this.field_j) {
                break L3;
              } else {
                this.field_o = (ki) ((Object) this.field_r.a(this.field_j, (byte) 101, this.field_g));
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
            stackOut_10_1 = new StringBuilder().append("wc.<init>(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_z = "Quit to website";
        field_x = new boolean[64];
        field_l = " of 50<br>Current score : ";
        field_p = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
