/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends vh {
    static String[] field_u;
    private int field_v;
    static byte[] field_A;
    private int field_y;
    static ka field_t;
    static dn field_x;
    private ga field_z;
    static ha field_w;

    final void d(byte param0, int param1) {
        this.field_v = param1;
        if (param0 < -16) {
            return;
        }
        int[] var4 = (int[]) null;
        this.a((int[]) null, -64);
    }

    static boolean a(boolean param0, boolean param1) {
        return param0 ^ param1;
    }

    final int a(boolean param0) {
        if (param0) {
            return 59;
        }
        return this.field_v;
    }

    bv(byte[] param0) {
        super(param0);
    }

    final void h(int param0, int param1) {
        int fieldTemp$2 = 0;
        if (param0 != 32161) {
          return;
        } else {
          fieldTemp$2 = this.field_q;
          this.field_q = this.field_q + 1;
          this.field_o[fieldTemp$2] = (byte)(param1 + this.field_z.a(256));
          return;
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = -82 / ((-41 - param0) / 57);
        var3 = this.field_v >> -1458551197;
        var4 = 8 + -(7 & this.field_v);
        this.field_v = this.field_v + param1;
        var6 = 0;
        L0: while (true) {
          if (var4 < param1) {
            incrementValue$1 = var3;
            var3++;
            var6 = var6 + ((this.field_o[incrementValue$1] & oj.field_n[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
            if (var7 == 0) {
              continue L0;
            } else {
              var6 = var6 + (this.field_o[var3] >> var4 + -param1 & oj.field_n[param1]);
              return var6;
            }
          } else {
            L1: {
              L2: {
                if (param1 != var4) {
                  break L2;
                } else {
                  var6 = var6 + (oj.field_n[var4] & this.field_o[var3]);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = var6 + (this.field_o[var3] >> var4 + -param1 & oj.field_n[param1]);
              break L1;
            }
            return var6;
          }
        }
    }

    final void o(int param0) {
        this.field_v = 8 * this.field_q;
        if (param0 > 10) {
            return;
        }
        this.o(52);
    }

    final void c(int param0, byte param1) {
        if (param1 != 0) {
            return;
        }
        this.field_y = 8 - (param0 & 7);
        this.field_q = param0 >> -1393143965;
    }

    bv(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        param2 = param2 & oj.field_n[param1];
        if (param0 != -16807) {
          this.d((byte) -128, -74);
          L0: while (true) {
            if (this.field_y < param1) {
              param1 = param1 - this.field_y;
              this.field_o[this.field_q] = (byte)oe.c(param2 >>> param1, rn.a((int) this.field_o[this.field_q], 255 << this.field_y));
              this.field_y = 8;
              this.field_q = this.field_q + 1;
              if (var6 == 0) {
                if (var6 == 0) {
                  continue L0;
                } else {
                  if (param1 == this.field_y) {
                    this.field_o[this.field_q] = (byte)oe.c(param2, rn.a((int) this.field_o[this.field_q], 255 << this.field_y));
                    this.field_q = this.field_q + 1;
                    this.field_y = 8;
                    if (var6 != 0) {
                      var4 = -param1 + this.field_y;
                      var5 = oj.field_n[param1] << var4 ^ -1;
                      this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                      this.field_y = this.field_y - param1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var4 = -param1 + this.field_y;
                    var5 = oj.field_n[param1] << var4 ^ -1;
                    this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                    this.field_y = this.field_y - param1;
                    return;
                  }
                }
              } else {
                var4 = -param1 + this.field_y;
                var5 = oj.field_n[param1] << var4 ^ -1;
                this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                this.field_y = this.field_y - param1;
                return;
              }
            } else {
              if (param1 == this.field_y) {
                this.field_o[this.field_q] = (byte)oe.c(param2, rn.a((int) this.field_o[this.field_q], 255 << this.field_y));
                this.field_q = this.field_q + 1;
                this.field_y = 8;
                if (var6 == 0) {
                  return;
                } else {
                  var4 = -param1 + this.field_y;
                  var5 = oj.field_n[param1] << var4 ^ -1;
                  this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                  this.field_y = this.field_y - param1;
                  return;
                }
              } else {
                var4 = -param1 + this.field_y;
                var5 = oj.field_n[param1] << var4 ^ -1;
                this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                this.field_y = this.field_y - param1;
                return;
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_y >= param1) {
              if (param1 == this.field_y) {
                this.field_o[this.field_q] = (byte)oe.c(param2, rn.a((int) this.field_o[this.field_q], 255 << this.field_y));
                this.field_q = this.field_q + 1;
                this.field_y = 8;
                if (var6 == 0) {
                  return;
                } else {
                  var4 = -param1 + this.field_y;
                  var5 = oj.field_n[param1] << var4 ^ -1;
                  this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                  this.field_y = this.field_y - param1;
                  return;
                }
              } else {
                var4 = -param1 + this.field_y;
                var5 = oj.field_n[param1] << var4 ^ -1;
                this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                this.field_y = this.field_y - param1;
                return;
              }
            } else {
              param1 = param1 - this.field_y;
              this.field_o[this.field_q] = (byte)oe.c(param2 >>> param1, rn.a((int) this.field_o[this.field_q], 255 << this.field_y));
              this.field_y = 8;
              this.field_q = this.field_q + 1;
              if (var6 == 0) {
                continue L1;
              } else {
                var4 = -param1 + this.field_y;
                var5 = oj.field_n[param1] << var4 ^ -1;
                this.field_o[this.field_q] = (byte)oe.c(rn.a(var5, (int) this.field_o[this.field_q]), param2 << var4);
                this.field_y = this.field_y - param1;
                return;
              }
            }
          }
        }
    }

    final int m(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 255) {
          this.field_v = -69;
          fieldTemp$4 = this.field_q;
          this.field_q = this.field_q + 1;
          return this.field_o[fieldTemp$4] - this.field_z.a(256) & 255;
        } else {
          fieldTemp$5 = this.field_q;
          this.field_q = this.field_q + 1;
          return this.field_o[fieldTemp$5] - this.field_z.a(256) & 255;
        }
    }

    final void a(int[] param0, int param1) {
        try {
            if (param1 >= -76) {
                field_w = (ha) null;
            }
            this.field_z = new ga(param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "bv.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void k(byte param0) {
        field_x = null;
        field_t = null;
        field_A = null;
        field_w = null;
        field_u = null;
        if (param0 == -97) {
          return;
        } else {
          bv.a(true, -32, -99, 30);
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (param0 <= var5_int) {
                  if (!param2) {
                    break L2;
                  } else {
                    this.o(-70);
                    break L2;
                  }
                } else {
                  fieldTemp$5 = this.field_q;
                  this.field_q = this.field_q + 1;
                  param1[param3 + var5_int] = (byte)(this.field_o[fieldTemp$5] + -this.field_z.a(256));
                  var5_int++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("bv.L(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        if (param1 != jt.field_a) {
          hi.field_i = null;
          ho.a(73);
          ui.field_c = param3;
          if (0 == param1) {
            ui.field_c = 0;
            hh.a(-16147, 50, mp.field_Ob, true);
            if (-24 == (param1 ^ -1)) {
              ui.field_c = 0;
              if (param1 == -10) {
                qc.field_j = 0;
                if (!nm.a(jt.field_a, true)) {
                  if (nm.a(param1, true)) {
                    L0: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    L1: {
                      if (param1 != 0) {
                        break L1;
                      } else {
                        var4 = 2;
                        break L1;
                      }
                    }
                    L2: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (param1 != 20) {
                        break L3;
                      } else {
                        var4 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (-13 != (param1 ^ -1)) {
                        break L4;
                      } else {
                        var4 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var4 == -2) {
                      L6: {
                        rq.field_p[param1].a(71, param0, 0);
                        if ((param1 ^ -1) == -16) {
                          kj.a(param0, param2 + -1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      rq.field_p[param1].a(85, param0, var4);
                      if (!ArmiesOfGielinor.field_M) {
                        if ((param1 ^ -1) == -16) {
                          L8: {
                            kj.a(param0, param2 + -1);
                            if (jt.field_a == 16) {
                              fg.a((byte) 111);
                              ts.a((byte) -41);
                              vr.a(iw.field_l, 18);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          jt.field_a = param1;
                          if (param2 != 1) {
                            bv.k((byte) -51);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L9: {
                            if (jt.field_a == 16) {
                              fg.a((byte) 111);
                              ts.a((byte) -41);
                              vr.a(iw.field_l, 18);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          jt.field_a = param1;
                          if (param2 != 1) {
                            bv.k((byte) -51);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        L10: {
                          rq.field_p[param1].a(71, param0, 0);
                          if ((param1 ^ -1) == -16) {
                            kj.a(param0, param2 + -1);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (jt.field_a == 16) {
                            fg.a((byte) 111);
                            ts.a((byte) -41);
                            vr.a(iw.field_l, 18);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        jt.field_a = param1;
                        if (param2 != 1) {
                          bv.k((byte) -51);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L12: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  rq.field_p[jt.field_a].d(true);
                  if (nm.a(param1, true)) {
                    L13: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (param1 != 0) {
                        break L14;
                      } else {
                        var4 = 2;
                        break L14;
                      }
                    }
                    L15: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (param1 != 20) {
                        break L16;
                      } else {
                        var4 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      if (-13 != (param1 ^ -1)) {
                        break L17;
                      } else {
                        var4 = 1;
                        break L17;
                      }
                    }
                    L18: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    if (var4 == -2) {
                      L19: {
                        rq.field_p[param1].a(71, param0, 0);
                        if ((param1 ^ -1) == -16) {
                          kj.a(param0, param2 + -1);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      rq.field_p[param1].a(85, param0, var4);
                      if (!ArmiesOfGielinor.field_M) {
                        if ((param1 ^ -1) == -16) {
                          L21: {
                            kj.a(param0, param2 + -1);
                            if (jt.field_a == 16) {
                              fg.a((byte) 111);
                              ts.a((byte) -41);
                              vr.a(iw.field_l, 18);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          jt.field_a = param1;
                          if (param2 != 1) {
                            bv.k((byte) -51);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L22: {
                            if (jt.field_a == 16) {
                              fg.a((byte) 111);
                              ts.a((byte) -41);
                              vr.a(iw.field_l, 18);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          jt.field_a = param1;
                          if (param2 != 1) {
                            bv.k((byte) -51);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        L23: {
                          rq.field_p[param1].a(71, param0, 0);
                          if ((param1 ^ -1) == -16) {
                            kj.a(param0, param2 + -1);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (jt.field_a == 16) {
                            fg.a((byte) 111);
                            ts.a((byte) -41);
                            vr.a(iw.field_l, 18);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        jt.field_a = param1;
                        if (param2 != 1) {
                          bv.k((byte) -51);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L25: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L26: {
                  mu.field_a = new cg();
                  qc.field_j = 0;
                  if (!nm.a(jt.field_a, true)) {
                    break L26;
                  } else {
                    rq.field_p[jt.field_a].d(true);
                    break L26;
                  }
                }
                L27: {
                  if (nm.a(param1, true)) {
                    L28: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (param1 != 0) {
                        break L29;
                      } else {
                        var4 = 2;
                        break L29;
                      }
                    }
                    L30: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (param1 != 20) {
                        break L31;
                      } else {
                        var4 = 0;
                        break L31;
                      }
                    }
                    L32: {
                      if (-13 != (param1 ^ -1)) {
                        break L32;
                      } else {
                        var4 = 1;
                        break L32;
                      }
                    }
                    L33: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (var4 == -2) {
                        break L34;
                      } else {
                        rq.field_p[param1].a(85, param0, var4);
                        if (!ArmiesOfGielinor.field_M) {
                          if ((param1 ^ -1) == -16) {
                            kj.a(param0, param2 + -1);
                            break L27;
                          } else {
                            L35: {
                              if (jt.field_a == 16) {
                                fg.a((byte) 111);
                                ts.a((byte) -41);
                                vr.a(iw.field_l, 18);
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            jt.field_a = param1;
                            if (param2 != 1) {
                              bv.k((byte) -51);
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          break L34;
                        }
                      }
                    }
                    L36: {
                      rq.field_p[param1].a(71, param0, 0);
                      if ((param1 ^ -1) == -16) {
                        kj.a(param0, param2 + -1);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L27;
                  }
                }
                L38: {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                    break L38;
                  } else {
                    break L38;
                  }
                }
                jt.field_a = param1;
                if (param2 != 1) {
                  bv.k((byte) -51);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 == -10) {
                qc.field_j = 0;
                if (!nm.a(jt.field_a, true)) {
                  if (nm.a(param1, true)) {
                    L39: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    L40: {
                      if (param1 != 0) {
                        break L40;
                      } else {
                        var4 = 2;
                        break L40;
                      }
                    }
                    L41: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      if (param1 != 20) {
                        break L42;
                      } else {
                        var4 = 0;
                        break L42;
                      }
                    }
                    L43: {
                      if (-13 != (param1 ^ -1)) {
                        break L43;
                      } else {
                        var4 = 1;
                        break L43;
                      }
                    }
                    L44: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    if (var4 == -2) {
                      L45: {
                        rq.field_p[param1].a(71, param0, 0);
                        if ((param1 ^ -1) == -16) {
                          kj.a(param0, param2 + -1);
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                      L46: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      rq.field_p[param1].a(85, param0, var4);
                      if (!ArmiesOfGielinor.field_M) {
                        if ((param1 ^ -1) == -16) {
                          L47: {
                            kj.a(param0, param2 + -1);
                            if (jt.field_a == 16) {
                              fg.a((byte) 111);
                              ts.a((byte) -41);
                              vr.a(iw.field_l, 18);
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                          jt.field_a = param1;
                          if (param2 != 1) {
                            bv.k((byte) -51);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L48: {
                            if (jt.field_a == 16) {
                              fg.a((byte) 111);
                              ts.a((byte) -41);
                              vr.a(iw.field_l, 18);
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                          jt.field_a = param1;
                          if (param2 != 1) {
                            bv.k((byte) -51);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        L49: {
                          rq.field_p[param1].a(71, param0, 0);
                          if ((param1 ^ -1) == -16) {
                            kj.a(param0, param2 + -1);
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        L50: {
                          if (jt.field_a == 16) {
                            fg.a((byte) 111);
                            ts.a((byte) -41);
                            vr.a(iw.field_l, 18);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        jt.field_a = param1;
                        if (param2 != 1) {
                          bv.k((byte) -51);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    L51: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L51;
                      } else {
                        break L51;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L52: {
                    rq.field_p[jt.field_a].d(true);
                    if (nm.a(param1, true)) {
                      L53: {
                        var4 = -2;
                        if (param1 == 15) {
                          var4 = -1;
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      L54: {
                        if (param1 != 0) {
                          break L54;
                        } else {
                          var4 = 2;
                          break L54;
                        }
                      }
                      L55: {
                        if (param1 == 7) {
                          var4 = 1;
                          break L55;
                        } else {
                          break L55;
                        }
                      }
                      L56: {
                        if (param1 != 20) {
                          break L56;
                        } else {
                          var4 = 0;
                          break L56;
                        }
                      }
                      L57: {
                        if (-13 != (param1 ^ -1)) {
                          break L57;
                        } else {
                          var4 = 1;
                          break L57;
                        }
                      }
                      L58: {
                        if (param1 == 18) {
                          var4 = 2;
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                      L59: {
                        L60: {
                          if (var4 == -2) {
                            break L60;
                          } else {
                            rq.field_p[param1].a(85, param0, var4);
                            if (!ArmiesOfGielinor.field_M) {
                              break L59;
                            } else {
                              break L60;
                            }
                          }
                        }
                        rq.field_p[param1].a(71, param0, 0);
                        break L59;
                      }
                      if ((param1 ^ -1) == -16) {
                        kj.a(param0, param2 + -1);
                        break L52;
                      } else {
                        break L52;
                      }
                    } else {
                      break L52;
                    }
                  }
                  L61: {
                    if (jt.field_a == 16) {
                      fg.a((byte) 111);
                      ts.a((byte) -41);
                      vr.a(iw.field_l, 18);
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  jt.field_a = param1;
                  if (param2 != 1) {
                    bv.k((byte) -51);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L62: {
                  mu.field_a = new cg();
                  qc.field_j = 0;
                  if (!nm.a(jt.field_a, true)) {
                    break L62;
                  } else {
                    rq.field_p[jt.field_a].d(true);
                    break L62;
                  }
                }
                L63: {
                  if (nm.a(param1, true)) {
                    L64: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L64;
                      } else {
                        break L64;
                      }
                    }
                    L65: {
                      if (param1 != 0) {
                        break L65;
                      } else {
                        var4 = 2;
                        break L65;
                      }
                    }
                    L66: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                    L67: {
                      if (param1 != 20) {
                        break L67;
                      } else {
                        var4 = 0;
                        break L67;
                      }
                    }
                    L68: {
                      if (-13 != (param1 ^ -1)) {
                        break L68;
                      } else {
                        var4 = 1;
                        break L68;
                      }
                    }
                    L69: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L69;
                      } else {
                        break L69;
                      }
                    }
                    L70: {
                      L71: {
                        if (var4 == -2) {
                          break L71;
                        } else {
                          rq.field_p[param1].a(85, param0, var4);
                          if (!ArmiesOfGielinor.field_M) {
                            break L70;
                          } else {
                            break L71;
                          }
                        }
                      }
                      rq.field_p[param1].a(71, param0, 0);
                      break L70;
                    }
                    if ((param1 ^ -1) == -16) {
                      kj.a(param0, param2 + -1);
                      break L63;
                    } else {
                      break L63;
                    }
                  } else {
                    break L63;
                  }
                }
                L72: {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                    break L72;
                  } else {
                    break L72;
                  }
                }
                jt.field_a = param1;
                if (param2 == 1) {
                  return;
                } else {
                  bv.k((byte) -51);
                  return;
                }
              }
            }
          } else {
            L73: {
              if (-24 != (param1 ^ -1)) {
                break L73;
              } else {
                ui.field_c = 0;
                break L73;
              }
            }
            if (param1 == -10) {
              qc.field_j = 0;
              if (!nm.a(jt.field_a, true)) {
                if (nm.a(param1, true)) {
                  L74: {
                    var4 = -2;
                    if (param1 == 15) {
                      var4 = -1;
                      break L74;
                    } else {
                      break L74;
                    }
                  }
                  L75: {
                    if (param1 != 0) {
                      break L75;
                    } else {
                      var4 = 2;
                      break L75;
                    }
                  }
                  L76: {
                    if (param1 == 7) {
                      var4 = 1;
                      break L76;
                    } else {
                      break L76;
                    }
                  }
                  L77: {
                    if (param1 != 20) {
                      break L77;
                    } else {
                      var4 = 0;
                      break L77;
                    }
                  }
                  L78: {
                    if (-13 != (param1 ^ -1)) {
                      break L78;
                    } else {
                      var4 = 1;
                      break L78;
                    }
                  }
                  L79: {
                    if (param1 == 18) {
                      var4 = 2;
                      break L79;
                    } else {
                      break L79;
                    }
                  }
                  if (var4 == -2) {
                    L80: {
                      rq.field_p[param1].a(71, param0, 0);
                      if ((param1 ^ -1) == -16) {
                        kj.a(param0, param2 + -1);
                        break L80;
                      } else {
                        break L80;
                      }
                    }
                    L81: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L81;
                      } else {
                        break L81;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 == 1) {
                      return;
                    } else {
                      bv.k((byte) -51);
                      return;
                    }
                  } else {
                    rq.field_p[param1].a(85, param0, var4);
                    if (!ArmiesOfGielinor.field_M) {
                      if ((param1 ^ -1) == -16) {
                        L82: {
                          kj.a(param0, param2 + -1);
                          if (jt.field_a == 16) {
                            fg.a((byte) 111);
                            ts.a((byte) -41);
                            vr.a(iw.field_l, 18);
                            break L82;
                          } else {
                            break L82;
                          }
                        }
                        jt.field_a = param1;
                        if (param2 == 1) {
                          return;
                        } else {
                          bv.k((byte) -51);
                          return;
                        }
                      } else {
                        L83: {
                          if (jt.field_a == 16) {
                            fg.a((byte) 111);
                            ts.a((byte) -41);
                            vr.a(iw.field_l, 18);
                            break L83;
                          } else {
                            break L83;
                          }
                        }
                        jt.field_a = param1;
                        if (param2 == 1) {
                          return;
                        } else {
                          bv.k((byte) -51);
                          return;
                        }
                      }
                    } else {
                      L84: {
                        rq.field_p[param1].a(71, param0, 0);
                        if ((param1 ^ -1) == -16) {
                          kj.a(param0, param2 + -1);
                          break L84;
                        } else {
                          break L84;
                        }
                      }
                      L85: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L85;
                        } else {
                          break L85;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 == 1) {
                        return;
                      } else {
                        bv.k((byte) -51);
                        return;
                      }
                    }
                  }
                } else {
                  L86: {
                    if (jt.field_a == 16) {
                      fg.a((byte) 111);
                      ts.a((byte) -41);
                      vr.a(iw.field_l, 18);
                      break L86;
                    } else {
                      break L86;
                    }
                  }
                  jt.field_a = param1;
                  if (param2 == 1) {
                    return;
                  } else {
                    bv.k((byte) -51);
                    return;
                  }
                }
              } else {
                L87: {
                  rq.field_p[jt.field_a].d(true);
                  if (nm.a(param1, true)) {
                    L88: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L88;
                      } else {
                        break L88;
                      }
                    }
                    L89: {
                      if (param1 != 0) {
                        break L89;
                      } else {
                        var4 = 2;
                        break L89;
                      }
                    }
                    L90: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L90;
                      } else {
                        break L90;
                      }
                    }
                    L91: {
                      if (param1 != 20) {
                        break L91;
                      } else {
                        var4 = 0;
                        break L91;
                      }
                    }
                    L92: {
                      if (-13 != (param1 ^ -1)) {
                        break L92;
                      } else {
                        var4 = 1;
                        break L92;
                      }
                    }
                    L93: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                    L94: {
                      L95: {
                        if (var4 == -2) {
                          break L95;
                        } else {
                          rq.field_p[param1].a(85, param0, var4);
                          if (!ArmiesOfGielinor.field_M) {
                            break L94;
                          } else {
                            break L95;
                          }
                        }
                      }
                      rq.field_p[param1].a(71, param0, 0);
                      break L94;
                    }
                    if ((param1 ^ -1) == -16) {
                      kj.a(param0, param2 + -1);
                      break L87;
                    } else {
                      break L87;
                    }
                  } else {
                    break L87;
                  }
                }
                L96: {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                    break L96;
                  } else {
                    break L96;
                  }
                }
                jt.field_a = param1;
                if (param2 == 1) {
                  return;
                } else {
                  bv.k((byte) -51);
                  return;
                }
              }
            } else {
              L97: {
                mu.field_a = new cg();
                qc.field_j = 0;
                if (!nm.a(jt.field_a, true)) {
                  break L97;
                } else {
                  rq.field_p[jt.field_a].d(true);
                  break L97;
                }
              }
              L98: {
                if (nm.a(param1, true)) {
                  L99: {
                    var4 = -2;
                    if (param1 == 15) {
                      var4 = -1;
                      break L99;
                    } else {
                      break L99;
                    }
                  }
                  L100: {
                    if (param1 != 0) {
                      break L100;
                    } else {
                      var4 = 2;
                      break L100;
                    }
                  }
                  L101: {
                    if (param1 == 7) {
                      var4 = 1;
                      break L101;
                    } else {
                      break L101;
                    }
                  }
                  L102: {
                    if (param1 != 20) {
                      break L102;
                    } else {
                      var4 = 0;
                      break L102;
                    }
                  }
                  L103: {
                    if (-13 != (param1 ^ -1)) {
                      break L103;
                    } else {
                      var4 = 1;
                      break L103;
                    }
                  }
                  L104: {
                    if (param1 == 18) {
                      var4 = 2;
                      break L104;
                    } else {
                      break L104;
                    }
                  }
                  L105: {
                    L106: {
                      if (var4 == -2) {
                        break L106;
                      } else {
                        rq.field_p[param1].a(85, param0, var4);
                        if (!ArmiesOfGielinor.field_M) {
                          break L105;
                        } else {
                          break L106;
                        }
                      }
                    }
                    rq.field_p[param1].a(71, param0, 0);
                    break L105;
                  }
                  if ((param1 ^ -1) == -16) {
                    kj.a(param0, param2 + -1);
                    break L98;
                  } else {
                    break L98;
                  }
                } else {
                  break L98;
                }
              }
              L107: {
                if (jt.field_a == 16) {
                  fg.a((byte) 111);
                  ts.a((byte) -41);
                  vr.a(iw.field_l, 18);
                  break L107;
                } else {
                  break L107;
                }
              }
              jt.field_a = param1;
              if (param2 == 1) {
                return;
              } else {
                bv.k((byte) -51);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void n(int param0) {
        this.field_q = (7 + this.field_v) / 8;
        if (param0 == -2) {
            return;
        }
        this.c(-66, (byte) 60);
    }

    static {
        field_u = new String[]{"aviansie_axe_spin", null, null, null, null, "spin", null};
        field_A = new byte[]{(byte)7, (byte)4, (byte)4, (byte)4, (byte)2, (byte) 5};
    }
}
