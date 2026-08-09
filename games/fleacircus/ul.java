/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends gj implements nk, da {
    private boolean field_K;
    private bb field_N;
    static String field_F;
    private boolean field_P;
    private bb field_I;
    private boolean field_M;
    private String field_O;
    private c field_H;
    private bb field_L;
    private c field_J;
    static pl field_G;

    final String j(int param0) {
        if (!(this.field_H.field_i != null)) {
            return "";
        }
        if (param0 != -1) {
            return (String) null;
        }
        return this.field_H.field_i;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (null != this.field_O) {
            ug.field_e.a(this.field_O, 20 + this.field_y + param1, 15 + this.field_z + param0, -40 + this.field_u, this.field_j, 16777215, -1, 1, 0, ug.field_e.field_H);
        }
        if (!(this.field_N == null)) {
            gb.b(param1 + 10, param0 + 134, this.field_u + -20, 4210752);
        }
        super.b(param0, param1, param2, param3);
    }

    private final void e(byte param0) {
        L0: {
          L1: {
            if (o.c((byte) 39)) {
              break L1;
            } else {
              if ((this.field_H.field_i.length() ^ -1) >= -1) {
                break L0;
              } else {
                if (0 >= this.field_J.field_i.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          pc.a(false, this.field_H.field_i, this.field_J.field_i);
          break L0;
        }
        L2: {
          if (param0 == -32) {
            break L2;
          } else {
            this.field_P = false;
            break L2;
          }
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param1 ^ -1)) {
                stackIn_7_0 = this.b(param2, -28533);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_11_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ul.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public final void a(int param0, c param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == this.field_H) {
                this.field_J.a((qa) (this), -123);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_J != param1) {
                break L2;
              } else {
                this.e((byte) -32);
                break L2;
              }
            }
            L3: {
              if (param0 == -31825) {
                break L3;
              } else {
                this.field_N = (bb) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ul.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          nf.field_K = (param1 & 48) >> 1801709604;
          if ((nf.field_K ^ -1) >= -3) {
            break L0;
          } else {
            nf.field_K = 2;
            break L0;
          }
        }
        if (param0 != 18398) {
          return;
        } else {
          L1: {
            fk.field_C = (param1 & 13) >> 484175330;
            oj.field_k = param1 & 3;
            if (2 >= fk.field_C) {
              break L1;
            } else {
              fk.field_C = 2;
              break L1;
            }
          }
          L2: {
            if ((oj.field_k ^ -1) >= -3) {
              break L2;
            } else {
              oj.field_k = 2;
              break L2;
            }
          }
          return;
        }
    }

    public final void b(int param0, c param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 40) {
                break L1;
              } else {
                this.field_M = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ul.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void c(boolean param0) {
        kb var2;
        int var3;
        int var4;
        int var5;
        fa var6;
        fa var7;
        var5 = fleas.field_A ? 1 : 0;
        var6 = tl.field_p;
        var7 = var6;
        if (!param0) {
          return;
        } else {
          L0: {
            var2 = (kb) ((Object) pb.field_f.c((byte) 47));
            if (var2 != null) {
              L1: {
                L2: {
                  var4 = hi.field_q;
                  if ((var4 ^ -1) <= -81) {
                    break L2;
                  } else {
                    var3 = var4 / 2 + -32;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((var4 ^ -1) <= -231) {
                    break L3;
                  } else {
                    var3 = 8;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = 123 - var4 / 2;
                break L1;
              }
              gb.g(0, -4 + var3, var6.b(wa.field_f[var2.field_q]) + 64, 40, 16755200, 128);
              gb.e(0, var3 + -4, var6.b(wa.field_f[var2.field_q]) + 64, 40, 16746496, 128);
              il.field_d[var2.field_q].c(8, var3);
              var6.c(wa.field_f[var2.field_q], 48, var3 + var7.field_H, 0, -1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void k(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != 16777215) {
            ul.k(-9);
        }
    }

    final void a(byte param0, String param1) {
        c var3 = null;
        String var4 = null;
        try {
            var3 = this.field_H;
            var4 = param1;
            if (param0 > -100) {
                this.field_P = false;
            }
            var3.a(false, (byte) -127, var4);
            this.field_J.r(32);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ul.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param3 == 248) {
              L1: {
                L2: {
                  if (this.field_I != param4) {
                    break L2;
                  } else {
                    this.e((byte) -32);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (this.field_N != param4) {
                    break L3;
                  } else {
                    oh.d(false);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_L != param4) {
                  break L1;
                } else {
                  L4: {
                    if (!this.field_P) {
                      break L4;
                    } else {
                      vi.c((byte) -124);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (this.field_K) {
                      break L5;
                    } else {
                      td.g(param3 ^ 252);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ej.a(param3 ^ 232);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6);

            stackIn_20_1 = new StringBuilder().append("ul.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        this.field_H.r(32);
        int var2 = 38 / ((29 - param0) / 45);
        this.field_J.r(32);
    }

    ul(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ch) null);
        ml dupTemp$0 = null;
        ml dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        bb stackIn_17_1 = null;
        bb stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        bb stackIn_18_1 = null;
        bb stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        ri var6 = null;
        RuntimeException var6_ref = null;
        fa var7 = null;
        String var8 = null;
        wh var9 = null;
        int var11 = 0;
        ml var12 = null;
        ml var13 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param3) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ul) (this)).field_M = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param4) {
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
              ((ul) (this)).field_K = stackIn_7_1 != 0;
              this.field_O = param1;
              stackIn_9_0 = this;

              if (!param2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((ul) (this)).field_P = stackIn_10_1 != 0;
              if (!this.field_P) {
                break L4;
              } else {
                L5: {
                  if (this.field_M) {
                    break L5;
                  } else {
                    if (!this.field_K) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              L7: {
                this.field_H = (c) ((Object) new bc(param0, (kd) (this), 100));
                this.field_J = (c) ((Object) new bc("", (kd) (this), 20));
                if (this.field_P) {
                  break L7;
                } else {
                  L8: {
                    this.field_I = new bb(wi.field_h, (kd) null);
                    stackIn_17_0 = this;

                    stackIn_17_1 = null;

                    stackIn_17_2 = null;

                    if (!this.field_K) {
                      stackIn_18_0 = this;
                      stackIn_18_1 = null;
                      stackIn_18_2 = null;
                      stackIn_18_3 = mi.field_k;
                      break L8;
                    } else {
                      stackIn_18_0 = this;
                      stackIn_18_1 = null;
                      stackIn_18_2 = null;
                      stackIn_18_3 = tc.field_g;
                      break L8;
                    }
                  }
                  ((ul) (this)).field_L = new bb(stackIn_18_3, (kd) null);
                  if (!this.field_M) {
                    break L6;
                  } else {
                    this.field_N = new bb(qk.field_h, (kd) (this));
                    if (var11 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_I = new bb(uh.field_o, (kd) null);
              this.field_L = new bb(vk.field_K, (kd) null);
              this.field_H.field_D = false;
              break L6;
            }
            L9: {
              this.field_H.field_p = (ch) ((Object) new aa(10000536));
              this.field_J.field_p = (ch) ((Object) new mh(10000536));
              var6 = new ri();
              this.field_I.field_p = (ch) ((Object) var6);
              if (this.field_L == null) {
                break L9;
              } else {
                this.field_L.field_p = (ch) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_H.field_m = uf.field_l;
              if (this.field_N == null) {
                break L10;
              } else {
                this.field_N.field_p = (ch) ((Object) var6);
                break L10;
              }
            }
            L11: {
              if (this.field_N == null) {
                break L11;
              } else {
                this.field_N.field_m = se.field_f;
                break L11;
              }
            }
            L12: {
              L13: {
                if (!this.field_P) {
                  break L13;
                } else {
                  this.field_L.field_m = db.field_F;
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (this.field_K) {
                  break L14;
                } else {
                  this.field_L.field_p = (ch) ((Object) new me());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              this.field_L.field_m = ga.field_n;
              this.field_L.field_p = (ch) ((Object) new me());
              break L12;
            }
            L15: {
              this.field_z = 15;
              var7 = ug.field_e;
              if (this.field_O == null) {
                break L15;
              } else {
                this.field_z = this.field_z + (var7.b(this.field_O, this.field_u + -40, var7.field_H) + 5);
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = se.field_e;
                var9 = hd.a(true, rl.a((byte) -107));
                if (ml.field_F != var9) {
                  break L17;
                } else {
                  var8 = ck.field_q;
                  if (var11 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (wd.field_b != var9) {
                break L16;
              } else {
                var8 = l.field_a;
                break L16;
              }
            }
            L18: {
              dupTemp$0 = new ml(10, this.field_z, this.field_u + -20, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a((qa) (dupTemp$0), (byte) -61);
              this.field_z = this.field_z + (5 + ((qa) ((Object) var12)).field_j);
              dupTemp$1 = new ml(10, this.field_z, this.field_u - 20, 25, this.field_J, false, 80, 3, var7, 16777215, kc.field_g);
              var13 = dupTemp$1;
              this.a((qa) (dupTemp$1), (byte) -118);
              this.field_I.field_s = (kd) (this);
              this.field_z = this.field_z + (((qa) ((Object) var13)).field_j - -5);
              if (null == this.field_N) {
                break L18;
              } else {
                this.field_N.field_s = (kd) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_L) {
                break L19;
              } else {
                this.field_L.field_s = (kd) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (null == this.field_N) {
                  break L21;
                } else {
                  this.field_I.a(85, -95 + this.field_u, this.field_z, 30, 80);
                  this.field_z = this.field_z + 60;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_I.a(8, -6 + this.field_u + -10, this.field_z, 30, 80);
              this.field_z = this.field_z + 35;
              break L20;
            }
            L22: {
              if (null == this.field_N) {
                break L22;
              } else {
                this.field_N.a(8, -6 + this.field_u - 10, this.field_z, 30, 80);
                this.field_z = this.field_z + 35;
                break L22;
              }
            }
            L23: {
              if (this.field_L == null) {
                break L23;
              } else {
                L24: {
                  if (this.field_P) {
                    break L24;
                  } else {
                    if (this.field_K) {
                      break L24;
                    } else {
                      this.field_L.a(8, 40, this.field_z, 20, 80);
                      this.field_z = this.field_z + 25;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                this.field_L.a(8, -6 + this.field_u + -10, this.field_z, 30, 80);
                this.field_z = this.field_z + 35;
                break L23;
              }
            }
            L25: {
              this.a(0, this.field_u, 0, this.field_z + 3, 80);
              this.a((qa) (this.field_I), (byte) -76);
              if (null == this.field_N) {
                break L25;
              } else {
                this.a((qa) (this.field_N), (byte) -42);
                break L25;
              }
            }
            L26: {
              if (null == this.field_L) {
                break L26;
              } else {
                this.a((qa) (this.field_L), (byte) -33);
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("ul.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L27;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L28;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L28;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
