/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private be field_i;
    private eb field_h;
    private eb field_a;
    static qd field_b;
    private int field_d;
    private mg field_e;
    private eb field_f;
    private DataInputStream field_g;
    private java.net.URL field_c;

    final static void a(byte param0, mg param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            fd.field_f = param1.j(98203176) << 71847173;
            var2_int = param1.b((byte) 90);
            fd.field_f = fd.field_f + (var2_int >> -387603965);
            cc.field_l = (var2_int & 7) << -325254638;
            cc.field_l = cc.field_l + (param1.j(98203176) << 1766675042);
            var2_int = param1.b((byte) 90);
            oh.field_b = (var2_int & 63) << 1895327631;
            cc.field_l = cc.field_l + (var2_int >> -1518330426);
            oh.field_b = oh.field_b + (param1.b((byte) 90) << -1196840697);
            var2_int = param1.b((byte) 90);
            oh.field_b = oh.field_b + (var2_int >> 2014290945);
            h.field_E = (var2_int & 1) << -1865083952;
            h.field_E = h.field_E + param1.j(param0 + 98203261);
            if (param0 == -85) {
              break L0;
            } else {
              field_b = (qd) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("uj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void c(byte param0) {
        L0: {
          lb.a(true);
          if (null != tf.field_f) {
            hl.a(tf.field_f, 106);
            break L0;
          } else {
            break L0;
          }
        }
        fd.b(-82);
        km.b(-100);
        af.a(109);
        if (!uj.a((byte) -36)) {
          th.a(106);
          if (param0 == 63) {
            return;
          } else {
            uj.c(33);
            return;
          }
        } else {
          uk.field_b.i(1, -53);
          bh.a(0, -1);
          th.a(106);
          if (param0 == 63) {
            return;
          } else {
            uj.c(33);
            return;
          }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            int stackIn_7_0 = 0;
            Throwable decompiledCaughtException = null;
            var4 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    if (this.field_e.field_j.length <= this.field_e.field_i) {
                      break L2;
                    } else {
                      var1_int = this.field_g.read(this.field_e.field_j, this.field_e.field_i, this.field_e.field_j.length + -this.field_e.field_i);
                      stackIn_7_0 = var1_int;

                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (stackIn_7_0 < 0) {
                          break L2;
                        } else {
                          this.field_e.field_i = this.field_e.field_i + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_7_0 = this.field_e.field_j.length ^ -1;
                  break L1;
                }
                if (stackIn_7_0 == (this.field_e.field_i ^ -1)) {
                  throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_e.field_j.length + " " + this.field_c));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L3: {
                      this.finalize();
                      this.field_d = 3;
                      break L3;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L4: {
                  this.finalize();
                  this.field_d = this.field_d + 1;
                  break L4;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet b(byte param0) {
        if (param0 != -120) {
            uj.b((byte) 89);
            if (!(mj.field_j == null)) {
                return mj.field_j;
            }
            return (java.applet.Applet) ((Object) aj.field_b);
        }
        if (!(mj.field_j == null)) {
            return mj.field_j;
        }
        return (java.applet.Applet) ((Object) aj.field_b);
    }

    final static boolean a(int[] param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        hc var5_ref_hc = null;
        int var5 = 0;
        int var6_int = 0;
        hc var6 = null;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (da.field_r != dh.field_bb) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var2_int = 28 / ((param1 - 65) / 36);
                        var3 = ji.b(125);
                        if (0 == hf.field_i) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((vb.field_i ^ -1) <= -1) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5_ref_hc = (hc) ((Object) t.field_q.b((byte) 121));
                        if (var5_ref_hc == null) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var5_ref_hc.field_h ^ -1L) <= (var3 ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5_ref_hc.b(57);
                        tf.field_c = var5_ref_hc.field_m.length;
                        cd.field_t.field_i = 0;
                        var6_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var6_int >= tf.field_c) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        cd.field_t.field_j[var6_int] = var5_ref_hc.field_m[var6_int];
                        var6_int++;
                        if (var8 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        lh.field_c = fe.field_b;
                        fe.field_b = ce.field_d;
                        ce.field_d = ab.field_l;
                        ab.field_l = var5_ref_hc.field_g;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    stackIn_20_0 = -1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = -1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackIn_20_0 = -1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 < (vb.field_i ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        cd.field_t.field_i = 0;
                        if (va.a(true, 1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    try {
                        vb.field_i = cd.field_t.o(-75);
                        cd.field_t.field_i = 0;
                        tf.field_c = param0[vb.field_i];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (ce.a(-106)) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 29: {
                    try {
                        if (hf.field_i == 0) {
                            statePc = 42;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5 = hf.field_i;
                        if (tk.field_q != 0.0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5 = (int)((double)var5 + tl.field_f.nextGaussian() * tk.field_q);
                        if (-1 < (var5 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6 = new hc(var3 + (long)var5, vb.field_i, new byte[tf.field_c]);
                        var7 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var7 >= tf.field_c) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6.field_m[var7] = cd.field_t.field_j[var7];
                        var7++;
                        if (var8 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        t.field_q.a(-97, var6);
                        vb.field_i = -1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        lh.field_c = fe.field_b;
                        fe.field_b = ce.field_d;
                        ce.field_d = ab.field_l;
                        ab.field_l = vb.field_i;
                        vb.field_i = -1;
                        stackIn_43_0 = 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0 != 0;
                }
                case 44: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_46_0 = (RuntimeException) (var2);
                    stackIn_45_0 = stackIn_46_0;
                    stackIn_46_1 = new StringBuilder().append("uj.G(");
                    stackIn_45_1 = stackIn_46_1;
                    if (param0 == null) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_47_2 = "{...}";
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_47_2 = "null";
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    throw dd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mg a(int param0) {
        if (!(-4 != (this.field_d ^ -1))) {
            return this.field_e;
        }
        if (param0 == 5) {
            return null;
        }
        return (mg) null;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 == 0) {
            return;
        }
        uj.c(113);
    }

    private final static boolean a(byte param0) {
        if (param0 == -36) {
          if (p.field_d != null) {
            if (!dh.field_bb.a((byte) 74)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (qd) null;
          if (p.field_d != null) {
            if (!dh.field_bb.a((byte) 74)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    protected final void finalize() {
        if (!(null == this.field_a)) {
            if (!(this.field_a.field_g == null)) {
                try {
                    ((DataInputStream) (this.field_a.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (!(null == this.field_f)) {
            if (!(this.field_f.field_g == null)) {
                try {
                    ((java.net.Socket) (this.field_f.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (null != this.field_g) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_h = null;
    }

    final synchronized boolean b(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (-3 >= (this.field_d ^ -1)) {
          return true;
        } else {
          L0: {
            if (param0 < -2) {
              break L0;
            } else {
              this.field_a = (eb) null;
              break L0;
            }
          }
          L1: {
            if (0 != this.field_d) {
              break L1;
            } else {
              L2: {
                if (this.field_a == null) {
                  this.field_a = this.field_i.a(this.field_c, (byte) -49);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (this.field_a.field_a != 0) {
                if ((this.field_a.field_a ^ -1) != -2) {
                  this.field_a = null;
                  this.field_d = this.field_d + 1;
                  return false;
                } else {
                  break L1;
                }
              } else {
                return false;
              }
            }
          }
          L3: {
            if (-2 != (this.field_d ^ -1)) {
              break L3;
            } else {
              L4: {
                if (null != this.field_f) {
                  break L4;
                } else {
                  this.field_f = this.field_i.a(443, 0, this.field_c.getHost());
                  break L4;
                }
              }
              if (-1 == (this.field_f.field_a ^ -1)) {
                return false;
              } else {
                if (this.field_f.field_a != 1) {
                  this.field_f = null;
                  this.field_d = this.field_d + 1;
                  return false;
                } else {
                  break L3;
                }
              }
            }
          }
          L5: {
            if (null != this.field_g) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (this.field_d == 0) {
                      this.field_g = (DataInputStream) (this.field_a.field_g);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (this.field_d == 1) {
                      var4 = (java.net.Socket) (this.field_f.field_g);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
                      var3.write(oc.a(true, var5));
                      this.field_g = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_e.field_i = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_d = this.field_d + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (null == this.field_h) {
                    this.field_h = this.field_i.a(314572800, 5, (Runnable) (this));
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (this.field_h.field_a != 0) {
                  if (1 != this.field_h.field_a) {
                    this.finalize();
                    this.field_d = this.field_d + 1;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L5;
              }
            }
          }
          L11: {
            if (null == this.field_h) {
              this.field_h = this.field_i.a(314572800, 5, (Runnable) (this));
              break L11;
            } else {
              break L11;
            }
          }
          if (this.field_h.field_a != 0) {
            if (1 != this.field_h.field_a) {
              this.finalize();
              this.field_d = this.field_d + 1;
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    uj(be param0, java.net.URL param1, int param2) {
        try {
            this.field_i = param0;
            this.field_c = param1;
            this.field_e = new mg(param2);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = new qd();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
