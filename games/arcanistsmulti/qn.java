/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends ob implements vb {
    private ag field_V;
    static String field_kb;
    static le field_ob;
    static String field_lb;
    static String field_pb;
    static vn field_mb;
    static String field_nb;
    static String field_jb;

    final static void a(int param0, int param1) {
        fd.field_d = 1000000000L / (long)param1;
        if (param0 != 16) {
            field_nb = (String) null;
        }
    }

    final static int k(byte param0) {
        if (param0 != -14) {
            return -111;
        }
        return hd.field_b + ((on.field_h << -1331160988) - -(ra.field_m << 222225474));
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                qn.a(-13, -64, -6, 93, true, 96, 127);
                break L1;
              }
            }
            if (this.field_V == param4) {
              this.g(109);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("qn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final ag a(wc param0, String param1, byte param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_2_0 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new ag(param1, param0);
            var4.field_r = (pf) ((Object) new mm());
            var5 = this.field_k - 6;
            this.field_k = this.field_k + 38;
            var4.a(30, var5, -14 + (this.field_v + -16), 15, -128);
            if (param2 > 1) {
              this.c(-110, var4);
              this.e((byte) 86);
              stackIn_4_0 = (ag) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ag) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("qn.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, eg param1, eg param2) {
        try {
            bb.field_a = param2;
            an.field_o = param1;
            if (param0 != -24539) {
                qn.a(-80, (byte) 86);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qn.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(int param0) {
        tf var1 = null;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            rc.field_m = 0;
            ie.field_Nb = null;
            pc.field_b = 0;
            vd.field_d.c(-124);
            oo.field_B.c(-124);
            var1 = ie.field_Qb.f(-118);
            while (var1 != null) {
                var1.a((byte) 88);
                var1 = ie.field_Qb.a(-1);
            }
            if (param0 < 30) {
                field_ob = (le) null;
            }
            var1 = uc.field_c.f(-63);
            while (var1 != null) {
                var1.a((byte) 88);
                var1 = uc.field_c.a(-1);
            }
            jb.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qn.C(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        if (param0 < 33) {
            return;
        }
        if (!this.field_G) {
            return;
        }
        this.field_G = false;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        String var7;
        eg var8;
        L0: {
          if (nj.field_c != 2) {
            var7 = vk.field_v;
            break L0;
          } else {
            var7 = ji.field_e;
            break L0;
          }
        }
        if (param1 > -50) {
          var8 = (eg) null;
          qn.a(10, (eg) null, (eg) null);
          uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
          return;
        } else {
          uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_13_0 = 0;
        if (param1 < -6) {
          if (-3 != (param0 ^ -1)) {
            if (param0 != 3) {
              if (4 != param0) {
                if (param0 != 1) {
                  if (param0 != 14) {
                    if (-6 == (param0 ^ -1)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackIn_13_0 = 1;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void h(int param0) {
        if (param0 != 1) {
          qn.k((byte) 17);
          field_nb = null;
          field_lb = null;
          field_jb = null;
          field_ob = null;
          field_mb = null;
          field_pb = null;
          field_kb = null;
          return;
        } else {
          field_nb = null;
          field_lb = null;
          field_jb = null;
          field_ob = null;
          field_mb = null;
          field_pb = null;
          field_kb = null;
          return;
        }
    }

    qn(h param0, ih param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (oo.field_C == param1) {
                var3 = wi.field_j;
                break L1;
              } else {
                if (param1 != vi.field_C) {
                  if (param1 != bh.field_c) {
                    break L1;
                  } else {
                    this.field_k = this.field_k + 30;
                    var3 = fl.field_d;
                    break L1;
                  }
                } else {
                  this.field_k = this.field_k + 10;
                  var3 = ki.field_w;
                  if (!ne.b(-22768)) {
                    break L1;
                  } else {
                    this.field_k = this.field_k + 20;
                    var3 = ch.field_f;
                    break L1;
                  }
                }
              }
            }
            var4 = new qm((String) (var3), (wc) null);
            var4.field_v = this.field_v;
            var4.field_j = 50;
            var4.field_k = 80;
            var4.field_n = 0;
            var4.field_r = (pf) ((Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.c(-86, var4);
            this.field_V = this.a((wc) (this), dd.field_e, (byte) 113);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("qn.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_kb = "Unit cannot use this ability after being damaged";
        field_lb = "Continue";
        field_pb = "Join";
        field_mb = new vn();
        field_nb = "Report abuse";
        field_jb = "With spells like this, you just need to click on the location you wish the effect to be centred on and the spell will be activated. Try clicking on a target.";
    }
}
