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
            if ((param0 ^ -1L) == (((si) this).field_l.field_i ^ -1L)) {
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
        bh var6 = null;
        bh var7 = null;
        if (null == param2.field_a) {
          var7 = ((si) this).field_h[(int)(param0 & (long)(((si) this).field_a + -1))];
          var5 = var7;
          param2.field_a = var7.field_a;
          if (param1) {
            field_d = null;
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
            return;
          } else {
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
            return;
          }
        } else {
          param2.b((byte) 107);
          var6 = ((si) this).field_h[(int)(param0 & (long)(((si) this).field_a + -1))];
          var5 = var6;
          param2.field_a = var6.field_a;
          if (!param1) {
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
            return;
          } else {
            field_d = null;
            param2.field_b = var5;
            param2.field_a.field_b = param2;
            param2.field_b.field_a = param2;
            param2.field_i = param0;
            return;
          }
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        if (!param0) {
          if (!param2) {
            return rk.field_R.a(param1);
          } else {
            return bg.field_g.a(param1);
          }
        } else {
          si.a(115, true, -31, -28, 79, (byte) 85, -127);
          if (!param2) {
            return rk.field_R.a(param1);
          } else {
            return bg.field_g.a(param1);
          }
        }
    }

    final static void d(int param0) {
        Object var2 = null;
        if (cl.field_r == null) {
          sn.field_k = new cn();
          if (param0 != -31842) {
            var2 = null;
            int discarded$4 = si.a(true, (String) null, true);
            de.field_W.c((ce) (Object) sn.field_k, (byte) 87);
            return;
          } else {
            de.field_W.c((ce) (Object) sn.field_k, (byte) 87);
            return;
          }
        } else {
          cl.field_r.n(22);
          sn.field_k = new cn();
          if (param0 == -31842) {
            de.field_W.c((ce) (Object) sn.field_k, (byte) 87);
            return;
          } else {
            var2 = null;
            int discarded$5 = si.a(true, (String) null, true);
            de.field_W.c((ce) (Object) sn.field_k, (byte) 87);
            return;
          }
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
        Object var5 = null;
        if (gb.a(param1, param2, param0, 106)) {
          if (param3 != -46) {
            var5 = null;
            ck[] discarded$2 = si.a(55, false, (ck[]) null, true);
            return ca.m(0);
          } else {
            return ca.m(0);
          }
        } else {
          return null;
        }
    }

    final static ck[] a(int param0, boolean param1, ck[] param2, boolean param3) {
        ck[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ck[] var7 = null;
        var6 = client.field_A ? 1 : 0;
        if (param0 != 25972) {
          return null;
        } else {
          var7 = new ck[param2.length];
          var4 = var7;
          var5 = 0;
          L0: while (true) {
            if (param2.length <= var5) {
              return var4;
            } else {
              var7[var5] = me.a(param2[var5], param3, (byte) -87, param1);
              var5++;
              continue L0;
            }
          }
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
          field_i = null;
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
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (param0 == 1) {
                  break L0;
                } else {
                  field_g = null;
                  break L0;
                }
              }
              if (var1 != null) {
                try {
                  var2_ref = Runtime.getRuntime();
                  var4 = null;
                  var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                  ab.field_e = 1 + (int)(var3.longValue() / 1048576L);
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
            field_n = null;
        }
    }

    si(int param0) {
        int var2 = 0;
        bh var3 = null;
        ((si) this).field_a = param0;
        ((si) this).field_h = new bh[param0];
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new bh();
            ((si) this).field_h[var2] = new bh();
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
