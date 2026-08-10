/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hf {
    private wb field_i;
    private int field_p;
    private byte[] field_w;
    private byte[] field_g;
    static String[] field_r;
    private int field_n;
    static double field_u;
    private e field_z;
    private int field_j;
    static dg field_q;
    private dl field_B;
    private kl field_C;
    private si field_t;
    static eg field_A;
    private dl field_f;
    private na field_k;
    static java.awt.Canvas field_y;
    private ng field_l;
    private int field_o;
    static int field_m;
    private boolean field_D;
    private boolean field_d;
    static String field_s;
    static long field_x;
    private ng field_v;
    private boolean field_e;
    private long field_h;

    final void b(int param0) {
        int var3 = 0;
        si discarded$0 = null;
        si discarded$1 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!(null != this.field_v)) {
            return;
        }
        if (!(this.a(false) != null)) {
            return;
        }
        if (param0 > -68) {
            this.a(true);
        }
        kd var2 = this.field_l.a(true);
        while (var2 != null) {
            var3 = (int)var2.field_d;
            if (-1 < (var3 ^ -1)) {
                var2.b((byte) -122);
            } else {
                if (var3 >= this.field_z.field_d) {
                    var2.b((byte) -122);
                } else {
                    if (this.field_z.field_m[var3] == 0) {
                        var2.b((byte) -122);
                    } else {
                        if (!(-1 != (this.field_w[var3] ^ -1))) {
                            discarded$0 = this.a((byte) -128, 1, var3);
                        }
                        if ((this.field_w[var3] ^ -1) == 0) {
                            discarded$1 = this.a((byte) -91, 2, var3);
                        }
                        if (1 == this.field_w[var3]) {
                            var2.b((byte) -118);
                        }
                    }
                }
            }
            var2 = this.field_l.f(2);
        }
    }

    final void b(boolean param0) {
        si discarded$0 = null;
        si discarded$1 = null;
        si discarded$2 = null;
        si discarded$3 = null;
        int var2_int;
        si var2;
        kd var3;
        int var4;
        int var5;
        kd var6;
        kd var7;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (null == this.field_v) {
            break L0;
          } else {
            if (null != this.a(false)) {
              if (this.field_D) {
                var2_int = 1;
                var3 = this.field_v.a(true);
                L1: while (true) {
                  if (var3 == null) {
                    L2: while (true) {
                      L3: {
                        if (this.field_o >= this.field_z.field_m.length) {
                          break L3;
                        } else {
                          if (-1 != (this.field_z.field_m[this.field_o] ^ -1)) {
                            if ((this.field_C.field_c ^ -1) <= -251) {
                              var2_int = 0;
                              break L3;
                            } else {
                              L4: {
                                if (this.field_w[this.field_o] != 0) {
                                  break L4;
                                } else {
                                  discarded$0 = this.a((byte) -88, 1, this.field_o);
                                  break L4;
                                }
                              }
                              L5: {
                                if (this.field_w[this.field_o] != 0) {
                                  break L5;
                                } else {
                                  var7 = new kd();
                                  var7.field_d = (long)this.field_o;
                                  var2_int = 0;
                                  this.field_v.b(123, var7);
                                  break L5;
                                }
                              }
                              this.field_o = this.field_o + 1;
                              continue L2;
                            }
                          } else {
                            this.field_o = this.field_o + 1;
                            continue L2;
                          }
                        }
                      }
                      if (var2_int != 0) {
                        this.field_o = 0;
                        this.field_D = false;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    L6: {
                      var4 = (int)var3.field_d;
                      if ((this.field_w[var4] ^ -1) == -1) {
                        discarded$1 = this.a((byte) -93, 1, var4);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (this.field_w[var4] == 0) {
                        var2_int = 0;
                        break L7;
                      } else {
                        var3.b((byte) -116);
                        break L7;
                      }
                    }
                    var3 = this.field_v.f(2);
                    continue L1;
                  }
                }
              } else {
                if (this.field_d) {
                  var2_int = 1;
                  var3 = this.field_v.a(true);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (this.field_z.field_m.length <= this.field_o) {
                            break L10;
                          } else {
                            if (0 != this.field_z.field_m[this.field_o]) {
                              if (this.field_i.a(9172)) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L11: {
                                  if (-2 != (this.field_w[this.field_o] ^ -1)) {
                                    discarded$2 = this.a((byte) -25, 2, this.field_o);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if ((this.field_w[this.field_o] ^ -1) == -2) {
                                    break L12;
                                  } else {
                                    var6 = new kd();
                                    var6.field_d = (long)this.field_o;
                                    this.field_v.b(105, var6);
                                    var2_int = 0;
                                    break L12;
                                  }
                                }
                                this.field_o = this.field_o + 1;
                                continue L9;
                              }
                            } else {
                              this.field_o = this.field_o + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          this.field_o = 0;
                          this.field_d = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_d;
                        if (this.field_w[var4] != 1) {
                          discarded$3 = this.a((byte) -56, 2, var4);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (-2 == (this.field_w[var4] ^ -1)) {
                          var3.b((byte) -128);
                          break L14;
                        } else {
                          var2_int = 0;
                          break L14;
                        }
                      }
                      var3 = this.field_v.f(2);
                      continue L8;
                    }
                  }
                } else {
                  this.field_v = null;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        }
        L15: {
          if (!this.field_e) {
            break L15;
          } else {
            if (this.field_h > rf.c(0)) {
              break L15;
            } else {
              var2 = (si) ((Object) this.field_k.c((byte) -120));
              L16: while (true) {
                if (var2 == null) {
                  this.field_h = 1000L + rf.c(0);
                  break L15;
                } else {
                  L17: {
                    if (var2.field_v) {
                      break L17;
                    } else {
                      if (var2.field_r) {
                        if (!var2.field_p) {
                          throw new RuntimeException();
                        } else {
                          var2.b((byte) -122);
                          break L17;
                        }
                      } else {
                        var2.field_r = true;
                        break L17;
                      }
                    }
                  }
                  var2 = (si) ((Object) this.field_k.a((byte) -91));
                  continue L16;
                }
              }
            }
          }
        }
        L18: {
          if (!param0) {
            break L18;
          } else {
            this.a(15, 40);
            break L18;
          }
        }
    }

    final int a(int param0, int param1) {
        si var3 = (si) ((Object) this.field_k.a((long)param0, (byte) 96));
        if (!(var3 == null)) {
            return var3.c((byte) 16);
        }
        if (param1 != 1215) {
            return -35;
        }
        return 0;
    }

    final void c(int param0) {
        if (!(null != this.field_B)) {
            return;
        }
        if (param0 != 11002) {
            this.field_v = (ng) null;
        }
        this.field_d = true;
        if (!(this.field_v != null)) {
            this.field_v = new ng();
        }
    }

    final e a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (this.field_z == null) {
          L0: {
            if (null != this.field_t) {
              break L0;
            } else {
              if (!this.field_i.e(20)) {
                this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_t.field_v) {
            L1: {
              var7 = this.field_t.d((byte) -125);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (this.field_t instanceof fj) {
                try {
                  L2: {
                    if (var5 != null) {
                      this.field_z = new e(var7, this.field_p, this.field_g);
                      if (this.field_z.field_s == this.field_n) {
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
                    this.field_z = null;
                    if (this.field_i.e(20)) {
                      this.field_t = null;
                      break L3;
                    } else {
                      this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
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
                      this.field_z = new e(var7, this.field_p, this.field_g);
                      break L4;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    this.field_i.c(-28488);
                    this.field_z = null;
                    if (this.field_i.e(20)) {
                      this.field_t = null;
                      break L5;
                    } else {
                      this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
                      break L5;
                    }
                  }
                  return null;
                }
                if (null != this.field_f) {
                  this.field_C.a(var7, this.field_j, 1, this.field_f);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (null == this.field_B) {
                break L6;
              } else {
                this.field_w = new byte[this.field_z.field_d];
                break L6;
              }
            }
            L7: {
              if (!param0) {
                break L7;
              } else {
                field_m = 43;
                break L7;
              }
            }
            this.field_t = null;
            return this.field_z;
          } else {
            return null;
          }
        } else {
          return this.field_z;
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 121) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            var5 = bd.field_l;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "ug.L(" + param0 + ')');
        }
    }

    final static wj a(sh param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        wj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_q = (dg) null;
                break L1;
              }
            }
            var4 = param0.a(param1, -117);
            var3 = var4;
            if (var4 != null) {
              stackIn_6_0 = new wj(var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("ug.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = this.a((byte) -3, 0, param0);
        if (var3 == null) {
            return null;
        }
        if (!param1) {
            this.field_e = true;
        }
        byte[] var4 = var3.d((byte) -106);
        var3.b((byte) -116);
        return var4;
    }

    private final si a(byte param0, int param1, int param2) {
        Object stackIn_60_0 = null;
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
        si var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var12 = (si) ((Object) this.field_k.a((long)param2, (byte) 107));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (var12.field_p) {
                break L0;
              } else {
                if (!var12.field_v) {
                  break L0;
                } else {
                  var12.b((byte) -116);
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
                  if (null == this.field_B) {
                    break L3;
                  } else {
                    if ((this.field_w[param2] ^ -1) != 0) {
                      var4 = this.field_C.a(this.field_B, (byte) -6, param2);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.field_i.e(20)) {
                  var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if ((param1 ^ -1) != -2) {
                  if ((param1 ^ -1) != -3) {
                    throw new RuntimeException();
                  } else {
                    if (this.field_B == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == this.field_w[param2]) {
                        if (!this.field_i.a(9172)) {
                          var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, false);
                          break L2;
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                } else {
                  if (null == this.field_B) {
                    throw new RuntimeException();
                  } else {
                    var4 = this.field_C.a(param2, this.field_B, 3);
                    break L2;
                  }
                }
              }
            }
            this.field_k.a((kd) (var4), (byte) -114, (long)param2);
            break L1;
          }
        }
        L4: {
          if (param0 < 0) {
            break L4;
          } else {
            ug.a((byte) -68);
            break L4;
          }
        }
        if (!((si) (var4)).field_v) {
          var18 = ((si) (var4)).d((byte) 123);
          var13 = var18;
          var5 = var13;
          if (!(var4 instanceof fj)) {
            try {
              L5: {
                L6: {
                  if (var5 == null) {
                    break L6;
                  } else {
                    if ((var18.length ^ -1) >= -3) {
                      break L6;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, -2 + var18.length);
                      var6_int = (int)uh.field_v.getValue();
                      if (var6_int == this.field_z.field_r[param2]) {
                        L7: {
                          if (null == this.field_z.field_o) {
                            break L7;
                          } else {
                            if (null == this.field_z.field_o[param2]) {
                              break L7;
                            } else {
                              var30 = this.field_z.field_o[param2];
                              var29 = si.a(0, var5, -121, var18.length - 2);
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
                            }
                          }
                        }
                        this.field_i.field_p = 0;
                        this.field_i.field_j = 0;
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
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              this.field_i.c(-28488);
              ((si) (var4)).b((byte) -121);
              if (((si) (var4)).field_p) {
                L9: {
                  if (!this.field_i.e(20)) {
                    var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
                    this.field_k.a((kd) (var4), (byte) -75, (long)param2);
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
              var5[-2 + var18.length] = (byte)(this.field_z.field_t[param2] >>> -1305027192);
              var5[var18.length + -1] = (byte)this.field_z.field_t[param2];
              if (this.field_B != null) {
                this.field_C.a(var18, param2, 1, this.field_B);
                if ((this.field_w[param2] ^ -1) != -2) {
                  this.field_w[param2] = (byte) 1;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (!((si) (var4)).field_p) {
                ((si) (var4)).b((byte) -128);
                break L11;
              } else {
                break L11;
              }
            }
            return (si) (var4);
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
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, var18.length + -2);
                      var6_int = (int)uh.field_v.getValue();
                      if (var6_int != this.field_z.field_r[param2]) {
                        throw new RuntimeException();
                      } else {
                        L14: {
                          if (this.field_z.field_o == null) {
                            break L14;
                          } else {
                            if (null != this.field_z.field_o[param2]) {
                              var27 = this.field_z.field_o[param2];
                              var28 = si.a(0, var5, -99, var18.length - 2);
                              var9 = 0;
                              L15: while (true) {
                                if (64 <= var9) {
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
                        var7 = ((var5[var18.length - 2] & 255) << -966605144) + (255 & var5[-1 + var18.length]);
                        if (var7 != (this.field_z.field_t[param2] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L16: {
                            if (1 != this.field_w[param2]) {
                              L17: {
                                if (this.field_w[param2] == 0) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_w[param2] = (byte) 1;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L18: {
                            if (((si) (var4)).field_p) {
                              break L18;
                            } else {
                              ((si) (var4)).b((byte) -128);
                              break L18;
                            }
                          }
                          stackIn_60_0 = var4;
                          break L12;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_w[param2] = (byte)-1;
              ((si) (var4)).b((byte) -117);
              if (((si) (var4)).field_p) {
                if (!this.field_i.e(20)) {
                  var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
                  this.field_k.a((kd) (var4), (byte) -92, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (si) ((Object) stackIn_60_0);
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_r = null;
        field_A = null;
        field_y = null;
        if (param0 != 64) {
            field_y = (java.awt.Canvas) null;
        }
        field_q = null;
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_k = new na(16);
        this.field_o = 0;
        this.field_l = new ng();
        this.field_h = 0L;
        try {
          L0: {
            L1: {
              this.field_j = param0;
              this.field_B = param1;
              if (this.field_B == null) {
                this.field_D = false;
                break L1;
              } else {
                this.field_D = true;
                this.field_v = new ng();
                break L1;
              }
            }
            L2: {
              this.field_i = param3;
              this.field_n = param7;
              this.field_f = param2;
              this.field_g = param6;
              this.field_p = param5;
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
              ((ug) (this)).field_e = stackIn_7_1 != 0;
              this.field_C = param4;
              if (null == this.field_f) {
                break L3;
              } else {
                this.field_t = (si) ((Object) this.field_C.a(this.field_f, (byte) -6, this.field_j));
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

            stackIn_12_1 = new StringBuilder().append("ug.<init>(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = new String[16];
        field_u = 0.0;
        field_q = new dg();
        field_m = 0;
        field_s = "en-gb";
    }
}
