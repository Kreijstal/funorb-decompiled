/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends nh {
    private fi field_g;
    static boolean field_s;
    private int field_h;
    static int[] field_j;
    private ji field_f;
    private pb field_l;
    private int field_p;
    private uf field_i;
    private int field_m;
    private jh field_y;
    static na field_r;
    private byte[] field_k;
    private byte[] field_x;
    private bm field_u;
    private jh field_e;
    private int field_o;
    private boolean field_v;
    private tf field_t;
    private boolean field_q;
    private tf field_d;
    private boolean field_w;
    private long field_n;

    final bm a(byte param0) {
        o discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        if (null != this.field_u) {
          return this.field_u;
        } else {
          L0: {
            if (this.field_l == null) {
              if (!this.field_f.g(20)) {
                this.field_l = (pb) ((Object) this.field_f.a((byte) 0, 255, -21, this.field_p, true));
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 > 111) {
              break L1;
            } else {
              this.b((byte) 65);
              break L1;
            }
          }
          if (!this.field_l.field_u) {
            L2: {
              var8 = this.field_l.e(397);
              var6 = var8;
              var5 = var6;
              var9 = var5;
              var7 = var9;
              var2 = var7;
              if (this.field_l instanceof o) {
                try {
                  L3: {
                    if (var2 != null) {
                      this.field_u = new bm(var9, this.field_m, this.field_x);
                      if (this.field_u.field_g != this.field_h) {
                        throw new RuntimeException();
                      } else {
                        break L3;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_u = null;
                    if (!this.field_f.g(20)) {
                      this.field_l = (pb) ((Object) this.field_f.a((byte) 0, 255, -21, this.field_p, true));
                      break L4;
                    } else {
                      this.field_l = null;
                      break L4;
                    }
                  }
                  return null;
                }
                break L2;
              } else {
                try {
                  L5: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_u = new bm(var8, this.field_m, this.field_x);
                      break L5;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_f.e(20);
                    this.field_u = null;
                    if (this.field_f.g(20)) {
                      this.field_l = null;
                      break L6;
                    } else {
                      this.field_l = (pb) ((Object) this.field_f.a((byte) 0, 255, -21, this.field_p, true));
                      break L6;
                    }
                  }
                  return null;
                }
                if (null == this.field_y) {
                  break L2;
                } else {
                  discarded$1 = this.field_i.a((byte) 88, this.field_p, this.field_y, var8);
                  break L2;
                }
              }
            }
            L7: {
              this.field_l = null;
              if (this.field_e == null) {
                break L7;
              } else {
                this.field_k = new byte[this.field_u.field_b];
                break L7;
              }
            }
            return this.field_u;
          } else {
            return null;
          }
        }
    }

    private final pb a(byte param0, int param1, int param2) {
        o discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_55_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_54_0 = null;
        L0: {
          var10 = Geoblox.field_C;
          var12 = (pb) ((Object) this.field_g.a((long)param2, (byte) -124));
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
                if (!var12.field_u) {
                  break L0;
                } else {
                  var12.a(false);
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
              if (-1 != (param1 ^ -1)) {
                if ((param1 ^ -1) == -2) {
                  if (null != this.field_e) {
                    var4 = this.field_i.a(param0 + 131, this.field_e, param2);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if ((param1 ^ -1) != -3) {
                    throw new RuntimeException();
                  } else {
                    if (null != this.field_e) {
                      if ((this.field_k[param2] ^ -1) == 0) {
                        if (!this.field_f.b(-21)) {
                          var4 = this.field_f.a((byte) 2, this.field_p, param0 + 50, param2, false);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                L3: {
                  if (null == this.field_e) {
                    break L3;
                  } else {
                    if (-1 == this.field_k[param2]) {
                      break L3;
                    } else {
                      var4 = this.field_i.a(this.field_e, param2, 15079962);
                      break L2;
                    }
                  }
                }
                if (!this.field_f.g(20)) {
                  var4 = this.field_f.a((byte) 2, this.field_p, -21, param2, true);
                  break L2;
                } else {
                  return null;
                }
              }
            }
            this.field_g.a((byte) 102, (hf) (var4), (long)param2);
            break L1;
          }
        }
        if (!((pb) (var4)).field_u) {
          var18 = ((pb) (var4)).e(397);
          var13 = var18;
          var5 = var13;
          if (param0 == -71) {
            if (!(var4 instanceof o)) {
              try {
                L4: {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      if ((var18.length ^ -1) >= -3) {
                        break L5;
                      } else {
                        ge.field_f.reset();
                        ge.field_f.update(var5, 0, var18.length + -2);
                        var6_int = (int)ge.field_f.getValue();
                        if (var6_int == this.field_u.field_q[param2]) {
                          L6: {
                            if (null == this.field_u.field_r) {
                              break L6;
                            } else {
                              if (null != this.field_u.field_r[param2]) {
                                var30 = this.field_u.field_r[param2];
                                var29 = wh.a(-2 + var18.length, 0, var18, 8);
                                var11 = 0;
                                var9 = var11;
                                L7: while (true) {
                                  if ((var11 ^ -1) <= -65) {
                                    break L6;
                                  } else {
                                    if (var29[var11] == var30[var11]) {
                                      var11++;
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
                          this.field_f.field_b = 0;
                          this.field_f.field_q = 0;
                          break L4;
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
                L8: {
                  var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                  this.field_f.e(20);
                  ((pb) (var4)).a(false);
                  if (((pb) (var4)).field_q) {
                    if (!this.field_f.g(param0 ^ -83)) {
                      var4 = this.field_f.a((byte) 2, this.field_p, -21, param2, true);
                      this.field_g.a((byte) 102, (hf) (var4), (long)param2);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                return null;
              }
              L9: {
                var5[var18.length - 2] = (byte)(this.field_u.field_t[param2] >>> -52028856);
                var5[-1 + var18.length] = (byte)this.field_u.field_t[param2];
                if (null == this.field_e) {
                  break L9;
                } else {
                  discarded$1 = this.field_i.a((byte) 66, param2, this.field_e, var18);
                  if ((this.field_k[param2] ^ -1) != -2) {
                    this.field_k[param2] = (byte) 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (!((pb) (var4)).field_q) {
                  ((pb) (var4)).a(false);
                  break L10;
                } else {
                  break L10;
                }
              }
              return (pb) (var4);
            } else {
              try {
                L11: {
                  L12: {
                    if (var5 == null) {
                      break L12;
                    } else {
                      if ((var18.length ^ -1) >= -3) {
                        break L12;
                      } else {
                        ge.field_f.reset();
                        ge.field_f.update(var5, 0, var18.length + -2);
                        var6_int = (int)ge.field_f.getValue();
                        if (var6_int == this.field_u.field_q[param2]) {
                          L13: {
                            if (this.field_u.field_r == null) {
                              break L13;
                            } else {
                              if (null == this.field_u.field_r[param2]) {
                                break L13;
                              } else {
                                var27 = this.field_u.field_r[param2];
                                var28 = wh.a(-2 + var18.length, 0, var18, 8);
                                var9 = 0;
                                L14: while (true) {
                                  if (-65 >= (var9 ^ -1)) {
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
                              }
                            }
                          }
                          var7 = (var5[-2 + var18.length] << -2130145656 & 65280) + (var5[var18.length - 1] & 255);
                          if ((65535 & this.field_u.field_t[param2]) != var7) {
                            throw new RuntimeException();
                          } else {
                            L15: {
                              if ((this.field_k[param2] ^ -1) != -2) {
                                L16: {
                                  if (this.field_k[param2] != 0) {
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                this.field_k[param2] = (byte) 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L17: {
                              if (((pb) (var4)).field_q) {
                                break L17;
                              } else {
                                ((pb) (var4)).a(false);
                                break L17;
                              }
                            }
                            stackOut_54_0 = var4;
                            stackIn_55_0 = stackOut_54_0;
                            break L11;
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
                this.field_k[param2] = (byte)-1;
                ((pb) (var4)).a(false);
                if (((pb) (var4)).field_q) {
                  if (!this.field_f.g(20)) {
                    var4 = this.field_f.a((byte) 2, this.field_p, -21, param2, true);
                    this.field_g.a((byte) 102, (hf) (var4), (long)param2);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (pb) ((Object) stackIn_55_0);
            }
          } else {
            return (pb) null;
          }
        } else {
          return null;
        }
    }

    final static String a(int param0, String param1) {
        String discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param0 >= 26) {
                    break L2;
                  } else {
                    var6 = (String) null;
                    discarded$2 = bj.a(68, (String) null);
                    break L2;
                  }
                }
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-var4 + (-1 + var2_int)] = param1.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("bj.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final byte[] b(int param0, int param1) {
        pb var3 = this.a((byte) -71, 0, param1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.e(397);
        var3.a(false);
        if (param0 != 4) {
            this.b(49);
        }
        return var4;
    }

    final int a(int param0, int param1) {
        pb var3 = (pb) ((Object) this.field_g.a((long)param1, (byte) -102));
        if (param0 < 125) {
            return -119;
        }
        if (var3 != null) {
            return var3.g(0);
        }
        return 0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_r = null;
        field_j = null;
    }

    final void b(int param0) {
        if (this.field_e == null) {
            return;
        }
        if (param0 < 80) {
            this.field_n = -51L;
        }
        this.field_v = true;
        if (!(this.field_d != null)) {
            this.field_d = new tf();
        }
    }

    final void a(int param0) {
        int var3 = 0;
        pb discarded$0 = null;
        pb discarded$1 = null;
        int var4 = Geoblox.field_C;
        if (param0 != 6924) {
            this.b((byte) -7);
        }
        if (!(this.field_d != null)) {
            return;
        }
        if (!(null != this.a((byte) 126))) {
            return;
        }
        hf var2 = this.field_t.g(0);
        while (var2 != null) {
            var3 = (int)var2.field_a;
            if ((var3 ^ -1) > -1) {
                var2.a(false);
            } else {
                if (var3 >= this.field_u.field_b) {
                    var2.a(false);
                } else {
                    if (this.field_u.field_a[var3] == 0) {
                        var2.a(false);
                    } else {
                        if (this.field_k[var3] == 0) {
                            discarded$0 = this.a((byte) -71, 1, var3);
                        }
                        if (-1 == this.field_k[var3]) {
                            discarded$1 = this.a((byte) -71, 2, var3);
                        }
                        if (!((this.field_k[var3] ^ -1) != -2)) {
                            var2.a(false);
                        }
                    }
                }
            }
            var2 = this.field_t.d(1);
        }
    }

    final void b(byte param0) {
        pb discarded$6 = null;
        pb discarded$7 = null;
        pb discarded$8 = null;
        byte[] discarded$9 = null;
        pb discarded$10 = null;
        byte[] discarded$11 = null;
        int var2_int = 0;
        pb var2 = null;
        hf var3 = null;
        int var4 = 0;
        int var5 = 0;
        hf var6 = null;
        hf var7 = null;
        L0: {
          L1: {
            L2: {
              var5 = Geoblox.field_C;
              if (this.field_d == null) {
                break L2;
              } else {
                if (null != this.a((byte) 118)) {
                  if (this.field_q) {
                    var2_int = 1;
                    var3 = this.field_d.g(0);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (this.field_o >= this.field_u.field_a.length) {
                              break L5;
                            } else {
                              if (0 != this.field_u.field_a[this.field_o]) {
                                if ((this.field_i.field_d ^ -1) <= -251) {
                                  var2_int = 0;
                                  break L5;
                                } else {
                                  L6: {
                                    if (-1 != (this.field_k[this.field_o] ^ -1)) {
                                      break L6;
                                    } else {
                                      discarded$6 = this.a((byte) -71, 1, this.field_o);
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (0 == this.field_k[this.field_o]) {
                                      var7 = new hf();
                                      var7.field_a = (long)this.field_o;
                                      var2_int = 0;
                                      this.field_d.a(-45, var7);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  this.field_o = this.field_o + 1;
                                  continue L4;
                                }
                              } else {
                                this.field_o = this.field_o + 1;
                                continue L4;
                              }
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            this.field_o = 0;
                            this.field_q = false;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)var3.field_a;
                          if (this.field_k[var4] != 0) {
                            break L8;
                          } else {
                            discarded$7 = this.a((byte) -71, 1, var4);
                            break L8;
                          }
                        }
                        L9: {
                          if (this.field_k[var4] != 0) {
                            var3.a(false);
                            break L9;
                          } else {
                            var2_int = 0;
                            break L9;
                          }
                        }
                        var3 = this.field_d.d(1);
                        continue L3;
                      }
                    }
                  } else {
                    if (this.field_v) {
                      var2_int = 1;
                      var3 = this.field_d.g(0);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (this.field_o >= this.field_u.field_a.length) {
                                break L12;
                              } else {
                                L13: {
                                  if (-1 == (this.field_u.field_a[this.field_o] ^ -1)) {
                                    break L13;
                                  } else {
                                    if (this.field_f.b(-21)) {
                                      var2_int = 0;
                                      break L12;
                                    } else {
                                      L14: {
                                        if (-2 == (this.field_k[this.field_o] ^ -1)) {
                                          break L14;
                                        } else {
                                          discarded$8 = this.a((byte) -71, 2, this.field_o);
                                          break L14;
                                        }
                                      }
                                      if (-2 == (this.field_k[this.field_o] ^ -1)) {
                                        break L13;
                                      } else {
                                        var6 = new hf();
                                        var6.field_a = (long)this.field_o;
                                        var2_int = 0;
                                        this.field_d.a(-97, var6);
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                this.field_o = this.field_o + 1;
                                continue L11;
                              }
                            }
                            if (var2_int != 0) {
                              this.field_v = false;
                              this.field_o = 0;
                              break L2;
                            } else {
                              L15: {
                                if (param0 == -38) {
                                  break L15;
                                } else {
                                  discarded$9 = this.b(25, 41);
                                  break L15;
                                }
                              }
                              if (!this.field_w) {
                                break L0;
                              } else {
                                if ((oa.a(-12520) ^ -1L) > (this.field_n ^ -1L)) {
                                  break L0;
                                } else {
                                  var2 = (pb) ((Object) this.field_g.a((byte) 125));
                                  L16: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L17: {
                                        if (!var2.field_u) {
                                          if (var2.field_n) {
                                            if (!var2.field_q) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.a(false);
                                              break L17;
                                            }
                                          } else {
                                            var2.field_n = true;
                                            break L17;
                                          }
                                        } else {
                                          break L17;
                                        }
                                      }
                                      var2 = (pb) ((Object) this.field_g.b(74));
                                      continue L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            var4 = (int)var3.field_a;
                            if ((this.field_k[var4] ^ -1) != -2) {
                              discarded$10 = this.a((byte) -71, 2, var4);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if (this.field_k[var4] != 1) {
                              var2_int = 0;
                              break L19;
                            } else {
                              var3.a(false);
                              break L19;
                            }
                          }
                          var3 = this.field_d.d(1);
                          continue L10;
                        }
                      }
                    } else {
                      this.field_d = null;
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L20: {
              if (param0 == -38) {
                break L20;
              } else {
                discarded$11 = this.b(25, 41);
                break L20;
              }
            }
            if (!this.field_w) {
              break L0;
            } else {
              if ((oa.a(-12520) ^ -1L) > (this.field_n ^ -1L)) {
                break L0;
              } else {
                var2 = (pb) ((Object) this.field_g.a((byte) 125));
                L21: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L22: {
                      if (!var2.field_u) {
                        if (var2.field_n) {
                          if (!var2.field_q) {
                            throw new RuntimeException();
                          } else {
                            var2.a(false);
                            break L22;
                          }
                        } else {
                          var2.field_n = true;
                          break L22;
                        }
                      } else {
                        break L22;
                      }
                    }
                    var2 = (pb) ((Object) this.field_g.b(74));
                    continue L21;
                  }
                }
              }
            }
          }
          this.field_n = 1000L + oa.a(param0 + -12482);
          break L0;
        }
    }

    bj(int param0, jh param1, jh param2, ji param3, uf param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_g = new fi(16);
        this.field_o = 0;
        this.field_t = new tf();
        this.field_n = 0L;
        try {
          L0: {
            L1: {
              this.field_e = param1;
              this.field_p = param0;
              if (null == this.field_e) {
                this.field_q = false;
                break L1;
              } else {
                this.field_q = true;
                this.field_d = new tf();
                break L1;
              }
            }
            L2: {
              this.field_i = param4;
              this.field_y = param2;
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
              ((bj) (this)).field_w = stackIn_7_1 != 0;
              this.field_x = param6;
              this.field_f = param3;
              this.field_h = param7;
              this.field_m = param5;
              if (this.field_y == null) {
                break L3;
              } else {
                this.field_l = (pb) ((Object) this.field_i.a(this.field_y, this.field_p, 15079962));
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
            stackOut_10_1 = new StringBuilder().append("bj.<init>(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_j = new int[8192];
    }
}
