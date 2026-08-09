/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends nv implements ut {
    static nh field_y;
    private int field_n;
    private boolean field_D;
    private mg field_t;
    private int field_q;
    private jma field_C;
    private boolean field_v;
    private pc field_u;
    private int field_x;
    private mma field_p;
    private int field_s;
    private up field_z;
    private int field_E;
    private boolean field_A;
    static String[][] field_w;
    private int field_o;
    private boolean field_r;

    final int a(boolean param0) {
        if (param0) {
            this.field_v = false;
            return 30;
        }
        return 30;
    }

    final void n(byte param0) {
        super.n((byte) 75);
        if (param0 > 68) {
          this.q((byte) 92);
          if (!this.field_D) {
            this.field_z = new up(this.e(6), 4, 128);
            return;
          } else {
            this.field_z = null;
            return;
          }
        } else {
          this.field_n = 46;
          this.q((byte) 92);
          if (!this.field_D) {
            this.field_z = new up(this.e(6), 4, 128);
            return;
          } else {
            this.field_z = null;
            return;
          }
        }
    }

    final void g(int param0) {
        super.g(param0 + 0);
        if (param0 != -2) {
          this.field_C = (jma) null;
          this.field_C.a((byte) 48, this.h((byte) 111));
          return;
        } else {
          this.field_C.a((byte) 48, this.h((byte) 111));
          return;
        }
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            this.j((byte) 54);
            return this.field_C;
        }
        return this.field_C;
    }

    public final int j(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -108) {
          L0: {
            field_y = (nh) null;
            if (this.field_C.b((byte) 88)) {
              stackIn_8_0 = 1;
              break L0;
            } else {
              stackIn_8_0 = 0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_C.b((byte) 88)) {
              stackIn_4_0 = 1;
              break L1;
            } else {
              stackIn_4_0 = 0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void k(int param0) {
        int var3;
        int var10;
        la var11;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        la stackIn_24_0 = null;
        la stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        la stackIn_28_0 = null;
        la stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        mma stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        mma stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_61_0 = 0;
        mma stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        mma stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        mma stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        mma stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        mma stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        mma stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        mma stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        mma stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        mma stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        mma stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        mma stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        mma stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int var4;
        int var5;
        int var6;
        pc var7_ref_pc;
        int var7;
        pc var8;
        int var9;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var11 = this.b(true);
          if (!this.i(12340).g(112)) {
            if (null == this.field_t) {
              break L0;
            } else {
              this.field_t.d(param0 + -5418);
              if (!this.field_t.c(0)) {
                break L0;
              } else {
                L1: {
                  this.field_s = 0;
                  stackIn_6_0 = this;

                  if (this.field_A) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L1;
                  }
                }
                ((wh) (this)).field_A = stackIn_7_1 != 0;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        if (!this.field_C.f((byte) -56)) {
          if (!this.field_A) {
            return;
          } else {
            L2: {
              var3 = this.field_q;
              if (0 == var3) {
                var3 = 268435456;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_n <= 0) {
                this.field_s = var3;
                break L3;
              } else {
                this.field_s = this.field_s + this.field_n;
                if (this.field_s > var3) {
                  this.field_s = var3;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              this.field_x = this.field_g.g(-25787) >> 2092532578;
              this.field_E = hua.a((byte) 102, this.field_x);
              this.field_o = bua.a(0, this.field_x);
              var6 = this.field_g.P(0) << 1223058128;
              if (!this.field_D) {
                L5: {
                  this.q((byte) 92);
                  stackIn_28_0 = (la) (var11);

                  if (this.field_v) {
                    stackIn_29_0 = (la) ((Object) stackIn_28_0);
                    stackIn_29_1 = 3;
                    break L5;
                  } else {
                    stackIn_29_0 = (la) ((Object) stackIn_28_0);
                    stackIn_29_1 = 4;
                    break L5;
                  }
                }
                ((la) (Object) stackIn_29_0).a(stackIn_29_1, this.field_g, -44, this.field_u, this.e(6), this.field_z);
                var4 = this.a(this.field_u, (byte) 72);
                this.q((byte) 92);
                var11.a(1, this.field_g, -91, this.field_u, this.e(6), this.field_z);
                var11.b(false).a((byte) 119, this.field_u, this.field_z);
                var7_ref_pc = this.field_u;
                L6: while (true) {
                  if (var7_ref_pc.field_h == null) {
                    var11.b(false).a(var7_ref_pc, this.field_g, (byte) -119);
                    var5 = this.a(this.field_u, (byte) -65);
                    break L4;
                  } else {
                    var7_ref_pc = var7_ref_pc.field_h;
                    continue L6;
                  }
                }
              } else {
                L7: {
                  this.q((byte) 92);
                  stackIn_24_0 = (la) (var11);

                  if (!this.field_v) {
                    stackIn_25_0 = (la) ((Object) stackIn_24_0);
                    stackIn_25_1 = 4;
                    break L7;
                  } else {
                    stackIn_25_0 = (la) ((Object) stackIn_24_0);
                    stackIn_25_1 = 3;
                    break L7;
                  }
                }
                ((la) (Object) stackIn_25_0).a(stackIn_25_1, this.field_u, this.e(6), (byte) -123);
                var4 = this.a(this.field_u, (byte) -68);
                this.q((byte) 92);
                var11.a(1, this.field_u, this.e(6), (byte) 75);
                var5 = this.a(this.field_u, (byte) 57);
                break L4;
              }
            }
            L8: {
              if (param0 == 5418) {
                break L8;
              } else {
                this.a(false);
                break L8;
              }
            }
            L9: {
              stackIn_37_0 = this;

              if (var5 == var4) {
                stackIn_38_0 = this;
                stackIn_38_1 = 0;
                break L9;
              } else {
                stackIn_38_0 = this;
                stackIn_38_1 = 1;
                break L9;
              }
            }
            L10: {
              ((wh) (this)).field_r = stackIn_38_1 != 0;
              if (!this.field_r) {
                if (this.field_C.b((byte) 83)) {
                  L11: {
                    var7 = 1;
                    if (var7 != 0) {
                      this.field_u.field_j = 9;
                      break L11;
                    } else {
                      this.field_u.field_j = 8;
                      break L11;
                    }
                  }
                  L12: {
                    if (!this.field_D) {
                      var8 = this.field_u;
                      var9 = var6;
                      L13: while (true) {
                        if (var8 == null) {
                          break L12;
                        } else {
                          if (!var8.field_l) {
                            break L12;
                          } else {
                            L14: {
                              if (null != var8.field_h) {
                                break L14;
                              } else {
                                if (!this.field_r) {
                                  var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                                  break L14;
                                } else {
                                  var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                                  break L14;
                                }
                              }
                            }
                            var8 = var8.field_h;
                            continue L13;
                          }
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    stackIn_58_0 = this.field_p;

                    stackIn_58_1 = -978;

                    if (!this.field_r) {
                      stackIn_59_0 = (mma) ((Object) stackIn_58_0);
                      stackIn_59_1 = stackIn_58_1;
                      stackIn_59_2 = 65280;
                      break L15;
                    } else {
                      stackIn_59_0 = (mma) ((Object) stackIn_58_0);
                      stackIn_59_1 = stackIn_58_1;
                      stackIn_59_2 = 16720384;
                      break L15;
                    }
                  }
                  ((mma) (Object) stackIn_59_0).a(stackIn_59_1, stackIn_59_2);
                  this.field_C.a((byte) -14, this.field_r);
                  return;
                } else {
                  stackIn_61_0 = 0;
                  break L10;
                }
              } else {
                stackIn_61_0 = 1;
                break L10;
              }
            }
            var7 = stackIn_61_0;
            if (var7 != 0) {
              this.field_u.field_j = 9;
              if (!this.field_D) {
                var8 = this.field_u;
                var9 = var6;
                L16: while (true) {
                  if (var8 != null) {
                    if (var8.field_l) {
                      L17: {
                        if (null != var8.field_h) {
                          break L17;
                        } else {
                          if (!this.field_r) {
                            var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                            break L17;
                          } else {
                            var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                            break L17;
                          }
                        }
                      }
                      var8 = var8.field_h;
                      continue L16;
                    } else {
                      L18: {
                        stackIn_102_0 = this.field_p;

                        stackIn_102_1 = -978;

                        if (!this.field_r) {
                          stackIn_103_0 = (mma) ((Object) stackIn_102_0);
                          stackIn_103_1 = stackIn_102_1;
                          stackIn_103_2 = 65280;
                          break L18;
                        } else {
                          stackIn_103_0 = (mma) ((Object) stackIn_102_0);
                          stackIn_103_1 = stackIn_102_1;
                          stackIn_103_2 = 16720384;
                          break L18;
                        }
                      }
                      ((mma) (Object) stackIn_103_0).a(stackIn_103_1, stackIn_103_2);
                      this.field_C.a((byte) -14, this.field_r);
                      return;
                    }
                  } else {
                    L19: {
                      stackIn_96_0 = this.field_p;

                      stackIn_96_1 = -978;

                      if (!this.field_r) {
                        stackIn_97_0 = (mma) ((Object) stackIn_96_0);
                        stackIn_97_1 = stackIn_96_1;
                        stackIn_97_2 = 65280;
                        break L19;
                      } else {
                        stackIn_97_0 = (mma) ((Object) stackIn_96_0);
                        stackIn_97_1 = stackIn_96_1;
                        stackIn_97_2 = 16720384;
                        break L19;
                      }
                    }
                    ((mma) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2);
                    this.field_C.a((byte) -14, this.field_r);
                    return;
                  }
                }
              } else {
                L20: {
                  stackIn_89_0 = this.field_p;

                  stackIn_89_1 = -978;

                  if (!this.field_r) {
                    stackIn_90_0 = (mma) ((Object) stackIn_89_0);
                    stackIn_90_1 = stackIn_89_1;
                    stackIn_90_2 = 65280;
                    break L20;
                  } else {
                    stackIn_90_0 = (mma) ((Object) stackIn_89_0);
                    stackIn_90_1 = stackIn_89_1;
                    stackIn_90_2 = 16720384;
                    break L20;
                  }
                }
                ((mma) (Object) stackIn_90_0).a(stackIn_90_1, stackIn_90_2);
                this.field_C.a((byte) -14, this.field_r);
                return;
              }
            } else {
              this.field_u.field_j = 8;
              if (!this.field_D) {
                var8 = this.field_u;
                var9 = var6;
                L21: while (true) {
                  if (var8 != null) {
                    if (var8.field_l) {
                      L22: {
                        if (null != var8.field_h) {
                          break L22;
                        } else {
                          if (!this.field_r) {
                            var11.b(false).a(var8.field_a, (byte) -120, 8, var9, 1, 0, 2, 0, var8.field_e, 2, 4);
                            break L22;
                          } else {
                            var11.b(false).a(var8.field_a, (byte) -117, 9, var9, 1, 0, 4, 0, var8.field_e, 4, 8);
                            break L22;
                          }
                        }
                      }
                      var8 = var8.field_h;
                      continue L21;
                    } else {
                      L23: {
                        stackIn_74_0 = this.field_p;

                        stackIn_74_1 = -978;

                        if (!this.field_r) {
                          stackIn_75_0 = (mma) ((Object) stackIn_74_0);
                          stackIn_75_1 = stackIn_74_1;
                          stackIn_75_2 = 65280;
                          break L23;
                        } else {
                          stackIn_75_0 = (mma) ((Object) stackIn_74_0);
                          stackIn_75_1 = stackIn_74_1;
                          stackIn_75_2 = 16720384;
                          break L23;
                        }
                      }
                      ((mma) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2);
                      this.field_C.a((byte) -14, this.field_r);
                      return;
                    }
                  } else {
                    L24: {
                      stackIn_68_0 = this.field_p;

                      stackIn_68_1 = -978;

                      if (!this.field_r) {
                        stackIn_69_0 = (mma) ((Object) stackIn_68_0);
                        stackIn_69_1 = stackIn_68_1;
                        stackIn_69_2 = 65280;
                        break L24;
                      } else {
                        stackIn_69_0 = (mma) ((Object) stackIn_68_0);
                        stackIn_69_1 = stackIn_68_1;
                        stackIn_69_2 = 16720384;
                        break L24;
                      }
                    }
                    ((mma) (Object) stackIn_69_0).a(stackIn_69_1, stackIn_69_2);
                    this.field_C.a((byte) -14, this.field_r);
                    return;
                  }
                }
              } else {
                L25: {
                  stackIn_84_0 = this.field_p;

                  stackIn_84_1 = -978;

                  if (!this.field_r) {
                    stackIn_85_0 = (mma) ((Object) stackIn_84_0);
                    stackIn_85_1 = stackIn_84_1;
                    stackIn_85_2 = 65280;
                    break L25;
                  } else {
                    stackIn_85_0 = (mma) ((Object) stackIn_84_0);
                    stackIn_85_1 = stackIn_84_1;
                    stackIn_85_2 = 16720384;
                    break L25;
                  }
                }
                ((mma) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_85_2);
                this.field_C.a((byte) -14, this.field_r);
                return;
              }
            }
          }
        } else {
          this.c(false);
          return;
        }
    }

    final int a(int param0, int param1) {
        param0 = upa.a(this.field_r, param0, (byte) -63);
        param0 = upa.a(this.field_A, param0, (byte) -57);
        if (param1 > -48) {
          this.c(-120);
          param0 = fs.a((byte) 61, param0, this.field_s);
          return param0;
        } else {
          param0 = fs.a((byte) 61, param0, this.field_s);
          return param0;
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return 56;
        }
        return 16711782;
    }

    private final int a(pc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -6 / ((param1 - -5) / 38);
              stackIn_2_0 = ua.a(param0.field_e - param0.field_d, -106);

              stackIn_2_1 = -ua.a(-param0.field_k + param0.field_a, 21);

              if (param0.field_h == null) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = this.a(param0.field_h, (byte) -81);
                break L1;
              }
            }
            stackIn_4_0 = stackIn_3_0 - (stackIn_3_1 - stackIn_3_2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wh.P(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    wh(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = new pc();
        this.field_s = 0;
        try {
            this.field_C = new jma(15);
            this.field_t = new mg();
            this.field_n = 0;
            this.field_q = 16777216;
            this.field_v = true;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        if (param1 != 636) {
            this.field_u = (pc) null;
            this.field_q = param0;
            return;
        }
        this.field_q = param0;
    }

    final void a(byte param0, mg param1) {
        try {
            if (param0 != -8) {
                this.a(true);
            }
            this.field_t = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_C.a(this.h((byte) 118), (byte) 113, param1);
            this.field_t.a(15637, param1);
            param1.a((byte) -125, this.field_q >> 1323616912, 10);
            param1.a((byte) -127, !this.field_v ? 0 : 1, 1);
            param1.a((byte) 110, !this.field_D ? 0 : 1, 1);
            param1.a((byte) -125, this.field_n >> 1892052496, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean p(byte param0) {
        int discarded$0 = 0;
        if (param0 != 120) {
            pc var3 = (pc) null;
            discarded$0 = this.a((pc) null, (byte) 1);
            return false;
        }
        return false;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            this.field_p = new mma(0, 16777215, this.field_u, param1.P(0));
            if (!param0) {
                this.field_u = (pc) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        int var2 = -89 % ((param0 - -46) / 45);
        return 1;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            this.field_D = true;
            return 5570594;
        }
        return 5570594;
    }

    private final void q(byte param0) {
        int var2;
        int var3;
        var2 = this.field_g.d(3) - -gqa.a(this.field_E, (byte) 24, this.field_g.c(-31) / 2);
        var3 = this.field_g.e(param0 + 9556) - -gqa.a(this.field_o, (byte) 24, this.field_g.c(-64) / 2);
        this.field_u.a(var2, var2 + gqa.a(this.field_E, (byte) 24, this.field_s), var3, gqa.a(this.field_o, (byte) 24, this.field_s) + var3, 44);
        this.field_u.field_b = this.field_s;
        this.field_u.field_i = this.field_g.P(param0 ^ 92) << -1398774928;
        if (param0 != 92) {
          this.field_o = 58;
          return;
        } else {
          return;
        }
    }

    public static void l(int param0) {
        field_w = (String[][]) null;
        field_y = null;
        if (param0 >= -116) {
            field_w = (String[][]) null;
        }
    }

    wh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_u = new pc();
        this.field_s = 0;
        try {
            this.field_C = new jma(15, param0, param1);
            this.field_t = new mg(param0.field_E, param1);
            this.field_q = param1.b((byte) 44, 10) << 1684595792;
            this.field_v = (param1.b((byte) 44, 1) ^ -1) == -2 ? true : false;
            this.field_D = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
            this.field_n = param1.b((byte) 44, 8) << -697012272;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
