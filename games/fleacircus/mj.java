/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    private final static void a(int[] param0, si param1, boolean param2, int[] param3, boolean param4, boolean param5, int param6) {
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = fleas.field_A ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param3[3] >> 2;
          var22 = param3[4] >> 2;
          var23 = param3[5] >> 2;
          var24 = param3[6] >> 2;
          if (param6 <= 48) {
            return;
          }
          var25 = param3[7] >> 2;
          var26 = param3[8] >> 2;
          var27 = param3[9] >> 2;
          var28 = param3[10] >> 2;
          var29 = param3[11] >> 2;
          var12 = var22 * param0[4] + (param0[3] * var21 + param0[5] * var23) >> 14;
          var13 = param0[5] * var26 + param0[3] * var24 + param0[4] * var25 >> 14;
          var16 = param0[8] * var26 + (var25 * param0[7] + var24 * param0[6]) >> 14;
          var18 = param0[11] * var23 + var22 * param0[10] + param0[9] * var21 >> 14;
          var17 = param0[6] * var27 - (-(param0[7] * var28) - param0[8] * var29) >> 14;
          var19 = var24 * param0[9] + param0[10] * var25 + var26 * param0[11] >> 14;
          var20 = var27 * param0[9] + var28 * param0[10] + var29 * param0[11] >> 14;
          var14 = param0[4] * var28 + param0[3] * var27 + param0[5] * var29 >> 14;
          var15 = var22 * param0[7] + param0[6] * var21 + var23 * param0[8] >> 14;
          var21Lifetime1 = -param3[0] + param0[0];
          var22Lifetime1 = param0[1] - param3[1];
          var23Lifetime1 = param0[2] - param3[2];
          var9 = var23Lifetime1 * param3[5] + var22Lifetime1 * param3[4] + var21Lifetime1 * param3[3] >> -bj.field_l + 16;
          var11 = var22Lifetime1 * param3[10] + (var21Lifetime1 * param3[9] + var23Lifetime1 * param3[11]) >> 16;
          var10 = param3[7] * var22Lifetime1 + (param3[6] * var21Lifetime1 + param3[8] * var23Lifetime1) >> -bj.field_l + 16;
          var21Lifetime2 = bl.field_c;
          var22Lifetime2 = bl.field_a;
          var23Lifetime2 = 0;
          L2: while (true) {
            if (param1.field_w > var23Lifetime2) {
              var24Lifetime1 = param1.field_n[var23Lifetime2];
              var25Lifetime1 = param1.field_f[var23Lifetime2];
              var26Lifetime1 = param1.field_P[var23Lifetime2];
              var27Lifetime1 = var9 + (var18 * var26Lifetime1 + var15 * var25Lifetime1 + var12 * var24Lifetime1 >> 16 - bj.field_l);
              var28Lifetime1 = (var13 * var24Lifetime1 - (-(var25Lifetime1 * var16) - var26Lifetime1 * var19) >> -bj.field_l + 16) + var10;
              var29Lifetime1 = var11 + (var17 * var25Lifetime1 + (var14 * var24Lifetime1 + var26Lifetime1 * var20) >> 16);
              stackIn_68_0 = 50;
              stackIn_68_1 = var29Lifetime1;
              if (var30 == 0) {
                if (stackIn_68_0 > stackIn_68_1) {
                  h.field_c[var23Lifetime2] = -2147483648;
                } else {
                  kb.field_o[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  il.field_c[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  h.field_c[var23Lifetime2] = var29Lifetime1;
                }
                if (param2) {
                  qk.field_f[var23Lifetime2] = var27Lifetime1 >> bj.field_l;
                  ej.field_c[var23Lifetime2] = var28Lifetime1 >> bj.field_l;
                  k.field_l[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (param1.field_L != null &&
                null != param1.field_G &&
                param1.field_O != null &&
                param1.field_c != null &&
                param1.field_I != null &&
                param1.field_z != null &&
                param1.field_g != null &&
                param1.field_d != null &&
                param1.field_v != null) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param1.field_j)) {
                  var24Lifetime1 = param1.field_L[var23Lifetime2];
                  var25Lifetime1 = param1.field_G[var23Lifetime2];
                  var26Lifetime1 = param1.field_O[var23Lifetime2];
                  jg.field_b[var23Lifetime2] = var9 + (var15 * var25Lifetime1 + var24Lifetime1 * var12 + var18 * var26Lifetime1 >> 16);
                  lj.field_d[var23Lifetime2] = (var26Lifetime1 * var19 + var16 * var25Lifetime1 + var13 * var24Lifetime1 >> 16) + var10;
                  ol.field_c[var23Lifetime2] = var11 + (var20 * var26Lifetime1 + var24Lifetime1 * var14 + var17 * var25Lifetime1 >> 16);
                  var24Lifetime1 = param1.field_c[var23Lifetime2];
                  var25Lifetime1 = param1.field_I[var23Lifetime2];
                  var26Lifetime1 = param1.field_z[var23Lifetime2];
                  al.field_b[var23Lifetime2] = var9 + (var25Lifetime1 * var15 + (var12 * var24Lifetime1 + var18 * var26Lifetime1) >> 16);
                  je.field_N[var23Lifetime2] = (var25Lifetime1 * var16 + (var13 * var24Lifetime1 + var26Lifetime1 * var19) >> 16) + var10;
                  pc.field_i[var23Lifetime2] = (var14 * var24Lifetime1 + (var25Lifetime1 * var17 + var26Lifetime1 * var20) >> 16) + var11;
                  var24Lifetime1 = param1.field_g[var23Lifetime2];
                  var25Lifetime1 = param1.field_d[var23Lifetime2];
                  var26Lifetime1 = param1.field_v[var23Lifetime2];
                  di.field_a[var23Lifetime2] = (var18 * var26Lifetime1 + (var24Lifetime1 * var12 + var15 * var25Lifetime1) >> 16) + var9;
                  kl.field_c[var23Lifetime2] = var10 + (var16 * var25Lifetime1 + (var13 * var24Lifetime1 + var26Lifetime1 * var19) >> 16);
                  q.field_a[var23Lifetime2] = var11 + (var14 * var24Lifetime1 - (-(var25Lifetime1 * var17) - var26Lifetime1 * var20) >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param5) {
                var9 = param0[3];
                var10 = param0[4];
                var11 = param0[5];
                var12 = param0[6];
                var13 = param0[7];
                var14 = param0[8];
                var15 = param0[9];
                var16 = param0[10];
                var17 = param0[11];
                var18 = 0;
                while (!(param1.field_p <= var18)) {
                  stackIn_68_0 = ~tc.field_b.length;
                  stackIn_68_1 = ~var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_68_0 >= stackIn_68_1) {
                    break;
                  }
                  var19 = param1.field_r[var18];
                  var20 = param1.field_K[var18];
                  var21Lifetime2 = param1.field_x[var18];
                  tc.field_b[var18] = var15 * var21Lifetime2 + var9 * var19 + var12 * var20 >> 16;
                  lj.field_j[var18] = var20 * var13 + var10 * var19 + var16 * var21Lifetime2 >> 16;
                  nb.field_d[var18] = var21Lifetime2 * var17 + var20 * var14 + var11 * var19 >> 16;
                  var18++;
                }
              }
              stackIn_68_0 = var7_int;
              stackIn_68_1 = var8;
            }
            break;
          }
          ca.a(stackIn_68_0, stackIn_68_1, param1, false, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("mj.B(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != rh.field_f) {
            lg.field_d = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < ah.field_g.length) {
              var2_int = -129 & ah.field_g[var2_int];
              if (fleas.field_A) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (0 <= em.field_f &&
              var2_int >= 0) {
              qk.field_b[em.field_f] = ~var2_int;
              em.field_f = 127 & em.field_f + 1;
              if (em.field_f == sd.field_a) {
                em.field_f = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_21_0 = runtimeException;
          stackIn_21_1 = new StringBuilder().append("mj.keyReleased(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        try {
          if (null != rh.field_f) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              ol.a((char) var2_int, -103)) {
              var3 = 127 & 1 + ak.field_e;
              if (~var3 != ~tl.field_o) {
                hj.field_b[ak.field_e] = -1;
                pf.field_d[ak.field_e] = (char) var2_int;
                ak.field_e = var3;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("mj.keyTyped(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        si var4_ref_si = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        si var17 = null;
        int var18 = 0;
        int var19 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException decompiledCaughtException = null;
        double var10Lifetime1;
        var19 = fleas.field_A ? 1 : 0;
        try {
          jj.field_Z = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ij.field_F.length;
          var2 = new int[var1_int];
          var3 = 0;
          do {
            if (var3 >= var1_int) {
              var3 = jj.field_Z[9] >> 8;
              break;
            }
            var4_ref_si = ij.field_F[var3];
            var4_ref_si.b(-23443);
            vi.a(var3, false);
            var5 = var4_ref_si.field_m + var4_ref_si.field_B >> 1;
            var6 = var4_ref_si.field_k + var4_ref_si.field_e >> 1;
            var7 = var4_ref_si.field_b + var4_ref_si.field_A >> 1;
            var8 = jj.field_Z[9] >> 2;
            var9 = jj.field_Z[10] >> 2;
            var10_int = jj.field_Z[11] >> 2;
            var11 = var9 * nl.field_a[4] + (var8 * nl.field_a[3] + var10_int * nl.field_a[5]) >> 14;
            var12 = var8 * nl.field_a[6] + var9 * nl.field_a[7] + nl.field_a[8] * var10_int >> 14;
            var13 = nl.field_a[11] * var10_int + (var8 * nl.field_a[9] + var9 * nl.field_a[10]) >> 14;
            var2[var3] = var7 * var13 + (var11 * var5 + var6 * var12) >> 16;
            var3++;
          } while (var19 == 0);
          var4 = jj.field_Z[10] >> 8;
          var5 = jj.field_Z[11] >> 8;
          var6 = vg.field_z << 4;
          var7 = 0;
          var8 = jc.a(var6, 125) >> 8;
          var9 = we.a((byte) -87, var6) >> 8;
          if (ag.field_f != -1 &&
            -1 != kc.field_b) {
            var7 = -320 + ag.field_f;
            var9 = -128;
            var8 = -kc.field_b + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 + var9 * var9));
          if (param0 != -515966495) {
            mj.a((int[]) null, (si) null, false, (int[]) null, true, true, 57);
          }
          var7 = (int)((double)var7 * var10);
          var8 = (int)((double)var8 * var10);
          var9 = (int)((double)var9 * var10);
          var12 = var7 - var3;
          var13 = -var4 + var8;
          var14 = var9 - var5;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13 * var13 + (var12 * var12 + var14 * var14)));
          var13 = (int)((double)var13 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var12 = (int)((double)var12 * var10Lifetime1);
          var15 = 0;
          L5: while (true) {
            stackIn_18_0 = ~var15;
            stackIn_18_1 = ~ij.field_F.length;
            if (stackIn_18_0 > stackIn_18_1) {
              var16 = 0;
              if (var19 != 0) {
                return;
              }
              var17_int = 1;
              while (var17_int < ij.field_F.length) {
                stackIn_18_0 = ~var2[var17_int];
                stackIn_18_1 = ~var2[var16];
                if (stackIn_18_0 < stackIn_18_1) {
                  var16 = var17_int;
                }
                var17_int++;
              }
              var2[var16] = -2147483648;
              var17 = ij.field_F[var16];
              vi.a(var16, false);
              var18 = 0;
              while (var18 < 3) {
                nl.field_a[var18] = nl.field_a[var18] + gm.field_kb[var15][var18];
                var18++;
              }
              mj.a(nl.field_a, var17, false, jj.field_Z, false, true, 91);
              tc.a(var12, var9, var13, var14, param0 ^ -515994062, var8, var7, var17);
              var15++;
              continue L5;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "mj.A(" + param0 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (rh.field_f != null) {
            em.field_f = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("mj.focusLost(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (rh.field_f != null) {
            lg.field_d = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              ah.field_g.length > var2_int) {
              var2_int = ah.field_g[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
                if (fleas.field_A) {
                  var2_int = -1;
                }
              }
            } else {
              var2_int = -1;
            }
            if (em.field_f >= 0 &&
              0 <= var2_int) {
              qk.field_b[em.field_f] = var2_int;
              em.field_f = 127 & em.field_f + 1;
              if (em.field_f == sd.field_a) {
                em.field_f = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 1 + ak.field_e & 127;
              if (~var3 != ~tl.field_o) {
                hj.field_b[ak.field_e] = var2_int;
                pf.field_d[ak.field_e] = '\0';
                ak.field_e = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) == 0 &&
              var2_int != 85 &&
              10 != var2_int) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("mj.keyPressed(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    static {
    }
}
