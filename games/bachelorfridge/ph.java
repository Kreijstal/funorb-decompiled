/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends vd implements fca, lja {
    private hf field_K;
    private hf field_M;
    private boolean field_I;
    private lka field_Q;
    private String field_L;
    static int field_E;
    private boolean field_J;
    private lka field_H;
    private hf field_O;
    static int field_G;
    static int field_D;
    private boolean field_F;
    static String field_N;
    static long field_P;
    static kv field_C;

    public final void a(lka param0, byte param1) {
        try {
            int var3_int = 85 % ((0 - param1) / 49);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ph.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        L0: {
          L1: {
            if (ch.b(68)) {
              break L1;
            } else {
              if ((this.field_Q.field_w.length() ^ -1) >= -1) {
                break L0;
              } else {
                if (this.field_H.field_w.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          g.a(this.field_H.field_w, this.field_Q.field_w, (byte) 81);
          break L0;
        }
        L2: {
          if (param0 <= -2) {
            break L2;
          } else {
            this.k(78);
            break L2;
          }
        }
    }

    final void b(boolean param0) {
        this.field_Q.j((byte) -108);
        this.field_H.j((byte) -69);
        if (param0) {
            field_E = -85;
        }
    }

    public final void a(lka param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_Q) {
                break L1;
              } else {
                discarded$2 = this.field_H.a((wj) (this), -83);
                break L1;
              }
            }
            L2: {
              if (this.field_H == param0) {
                this.k(-118);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 0) {
                break L3;
              } else {
                field_P = -122L;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ph.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        int var5 = -90 % ((param0 - -20) / 54);
        if (this.field_L != null) {
            discarded$0 = jca.field_a.a(this.field_L, this.field_s + param3 - -20, 15 + (param1 - -this.field_v), this.field_p + -40, this.field_q, 16777215, -1, 1, 0, jca.field_a.field_u);
        }
        if (null != this.field_O) {
            dg.e(param3 + 10, param1 + 134, this.field_p + -20, 4210752);
        }
        super.a((byte) -102, param1, param2, param3);
    }

    final String a(int param0) {
        if (!(null != this.field_Q.field_w)) {
            return "";
        }
        if (param0 != 1) {
            lka var3 = (lka) null;
            this.a((lka) null, (byte) 127);
        }
        return this.field_Q.field_w;
    }

    public static void j(int param0) {
        field_C = null;
        if (param0 != 31826) {
            field_C = (kv) null;
        }
        field_N = null;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (this.field_M != param1) {
                if (param1 == this.field_O) {
                  qfa.f(-27);
                  break L1;
                } else {
                  if (param1 != this.field_K) {
                    break L1;
                  } else {
                    if (!this.field_J) {
                      if (!this.field_F) {
                        f.a((byte) 101);
                        break L1;
                      } else {
                        jja.d((byte) 70);
                        break L1;
                      }
                    } else {
                      ola.b((byte) -67);
                      break L1;
                    }
                  }
                }
              } else {
                this.k(-94);
                break L1;
              }
            }
            L2: {
              if (param3 >= 50) {
                break L2;
              } else {
                ph.j(13);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("ph.AA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != 98) {
                if ((param1 ^ -1) == -100) {
                  stackOut_9_0 = this.b(param3, 1);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.a(-126, param3);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("ph.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    ph(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (qda) null);
        ge dupTemp$2 = null;
        ge dupTemp$3 = null;
        RuntimeException var6 = null;
        ff var6_ref = null;
        po var7 = null;
        String var8 = null;
        hk var9 = null;
        ge var12 = null;
        ge var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        hf stackIn_16_1 = null;
        hf stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hf stackIn_17_1 = null;
        hf stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hf stackIn_18_1 = null;
        hf stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        hf stackOut_15_1 = null;
        hf stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        hf stackOut_17_1 = null;
        hf stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        hf stackOut_16_1 = null;
        hf stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ph) (this)).field_I = stackIn_4_1 != 0;
              this.field_L = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
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
              ((ph) (this)).field_J = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ph) (this)).field_F = stackIn_10_1 != 0;
              if (!this.field_J) {
                break L4;
              } else {
                L5: {
                  if (this.field_I) {
                    break L5;
                  } else {
                    if (!this.field_F) {
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
              this.field_Q = (lka) ((Object) new vn(param0, (pl) (this), 100));
              this.field_H = (lka) ((Object) new vn("", (pl) (this), 20));
              if (this.field_J) {
                this.field_M = new hf(bga.field_k, (pl) null);
                this.field_K = new hf(uda.field_ab, (pl) null);
                this.field_Q.field_z = false;
                break L6;
              } else {
                L7: {
                  this.field_M = new hf(tq.field_n, (pl) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (this.field_F) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = tja.field_b;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = ina.field_s;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((ph) (this)).field_K = new hf(stackIn_18_3, (pl) null);
                if (!this.field_I) {
                  break L6;
                } else {
                  this.field_O = new hf(sca.field_b, (pl) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_Q.field_f = (qda) ((Object) new oka(10000536));
              this.field_H.field_f = (qda) ((Object) new cm(10000536));
              var6_ref = new ff();
              this.field_M.field_f = (qda) ((Object) var6_ref);
              if (this.field_K == null) {
                break L8;
              } else {
                this.field_K.field_f = (qda) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              this.field_Q.field_h = ba.field_r;
              if (null == this.field_O) {
                break L9;
              } else {
                this.field_O.field_f = (qda) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              if (null == this.field_O) {
                break L10;
              } else {
                this.field_O.field_h = qha.field_h;
                break L10;
              }
            }
            L11: {
              if (!this.field_J) {
                if (this.field_F) {
                  this.field_K.field_h = lna.field_h;
                  this.field_K.field_f = (qda) ((Object) new pka());
                  break L11;
                } else {
                  this.field_K.field_f = (qda) ((Object) new pka());
                  break L11;
                }
              } else {
                this.field_K.field_h = wha.field_e;
                break L11;
              }
            }
            L12: {
              this.field_v = 15;
              var7 = jca.field_a;
              if (null == this.field_L) {
                break L12;
              } else {
                this.field_v = this.field_v + (5 + var7.a(this.field_L, -40 + this.field_p, var7.field_u));
                break L12;
              }
            }
            L13: {
              var8 = rw.field_b;
              var9 = hha.a((byte) 127, nia.d(-31768));
              if (se.field_u == var9) {
                var8 = kr.field_zb;
                break L13;
              } else {
                if (er.field_x != var9) {
                  break L13;
                } else {
                  var8 = ji.field_g;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$2 = new ge(10, this.field_v, -20 + this.field_p, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.c(dupTemp$2, 15);
              this.field_v = this.field_v + (((wj) ((Object) var12)).field_q + 5);
              dupTemp$3 = new ge(10, this.field_v, this.field_p + -20, 25, this.field_H, false, 80, 3, var7, 16777215, mp.field_r);
              var13 = dupTemp$3;
              this.c(dupTemp$3, -120);
              this.field_v = this.field_v + (5 + ((wj) ((Object) var13)).field_q);
              this.field_M.field_k = (pl) (this);
              if (null == this.field_O) {
                break L14;
              } else {
                this.field_O.field_k = (pl) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_K) {
                break L15;
              } else {
                this.field_K.field_k = (pl) (this);
                break L15;
              }
            }
            L16: {
              if (null != this.field_O) {
                this.field_M.a(85, 30, (byte) 59, this.field_p - 95, this.field_v);
                this.field_v = this.field_v + 60;
                break L16;
              } else {
                this.field_M.a(8, 30, (byte) 59, -6 + this.field_p + -10, this.field_v);
                this.field_v = this.field_v + 35;
                break L16;
              }
            }
            L17: {
              if (this.field_O == null) {
                break L17;
              } else {
                this.field_O.a(8, 30, (byte) 59, -10 + this.field_p - 6, this.field_v);
                this.field_v = this.field_v + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_K == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_J) {
                    break L19;
                  } else {
                    if (!this.field_F) {
                      this.field_K.a(8, 20, (byte) 59, 40, this.field_v);
                      this.field_v = this.field_v + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_K.a(8, 30, (byte) 59, -16 + this.field_p, this.field_v);
                this.field_v = this.field_v + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, 3 + this.field_v, (byte) 59, this.field_p, 0);
              this.c(this.field_M, -126);
              if (null == this.field_O) {
                break L20;
              } else {
                this.c(this.field_O, -123);
                break L20;
              }
            }
            L21: {
              if (this.field_K == null) {
                break L21;
              } else {
                this.c(this.field_K, -120);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("ph.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, String param1) {
        lka var3 = null;
        String var4 = null;
        if (param0 >= -89) {
            return;
        }
        try {
            var3 = this.field_Q;
            var4 = param1;
            var3.a((byte) 123, var4, false);
            this.field_H.j((byte) 101);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ph.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "This game option is only available to members.";
        pja.a(false, 50);
    }
}
