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
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
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
                  this.field_i.a((byte) 88, this.field_p, this.field_y, var8);
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
        Object stackIn_55_0 = null;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
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
        pb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
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
                                    if ((var29[var11] ^ -1) == (var30[var11] ^ -1)) {
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
                  var6 = (RuntimeException) (Object) decompiledCaughtException;
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
                  this.field_i.a((byte) 66, param2, this.field_e, var18);
                  stackIn_85_0 = this.field_k[param2] ^ -1;
                  stackIn_85_1 = -2;
                  if (stackIn_85_0 != stackIn_85_1) {
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
                                    if ((var27[var9] ^ -1) == (var28[var9] ^ -1)) {
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
                            stackIn_55_0 = var4;
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
                var6_ref = (Exception) (Object) decompiledCaughtException;
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
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    bj.a(68, (String) null);
                    break L2;
                  }
                }
                stackIn_7_0 = new String(var3);
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
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("bj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        pb discarded$0 = null;
        pb discarded$1 = null;
        pb discarded$2 = null;
        pb discarded$3 = null;
        int var2_int;
        pb var2;
        hf var3;
        int var4;
        int var5;
        hf var6;
        hf var7;
        L0: {
          L1: {
            L2: {
              L3: {
                var5 = Geoblox.field_C;
                if (this.field_d == null) {
                  break L3;
                } else {
                  if (null != this.a((byte) 118)) {
                    if (this.field_q) {
                      var2_int = 1;
                      var3 = this.field_d.g(0);
                      L4: while (true) {
                        if (var3 == null) {
                          L5: while (true) {
                            L6: {
                              if (this.field_o >= this.field_u.field_a.length) {
                                break L6;
                              } else {
                                if (0 != this.field_u.field_a[this.field_o]) {
                                  if ((this.field_i.field_d ^ -1) <= -251) {
                                    var2_int = 0;
                                    break L6;
                                  } else {
                                    L7: {
                                      if (-1 != (this.field_k[this.field_o] ^ -1)) {
                                        break L7;
                                      } else {
                                        discarded$0 = this.a((byte) -71, 1, this.field_o);
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      if (0 == this.field_k[this.field_o]) {
                                        var7 = new hf();
                                        var7.field_a = (long)this.field_o;
                                        var2_int = 0;
                                        this.field_d.a(-45, var7);
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    this.field_o = this.field_o + 1;
                                    continue L5;
                                  }
                                } else {
                                  this.field_o = this.field_o + 1;
                                  continue L5;
                                }
                              }
                            }
                            if (var2_int == 0) {
                              break L3;
                            } else {
                              this.field_o = 0;
                              this.field_q = false;
                              break L3;
                            }
                          }
                        } else {
                          L9: {
                            var4 = (int)var3.field_a;
                            if (this.field_k[var4] != 0) {
                              break L9;
                            } else {
                              discarded$1 = this.a((byte) -71, 1, var4);
                              break L9;
                            }
                          }
                          L10: {
                            if (this.field_k[var4] != 0) {
                              var3.a(false);
                              break L10;
                            } else {
                              var2_int = 0;
                              break L10;
                            }
                          }
                          var3 = this.field_d.d(1);
                          continue L4;
                        }
                      }
                    } else {
                      if (this.field_v) {
                        var2_int = 1;
                        var3 = this.field_d.g(0);
                        L11: while (true) {
                          if (var3 == null) {
                            L12: while (true) {
                              L13: {
                                if (this.field_o >= this.field_u.field_a.length) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (-1 == (this.field_u.field_a[this.field_o] ^ -1)) {
                                      break L14;
                                    } else {
                                      if (this.field_f.b(-21)) {
                                        var2_int = 0;
                                        break L13;
                                      } else {
                                        L15: {
                                          if (-2 == (this.field_k[this.field_o] ^ -1)) {
                                            break L15;
                                          } else {
                                            discarded$2 = this.a((byte) -71, 2, this.field_o);
                                            break L15;
                                          }
                                        }
                                        if (-2 == (this.field_k[this.field_o] ^ -1)) {
                                          break L14;
                                        } else {
                                          var6 = new hf();
                                          var6.field_a = (long)this.field_o;
                                          var2_int = 0;
                                          this.field_d.a(-97, var6);
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  this.field_o = this.field_o + 1;
                                  continue L12;
                                }
                              }
                              if (var2_int != 0) {
                                this.field_v = false;
                                this.field_o = 0;
                                break L3;
                              } else {
                                L16: {
                                  if (param0 == -38) {
                                    break L16;
                                  } else {
                                    this.b(25, 41);
                                    break L16;
                                  }
                                }
                                if (!this.field_w) {
                                  break L0;
                                } else {
                                  if ((oa.a(-12520) ^ -1L) > (this.field_n ^ -1L)) {
                                    break L1;
                                  } else {
                                    var2 = (pb) ((Object) this.field_g.a((byte) 125));
                                    L17: while (true) {
                                      if (var2 == null) {
                                        break L2;
                                      } else {
                                        L18: {
                                          if (!var2.field_u) {
                                            if (var2.field_n) {
                                              if (!var2.field_q) {
                                                throw new RuntimeException();
                                              } else {
                                                var2.a(false);
                                                break L18;
                                              }
                                            } else {
                                              var2.field_n = true;
                                              break L18;
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var2 = (pb) ((Object) this.field_g.b(74));
                                        continue L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L19: {
                              var4 = (int)var3.field_a;
                              if ((this.field_k[var4] ^ -1) != -2) {
                                discarded$3 = this.a((byte) -71, 2, var4);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (this.field_k[var4] != 1) {
                                var2_int = 0;
                                break L20;
                              } else {
                                var3.a(false);
                                break L20;
                              }
                            }
                            var3 = this.field_d.d(1);
                            continue L11;
                          }
                        }
                      } else {
                        this.field_d = null;
                        break L3;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              L21: {
                if (param0 == -38) {
                  break L21;
                } else {
                  this.b(25, 41);
                  break L21;
                }
              }
              if (!this.field_w) {
                break L0;
              } else {
                if ((oa.a(-12520) ^ -1L) > (this.field_n ^ -1L)) {
                  break L1;
                } else {
                  var2 = (pb) ((Object) this.field_g.a((byte) 125));
                  L22: while (true) {
                    if (var2 == null) {
                      break L2;
                    } else {
                      L23: {
                        if (!var2.field_u) {
                          if (var2.field_n) {
                            if (!var2.field_q) {
                              throw new RuntimeException();
                            } else {
                              var2.a(false);
                              break L23;
                            }
                          } else {
                            var2.field_n = true;
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      var2 = (pb) ((Object) this.field_g.b(74));
                      continue L22;
                    }
                  }
                }
              }
            }
            this.field_n = 1000L + oa.a(param0 + -12482);
            break L1;
          }
          break L0;
        }
    }

    bj(int param0, jh param1, jh param2, ji param3, uf param4, int param5, byte[] param6, int param7, boolean param8) {
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
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("bj.<init>(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_j = new int[8192];
    }
}
