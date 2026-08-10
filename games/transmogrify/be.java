/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends ih {
    private uh field_t;
    private rh field_f;
    private int field_o;
    private fl field_m;
    private int field_r;
    private ak field_p;
    private cd field_g;
    private ak field_z;
    private byte[] field_i;
    static int field_q;
    private byte[] field_k;
    private el field_v;
    private int field_A;
    private qj field_y;
    private int field_e;
    private qj field_s;
    private boolean field_h;
    private boolean field_u;
    private boolean field_j;
    private long field_l;
    static nk field_w;
    static ci field_n;
    static int field_x;

    public static void c(byte param0) {
        if (param0 <= 92) {
            be.b(-13);
        }
        field_n = null;
        field_w = null;
    }

    private final rh a(int param0, byte param1, int param2) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        Object stackIn_91_0 = null;
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
        rh var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = Transmogrify.field_A ? 1 : 0;
          var12 = (rh) ((Object) this.field_m.a((long)param0, 0));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (-1 != (param2 ^ -1)) {
              break L0;
            } else {
              if (var12.field_p) {
                break L0;
              } else {
                if (var12.field_m) {
                  var12.c(5);
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
          if (var4 == null) {
            L2: {
              if (param2 != 0) {
                if (param2 != 1) {
                  if (2 == param2) {
                    if (this.field_p == null) {
                      throw new RuntimeException();
                    } else {
                      if (this.field_k[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_t.b((byte) 95)) {
                          var4 = this.field_t.a(this.field_r, false, false, (byte) 2, param0);
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
                  if (this.field_p != null) {
                    var4 = this.field_g.a(param0, this.field_p, (byte) 67);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                }
              } else {
                L3: {
                  if (this.field_p == null) {
                    break L3;
                  } else {
                    if (this.field_k[param0] == -1) {
                      break L3;
                    } else {
                      var4 = this.field_g.a(this.field_p, param0, true);
                      break L2;
                    }
                  }
                }
                if (!this.field_t.b(6)) {
                  var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_m.a((long)param0, (byte) -98, (wf) (var4));
            break L1;
          } else {
            break L1;
          }
        }
        if (!((rh) (var4)).field_m) {
          L4: {
            var18 = ((rh) (var4)).e(256);
            var13 = var18;
            var5 = var13;
            if (param1 == 2) {
              break L4;
            } else {
              this.b(-44, 48);
              break L4;
            }
          }
          if (var4 instanceof cl) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (var18.length <= 2) {
                      break L6;
                    } else {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var18.length + -2);
                      var6_int = (int)hc.field_v.getValue();
                      if (var6_int == this.field_v.field_j[param0]) {
                        L7: {
                          if (this.field_v.field_p == null) {
                            break L7;
                          } else {
                            if (null != this.field_v.field_p[param0]) {
                              var30 = this.field_v.field_p[param0];
                              var29 = n.a(var5, var18.length - 2, -5705, 0);
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
                        var7 = (var5[var18.length - 2] << -224592664 & 65280) + (var5[-1 + var18.length] & 255);
                        if ((65535 & this.field_v.field_q[param0]) == var7) {
                          L9: {
                            if ((this.field_k[param0] ^ -1) != -2) {
                              L10: {
                                if (0 == this.field_k[param0]) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_k[param0] = (byte) 1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L11: {
                            if (!((rh) (var4)).field_p) {
                              ((rh) (var4)).c(param1 + 3);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          stackIn_91_0 = var4;
                          break L5;
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
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L12: {
                var6 = (Exception) (Object) decompiledCaughtException;
                this.field_k[param0] = (byte)-1;
                ((rh) (var4)).c(param1 ^ 7);
                if (((rh) (var4)).field_p) {
                  if (!this.field_t.b(6)) {
                    var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
                    this.field_m.a((long)param0, (byte) 98, (wf) (var4));
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
            return (rh) ((Object) stackIn_91_0);
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if ((var18.length ^ -1) < -3) {
                      hc.field_v.reset();
                      hc.field_v.update(var5, 0, var18.length - 2);
                      var6_int = (int)hc.field_v.getValue();
                      if (var6_int != this.field_v.field_j[param0]) {
                        throw new RuntimeException();
                      } else {
                        L15: {
                          if (this.field_v.field_p == null) {
                            break L15;
                          } else {
                            if (null != this.field_v.field_p[param0]) {
                              var27 = this.field_v.field_p[param0];
                              var28 = n.a(var5, var18.length - 2, -5705, 0);
                              var9 = 0;
                              L16: while (true) {
                                if (-65 >= (var9 ^ -1)) {
                                  break L15;
                                } else {
                                  if (var27[var9] == var28[var9]) {
                                    var9++;
                                    continue L16;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.field_t.field_p = 0;
                        this.field_t.field_k = 0;
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
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_t.d(126);
              ((rh) (var4)).c(5);
              if (((rh) (var4)).field_p) {
                if (!this.field_t.b(6)) {
                  var4 = this.field_t.a(this.field_r, false, true, (byte) 2, param0);
                  this.field_m.a((long)param0, (byte) -102, (wf) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L17: {
              var5[-2 + var18.length] = (byte)(this.field_v.field_q[param0] >>> 1140682824);
              var5[-1 + var18.length] = (byte)this.field_v.field_q[param0];
              if (null == this.field_p) {
                break L17;
              } else {
                this.field_g.a(this.field_p, var18, -122, param0);
                stackIn_60_0 = this.field_k[param0] ^ -1;
                stackIn_60_1 = -2;
                if (stackIn_60_0 != stackIn_60_1) {
                  this.field_k[param0] = (byte) 1;
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            L18: {
              if (!((rh) (var4)).field_p) {
                ((rh) (var4)).c(5);
                break L18;
              } else {
                break L18;
              }
            }
            return (rh) (var4);
          }
        } else {
          return null;
        }
    }

    final el a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_v) {
          return this.field_v;
        } else {
          if (param0 <= -88) {
            L0: {
              if (null == this.field_f) {
                if (!this.field_t.b(6)) {
                  this.field_f = (rh) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
                  break L0;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (!this.field_f.field_m) {
              L1: {
                var7 = this.field_f.e(256);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (!(this.field_f instanceof cl)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_v = new el(var7, this.field_A, this.field_i);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_t.d(121);
                      this.field_v = null;
                      if (!this.field_t.b(6)) {
                        this.field_f = (rh) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
                        break L3;
                      } else {
                        this.field_f = null;
                        break L3;
                      }
                    }
                    return null;
                  }
                  if (null == this.field_z) {
                    break L1;
                  } else {
                    this.field_g.a(this.field_z, var7, -78, this.field_r);
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        this.field_v = new el(var7, this.field_A, this.field_i);
                        if (this.field_v.field_b == this.field_o) {
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
                      this.field_v = null;
                      if (this.field_t.b(6)) {
                        this.field_f = null;
                        break L5;
                      } else {
                        this.field_f = (rh) ((Object) this.field_t.a(255, false, true, (byte) 0, this.field_r));
                        break L5;
                      }
                    }
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                if (null != this.field_p) {
                  this.field_k = new byte[this.field_v.field_l];
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_f = null;
              return this.field_v;
            } else {
              return null;
            }
          } else {
            return (el) null;
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        rh discarded$0 = null;
        rh discarded$1 = null;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (!(null != this.field_s)) {
            return;
        }
        if (null == this.a(-119)) {
            return;
        }
        wf var2 = this.field_y.a((byte) -95);
        while (var2 != null) {
            var3 = (int)var2.field_c;
            if (-1 < (var3 ^ -1)) {
                var2.c(5);
            } else {
                if (this.field_v.field_l <= var3) {
                    var2.c(5);
                } else {
                    if (0 == this.field_v.field_s[var3]) {
                        var2.c(5);
                    } else {
                        if (!(0 != this.field_k[var3])) {
                            discarded$0 = this.a(var3, (byte) 2, 1);
                        }
                        if (this.field_k[var3] == -1) {
                            discarded$1 = this.a(var3, (byte) 2, 2);
                        }
                        if (this.field_k[var3] == 1) {
                            var2.c(param0 ^ 23884);
                        }
                    }
                }
            }
            var2 = this.field_y.a(true);
        }
        if (param0 != 23881) {
            this.field_v = (el) null;
        }
    }

    final static int b(int param0) {
        L0: {
          if (param0 == 71) {
            break L0;
          } else {
            field_q = -78;
            break L0;
          }
        }
        if (bi.field_L >= 2) {
          L1: {
            if (0 == w.field_f) {
              if (!cj.field_c.a((byte) -126)) {
                return 20;
              } else {
                if (!cj.field_c.a((byte) 120, "commonui")) {
                  return 40;
                } else {
                  if (!wi.field_e.a((byte) -127)) {
                    return 50;
                  } else {
                    if (wi.field_e.a((byte) 112, "commonui")) {
                      if (!nd.field_n.a((byte) -118)) {
                        return 70;
                      } else {
                        if (nd.field_n.c(param0 ^ 32088)) {
                          break L1;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  }
                }
              }
            } else {
              L2: {
                if (null == hg.field_a) {
                  break L2;
                } else {
                  if (hg.field_a.a((byte) -114)) {
                    if (!hg.field_a.b((byte) -120, "")) {
                      return 29;
                    } else {
                      if (!hg.field_a.a((byte) -98, "")) {
                        return 29;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (cj.field_c.a((byte) -125)) {
                if (cj.field_c.a((byte) 120, "commonui")) {
                  if (wi.field_e.a((byte) -118)) {
                    if (wi.field_e.a((byte) -42, "commonui")) {
                      if (nd.field_n.a((byte) -118)) {
                        if (!nd.field_n.c(param0 ^ 32088)) {
                          return 86;
                        } else {
                          break L1;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final void a(boolean param0) {
        if (null == this.field_p) {
            return;
        }
        this.field_h = param0 ? true : false;
        if (!(null != this.field_s)) {
            this.field_s = new qj();
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ga.a(param0, 3336)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ve.a(1, param0)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!vj.a(-23424, param0)) {
                  if (param2.length() != param1) {
                    if (!fc.a((byte) 19, param0, param2)) {
                      if (fk.a(param2, (byte) 34, param0)) {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (me.a(param2, (byte) 117, param0)) {
                          stackIn_24_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("be.I(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L1;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    return stackIn_24_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void b(byte param0) {
        rh discarded$0 = null;
        rh discarded$1 = null;
        rh discarded$2 = null;
        rh discarded$3 = null;
        int var2_int;
        rh var2;
        wf var3;
        int var4;
        int var5;
        wf var6;
        wf var7;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (null != this.field_s) {
            if (null != this.a(-95)) {
              if (this.field_u) {
                var2_int = 1;
                var3 = this.field_s.a((byte) -95);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_e >= this.field_v.field_s.length) {
                          break L3;
                        } else {
                          L4: {
                            if (this.field_v.field_s[this.field_e] == 0) {
                              break L4;
                            } else {
                              if (250 <= this.field_g.field_e) {
                                var2_int = 0;
                                break L3;
                              } else {
                                L5: {
                                  if (this.field_k[this.field_e] != 0) {
                                    break L5;
                                  } else {
                                    discarded$0 = this.a(this.field_e, (byte) 2, 1);
                                    break L5;
                                  }
                                }
                                if (this.field_k[this.field_e] == 0) {
                                  var7 = new wf();
                                  var7.field_c = (long)this.field_e;
                                  var2_int = 0;
                                  this.field_s.a(var7, -115);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          this.field_e = this.field_e + 1;
                          continue L2;
                        }
                      }
                      if (var2_int != 0) {
                        this.field_e = 0;
                        this.field_u = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_c;
                      if (-1 == (this.field_k[var4] ^ -1)) {
                        discarded$1 = this.a(var4, (byte) 2, 1);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (this.field_k[var4] == 0) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.c(5);
                        break L7;
                      }
                    }
                    var3 = this.field_s.a(true);
                    continue L1;
                  }
                }
              } else {
                if (!this.field_h) {
                  this.field_s = null;
                  break L0;
                } else {
                  var2_int = 1;
                  var3 = this.field_s.a((byte) -95);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_v.field_s.length <= this.field_e) {
                            break L10;
                          } else {
                            if (-1 != (this.field_v.field_s[this.field_e] ^ -1)) {
                              if (!this.field_t.b((byte) 122)) {
                                L11: {
                                  if (-2 == (this.field_k[this.field_e] ^ -1)) {
                                    break L11;
                                  } else {
                                    discarded$2 = this.a(this.field_e, (byte) 2, 2);
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (1 != this.field_k[this.field_e]) {
                                    var6 = new wf();
                                    var6.field_c = (long)this.field_e;
                                    this.field_s.a(var6, -89);
                                    var2_int = 0;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                this.field_e = this.field_e + 1;
                                continue L9;
                              } else {
                                var2_int = 0;
                                break L10;
                              }
                            } else {
                              this.field_e = this.field_e + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int != 0) {
                          this.field_h = false;
                          this.field_e = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_c;
                        if ((this.field_k[var4] ^ -1) != -2) {
                          discarded$3 = this.a(var4, (byte) 2, 2);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (1 == this.field_k[var4]) {
                          var3.c(5);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = this.field_s.a(true);
                      continue L8;
                    }
                  }
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
          if (param0 >= 122) {
            break L15;
          } else {
            this.field_g = (cd) null;
            break L15;
          }
        }
        L16: {
          if (!this.field_j) {
            break L16;
          } else {
            L17: {
              if ((this.field_l ^ -1L) < (lk.a(0) ^ -1L)) {
                break L17;
              } else {
                var2 = (rh) ((Object) this.field_m.b(1000));
                L18: while (true) {
                  if (var2 == null) {
                    this.field_l = lk.a(0) + 1000L;
                    break L17;
                  } else {
                    L19: {
                      if (var2.field_m) {
                        break L19;
                      } else {
                        if (var2.field_o) {
                          if (var2.field_p) {
                            var2.c(5);
                            break L19;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          var2.field_o = true;
                          break L19;
                        }
                      }
                    }
                    var2 = (rh) ((Object) this.field_m.a(58));
                    continue L18;
                  }
                }
              }
            }
            break L16;
          }
        }
    }

    final byte[] a(int param0, int param1) {
        int var3 = 76 / ((-41 - param1) / 60);
        rh var4 = this.a(param0, (byte) 2, 0);
        if (var4 == null) {
            return null;
        }
        byte[] var5 = var4.e(256);
        var4.c(5);
        return var5;
    }

    final static hg c(int param0) {
        String var1 = cd.b(-89);
        if (var1 != null && 0 <= var1.indexOf('@')) {
            var1 = "";
        }
        if (param0 < 5) {
            return (hg) null;
        }
        return new hg(cd.b(-127), cf.d(4819119));
    }

    final int b(int param0, int param1) {
        rh var3 = (rh) ((Object) this.field_m.a((long)param1, 0));
        if (var3 != null) {
            return var3.f(0);
        }
        if (param0 > -13) {
            this.field_r = 65;
            return 0;
        }
        return 0;
    }

    be(int param0, ak param1, ak param2, uh param3, cd param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_m = new fl(16);
        this.field_e = 0;
        this.field_y = new qj();
        this.field_l = 0L;
        try {
          L0: {
            L1: {
              this.field_r = param0;
              this.field_p = param1;
              if (null != this.field_p) {
                this.field_u = true;
                this.field_s = new qj();
                break L1;
              } else {
                this.field_u = false;
                break L1;
              }
            }
            L2: {
              this.field_A = param5;
              this.field_t = param3;
              this.field_i = param6;
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
              ((be) (this)).field_j = stackIn_7_1 != 0;
              this.field_z = param2;
              this.field_o = param7;
              this.field_g = param4;
              if (null == this.field_z) {
                break L3;
              } else {
                this.field_f = (rh) ((Object) this.field_g.a(this.field_z, this.field_r, true));
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

            stackIn_12_1 = new StringBuilder().append("be.<init>(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_w = new nk(0);
    }
}
