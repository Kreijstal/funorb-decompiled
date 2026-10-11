/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends ug {
    static RgbSprite field_G;
    static java.awt.Color field_S;
    static int[][] field_T;
    static int field_R;
    static String field_U;

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        int var8 = 0;
        h var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          super.a((byte) 77, param1, param2, param3, param4, param5);
          var9 = nc.field_e;
          var8 = -55 % ((param0 - 36) / 32);
          if (var9 != null &&
            this.a(param5, param2, (byte) 81, param1, param3)) {
            if (this.field_A instanceof hi) {
              ((hi) (this.field_A)).a(var9, this, 127);
              nc.field_e = null;
            } else {
              if (var9.field_A instanceof hi) {
                ((hi) (var9.field_A)).a(var9, this, -108);
                nc.field_e = null;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("d.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 == 0) {
          return param0 >= 0 ? true : false;
        }
        field_S = (java.awt.Color) null;
        return param0 >= 0 ? true : false;
    }

    final static int a(int param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        byte[] var6 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          param4 = param4 - param2;
          if (0 > param4) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          if (param4 >= el.field_Sb.length) {
            return 0;
          }
          var5_int = 0;
          var10 = el.field_Sb[param4];
          var9 = var10;
          var6 = var9;
          for (var7 = 0; var7 < var10.length; var7 += 2) {
            if (!param3) {
              fk.field_d.c(bi.field_b[var10[var7]], 74 + param1, var5_int + (param0 + 8), 16777215, -1);
              vc.field_e[var6[var7 + 1]].f(76 + param1, var5_int + param0);
            }
            var5_int += 12;
          }
          stackIn_14_0 = var5_int;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "d.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6, byte param7, boolean param8, boolean param9) {
        int var11;
        var11 = SteelSentinels.obfuscationControl;
        if (param5) {
          if (param5) {
            me.field_e = ln.field_f;
            cc.a(param5, 0);
            if (0 < SentinelCommand.field_t) {
              tm.a(param7 + 4, param5, param0, param1);
            }
            rh.field_w.field_Kb = 1;
            if (param7 != -6) {
              return;
            }
            rh.field_w.field_ub = SceneWidget.field_ib.field_ub;
            if (bd.field_c > 0) {
              pl.a(param0, param5, param1, (byte) 66);
            }
            if (fj.field_f > 0) {
              cn.a(0, param0, param5, param9, param1);
            }
            if (vb.field_c &&
              nf.field_b.field_wc >= nf.field_b.field_Ub) {
              fl.field_c.field_T = false;
              mj.field_Sb.field_Tb.field_S = pe.field_U;
              ue.a(0, mj.field_Sb.field_Ub);
            } else {
              mj.field_Sb.field_Tb.field_S = null;
              fl.field_c.field_T = true;
              ke.a(param8, param1, mj.field_Sb, param2, 0);
            }
          } else {
            me.field_e = (re.field_Z - 640) / 2;
            cc.a(param5, 0);
            if (0 < SentinelCommand.field_t) {
              tm.a(param7 + 4, param5, param0, param1);
            }
            rh.field_w.field_Kb = 1;
            if (param7 != -6) {
              return;
            }
            rh.field_w.field_ub = SceneWidget.field_ib.field_ub;
            if (bd.field_c > 0) {
              pl.a(param0, param5, param1, (byte) 66);
            }
            if (fj.field_f > 0) {
              cn.a(0, param0, param5, param9, param1);
            }
            if (vb.field_c &&
              nf.field_b.field_wc >= nf.field_b.field_Ub) {
              fl.field_c.field_T = false;
              mj.field_Sb.field_Tb.field_S = pe.field_U;
              ue.a(0, mj.field_Sb.field_Ub);
            } else {
              mj.field_Sb.field_Tb.field_S = null;
              fl.field_c.field_T = true;
              ke.a(param8, param1, mj.field_Sb, param2, 0);
            }
          }
        } else {
          if (re.field_Z != SoftwareRaster.field_c) {
            if (sb.field_bb.field_i == SoftwareRaster.field_j &&
              SoftwareRaster.field_c == sb.field_bb.field_c) {
              if (null == nf.field_b) {
                if (ni.field_a != null) {
                  ef.a(1, true);
                } else {
                  vl.d(0);
                }
              } else {
                ef.a(param7 + 7, false);
              }
            }
            if (param5) {
              me.field_e = ln.field_f;
              cc.a(param5, 0);
              if (0 < SentinelCommand.field_t) {
                tm.a(param7 + 4, param5, param0, param1);
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              }
              rh.field_w.field_ub = SceneWidget.field_ib.field_ub;
              if (bd.field_c > 0) {
                pl.a(param0, param5, param1, (byte) 66);
              }
              if (fj.field_f > 0) {
                cn.a(0, param0, param5, param9, param1);
              }
              if (vb.field_c &&
                nf.field_b.field_wc >= nf.field_b.field_Ub) {
                fl.field_c.field_T = false;
                mj.field_Sb.field_Tb.field_S = pe.field_U;
                ue.a(0, mj.field_Sb.field_Ub);
              } else {
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, param1, mj.field_Sb, param2, 0);
              }
            } else {
              me.field_e = (re.field_Z - 640) / 2;
              cc.a(param5, 0);
              if (0 < SentinelCommand.field_t) {
                tm.a(param7 + 4, param5, param0, param1);
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              }
              rh.field_w.field_ub = SceneWidget.field_ib.field_ub;
              if (bd.field_c > 0) {
                pl.a(param0, param5, param1, (byte) 66);
              }
              if (fj.field_f > 0) {
                cn.a(0, param0, param5, param9, param1);
              }
              if (vb.field_c &&
                nf.field_b.field_wc >= nf.field_b.field_Ub) {
                fl.field_c.field_T = false;
                mj.field_Sb.field_Tb.field_S = pe.field_U;
                ue.a(0, mj.field_Sb.field_Ub);
              } else {
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, param1, mj.field_Sb, param2, 0);
              }
            }
          } else {
            if (SoftwareRaster.field_j != sf.field_t &&
              sb.field_bb.field_i == SoftwareRaster.field_j &&
              SoftwareRaster.field_c == sb.field_bb.field_c) {
              if (null == nf.field_b) {
                if (ni.field_a != null) {
                  ef.a(1, true);
                } else {
                  vl.d(0);
                }
              } else {
                ef.a(param7 + 7, false);
              }
            }
            if (!param5) {
              me.field_e = (re.field_Z - 640) / 2;
              cc.a(param5, 0);
              if (0 < SentinelCommand.field_t) {
                tm.a(param7 + 4, param5, param0, param1);
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              }
              rh.field_w.field_ub = SceneWidget.field_ib.field_ub;
              if (bd.field_c > 0) {
                pl.a(param0, param5, param1, (byte) 66);
              }
              if (fj.field_f > 0) {
                cn.a(0, param0, param5, param9, param1);
              }
              if (vb.field_c &&
                nf.field_b.field_wc >= nf.field_b.field_Ub) {
                fl.field_c.field_T = false;
                mj.field_Sb.field_Tb.field_S = pe.field_U;
                ue.a(0, mj.field_Sb.field_Ub);
              } else {
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, param1, mj.field_Sb, param2, 0);
              }
            } else {
              me.field_e = ln.field_f;
              cc.a(param5, 0);
              if (0 < SentinelCommand.field_t) {
                tm.a(param7 + 4, param5, param0, param1);
              }
              rh.field_w.field_Kb = 1;
              if (param7 != -6) {
                return;
              }
              rh.field_w.field_ub = SceneWidget.field_ib.field_ub;
              if (bd.field_c > 0) {
                pl.a(param0, param5, param1, (byte) 66);
              }
              if (fj.field_f > 0) {
                cn.a(0, param0, param5, param9, param1);
              }
              if (!vb.field_c) {
                mj.field_Sb.field_Tb.field_S = null;
                fl.field_c.field_T = true;
                ke.a(param8, param1, mj.field_Sb, param2, 0);
              } else {
                if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                  mj.field_Sb.field_Tb.field_S = null;
                  fl.field_c.field_T = true;
                  ke.a(param8, param1, mj.field_Sb, param2, 0);
                } else {
                  fl.field_c.field_T = false;
                  mj.field_Sb.field_Tb.field_S = pe.field_U;
                  ue.a(0, mj.field_Sb.field_Ub);
                }
              }
            }
          }
        }
        ca.a(param4, 1, param8, param2, param3, param6, param1);
        ke.a(param8, param1, gl.field_t, param2, 0);
        qa.field_H = qa.field_H + 1;
    }

    final static ef a(String param0, boolean param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        ef var7 = null;
        int var8 = 0;
        ef stackIn_3_0 = null;
        ef stackIn_6_0 = null;
        ef stackIn_9_0 = null;
        ef stackIn_15_0 = null;
        ef stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_3_0 = ud.field_A;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_6_0 = ma.field_cb;
            return stackIn_6_0;
          }
          var3 = ka.a('.', param1, param0);
          if (var3.length < 2) {
            stackIn_9_0 = ud.field_A;
            return stackIn_9_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = fn.a(-119, var6);
            if (var7 != null) {
              stackIn_15_0 = var7;
              return stackIn_15_0;
            }
          }
          stackIn_18_0 = rf.a((byte) 16, var3[var3.length - 1]);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("d.GA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private d(int param0, int param1, int param2, int param3, qk param4, tn param5, lh param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_J = param6;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "d.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static RgbSprite a(boolean param0) {
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var9 = null;
        int var5 = 0;
        byte[] var17 = null;
        Object var3 = null;
        int var7 = SteelSentinels.obfuscationControl;
        int var1 = le.field_L[0] * ca.field_r[0];
        byte[] var16 = dl.field_L[0];
        if (pd.field_U[0]) {
          var17 = sn.field_g[0];
          var13 = new int[var1];
          var11 = var13;
          var5_ref_int__ = var11;
          for (var6 = 0; var1 > var6; var6++) {
            var5_ref_int__[var6] = vn.a(ba.field_d[ec.a((int) var16[var6], 255)], ec.a(255, (int) var17[var6]) << 24);
          }
          var3 = new ek(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var13);
        } else {
          var9 = new int[var1];
          for (var5 = 0; var1 > var5; var5++) {
            var9[var5] = ba.field_d[ec.a(255, (int) var16[var5])];
          }
          var3 = new RgbSprite(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var9);
        }
        NodeHashTable.a(9324);
        if (param0) {
          return (RgbSprite) (var3);
        }
        field_R = -27;
        return (RgbSprite) (var3);
    }

    public static void h(int param0) {
        field_G = null;
        field_T = (int[][]) null;
        if (param0 == 12) {
          field_S = null;
          field_U = null;
          return;
        }
        field_R = -95;
        field_S = null;
        field_U = null;
    }

    static {
        field_T = new int[][]{new int[]{53, 29}, new int[]{56, 24}, new int[]{54, 18}, new int[]{59, 21}, new int[]{60}, new int[]{58}, new int[]{23}, new int[]{1, 30}, new int[]{2, 37}, new int[]{3, 26, 17}, new int[]{}, new int[]{61}, new int[]{31}, new int[]{20}, new int[]{64}, new int[]{66, 32}, new int[]{67, 22, 25}, new int[]{68, 19}, new int[]{70}, new int[]{71, 33}, new int[]{}, new int[]{73}, new int[]{74}, new int[]{34}, new int[]{78, 27}, new int[]{77, 83}, new int[]{76, 28}, new int[]{81}, new int[]{82, 36}, new int[]{}};
        field_S = new java.awt.Color(10040319);
        field_U = null;
    }
}
