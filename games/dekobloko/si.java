/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class si implements Iterable {
    static vj field_e;
    int field_a;
    static ck[] field_d;
    static String field_j;
    private bh field_l;
    bh[] field_h;
    static String[] field_f;
    static String field_i;
    static ck field_n;
    static String field_c;
    static String field_k;
    static w[] field_b;
    static String field_g;
    static String field_m;

    final bh a(long param0, byte param1) {
        bh var4 = null;
        bh var5 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var4 = ((si) this).field_h[(int)(param0 & (long)(((si) this).field_a - 1))];
        ((si) this).field_l = var4.field_b;
        L0: while (true) {
          if (var4 == ((si) this).field_l) {
            ((si) this).field_l = null;
            if (param1 == -37) {
              return null;
            } else {
              ((si) this).field_a = 79;
              return null;
            }
          } else {
            if (~param0 == ~((si) this).field_l.field_i) {
              var5 = ((si) this).field_l;
              ((si) this).field_l = ((si) this).field_l.field_b;
              return var5;
            } else {
              ((si) this).field_l = ((si) this).field_l.field_b;
              continue L0;
            }
          }
        }
    }

    final void a(long param0, boolean param1, bh param2) {
        bh var5 = null;
        try {
            if (null != param2.field_a) {
                param2.b((byte) 107);
            }
            var5 = ((si) this).field_h[(int)(param0 & (long)(((si) this).field_a + -1))];
            param2.field_a = var5.field_a;
            if (param1) {
                field_d = null;
            }
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "si.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
                si.a(115, true, -31, -28, 79, (byte) 85, -127);
                break L1;
              }
            }
            if (param2) {
              stackOut_5_0 = bg.field_g.a(param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = rk.field_R.a(param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("si.K(").append(param0).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static void d(int param0) {
        if (cl.field_r != null) {
          cl.field_r.n(22);
          sn.field_k = new cn();
          de.field_W.c((ce) (Object) sn.field_k, (byte) 87);
          return;
        } else {
          sn.field_k = new cn();
          de.field_W.c((ce) (Object) sn.field_k, (byte) 87);
          return;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          if (null != qc.field_s) {
            qc.field_s.a(0);
            qc.field_s = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 57) {
          var2 = null;
          int discarded$2 = si.a(true, (String) null, true);
          return;
        } else {
          return;
        }
    }

    final static ck[] a(int param0, int param1, ji param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (gb.a(param1, param2, param0, 106)) {
            return ca.m(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("si.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -46 + ')');
        }
    }

    final static ck[] a(int param0, boolean param1, ck[] param2, boolean param3) {
        ck[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        Object stackIn_3_0 = null;
        ck[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_7_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 25972) {
              var7 = new ck[param2.length];
              var4 = var7;
              var5 = 0;
              L1: while (true) {
                if (param2.length <= var5) {
                  stackOut_7_0 = (ck[]) var4;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var7[var5] = me.a(param2[var5], param3, (byte) -87, param1);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ck[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("si.J(").append(param0).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final static boolean c(int param0) {
        if (null == qc.field_s) {
            return false;
        }
        if (ph.field_xb != wf.field_u) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new cm((si) this);
    }

    final static void b(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1 != null) {
                try {
                  L0: {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                    ab.field_e = 1 + (int)(var3.longValue() / 1048576L);
                    break L0;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, byte param5, int param6) {
        String var7 = null;
        if (param5 != -41) {
          return;
        } else {
          L0: {
            if (pk.field_r != 2) {
              var7 = ob.field_l;
              break L0;
            } else {
              var7 = wk.field_n;
              break L0;
            }
          }
          pn.a(param3, param2, param1, param4, var7, param5 + 168, param0, param6);
          return;
        }
    }

    public static void e(int param0) {
        field_b = null;
        field_k = null;
        field_f = null;
        field_m = null;
        field_d = null;
        field_e = null;
        field_i = null;
        field_j = null;
        field_n = null;
        field_g = null;
        field_c = null;
    }

    si(int param0) {
        int var2 = 0;
        bh var3 = null;
        ((si) this).field_a = param0;
        ((si) this).field_h = new bh[param0];
        for (var2 = 0; param0 > var2; var2++) {
            bh dupTemp$0 = new bh();
            var3 = dupTemp$0;
            ((si) this).field_h[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_b = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Mute this player for 48 hours";
        field_e = new vj();
        field_k = "Unrated game";
        field_f = new String[]{"Bucket size", "Speed", "Colours", "Special items", "Shape feedback"};
        field_i = "You cannot add yourself!";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_g = "You are not currently logged in to the<nbsp>game.";
        field_m = "Connecting to<br>friend server...";
    }
}
