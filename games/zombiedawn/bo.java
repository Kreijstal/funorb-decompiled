/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends le {
    static boolean field_n;
    static int[] field_o;
    int field_h;
    static boolean field_i;
    int field_l;
    int field_j;
    int field_k;
    int field_m;
    int field_q;
    static boolean[] field_p;

    final static String a(int param0) {
        String var1 = "";
        if (null != he.field_a) {
          var1 = he.field_a.b(false);
        }
        if (var1.length() == 0) {
          var1 = t.a(1);
        }
        if (param0 >= 19) {
          if (var1.length() == 0) {
            var1 = ta.field_a;
          }
          return var1;
        }
        bo.a(57);
        if (var1.length() == 0) {
          var1 = ta.field_a;
        }
        return var1;
    }

    public static void c(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 7644) {
          bo.c(-57);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 > -85) {
                bo.a(25);
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(rc.a(-1, param1, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("bo.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    bo(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_h = param1;
        this.field_l = param5;
        this.field_j = param2;
        this.field_k = param3;
        this.field_q = param0;
        this.field_m = param4;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var3Lifetime7;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime2Lifetime1;
        int var3Lifetime2Lifetime2;
        if (param1 == sm.field_a) {
          return;
        }
        sm.field_a = param1;
        int var2 = -45 % ((param0 + 16) / 41);
        if (df.field_h) {
          nm.field_b = true;
          if (param1 >= 0) {
            rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
            var3 = bj.field_q.b(rc.field_w, 400);
            te.field_bb = 20 + (20 + (var3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
            return;
          }
          var3Lifetime6 = param1;
          if (-2 == var3Lifetime6) {
            rc.field_w = so.a(jp.field_g);
            var3Lifetime6 = bj.field_q.b(rc.field_w, 400);
            te.field_bb = 20 + (20 + (var3Lifetime6 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
            return;
          }
          if (var3Lifetime6 != -3) {
            throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
          }
          rc.field_w = so.a(qg.field_g);
          var3Lifetime7 = bj.field_q.b(rc.field_w, 400);
          te.field_bb = 20 + (20 + (var3Lifetime7 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
          return;
        }
        if (param1 == -2) {
          nm.field_b = true;
          if (param1 >= 0) {
            rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
            var3Lifetime1 = bj.field_q.b(rc.field_w, 400);
            te.field_bb = 20 + (20 + (var3Lifetime1 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
            return;
          }
          var3Lifetime1Lifetime1 = param1;
          if (-2 == var3Lifetime1Lifetime1) {
            rc.field_w = so.a(jp.field_g);
            var3Lifetime1Lifetime1 = bj.field_q.b(rc.field_w, 400);
            te.field_bb = 20 + (20 + (var3Lifetime1Lifetime1 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
            return;
          }
          if (var3Lifetime1Lifetime1 != -3) {
            throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
          }
          rc.field_w = so.a(qg.field_g);
          var3Lifetime1Lifetime2 = bj.field_q.b(rc.field_w, 400);
          te.field_bb = 20 + (20 + (var3Lifetime1Lifetime2 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
          return;
        }
        if (param1 == -3) {
          nm.field_b = true;
          if (param1 >= 0) {
            rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
            var3Lifetime2 = bj.field_q.b(rc.field_w, 400);
            te.field_bb = 20 + (20 + (var3Lifetime2 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
            return;
          }
          var3Lifetime2Lifetime1 = param1;
          if (-2 == var3Lifetime2Lifetime1) {
            rc.field_w = so.a(jp.field_g);
            var3Lifetime2Lifetime1 = bj.field_q.b(rc.field_w, 400);
            te.field_bb = 20 + (20 + (var3Lifetime2Lifetime1 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
            return;
          }
          if (var3Lifetime2Lifetime1 != -3) {
            throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
          }
          rc.field_w = so.a(qg.field_g);
          var3Lifetime2Lifetime2 = bj.field_q.b(rc.field_w, 400);
          te.field_bb = 20 + (20 + (var3Lifetime2Lifetime2 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
          return;
        }
        nm.field_b = false;
        if (param1 >= 0) {
          rc.field_w = me.field_Fb[vk.field_c][vf.field_f][sm.field_a];
          var3Lifetime3 = bj.field_q.b(rc.field_w, 400);
          te.field_bb = 20 + (20 + (var3Lifetime3 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
          return;
        }
        var3Lifetime4 = param1;
        if (-2 == var3Lifetime4) {
          rc.field_w = so.a(jp.field_g);
          var3Lifetime4 = bj.field_q.b(rc.field_w, 400);
          te.field_bb = 20 + (20 + (var3Lifetime4 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
          return;
        }
        if (var3Lifetime4 != -3) {
          throw new IllegalArgumentException("Illegal tutorial frame: " + param1);
        }
        rc.field_w = so.a(qg.field_g);
        var3Lifetime5 = bj.field_q.b(rc.field_w, 400);
        te.field_bb = 20 + (20 + (var3Lifetime5 * (bj.field_q.field_I + bj.field_q.field_x) + 4));
    }

    static {
        field_i = false;
        field_p = new boolean[112];
    }
}
