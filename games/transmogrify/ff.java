/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends aj implements fb, df {
    static String field_C;
    static String field_x;
    static ti field_z;
    private boolean field_E;
    private lj field_J;
    private lj field_w;
    private rg field_G;
    static int[] field_H;
    private boolean field_y;
    private rg field_L;
    private boolean field_K;
    private lj field_A;
    private String field_B;
    static hj field_D;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != this.field_A) {
                if (param0 == this.field_J) {
                  hg.c(0);
                  break L1;
                } else {
                  if (this.field_w == param0) {
                    if (!this.field_K) {
                      if (this.field_E) {
                        kc.a((byte) -128);
                        break L1;
                      } else {
                        qa.b(param1 + -13);
                        break L1;
                      }
                    } else {
                      gb.a((byte) 81);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                this.d((byte) -123);
                break L1;
              }
            }
            L2: {
              if (param1 == 17) {
                break L2;
              } else {
                this.field_A = (lj) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("ff.MA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, rg param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_L == param1) {
                this.field_G.a((qg) (this), param0 + -1421);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 1330) {
              L2: {
                if (param1 == this.field_G) {
                  this.d((byte) -123);
                  break L2;
                } else {
                  break L2;
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
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ff.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        L0: {
          L1: {
            if (bg.g(-43)) {
              break L1;
            } else {
              if (-1 <= (this.field_L.field_k.length() ^ -1)) {
                break L0;
              } else {
                if (this.field_G.field_k.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          hd.a(this.field_G.field_k, this.field_L.field_k, -4776);
          break L0;
        }
        L2: {
          if (param0 == -123) {
            break L2;
          } else {
            field_D = (hj) null;
            break L2;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (!(null == this.field_B)) {
            vd.field_h.a(this.field_B, 20 + (this.field_p + param0), 15 + (this.field_n + param1), -40 + this.field_l, this.field_h, 16777215, -1, 1, 0, vd.field_h.field_y);
        }
        int var5 = -124 / ((param3 - 77) / 34);
        if (this.field_J != null) {
            sb.d(10 + param0, param1 - -134, this.field_l - 20, 4210752);
        }
        super.a(param0, param1, param2, (byte) 119);
    }

    ff(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ui) null);
        oc dupTemp$0 = null;
        oc dupTemp$1 = null;
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
        lj stackIn_18_1 = null;
        lj stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        lj stackIn_19_1 = null;
        lj stackIn_19_2 = null;
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
        qa var6 = null;
        RuntimeException var6_ref = null;
        kg var7 = null;
        String var8 = null;
        kh var9 = null;
        oc var12 = null;
        oc var13 = null;
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
              ((ff) (this)).field_y = stackIn_4_1 != 0;
              this.field_B = param1;
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
              ((ff) (this)).field_E = stackIn_7_1 != 0;
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
              ((ff) (this)).field_K = stackIn_10_1 != 0;
              if (!this.field_K) {
                break L4;
              } else {
                L5: {
                  if (this.field_y) {
                    break L5;
                  } else {
                    if (!this.field_E) {
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
              this.field_L = (rg) ((Object) new vc(param0, (ma) (this), 100));
              this.field_G = (rg) ((Object) new vc("", (ma) (this), 20));
              if (!this.field_K) {
                L7: {
                  this.field_A = new lj(da.field_B, (ma) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (this.field_E) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = gl.field_z;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = te.field_f;
                    break L7;
                  }
                }
                ((ff) (this)).field_w = new lj(stackIn_19_3, (ma) null);
                if (!this.field_y) {
                  break L6;
                } else {
                  this.field_J = new lj(je.field_c, (ma) (this));
                  break L6;
                }
              } else {
                this.field_A = new lj(rc.field_b, (ma) null);
                this.field_w = new lj(ta.field_b, (ma) null);
                this.field_L.field_t = false;
                break L6;
              }
            }
            L8: {
              this.field_L.field_q = (ui) ((Object) new ni(10000536));
              this.field_G.field_q = (ui) ((Object) new nc(10000536));
              var6 = new qa();
              this.field_A.field_q = (ui) ((Object) var6);
              if (null == this.field_w) {
                break L8;
              } else {
                this.field_w.field_q = (ui) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_L.field_j = fc.field_e;
              if (this.field_J == null) {
                break L9;
              } else {
                this.field_J.field_q = (ui) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_J) {
                break L10;
              } else {
                this.field_J.field_j = uf.field_b;
                break L10;
              }
            }
            L11: {
              if (!this.field_K) {
                if (!this.field_E) {
                  this.field_w.field_q = (ui) ((Object) new ek());
                  break L11;
                } else {
                  this.field_w.field_j = pa.field_a;
                  this.field_w.field_q = (ui) ((Object) new ek());
                  break L11;
                }
              } else {
                this.field_w.field_j = je.field_a;
                break L11;
              }
            }
            L12: {
              this.field_n = 15;
              var7 = vd.field_h;
              if (this.field_B == null) {
                break L12;
              } else {
                this.field_n = this.field_n + (var7.a(this.field_B, this.field_l - 40, var7.field_y) + 5);
                break L12;
              }
            }
            L13: {
              var8 = e.field_q;
              var9 = ga.a(125, ha.b(81));
              if (aa.field_d == var9) {
                var8 = pf.field_c;
                break L13;
              } else {
                if (of.field_f != var9) {
                  break L13;
                } else {
                  var8 = te.field_b;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new oc(10, this.field_n, this.field_l - 20, 25, this.field_L, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a((qg) (dupTemp$0), (byte) -83);
              this.field_n = this.field_n + (((qg) ((Object) var12)).field_h + 5);
              dupTemp$1 = new oc(10, this.field_n, this.field_l + -20, 25, this.field_G, false, 80, 3, var7, 16777215, ee.field_y);
              var13 = dupTemp$1;
              this.a((qg) (dupTemp$1), (byte) -84);
              this.field_n = this.field_n + (((qg) ((Object) var13)).field_h + 5);
              this.field_A.field_m = (ma) (this);
              if (null == this.field_J) {
                break L14;
              } else {
                this.field_J.field_m = (ma) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_w == null) {
                break L15;
              } else {
                this.field_w.field_m = (ma) (this);
                break L15;
              }
            }
            L16: {
              if (null != this.field_J) {
                this.field_A.a(-116, this.field_n, 85, this.field_l - 95, 30);
                this.field_n = this.field_n + 60;
                break L16;
              } else {
                this.field_A.a(-102, this.field_n, 8, -6 + this.field_l + -10, 30);
                this.field_n = this.field_n + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_J) {
                break L17;
              } else {
                this.field_J.a(92, this.field_n, 8, -16 + this.field_l, 30);
                this.field_n = this.field_n + 35;
                break L17;
              }
            }
            L18: {
              if (null == this.field_w) {
                break L18;
              } else {
                L19: {
                  if (this.field_K) {
                    break L19;
                  } else {
                    if (this.field_E) {
                      break L19;
                    } else {
                      this.field_w.a(58, this.field_n, 8, 40, 20);
                      this.field_n = this.field_n + 25;
                      break L18;
                    }
                  }
                }
                this.field_w.a(113, this.field_n, 8, -6 + this.field_l - 10, 30);
                this.field_n = this.field_n + 35;
                break L18;
              }
            }
            L20: {
              this.a(26, 0, 0, this.field_l, this.field_n + 3);
              this.a((qg) (this.field_A), (byte) -104);
              if (this.field_J == null) {
                break L20;
              } else {
                this.a((qg) (this.field_J), (byte) -96);
                break L20;
              }
            }
            L21: {
              if (this.field_w == null) {
                break L21;
              } else {
                this.a((qg) (this.field_w), (byte) -81);
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

            stackIn_59_1 = new StringBuilder().append("ff.<init>(");

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
          throw ch.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(pl param0, boolean param1, int param2, int param3, byte param4) {
        if (param4 < 0) {
            return;
        }
        try {
            jj.field_a.a(param3, !param1 ? true : false, param2, 1000000, param0, 100);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ff.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1) {
        rg var3 = null;
        String var4 = null;
        try {
            if (param1 != 30) {
                ff.m(-73);
            }
            var3 = this.field_L;
            var4 = param0;
            var3.a(var4, false, param1 + -29);
            this.field_G.i(81);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ff.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 123, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param0 ^ -1)) {
                var5_int = 39 % ((param2 - 65) / 55);
                if (99 != param0) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b(param1, 108);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(2, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ff.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    public static void m(int param0) {
        field_D = null;
        if (param0 <= 119) {
            field_x = (String) null;
        }
        field_H = null;
        field_C = null;
        field_x = null;
        field_z = null;
    }

    public final void a(rg param0, int param1) {
        try {
            if (param1 >= -55) {
                this.field_K = false;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ff.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String e(byte param0) {
        int var2;
        var2 = -69 / ((-53 - param0) / 57);
        if (null == this.field_L.field_k) {
          return "";
        } else {
          return this.field_L.field_k;
        }
    }

    final void l(int param0) {
        this.field_L.i(81);
        this.field_G.i(param0 ^ -31940);
        if (param0 != -31891) {
            field_z = (ti) null;
        }
    }

    final static void a(byte param0) {
        int var1 = -124 / ((param0 - -63) / 57);
        String var2 = (String) null;
        ec.a(hf.field_g, -126, (String) null);
    }

    static {
        field_C = "Names can only contain letters, numbers, spaces and underscores";
        field_H = new int[]{7059175, 8189570, 16770707, 16536152};
        field_x = "Not yet achieved";
    }
}
