/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ml extends nb {
    static String field_kb;
    private int field_Y;
    static int[] field_ib;
    static long field_jb;
    static String field_fb;
    private int field_X;
    private na field_eb;
    static String field_cb;
    private int field_gb;
    static int[] field_mb;
    static String field_hb;
    private ok field_lb;
    static int field_ab;
    private int field_db;
    private int field_Z;
    private il field_bb;

    final void m(int param0) {
        if (((ml) this).field_lb != i.field_a) {
          ((ml) this).field_lb = ui.field_f;
          ((ml) this).field_X = 0;
          this.a((byte) -94, ((ml) this).field_eb);
          ((ml) this).field_bb.field_N = 0;
          if (param0 != -7718) {
            return;
          } else {
            ((ml) this).field_eb = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
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
            if (super.a(param0, param1, 1, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((ml) this).field_bb != null) {
                L1: {
                  if (98 == param0) {
                    boolean discarded$4 = ((ml) this).field_bb.a(param3, -384169950);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 == 99) {
                    boolean discarded$5 = ((ml) this).field_bb.a(param3, -384169950);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
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
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ml.DB(").append(param0).append(44).append(param1).append(44).append(1).append(44);
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    boolean l(int param0) {
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (((ml) this).field_lb != null) {
          if (((ml) this).field_lb != i.field_a) {
            if (((ml) this).field_lb == ui.field_f) {
              int fieldTemp$2 = ((ml) this).field_X + 1;
              ((ml) this).field_X = ((ml) this).field_X + 1;
              if (((ml) this).field_db == fieldTemp$2) {
                ((ml) this).field_bb.field_N = 256;
                ((ml) this).field_lb = null;
                return super.l(-1);
              } else {
                ((ml) this).field_bb.field_N = (((ml) this).field_X << 8) / ((ml) this).field_db;
                return super.l(-1);
              }
            } else {
              return super.l(-1);
            }
          } else {
            int fieldTemp$3 = ((ml) this).field_X + 1;
            ((ml) this).field_X = ((ml) this).field_X + 1;
            if (((ml) this).field_Y == fieldTemp$3) {
              ((ml) this).field_lb = qk.field_d;
              ((ml) this).a(true, ((ml) this).field_gb, 12 + ((ml) this).field_eb.field_F, ((ml) this).field_Z + (12 - -((ml) this).field_eb.field_u));
              ((ml) this).field_X = 0;
              ((ml) this).field_bb.field_N = 0;
              return super.l(-1);
            } else {
              ((ml) this).field_bb.field_N = 256 - (((ml) this).field_X << 8) / ((ml) this).field_Y;
              return super.l(-1);
            }
          }
        } else {
          return super.l(-1);
        }
    }

    ml(pk param0, na param1, int param2, int param3, int param4) {
        super(param0, param1.field_F + 12, param1.field_u + (param2 + 12));
        try {
            ((ml) this).field_Z = param2;
            ((ml) this).field_db = param3;
            ((ml) this).field_Y = param3;
            ((ml) this).field_gb = param4;
            this.a((byte) 90, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ml.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void o(int param0) {
        vh.field_e.field_h = param0;
        vh.field_e.field_d = 0;
    }

    private final void a(byte param0, na param1) {
        try {
            if (!(((ml) this).field_bb == null)) {
                ((ml) this).field_bb.b(false);
            }
            int var3_int = -11 % ((-4 - param0) / 48);
            if (param1 == null) {
                ((ml) this).field_bb = new il();
            } else {
                param1.a(param1.field_u, ((ml) this).field_Z + 6, 65, 6, param1.field_F);
                ((ml) this).field_bb = new il(param1);
            }
            ((ml) this).c((na) (Object) ((ml) this).field_bb, 10);
            ((ml) this).field_eb = null;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ml.N(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean h(int param0) {
        if (param0 != 652390224) {
          ml.o(-30);
          ((ml) this).a(true);
          return super.h(652390224);
        } else {
          ((ml) this).a(true);
          return super.h(652390224);
        }
    }

    public static void e(byte param0) {
        field_ib = null;
        field_hb = null;
        if (param0 != -38) {
          field_ab = -32;
          field_fb = null;
          field_mb = null;
          field_kb = null;
          field_cb = null;
          return;
        } else {
          field_fb = null;
          field_mb = null;
          field_kb = null;
          field_cb = null;
          return;
        }
    }

    void e(na param0, int param1) {
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
            L1: {
              ((ml) this).field_eb = param0;
              if (qk.field_d != ((ml) this).field_lb) {
                if (((ml) this).field_lb == i.field_a) {
                  break L1;
                } else {
                  ((ml) this).field_lb = i.field_a;
                  ((ml) this).field_X = 0;
                  break L1;
                }
              } else {
                ((ml) this).a(true, ((ml) this).field_gb, ((ml) this).field_eb.field_F + 12, 12 - -((ml) this).field_Z + ((ml) this).field_eb.field_u);
                ((ml) this).field_X = 0;
                break L1;
              }
            }
            if (param1 == -27667) {
              break L0;
            } else {
              ml.e((byte) -4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ml.Q(");
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
          throw oi.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0) {
        if (!(((ml) this).field_lb == null)) {
            if (!(((ml) this).field_lb == ui.field_f)) {
                ((ml) this).a(12 - -((ml) this).field_eb.field_F, (byte) 96, 12 - (-((ml) this).field_Z - ((ml) this).field_eb.field_u));
                this.a((byte) -127, ((ml) this).field_eb);
            }
            ((ml) this).field_bb.field_N = 256;
            ((ml) this).field_lb = null;
        }
        super.a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_kb = "Loading animations";
        field_ib = new int[4];
        field_hb = "Reload game";
    }
}
