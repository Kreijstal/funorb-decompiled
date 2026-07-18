/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pm extends dl implements fd, ae {
    static int field_S;
    static String field_P;
    private boolean field_ab;
    static int field_Z;
    private jf field_Q;
    private boolean field_eb;
    static int field_U;
    static gh field_gb;
    static String field_Y;
    private jf field_V;
    private oa field_X;
    private String field_fb;
    private oa field_R;
    static ul field_db;
    static int field_T;
    static jj[] field_W;
    private boolean field_cb;
    private oa field_bb;

    final void a(String param0, int param1) {
        jf var4 = null;
        String var5 = null;
        try {
            int var3_int = 65 / ((param1 - 81) / 42);
            var4 = ((pm) this).field_V;
            var5 = param0;
            var4.a(var5, 29597, false);
            ((pm) this).field_Q.i(-8521);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "pm.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, jf param1) {
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
              if (param1 == ((pm) this).field_V) {
                boolean discarded$2 = ((pm) this).field_Q.a(1, (lh) this);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 != ((pm) this).field_Q) {
                break L2;
              } else {
                this.i(0);
                break L2;
              }
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                field_W = null;
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
            stackOut_8_1 = new StringBuilder().append("pm.C(").append(param0).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static boolean n(int param0) {
        if (param0 < 11) {
            field_S = 121;
        }
        if (jg.field_f == -1) {
            if (!(ve.a((byte) -116, 1))) {
                return false;
            }
            jg.field_f = rf.field_d.f((byte) -118);
            rf.field_d.field_p = 0;
        }
        if (!(-2 != jg.field_f)) {
            if (!ve.a((byte) -103, 2)) {
                return false;
            }
            jg.field_f = rf.field_d.c((byte) -60);
            rf.field_d.field_p = 0;
        }
        return ve.a((byte) -112, jg.field_f);
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((pm) this).b(-11963, param3);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((pm) this).b(param3, 74);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("pm.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6_int = -6 / ((-85 - param1) / 36);
              if (((pm) this).field_bb == param3) {
                this.i(0);
                break L1;
              } else {
                if (param3 == ((pm) this).field_X) {
                  nj.h((byte) 45);
                  break L1;
                } else {
                  if (param3 != ((pm) this).field_R) {
                    break L1;
                  } else {
                    if (!((pm) this).field_eb) {
                      if (!((pm) this).field_cb) {
                        se.a(110);
                        break L1;
                      } else {
                        id.d((byte) 112);
                        break L1;
                      }
                    } else {
                      tj.a(121);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("pm.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
        }
    }

    public static void l(int param0) {
        field_Y = null;
        field_P = null;
        field_db = null;
        field_gb = null;
        field_W = null;
    }

    pm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (qk) null);
        RuntimeException var6 = null;
        kh var6_ref = null;
        mi var7 = null;
        String var8 = null;
        de var9 = null;
        hc var12 = null;
        hc var13 = null;
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
        oa stackIn_16_1 = null;
        oa stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        oa stackIn_17_1 = null;
        oa stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        oa stackIn_18_1 = null;
        oa stackIn_18_2 = null;
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
        oa stackOut_15_1 = null;
        oa stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        oa stackOut_17_1 = null;
        oa stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        oa stackOut_16_1 = null;
        oa stackOut_16_2 = null;
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
              if (!param4) {
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
              ((pm) this).field_cb = stackIn_4_1 != 0;
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
              ((pm) this).field_ab = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
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
              ((pm) this).field_eb = stackIn_10_1 != 0;
              ((pm) this).field_fb = param1;
              if (!((pm) this).field_eb) {
                break L4;
              } else {
                L5: {
                  if (((pm) this).field_ab) {
                    break L5;
                  } else {
                    if (!((pm) this).field_cb) {
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
              ((pm) this).field_V = (jf) (Object) new bc(param0, (tn) this, 100);
              ((pm) this).field_Q = (jf) (Object) new bc("", (tn) this, 20);
              if (((pm) this).field_eb) {
                ((pm) this).field_bb = new oa(sl.field_c, (tn) null);
                ((pm) this).field_R = new oa(qe.field_b, (tn) null);
                ((pm) this).field_V.field_K = false;
                break L6;
              } else {
                L7: {
                  ((pm) this).field_bb = new oa(lb.field_cc, (tn) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (!((pm) this).field_cb) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = le.field_J;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = lj.field_c;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((pm) this).field_R = new oa(stackIn_18_3, (tn) null);
                if (!((pm) this).field_ab) {
                  break L6;
                } else {
                  ((pm) this).field_X = new oa(tk.field_n, (tn) this);
                  break L6;
                }
              }
            }
            L8: {
              ((pm) this).field_V.field_p = (qk) (Object) new ag(10000536);
              ((pm) this).field_Q.field_p = (qk) (Object) new li(10000536);
              var6_ref = new kh();
              ((pm) this).field_bb.field_p = (qk) (Object) var6_ref;
              if (null == ((pm) this).field_R) {
                break L8;
              } else {
                ((pm) this).field_R.field_p = (qk) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              if (((pm) this).field_X == null) {
                break L9;
              } else {
                ((pm) this).field_X.field_p = (qk) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              ((pm) this).field_V.field_v = pa.field_i;
              if (((pm) this).field_X == null) {
                break L10;
              } else {
                ((pm) this).field_X.field_v = r.field_m;
                break L10;
              }
            }
            L11: {
              if (!((pm) this).field_eb) {
                if (!((pm) this).field_cb) {
                  ((pm) this).field_R.field_p = (qk) (Object) new bl();
                  break L11;
                } else {
                  ((pm) this).field_R.field_v = rg.field_g;
                  ((pm) this).field_R.field_p = (qk) (Object) new bl();
                  break L11;
                }
              } else {
                ((pm) this).field_R.field_v = bb.field_P;
                break L11;
              }
            }
            L12: {
              ((pm) this).field_z = 15;
              var7 = tj.field_e;
              if (null == ((pm) this).field_fb) {
                break L12;
              } else {
                ((pm) this).field_z = ((pm) this).field_z + (5 + var7.a(((pm) this).field_fb, -40 + ((pm) this).field_x, var7.field_G));
                break L12;
              }
            }
            L13: {
              var8 = qe.field_c;
              var9 = db.a((byte) -60, wl.d((byte) -21));
              if (var9 != qd.field_o) {
                if (var9 != mj.field_Vb) {
                  break L13;
                } else {
                  var8 = ji.field_l;
                  break L13;
                }
              } else {
                var8 = ln.field_b;
                break L13;
              }
            }
            L14: {
              hc dupTemp$2 = new hc(10, ((pm) this).field_z, ((pm) this).field_x + -20, 25, (lh) (Object) ((pm) this).field_V, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((pm) this).a((lh) (Object) dupTemp$2, -100);
              ((pm) this).field_z = ((pm) this).field_z + (5 + ((lh) (Object) var12).field_E);
              hc dupTemp$3 = new hc(10, ((pm) this).field_z, ((pm) this).field_x + -20, 25, (lh) (Object) ((pm) this).field_Q, false, 80, 3, var7, 16777215, jh.field_c);
              var13 = dupTemp$3;
              ((pm) this).a((lh) (Object) dupTemp$3, -120);
              ((pm) this).field_bb.field_A = (tn) this;
              ((pm) this).field_z = ((pm) this).field_z + (((lh) (Object) var13).field_E - -5);
              if (null == ((pm) this).field_X) {
                break L14;
              } else {
                ((pm) this).field_X.field_A = (tn) this;
                break L14;
              }
            }
            L15: {
              if (((pm) this).field_R == null) {
                break L15;
              } else {
                ((pm) this).field_R.field_A = (tn) this;
                break L15;
              }
            }
            L16: {
              if (null != ((pm) this).field_X) {
                ((pm) this).field_bb.a(85, (byte) -94, ((pm) this).field_z, -95 + ((pm) this).field_x, 30);
                ((pm) this).field_z = ((pm) this).field_z + 60;
                break L16;
              } else {
                ((pm) this).field_bb.a(8, (byte) -95, ((pm) this).field_z, ((pm) this).field_x - 16, 30);
                ((pm) this).field_z = ((pm) this).field_z + 35;
                break L16;
              }
            }
            L17: {
              if (((pm) this).field_X == null) {
                break L17;
              } else {
                ((pm) this).field_X.a(8, (byte) -85, ((pm) this).field_z, -6 + (((pm) this).field_x - 10), 30);
                ((pm) this).field_z = ((pm) this).field_z + 35;
                break L17;
              }
            }
            L18: {
              if (((pm) this).field_R == null) {
                break L18;
              } else {
                L19: {
                  if (((pm) this).field_eb) {
                    break L19;
                  } else {
                    if (!((pm) this).field_cb) {
                      ((pm) this).field_R.a(8, (byte) -127, ((pm) this).field_z, 40, 20);
                      ((pm) this).field_z = ((pm) this).field_z + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                ((pm) this).field_R.a(8, (byte) -106, ((pm) this).field_z, ((pm) this).field_x + -16, 30);
                ((pm) this).field_z = ((pm) this).field_z + 35;
                break L18;
              }
            }
            L20: {
              ((pm) this).a(0, (byte) -117, 0, ((pm) this).field_x, ((pm) this).field_z + 3);
              ((pm) this).a((lh) (Object) ((pm) this).field_bb, -123);
              if (((pm) this).field_X == null) {
                break L20;
              } else {
                ((pm) this).a((lh) (Object) ((pm) this).field_X, -123);
                break L20;
              }
            }
            L21: {
              if (((pm) this).field_R == null) {
                break L21;
              } else {
                ((pm) this).a((lh) (Object) ((pm) this).field_R, -124);
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
            stackOut_57_1 = new StringBuilder().append("pm.<init>(");
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
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = -5 / ((param0 - -47) / 43);
        if (!(!vb.field_e)) {
            ke.a(2);
        }
    }

    final void j(int param0) {
        ((pm) this).field_V.i(-8521);
        ((pm) this).field_Q.i(-8521);
        int var2 = -123 % ((11 - param0) / 41);
    }

    private final void i(int param0) {
        L0: {
          L1: {
            if (nn.a((byte) 42)) {
              break L1;
            } else {
              if (((pm) this).field_V.field_y.length() <= 0) {
                break L0;
              } else {
                if (((pm) this).field_Q.field_y.length() > 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          hh.a(((pm) this).field_V.field_y, ((pm) this).field_Q.field_y, 50);
          break L0;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (null != ((pm) this).field_fb) {
            int discarded$0 = tj.field_e.a(((pm) this).field_fb, 20 + ((pm) this).field_o + param2, ((pm) this).field_z + param0 - -15, -40 + ((pm) this).field_x, ((pm) this).field_E, 16777215, -1, 1, 0, tj.field_e.field_G);
        }
        if (!(((pm) this).field_X == null)) {
            pb.g(10 + param2, 134 + param0, ((pm) this).field_x - 20, 4210752);
        }
        super.a(param0, (byte) -124, param2, param3);
        if (param1 > -99) {
            ((pm) this).field_V = null;
        }
    }

    final String h(byte param0) {
        if (null == ((pm) this).field_V.field_y) {
            return "";
        }
        if (param0 > -48) {
            field_Y = null;
        }
        return ((pm) this).field_V.field_y;
    }

    public final void a(jf param0, byte param1) {
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
              if (param1 == 89) {
                break L1;
              } else {
                ((pm) this).field_Q = null;
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
            stackOut_3_1 = new StringBuilder().append("pm.K(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ud var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kj var13 = null;
        int var14 = 0;
        int var15 = 0;
        kj var16 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var13 = rf.field_d;
            var16 = var13;
            var2 = var16.f((byte) -67);
            var4 = -121;
            var3 = (ud) (Object) uf.field_f.e(13058);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_t == var2) {
                    break L2;
                  } else {
                    var3 = (ud) (Object) uf.field_f.a((byte) -33);
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                pm.m(81);
                return;
              } else {
                L3: {
                  var4 = var16.f((byte) -63);
                  if (var4 != 0) {
                    ua.field_M[0] = g.field_l;
                    var5 = var3.field_u;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        hb.a(-121, var4, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            bc.a(var5, (byte) 98);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_z = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][var5 * 4];
                            var3.field_x = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = kc.field_z;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var8 <= var14) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = un.field_j[var14 + var5];
                                      var6[1][var15] = ua.field_M[var11];
                                      var7[1][4 * var15] = ok.field_d[var11];
                                      var7[1][1 + 4 * var15] = jm.field_r[var11];
                                      var7[1][2 + 4 * var15] = ne.field_G[var11];
                                      var7[1][var15 * 4 - -3] = mb.field_T[var11];
                                      if (wl.a(47, ua.field_M[var11])) {
                                        if (0 == mb.field_T[var11] + ne.field_G[var11] + jm.field_r[var11]) {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var15++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = un.field_j[var9];
                                  var6[0][var10] = ua.field_M[var11];
                                  var7[0][4 * var10] = ok.field_d[var11];
                                  var7[0][1 + 4 * var10] = jm.field_r[var11];
                                  var7[0][var10 * 4 + 2] = ne.field_G[var11];
                                  var7[0][3 + var10 * 4] = mb.field_T[var11];
                                  if (wl.a(107, ua.field_M[var11])) {
                                    if (0 != jm.field_r[var11] + (ne.field_G[var11] - -mb.field_T[var11])) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              nk.a((byte) -80, (gi) (Object) var16);
                              if (var6_int == 0) {
                                var3.field_B = uf.field_h;
                                var3.field_s = um.field_W;
                                var3.field_p = lb.field_Tb;
                                var3.field_o = field_S;
                                qf.a(field_S, var6_int, um.field_W, (byte) 68, uf.field_h, lb.field_Tb);
                                break L10;
                              } else {
                                qf.a(field_S, var6_int, um.field_W, (byte) 84, uf.field_h, lb.field_Tb);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        ua.field_M[var6_int] = var13.h(1);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_r = true;
                var3.b(4);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "pm.FA(" + 113 + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        pe var4_ref_pe = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        pe var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = SteelSentinels.field_G;
        try {
          L0: {
            nm.field_s = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = nn.field_h.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = nm.field_s[9] >> 8;
                  var4 = nm.field_s[10] >> 8;
                  var5 = nm.field_s[11] >> 8;
                  var6 = vn.field_h << 4;
                  var7 = 0;
                  var8 = jh.a(var6, 4096) >> 8;
                  var9 = kg.a(var6, (byte) -84) >> 8;
                  if (-1 == oh.field_f) {
                    break L2;
                  } else {
                    if (pi.field_c != -1) {
                      var8 = -pi.field_c + 240;
                      var9 = -128;
                      var7 = oh.field_f - 320;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var7 * var7 + var8 * var8 - -(var9 * var9)));
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var8 = (int)((double)var8 * var10);
                var12 = -var3 + var7;
                var13 = var8 + -var4;
                var14 = var9 + -var5;
                var10 = 256.0 / Math.sqrt((double)(var12 * var12 + (var13 * var13 - -(var14 * var14))));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L3: while (true) {
                  if (var15 >= nn.field_h.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= nn.field_h.length) {
                        var2[var16] = -2147483648;
                        var17 = nn.field_h[var16];
                        pe.a(var16, -124);
                        var18 = 0;
                        L5: while (true) {
                          if (3 <= var18) {
                            ul.a(true, (byte) -128, false, bl.field_e, var17, false, nm.field_s);
                            ch.a(var9, var8, var14, -125, var12, var17, var7, var13);
                            var15++;
                            continue L3;
                          } else {
                            bl.field_e[var18] = bl.field_e[var18] + cl.field_f[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] < var23[var17_int]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_pe = nn.field_h[var3];
                var4_ref_pe.b(32767);
                pe.a(var3, -106);
                var5 = var4_ref_pe.field_J + var4_ref_pe.field_c >> 1;
                var6 = var4_ref_pe.field_p - -var4_ref_pe.field_W >> 1;
                var7 = var4_ref_pe.field_n + var4_ref_pe.field_s >> 1;
                var8 = nm.field_s[9] >> 2;
                var9 = nm.field_s[10] >> 2;
                var10_int = nm.field_s[11] >> 2;
                var11 = bl.field_e[5] * var10_int + var8 * bl.field_e[3] - -(bl.field_e[4] * var9) >> 14;
                var12 = var8 * bl.field_e[6] - -(bl.field_e[7] * var9) + var10_int * bl.field_e[8] >> 14;
                var13 = bl.field_e[11] * var10_int + bl.field_e[9] * var8 - -(bl.field_e[10] * var9) >> 14;
                var2[var3] = var12 * var6 + var11 * var5 + var7 * var13 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "pm.M(" + true + ')');
        }
    }

    final static void m(int param0) {
        int var1 = -116 / ((33 - param0) / 34);
        if (!(null == rb.field_h)) {
            rb.field_h.b(12110);
            rb.field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Expert Training";
        field_Y = "Change display name";
    }
}
