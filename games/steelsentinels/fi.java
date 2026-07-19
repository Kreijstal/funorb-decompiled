/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends fa {
    private vk field_B;
    static String field_s;
    static String field_z;
    static String field_t;
    private byte[] field_o;
    private int field_r;
    private fe field_w;
    private int field_F;
    static int field_l;
    private jl field_A;
    private byte[] field_h;
    static wk field_j;
    private cb field_k;
    private rc field_x;
    static int[] field_g;
    private uh field_m;
    private int field_q;
    static int field_y;
    private rc field_E;
    private boolean field_D;
    private ul field_C;
    private boolean field_v;
    private ul field_i;
    private int field_p;
    private long field_n;
    private boolean field_u;

    private final fe a(byte param0, int param1, int param2) {
        df discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fe var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        Object stackIn_94_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_93_0 = null;
        L0: {
          var10 = SteelSentinels.field_G;
          var12 = (fe) ((Object) this.field_m.a((long)param1, param0 + 232));
          var4 = var12;
          if (param0 == -109) {
            break L0;
          } else {
            this.field_v = true;
            break L0;
          }
        }
        L1: {
          if (var12 == null) {
            break L1;
          } else {
            if (param2 != 0) {
              break L1;
            } else {
              if (var12.field_B) {
                break L1;
              } else {
                if (!var12.field_z) {
                  break L1;
                } else {
                  var12.b(4);
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
              if (0 == param2) {
                L4: {
                  if (null == this.field_E) {
                    break L4;
                  } else {
                    if (this.field_h[param1] != -1) {
                      var4 = this.field_k.a(21598, param1, this.field_E);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!this.field_B.c(param0 + -15)) {
                  var4 = this.field_B.a((byte) 2, this.field_r, param1, true, (byte) 51);
                  break L3;
                } else {
                  return null;
                }
              } else {
                if (1 == param2) {
                  if (null == this.field_E) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_k.a(this.field_E, param1, 3);
                    break L3;
                  }
                } else {
                  if (-3 != (param2 ^ -1)) {
                    throw new RuntimeException();
                  } else {
                    if (null == this.field_E) {
                      throw new RuntimeException();
                    } else {
                      if (-1 != this.field_h[param1]) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_B.b((byte) 126)) {
                          var4 = this.field_B.a((byte) 2, this.field_r, param1, false, (byte) -94);
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              }
            }
            this.field_m.a((long)param1, (ck) (var4), -1816);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((fe) (var4)).field_z) {
          var18 = ((fe) (var4)).d((byte) -82);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof df) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if ((var18.length ^ -1) < -3) {
                      f.field_G.reset();
                      f.field_G.update(var5, 0, var18.length + -2);
                      var6_int = (int)f.field_G.getValue();
                      if (this.field_A.field_a[param1] == var6_int) {
                        L7: {
                          if (null == this.field_A.field_t) {
                            break L7;
                          } else {
                            if (null != this.field_A.field_t[param1]) {
                              var30 = this.field_A.field_t[param1];
                              var29 = co.a((byte) -37, -2 + var18.length, 0, var18);
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
                        var7 = ((var5[-2 + var18.length] & 255) << 1591026408) + (var5[-1 + var18.length] & 255);
                        if ((this.field_A.field_m[param1] & 65535) == var7) {
                          L9: {
                            if (this.field_h[param1] == 1) {
                              break L9;
                            } else {
                              L10: {
                                if (0 != this.field_h[param1]) {
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
                            if (!((fe) (var4)).field_B) {
                              ((fe) (var4)).b(4);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          stackOut_93_0 = var4;
                          stackIn_94_0 = stackOut_93_0;
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
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_h[param1] = (byte)-1;
              ((fe) (var4)).b(param0 ^ -105);
              if (((fe) (var4)).field_B) {
                L12: {
                  if (!this.field_B.c(62)) {
                    var4 = this.field_B.a((byte) 2, this.field_r, param1, true, (byte) 55);
                    this.field_m.a((long)param1, (ck) (var4), -1816);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (fe) ((Object) stackIn_94_0);
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
                      f.field_G.reset();
                      f.field_G.update(var5, 0, var18.length + -2);
                      var6_int = (int)f.field_G.getValue();
                      if (var6_int != this.field_A.field_a[param1]) {
                        throw new RuntimeException();
                      } else {
                        L15: {
                          if (null == this.field_A.field_t) {
                            break L15;
                          } else {
                            if (null != this.field_A.field_t[param1]) {
                              var27 = this.field_A.field_t[param1];
                              var28 = co.a((byte) -37, var18.length - 2, 0, var18);
                              var9 = 0;
                              L16: while (true) {
                                if (-65 >= (var9 ^ -1)) {
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
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.field_B.field_f = 0;
                        this.field_B.field_t = 0;
                        break L13;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L17: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                this.field_B.a(14900);
                ((fe) (var4)).b(4);
                if (((fe) (var4)).field_B) {
                  if (!this.field_B.c(-93)) {
                    var4 = this.field_B.a((byte) 2, this.field_r, param1, true, (byte) -128);
                    this.field_m.a((long)param1, (ck) (var4), -1816);
                    break L17;
                  } else {
                    return null;
                  }
                } else {
                  break L17;
                }
              }
              return null;
            }
            L18: {
              var5[-2 + var18.length] = (byte)(this.field_A.field_m[param1] >>> -852210232);
              var5[var18.length - 1] = (byte)this.field_A.field_m[param1];
              if (null == this.field_E) {
                break L18;
              } else {
                discarded$1 = this.field_k.a((byte) 98, this.field_E, param1, var18);
                if (-2 != (this.field_h[param1] ^ -1)) {
                  this.field_h[param1] = (byte) 1;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (!((fe) (var4)).field_B) {
                ((fe) (var4)).b(4);
                break L19;
              } else {
                break L19;
              }
            }
            return (fe) (var4);
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        int var4 = 0;
        fe discarded$0 = null;
        fe discarded$1 = null;
        int var5 = SteelSentinels.field_G;
        if (null == this.field_C) {
            return;
        }
        if (null == this.b((byte) 114)) {
            return;
        }
        ck var2 = this.field_i.e(13058);
        int var3 = 51 / ((55 - param0) / 37);
        while (var2 != null) {
            var4 = (int)var2.field_j;
            if (0 > var4) {
                var2.b(4);
            } else {
                if (this.field_A.field_u <= var4) {
                    var2.b(4);
                } else {
                    if (0 == this.field_A.field_j[var4]) {
                        var2.b(4);
                    } else {
                        if (!(-1 != (this.field_h[var4] ^ -1))) {
                            discarded$0 = this.a((byte) -109, var4, 1);
                        }
                        if (!(-1 != this.field_h[var4])) {
                            discarded$1 = this.a((byte) -109, var4, 2);
                        }
                        if (!((this.field_h[var4] ^ -1) != -2)) {
                            var2.b(4);
                        }
                    }
                }
            }
            var2 = this.field_i.a((byte) -126);
        }
    }

    public static void c(int param0) {
        field_s = null;
        field_t = null;
        field_j = null;
        field_g = null;
        if (param0 != 2) {
            field_z = (String) null;
        }
        field_z = null;
    }

    final static e a(int param0, String param1, int param2) {
        e discarded$2 = null;
        e var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new e(false);
              var3.field_e = param1;
              if (param0 >= 4) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = fi.a(-111, (String) null, 49);
                break L1;
              }
            }
            var3.field_a = param2;
            stackOut_2_0 = (e) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("fi.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final jl b(byte param0) {
        df discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        if (param0 == 114) {
          if (null != this.field_A) {
            return this.field_A;
          } else {
            L0: {
              if (this.field_w != null) {
                break L0;
              } else {
                if (!this.field_B.c(param0 ^ -8)) {
                  this.field_w = (fe) ((Object) this.field_B.a((byte) 0, 255, this.field_r, true, (byte) -114));
                  break L0;
                } else {
                  return null;
                }
              }
            }
            if (!this.field_w.field_z) {
              L1: {
                var8 = this.field_w.d((byte) -52);
                var6 = var8;
                var5 = var6;
                var9 = var5;
                var7 = var9;
                var2 = var7;
                if (this.field_w instanceof df) {
                  try {
                    L2: {
                      if (var2 == null) {
                        throw new RuntimeException();
                      } else {
                        this.field_A = new jl(var9, this.field_F, this.field_o);
                        if (this.field_q != this.field_A.field_k) {
                          throw new RuntimeException();
                        } else {
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      this.field_A = null;
                      if (this.field_B.c(62)) {
                        this.field_w = null;
                        break L3;
                      } else {
                        this.field_w = (fe) ((Object) this.field_B.a((byte) 0, 255, this.field_r, true, (byte) 33));
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
                        this.field_A = new jl(var8, this.field_F, this.field_o);
                        break L4;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      this.field_B.a(14900);
                      this.field_A = null;
                      if (!this.field_B.c(89)) {
                        this.field_w = (fe) ((Object) this.field_B.a((byte) 0, 255, this.field_r, true, (byte) -127));
                        break L5;
                      } else {
                        this.field_w = null;
                        break L5;
                      }
                    }
                    return null;
                  }
                  if (null == this.field_x) {
                    break L1;
                  } else {
                    discarded$1 = this.field_k.a((byte) 78, this.field_x, this.field_r, var8);
                    break L1;
                  }
                }
              }
              L6: {
                this.field_w = null;
                if (null != this.field_E) {
                  this.field_h = new byte[this.field_A.field_u];
                  break L6;
                } else {
                  break L6;
                }
              }
              return this.field_A;
            } else {
              return null;
            }
          }
        } else {
          return (jl) null;
        }
    }

    final void c(byte param0) {
        fe discarded$5 = null;
        fe discarded$6 = null;
        fe discarded$7 = null;
        fe discarded$8 = null;
        fe discarded$9 = null;
        int var2_int = 0;
        fe var2 = null;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        ck var6 = null;
        ck var7 = null;
        L0: {
          var5 = SteelSentinels.field_G;
          if (param0 < -56) {
            break L0;
          } else {
            discarded$5 = this.a((byte) -11, 3, -96);
            break L0;
          }
        }
        L1: {
          if (null != this.field_C) {
            if (this.b((byte) 114) != null) {
              if (this.field_D) {
                var2_int = 1;
                var3 = this.field_C.e(13058);
                L2: while (true) {
                  if (var3 == null) {
                    L3: while (true) {
                      L4: {
                        if (this.field_p >= this.field_A.field_j.length) {
                          break L4;
                        } else {
                          if (0 != this.field_A.field_j[this.field_p]) {
                            if ((this.field_k.field_f ^ -1) > -251) {
                              L5: {
                                if (this.field_h[this.field_p] == 0) {
                                  discarded$6 = this.a((byte) -109, this.field_p, 1);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              L6: {
                                if (-1 != (this.field_h[this.field_p] ^ -1)) {
                                  break L6;
                                } else {
                                  var7 = new ck();
                                  var7.field_j = (long)this.field_p;
                                  this.field_C.a(3, var7);
                                  var2_int = 0;
                                  break L6;
                                }
                              }
                              this.field_p = this.field_p + 1;
                              continue L3;
                            } else {
                              var2_int = 0;
                              break L4;
                            }
                          } else {
                            this.field_p = this.field_p + 1;
                            continue L3;
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L1;
                      } else {
                        this.field_D = false;
                        this.field_p = 0;
                        break L1;
                      }
                    }
                  } else {
                    L7: {
                      var4 = (int)var3.field_j;
                      if (this.field_h[var4] != 0) {
                        break L7;
                      } else {
                        discarded$7 = this.a((byte) -109, var4, 1);
                        break L7;
                      }
                    }
                    L8: {
                      if (this.field_h[var4] != 0) {
                        var3.b(4);
                        break L8;
                      } else {
                        var2_int = 0;
                        break L8;
                      }
                    }
                    var3 = this.field_C.a((byte) -101);
                    continue L2;
                  }
                }
              } else {
                if (!this.field_v) {
                  this.field_C = null;
                  break L1;
                } else {
                  var2_int = 1;
                  var3 = this.field_C.e(13058);
                  L9: while (true) {
                    if (var3 == null) {
                      L10: while (true) {
                        L11: {
                          if (this.field_A.field_j.length <= this.field_p) {
                            break L11;
                          } else {
                            L12: {
                              if (this.field_A.field_j[this.field_p] == 0) {
                                break L12;
                              } else {
                                if (this.field_B.b((byte) 102)) {
                                  var2_int = 0;
                                  break L11;
                                } else {
                                  L13: {
                                    if (-2 != (this.field_h[this.field_p] ^ -1)) {
                                      discarded$8 = this.a((byte) -109, this.field_p, 2);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (-2 == (this.field_h[this.field_p] ^ -1)) {
                                    break L12;
                                  } else {
                                    var6 = new ck();
                                    var6.field_j = (long)this.field_p;
                                    this.field_C.a(3, var6);
                                    var2_int = 0;
                                    break L12;
                                  }
                                }
                              }
                            }
                            this.field_p = this.field_p + 1;
                            continue L10;
                          }
                        }
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          this.field_v = false;
                          this.field_p = 0;
                          break L1;
                        }
                      }
                    } else {
                      L14: {
                        var4 = (int)var3.field_j;
                        if (1 != this.field_h[var4]) {
                          discarded$9 = this.a((byte) -109, var4, 2);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (-2 != (this.field_h[var4] ^ -1)) {
                          var2_int = 0;
                          break L15;
                        } else {
                          var3.b(4);
                          break L15;
                        }
                      }
                      var3 = this.field_C.a((byte) -19);
                      continue L9;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            break L1;
          }
        }
        L16: {
          if (!this.field_u) {
            break L16;
          } else {
            if (mm.a(-109) < this.field_n) {
              break L16;
            } else {
              var2 = (fe) ((Object) this.field_m.b(0));
              L17: while (true) {
                if (var2 == null) {
                  this.field_n = 1000L + mm.a(-89);
                  break L16;
                } else {
                  L18: {
                    if (var2.field_z) {
                      break L18;
                    } else {
                      if (var2.field_C) {
                        if (var2.field_B) {
                          var2.b(4);
                          break L18;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        var2.field_C = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (fe) ((Object) this.field_m.a((byte) 127));
                  continue L17;
                }
              }
            }
          }
        }
    }

    final byte[] a(int param0, int param1) {
        fe var3 = this.a((byte) -109, param0, 0);
        if (var3 == null) {
            return null;
        }
        int var4 = -50 % ((40 - param1) / 32);
        byte[] var5 = var3.d((byte) -80);
        var3.b(4);
        return var5;
    }

    final int a(boolean param0, int param1) {
        fe var3 = (fe) ((Object) this.field_m.a((long)param1, 127));
        if (!(var3 == null)) {
            return var3.g(16);
        }
        if (param0) {
            this.field_C = (ul) null;
            return 0;
        }
        return 0;
    }

    final void d(byte param0) {
        if (null == this.field_E) {
            return;
        }
        this.field_v = true;
        if (param0 != 74) {
            this.field_r = -97;
        }
        if (this.field_C == null) {
            this.field_C = new ul();
        }
    }

    final static String e(int param0) {
        int var1 = -29 % ((-61 - param0) / 57);
        String var2 = "";
        if (!(jd.field_kb == null)) {
            var2 = jd.field_kb.h((byte) -70);
        }
        if (0 == var2.length()) {
            var2 = wa.a((byte) -43);
        }
        if (!(var2.length() != 0)) {
            var2 = un.field_a;
        }
        return var2;
    }

    final static int a(boolean param0) {
        if (2 <= nj.field_Q) {
          L0: {
            if (-1 != (dh.field_D ^ -1)) {
              L1: {
                if (ok.field_f != null) {
                  if (ok.field_f.a(param0)) {
                    if (ok.field_f.a(12145, "")) {
                      if (!ok.field_f.a("", (byte) 90)) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!ke.field_k.a(true)) {
                return 43;
              } else {
                if (ke.field_k.a("commonui", (byte) 90)) {
                  if (oe.field_d.a(true)) {
                    if (oe.field_d.a("commonui", (byte) 90)) {
                      if (id.field_bc.a(true)) {
                        if (!id.field_bc.a(25)) {
                          return 86;
                        } else {
                          break L0;
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
              }
            } else {
              if (!ke.field_k.a(true)) {
                return 20;
              } else {
                if (!ke.field_k.a("commonui", (byte) 90)) {
                  return 40;
                } else {
                  if (!oe.field_d.a(true)) {
                    return 50;
                  } else {
                    if (oe.field_d.a("commonui", (byte) 90)) {
                      if (!id.field_bc.a(true)) {
                        return 70;
                      } else {
                        if (id.field_bc.a(25)) {
                          break L0;
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
            }
          }
          L2: {
            if (param0) {
              break L2;
            } else {
              fi.c(-55);
              break L2;
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    fi(int param0, rc param1, rc param2, vk param3, cb param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_m = new uh(16);
        this.field_p = 0;
        this.field_i = new ul();
        this.field_n = 0L;
        try {
          L0: {
            L1: {
              this.field_E = param1;
              this.field_r = param0;
              if (this.field_E != null) {
                this.field_D = true;
                this.field_C = new ul();
                break L1;
              } else {
                this.field_D = false;
                break L1;
              }
            }
            L2: {
              this.field_x = param2;
              this.field_k = param4;
              this.field_F = param5;
              this.field_q = param7;
              this.field_B = param3;
              this.field_o = param6;
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
              ((fi) (this)).field_u = stackIn_7_1 != 0;
              if (this.field_x == null) {
                break L3;
              } else {
                this.field_w = (fe) ((Object) this.field_k.a(21598, this.field_r, this.field_x));
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
            stackOut_10_1 = new StringBuilder().append("fi.<init>(").append(param0).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_z = "ADVANCED";
        field_s = "Accept";
        field_y = 2;
    }
}
