/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ui extends ch implements pe, tb {
    static ko field_U;
    private fe field_S;
    private fe field_W;
    private String field_T;
    private sl field_R;
    private boolean field_Y;
    private boolean field_O;
    private fe field_X;
    private boolean field_P;
    static String field_ab;
    static String field_N;
    private sl field_Q;
    static String field_Z;
    static int[] field_V;

    public final void a(sl param0, boolean param1) {
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
              if (param0 != ((ui) this).field_R) {
                break L1;
              } else {
                boolean discarded$2 = ((ui) this).field_Q.a((ei) this, (byte) 115);
                break L1;
              }
            }
            L2: {
              if (param0 == ((ui) this).field_Q) {
                this.i(-1);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param1) {
                break L3;
              } else {
                ((ui) this).field_Q = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ui.R(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final String h(int param0) {
        if (param0 >= -99) {
            field_ab = null;
        }
        if (!(null != ((ui) this).field_R.field_m)) {
            return "";
        }
        return ((ui) this).field_R.field_m;
    }

    final void a(int param0, String param1) {
        sl var3 = null;
        String var4 = null;
        try {
            var3 = ((ui) this).field_R;
            var4 = param1;
            var3.a((byte) -124, false, var4);
            if (param0 != 8) {
                Object var5 = null;
                ui.a((byte) -7, (String) null, (String) null);
            }
            ((ui) this).field_Q.f(88);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ui.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ui(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fp) null);
        RuntimeException var6 = null;
        ng var6_ref = null;
        lr var7 = null;
        String var8 = null;
        ml var9 = null;
        n var11 = null;
        n var12 = null;
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
        fe stackIn_17_1 = null;
        fe stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        fe stackIn_18_1 = null;
        fe stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        fe stackIn_19_1 = null;
        fe stackIn_19_2 = null;
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
        fe stackOut_16_1 = null;
        fe stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        fe stackOut_18_1 = null;
        fe stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        fe stackOut_17_1 = null;
        fe stackOut_17_2 = null;
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
              ((ui) this).field_P = stackIn_4_1 != 0;
              ((ui) this).field_T = param1;
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
              ((ui) this).field_O = stackIn_7_1 != 0;
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
              ((ui) this).field_Y = stackIn_10_1 != 0;
              if (!((ui) this).field_P) {
                break L4;
              } else {
                L5: {
                  if (((ui) this).field_Y) {
                    break L5;
                  } else {
                    if (!((ui) this).field_O) {
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
              ((ui) this).field_R = (sl) (Object) new ga(param0, (cc) this, 100);
              ((ui) this).field_Q = (sl) (Object) new ga("", (cc) this, 20);
              if (!((ui) this).field_P) {
                L7: {
                  ((ui) this).field_S = new fe(sa.field_y, (cc) null);
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (((ui) this).field_O) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = va.field_O;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = jk.field_a;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L7;
                  }
                }
                ((ui) this).field_X = new fe(stackIn_19_3, (cc) null);
                if (!((ui) this).field_Y) {
                  break L6;
                } else {
                  ((ui) this).field_W = new fe(ad.field_t, (cc) this);
                  break L6;
                }
              } else {
                ((ui) this).field_S = new fe(ap.field_F, (cc) null);
                ((ui) this).field_X = new fe(dj.field_e, (cc) null);
                ((ui) this).field_R.field_I = false;
                break L6;
              }
            }
            L8: {
              ((ui) this).field_R.field_z = (fp) (Object) new om(10000536);
              ((ui) this).field_Q.field_z = (fp) (Object) new sm(10000536);
              var6_ref = new ng();
              ((ui) this).field_S.field_z = (fp) (Object) var6_ref;
              if (((ui) this).field_X == null) {
                break L8;
              } else {
                ((ui) this).field_X.field_z = (fp) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((ui) this).field_R.field_p = pn.field_a;
              if (null == ((ui) this).field_W) {
                break L9;
              } else {
                ((ui) this).field_W.field_z = (fp) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (((ui) this).field_W == null) {
                break L10;
              } else {
                ((ui) this).field_W.field_p = fc.field_d;
                break L10;
              }
            }
            L11: {
              if (!((ui) this).field_P) {
                if (((ui) this).field_O) {
                  ((ui) this).field_X.field_p = lh.field_h;
                  ((ui) this).field_X.field_z = (fp) (Object) new pd();
                  break L11;
                } else {
                  ((ui) this).field_X.field_z = (fp) (Object) new pd();
                  break L11;
                }
              } else {
                ((ui) this).field_X.field_p = wg.field_Ob;
                break L11;
              }
            }
            L12: {
              ((ui) this).field_D = 15;
              var7 = lc.field_O;
              if (((ui) this).field_T == null) {
                break L12;
              } else {
                ((ui) this).field_D = ((ui) this).field_D + (5 + var7.b(((ui) this).field_T, -40 + ((ui) this).field_l, var7.field_C));
                break L12;
              }
            }
            L13: {
              var8 = vi.field_d;
              var9 = aj.a(hk.d(76), 5137);
              if (var9 == eo.field_Xb) {
                var8 = wm.field_Qb;
                break L13;
              } else {
                if (var9 != ug.field_v) {
                  break L13;
                } else {
                  var8 = qp.field_Ob;
                  break L13;
                }
              }
            }
            L14: {
              n dupTemp$2 = new n(10, ((ui) this).field_D, -20 + ((ui) this).field_l, 25, (ei) (Object) ((ui) this).field_R, false, 80, 3, var7, 16777215, var8);
              var11 = dupTemp$2;
              ((ui) this).a(true, (ei) (Object) dupTemp$2);
              ((ui) this).field_D = ((ui) this).field_D + (((ei) (Object) var11).field_y + 5);
              n dupTemp$3 = new n(10, ((ui) this).field_D, -20 + ((ui) this).field_l, 25, (ei) (Object) ((ui) this).field_Q, false, 80, 3, var7, 16777215, to.field_n);
              var12 = dupTemp$3;
              ((ui) this).a(true, (ei) (Object) dupTemp$3);
              ((ui) this).field_D = ((ui) this).field_D + (5 + ((ei) (Object) var12).field_y);
              ((ui) this).field_S.field_t = (cc) this;
              if (((ui) this).field_W == null) {
                break L14;
              } else {
                ((ui) this).field_W.field_t = (cc) this;
                break L14;
              }
            }
            L15: {
              if (((ui) this).field_X == null) {
                break L15;
              } else {
                ((ui) this).field_X.field_t = (cc) this;
                break L15;
              }
            }
            L16: {
              if (((ui) this).field_W == null) {
                ((ui) this).field_S.a(((ui) this).field_l - 16, 8, 30, false, ((ui) this).field_D);
                ((ui) this).field_D = ((ui) this).field_D + 35;
                break L16;
              } else {
                ((ui) this).field_S.a(((ui) this).field_l + -95, 85, 30, false, ((ui) this).field_D);
                ((ui) this).field_D = ((ui) this).field_D + 60;
                break L16;
              }
            }
            L17: {
              if (null == ((ui) this).field_W) {
                break L17;
              } else {
                ((ui) this).field_W.a(-10 + ((ui) this).field_l + -6, 8, 30, false, ((ui) this).field_D);
                ((ui) this).field_D = ((ui) this).field_D + 35;
                break L17;
              }
            }
            L18: {
              if (null == ((ui) this).field_X) {
                break L18;
              } else {
                L19: {
                  if (((ui) this).field_P) {
                    break L19;
                  } else {
                    if (!((ui) this).field_O) {
                      ((ui) this).field_X.a(40, 8, 20, false, ((ui) this).field_D);
                      ((ui) this).field_D = ((ui) this).field_D + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((ui) this).field_X.a(-6 + ((ui) this).field_l - 10, 8, 30, false, ((ui) this).field_D);
                ((ui) this).field_D = ((ui) this).field_D + 35;
                break L18;
              }
            }
            L20: {
              ((ui) this).a(((ui) this).field_l, 0, 3 + ((ui) this).field_D, false, 0);
              ((ui) this).a(true, (ei) (Object) ((ui) this).field_S);
              if (((ui) this).field_W == null) {
                break L20;
              } else {
                ((ui) this).a(true, (ei) (Object) ((ui) this).field_W);
                break L20;
              }
            }
            L21: {
              if (null == ((ui) this).field_X) {
                break L21;
              } else {
                ((ui) this).a(true, (ei) (Object) ((ui) this).field_X);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("ui.<init>(");
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
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
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
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((ui) this).b(param3, 0);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((ui) this).a(param3, 3);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ui.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void g(byte param0) {
        ((ui) this).field_R.f(90);
        ((ui) this).field_Q.f(100);
        if (param0 > -21) {
            ((ui) this).field_T = null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = -3 % ((param1 - -42) / 53);
        if (!(null == ((ui) this).field_T)) {
            int discarded$0 = lc.field_O.a(((ui) this).field_T, 20 + (((ui) this).field_C + param2), ((ui) this).field_D + (param3 - -15), ((ui) this).field_l - 40, ((ui) this).field_y, 16777215, -1, 1, 0, lc.field_O.field_C);
        }
        if (!(null == ((ui) this).field_W)) {
            qh.f(10 + param2, 134 + param3, -20 + ((ui) this).field_l, 4210752);
        }
        super.a(param0, (byte) 23, param2, param3);
    }

    public final void a(sl param0, int param1) {
        try {
            int var3_int = 100 / ((-43 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ui.BA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void i(int param0) {
        L0: {
          L1: {
            if (td.a(true)) {
              break L1;
            } else {
              if (((ui) this).field_R.field_m.length() <= 0) {
                break L0;
              } else {
                if (((ui) this).field_Q.field_m.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          ui.a((byte) 34, ((ui) this).field_R.field_m, ((ui) this).field_Q.field_m);
          break L0;
        }
    }

    private final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 != 34) {
                Object var4 = null;
                ui.a((byte) -59, (String) null, (String) null);
            }
            qa.a(false, param1, -102, param2);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ui.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, byte param1) {
        return jo.c(16, -54264319, param0);
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4) {
        aa var5 = null;
        RuntimeException var5_ref = null;
        lk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            var5 = new aa(ne.field_r);
            var6 = (lk) (Object) var5.b((byte) -92);
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  n.a(8, param0, param1, param3, 1);
                  if (param2 == -6) {
                    break L2;
                  } else {
                    field_ab = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (var6.field_x == param0) {
                    break L3;
                  } else {
                    if (var6.field_x.equals((Object) (Object) param0)) {
                      break L3;
                    } else {
                      var6 = (lk) (Object) var5.b(-84);
                      continue L1;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("ui.J(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 1 + 41);
        }
    }

    public static void a(int param0) {
        field_ab = null;
        field_V = null;
        field_Z = null;
        field_U = null;
        field_N = null;
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param3 != ((ui) this).field_S) {
                if (((ui) this).field_W != param3) {
                  if (((ui) this).field_X == param3) {
                    if (((ui) this).field_P) {
                      ib.c(-119);
                      break L1;
                    } else {
                      if (!((ui) this).field_O) {
                        db.h(15158);
                        break L1;
                      } else {
                        od.a(true);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  br.f(35);
                  break L1;
                }
              } else {
                this.i(-1);
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                field_N = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("ui.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            Object var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                try {
                  L1: {
                    var3 = new java.net.URL(param1.getCodeBase(), param0);
                    var3 = p.a((byte) -61, var3, param1);
                    jc.a(-10553, param1, var3.toString(), true);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (!param2) {
                    break L3;
                  } else {
                    var4 = null;
                    ui.a((String) null, (java.applet.Applet) null, true);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("ui.D(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              L5: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new ko();
        field_ab = "Updates will sent to the email address you've given";
        field_N = "To win nine-ball pool, pot the 9 ball without fouling.";
        field_Z = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
