/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_g;
    static String field_a;
    static cc field_b;
    volatile boolean field_e;
    static int field_c;
    static String field_f;
    static int[] field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ql.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static lm a(ji param0, byte param1, int param2, int param3, ji param4) {
        RuntimeException var5 = null;
        lm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 41) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (gb.a(param3, param0, param2, 56)) {
              stackIn_6_0 = w.a(param4.a(param2, -117, param3), (byte) -5);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ql.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    ql() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0, byte param1) {
        int var2 = -50 % ((param1 - -51) / 49);
        qm.a((byte) 57);
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
            return false;
        }
        return !wl.field_p ? true : false;
    }

    final static void a(vj param0, int param1, int param2) {
        bh var3 = null;
        int var4_int = 0;
        vj var4 = null;
        bh var5 = null;
        bh var6 = null;
        uk var7 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            if ((param2 ^ -1) >= -2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param0.field_c.field_b;
              var4_int = 0;
              if (param1 < -114) {
                L1: while (true) {
                  if (param2 <= var4_int) {
                    var4 = new vj();
                    param0.a(-128, var3, var4);
                    ql.a(param0, -117, (1 + param2) / 2);
                    ql.a(var4, -127, param2 / 2);
                    var5 = param0.field_c.field_b;
                    L2: while (true) {
                      var6 = var4.field_c.field_b;
                      if (var4.field_c != var6) {
                        var7 = (uk) ((Object) var6);
                        L3: while (true) {
                          if (param0.field_c == var5) {
                            fm.a((byte) 113, var7, var5);
                            continue L2;
                          } else {
                            if (var7.field_o <= ((uk) ((Object) var5)).field_o) {
                              fm.a((byte) 113, var7, var5);
                              continue L2;
                            } else {
                              var5 = var5.field_b;
                              continue L3;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    var3 = var3.field_b;
                    var4_int += 2;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ql.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 > -70) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void c(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ik.field_f;
        synchronized (var1) {
          L0: {
            L1: {
              pf.field_g = pf.field_g + 1;
              be.field_n = pa.field_bb;
              bh.field_g = lc.field_f;
              if (param0 == -2) {
                break L1;
              } else {
                ql.c(-55);
                break L1;
              }
            }
            pm.field_f = te.field_r;
            pm.field_b = ml.field_b;
            ml.field_b = false;
            ig.field_Yb = nk.field_l;
            he.field_S = ge.field_a;
            nf.field_h = qa.field_t;
            nk.field_l = 0;
            break L0;
          }
        }
    }

    final void a(fd param0, int param1) {
        try {
            if (param1 <= 4) {
                fd var4 = (fd) null;
                this.a((fd) null, 55);
            }
            wj.a(true, this.field_g, param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ql.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    static {
        field_a = "Month";
        field_f = "Reject";
    }
}
