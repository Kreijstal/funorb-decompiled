/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private int field_a;
    static String field_f;
    static String[] field_b;
    private dh field_c;
    private int field_e;
    private qi field_h;
    static String field_g;
    static int field_d;

    final Object a(int param0, long param1) {
        pb var6 = null;
        wf var7 = (wf) (this.field_h.a(1, param1));
        pb var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        if (param0 > -2) {
          return (Object) null;
        }
        Object var5 = var7.d(22698);
        if (var5 == null) {
          var7.a(false);
          var7.b((byte) -2);
          this.field_e = this.field_e + var7.field_A;
          return null;
        }
        if (var7.c((byte) 21)) {
          var6 = new pb(var5, var7.field_A);
          this.field_h.a(var7.field_h, (byte) -128, var6);
          this.field_c.a(var6, false);
          ((wf) ((Object) var6)).field_o = 0L;
          var7.a(false);
          var7.b((byte) -2);
          return var5;
        }
        this.field_c.a(var7, false);
        var7.field_o = 0L;
        if (DungeonAssault.field_K == 0) {
          return var5;
        }
        var6Lifetime1 = new pb(var5, var7.field_A);
        this.field_h.a(var7.field_h, (byte) -128, var6Lifetime1);
        this.field_c.a(var6Lifetime1, false);
        ((wf) ((Object) var6Lifetime1)).field_o = 0L;
        var7.a(false);
        var7.b((byte) -2);
        return var5;
    }

    final static String a(int param0) {
        if (param0 > -4) {
          field_d = 71;
          return ra.field_c.d(-104);
        }
        return ra.field_c.d(-104);
    }

    final static int c(int param0) {
        if (param0 == 1) {
          return (int)(1000000000L / hk.field_e);
        }
        String var2 = (String) null;
        eg.a((String) null, (String) null, (String) null, false);
        return (int)(1000000000L / hk.field_e);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, cn param5, int param6, int param7, int param8, se param9, int param10) {
        ig.field_a = param6;
        e.field_d = param10;
        wm.field_b = param0;
        md.field_f = param8;
        cb.field_b = param3;
        if (param4 != 5) {
          return;
        }
        try {
          je.field_b = param1;
          qc.field_z = param5;
          lj.field_m = param7;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "eg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    private final void a(long param0, byte param1) {
        wf var4 = null;
        wf var4Lifetime1;
        if (param1 == -110) {
          var4 = (wf) (this.field_h.a(1, param0));
          this.a(var4, (byte) 85);
          return;
        }
        this.field_h = (qi) null;
        var4Lifetime1 = (wf) (this.field_h.a(1, param0));
        this.a(var4Lifetime1, (byte) 85);
    }

    private final void a(wf param0, byte param1) {
        try {
          if (param0 != null) {
            param0.a(false);
            param0.b((byte) -2);
            this.field_e = this.field_e + param0.field_A;
          }
          int var3_int = -12 / ((param1 - 44) / 38);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "eg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private eg() throws Throwable {
        throw new Error();
    }

    public static void d(int param0) {
        field_b = null;
        if (param0 != -23658) {
          return;
        }
        field_g = null;
        field_f = null;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        var5 = DungeonAssault.field_K;
        var4 = param0.indexOf(param1);
        if (!param3) {
          eg.b(-74);
        }
        while (true) {
          if (var4 == -1) {
            return param0;
          }
          param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
          stackIn_6_0 = (String) (param0);
          if (var5 != 0) {
            return stackIn_6_0;
          }
          var4 = ((String) (Object) stackIn_6_0).indexOf(param1, param2.length() + var4);
        }
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
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                sj.field_bb = 1 + (int)(var3.longValue() / 1048576L);
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
            if (param0 <= 74) {
              eg.d(92);
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          int var2_int = 0;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(j.a((byte) 93, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            var2_int = -20 % ((18 - param0) / 45);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("eg.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(bo param0, int param1, bo param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param1 != 200) {
            eg.b(47);
          }
          var3_int = -param2.field_Ib + param0.field_Ib;
          if (param0.field_Nb == gm.field_b) {
            var3_int -= 200;
            if ((var4 != 0) &&
              (param0.field_Nb == null)) {
              var3_int += 200;
            }
          } else {
            if (param0.field_Nb == null) {
              var3_int += 200;
            }
          }
          if (param2.field_Nb != gm.field_b) {
            if (param2.field_Nb == null) {
              var3_int -= 200;
              if (var4 != 0) {
                var3_int += 200;
              }
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("eg.J(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(boolean param0, Object param1, long param2) {
        try {
          this.a(param1, 1, (byte) -123, param2);
          if (!param0) {
            String var6 = (String) null;
            eg.a((String) null, (String) null, (String) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "eg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(md param0, boolean param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        md var5 = null;
        rj var6 = null;
        var4 = DungeonAssault.field_K;
        try {
          if (!param1) {
            var5 = (md) null;
            eg.a((md) null, true);
          }
          var6 = to.a(hj.field_S, eh.field_h, param0, 0);
          var2 = var6;
          if (wi.field_ob != var6) {
            if (null != wi.field_ob) {
              wi.field_ob.field_p = mo.field_a;
            }
            wi.field_ob = var6;
            if (wi.field_ob != null) {
              wi.field_ob.field_m = mo.field_a;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledSharedTail0 = (no.field_d == 1);
          if (!decompiledSharedTail0) {
            if (la.field_g == 1) {
              um.field_h = um.field_h + 1;
              if (np.field_M == null) {
                var3 = (rn.field_a - eh.field_h) * (rn.field_a - eh.field_h) + (-hj.field_S + kp.field_c) * (-hj.field_S + kp.field_c);
                if (var3 > 5 &&
                  5 < um.field_h) {
                  np.field_M = pa.field_c;
                }
              }
              decompiledFrameRemainder0 = (null != np.field_M);
              if (decompiledFrameRemainder0) {
                np.field_M.d(-np.field_M.field_t + hj.field_S, 128, -np.field_M.field_i + eh.field_h);
                decompiledFrameRemainder0 = (var4 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (np.field_M != null &&
                um.field_h >= 5) {
                hh.field_s = null;
              } else {
                hh.field_s = pa.field_c;
                if (null != hh.field_s) {
                  hh.field_s.a(-hh.field_s.field_i + eh.field_h, (byte) -98, -hh.field_s.field_t + hj.field_S);
                  if (var4 != 0) {
                    hh.field_s = null;
                  }
                }
              }
              np.field_M = null;
              pa.field_c = null;
              decompiledSharedTail0 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledSharedTail0)) {
            um.field_h = 0;
            kp.field_c = lc.field_c;
            rn.field_a = hm.field_k;
            pa.field_c = to.a(lc.field_c, hm.field_k, param0, 0);
          }
          if (pj.field_r != 0 &&
            null != wi.field_ob) {
            wi.field_ob.a(1, pj.field_r);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_35_0 = var2_ref;
          stackIn_35_1 = new StringBuilder().append("eg.I(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        RuntimeException runtimeException = null;
        pb var6 = null;
        int var7 = 0;
        String var8 = null;
        wf var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          if (this.field_a < param1) {
            throw new IllegalStateException();
          }
          this.a(param3, (byte) -110);
          this.field_e = this.field_e - param1;
          if (param2 >= -28) {
            var8 = (String) null;
            eg.a((String) null, (String) null, (String) null, true);
          }
          while (0 > this.field_e) {
            var9 = (wf) (this.field_c.b(true));
            this.a(var9, (byte) 120);
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var6 = new pb(param0, param1);
          this.field_h.a(param3, (byte) -128, var6);
          this.field_c.a(var6, false);
          ((wf) ((Object) var6)).field_o = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("eg.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = new String[]{"Monster", "<%highlight>You have encountered a Monster in this room!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%monster>, such as <%lastroom>, will usually have high <%attack> and <%defence>."};
        field_g = "<%col_detect>Detect +2 to all monsters.</col>";
        field_f = "Detect";
    }
}
