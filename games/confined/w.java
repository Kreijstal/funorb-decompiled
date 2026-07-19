/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ga implements uj, el {
    private boolean field_L;
    private rg field_P;
    static int[] field_R;
    private boolean field_W;
    private boolean field_S;
    static String field_Q;
    private String field_H;
    private rg field_U;
    private ul field_X;
    private rg field_V;
    private ul field_T;

    private final void a(byte param0) {
        L0: {
          if (param0 == -65) {
            break L0;
          } else {
            this.field_U = (rg) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (hh.a(param0 ^ 13676)) {
              break L2;
            } else {
              if (this.field_T.field_B.length() <= 0) {
                break L1;
              } else {
                if ((this.field_X.field_B.length() ^ -1) >= -1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          rm.a(this.field_T.field_B, (byte) 38, this.field_X.field_B);
          break L1;
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 > 68) {
              L1: {
                if (this.field_V != param3) {
                  if (param3 != this.field_P) {
                    if (this.field_U != param3) {
                      break L1;
                    } else {
                      if (!this.field_W) {
                        if (!this.field_L) {
                          um.a((byte) -126);
                          break L1;
                        } else {
                          ke.g((byte) -120);
                          break L1;
                        }
                      } else {
                        wa.a(-20683);
                        break L1;
                      }
                    }
                  } else {
                    jl.a((byte) -123);
                    break L1;
                  }
                } else {
                  this.a((byte) -65);
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
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("w.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(byte param0) {
        this.field_T.l((byte) 115);
        if (param0 != -104) {
            String var3 = (String) null;
            this.a(-119, (String) null);
        }
        this.field_X.l((byte) 90);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int discarded$0 = 0;
        if (!(this.field_H == null)) {
            discarded$0 = gm.field_cb.a(this.field_H, 20 + (param3 + this.field_q), this.field_m + param0 - -15, -40 + this.field_F, this.field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
        }
        if (param2 < 36) {
            w.k(-83);
        }
        if (!(null == this.field_P)) {
            fn.b(param3 + 10, 134 + param0, this.field_F - 20, 4210752);
        }
        super.a(param0, param1, (byte) 61, param3);
    }

    public final void a(ul param0, byte param1) {
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
              if (this.field_T != param0) {
                break L1;
              } else {
                discarded$2 = this.field_X.a((fj) (this), 418);
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_X) {
                this.a((byte) -65);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 83) {
                break L3;
              } else {
                w.k(88);
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
            stackOut_8_1 = new StringBuilder().append("w.E(");
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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -48, param2, param3)) {
              if (98 == param2) {
                stackOut_5_0 = this.c(param0, 32);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = 89 % ((param1 - 47) / 43);
                if ((param2 ^ -1) != -100) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = this.a(17731, param0);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("w.Q(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
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

    public final void a(int param0, ul param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        fj var4 = null;
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
              if (param0 == 32175) {
                break L1;
              } else {
                var4 = (fj) null;
                discarded$2 = this.a((fj) null, (byte) 37, 92, '8');
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
            stackOut_3_1 = new StringBuilder().append("w.GA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, String param1) {
        ul var3 = null;
        String var4 = null;
        if (param0 != 0) {
            return;
        }
        try {
            var3 = this.field_T;
            var4 = param1;
            var3.a(false, false, var4);
            this.field_X.l((byte) 110);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "w.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(int param0) {
        field_Q = null;
        field_R = null;
        if (param0 != 1) {
            w.k(50);
        }
    }

    final String j(int param0) {
        if (param0 > -97) {
            return (String) null;
        }
        if (null == this.field_T.field_B) {
            return "";
        }
        return this.field_T.field_B;
    }

    w(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fe) null);
        la dupTemp$2 = null;
        la dupTemp$3 = null;
        RuntimeException var6 = null;
        je var6_ref = null;
        ok var7 = null;
        String var8 = null;
        al var9 = null;
        la var12 = null;
        la var13 = null;
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
        rg stackIn_17_1 = null;
        rg stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rg stackIn_18_1 = null;
        rg stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        rg stackIn_19_1 = null;
        rg stackIn_19_2 = null;
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
        rg stackOut_16_1 = null;
        rg stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        rg stackOut_18_1 = null;
        rg stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        rg stackOut_17_1 = null;
        rg stackOut_17_2 = null;
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
              ((w) (this)).field_W = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
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
              ((w) (this)).field_S = stackIn_7_1 != 0;
              this.field_H = param1;
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
              ((w) (this)).field_L = stackIn_10_1 != 0;
              if (!this.field_W) {
                break L4;
              } else {
                L5: {
                  if (this.field_S) {
                    break L5;
                  } else {
                    if (!this.field_L) {
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
              this.field_T = (ul) ((Object) new wh(param0, (uk) (this), 100));
              this.field_X = (ul) ((Object) new wh("", (uk) (this), 20));
              if (!this.field_W) {
                L7: {
                  this.field_V = new rg(o.field_d, (uk) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!this.field_L) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = te.field_i;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = ug.field_cb;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((w) (this)).field_U = new rg(stackIn_19_3, (uk) null);
                if (!this.field_S) {
                  break L6;
                } else {
                  this.field_P = new rg(ej.field_c, (uk) (this));
                  break L6;
                }
              } else {
                this.field_V = new rg(aa.field_a, (uk) null);
                this.field_U = new rg(al.field_c, (uk) null);
                this.field_T.field_L = false;
                break L6;
              }
            }
            L8: {
              this.field_T.field_n = (fe) ((Object) new db(10000536));
              this.field_X.field_n = (fe) ((Object) new qm(10000536));
              var6_ref = new je();
              this.field_V.field_n = (fe) ((Object) var6_ref);
              if (this.field_U == null) {
                break L8;
              } else {
                this.field_U.field_n = (fe) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              if (this.field_P == null) {
                break L9;
              } else {
                this.field_P.field_n = (fe) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              this.field_T.field_C = vl.field_a;
              if (null == this.field_P) {
                break L10;
              } else {
                this.field_P.field_C = eh.field_eb;
                break L10;
              }
            }
            L11: {
              if (!this.field_W) {
                if (this.field_L) {
                  this.field_U.field_C = nl.field_a;
                  this.field_U.field_n = (fe) ((Object) new hk());
                  break L11;
                } else {
                  this.field_U.field_n = (fe) ((Object) new hk());
                  break L11;
                }
              } else {
                this.field_U.field_C = cj.field_c;
                break L11;
              }
            }
            L12: {
              this.field_m = 15;
              var7 = gm.field_cb;
              if (this.field_H == null) {
                break L12;
              } else {
                this.field_m = this.field_m + (5 + var7.b(this.field_H, this.field_F - 40, var7.field_C));
                break L12;
              }
            }
            L13: {
              var8 = hd.field_a;
              var9 = tm.a(ii.b(false), -118);
              if (pi.field_T == var9) {
                var8 = hn.field_p;
                break L13;
              } else {
                if (tj.field_n != var9) {
                  break L13;
                } else {
                  var8 = nm.field_D;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$2 = new la(10, this.field_m, this.field_F + -20, 25, this.field_T, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.b(dupTemp$2, 10);
              this.field_m = this.field_m + (((fj) ((Object) var12)).field_z + 5);
              dupTemp$3 = new la(10, this.field_m, this.field_F + -20, 25, this.field_X, false, 80, 3, var7, 16777215, sc.field_b);
              var13 = dupTemp$3;
              this.b(dupTemp$3, 10);
              this.field_V.field_t = (uk) (this);
              this.field_m = this.field_m + (((fj) ((Object) var13)).field_z + 5);
              if (null == this.field_P) {
                break L14;
              } else {
                this.field_P.field_t = (uk) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_U == null) {
                break L15;
              } else {
                this.field_U.field_t = (uk) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_P != null) {
                this.field_V.a(-125, -95 + this.field_F, this.field_m, 30, 85);
                this.field_m = this.field_m + 60;
                break L16;
              } else {
                this.field_V.a(-119, -10 + (this.field_F + -6), this.field_m, 30, 8);
                this.field_m = this.field_m + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_P) {
                break L17;
              } else {
                this.field_P.a(-112, -16 + this.field_F, this.field_m, 30, 8);
                this.field_m = this.field_m + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_U == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_W) {
                    break L19;
                  } else {
                    if (!this.field_L) {
                      this.field_U.a(-110, 40, this.field_m, 20, 8);
                      this.field_m = this.field_m + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_U.a(-123, -6 + this.field_F - 10, this.field_m, 30, 8);
                this.field_m = this.field_m + 35;
                break L18;
              }
            }
            L20: {
              this.a(-110, this.field_F, 0, 3 + this.field_m, 0);
              this.b(this.field_V, 10);
              if (this.field_P == null) {
                break L20;
              } else {
                this.b(this.field_P, 10);
                break L20;
              }
            }
            L21: {
              if (this.field_U == null) {
                break L21;
              } else {
                this.b(this.field_U, 10);
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
            stackOut_57_1 = new StringBuilder().append("w.<init>(");
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
          throw sd.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_R = new int[8192];
        field_Q = "Quit";
    }
}
