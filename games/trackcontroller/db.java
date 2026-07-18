/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class db extends wd {
    private int field_U;
    static int field_X;
    private jb field_ab;
    private gl field_cb;
    private al field_V;
    private int field_T;
    static volatile int field_bb;
    private int field_S;
    private int field_Y;
    private int field_W;
    static int field_db;
    static int field_Z;

    final boolean k(int param0) {
        ((db) this).o(param0);
        return super.k(0);
    }

    final void o(int param0) {
        if (null == ((db) this).field_ab) {
            super.o(param0 + param0);
            return;
        }
        if (uj.field_b != ((db) this).field_ab) {
            ((db) this).a(((db) this).field_V.field_x + 12, (byte) -86, 12 - (-((db) this).field_W + -((db) this).field_V.field_u));
            this.b((byte) 19, ((db) this).field_V);
        } else {
            ((db) this).field_ab = null;
            ((db) this).field_cb.field_H = 256;
            super.o(param0 + param0);
            return;
        }
        ((db) this).field_ab = null;
        ((db) this).field_cb.field_H = 256;
        super.o(param0 + param0);
    }

    db(vl param0, al param1, int param2, int param3, int param4) {
        super(param0, param1.field_x + 12, param1.field_u + 12 - -param2);
        try {
            ((db) this).field_T = param3;
            ((db) this).field_Y = param3;
            ((db) this).field_W = param2;
            ((db) this).field_S = param4;
            this.b((byte) 19, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void b(al param0, int param1) {
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
              ((db) this).field_V = param0;
              if (dc.field_w != ((db) this).field_ab) {
                if (wi.field_c != ((db) this).field_ab) {
                  ((db) this).field_ab = wi.field_c;
                  ((db) this).field_U = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((db) this).a(((db) this).field_V.field_x + 12, ((db) this).field_S, false, ((db) this).field_W + 12 + ((db) this).field_V.field_u);
                ((db) this).field_U = 0;
                break L1;
              }
            }
            if (param1 <= -61) {
              break L0;
            } else {
              ((db) this).field_T = 115;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("db.O(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0, al param1) {
        try {
            if (param0 != 19) {
                Object var4 = null;
                this.b((byte) 30, (al) null);
            }
            if (!(null == ((db) this).field_cb)) {
                ((db) this).field_cb.a(-84);
            }
            if (param1 == null) {
                ((db) this).field_cb = new gl();
            } else {
                param1.a(param1.field_u, -3050, 6 + ((db) this).field_W, param1.field_x, 6);
                ((db) this).field_cb = new gl(param1);
            }
            ((db) this).a(false, (al) (Object) ((db) this).field_cb);
            ((db) this).field_V = null;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "db.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (null != ((db) this).field_ab) {
          if (wi.field_c != ((db) this).field_ab) {
            if (uj.field_b == ((db) this).field_ab) {
              int fieldTemp$2 = ((db) this).field_U + 1;
              ((db) this).field_U = ((db) this).field_U + 1;
              if (fieldTemp$2 == ((db) this).field_T) {
                ((db) this).field_cb.field_H = 256;
                ((db) this).field_ab = null;
                return super.j(-94);
              } else {
                ((db) this).field_cb.field_H = (((db) this).field_U << 8) / ((db) this).field_T;
                return super.j(-94);
              }
            } else {
              return super.j(-94);
            }
          } else {
            int fieldTemp$3 = ((db) this).field_U + 1;
            ((db) this).field_U = ((db) this).field_U + 1;
            if (((db) this).field_Y != fieldTemp$3) {
              ((db) this).field_cb.field_H = -((((db) this).field_U << 8) / ((db) this).field_Y) + 256;
              return super.j(-94);
            } else {
              ((db) this).field_ab = dc.field_w;
              ((db) this).a(((db) this).field_V.field_x + 12, ((db) this).field_S, false, ((db) this).field_V.field_u + 12 + ((db) this).field_W);
              ((db) this).field_cb.field_H = 0;
              ((db) this).field_U = 0;
              return super.j(-94);
            }
          }
        } else {
          return super.j(-94);
        }
    }

    final void a(byte param0) {
        if (wi.field_c != ((db) this).field_ab) {
          ((db) this).field_U = 0;
          ((db) this).field_ab = uj.field_b;
          this.b((byte) 19, ((db) this).field_V);
          ((db) this).field_V = null;
          if (param0 != -48) {
            return;
          } else {
            ((db) this).field_cb.field_H = 0;
            return;
          }
        } else {
          return;
        }
    }

    final static void b(boolean param0) {
        ob.a(209, gd.b((byte) 77));
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
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
            if (!super.a((byte) -76, param1, param2, param3)) {
              var5_int = -1;
              if (((db) this).field_cb != null) {
                L1: {
                  if (98 == param3) {
                    boolean discarded$4 = ((db) this).field_cb.a((byte) -126, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param3 == 99) {
                    boolean discarded$5 = ((db) this).field_cb.a((byte) -125, param2);
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
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("db.GA(").append(-104).append(',').append(param1).append(',');
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
          throw sl.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final static void a(int param0, int param1, qj param2, int param3, int param4, byte param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = 0;
              if (~param4 > ~ll.field_a) {
                var7 = ll.field_a - param4;
                param4 = ll.field_a;
                param3 = param3 - var7;
                var7 = var7 % param2.field_t;
                var6_int = var6_int + var7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 0;
              if (param1 < ll.field_b) {
                var8 = -param1 + ll.field_b;
                param1 = ll.field_b;
                param0 = param0 - var8;
                var8 = var8 % param2.field_q;
                var6_int = var6_int + param2.field_t * var8;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~ll.field_e > ~(param4 + param3)) {
                param3 = -param4 + ll.field_e;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 - -param0 <= ll.field_g) {
                break L4;
              } else {
                param0 = -param1 + ll.field_g;
                break L4;
              }
            }
            L5: {
              if (param3 <= 0) {
                break L5;
              } else {
                if (param0 <= 0) {
                  break L5;
                } else {
                  var9 = param1 * ll.field_d + param4;
                  ra.a(var9, param2.field_t, param0, var8, (byte) -64, ll.field_i, param3, param2.field_z, -param3 + ll.field_d, var7, var6_int, param2.field_q);
                  var10 = -25;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("db.M(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param3 + ',' + param4 + ',' + -128 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
        field_bb = 0;
    }
}
