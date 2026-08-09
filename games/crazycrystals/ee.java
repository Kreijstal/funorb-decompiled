/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends lk {
    static long field_e;
    private int field_u;
    static String field_q;
    private ni field_v;
    private wl field_k;
    private int field_r;
    private qg field_p;
    private sp field_l;
    private sp field_i;
    private byte[] field_x;
    private ob field_w;
    static dl field_m;
    private int field_s;
    private byte[] field_h;
    private fc field_g;
    private wb field_j;
    private wb field_n;
    private int field_o;
    private boolean field_d;
    private boolean field_f;
    private boolean field_t;
    private long field_c;

    final void e(int param0) {
        wl discarded$0 = null;
        wl discarded$1 = null;
        wl discarded$2 = null;
        wl discarded$3 = null;
        int var2;
        wl var2_ref_wl;
        jb var3;
        int var4;
        int var5;
        jb var6;
        jb var7;
        L0: {
          var5 = CrazyCrystals.field_B;
          if (this.field_j == null) {
            break L0;
          } else {
            if (this.a(630779105) == null) {
              return;
            } else {
              if (!this.field_d) {
                if (!this.field_f) {
                  this.field_j = null;
                  break L0;
                } else {
                  var2 = 1;
                  var3 = this.field_j.g(32073);
                  L1: while (true) {
                    if (var3 == null) {
                      L2: while (true) {
                        L3: {
                          if (this.field_o >= this.field_p.field_f.length) {
                            break L3;
                          } else {
                            L4: {
                              if (0 == this.field_p.field_f[this.field_o]) {
                                break L4;
                              } else {
                                if (this.field_w.c(-21)) {
                                  var2 = 0;
                                  break L3;
                                } else {
                                  L5: {
                                    if (this.field_h[this.field_o] != 1) {
                                      discarded$0 = this.a(true, 2, this.field_o);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (this.field_h[this.field_o] != 1) {
                                    var7 = new jb();
                                    var7.field_e = (long)this.field_o;
                                    var2 = 0;
                                    this.field_j.b(0, var7);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            this.field_o = this.field_o + 1;
                            continue L2;
                          }
                        }
                        if (var2 == 0) {
                          break L0;
                        } else {
                          this.field_f = false;
                          this.field_o = 0;
                          break L0;
                        }
                      }
                    } else {
                      L6: {
                        var4 = (int)var3.field_e;
                        if (1 != this.field_h[var4]) {
                          discarded$1 = this.a(true, 2, var4);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (this.field_h[var4] == 1) {
                          var3.a(false);
                          break L7;
                        } else {
                          var2 = 0;
                          break L7;
                        }
                      }
                      var3 = this.field_j.a(false);
                      continue L1;
                    }
                  }
                }
              } else {
                var2 = 1;
                var3 = this.field_j.g(32073);
                L8: while (true) {
                  if (var3 == null) {
                    L9: while (true) {
                      L10: {
                        if (this.field_o >= this.field_p.field_f.length) {
                          break L10;
                        } else {
                          L11: {
                            if (-1 == (this.field_p.field_f[this.field_o] ^ -1)) {
                              break L11;
                            } else {
                              if ((this.field_v.field_c ^ -1) > -251) {
                                L12: {
                                  if (-1 == (this.field_h[this.field_o] ^ -1)) {
                                    discarded$2 = this.a(true, 1, this.field_o);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (-1 == (this.field_h[this.field_o] ^ -1)) {
                                  var6 = new jb();
                                  var6.field_e = (long)this.field_o;
                                  var2 = 0;
                                  this.field_j.b(0, var6);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              } else {
                                var2 = 0;
                                break L10;
                              }
                            }
                          }
                          this.field_o = this.field_o + 1;
                          continue L9;
                        }
                      }
                      if (var2 == 0) {
                        break L0;
                      } else {
                        this.field_o = 0;
                        this.field_d = false;
                        break L0;
                      }
                    }
                  } else {
                    L13: {
                      var4 = (int)var3.field_e;
                      if (0 != this.field_h[var4]) {
                        break L13;
                      } else {
                        discarded$3 = this.a(true, 1, var4);
                        break L13;
                      }
                    }
                    L14: {
                      if (0 == this.field_h[var4]) {
                        var2 = 0;
                        break L14;
                      } else {
                        var3.a(false);
                        break L14;
                      }
                    }
                    var3 = this.field_j.a(false);
                    continue L8;
                  }
                }
              }
            }
          }
        }
        L15: {
          if (!this.field_t) {
            break L15;
          } else {
            if (this.field_c > lo.a((byte) 110)) {
              break L15;
            } else {
              var2_ref_wl = (wl) ((Object) this.field_g.a((byte) -92));
              L16: while (true) {
                if (var2_ref_wl == null) {
                  this.field_c = 1000L + lo.a((byte) -30);
                  break L15;
                } else {
                  L17: {
                    if (var2_ref_wl.field_n) {
                      break L17;
                    } else {
                      if (var2_ref_wl.field_l) {
                        if (!var2_ref_wl.field_q) {
                          throw new RuntimeException();
                        } else {
                          var2_ref_wl.a(false);
                          break L17;
                        }
                      } else {
                        var2_ref_wl.field_l = true;
                        break L17;
                      }
                    }
                  }
                  var2_ref_wl = (wl) ((Object) this.field_g.a(105));
                  continue L16;
                }
              }
            }
          }
        }
        var2 = -100 / ((param0 - -13) / 37);
    }

    final static wj a(db param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a(param1, -1);
              var5 = param0.a(-2862, param3, var4_int);
              if (param2 < -14) {
                break L1;
              } else {
                field_m = (dl) null;
                break L1;
              }
            }
            stackIn_3_0 = v.a(28297, var4_int, var5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ee.K(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(int param0, int param1) {
        wl var3 = (wl) ((Object) this.field_g.a((long)param0, 0));
        if (param1 != 486289953) {
            this.e(-120);
        }
        if (var3 == null) {
            return 0;
        }
        return var3.b((byte) 95);
    }

    final byte[] a(int param0, boolean param1) {
        wl var3 = this.a(true, 0, param0);
        if (param1) {
            this.field_c = -78L;
        }
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(-27);
        var3.a(param1);
        return var4;
    }

    public static void d(int param0) {
        field_q = null;
        field_m = null;
        if (param0 != 0) {
            ee.d(-92);
        }
    }

    private final wl a(boolean param0, int param1, int param2) {
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_94_0 = 0;
        byte stackIn_94_1 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wl var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = CrazyCrystals.field_B;
          var12 = (wl) ((Object) this.field_g.a((long)param2, 0));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (var12.field_q) {
                break L0;
              } else {
                if (var12.field_n) {
                  var12.a(false);
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
          if (param0) {
            break L1;
          } else {
            this.a(-107);
            break L1;
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              if (0 == param1) {
                L4: {
                  if (this.field_l == null) {
                    break L4;
                  } else {
                    if (0 == (this.field_h[param2] ^ -1)) {
                      break L4;
                    } else {
                      var4 = this.field_v.a(param0, param2, this.field_l);
                      break L3;
                    }
                  }
                }
                if (!this.field_w.c((byte) -123)) {
                  var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (1 != param1) {
                  if (-3 == (param1 ^ -1)) {
                    if (this.field_l != null) {
                      if ((this.field_h[param2] ^ -1) == 0) {
                        if (!this.field_w.c(-21)) {
                          var4 = this.field_w.a(false, 18303, param2, this.field_r, (byte) 2);
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
                  if (null != this.field_l) {
                    var4 = this.field_v.a(-4, param2, this.field_l);
                    break L3;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            this.field_g.a(-22072, (long)param2, (jb) (var4));
            break L2;
          }
        }
        if (!((wl) (var4)).field_n) {
          var18 = ((wl) (var4)).e(-5);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof mf)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if (-3 <= (var18.length ^ -1)) {
                      break L6;
                    } else {
                      sj.field_b.reset();
                      sj.field_b.update(var5, 0, -2 + var18.length);
                      var6_int = (int)sj.field_b.getValue();
                      if (var6_int == this.field_p.field_n[param2]) {
                        L7: {
                          if (this.field_p.field_m == null) {
                            break L7;
                          } else {
                            if (this.field_p.field_m[param2] == null) {
                              break L7;
                            } else {
                              var29 = this.field_p.field_m[param2];
                              var30 = ac.a(var5, 0, -2 + var18.length, (byte) -127);
                              var11 = 0;
                              var9 = var11;
                              L8: while (true) {
                                if (var11 >= 64) {
                                  break L7;
                                } else {
                                  if ((var29[var11] ^ -1) == (var30[var11] ^ -1)) {
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
                        this.field_w.field_j = 0;
                        this.field_w.field_p = 0;
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                this.field_w.e(20406);
                stackIn_85_0 = var4;

                if (param0) {
                  stackIn_86_0 = stackIn_85_0;
                  stackIn_86_1 = 0;
                  break L9;
                } else {
                  stackIn_86_0 = stackIn_85_0;
                  stackIn_86_1 = 1;
                  break L9;
                }
              }
              L10: {
                ((wl) (Object) stackIn_86_0).a(stackIn_86_1 != 0);
                if (((wl) (var4)).field_q) {
                  if (!this.field_w.c((byte) -73)) {
                    var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
                    this.field_g.a(-22072, (long)param2, (jb) (var4));
                    break L10;
                  } else {
                    return null;
                  }
                } else {
                  break L10;
                }
              }
              return null;
            }
            L11: {
              var5[var18.length - 2] = (byte)(this.field_p.field_g[param2] >>> -924599608);
              var5[var18.length + -1] = (byte)this.field_p.field_g[param2];
              if (null == this.field_l) {
                break L11;
              } else {
                this.field_v.a(param2, this.field_l, var18, (byte) 116);
                stackIn_94_0 = 1;
                stackIn_94_1 = this.field_h[param2];
                if (stackIn_94_0 == stackIn_94_1) {
                  break L11;
                } else {
                  this.field_h[param2] = (byte) 1;
                  break L11;
                }
              }
            }
            L12: {
              if (((wl) (var4)).field_q) {
                break L12;
              } else {
                ((wl) (var4)).a(false);
                break L12;
              }
            }
            return (wl) (var4);
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
                      sj.field_b.reset();
                      sj.field_b.update(var5, 0, -2 + var18.length);
                      var6_int = (int)sj.field_b.getValue();
                      if (this.field_p.field_n[param2] == var6_int) {
                        L15: {
                          if (null == this.field_p.field_m) {
                            break L15;
                          } else {
                            if (null == this.field_p.field_m[param2]) {
                              break L15;
                            } else {
                              var27 = this.field_p.field_m[param2];
                              var28 = ac.a(var5, 0, -2 + var18.length, (byte) -127);
                              var9 = 0;
                              L16: while (true) {
                                if (64 <= var9) {
                                  break L15;
                                } else {
                                  if ((var27[var9] ^ -1) != (var28[var9] ^ -1)) {
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
                        var7 = (65280 & var5[var18.length - 2] << 1096407912) - -(var5[var18.length - 1] & 255);
                        if (var7 != (this.field_p.field_g[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L17: {
                            if (this.field_h[param2] != 1) {
                              L18: {
                                if (-1 == (this.field_h[param2] ^ -1)) {
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              this.field_h[param2] = (byte) 1;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L19: {
                            if (!((wl) (var4)).field_q) {
                              L20: {
                                stackIn_58_0 = var4;

                                if (param0) {
                                  stackIn_59_0 = stackIn_58_0;
                                  stackIn_59_1 = 0;
                                  break L20;
                                } else {
                                  stackIn_59_0 = stackIn_58_0;
                                  stackIn_59_1 = 1;
                                  break L20;
                                }
                              }
                              ((wl) (Object) stackIn_59_0).a(stackIn_59_1 != 0);
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          stackIn_61_0 = var4;
                          break L13;
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
              L21: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                this.field_h[param2] = (byte)-1;
                ((wl) (var4)).a(false);
                if (((wl) (var4)).field_q) {
                  if (!this.field_w.c((byte) -72)) {
                    var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
                    this.field_g.a(-22072, (long)param2, (jb) (var4));
                    break L21;
                  } else {
                    break L21;
                  }
                } else {
                  break L21;
                }
              }
              return null;
            }
            return (wl) ((Object) stackIn_61_0);
          }
        } else {
          return null;
        }
    }

    final qg a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = CrazyCrystals.field_B;
        if (null != this.field_p) {
          return this.field_p;
        } else {
          if (param0 == 630779105) {
            L0: {
              if (this.field_k != null) {
                break L0;
              } else {
                if (!this.field_w.c((byte) -54)) {
                  this.field_k = (wl) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (!this.field_k.field_n) {
              L1: {
                var8 = this.field_k.e(115);
                var6 = var8;
                var5 = var6;
                var9 = var5;
                var7 = var9;
                var2 = var7;
                if (this.field_k instanceof mf) {
                  try {
                    L2: {
                      if (var2 != null) {
                        this.field_p = new qg(var9, this.field_u, this.field_x);
                        if (this.field_s != this.field_p.field_r) {
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
                      if (this.field_w.c((byte) -90)) {
                        this.field_k = null;
                        break L3;
                      } else {
                        this.field_k = (wl) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
                        break L3;
                      }
                    }
                    return null;
                  }
                  break L1;
                } else {
                  try {
                    L4: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_p = new qg(var8, this.field_u, this.field_x);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_w.e(20406);
                      this.field_p = null;
                      if (!this.field_w.c((byte) -82)) {
                        this.field_k = (wl) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
                        break L5;
                      } else {
                        this.field_k = null;
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (null == this.field_i) {
                    break L1;
                  } else {
                    this.field_v.a(this.field_r, this.field_i, var8, (byte) 116);
                    break L1;
                  }
                }
              }
              L6: {
                if (null == this.field_l) {
                  break L6;
                } else {
                  this.field_h = new byte[this.field_p.field_a];
                  break L6;
                }
              }
              this.field_k = null;
              return this.field_p;
            } else {
              return null;
            }
          } else {
            return (qg) null;
          }
        }
    }

    final void c(int param0) {
        wl discarded$0 = null;
        wl discarded$1 = null;
        jb var2;
        int var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        if (null == this.field_j) {
          return;
        } else {
          L0: {
            if (param0 >= 112) {
              break L0;
            } else {
              this.field_h = (byte[]) null;
              break L0;
            }
          }
          if (this.a(630779105) != null) {
            var2 = this.field_n.g(32073);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_e;
                  if (var3 >= 0) {
                    if (this.field_p.field_a > var3) {
                      if (-1 == (this.field_p.field_f[var3] ^ -1)) {
                        var2.a(false);
                        break L2;
                      } else {
                        L3: {
                          if (0 == this.field_h[var3]) {
                            discarded$0 = this.a(true, 1, var3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if ((this.field_h[var3] ^ -1) == 0) {
                            discarded$1 = this.a(true, 2, var3);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if ((this.field_h[var3] ^ -1) == -2) {
                          var2.a(false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var2.a(false);
                      break L2;
                    }
                  } else {
                    var2.a(false);
                    break L2;
                  }
                }
                var2 = this.field_n.a(false);
                continue L1;
              }
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(int[] param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        mo var4_ref_mo = null;
        int var4 = 0;
        int var5_int = 0;
        mo var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ek.field_h != gj.field_k) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param1 == 64) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2_long = lo.a((byte) -98);
                        if (0 == wb.field_d) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (sm.field_i < 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_ref_mo = (mo) ((Object) bn.field_i.g(32073));
                        if (var4_ref_mo == null) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var4_ref_mo.field_k ^ -1L) <= (var2_long ^ -1L)) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_ref_mo.a(false);
                        rk.field_b = var4_ref_mo.field_g.length;
                        kd.field_n.field_f = 0;
                        var5_int = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (rk.field_b <= var5_int) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        kd.field_n.field_h[var5_int] = var4_ref_mo.field_g[var5_int];
                        var5_int++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        fl.field_m = ea.field_n;
                        ea.field_n = qn.field_u;
                        qn.field_u = bf.field_b;
                        bf.field_b = var4_ref_mo.field_j;
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    stackIn_21_0 = sm.field_i;
                    statePc = 21;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = sm.field_i;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackIn_21_0 = sm.field_i;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((stackIn_21_0 ^ -1) > -1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        kd.field_n.field_f = 0;
                        if (!fq.a(1, (byte) 104)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    try {
                        sm.field_i = kd.field_n.e(true);
                        kd.field_n.field_f = 0;
                        rk.field_b = param0[sm.field_i];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (ol.f((byte) 60)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    try {
                        if (wb.field_d == 0) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = wb.field_d;
                        if (0.0 == kk.field_b) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var4 = (int)((double)var4 + og.field_w.nextGaussian() * kk.field_b);
                        if (var4 >= 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = new mo((long)var4 + var2_long, sm.field_i, new byte[rk.field_b]);
                        var6 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var6 >= rk.field_b) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5.field_g[var6] = kd.field_n.field_h[var6];
                        var6++;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        bn.field_i.b(param1 ^ 64, var5);
                        sm.field_i = -1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        fl.field_m = ea.field_n;
                        ea.field_n = qn.field_u;
                        qn.field_u = bf.field_b;
                        bf.field_b = sm.field_i;
                        sm.field_i = -1;
                        stackIn_40_0 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0 != 0;
                }
                case 41: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_43_0 = (RuntimeException) (var2);
                    stackIn_42_0 = stackIn_43_0;
                    stackIn_43_1 = new StringBuilder().append("ee.G(");
                    stackIn_42_1 = stackIn_43_1;
                    if (param0 == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    throw dn.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        if (this.field_l == null) {
            return;
        }
        this.field_f = true;
        if (!(this.field_j != null)) {
            this.field_j = new wb();
        }
        int var2 = 42 % ((param0 - 7) / 45);
    }

    ee(int param0, sp param1, sp param2, ob param3, ni param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_g = new fc(16);
        this.field_o = 0;
        this.field_n = new wb();
        this.field_c = 0L;
        try {
          L0: {
            L1: {
              this.field_l = param1;
              this.field_r = param0;
              if (null == this.field_l) {
                this.field_d = false;
                break L1;
              } else {
                this.field_d = true;
                this.field_j = new wb();
                break L1;
              }
            }
            L2: {
              this.field_s = param7;
              this.field_i = param2;
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
              ((ee) (this)).field_t = stackIn_7_1 != 0;
              this.field_u = param5;
              this.field_v = param4;
              this.field_x = param6;
              if (null == this.field_i) {
                break L3;
              } else {
                this.field_k = (wl) ((Object) this.field_v.a(true, this.field_r, this.field_i));
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

            stackIn_12_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_q = "Login: ";
    }
}
