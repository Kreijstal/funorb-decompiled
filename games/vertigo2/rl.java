/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends sp {
    private sq field_cb;
    private int field_eb;
    private int field_Y;
    private wq field_bb;
    private iq field_Z;
    static int field_db;
    private int field_ab;
    private int field_W;
    private int field_X;

    final boolean a(int param0) {
        ((rl) this).f((byte) -23);
        if (param0 != -1) {
            ((rl) this).f((byte) -90);
            return super.a(-1);
        }
        return super.a(-1);
    }

    final void a(byte param0) {
        if (((rl) this).field_cb == nh.field_m) {
          return;
        } else {
          if (param0 >= -19) {
            ((rl) this).field_W = 26;
            ((rl) this).field_cb = id.field_g;
            ((rl) this).field_eb = 0;
            this.b(13693, ((rl) this).field_Z);
            ((rl) this).field_Z = null;
            ((rl) this).field_bb.field_J = 0;
            return;
          } else {
            ((rl) this).field_cb = id.field_g;
            ((rl) this).field_eb = 0;
            this.b(13693, ((rl) this).field_Z);
            ((rl) this).field_Z = null;
            ((rl) this).field_bb.field_J = 0;
            return;
          }
        }
    }

    final static ge a(r param0, int param1, r param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        ge stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ge stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
            var5_int = param0.a((byte) 120, param3);
            if (param1 == 12) {
              var6 = param0.a(var5_int, param4, 117);
              stackOut_3_0 = vg.a(var5_int, var6, param1 ^ -13, param0, param2);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ge) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("rl.G(");
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_4_0;
    }

    boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
              L1: {
                if (((rl) this).field_bb == null) {
                  break L1;
                } else {
                  L2: {
                    if (param2 == 98) {
                      boolean discarded$4 = ((rl) this).field_bb.a((byte) 116, param3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (99 != param2) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((rl) this).field_bb.a((byte) 116, param3);
                    return false;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("rl.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    boolean j(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (((rl) this).field_cb != null) {
          if (nh.field_m != ((rl) this).field_cb) {
            if (((rl) this).field_cb == id.field_g) {
              int fieldTemp$2 = ((rl) this).field_eb + 1;
              ((rl) this).field_eb = ((rl) this).field_eb + 1;
              if (((rl) this).field_ab == fieldTemp$2) {
                ((rl) this).field_cb = null;
                ((rl) this).field_bb.field_J = 256;
                if (param0 != 17) {
                  var4 = null;
                  ((rl) this).a(true, (iq) null);
                  return super.j(17);
                } else {
                  return super.j(17);
                }
              } else {
                ((rl) this).field_bb.field_J = (((rl) this).field_eb << 8) / ((rl) this).field_ab;
                if (param0 != 17) {
                  var4 = null;
                  ((rl) this).a(true, (iq) null);
                  return super.j(17);
                } else {
                  return super.j(17);
                }
              }
            } else {
              if (param0 != 17) {
                var4 = null;
                ((rl) this).a(true, (iq) null);
                return super.j(17);
              } else {
                return super.j(17);
              }
            }
          } else {
            int fieldTemp$3 = ((rl) this).field_eb + 1;
            ((rl) this).field_eb = ((rl) this).field_eb + 1;
            if (fieldTemp$3 == ((rl) this).field_Y) {
              ((rl) this).field_cb = gf.field_f;
              ((rl) this).a(((rl) this).field_X, 12 - -((rl) this).field_Z.field_n, ((rl) this).field_W + 12 - -((rl) this).field_Z.field_s, (byte) 118);
              ((rl) this).field_eb = 0;
              ((rl) this).field_bb.field_J = 0;
              if (param0 == 17) {
                return super.j(17);
              } else {
                var4 = null;
                ((rl) this).a(true, (iq) null);
                return super.j(17);
              }
            } else {
              ((rl) this).field_bb.field_J = 256 + -((((rl) this).field_eb << 8) / ((rl) this).field_Y);
              if (param0 == 17) {
                return super.j(17);
              } else {
                var4 = null;
                ((rl) this).a(true, (iq) null);
                return super.j(17);
              }
            }
          }
        } else {
          if (param0 != 17) {
            var4 = null;
            ((rl) this).a(true, (iq) null);
            return super.j(17);
          } else {
            return super.j(17);
          }
        }
    }

    rl(sd param0, iq param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, param1.field_s + (param2 + 12));
        try {
            ((rl) this).field_X = param4;
            ((rl) this).field_W = param2;
            ((rl) this).field_ab = param3;
            ((rl) this).field_Y = param3;
            this.b(13693, param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void b(int param0, iq param1) {
        if (((rl) this).field_bb != null) {
            ((rl) this).field_bb.c(2);
        }
        if (param1 == null) {
            ((rl) this).field_bb = new wq();
        } else {
            param1.a(false, 6, ((rl) this).field_W + 6, param1.field_s, param1.field_n);
            ((rl) this).field_bb = new wq(param1);
        }
        ((rl) this).c((byte) -61, (iq) (Object) ((rl) this).field_bb);
        if (param0 != 13693) {
            return;
        }
        try {
            ((rl) this).field_Z = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rl.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    void a(boolean param0, iq param1) {
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
              if (!param0) {
                break L1;
              } else {
                ((rl) this).f((byte) 75);
                break L1;
              }
            }
            ((rl) this).field_Z = param1;
            if (gf.field_f == ((rl) this).field_cb) {
              ((rl) this).a(((rl) this).field_X, 12 + ((rl) this).field_Z.field_n, ((rl) this).field_W + 12 - -((rl) this).field_Z.field_s, (byte) 61);
              ((rl) this).field_eb = 0;
              return;
            } else {
              if (nh.field_m == ((rl) this).field_cb) {
                break L0;
              } else {
                ((rl) this).field_eb = 0;
                ((rl) this).field_cb = nh.field_m;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("rl.B(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void f(byte param0) {
        if (null == ((rl) this).field_cb) {
            super.f(param0);
            return;
        }
        if (id.field_g != ((rl) this).field_cb) {
            ((rl) this).b(-1535749535, ((rl) this).field_Z.field_n + 12, 12 - -((rl) this).field_W + ((rl) this).field_Z.field_s);
            this.b(param0 + 13716, ((rl) this).field_Z);
        } else {
            ((rl) this).field_bb.field_J = 256;
            ((rl) this).field_cb = null;
            super.f(param0);
            return;
        }
        ((rl) this).field_bb.field_J = 256;
        ((rl) this).field_cb = null;
        super.f(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = -1;
    }
}
