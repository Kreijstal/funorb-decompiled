/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ii implements jo, vg {
    static String[] field_N;
    private boolean field_X;
    private boolean field_P;
    private ck field_K;
    static String field_T;
    private boolean field_M;
    static String field_W;
    private rm field_O;
    static long field_Q;
    static String field_L;
    private ck field_U;
    private String field_S;
    private ck field_V;
    private rm field_R;

    final void i(int param0) {
        this.field_O.p(72);
        this.field_R.p(50);
        if (param0 != 22377) {
            dn.b(true);
        }
    }

    final void a(int param0, String param1) {
        rm var3 = null;
        String var4 = null;
        if (param0 != -12349) {
            return;
        }
        try {
            var3 = this.field_O;
            var4 = param1;
            var3.a(var4, false, (byte) 64);
            this.field_R.p(param0 + 12457);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "dn.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 == 98) {
              L1: {
                if (this.field_U != param0) {
                  if (this.field_V != param0) {
                    if (this.field_K == param0) {
                      if (this.field_X) {
                        wk.a(-1);
                        break L1;
                      } else {
                        if (!this.field_M) {
                          ue.a(param1 + -178);
                          break L1;
                        } else {
                          li.c(param1 + 218);
                          break L1;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    nh.c(true);
                    break L1;
                  }
                } else {
                  this.j(-24327);
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("dn.FA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String a(int param0) {
        if (param0 != -16) {
            return (String) null;
        }
        if (!(this.field_O.field_w != null)) {
            return "";
        }
        return this.field_O.field_w;
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 55) {
                break L1;
              } else {
                this.a(-70);
                break L1;
              }
            }
            if (super.a(param0, param1, param2, (byte) 61)) {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 == 98) {
                stackIn_9_0 = this.a(param0, (byte) 71);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 != (param2 ^ -1)) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_12_0 = this.a((byte) -5, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("dn.W(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    public final void a(rm param0, byte param1) {
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
              if (param0 == this.field_O) {
                this.field_R.a(34, (lm) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_R != param0) {
                break L2;
              } else {
                this.j(-24327);
                break L2;
              }
            }
            L3: {
              if (param1 < -117) {
                break L3;
              } else {
                this.field_O = (rm) null;
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

            stackIn_10_1 = new StringBuilder().append("dn.L(");

            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static void b(boolean param0) {
        if (!tl.field_l) {
            throw new IllegalStateException();
        }
        oj.field_b = true;
        t.a(param0, 0);
        kh.field_n = 0;
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        un var5 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 48) {
                break L1;
              } else {
                var4 = (Object) null;
                dn.a((Object) null, true, (byte) 79);
                break L1;
              }
            }
            if (param0 != null) {
              if (!(param0 instanceof byte[])) {
                if (!(param0 instanceof un)) {
                  throw new IllegalArgumentException();
                } else {
                  var5 = (un) (param0);
                  stackIn_13_0 = var5.b((byte) 60);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                var3 = (byte[]) (param0);
                if (!param1) {
                  stackIn_10_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = gg.a((byte) -92, var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("dn.G(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final void j(int param0) {
        if (param0 != -24327) {
          return;
        } else {
          L0: {
            L1: {
              if (n.a((byte) 118)) {
                break L1;
              } else {
                if ((this.field_O.field_w.length() ^ -1) >= -1) {
                  break L0;
                } else {
                  if (this.field_R.field_w.length() > 0) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
            ck.a(this.field_R.field_w, 11, this.field_O.field_w);
            break L0;
          }
          return;
        }
    }

    public static void f(byte param0) {
        field_L = null;
        int var1 = -53 % ((param0 - -56) / 38);
        field_W = null;
        field_N = null;
        field_T = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(this.field_S == null)) {
            lp.field_C.a(this.field_S, 20 + this.field_q + param1, param3 + this.field_v + 15, -40 + this.field_x, this.field_s, 16777215, -1, 1, 0, lp.field_C.field_H);
        }
        if (!(null == this.field_V)) {
            gf.b(10 + param1, param3 - -134, this.field_x - 20, 4210752);
        }
        super.a(param0, param1, param2 ^ param2, param3);
    }

    dn(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ca) null);
        dg dupTemp$0 = null;
        dg dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        ck stackIn_18_1 = null;
        ck stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ck stackIn_19_1 = null;
        ck stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        na var6 = null;
        RuntimeException var6_ref = null;
        se var7 = null;
        String var8 = null;
        ba var9 = null;
        dg var12 = null;
        dg var13 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param4) {
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
              ((dn) (this)).field_M = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param2) {
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
              ((dn) (this)).field_X = stackIn_7_1 != 0;
              this.field_S = param1;
              stackIn_9_0 = this;

              if (!param3) {
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
              ((dn) (this)).field_P = stackIn_10_1 != 0;
              if (!this.field_X) {
                break L4;
              } else {
                L5: {
                  if (this.field_P) {
                    break L5;
                  } else {
                    if (!this.field_M) {
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
              this.field_O = (rm) ((Object) new uh(param0, (pg) (this), 100));
              this.field_R = (rm) ((Object) new uh("", (pg) (this), 20));
              if (!this.field_X) {
                L7: {
                  this.field_U = new ck(uo.field_e, (pg) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (!this.field_M) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = gk.field_O;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = kd.field_b;
                    break L7;
                  }
                }
                ((dn) (this)).field_K = new ck(stackIn_19_3, (pg) null);
                if (!this.field_P) {
                  break L6;
                } else {
                  this.field_V = new ck(qp.field_c, (pg) (this));
                  break L6;
                }
              } else {
                this.field_U = new ck(kn.field_a, (pg) null);
                this.field_K = new ck(db.field_u, (pg) null);
                this.field_O.field_B = false;
                break L6;
              }
            }
            L8: {
              this.field_O.field_o = (ca) ((Object) new mc(10000536));
              this.field_R.field_o = (ca) ((Object) new ic(10000536));
              var6 = new na();
              this.field_U.field_o = (ca) ((Object) var6);
              if (null == this.field_K) {
                break L8;
              } else {
                this.field_K.field_o = (ca) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (null == this.field_V) {
                break L9;
              } else {
                this.field_V.field_o = (ca) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_O.field_i = rj.field_y;
              if (this.field_V == null) {
                break L10;
              } else {
                this.field_V.field_i = hj.field_U;
                break L10;
              }
            }
            L11: {
              if (!this.field_X) {
                if (this.field_M) {
                  this.field_K.field_i = oh.field_n;
                  this.field_K.field_o = (ca) ((Object) new oa());
                  break L11;
                } else {
                  this.field_K.field_o = (ca) ((Object) new oa());
                  break L11;
                }
              } else {
                this.field_K.field_i = gd.field_D;
                break L11;
              }
            }
            L12: {
              this.field_v = 15;
              var7 = lp.field_C;
              if (this.field_S == null) {
                break L12;
              } else {
                this.field_v = this.field_v + (5 + var7.a(this.field_S, -40 + this.field_x, var7.field_H));
                break L12;
              }
            }
            L13: {
              var8 = cp.field_T;
              var9 = gb.a(m.c(true), -119);
              if (ba.field_e == var9) {
                var8 = me.field_e;
                break L13;
              } else {
                if (var9 != gg.field_c) {
                  break L13;
                } else {
                  var8 = hf.field_ub;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new dg(10, this.field_v, -20 + this.field_x, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b((byte) -54, dupTemp$0);
              this.field_v = this.field_v + (((lm) ((Object) var12)).field_s - -5);
              dupTemp$1 = new dg(10, this.field_v, -20 + this.field_x, 25, this.field_R, false, 80, 3, var7, 16777215, fk.field_r);
              var13 = dupTemp$1;
              this.b((byte) -54, dupTemp$1);
              this.field_U.field_n = (pg) (this);
              this.field_v = this.field_v + (((lm) ((Object) var13)).field_s + 5);
              if (null == this.field_V) {
                break L14;
              } else {
                this.field_V.field_n = (pg) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_K == null) {
                break L15;
              } else {
                this.field_K.field_n = (pg) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_V != null) {
                this.field_U.b(0, -95 + this.field_x, this.field_v, 85, 30);
                this.field_v = this.field_v + 60;
                break L16;
              } else {
                this.field_U.b(0, this.field_x + -16, this.field_v, 8, 30);
                this.field_v = this.field_v + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_V) {
                break L17;
              } else {
                this.field_V.b(0, this.field_x - 6 + -10, this.field_v, 8, 30);
                this.field_v = this.field_v + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_K == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_X) {
                    break L19;
                  } else {
                    if (!this.field_M) {
                      this.field_K.b(0, 40, this.field_v, 8, 20);
                      this.field_v = this.field_v + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_K.b(0, this.field_x + -6 + -10, this.field_v, 8, 30);
                this.field_v = this.field_v + 35;
                break L18;
              }
            }
            L20: {
              this.b(0, this.field_x, 0, 0, this.field_v + 3);
              this.b((byte) -55, this.field_U);
              if (null == this.field_V) {
                break L20;
              } else {
                this.b((byte) -128, this.field_V);
                break L20;
              }
            }
            L21: {
              if (this.field_K == null) {
                break L21;
              } else {
                this.b((byte) -104, this.field_K);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("dn.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(rm param0, int param1) {
        try {
            if (param1 != 10000536) {
                rm var4 = (rm) null;
                this.a((rm) null, (byte) 51);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "dn.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_N = new String[]{"Fire Immunity", "Immune to dragonfire."};
        field_W = "Goblin Scout";
        field_T = "MEMBERS ONLY";
        field_L = "<col=2E5D17>Advance</col>";
    }
}
