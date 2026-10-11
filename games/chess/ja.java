/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends f {
    static String field_e;
    private java.nio.ByteBuffer field_d;
    static java.awt.Canvas field_h;
    static String field_c;
    static int field_i;
    static boolean field_f;
    static rk field_g;

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_g = null;
          if (param0 != -115) {
            field_g = (rk) null;
          }
          field_e = null;
          field_h = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "ja.H(" + param0 + ')');
        }
    }

    final static void a(um param0, int param1) {
        RuntimeException runtimeException = null;
        ci var2 = null;
        ci var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wk.field_g = wk.a(param0, 1, "display_name_changed", "basic");
          ea.field_bb = new ok(0L, cn.field_b, tn.field_l, ef.field_m);
          fg.field_d = new ok(0L, cn.field_b, d.field_Lb, vc.field_b);
          hb.field_a = new ci(0L, (ci) null);
          oj.field_c = new ci(0L, qn.field_P);
          oj.field_c.field_fb = param1;
          le.field_e = new ci(0L, bo.field_e, ei.field_s);
          kf.field_t = new ci(0L, l.field_j, hm.field_b);
          dk.field_h = new ci(0L, sj.field_k);
          hb.field_a.a((byte) 123, oj.field_c);
          hb.field_a.a((byte) 124, le.field_e);
          hb.field_a.a((byte) 123, kf.field_t);
          hb.field_a.a((byte) 125, ea.field_bb);
          hb.field_a.a((byte) 127, dk.field_h);
          ea.field_bb.field_Kb.field_Jb.a(qn.field_P, param1 + 2147483647);
          var2 = ea.field_bb.field_Kb.field_Jb;
          ea.field_bb.field_Kb.field_Jb.field_cb = 1;
          var2.field_fb = 1;
          fg.field_d.field_Kb.field_Jb.a(qn.field_P, -2147483648);
          var3 = fg.field_d.field_Kb.field_Jb;
          fg.field_d.field_Kb.field_Jb.field_cb = 1;
          var3.field_fb = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ja.E(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new byte[this.field_d.capacity()];
          this.field_d.position(0);
          if (param0 != 438) {
            this.field_d = (java.nio.ByteBuffer) null;
          }
          this.field_d.get(var2);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2_ref), "ja.D(" + param0 + ')');
        }
    }

    ja() {
    }

    final void a(byte[] param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 199) {
            ja.a((em) null, -70, (byte) -122, -75, true);
          }
          this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_d.position(0);
          this.field_d.put(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ja.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(em param0, int param1, byte param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Chess.field_G;
        try {
          var5_int = ql.a(-116, 3 * (-param3 + param1));
          var6 = 3 * param3;
          ki.a(0);
          var7 = var5_int - 10;
          if (param0.field_j > 0 &&
            null != param0.field_y) {
            dh.a((byte) 95);
          }
          um.field_a = 0;
          if (param2 >= -67) {
            field_f = false;
          }
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_e > var8)))) {
            var9 = param0.field_g[var8];
            var10 = param0.field_A[var8];
            var11 = param0.field_J[var8];
            stackOut_13_0 = param4;
            stackIn_55_0 = stackOut_13_0 ? 1 : 0;
            stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                var12 = qm.field_c[var9];
                var13 = tc.field_w[var9];
                var14 = qm.field_c[var10] - var12;
                var15 = -var12 + qm.field_c[var11];
                var16 = tc.field_w[var10] - var13;
                var17 = -var13 + tc.field_w[var11];
              }
              if (!stackIn_14_0 ||
                !(-(var16 * var15) + var14 * var17 >= 0)) {
                var12Lifetime1 = jd.field_i[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = jd.field_i[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = jd.field_i[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var12Lifetime1 + var13Lifetime1 + var14);
                      if (0 <= var7) {
                        stackIn_34_0 = var15 >> var7;
                      } else {
                        stackIn_34_0 = var15 << -var7;
                      }
                      var16 = -stackIn_34_0 + ge.field_eb.length - 1;
                      var17 = ge.field_eb[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_45_0 = 0;
                          stackIn_45_1 = var16;
                          if (stackIn_45_0 > stackIn_45_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ge.field_eb[var16];
                          continue;
                        }
                        stackIn_45_0Lifetime1 = var17;
                        stackIn_45_1Lifetime1 = var16 << 4;
                        var18 = stackIn_45_0Lifetime1 + stackIn_45_1Lifetime1;
                        ve.field_Hb[var18] = var8;
                        ge.field_eb[var16] = var17 + 1;
                        if (param0.field_j > 0 &&
                          null != param0.field_y) {
                          dupTemp$0 = param0.field_y[var8];
                          lc.field_n[dupTemp$0] = lc.field_n[dupTemp$0] + 1;
                        }
                        um.field_a = um.field_a + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_55_0 = param0.field_j;
          }
          if (stackIn_55_0 > 0 &&
            param0.field_y != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(lc.field_n.length <= var9Lifetime1)) {
              var10Lifetime1 = lc.field_n[var9Lifetime1];
              lc.field_n[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_71_0 = var5;
          stackIn_71_1 = new StringBuilder().append("ja.I(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static jd a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jd[] var3 = null;
        int var4 = 0;
        jd var5 = null;
        int var6 = 0;
        jd stackIn_3_0 = null;
        jd stackIn_14_0 = null;
        jd stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Chess.field_G;
        try {
          var2 = kb.a(-2147483648, param1, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_3_0 = dn.field_f;
            return stackIn_3_0;
          }
          if (param0 < 126) {
            ja.a((byte) 47, (java.applet.Applet) null);
          }
          var3 = hb.a(2);
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3.length))) {
            var5 = var3[var4];
            stackIn_17_0 = var5;
            if (var6 == 0) {
              if (((jd) (Object) stackIn_17_0).a((byte) 111, var2)) {
                stackIn_14_0 = var5;
                return stackIn_14_0;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = dn.field_f;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ja.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(long param0, String param1, byte param2, nb param3, int param4, ci param5, int[] param6, int param7, String param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ud.field_d = param3;
          pi.field_d = new dh(param5, param0, param8, param1, param7, param4, param6);
          var10_int = -39 % ((param2 + 30) / 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ja.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_e = "You must be a member to play with the current options.";
        field_c = "Lobby";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c398e174f2fe(long param0, String param1, int param2, nb param3, int param4, ci param5, int[] param6, int param7, String param8) {
        RuntimeException runtimeException = null;
        int var10_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ud.field_d = param3;
          pi.field_d = new dh(param5, param0, param8, param1, param7, param4, param6);
          var10_int = -39 % ((param2 + 30) / 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ja.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }
}
