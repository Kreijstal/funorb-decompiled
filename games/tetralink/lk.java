/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk extends ml implements dm {
    static int field_sb;
    private boolean field_ob;
    private boolean field_rb;
    static int field_wb;
    private boolean field_qb;
    private boolean field_vb;
    private jb field_ub;
    static String field_pb;
    private lg field_tb;
    static String field_nb;

    public static void f(byte param0) {
        int var1 = -101 / ((-67 - param0) / 47);
        field_nb = null;
        field_pb = null;
    }

    final static le a(int param0, hl param1, hl param2, hl param3, int[] param4) {
        int var10_int = 0;
        Object stackIn_9_0 = null;
        le stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        le[] var8 = null;
        int var9 = 0;
        Exception var10 = null;
        j var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = TetraLink.field_J;
        try {
          var5_int = param4.length;
          if (param0 > -26) {
            var13 = (int[]) null;
            lk.a(90, (hl) null, (hl) null, (hl) null, (int[]) null);
          }
          var6 = new String[var5_int];
          var15 = new char[var5_int];
          var14 = var15;
          var7 = var14;
          var8 = new le[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = eh.field_p.a(param4[var10_int], -128);
              var6[var10_int] = var11.h(-107);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (le) (stackIn_9_0);
          }
          stackIn_11_0 = new le(0L, param3, param2, param1, var8, param4, var6, var15);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lk.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    lk(pk param0, jb param1, String param2, boolean param3, boolean param4) {
        super(param0, new ba((lk) null, param1, param2), 77, 10, 10);
        try {
          this.field_ob = false;
          this.field_qb = false;
          this.field_ub = param1;
          this.field_rb = param4 ? true : false;
          this.field_vb = param3 ? true : false;
          this.field_tb = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_tb.field_K = true;
          this.c(this.field_tb, 10);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            lk.q(108);
          }
          if (param0 != 13) {
            stackIn_7_0 = super.a(param0, param1, 1, param3);
            return stackIn_7_0;
          }
          this.r(-125);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lk.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void p(int param0) {
        if (param0 != 128) {
          el var3 = (el) null;
          lk.a(false, (byte) -124, 39, (el) null, -11, -14, 32, -111);
        }
        this.field_tb.b(param0 ^ 248, 2121792, 4210752);
        ba var2 = new ba(this, this.field_ub, oa.field_t);
        var2.a(lm.field_l, 15, param0 ^ -256);
        this.e(var2, -27667);
    }

    final static java.applet.Applet q(int param0) {
        if (param0 != 13) {
          field_sb = 60;
        }
        if (null != ik.field_c) {
          return ik.field_c;
        }
        return (java.applet.Applet) ((Object) lc.field_a);
    }

    final void r(int param0) {
        if (!this.field_K) {
          return;
        }
        this.field_K = false;
        if (this.field_vb) {
          gg.c(-8);
        } else {
          if (this.field_rb) {
            aa.d((byte) 116);
          }
        }
        if (param0 >= -122) {
          this.r(122);
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!sj.a(3010, param0)) {
            return false;
          }
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (param1 != -1) {
            return true;
          }
          if (12 <= var3_int) {
            return false;
          }
          if (!tk.a((byte) 81, param0)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("lk.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, int param2, el param3, int param4, int param5, int param6, int param7) {
        nh[][] stackIn_35_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        el var16 = null;
        nh[] var17 = null;
        int[] var18 = null;
        nh[] var19 = null;
        int[] var20 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        var15 = TetraLink.field_J;
        try {
          if (param1 >= -111) {
            var16 = (el) null;
            lk.a(true, (byte) -16, 61, (el) null, -105, 77, -74, -96);
          }
          if (param6 <= param2) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= uj.field_s.length) {
                if (var8_int == 0) {
                  return;
                }
                nn.field_R = true;
                return;
              }
              var20 = uj.field_s[var9];
              var18 = var20;
              var10_ref_int__ = var18;
              var11 = 0;
              var12 = 0;
              L19: while (true) {
                if (var12 >= var20.length) {
                  if (var11 == 0 &&
                    hg.field_k != param2) {
                    break L19;
                  }
                  var8_int = 0;
                  for (var12 = 0; var12 < var20.length; var12 += 2) {
                    var13_int = var20[var12];
                    if (var13_int != -1) {
                      if (param2 > var13_int) {
                        rh.field_G[var13_int] = true;
                      }
                    } else {
                      n.field_P = true;
                    }
                  }
                  break L19;
                }
                var13_intLifetime1 = var20[var12];
                var14 = var10_ref_int__[1 + var12];
                if (-1 == var13_intLifetime1) {
                  if (cl.field_f[param5] != var14) {
                    break L19;
                  }
                } else {
                  if (param2 == var13_intLifetime1 &&
                    param7 == var14) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param2) {
                      break L19;
                    }
                    if ((255 & eg.field_K[var13_intLifetime1]) != var14) {
                      break L19;
                    }
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          stackIn_35_0 = cn.field_e;
          if (-1 == param2) {
            stackIn_36_1 = 1;
          } else {
            stackIn_36_1 = param2 + 4;
          }
          var17 = stackIn_35_0[stackIn_36_1];
          var19 = var17;
          var8 = var19;
          var9 = 1;
          if (param0) {
            if (param2 != -1) {
              for (var10 = 0; var10 < -1 + var17.length; var10++) {
                if ((lo.field_a[(param4 + var10) / 8] & 1 << (7 & param4 + var10)) == 0) {
                  continue;
                }
                var9 = 0;
                break;
              }
              param4 = param4 + (255 & nn.field_Y[param2]);
            } else {
              var10 = 0;
              while (!(cl.field_f.length <= var10)) {
                if (0 == (km.field_o[var10 / 8] & 1 << (7 & var10))) {
                  var10++;
                  continue;
                }
                var9 = 0;
                break;
              }
            }
          }
          var10Lifetime1 = 0;
          var11 = 0;
          while (true) {
            if (param2 != -1) {
              stackIn_54_0 = var19.length - 1;
            } else {
              stackIn_54_0 = cl.field_f.length;
            }
            if (stackIn_54_0 <= var11) {
              if (var10Lifetime1 != 0) {
                return;
              }
              for (var11 = 0; -1 + var19.length > var11; var11++) {
                if (param2 == -1) {
                  param5 = var11;
                } else {
                  eg.field_K[param2] = (byte)var11;
                }
                lk.a(param0, (byte) -118, param2 + 1, param3, param4, param5, param6, param7);
                if (nn.field_R) {
                  return;
                }
              }
              return;
            }
            if (-1 == param2) {
              param5 = var11;
            } else {
              eg.field_K[param2] = (byte)var11;
            }
            if (param2 == -1 &&
              cl.field_f.length == 1) {
              var12 = 1;
            } else {
              var13 = var8[var11 + 1];
              if (param0) {
                if (!var13.field_zb) {
                  if (var9 != 0) {
                    stackIn_78_0 = (var13.field_S) ? 1 : 0;
                  } else {
                    stackIn_78_0 = 0;
                  }
                } else {
                  stackIn_78_0 = 1;
                }
                var12 = stackIn_78_0;
              } else {
                if (param2 == -1) {
                  stackIn_69_0 = (cl.field_f[var11] != qb.field_N.field_rc) ? 0 : 1;
                } else {
                  stackIn_69_0 = (var11 != (255 & qb.field_N.field_sc[param2])) ? 0 : 1;
                }
                var12 = stackIn_69_0;
              }
            }
            if (var12 != 0) {
              lk.a(param0, (byte) -120, param2 + 1, param3, param4, param5, param6, param7);
              var10Lifetime1 = 1;
            }
            if (nn.field_R) {
              return;
            }
            var11++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_100_0 = var8_ref;
          stackIn_100_1 = new StringBuilder().append("lk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        ba stackIn_13_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ba var6 = null;
        var5 = TetraLink.field_J;
        try {
          if (this.field_qb) {
            return;
          }
          stackIn_6_1 = (param1 == 256);
          this.field_ob = stackIn_6_1;
          this.field_qb = true;
          this.field_tb.b(-32, 8405024, 4210752);
          if (param2 != 17) {
            this.r(0);
          }
          var6 = new ba(this, this.field_ub, param0);
          if (5 != param1) {
            if (param1 == 256) {
              var6.a((dn) (this), param2 ^ -44, mb.field_v);
            } else {
              stackIn_13_0 = var6;
              if (!this.field_vb) {
                stackIn_14_1 = nb.field_T;
              } else {
                stackIn_14_1 = mb.field_v;
              }
              ((ba) (Object) stackIn_13_0).a(stackIn_14_1, -1, param2 ^ 103);
            }
          } else {
            var6.a(ml.field_hb, 11, 94);
            var6.a(uh.field_a, 17, 91);
          }
          if (param1 == 3) {
            var6.a(hl.field_C, 7, param2 ^ 108);
          } else {
            if (param1 == 4) {
              var6.a(u.field_d, 8, 97);
            } else {
              if (6 == param1) {
                var6.a(em.field_c, 9, 81);
              } else {
                if (9 != param1) {
                  this.e(var6, -27667);
                  return;
                }
                var6.a((dn) (this), 40, jm.field_d);
              }
            }
          }
          this.e(var6, -27667);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("lk.EA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public void a(byte param0, ae param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 > 0) {
            this.field_rb = false;
          }
          if (this.field_ob) {
            t.a(3, 0);
            this.r(-124);
          } else {
            ha.a(-92, "tochangedisplayname.ws", lk.q(13));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("lk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_sb = -1;
        field_nb = "Remove <%0> from ignore list";
        field_pb = "Start Game";
    }
}
