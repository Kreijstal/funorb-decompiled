/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk extends wf {
    private fe field_hb;
    static int[] field_ib;
    private int field_kb;
    static boolean[] field_gb;
    private gh field_cb;
    private int field_eb;
    static int[] field_db;
    private int field_fb;
    static bg field_jb;
    static String field_lb;
    private int field_mb;
    private int field_Z;
    static int field_ab;
    private oj field_bb;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
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
              try {
                if (param1 > 47) {
                  var3 = new java.net.URL(param0.getCodeBase(), param2);
                  var3 = nn.a(105, param0, var3);
                  cn.a(param0, var3.toString(), 11050, true);
                  return;
                } else {
                  return;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var3_ref2;
                stackOut_6_1 = new StringBuilder().append("jk.I(");
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
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              L1: {
                stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param2 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L1;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L1;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(byte param0, fe param1) {
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
            ((jk) this).field_hb = param1;
            if (param0 <= -30) {
              if (o.field_a == ((jk) this).field_cb) {
                ((jk) this).a(((jk) this).field_mb, true, ((jk) this).field_hb.field_v + 12, ((jk) this).field_hb.field_q + ((jk) this).field_fb + 12);
                ((jk) this).field_kb = 0;
                return;
              } else {
                if (ah.field_a == ((jk) this).field_cb) {
                  break L0;
                } else {
                  ((jk) this).field_kb = 0;
                  ((jk) this).field_cb = ah.field_a;
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
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jk.H(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void o(int param0) {
        if (null == ((jk) this).field_cb) {
            super.o(param0);
            return;
        }
        if (lm.field_O != ((jk) this).field_cb) {
            ((jk) this).a(((jk) this).field_hb.field_q + 12 + ((jk) this).field_fb, ((jk) this).field_hb.field_v + 12, (byte) 55);
            this.b(28199, ((jk) this).field_hb);
        } else {
            ((jk) this).field_bb.field_L = 256;
            ((jk) this).field_cb = null;
            super.o(param0);
            return;
        }
        ((jk) this).field_bb.field_L = 256;
        ((jk) this).field_cb = null;
        super.o(param0);
    }

    private final void b(int param0, fe param1) {
        try {
            if (!(null == ((jk) this).field_bb)) {
                ((jk) this).field_bb.b(34);
            }
            if (param1 != null) {
                param1.a(param1.field_q, -38, 6, param1.field_v, ((jk) this).field_fb + 6);
                ((jk) this).field_bb = new oj(param1);
            } else {
                ((jk) this).field_bb = new oj();
            }
            ((jk) this).a(-1, (fe) (Object) ((jk) this).field_bb);
            ((jk) this).field_hb = null;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "jk.N(" + 28199 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h() {
        field_jb = null;
        field_ib = null;
        field_gb = null;
        field_db = null;
        field_lb = null;
        int var1 = -24;
    }

    final static void a(int param0, vf param1, Object param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (null != param1.field_p) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param1.field_p.peekEvent()) {
                      break L2;
                    } else {
                      int discarded$2 = -10309;
                      gf.a(1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("jk.M(").append(-23765).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final void b(boolean param0) {
        if (((jk) this).field_cb != ah.field_a) {
          ((jk) this).field_kb = 0;
          ((jk) this).field_cb = lm.field_O;
          this.b(28199, ((jk) this).field_hb);
          ((jk) this).field_bb.field_L = 0;
          if (!param0) {
            return;
          } else {
            ((jk) this).field_hb = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        ((jk) this).o(24619);
        return super.a(param0);
    }

    boolean a(char param0, fe param1, byte param2, int param3) {
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
            if (super.a(param0, param1, (byte) -79, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((jk) this).field_bb != null) {
                L1: {
                  if (98 == param3) {
                    boolean discarded$4 = ((jk) this).field_bb.a(param1, 120);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (99 == param3) {
                    boolean discarded$5 = ((jk) this).field_bb.a(param1, 120);
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
            stackOut_14_1 = new StringBuilder().append("jk.K(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -79 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    boolean n(int param0) {
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (null != ((jk) this).field_cb) {
          if (ah.field_a == ((jk) this).field_cb) {
            int fieldTemp$2 = ((jk) this).field_kb + 1;
            ((jk) this).field_kb = ((jk) this).field_kb + 1;
            if (fieldTemp$2 != ((jk) this).field_eb) {
              ((jk) this).field_bb.field_L = -((((jk) this).field_kb << 8) / ((jk) this).field_eb) + 256;
              return super.n(-4);
            } else {
              ((jk) this).field_cb = o.field_a;
              ((jk) this).a(((jk) this).field_mb, true, 12 + ((jk) this).field_hb.field_v, 12 - (-((jk) this).field_fb + -((jk) this).field_hb.field_q));
              ((jk) this).field_bb.field_L = 0;
              ((jk) this).field_kb = 0;
              return super.n(-4);
            }
          } else {
            if (((jk) this).field_cb == lm.field_O) {
              int fieldTemp$3 = ((jk) this).field_kb + 1;
              ((jk) this).field_kb = ((jk) this).field_kb + 1;
              if (fieldTemp$3 == ((jk) this).field_Z) {
                ((jk) this).field_bb.field_L = 256;
                ((jk) this).field_cb = null;
                return super.n(-4);
              } else {
                ((jk) this).field_bb.field_L = (((jk) this).field_kb << 8) / ((jk) this).field_Z;
                return super.n(-4);
              }
            } else {
              return super.n(-4);
            }
          }
        } else {
          return super.n(-4);
        }
    }

    jk(hm param0, fe param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_v, param1.field_q + param2 + 12);
        try {
            ((jk) this).field_fb = param2;
            ((jk) this).field_mb = param4;
            ((jk) this).field_Z = param3;
            ((jk) this).field_eb = param3;
            this.b(28199, param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Loading Super Volcano...";
        field_ib = new int[128];
        field_ab = 0;
        field_jb = new bg(7, 0, 1, 1);
    }
}
