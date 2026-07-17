/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ij extends lc implements tsa {
    private boolean field_W;
    private static String[] field_Z;
    private boolean field_bb;
    private il field_ab;
    private boolean field_V;
    private boolean field_Y;
    private rk field_cb;
    private static String[] field_db;
    static nh field_X;

    public void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param4 > 44) {
              break L0;
            } else {
              ((ij) this).field_cb = null;
              break L0;
            }
          }
          if (((ij) this).field_Y) {
            jsa.a(false, 3);
            ((ij) this).i((byte) -124);
            return;
          } else {
            jc.a("tochangedisplayname.ws", di.a(72), (byte) -68);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ij.M(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_6_0 = false;
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
              if (param3) {
                break L1;
              } else {
                field_X = null;
                break L1;
              }
            }
            if (13 == param2) {
              ((ij) this).i((byte) -115);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              stackOut_6_0 = super.a(param0, param1, param2, true);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ij.P(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final void f(boolean param0) {
        sr var2 = null;
        ((ij) this).field_cb.a(param0, 4210752, 2121792);
        if (!param0) {
          ((ij) this).field_Y = false;
          var2 = new sr((ij) this, ((ij) this).field_ab, fua.field_e);
          var2.a(sra.field_i, 15, -127);
          ((ij) this).a(101, (ae) (Object) var2);
          return;
        } else {
          var2 = new sr((ij) this, ((ij) this).field_ab, fua.field_e);
          var2.a(sra.field_i, 15, -127);
          ((ij) this).a(101, (ae) (Object) var2);
          return;
        }
    }

    final static void j() {
        if (ej.field_a != null) {
          L0: {
            ej.field_a.h(-1);
            if (null != ena.field_p) {
              ena.field_p.f(12936);
              break L0;
            } else {
              break L0;
            }
          }
          jr.b((byte) -106);
          return;
        } else {
          L1: {
            if (null != ena.field_p) {
              ena.field_p.f(12936);
              break L1;
            } else {
              break L1;
            }
          }
          jr.b((byte) -106);
          return;
        }
    }

    public static void f() {
        field_db = null;
        field_Z = null;
        field_X = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 6) {
          ij.a(-35, -13, -25, -10, -41, -25);
          tga.field_a.c(fm.a(false, param4), param0, param2, param3, param5 + -22977, param1);
          return;
        } else {
          tga.field_a.c(fm.a(false, param4), param0, param2, param3, param5 + -22977, param1);
          return;
        }
    }

    ij(jta param0, il param1, String param2, boolean param3, boolean param4) {
        super(param0, (ae) (Object) new sr((ij) null, param1, param2), 77, 10, 10);
        try {
            ((ij) this).field_ab = param1;
            ((ij) this).field_bb = param4 ? true : false;
            ((ij) this).field_W = false;
            ((ij) this).field_Y = false;
            ((ij) this).field_V = param3 ? true : false;
            ((ij) this).field_cb = new rk(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ij) this).field_cb.field_D = true;
            ((ij) this).a((ae) (Object) ((ij) this).field_cb, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ij.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException var4 = null;
        sr var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        sr var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sr stackIn_12_0 = null;
        sr stackIn_13_0 = null;
        sr stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sr stackOut_11_0 = null;
        sr stackOut_13_0 = null;
        String stackOut_13_1 = null;
        sr stackOut_12_0 = null;
        String stackOut_12_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((ij) this).field_W) {
              return;
            } else {
              L1: {
                if (param1 >= 39) {
                  break L1;
                } else {
                  var6 = null;
                  boolean discarded$3 = ((ij) this).a('F', (ae) null, 118, true);
                  break L1;
                }
              }
              L2: {
                ((ij) this).field_W = true;
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0 != 256) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                ((ij) this).field_Y = stackIn_9_1 != 0;
                ((ij) this).field_cb.a(true, 4210752, 8405024);
                var7 = new sr((ij) this, ((ij) this).field_ab, param2);
                var4_ref = var7;
                if (param0 == 5) {
                  var7.a(sba.field_n, 11, 61);
                  var7.a(nj.field_q, 17, 36);
                  break L3;
                } else {
                  if (param0 == 256) {
                    rj discarded$4 = var7.a(nga.field_q, (byte) -102, (qc) this);
                    break L3;
                  } else {
                    L4: {
                      stackOut_11_0 = (sr) var7;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (((ij) this).field_V) {
                        stackOut_13_0 = (sr) (Object) stackIn_13_0;
                        stackOut_13_1 = nga.field_q;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L4;
                      } else {
                        stackOut_12_0 = (sr) (Object) stackIn_12_0;
                        stackOut_12_1 = sm.field_o;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L4;
                      }
                    }
                    ((sr) (Object) stackIn_14_0).a(stackIn_14_1, -1, 78);
                    break L3;
                  }
                }
              }
              L5: {
                if (3 == param0) {
                  var7.a(tca.field_M, 7, 28);
                  break L5;
                } else {
                  if (param0 != 4) {
                    if (param0 != 6) {
                      if (param0 == 9) {
                        rj discarded$5 = var7.a(epa.field_q, (byte) -102, (qc) this);
                        break L5;
                      } else {
                        ((ij) this).a(95, (ae) (Object) var7);
                        return;
                      }
                    } else {
                      var7.a(vf.field_a, 9, -65);
                      break L5;
                    }
                  } else {
                    var7.a(bg.field_p, 8, -83);
                    break L5;
                  }
                }
              }
              ((ij) this).a(95, (ae) (Object) var7);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("ij.O(").append(param0).append(44).append(param1).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    final void i(byte param0) {
        int var2 = 0;
        if (((ij) this).field_B) {
          var2 = -25 / ((-69 - param0) / 37);
          ((ij) this).field_B = false;
          if (!((ij) this).field_V) {
            if (!((ij) this).field_bb) {
              return;
            } else {
              int discarded$4 = 30497;
              vg.q();
              return;
            }
          } else {
            int discarded$5 = -72;
            kla.a();
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new String[6];
        field_db[4] = "Pulse (Fast)";
        field_db[2] = "Flicker (Fast)";
        field_Z = new String[3];
        field_db[1] = "Glow";
        field_db[0] = "Flat";
        field_db[3] = "Flicker (Slow)";
        field_db[5] = "Pulse (Slow)";
        field_Z[0] = "Shallow";
        field_Z[1] = "Medium";
        field_Z[2] = "Deep";
    }
}
