/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gd extends ac {
    private ja field_xb;
    static fh field_kb;
    static String field_ob;
    private int field_rb;
    private int field_yb;
    static gh field_jb;
    static boolean field_ub;
    private ui field_nb;
    private int field_tb;
    private int field_vb;
    private int field_ib;
    static al field_qb;
    static gh field_sb;
    private lh field_pb;
    static int field_lb;
    static gh field_wb;
    static int field_mb;

    final static gh l() {
        int var1 = 116;
        return vi.field_W.field_Wb;
    }

    boolean i(int param0) {
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if (param0 == -8350) {
            break L0;
          } else {
            field_ub = false;
            break L0;
          }
        }
        L1: {
          if (((gd) this).field_xb == null) {
            break L1;
          } else {
            if (((gd) this).field_xb != mj.field_Yb) {
              if (ob.field_t == ((gd) this).field_xb) {
                int fieldTemp$38 = ((gd) this).field_vb + 1;
                ((gd) this).field_vb = ((gd) this).field_vb + 1;
                if (fieldTemp$38 == ((gd) this).field_tb) {
                  ((gd) this).field_nb.field_R = 256;
                  ((gd) this).field_xb = null;
                  break L1;
                } else {
                  ((gd) this).field_nb.field_R = (((gd) this).field_vb << 8) / ((gd) this).field_tb;
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              int fieldTemp$39 = ((gd) this).field_vb + 1;
              ((gd) this).field_vb = ((gd) this).field_vb + 1;
              if (fieldTemp$39 != ((gd) this).field_yb) {
                ((gd) this).field_nb.field_R = -((((gd) this).field_vb << 8) / ((gd) this).field_yb) + 256;
                break L1;
              } else {
                ((gd) this).field_xb = gi.field_q;
                ((gd) this).a((byte) 103, 12 - (-((gd) this).field_rb - ((gd) this).field_pb.field_E), ((gd) this).field_pb.field_x + 12, ((gd) this).field_ib);
                ((gd) this).field_vb = 0;
                ((gd) this).field_nb.field_R = 0;
                break L1;
              }
            }
          }
        }
        return super.i(-8350);
    }

    void c(lh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 == -22908735) {
              L1: {
                ((gd) this).field_pb = param0;
                if (gi.field_q == ((gd) this).field_xb) {
                  ((gd) this).a((byte) 103, ((gd) this).field_pb.field_E + ((gd) this).field_rb + 12, ((gd) this).field_pb.field_x + 12, ((gd) this).field_ib);
                  ((gd) this).field_vb = 0;
                  break L1;
                } else {
                  if (mj.field_Yb == ((gd) this).field_xb) {
                    break L1;
                  } else {
                    ((gd) this).field_vb = 0;
                    ((gd) this).field_xb = mj.field_Yb;
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gd.NB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    public static void l(int param0) {
        field_wb = null;
        field_ob = null;
        field_jb = null;
        field_qb = null;
        field_kb = null;
        field_sb = null;
    }

    final void j(byte param0) {
        if (((gd) this).field_xb == mj.field_Yb) {
            return;
        }
        ((gd) this).field_vb = 0;
        ((gd) this).field_xb = ob.field_t;
        this.c(-12243, ((gd) this).field_pb);
        if (param0 < 6) {
            Object var3 = null;
            this.c(90, (lh) null);
        }
        ((gd) this).field_nb.field_R = 0;
        ((gd) this).field_pb = null;
    }

    final static int[] b(int param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int var12 = SteelSentinels.field_G;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = param0 >> 16 & 255;
        int var5 = 255 & param0 >> 8;
        int var6 = param0 & 255;
        int var7 = (param1 & 16749042) >> 16;
        int var8 = param1 >> 8 & 255;
        int var9 = 255 & param1;
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var13[var10] = (var10 * var6 >> 8) + ((var9 * var11 >> 8) + ((var5 * var10 >> 8) - -(var11 * var8 >> 8) << 8) + ((var10 * var4 >> 8) + (var11 * var7 >> 8) << 16));
        }
        return var3;
    }

    private final void c(int param0, lh param1) {
        try {
            if (!(((gd) this).field_nb == null)) {
                ((gd) this).field_nb.b(4);
            }
            if (param0 != -12243) {
                ((gd) this).field_rb = -45;
            }
            if (param1 == null) {
                ((gd) this).field_nb = new ui();
            } else {
                param1.a(6, (byte) -86, 6 - -((gd) this).field_rb, param1.field_x, param1.field_E);
                ((gd) this).field_nb = new ui(param1);
            }
            ((gd) this).a((lh) (Object) ((gd) this).field_nb, -88);
            ((gd) this).field_pb = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "gd.QB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean j(int param0) {
        ((gd) this).i((byte) -79);
        if (param0 > -50) {
            return false;
        }
        return super.j(-56);
    }

    gd(ka param0, lh param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_x, param2 + (12 - -param1.field_E));
        try {
            ((gd) this).field_rb = param2;
            ((gd) this).field_ib = param4;
            ((gd) this).field_tb = param3;
            ((gd) this).field_yb = param3;
            this.c(-12243, param1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "gd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (((gd) this).field_nb != null) {
                  L2: {
                    if (param1 != 98) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((gd) this).field_nb.a(1, param3);
                      break L2;
                    }
                  }
                  if (param1 == 99) {
                    boolean discarded$5 = ((gd) this).field_nb.a(1, param3);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if (param0 == 30373) {
                  break L3;
                } else {
                  var6 = null;
                  ((gd) this).c((lh) null, -80);
                  break L3;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("gd.R(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final void i(byte param0) {
        if (((gd) this).field_xb != null) {
            if (!(((gd) this).field_xb == ob.field_t)) {
                ((gd) this).a((byte) -114, 12 - -((gd) this).field_pb.field_x, ((gd) this).field_rb + (12 + ((gd) this).field_pb.field_E));
                this.c(-12243, ((gd) this).field_pb);
            }
            ((gd) this).field_nb.field_R = 256;
            ((gd) this).field_xb = null;
        }
        int var2 = 29 / ((55 - param0) / 39);
        super.i((byte) 101);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Report <%0> for abuse";
    }
}
