/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qj extends kc {
    private ie field_Y;
    static gj field_eb;
    private int field_ab;
    private int field_W;
    private int field_db;
    private og field_Z;
    private uj field_X;
    private int field_bb;
    static String field_V;
    private int field_cb;

    void c(int param0, uj param1) {
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
            ((qj) this).field_X = param1;
            if (param0 == 20317) {
              if (((qj) this).field_Z == sk.field_c) {
                ((qj) this).b(12 - -((qj) this).field_X.field_i, ((qj) this).field_db + 12 - -((qj) this).field_X.field_f, (byte) 120, ((qj) this).field_cb);
                ((qj) this).field_ab = 0;
                break L0;
              } else {
                if (((qj) this).field_Z != na.field_e) {
                  ((qj) this).field_ab = 0;
                  ((qj) this).field_Z = na.field_e;
                  return;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("qj.GA(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final boolean i(int param0) {
        if (param0 >= -121) {
          boolean discarded$2 = ((qj) this).i(-95);
          ((qj) this).j(-128);
          return super.i(-125);
        } else {
          ((qj) this).j(-128);
          return super.i(-125);
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
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
            if (!super.a(param0, param1, (byte) -90, param3)) {
              if (null != ((qj) this).field_Y) {
                L1: {
                  if (param3 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((qj) this).field_Y.a(0, param0);
                    break L1;
                  }
                }
                L2: {
                  if (param3 == 99) {
                    boolean discarded$5 = ((qj) this).field_Y.a(0, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("qj.EA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + -90 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    qj(tc param0, uj param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_i, param2 + (12 + param1.field_f));
        try {
            ((qj) this).field_db = param2;
            ((qj) this).field_bb = param3;
            ((qj) this).field_W = param3;
            ((qj) this).field_cb = param4;
            this.d(6, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void k(int param0) {
        if (na.field_e == ((qj) this).field_Z) {
          return;
        } else {
          ((qj) this).field_ab = 0;
          ((qj) this).field_Z = w.field_w;
          if (param0 > -74) {
            ((qj) this).field_X = null;
            this.d(6, ((qj) this).field_X);
            ((qj) this).field_X = null;
            ((qj) this).field_Y.field_w = 0;
            return;
          } else {
            this.d(6, ((qj) this).field_X);
            ((qj) this).field_X = null;
            ((qj) this).field_Y.field_w = 0;
            return;
          }
        }
    }

    private final void d(int param0, uj param1) {
        try {
            if (!(((qj) this).field_Y == null)) {
                ((qj) this).field_Y.b(4);
            }
            if (param1 == null) {
                ((qj) this).field_Y = new ie();
            } else {
                param1.a(6, param1.field_i, (byte) 125, param1.field_f, ((qj) this).field_db + 6);
                ((qj) this).field_Y = new ie(param1);
            }
            ((qj) this).a(true, (uj) (Object) ((qj) this).field_Y);
            ((qj) this).field_X = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qj.FA(" + 6 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = StarCannon.field_A;
        if (null != ((qj) this).field_Z) {
          if (na.field_e != ((qj) this).field_Z) {
            if (((qj) this).field_Z == w.field_w) {
              int fieldTemp$2 = ((qj) this).field_ab + 1;
              ((qj) this).field_ab = ((qj) this).field_ab + 1;
              if (fieldTemp$2 != ((qj) this).field_bb) {
                ((qj) this).field_Y.field_w = (((qj) this).field_ab << 8) / ((qj) this).field_bb;
                return super.g((byte) -124);
              } else {
                ((qj) this).field_Z = null;
                ((qj) this).field_Y.field_w = 256;
                return super.g((byte) -124);
              }
            } else {
              return super.g((byte) -124);
            }
          } else {
            int fieldTemp$3 = ((qj) this).field_ab + 1;
            ((qj) this).field_ab = ((qj) this).field_ab + 1;
            if (fieldTemp$3 != ((qj) this).field_W) {
              ((qj) this).field_Y.field_w = -((((qj) this).field_ab << 8) / ((qj) this).field_W) + 256;
              return super.g((byte) -124);
            } else {
              ((qj) this).field_Z = sk.field_c;
              ((qj) this).b(((qj) this).field_X.field_i + 12, ((qj) this).field_X.field_f + ((qj) this).field_db + 12, (byte) 120, ((qj) this).field_cb);
              ((qj) this).field_Y.field_w = 0;
              ((qj) this).field_ab = 0;
              return super.g((byte) -124);
            }
          }
        } else {
          return super.g((byte) -124);
        }
    }

    final void j(int param0) {
        if (null != ((qj) this).field_Z) {
          if (w.field_w == ((qj) this).field_Z) {
            ((qj) this).field_Y.field_w = 256;
            ((qj) this).field_Z = null;
            super.j(-119);
            if (param0 <= -104) {
              return;
            } else {
              boolean discarded$6 = ((qj) this).i(123);
              return;
            }
          } else {
            ((qj) this).b(12 + ((qj) this).field_X.field_i, (byte) 57, ((qj) this).field_X.field_f + (((qj) this).field_db + 12));
            this.d(6, ((qj) this).field_X);
            ((qj) this).field_Y.field_w = 256;
            ((qj) this).field_Z = null;
            super.j(-119);
            if (param0 > -104) {
              boolean discarded$7 = ((qj) this).i(123);
              return;
            } else {
              return;
            }
          }
        } else {
          super.j(-119);
          if (param0 <= -104) {
            return;
          } else {
            boolean discarded$8 = ((qj) this).i(123);
            return;
          }
        }
    }

    public static void l() {
        field_V = null;
        field_eb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Create a free Account";
    }
}
