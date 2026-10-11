/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;
    static String field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (lg.field_d != null) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int &&
              var2_int != 65535 &&
              s.a((char) var2_int, 0)) {
              var3 = 127 & ce.field_e + 1;
              if (ph.field_h != var3) {
                ag.field_a[ce.field_e] = -1;
                hj.field_a[ce.field_e] = (char)var2_int;
                ce.field_e = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vc.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != lg.field_d) {
            si.field_o = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              o.field_a.length > var2_int) {
              var2_int = -129 & o.field_a[var2_int];
            } else {
              var2_int = -1;
            }
            if (0 <= lk.field_e &&
              0 <= var2_int) {
              kl.field_h[lk.field_e] = ~var2_int;
              lk.field_e = 1 + lk.field_e & 127;
              if (sc.field_i == lk.field_e) {
                lk.field_e = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("vc.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          if (null != lg.field_d) {
            si.field_o = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < o.field_a.length) {
              var2_int = o.field_a[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (lk.field_e >= 0 &&
              var2_int >= 0) {
              kl.field_h[lk.field_e] = var2_int;
              lk.field_e = lk.field_e + 1 & 127;
              if (sc.field_i == lk.field_e) {
                lk.field_e = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & 1 + ce.field_e;
              if (var3 != ph.field_h) {
                ag.field_a[ce.field_e] = var2_int;
                hj.field_a[ce.field_e] = (char)0;
                ce.field_e = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) == 0 &&
              var2_int != 85 &&
              var2_int != 10) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("vc.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != lg.field_d) {
            lk.field_e = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "vc.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static bk a(int param0, int param1) {
        int var2 = -56 % ((param0 + 30) / 39);
        bk var3 = new bk();
        bh.field_D.a((o) (var3), (byte) 109);
        el.a(4, param1);
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          j var2 = (j) null;
          vc.a((byte) 113, (ci) null, (ci) null, (ci) null, (j) null);
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1, int param2) {
        nb stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        ci stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jc var4 = null;
        Object var5 = null;
        ve var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dh var16 = null;
        dh var17 = null;
        var15 = Chess.field_G;
        try {
          if (param0 != 68) {
            field_c = (String) null;
          }
          stackIn_5_0 = fg.field_d.field_Kb;
          stackIn_6_1 = (fg.field_d.field_Kb == ud.field_d);
          var3_int = ((nb) (Object) stackIn_5_0).a(stackIn_6_1, param1, 2, param2 * (6 + 3 * fe.field_g), 2 + fe.field_g, param0 ^ 68) ? 1 : 0;
          var4 = fg.field_d.field_Fb.field_I;
          if (2 != ld.field_g &&
            ld.field_g != 1) {
            fg.field_d.field_Kb.field_Jb.field_db = ca.field_c;
            fg.field_d.field_tb = false;
            fm.a(fg.field_d.field_Fb, -120);
            return;
          }
          fg.field_d.field_Kb.field_Jb.field_db = null;
          fg.field_d.field_tb = true;
          var5 = null;
          var6 = (ve) (var4.g(-18110));
          while (var6 != null) {
            var7 = 0;
            if (var6.field_I == null) {
              var6.field_Mb = new ci(0L, hg.field_f);
              var6.a((byte) 127, var6.field_Mb);
              var6.field_Eb = new ci(0L, hg.field_f);
              var6.a((byte) 126, var6.field_Eb);
              var7 = 1;
              var6.h(0);
            }
            var6.field_M = fg.field_d.field_Fb.field_M;
            var6.field_Mb.a(0, var6.field_M, -2147483648, fe.field_g, 0);
            var8 = 0;
            if (null != var6.field_Ob &&
              !var6.field_Ob.equals("")) {
              var6.field_Eb.field_jb = wk.field_g;
              var6.field_Eb.field_O = 16737894;
              var8 = 1;
              var6.field_Eb.a(0, 3 + wk.field_g.field_v, -2147483648, fe.field_g, 0);
            }
            var9 = 0;
            var10 = var6.field_M;
            if (var8 != 0) {
              var9 = 3 + wk.field_g.field_v;
              var10 = var10 - var9;
            }
            stackIn_22_0 = var6.field_Mb;
            if (var10 <= 0) {
              stackIn_23_1 = var6.field_Fb;
            } else {
              stackIn_23_1 = lh.a(var6.field_Mb.field_xb, var6.field_Fb, var10);
            }
            stackIn_22_0.field_db = stackIn_23_1;
            stackIn_26_0 = (var6.field_Mb.field_db.equals(var6.field_Fb)) ? 0 : 1;
            var11 = stackIn_26_0;
            var6.field_Mb.a(var9, var10, -2147483648, fe.field_g, 0);
            if (var3_int == 0) {
              var6.field_N = -var6.field_pb + fe.field_g;
            }
            if (var7 != 0) {
              fg.field_d.field_Fb.a(true, (ci) (var5), 2, var6);
            }
            if (null != var6.field_Eb &&
              var6.field_Eb.field_F) {
              pc.field_Mb = var6.field_Ob;
            } else {
              if (var6.field_Mb.field_F &&
                var11 != 0) {
                pc.field_Mb = var6.field_Fb;
              }
            }
            var5 = var6;
            if (var6.field_L != 0) {
              ja.$cfr$intArgs$a$c398e174f2fe(0L, var6.field_Fb, -97, fg.field_d.field_Kb, -1, var6, (int[]) null, -1, var6.field_Kb);
              var16 = pi.field_d;
              var13_ref_String = field_b;
              var16.field_b.a((byte) -12, var13_ref_String, 7);
              var17 = pi.field_d;
              var13 = re.field_m;
              var14 = ag.field_f;
              var17.field_b.a(true, var13, 0, var14, 0);
            }
            var6 = (ve) (var4.a((byte) -106));
          }
          if (fg.field_d.field_Hb.field_L != 0) {
            me.field_a = new kd(fg.field_d.field_Hb.field_U, fg.field_d.field_Hb.field_wb, fg.field_d.field_Hb.field_M, fg.field_d.field_Hb.field_pb, ki.field_N, od.field_V, qn.field_P, qn.field_P);
            pk.field_b = 2;
          }
          if (fg.field_d.field_Mb.field_L == 0) {
            return;
          }
          me.field_a = new kd(fg.field_d.field_Mb.field_U, fg.field_d.field_Mb.field_wb, fg.field_d.field_Mb.field_M, fg.field_d.field_Mb.field_pb, sc.field_b, od.field_V, qn.field_P, qn.field_P);
          pk.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "vc.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static di a(byte param0, ci param1, ci param2, ci param3, j param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        di stackIn_26_0 = null;
        di stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        di[] var11 = null;
        int var12 = 0;
        j var13_ref_j = null;
        int var13 = 0;
        int var15 = 0;
        dj var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = Chess.field_G;
        try {
          if (param4 == null) {
            return null;
          }
          if (param4.field_q == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param4.field_q.length;
          }
          var5_int = stackIn_7_0;
          if (null != param4.field_t) {
            stackIn_10_0 = param4.field_t.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new di[var7];
          if (null != param4.field_q) {
            for (var12 = 0; var12 < param4.field_q.length; var12++) {
              var13_ref_j = ak.field_u.a(param4.field_q[var12], 0);
              var8[var12] = var13_ref_j.field_x;
              var9[var12] = param4.field_r[var12];
              var11[var12] = vc.a((byte) 88, param1, param2, param3, var13_ref_j);
            }
          }
          if (null != param4.field_t) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param4.field_t.length > var14; var14++) {
              var15 = param4.field_t[var14];
              if (-1 != var15) {
                var16 = oa.field_b.a((byte) 79, var15);
                var8[var12Lifetime1 + var14] = var16.e((byte) -119);
                var9[var12Lifetime1 + var14] = param4.field_s[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var12Lifetime1 + var14] = (char)var13;
                }
                var10[var12Lifetime1 + var14] = param4.field_t[var14];
              } else {
                var8[var14 + var12Lifetime1] = ob.field_y;
                var9[var12Lifetime1 + var14] = param4.field_s[var14];
                var10[var12Lifetime1 + var14] = param4.field_t[var14];
              }
            }
          }
          if (param0 == 88) {
            stackIn_28_0 = new di(0L, param2, param1, param3, var11, var20, var8, var21);
            return stackIn_28_0;
          }
          stackIn_26_0 = (di) null;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param4 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "Remove name";
        field_c = "Fullscreen";
    }
}
