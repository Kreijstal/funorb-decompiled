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
        bh var4;
        bh var5;
        int var6;
        var6 = client.field_A ? 1 : 0;
        var4 = this.field_h[(int)(param0 & (long)(this.field_a - 1))];
        this.field_l = var4.field_b;
        L0: while (true) {
          if (var4 == this.field_l) {
            this.field_l = null;
            if (param1 == -37) {
              return null;
            } else {
              this.field_a = 79;
              return null;
            }
          } else {
            if ((param0 ^ -1L) == (this.field_l.field_i ^ -1L)) {
              var5 = this.field_l;
              this.field_l = this.field_l.field_b;
              return var5;
            } else {
              this.field_l = this.field_l.field_b;
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
            var5 = this.field_h[(int)(param0 & (long)(this.field_a + -1))];
            param2.field_a = var5.field_a;
            if (param1) {
                field_d = (ck[]) null;
            }
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "si.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = bg.field_g.a(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = rk.field_R.a(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("si.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void d(int param0) {
        String var2;
        if (cl.field_r == null) {
          sn.field_k = new cn();
          if (param0 != -31842) {
            var2 = (String) null;
            si.a(true, (String) null, true);
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          } else {
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          }
        } else {
          cl.field_r.n(22);
          sn.field_k = new cn();
          if (param0 == -31842) {
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          } else {
            var2 = (String) null;
            si.a(true, (String) null, true);
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          }
        }
    }

    final static void a(int param0) {
        String var2;
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
          var2 = (String) null;
          si.a(true, (String) null, true);
          return;
        } else {
          return;
        }
    }

    final static ck[] a(int param0, int param1, ji param2, byte param3) {
        RuntimeException var4 = null;
        ck[] var5 = null;
        ck[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (gb.a(param1, param2, param0, 106)) {
              L1: {
                if (param3 == -46) {
                  break L1;
                } else {
                  var5 = (ck[]) null;
                  si.a(55, false, (ck[]) null, true);
                  break L1;
                }
              }
              stackIn_6_0 = ca.m(0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("si.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static ck[] a(int param0, boolean param1, ck[] param2, boolean param3) {
        ck[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        ck[] stackIn_3_0 = null;
        ck[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 25972) {
              var7 = new ck[param2.length];
              var4 = var7;
              var5 = 0;
              L1: while (true) {
                if (param2.length <= var5) {
                  stackIn_8_0 = (ck[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7[var5] = me.a(param2[var5], param3, (byte) -87, param1);
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (ck[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("si.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static boolean c(int param0) {
        if (param0 == -12851) {
          if (null != qc.field_s) {
            if (ph.field_xb != wf.field_u) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_i = (String) null;
          if (null != qc.field_s) {
            if (ph.field_xb != wf.field_u) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new cm((si) (this)));
    }

    final static void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                if (param0 == 1) {
                  break L0;
                } else {
                  field_g = (String) null;
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  L1: {
                    var2 = Runtime.getRuntime();
                    var4 = (Object[]) null;
                    var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                    ab.field_e = 1 + (int)(var3.longValue() / 1048576L);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
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
        String var7;
        if (param5 != -41) {
          return;
        } else {
          L0: {
            if (-3 != (pk.field_r ^ -1)) {
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
        if (param0 != 0) {
            field_n = (ck) null;
        }
    }

    si(int param0) {
        int var2 = 0;
        bh dupTemp$0 = null;
        bh var3 = null;
        this.field_a = param0;
        this.field_h = new bh[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new bh();
            var3 = dupTemp$0;
            this.field_h[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_b = var3;
        }
    }

    static {
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
