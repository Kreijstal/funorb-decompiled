/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class n extends v {
    static int[][][] field_db;
    private int field_hb;
    private int field_nb;
    private int field_gb;
    static String field_fb;
    private int field_bb;
    private hi field_eb;
    static int[][][] field_kb;
    private p field_mb;
    private ee field_ib;
    static mi field_cb;
    static int field_jb;
    private int field_lb;

    final static void g(byte param0) {
        String var1 = null;
        int var2 = 0;
        if (eb.field_m) {
          if (da.field_c != null) {
            da.field_c.o(77);
            var1 = pd.f((byte) 48);
            kb.field_O = new fg(var1, (String) null, true, false, false);
            t.field_b.a((byte) 69, (ee) (Object) bg.field_K);
            bg.field_K.c(0, (ee) (Object) kb.field_O);
            bg.field_K.d(true);
            var2 = -9;
            return;
          } else {
            var1 = pd.f((byte) 48);
            kb.field_O = new fg(var1, (String) null, true, false, false);
            t.field_b.a((byte) 69, (ee) (Object) bg.field_K);
            bg.field_K.c(0, (ee) (Object) kb.field_O);
            bg.field_K.d(true);
            var2 = -9;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void l(int param0) {
        field_cb = null;
        if (param0 != 5) {
          n.l(-121);
          field_db = null;
          field_fb = null;
          field_kb = null;
          return;
        } else {
          field_db = null;
          field_fb = null;
          field_kb = null;
          return;
        }
    }

    n(si param0, ee param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, 12 + param2 + param1.field_l);
        try {
            ((n) this).field_bb = param3;
            ((n) this).field_nb = param3;
            ((n) this).field_hb = param4;
            ((n) this).field_gb = param2;
            this.b(param1, 18744);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (null != ((n) this).field_mb) {
          if (v.field_Y == ((n) this).field_mb) {
            int fieldTemp$2 = ((n) this).field_lb + 1;
            ((n) this).field_lb = ((n) this).field_lb + 1;
            if (fieldTemp$2 == ((n) this).field_nb) {
              ((n) this).field_mb = ng.field_C;
              ((n) this).a(((n) this).field_gb + (12 - -((n) this).field_ib.field_l), ((n) this).field_hb, ((n) this).field_ib.field_p + 12, false);
              ((n) this).field_eb.field_H = 0;
              ((n) this).field_lb = 0;
              if (param0 != 1) {
                return false;
              } else {
                return super.j(1);
              }
            } else {
              ((n) this).field_eb.field_H = -((((n) this).field_lb << 8) / ((n) this).field_nb) + 256;
              if (param0 != 1) {
                return false;
              } else {
                return super.j(1);
              }
            }
          } else {
            if (((n) this).field_mb != ac.field_c) {
              if (param0 != 1) {
                return false;
              } else {
                return super.j(1);
              }
            } else {
              int fieldTemp$3 = ((n) this).field_lb + 1;
              ((n) this).field_lb = ((n) this).field_lb + 1;
              if (fieldTemp$3 == ((n) this).field_bb) {
                ((n) this).field_mb = null;
                ((n) this).field_eb.field_H = 256;
                if (param0 != 1) {
                  return false;
                } else {
                  return super.j(1);
                }
              } else {
                ((n) this).field_eb.field_H = (((n) this).field_lb << 8) / ((n) this).field_bb;
                if (param0 != 1) {
                  return false;
                } else {
                  return super.j(1);
                }
              }
            }
          }
        } else {
          if (param0 != 1) {
            return false;
          } else {
            return super.j(1);
          }
        }
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
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
            L1: {
              if (param2 > 9) {
                break L1;
              } else {
                ((n) this).k(41);
                break L1;
              }
            }
            if (!super.a(param0, param1, (byte) 33, param3)) {
              L2: {
                if (((n) this).field_eb == null) {
                  break L2;
                } else {
                  L3: {
                    if (98 == param0) {
                      boolean discarded$4 = ((n) this).field_eb.a(param3, 0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (99 != param0) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((n) this).field_eb.a(param3, 0);
                    return false;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("n.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void k(int param0) {
        if (!(v.field_Y != ((n) this).field_mb)) {
            return;
        }
        ((n) this).field_lb = 0;
        ((n) this).field_mb = ac.field_c;
        this.b(((n) this).field_ib, param0 ^ 18744);
        ((n) this).field_ib = null;
        ((n) this).field_eb.field_H = param0;
    }

    final void d(boolean param0) {
        if (null == ((n) this).field_mb) {
            super.d(param0);
            return;
        }
        if (((n) this).field_mb != ac.field_c) {
            ((n) this).b(0, ((n) this).field_ib.field_l + 12 + ((n) this).field_gb, 12 + ((n) this).field_ib.field_p);
            this.b(((n) this).field_ib, 18744);
        } else {
            ((n) this).field_eb.field_H = 256;
            ((n) this).field_mb = null;
            super.d(param0);
            return;
        }
        ((n) this).field_eb.field_H = 256;
        ((n) this).field_mb = null;
        super.d(param0);
    }

    private final void b(ee param0, int param1) {
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
              if (null == ((n) this).field_eb) {
                break L1;
              } else {
                ((n) this).field_eb.a(true);
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                ((n) this).field_eb = new hi();
                break L2;
              } else {
                param0.a((byte) 105, 6, param0.field_l, param0.field_p, 6 - -((n) this).field_gb);
                ((n) this).field_eb = new hi(param0);
                break L2;
              }
            }
            ((n) this).a(param1 + -18744, (ee) (Object) ((n) this).field_eb);
            ((n) this).field_ib = null;
            if (param1 == 18744) {
              break L0;
            } else {
              field_cb = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("n.AA(");
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
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    void c(int param0, ee param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              ((n) this).field_ib = param1;
              if (ng.field_C != ((n) this).field_mb) {
                if (v.field_Y != ((n) this).field_mb) {
                  ((n) this).field_lb = 0;
                  ((n) this).field_mb = v.field_Y;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ((n) this).a(12 - (-((n) this).field_gb - ((n) this).field_ib.field_l), ((n) this).field_hb, 12 - -((n) this).field_ib.field_p, false);
                ((n) this).field_lb = 0;
                break L1;
              }
            }
            if (param0 == 0) {
              break L0;
            } else {
              var4 = null;
              ((n) this).c(-2, (ee) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("n.P(").append(param0).append(44);
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
          throw oj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final boolean h(int param0) {
        ((n) this).d(true);
        if (param0 < 83) {
            return true;
        }
        return super.h(113);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Invalid password.";
        field_db = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
