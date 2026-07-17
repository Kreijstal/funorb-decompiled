/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rl extends td implements se, m {
    private boolean field_L;
    private rh field_G;
    private rh field_O;
    static q[] field_C;
    private String field_M;
    private lb field_H;
    static kk field_D;
    static int field_N;
    private boolean field_K;
    private lb field_F;
    private boolean field_I;
    private rh field_J;

    final static kd a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        kd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        kd stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_long = 0L;
                var6 = null;
                if (param3.indexOf('@') != -1) {
                  break L3;
                } else {
                  var7 = (CharSequence) (Object) param3;
                  var4_long = vh.a((byte) -81, var7);
                  if (!TrackController.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = (Object) (Object) param3;
              break L2;
            }
            stackOut_5_0 = ie.a(var4_long, param2, param1, (String) var6, (byte) -124);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("rl.F(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_6_0;
    }

    final void a(byte param0, String param1) {
        lb var3 = null;
        String var4 = null;
        try {
            if (param0 < 45) {
                ((rl) this).field_H = null;
            }
            var3 = ((rl) this).field_H;
            var4 = param1;
            var3.a(false, var4, 122);
            ((rl) this).field_F.l(-68);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "rl.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((rl) this).field_M) {
            int discarded$0 = gk.field_c.a(((rl) this).field_M, param1 - -((rl) this).field_p + 20, ((rl) this).field_m + param2 + 15, ((rl) this).field_x + -40, ((rl) this).field_u, 16777215, -1, 1, 0, gk.field_c.field_G);
        }
        if (!(((rl) this).field_O == null)) {
            ll.a(param1 - -10, 134 + param2, ((rl) this).field_x + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(byte param0) {
        if (param0 < 117) {
            return;
        }
        ((rl) this).field_H.l(-73);
        ((rl) this).field_F.l(-72);
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
            return;
        }
        field_D = null;
    }

    public final void a(int param0, lb param1) {
        RuntimeException runtimeException = null;
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
              if (param0 == -12230) {
                break L1;
              } else {
                ((rl) this).field_I = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rl.N(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    rl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (t) null);
        RuntimeException var6 = null;
        dc var6_ref = null;
        oh var7 = null;
        String var8 = null;
        bl var9 = null;
        int var11 = 0;
        sa var12 = null;
        sa var13 = null;
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
        rh stackIn_17_1 = null;
        rh stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rh stackIn_18_1 = null;
        rh stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        rh stackIn_19_1 = null;
        rh stackIn_19_2 = null;
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
        rh stackOut_16_1 = null;
        rh stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        rh stackOut_18_1 = null;
        rh stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        rh stackOut_17_1 = null;
        rh stackOut_17_2 = null;
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
        var11 = TrackController.field_F ? 1 : 0;
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
              ((rl) this).field_L = stackIn_4_1 != 0;
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
              ((rl) this).field_I = stackIn_7_1 != 0;
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
              ((rl) this).field_K = stackIn_10_1 != 0;
              ((rl) this).field_M = param1;
              if (!((rl) this).field_L) {
                break L4;
              } else {
                L5: {
                  if (((rl) this).field_K) {
                    break L5;
                  } else {
                    if (!((rl) this).field_I) {
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
                ((rl) this).field_H = (lb) (Object) new lf(param0, (tg) this, 100);
                ((rl) this).field_F = (lb) (Object) new lf("", (tg) this, 20);
                if (!((rl) this).field_L) {
                  break L7;
                } else {
                  ((rl) this).field_G = new rh(ib.field_c, (tg) null);
                  ((rl) this).field_J = new rh(cg.field_b, (tg) null);
                  ((rl) this).field_H.field_B = false;
                  if (var11 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                ((rl) this).field_G = new rh(nd.field_H, (tg) null);
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                if (!((rl) this).field_I) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = null;
                  stackOut_18_2 = null;
                  stackOut_18_3 = ea.field_p;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  stackIn_19_3 = stackOut_18_3;
                  break L8;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = null;
                  stackOut_17_2 = null;
                  stackOut_17_3 = v.field_d;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  stackIn_19_3 = stackOut_17_3;
                  break L8;
                }
              }
              ((rl) this).field_J = new rh(stackIn_19_3, (tg) null);
              if (!((rl) this).field_K) {
                break L6;
              } else {
                ((rl) this).field_O = new rh(md.field_f, (tg) this);
                break L6;
              }
            }
            L9: {
              ((rl) this).field_H.field_y = (t) (Object) new dd(10000536);
              ((rl) this).field_F.field_y = (t) (Object) new ql(10000536);
              var6_ref = new dc();
              ((rl) this).field_G.field_y = (t) (Object) var6_ref;
              if (((rl) this).field_J == null) {
                break L9;
              } else {
                ((rl) this).field_J.field_y = (t) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((rl) this).field_O) {
                break L10;
              } else {
                ((rl) this).field_O.field_y = (t) (Object) var6_ref;
                break L10;
              }
            }
            L11: {
              ((rl) this).field_H.field_n = ie.field_a;
              if (((rl) this).field_O == null) {
                break L11;
              } else {
                ((rl) this).field_O.field_n = ic.field_g;
                break L11;
              }
            }
            L12: {
              L13: {
                if (!((rl) this).field_L) {
                  break L13;
                } else {
                  ((rl) this).field_J.field_n = lc.field_E;
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (!((rl) this).field_I) {
                  break L14;
                } else {
                  ((rl) this).field_J.field_n = kh.field_b;
                  ((rl) this).field_J.field_y = (t) (Object) new ne();
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              ((rl) this).field_J.field_y = (t) (Object) new ne();
              break L12;
            }
            L15: {
              ((rl) this).field_m = 15;
              var7 = gk.field_c;
              if (((rl) this).field_M == null) {
                break L15;
              } else {
                ((rl) this).field_m = ((rl) this).field_m + (var7.a(((rl) this).field_M, -40 + ((rl) this).field_x, var7.field_G) - -5);
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = ai.field_i;
                var9 = gj.a(100, gd.b((byte) 77));
                if (rd.field_o != var9) {
                  break L17;
                } else {
                  var8 = re.field_m;
                  if (var11 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (qi.field_f != var9) {
                break L16;
              } else {
                var8 = nb.field_q;
                break L16;
              }
            }
            L18: {
              sa dupTemp$2 = new sa(10, ((rl) this).field_m, ((rl) this).field_x + -20, 25, (al) (Object) ((rl) this).field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((rl) this).a(false, (al) (Object) dupTemp$2);
              ((rl) this).field_m = ((rl) this).field_m + (5 + ((al) (Object) var12).field_u);
              sa dupTemp$3 = new sa(10, ((rl) this).field_m, ((rl) this).field_x - 20, 25, (al) (Object) ((rl) this).field_F, false, 80, 3, var7, 16777215, rf.field_d);
              var13 = dupTemp$3;
              ((rl) this).a(false, (al) (Object) dupTemp$3);
              ((rl) this).field_m = ((rl) this).field_m + (5 + ((al) (Object) var13).field_u);
              ((rl) this).field_G.field_l = (tg) this;
              if (null == ((rl) this).field_O) {
                break L18;
              } else {
                ((rl) this).field_O.field_l = (tg) this;
                break L18;
              }
            }
            L19: {
              if (((rl) this).field_J == null) {
                break L19;
              } else {
                ((rl) this).field_J.field_l = (tg) this;
                break L19;
              }
            }
            L20: {
              L21: {
                if (((rl) this).field_O == null) {
                  break L21;
                } else {
                  ((rl) this).field_G.a(30, -3050, ((rl) this).field_m, -95 + ((rl) this).field_x, 85);
                  ((rl) this).field_m = ((rl) this).field_m + 60;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              ((rl) this).field_G.a(30, -3050, ((rl) this).field_m, -10 + (-6 + ((rl) this).field_x), 8);
              ((rl) this).field_m = ((rl) this).field_m + 35;
              break L20;
            }
            L22: {
              if (null == ((rl) this).field_O) {
                break L22;
              } else {
                ((rl) this).field_O.a(30, -3050, ((rl) this).field_m, ((rl) this).field_x + -16, 8);
                ((rl) this).field_m = ((rl) this).field_m + 35;
                break L22;
              }
            }
            L23: {
              if (((rl) this).field_J == null) {
                break L23;
              } else {
                L24: {
                  L25: {
                    if (((rl) this).field_L) {
                      break L25;
                    } else {
                      if (!((rl) this).field_I) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  ((rl) this).field_J.a(30, -3050, ((rl) this).field_m, -16 + ((rl) this).field_x, 8);
                  ((rl) this).field_m = ((rl) this).field_m + 35;
                  if (var11 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
                ((rl) this).field_J.a(20, -3050, ((rl) this).field_m, 40, 8);
                ((rl) this).field_m = ((rl) this).field_m + 25;
                break L23;
              }
            }
            L26: {
              ((rl) this).a(((rl) this).field_m + 3, -3050, 0, ((rl) this).field_x, 0);
              ((rl) this).a(false, (al) (Object) ((rl) this).field_G);
              if (((rl) this).field_O == null) {
                break L26;
              } else {
                ((rl) this).a(false, (al) (Object) ((rl) this).field_O);
                break L26;
              }
            }
            L27: {
              if (((rl) this).field_J == null) {
                break L27;
              } else {
                ((rl) this).a(false, (al) (Object) ((rl) this).field_J);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("rl.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L28;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L28;
            }
          }
          L29: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L29;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L29;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_5_0 = false;
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
            if (super.a((byte) -38, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 != 98) {
                if (param3 == 99) {
                  stackOut_9_0 = ((rl) this).a(param2, true);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var5_int = -54 / ((17 - param0) / 51);
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = ((rl) this).a(param2, -45);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("rl.GA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    private final void c(boolean param0) {
        L0: {
          L1: {
            if (kk.b((byte) -128)) {
              break L1;
            } else {
              if (0 >= ((rl) this).field_H.field_s.length()) {
                break L0;
              } else {
                if (((rl) this).field_F.field_s.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          vh.a(((rl) this).field_H.field_s, 224, ((rl) this).field_F.field_s);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            this.c(true);
            break L2;
          }
        }
    }

    public final void b(int param0, lb param1) {
        RuntimeException runtimeException = null;
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
              if (((rl) this).field_H == param1) {
                boolean discarded$2 = ((rl) this).field_F.a((byte) -108, (al) this);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 < -23) {
              L2: {
                if (((rl) this).field_F != param1) {
                  break L2;
                } else {
                  this.c(false);
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("rl.L(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((rl) this).field_G != param0) {
                L2: {
                  if (param0 != ((rl) this).field_O) {
                    break L2;
                  } else {
                    lb.o(-127);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param0 != ((rl) this).field_J) {
                  break L1;
                } else {
                  L3: {
                    if (!((rl) this).field_L) {
                      break L3;
                    } else {
                      ti.a((byte) -58);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!((rl) this).field_I) {
                      break L4;
                    } else {
                      hl.m(param4 ^ 1217388583);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ie.a((byte) 93);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    this.c(false);
                    break L1;
                  }
                }
              } else {
                this.c(false);
                break L1;
              }
            }
            L5: {
              if (param4 == -27322) {
                break L5;
              } else {
                ((rl) this).field_O = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("rl.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final String d(boolean param0) {
        if (!(null != ((rl) this).field_H.field_s)) {
            return "";
        }
        if (!param0) {
            return null;
        }
        return ((rl) this).field_H.field_s;
    }

    static {
    }
}
