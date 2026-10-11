/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends SceneWidget {
    boolean field_Zb;
    int field_dc;
    long field_ec;
    static boolean field_lc;
    int field_qc;
    static String[] field_ic;
    static String field_Xb;
    int field_ac;
    int field_jc;
    String field_Vb;
    static int field_gc;
    boolean field_kc;
    SceneWidget field_Yb;
    String field_mc;
    SceneWidget field_hc;
    boolean field_nc;
    static String field_Tb;
    static ek[] field_pc;
    SceneWidget field_cc;
    SceneWidget field_oc;
    long field_fc;
    int field_Ub;
    SceneWidget field_Sb;
    static SceneWidget field_bc;
    int field_Wb;

    final static void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var3 = -68 / ((-30 - param1) / 54);
        if (null != FunOrbClient.field_x) {
          var4 = FunOrbClient.field_x.a(param2, -95);
          if (var4 != -2) {
            if (var4 != -1) {
              var5 = FunOrbClient.field_x.d((byte) 63) ? 1 : 0;
              wc.a(0, var5 != 0, FunOrbClient.field_x.field_hc, var4, FunOrbClient.field_x.b(true), param0);
            }
            FunOrbClient.field_x = null;
            rh.a(false);
          }
        }
    }

    final static void a(boolean param0, int param1) {
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1 != 0) {
          return;
        }
        if (param0 ||
          null == nf.field_b) {
          vb.field_c = false;
        }
        if (!param0) {
          if (null != nf.field_b) {
            if (0 < SentinelCommand.field_t) {
              SentinelCommand.field_t = SentinelCommand.field_t - 1;
            } else {
              if (bd.field_c > 0) {
                bd.field_c = bd.field_c - 1;
              } else {
                if (fj.field_f < an.field_h) {
                  if (fj.field_f == 0) {
                    nj.a(false, true);
                  }
                  fj.field_f = fj.field_f + 1;
                }
              }
            }
          } else {
            if (ni.field_a != null) {
              if (SentinelCommand.field_t <= 0) {
                if (0 >= fj.field_f) {
                  if (an.field_h > bd.field_c) {
                    if (0 == bd.field_c) {
                      nj.a(true, true);
                    }
                    bd.field_c = bd.field_c + 1;
                  }
                } else {
                  fj.field_f = fj.field_f - 1;
                }
              } else {
                SentinelCommand.field_t = SentinelCommand.field_t - 1;
              }
            } else {
              vb.field_c = false;
              if (0 >= bd.field_c) {
                if (fj.field_f > 0) {
                  fj.field_f = fj.field_f - 1;
                } else {
                  if (SentinelCommand.field_t < an.field_h) {
                    if (SentinelCommand.field_t == 0) {
                      bf.m(854);
                    }
                    SentinelCommand.field_t = SentinelCommand.field_t + 1;
                  }
                }
              } else {
                bd.field_c = bd.field_c - 1;
              }
            }
          }
        } else {
          if (SentinelCommand.field_t > 0) {
            SentinelCommand.field_t = SentinelCommand.field_t - 1;
          } else {
            if (0 < bd.field_c) {
              bd.field_c = bd.field_c - 1;
            } else {
              if (fj.field_f > 0) {
                fj.field_f = fj.field_f - 1;
              }
            }
          }
        }
    }

    public static void k(int param0) {
        field_Xb = null;
        field_Tb = null;
        field_ic = null;
        if (param0 < 73) {
          cc.a(24, (byte) -21, true);
        }
        field_bc = null;
        field_pc = null;
    }

    final boolean d(byte param0) {
        if (param0 != -36) {
          cc.a(-73, (byte) -40, false);
        }
        return !this.a((byte) 30) ? true : false;
    }

    cc(String param0, String param1, long param2) {
        super(0L, (SceneWidget) null);
        CharSequence var6 = null;
        try {
          this.field_mc = param0;
          this.field_ec = param2;
          this.field_Vb = param1;
          var6 = (CharSequence) ((Object) this.field_mc);
          ui.a(1, var6);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(cc param0, int param1) {
        RuntimeException var3 = null;
        cc var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param0.field_kc) ? 0 : 1;
          if (stackIn_3_0 == (this.field_kc ? 1 : 0)) {
            stackIn_5_0 = this.field_kc;
            return stackIn_5_0;
          }
          if (param1 >= -35) {
            var4 = (cc) null;
            this.a((cc) null, 15);
          }
          if (param0.field_Zb != this.field_Zb) {
            stackIn_11_0 = this.field_Zb;
            return stackIn_11_0;
          }
          stackIn_15_0 = !(this.field_fc >= param0.field_fc);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("cc.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void j(int param0) {
        int var1_int = 0;
        int var2 = SteelSentinels.obfuscationControl;
        int var1_intLifetime1;
        try {
          gd.field_qb.c((byte) -118);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            bm.field_T[var1_int] = 0L;
          }
          for (var1_intLifetime1 = param0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            hg.field_c[var1_intLifetime1] = 0L;
          }
          di.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "cc.B(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          this.field_mc = param1;
          this.field_Vb = param2;
          var5 = (CharSequence) ((Object) this.field_mc);
          ui.a(1, var5);
          int var4_int = -54 / ((54 - param0) / 38);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "cc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ic = new String[]{"TRAINING", "ILOLIAN INCIDENT", "SOLARITE WAR"};
        field_Tb = "<%1> was damaged by <%0>";
        field_lc = false;
    }
}
