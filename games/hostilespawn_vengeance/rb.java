/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends uk {
    static int[] field_p;
    private um field_n;
    private int field_l;
    private byte[] field_v;
    private jm field_i;
    private wc field_x;
    private int field_B;
    private byte[] field_r;
    static int field_m;
    private ae field_j;
    private um field_q;
    static ji field_s;
    static bd field_y;
    private int field_g;
    private ej field_h;
    private dh field_t;
    private vl field_w;
    private int field_A;
    private boolean field_z;
    private boolean field_o;
    private vl field_u;
    private long field_k;
    private boolean field_f;

    final int b(int param0, int param1) {
        ae var3 = (ae) ((Object) this.field_i.a(false, (long)param1));
        int var4 = 5 / ((33 - param0) / 52);
        if (var3 == null) {
            return 0;
        }
        return var3.d(-94);
    }

    private final ae a(int param0, int param1, boolean param2) {
        Object stackIn_88_0 = null;
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
        ae var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = HostileSpawn.field_I ? 1 : 0;
          var12 = (ae) ((Object) this.field_i.a(param2, (long)param0));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (-1 != (param1 ^ -1)) {
              break L0;
            } else {
              if (var12.field_w) {
                break L0;
              } else {
                if (!var12.field_v) {
                  break L0;
                } else {
                  var12.b(-37);
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
              if (param1 == 0) {
                L3: {
                  if (this.field_q == null) {
                    break L3;
                  } else {
                    if (0 != (this.field_r[param0] ^ -1)) {
                      var4 = this.field_t.a(this.field_q, param0, -27337);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_h.a(20)) {
                  var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 != param1) {
                  if ((param1 ^ -1) == -3) {
                    if (this.field_q == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 != this.field_r[param0]) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_h.b(5)) {
                          var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, false);
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
                  if (this.field_q != null) {
                    var4 = this.field_t.a(this.field_q, (byte) -127, param0);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            this.field_i.a(-97, (long)param0, (am) (var4));
            break L1;
          }
        }
        if (!((ae) (var4)).field_v) {
          var18 = ((ae) (var4)).c((byte) 127);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof rh) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var18.length > 2) {
                      td.field_a.reset();
                      td.field_a.update(var5, 0, var18.length + -2);
                      var6_int = (int)td.field_a.getValue();
                      if (var6_int == this.field_x.field_v[param0]) {
                        L6: {
                          if (null == this.field_x.field_w) {
                            break L6;
                          } else {
                            if (this.field_x.field_w[param0] == null) {
                              break L6;
                            } else {
                              var30 = this.field_x.field_w[param0];
                              var29 = ld.a(var5, 0, 125, -2 + var18.length);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if ((var11 ^ -1) <= -65) {
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
                            }
                          }
                        }
                        var7 = (255 & var5[var18.length + -1]) + ((255 & var5[-2 + var18.length]) << 872423560);
                        if ((65535 & this.field_x.field_i[param0]) != var7) {
                          throw new RuntimeException();
                        } else {
                          L8: {
                            if ((this.field_r[param0] ^ -1) == -2) {
                              break L8;
                            } else {
                              L9: {
                                if (-1 != (this.field_r[param0] ^ -1)) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              this.field_r[param0] = (byte) 1;
                              break L8;
                            }
                          }
                          L10: {
                            if (((ae) (var4)).field_w) {
                              break L10;
                            } else {
                              ((ae) (var4)).b(-116);
                              break L10;
                            }
                          }
                          stackIn_88_0 = var4;
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
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
              L11: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_r[param0] = (byte)-1;
                ((ae) (var4)).b(113);
                if (((ae) (var4)).field_w) {
                  if (!this.field_h.a(20)) {
                    var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, true);
                    this.field_i.a(-114, (long)param0, (am) (var4));
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              return null;
            }
            return (ae) ((Object) stackIn_88_0);
          } else {
            try {
              L12: {
                L13: {
                  if (var5 == null) {
                    break L13;
                  } else {
                    if (2 < var18.length) {
                      td.field_a.reset();
                      td.field_a.update(var5, 0, var18.length + -2);
                      var6_int = (int)td.field_a.getValue();
                      if (this.field_x.field_v[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (this.field_x.field_w == null) {
                            break L14;
                          } else {
                            if (null != this.field_x.field_w[param0]) {
                              var27 = this.field_x.field_w[param0];
                              var28 = ld.a(var5, 0, 104, var18.length + -2);
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
                            } else {
                              break L14;
                            }
                          }
                        }
                        this.field_h.field_k = 0;
                        this.field_h.field_e = 0;
                        break L12;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_h.c(194);
              ((ae) (var4)).b(-9);
              if (((ae) (var4)).field_w) {
                L16: {
                  if (!this.field_h.a(20)) {
                    var4 = this.field_h.a((byte) 2, this.field_g, param0, -18986, true);
                    this.field_i.a(-106, (long)param0, (am) (var4));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L17: {
              var5[-2 + var18.length] = (byte)(this.field_x.field_i[param0] >>> 1106421096);
              var5[var18.length + -1] = (byte)this.field_x.field_i[param0];
              if (null != this.field_q) {
                this.field_t.a(this.field_q, -4, var18, param0);
                if (-2 == (this.field_r[param0] ^ -1)) {
                  break L17;
                } else {
                  this.field_r[param0] = (byte) 1;
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (!((ae) (var4)).field_w) {
                ((ae) (var4)).b(26);
                break L18;
              } else {
                break L18;
              }
            }
            return (ae) (var4);
          }
        } else {
          return null;
        }
    }

    final static void e(int param0) {
        if (param0 != -2) {
            return;
        }
        vc.field_i[93] = 43;
        vc.field_i[47] = 73;
        vc.field_i[222] = 58;
        vc.field_i[192] = 28;
        vc.field_i[520] = 59;
        vc.field_i[92] = 74;
        vc.field_i[44] = 71;
        vc.field_i[91] = 42;
        vc.field_i[45] = 26;
        vc.field_i[61] = 27;
        vc.field_i[46] = 72;
        vc.field_i[59] = 57;
    }

    final byte[] a(byte param0, int param1) {
        ae var3 = this.a(param1, 0, false);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.c((byte) 127);
        var3.b(-76);
        if (param0 != -50) {
            this.b(-104, 72);
        }
        return var4;
    }

    final void f(int param0) {
        ae discarded$0 = null;
        ae discarded$1 = null;
        ae discarded$2 = null;
        ae discarded$3 = null;
        int var2_int;
        ae var2;
        am var3;
        int var4;
        int var5;
        am var6;
        am var7;
        L0: {
          L1: {
            L2: {
              L3: {
                var5 = HostileSpawn.field_I ? 1 : 0;
                if (null != this.field_w) {
                  if (this.c(3) != null) {
                    if (this.field_o) {
                      var2_int = 1;
                      var3 = this.field_w.g(-81);
                      L4: while (true) {
                        if (var3 == null) {
                          L5: while (true) {
                            L6: {
                              if (this.field_A >= this.field_x.field_o.length) {
                                break L6;
                              } else {
                                L7: {
                                  if (this.field_x.field_o[this.field_A] == 0) {
                                    break L7;
                                  } else {
                                    if ((this.field_t.field_e ^ -1) <= -251) {
                                      var2_int = 0;
                                      break L6;
                                    } else {
                                      L8: {
                                        if (0 != this.field_r[this.field_A]) {
                                          break L8;
                                        } else {
                                          discarded$0 = this.a(this.field_A, 1, false);
                                          break L8;
                                        }
                                      }
                                      if (-1 != (this.field_r[this.field_A] ^ -1)) {
                                        break L7;
                                      } else {
                                        var7 = new am();
                                        var7.field_c = (long)this.field_A;
                                        var2_int = 0;
                                        this.field_w.a(var7, 90);
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                this.field_A = this.field_A + 1;
                                continue L5;
                              }
                            }
                            if (var2_int == 0) {
                              break L3;
                            } else {
                              this.field_A = 0;
                              this.field_o = false;
                              break L3;
                            }
                          }
                        } else {
                          L9: {
                            var4 = (int)var3.field_c;
                            if (this.field_r[var4] != 0) {
                              break L9;
                            } else {
                              discarded$1 = this.a(var4, 1, false);
                              break L9;
                            }
                          }
                          L10: {
                            if (this.field_r[var4] == 0) {
                              var2_int = 0;
                              break L10;
                            } else {
                              var3.b(126);
                              break L10;
                            }
                          }
                          var3 = this.field_w.a(12684);
                          continue L4;
                        }
                      }
                    } else {
                      if (this.field_z) {
                        var2_int = 1;
                        var3 = this.field_w.g(-100);
                        L11: while (true) {
                          if (var3 == null) {
                            L12: while (true) {
                              L13: {
                                if (this.field_A >= this.field_x.field_o.length) {
                                  break L13;
                                } else {
                                  if (-1 != (this.field_x.field_o[this.field_A] ^ -1)) {
                                    if (!this.field_h.b(param0 ^ -6)) {
                                      L14: {
                                        if (1 != this.field_r[this.field_A]) {
                                          discarded$2 = this.a(this.field_A, 2, false);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if ((this.field_r[this.field_A] ^ -1) == -2) {
                                          break L15;
                                        } else {
                                          var6 = new am();
                                          var6.field_c = (long)this.field_A;
                                          this.field_w.a(var6, 81);
                                          var2_int = 0;
                                          break L15;
                                        }
                                      }
                                      this.field_A = this.field_A + 1;
                                      continue L12;
                                    } else {
                                      var2_int = 0;
                                      break L13;
                                    }
                                  } else {
                                    this.field_A = this.field_A + 1;
                                    continue L12;
                                  }
                                }
                              }
                              if (var2_int != 0) {
                                this.field_A = 0;
                                this.field_z = false;
                                break L3;
                              } else {
                                L16: {
                                  if (param0 == -1) {
                                    break L16;
                                  } else {
                                    field_p = (int[]) null;
                                    break L16;
                                  }
                                }
                                if (!this.field_f) {
                                  break L0;
                                } else {
                                  if (this.field_k > hn.a((byte) 80)) {
                                    break L1;
                                  } else {
                                    var2 = (ae) ((Object) this.field_i.a(-93));
                                    L17: while (true) {
                                      if (var2 == null) {
                                        break L2;
                                      } else {
                                        L18: {
                                          if (var2.field_v) {
                                            break L18;
                                          } else {
                                            if (!var2.field_t) {
                                              var2.field_t = true;
                                              break L18;
                                            } else {
                                              if (!var2.field_w) {
                                                throw new RuntimeException();
                                              } else {
                                                var2.b(20);
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                        var2 = (ae) ((Object) this.field_i.b(param0 + 0));
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L19: {
                              var4 = (int)var3.field_c;
                              if (1 == this.field_r[var4]) {
                                break L19;
                              } else {
                                discarded$3 = this.a(var4, 2, false);
                                break L19;
                              }
                            }
                            L20: {
                              if ((this.field_r[var4] ^ -1) != -2) {
                                var2_int = 0;
                                break L20;
                              } else {
                                var3.b(-124);
                                break L20;
                              }
                            }
                            var3 = this.field_w.a(param0 + 12685);
                            continue L11;
                          }
                        }
                      } else {
                        this.field_w = null;
                        break L3;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L3;
                }
              }
              L21: {
                if (param0 == -1) {
                  break L21;
                } else {
                  field_p = (int[]) null;
                  break L21;
                }
              }
              if (!this.field_f) {
                break L0;
              } else {
                if (this.field_k > hn.a((byte) 80)) {
                  break L1;
                } else {
                  var2 = (ae) ((Object) this.field_i.a(-93));
                  L22: while (true) {
                    if (var2 == null) {
                      break L2;
                    } else {
                      L23: {
                        if (var2.field_v) {
                          break L23;
                        } else {
                          if (!var2.field_t) {
                            var2.field_t = true;
                            break L23;
                          } else {
                            if (!var2.field_w) {
                              throw new RuntimeException();
                            } else {
                              var2.b(20);
                              break L23;
                            }
                          }
                        }
                      }
                      var2 = (ae) ((Object) this.field_i.b(param0 + 0));
                      continue L22;
                    }
                  }
                }
              }
            }
            this.field_k = 1000L + hn.a((byte) 80);
            break L1;
          }
          break L0;
        }
    }

    final wc c(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_x != null) {
          return this.field_x;
        } else {
          L0: {
            if (null != this.field_j) {
              break L0;
            } else {
              if (!this.field_h.a(param0 ^ 23)) {
                this.field_j = (ae) ((Object) this.field_h.a((byte) 0, 255, this.field_g, -18986, true));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_j.field_v) {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.c(-109);
                break L1;
              }
            }
            L2: {
              var7 = this.field_j.c((byte) 127);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_j instanceof rh)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_x = new wc(var7, this.field_l, this.field_v);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_h.c(194);
                    this.field_x = null;
                    if (this.field_h.a(20)) {
                      this.field_j = null;
                      break L4;
                    } else {
                      this.field_j = (ae) ((Object) this.field_h.a((byte) 0, 255, this.field_g, -18986, true));
                      break L4;
                    }
                  }
                  return null;
                }
                if (this.field_n != null) {
                  this.field_t.a(this.field_n, -4, var7, this.field_g);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      this.field_x = new wc(var7, this.field_l, this.field_v);
                      if (this.field_B != this.field_x.field_n) {
                        throw new RuntimeException();
                      } else {
                        break L5;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_x = null;
                    if (!this.field_h.a(20)) {
                      this.field_j = (ae) ((Object) this.field_h.a((byte) 0, 255, this.field_g, -18986, true));
                      break L6;
                    } else {
                      this.field_j = null;
                      break L6;
                    }
                  }
                  return null;
                }
                break L2;
              }
            }
            L7: {
              this.field_j = null;
              if (this.field_q != null) {
                this.field_r = new byte[this.field_x.field_c];
                break L7;
              } else {
                break L7;
              }
            }
            return this.field_x;
          } else {
            return null;
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        ae discarded$0 = null;
        ae discarded$1 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 < 20) {
            field_y = (bd) null;
        }
        if (this.field_w == null) {
            return;
        }
        if (!(null != this.c(3))) {
            return;
        }
        am var2 = this.field_u.g(-6);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if (var3 < 0) {
                var2.b(113);
            } else {
                if (var3 >= this.field_x.field_c) {
                    var2.b(113);
                } else {
                    if (this.field_x.field_o[var3] == 0) {
                        var2.b(113);
                    } else {
                        if (!(-1 != (this.field_r[var3] ^ -1))) {
                            discarded$0 = this.a(var3, 1, false);
                        }
                        if (-1 == this.field_r[var3]) {
                            discarded$1 = this.a(var3, 2, false);
                        }
                        if (1 == this.field_r[var3]) {
                            var2.b(-79);
                        }
                    }
                }
            }
            var2 = this.field_u.a(12684);
        }
    }

    public static void a(boolean param0) {
        field_s = null;
        if (param0) {
            return;
        }
        field_p = null;
        field_y = null;
    }

    final void a(byte param0) {
        if (!(this.field_q != null)) {
            return;
        }
        if (param0 != -50) {
            this.field_r = (byte[]) null;
        }
        this.field_z = true;
        if (!(null != this.field_w)) {
            this.field_w = new vl();
        }
    }

    rb(int param0, um param1, um param2, ej param3, dh param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_i = new jm(16);
        this.field_A = 0;
        this.field_u = new vl();
        this.field_k = 0L;
        try {
          L0: {
            L1: {
              this.field_g = param0;
              this.field_q = param1;
              if (null == this.field_q) {
                this.field_o = false;
                break L1;
              } else {
                this.field_o = true;
                this.field_w = new vl();
                break L1;
              }
            }
            L2: {
              this.field_l = param5;
              this.field_v = param6;
              this.field_t = param4;
              this.field_B = param7;
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
              ((rb) (this)).field_f = stackIn_7_1 != 0;
              this.field_h = param3;
              this.field_n = param2;
              if (null == this.field_n) {
                break L3;
              } else {
                this.field_j = (ae) ((Object) this.field_t.a(this.field_n, this.field_g, -27337));
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

            stackIn_12_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_p = new int[8192];
        field_m = 0;
    }
}
