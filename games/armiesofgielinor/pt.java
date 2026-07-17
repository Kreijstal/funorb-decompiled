/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pt extends sf {
    private int field_Z;
    static String[] field_W;
    static je field_X;
    private int field_ib;
    private int field_hb;
    private bh field_cb;
    private tv field_bb;
    static h field_db;
    private int field_ab;
    private kb field_jb;
    private int field_fb;
    static uv field_eb;
    static String field_Y;
    static String field_gb;

    final static void c(int param0, int param1, int param2) {
        if (param2 < 1) {
            field_db = null;
            rk.field_B = param0;
            ar.field_C = param1;
            return;
        }
        rk.field_B = param0;
        ar.field_C = param1;
    }

    final void m(int param0) {
        if (!(((pt) this).field_bb != ur.field_v)) {
            return;
        }
        ((pt) this).field_bb = ki.field_e;
        int var2 = 113 % ((param0 - 69) / 50);
        ((pt) this).field_hb = 0;
        this.b(72, ((pt) this).field_jb);
        ((pt) this).field_jb = null;
        ((pt) this).field_cb.field_K = 0;
    }

    boolean a(byte param0) {
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((pt) this).field_bb) {
          if (ur.field_v == ((pt) this).field_bb) {
            int fieldTemp$2 = ((pt) this).field_hb + 1;
            ((pt) this).field_hb = ((pt) this).field_hb + 1;
            if (((pt) this).field_ib != fieldTemp$2) {
              ((pt) this).field_cb.field_K = 256 + -((((pt) this).field_hb << 8) / ((pt) this).field_ib);
              return super.a((byte) -1);
            } else {
              ((pt) this).field_bb = g.field_c;
              ((pt) this).a(((pt) this).field_Z, false, ((pt) this).field_jb.field_w + 12 + ((pt) this).field_ab, ((pt) this).field_jb.field_l + 12);
              ((pt) this).field_hb = 0;
              ((pt) this).field_cb.field_K = 0;
              return super.a((byte) -1);
            }
          } else {
            if (ki.field_e == ((pt) this).field_bb) {
              int fieldTemp$3 = ((pt) this).field_hb + 1;
              ((pt) this).field_hb = ((pt) this).field_hb + 1;
              if (((pt) this).field_fb != fieldTemp$3) {
                ((pt) this).field_cb.field_K = (((pt) this).field_hb << 8) / ((pt) this).field_fb;
                return super.a((byte) -1);
              } else {
                ((pt) this).field_bb = null;
                ((pt) this).field_cb.field_K = 256;
                return super.a((byte) -1);
              }
            } else {
              return super.a((byte) -1);
            }
          }
        } else {
          return super.a((byte) -1);
        }
    }

    public static void i(byte param0) {
        field_db = null;
        field_gb = null;
        field_eb = null;
        field_W = null;
        field_Y = null;
        if (param0 != -72) {
            return;
        }
        field_X = null;
    }

    final void l(int param0) {
        int var2 = 0;
        if (((pt) this).field_bb != null) {
          if (ki.field_e == ((pt) this).field_bb) {
            ((pt) this).field_bb = null;
            ((pt) this).field_cb.field_K = 256;
            super.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          } else {
            ((pt) this).a(((pt) this).field_jb.field_l + 12, (byte) 98, 12 + (((pt) this).field_ab - -((pt) this).field_jb.field_w));
            this.b(107, ((pt) this).field_jb);
            ((pt) this).field_bb = null;
            ((pt) this).field_cb.field_K = 256;
            super.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          }
        } else {
          super.l(81);
          var2 = 71 % ((param0 - -25) / 57);
          return;
        }
    }

    void a(kb param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = 116 % ((-27 - param1) / 44);
            ((pt) this).field_jb = param0;
            if (((pt) this).field_bb != g.field_c) {
              if (((pt) this).field_bb == ur.field_v) {
                break L0;
              } else {
                ((pt) this).field_bb = ur.field_v;
                ((pt) this).field_hb = 0;
                return;
              }
            } else {
              ((pt) this).a(((pt) this).field_Z, false, ((pt) this).field_jb.field_w + (12 + ((pt) this).field_ab), 12 - -((pt) this).field_jb.field_l);
              ((pt) this).field_hb = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pt.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_11_0 = 0;
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
            if (super.a(param0, param1, param2, -12215)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (null != ((pt) this).field_cb) {
                L1: {
                  if (98 != param1) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((pt) this).field_cb.a(11, param0);
                    break L1;
                  }
                }
                L2: {
                  if (param1 == 99) {
                    boolean discarded$5 = ((pt) this).field_cb.a(11, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("pt.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + -12215 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final boolean k(int param0) {
        int var2 = 115 / ((param0 - -1) / 44);
        ((pt) this).l(121);
        return super.k(92);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          try {
            L0: {
              var4 = param2.getGraphics();
              so.field_b.a(255, var4, 0, 0);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("pt.E(").append(0).append(44).append(12).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
    }

    private final void b(int param0, kb param1) {
        try {
            if (((pt) this).field_cb != null) {
                ((pt) this).field_cb.d(92);
            }
            if (param1 != null) {
                param1.a(6, param1.field_l, 6 - -((pt) this).field_ab, 8192, param1.field_w);
                ((pt) this).field_cb = new bh(param1);
            } else {
                ((pt) this).field_cb = new bh();
            }
            int var3_int = 29 % ((param0 - 24) / 42);
            ((pt) this).a((byte) 10, (kb) (Object) ((pt) this).field_cb);
            ((pt) this).field_jb = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pt.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    pt(gk param0, kb param1, int param2, int param3, int param4) {
        super(param0, param1.field_l + 12, 12 + param2 - -param1.field_w);
        try {
            ((pt) this).field_Z = param4;
            ((pt) this).field_ab = param2;
            ((pt) this).field_fb = param3;
            ((pt) this).field_ib = param3;
            this.b(-36, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "pt.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new String[]{"ready", "walk", "run", "attack", "ranged", "jeer", "defend", "death"};
        field_db = new h(3);
        field_Y = "Go Back";
        field_gb = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
