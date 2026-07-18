/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rj extends ne {
    static String[] field_j;
    int field_v;
    boolean field_w;
    rj field_r;
    int field_m;
    en field_n;
    int field_t;
    static boolean field_o;
    int field_p;
    static String field_y;
    static int field_l;
    int field_x;
    static cn field_s;
    int field_q;
    static cn field_k;
    Object field_u;
    int field_i;

    final static byte[] a(wj param0, boolean param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var4_int = param0.j(-106, param2);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.j(-122, 3);
                var6 = (byte)param0.j(119, 8);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (byte)(var6 + param0.j(-73, var5));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param3;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("rj.V(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
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
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(false).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_16_0;
    }

    final boolean a(byte param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (((rj) this).field_w) {
          param2 = param2 - ((rj) this).field_t;
          param1 = param1 - ((rj) this).field_i;
          if (param0 >= 32) {
            L0: {
              L1: {
                if (0 > param2) {
                  break L1;
                } else {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (((rj) this).field_q <= param2) {
                      break L1;
                    } else {
                      if (((rj) this).field_x <= param1) {
                        break L1;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            return stackIn_10_0 != 0;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    void b(byte param0) {
        if (param0 != 30) {
            ((rj) this).d(-28, 91, -122);
        }
        ((rj) this).a(false);
    }

    final void d(int param0) {
        ((rj) this).b(param0, param0 ^ 8187, 0);
    }

    final void a(int param0) {
        if (param0 < 60) {
            ((rj) this).field_v = -29;
        }
        ((rj) this).a(0, 0, (byte) 124);
    }

    void a(boolean param0, int param1, int param2) {
        this.c(2, param2, param1);
        if (param0) {
            ((rj) this).b(-54, -3, 63);
        }
    }

    final void b(int param0, int param1, byte param2) {
        if (param0 == ((rj) this).field_t) {
            if (param1 == ((rj) this).field_i) {
                return;
            }
        }
        if (!((2 & ((rj) this).field_v) == 0)) {
            ((rj) this).field_i = ((rj) this).field_i + ((rj) this).field_x;
        }
        if (!(0 == (1 & ((rj) this).field_v))) {
            ((rj) this).field_t = ((rj) this).field_t + ((rj) this).field_q;
        }
        ((rj) this).e(-((rj) this).field_i + param1, param0 - ((rj) this).field_t, 108);
        if (0 != (((rj) this).field_v & 2)) {
            ((rj) this).field_i = ((rj) this).field_i - ((rj) this).field_x;
        }
        if (!((((rj) this).field_v & 1) == 0)) {
            ((rj) this).field_t = ((rj) this).field_t - ((rj) this).field_q;
        }
        if (param2 != 4) {
            ((rj) this).field_p = 44;
        }
    }

    void b(int param0, int param1, int param2) {
        if (param1 != 8187) {
            ((rj) this).field_p = 99;
        }
    }

    final static tj a(byte[] param0, int param1) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          if (param0 != null) {
            var2 = new tj(param0, hg.field_t, fe.field_g, jc.field_f, jn.field_k, uo.field_b, ub.field_q);
            sb.a(500);
            return var2;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (tj) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("rj.HA(");
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
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 18118 + ')');
        }
    }

    void d(int param0, int param1, int param2) {
        if (param1 != 128) {
            ((rj) this).field_q = 96;
        }
    }

    void a(int param0, int param1, byte param2) {
        int var4 = -24 % ((41 - param2) / 61);
    }

    void a(int param0, int param1) {
        if (param0 != 1) {
            boolean discarded$0 = rj.a((byte) -122, true);
        }
        if (!(null == ((rj) this).field_r)) {
            ((rj) this).field_r.a(1, param1);
        }
    }

    void a(int param0, byte param1, int param2) {
        if (param1 > -59) {
            ((rj) this).field_p = -18;
        }
    }

    void e(int param0, int param1, int param2) {
        ((rj) this).field_i = ((rj) this).field_i + param0;
        if (param2 <= 69) {
            ((rj) this).field_p = -102;
        }
        ((rj) this).field_t = ((rj) this).field_t + param1;
    }

    private final void c(int param0, int param1, int param2) {
        if ((2 & ((rj) this).field_v) != 0) {
            ((rj) this).field_i = ((rj) this).field_i + (-param1 + ((rj) this).field_x);
        }
        if (0 != (1 & ((rj) this).field_v)) {
            ((rj) this).field_t = ((rj) this).field_t + (-param2 + ((rj) this).field_q);
        }
        ((rj) this).field_x = param1;
        ((rj) this).field_q = param2;
    }

    public static void b(boolean param0) {
        field_y = null;
        field_j = null;
        field_k = null;
        field_s = null;
    }

    final static cn a(byte param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        cn var1 = new cn(11, 11);
        jh.a(var1);
        for (var2 = 0; var2 < 5; var2++) {
            gf.b(var2, 3 - -var2, 11 + -(2 * var2), 65793);
        }
        jh.b();
        return var1;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            wj var5 = null;
            wj var6 = null;
            if (kf.field_m == null) {
                kf.field_m = sc.field_q.a(-74, an.field_E, ii.field_D);
            }
            if (param0 <= 23) {
                Object var3 = null;
                byte[] discarded$0 = rj.a((wj) null, false, -48, (byte[]) null);
            }
            if (!(0 != kf.field_m.field_c)) {
                return false;
            }
            long dupTemp$1 = kd.c(-2456);
            wh.field_e = dupTemp$1;
            qm.field_o = dupTemp$1;
            if (kf.field_m.field_c != 1) {
                pd.field_A = tp.field_B;
            } else {
                {
                    sp.field_c = new rk((java.net.Socket) kf.field_m.field_f, sc.field_q);
                    ac.field_B.field_o = 0;
                    var5 = ra.field_c;
                    var6 = var5;
                    var6.field_o = 0;
                    pd.field_A = no.field_c;
                    wl.field_f = !param1 ? -1 : -2;
                    oc.field_E = !param1 ? -1 : -2;
                    rd.field_C = !param1 ? -1 : -2;
                    rg.a(mh.field_g, (ec) (Object) ac.field_B, kn.field_b, 119, rd.field_D);
                    op.a(0, -1);
                }
            }
            kf.field_m = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj a(int param0, int param1, int param2) {
        if (((rj) this).a((byte) 114, param1, param2)) {
            return (rj) this;
        }
        if (param0 <= -10) {
            return null;
        }
        return null;
    }

    rj(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param4);
        this.c(2, param3, param2);
    }

    private rj(int param0, int param1, int param2) {
        ((rj) this).field_q = 0;
        ((rj) this).field_i = param1;
        ((rj) this).field_w = true;
        ((rj) this).field_x = 0;
        ((rj) this).field_t = param0;
        ((rj) this).field_u = null;
        ((rj) this).field_v = param2;
        rl.field_h.b((ne) this, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Armoured", "Ignores first failed roll in each combat."};
        field_y = "The account name you use to access RuneScape and other Jagex.com games";
        field_l = 128;
    }
}
