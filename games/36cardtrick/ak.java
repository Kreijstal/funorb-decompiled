/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends g implements pi, qh {
    private hf field_J;
    private boolean field_G;
    private hl field_I;
    private boolean field_D;
    static String field_L;
    private String field_F;
    static long[] field_P;
    static String[] field_N;
    private hf field_K;
    private hl field_M;
    private boolean field_E;
    static int field_O;
    private hl field_H;

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param1 <= -99) {
              if (!super.a(param0, (byte) -105, param2, param3)) {
                if (param2 != 98) {
                  if (param2 == 99) {
                    stackOut_11_0 = this.a(param3, (byte) -28);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_7_0 = this.b(106, param3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ak.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final void l(int param0) {
        this.field_J.n(param0 + 31843);
        this.field_K.n(-124);
        if (param0 != -31940) {
            this.e((byte) 23);
        }
    }

    public final void a(hf param0, int param1) {
        RuntimeException runtimeException = null;
        hf var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 12891) {
                break L1;
              } else {
                var4 = (hf) null;
                this.a(-102, (hf) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ak.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    ak(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ci) null);
        ck dupTemp$2 = null;
        ck dupTemp$3 = null;
        RuntimeException var6 = null;
        ki var6_ref = null;
        ee var7 = null;
        String var8 = null;
        qa var9 = null;
        ck var12 = null;
        ck var13 = null;
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
        Object stackIn_17_0 = null;
        hl stackIn_17_1 = null;
        hl stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hl stackIn_18_1 = null;
        hl stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        hl stackIn_19_1 = null;
        hl stackIn_19_2 = null;
        String stackIn_19_3 = null;
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
        Object stackOut_16_0 = null;
        hl stackOut_16_1 = null;
        hl stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        hl stackOut_18_1 = null;
        hl stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        hl stackOut_17_1 = null;
        hl stackOut_17_2 = null;
        String stackOut_17_3 = null;
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
              if (!param2) {
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
              ((ak) (this)).field_G = stackIn_4_1 != 0;
              this.field_F = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param4) {
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
              ((ak) (this)).field_E = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
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
              ((ak) (this)).field_D = stackIn_10_1 != 0;
              if (!this.field_G) {
                break L4;
              } else {
                L5: {
                  if (this.field_D) {
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
              this.field_J = (hf) ((Object) new v(param0, (pl) (this), 100));
              this.field_K = (hf) ((Object) new v("", (pl) (this), 20));
              if (!this.field_G) {
                L7: {
                  this.field_I = new hl(q.field_f, (pl) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!this.field_E) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = uc.field_r;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = oa.field_b;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((ak) (this)).field_H = new hl(stackIn_19_3, (pl) null);
                if (!this.field_D) {
                  break L6;
                } else {
                  this.field_M = new hl(mg.field_K, (pl) (this));
                  break L6;
                }
              } else {
                this.field_I = new hl(tc.field_c, (pl) null);
                this.field_H = new hl(pg.field_f, (pl) null);
                this.field_J.field_B = false;
                break L6;
              }
            }
            L8: {
              this.field_J.field_v = (ci) ((Object) new r(10000536));
              this.field_K.field_v = (ci) ((Object) new rl(10000536));
              var6_ref = new ki();
              this.field_I.field_v = (ci) ((Object) var6_ref);
              if (null == this.field_H) {
                break L8;
              } else {
                this.field_H.field_v = (ci) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              this.field_J.field_n = sl.field_c;
              if (this.field_M == null) {
                break L9;
              } else {
                this.field_M.field_v = (ci) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              if (null == this.field_M) {
                break L10;
              } else {
                this.field_M.field_n = bl.field_b;
                break L10;
              }
            }
            L11: {
              if (!this.field_G) {
                if (this.field_E) {
                  this.field_H.field_n = w.field_m;
                  this.field_H.field_v = (ci) ((Object) new nb());
                  break L11;
                } else {
                  this.field_H.field_v = (ci) ((Object) new nb());
                  break L11;
                }
              } else {
                this.field_H.field_n = vg.field_c;
                break L11;
              }
            }
            L12: {
              this.field_i = 15;
              var7 = j.field_C;
              if (this.field_F == null) {
                break L12;
              } else {
                this.field_i = this.field_i + (5 + var7.b(this.field_F, this.field_h - 40, var7.field_s));
                break L12;
              }
            }
            L13: {
              var8 = ck.field_F;
              var9 = ma.a(mk.g(-122), -3825);
              if (ke.field_c == var9) {
                var8 = ja.field_d;
                break L13;
              } else {
                if (oj.field_e != var9) {
                  break L13;
                } else {
                  var8 = ab.field_q;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$2 = new ck(10, this.field_i, this.field_h + -20, 25, this.field_J, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.b(dupTemp$2, (byte) 118);
              this.field_i = this.field_i + (5 + ((lk) ((Object) var12)).field_q);
              dupTemp$3 = new ck(10, this.field_i, this.field_h + -20, 25, this.field_K, false, 80, 3, var7, 16777215, fl.field_b);
              var13 = dupTemp$3;
              this.b(dupTemp$3, (byte) 118);
              this.field_i = this.field_i + (((lk) ((Object) var13)).field_q - -5);
              this.field_I.field_k = (pl) (this);
              if (null == this.field_M) {
                break L14;
              } else {
                this.field_M.field_k = (pl) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_H == null) {
                break L15;
              } else {
                this.field_H.field_k = (pl) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_M) {
                this.field_I.a(30, this.field_i, -10 + this.field_h - 6, 8, true);
                this.field_i = this.field_i + 35;
                break L16;
              } else {
                this.field_I.a(30, this.field_i, -95 + this.field_h, 85, true);
                this.field_i = this.field_i + 60;
                break L16;
              }
            }
            L17: {
              if (this.field_M == null) {
                break L17;
              } else {
                this.field_M.a(30, this.field_i, -16 + this.field_h, 8, true);
                this.field_i = this.field_i + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_H == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_G) {
                    break L19;
                  } else {
                    if (!this.field_E) {
                      this.field_H.a(20, this.field_i, 40, 8, true);
                      this.field_i = this.field_i + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_H.a(30, this.field_i, -10 + (this.field_h + -6), 8, true);
                this.field_i = this.field_i + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_i + 3, 0, this.field_h, 0, true);
              this.b(this.field_I, (byte) 118);
              if (null == this.field_M) {
                break L20;
              } else {
                this.b(this.field_M, (byte) 118);
                break L20;
              }
            }
            L21: {
              if (null == this.field_H) {
                break L21;
              } else {
                this.b(this.field_H, (byte) 118);
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
            stackOut_57_1 = new StringBuilder().append("ak.<init>(");
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
          throw ma.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param3 != this.field_I) {
                if (param3 == this.field_M) {
                  jk.a(false);
                  break L1;
                } else {
                  if (param3 != this.field_H) {
                    break L1;
                  } else {
                    if (this.field_G) {
                      j.i(92);
                      break L1;
                    } else {
                      if (this.field_E) {
                        a.d((byte) 74);
                        break L1;
                      } else {
                        td.a((byte) -11);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                this.e((byte) 121);
                break L1;
              }
            }
            var6_int = 100 / ((param1 - -62) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final String d(byte param0) {
        int var2 = 2 % ((param0 - -1) / 36);
        if (!(null != this.field_J.field_r)) {
            return "";
        }
        return this.field_J.field_r;
    }

    public final void a(int param0, hf param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == this.field_J) {
                discarded$2 = this.field_K.a(param0 + 82, (lk) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_K == param1) {
                this.e((byte) 121);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == -1) {
                break L3;
              } else {
                field_O = -19;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ak.GA(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        if (param2 != -1) {
          return;
        } else {
          L0: {
            if (null != this.field_F) {
              discarded$1 = j.field_C.a(this.field_F, 20 + (this.field_o + param0), this.field_i + param1 + 15, this.field_h + -40, this.field_q, 16777215, -1, 1, 0, j.field_C.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.field_M == null) {
              break L1;
            } else {
              vj.d(10 + param0, param1 + 134, this.field_h + -20, 4210752);
              break L1;
            }
          }
          super.a(param0, param1, param2 ^ 0, param3);
          return;
        }
    }

    public static void a(boolean param0) {
        field_P = null;
        field_N = null;
        if (param0) {
            ak.a(false);
        }
        field_L = null;
    }

    final void a(String param0, int param1) {
        hf var3 = null;
        String var4 = null;
        boolean discarded$0 = false;
        try {
            var3 = this.field_J;
            var4 = param0;
            if (param1 != -95) {
                lk var5 = (lk) null;
                discarded$0 = this.a(',', (byte) -38, -43, (lk) null);
            }
            var3.a(var4, -18845, false);
            this.field_K.n(101);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ak.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void e(byte param0) {
        L0: {
          if (param0 == 121) {
            break L0;
          } else {
            this.field_E = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (cc.a(77)) {
              break L2;
            } else {
              if (-1 <= (this.field_J.field_r.length() ^ -1)) {
                break L1;
              } else {
                if (-1 > (this.field_K.field_r.length() ^ -1)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
          }
          tl.a(this.field_J.field_r, this.field_K.field_r, param0 ^ 9);
          break L1;
        }
    }

    static {
        field_L = "Waiting for fonts";
        field_N = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_P = new long[32];
    }
}
