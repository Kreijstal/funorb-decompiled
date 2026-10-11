/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rc extends w {
    static ae field_r;
    static boolean field_u;
    static uj field_t;
    static String field_q;
    static String[] field_s;
    static ka[] field_p;

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            field_q = (String) null;
          }
          field_p = null;
          field_t = null;
          field_s = null;
          field_r = null;
          field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "rc.M(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int stackIn_34_0Lifetime1;
        int stackIn_34_1Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var24Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        var33 = TorChallenge.field_F ? 1 : 0;
        try {
          var9_int = (param3 >> 1) + param5;
          var10 = -(param4 >> 1) + param7;
          var11 = param8 + (param1 >> 1);
          var12 = param0 - (param6 >> 1);
          var13 = 1;
          var14 = 1;
          var15 = 2048;
          var9_int = var9_int % var15;
          var11 = var11 % var15;
          var16 = var11 - var9_int;
          if (var16 < 0) {
            var13 = -1;
          }
          var16 = var16 * var13;
          if (var16 > var15 >> 1) {
            var13 = -var13;
            var16 = var15 - var16;
          }
          var16 = (var16 >> 1) * var13 + var9_int;
          var16 = var16 % var15;
          var17 = var12 - var10;
          if (var17 < 0) {
            var14 = -1;
          }
          var17 = var17 * var14;
          var17 = (var17 >> 1) * var14 + var10;
          var18 = var16 / 32;
          var19 = 256 * (var16 - var18 * 32) / 32;
          var20 = var17 / 64;
          var21 = (-(var20 * 64) + var17) * 256 / 64;
          var22 = -1;
          var23 = 0;
          var24 = 0;
          var25 = ol.field_c[var23][var24][4];
          var27 = 0;
          L5: while (true) {
            if (8 > var27) {
              var26 = 1;
              stackIn_33_0 = 0;
              if (var33 != 0) {
                break L5;
              }
              var28 = stackIn_33_0;
              while (3 > var28) {
                stackIn_34_0 = ~ol.field_c[var27][var28][4];
                stackIn_34_1 = -1;
                if (stackIn_34_0 < stackIn_34_1) {
                  if (var25 > ol.field_c[var27][var28][4]) {
                    var24Lifetime1 = var28;
                    var23 = var27;
                    var25 = ol.field_c[var27][var28][4];
                  }
                  var26 = 0;
                }
                var28++;
              }
              if (var26 != 0) {
                var22 = var27;
              } else {
                var27++;
                continue;
              }
            }
            stackIn_33_0 = 0;
            break;
          }
          stackIn_34_0Lifetime1 = stackIn_33_0;
          stackIn_34_1Lifetime1 = var22;
          if (stackIn_34_0Lifetime1 > stackIn_34_1Lifetime1) {
            var22 = var23;
          }
          var27Lifetime1 = 0;
          ol.field_c[var22][var27Lifetime1][0] = var18;
          ol.field_c[var22][var27Lifetime1][2] = var19;
          ol.field_c[var22][var27Lifetime1][1] = var20;
          ol.field_c[var22][var27Lifetime1][3] = var21;
          ol.field_c[var22][var27Lifetime1][4] = 24;
          if (!param2) {
            rc.c((byte) 127);
          }
          var31 = var16;
          var32 = var17;
          var27Lifetime2 = 1;
          while (3 > var27Lifetime2) {
            var28Lifetime1 = e.b((byte) 57, 32);
            var29 = e.b((byte) 57, 32);
            var30 = e.b((byte) 57, 6);
            var17Lifetime1 = var29 + var32 - 16;
            ol.field_c[var22][var27Lifetime2][4] = var30 + 24;
            var16Lifetime1 = -16 + var31 + var28Lifetime1;
            var18Lifetime1 = var16Lifetime1 / 32;
            var20Lifetime1 = var17Lifetime1 / 64;
            var19Lifetime1 = (var16Lifetime1 - 32 * var18Lifetime1) * 256 / 32;
            ol.field_c[var22][var27Lifetime2][0] = var18Lifetime1;
            var21Lifetime1 = (var17Lifetime1 - 64 * var20Lifetime1) * 256 / 64;
            ol.field_c[var22][var27Lifetime2][2] = var19Lifetime1;
            ol.field_c[var22][var27Lifetime2][1] = var20Lifetime1;
            ol.field_c[var22][var27Lifetime2][3] = var21Lifetime1;
            var27Lifetime2++;
            if (var33 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var9), "rc.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    rc() {
    }

    final static void d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_57_0;
        pa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        qk var5_ref = null;
        qk var6 = null;
        String var6_ref = null;
        qk var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 < 68) {
            rc.b(true);
          }
          var1 = id.field_b;
          var2 = var1.j(-126);
          if (var2 == 0) {
            if (mh.field_e == null) {
              mh.field_e = new aa(128);
              og.field_a = 0;
            }
            stackIn_15_0 = (var1.j(-107) != 1) ? 0 : 1;
            var3_int = stackIn_15_0;
            var4_ref_String = var1.b(false);
            if (var3_int != 0) {
              var1.b(false);
            }
            var5_ref = wf.a((byte) -123, var4_ref_String);
            var6_ref = var1.b(false);
            var7_ref = il.a((CharSequence) ((Object) var4_ref_String), (byte) 21);
            if (var7_ref == null) {
              var7_ref = var4_ref_String;
            }
            if (null == var5_ref) {
              var5_ref = wf.a((byte) -123, var6_ref);
              if (var5_ref != null) {
                mh.field_e.a((long)var7_ref.hashCode(), var5_ref, -102);
              }
            }
            if (null == var5_ref) {
              var5_ref = new qk();
              mh.field_e.a((long)var7_ref.hashCode(), var5_ref, 118);
              fieldTemp$1 = og.field_a;
              og.field_a = og.field_a + 1;
              var5_ref.field_ob = fieldTemp$1;
              ie.field_d.a(var5_ref, -42);
            }
            var5_ref.field_F = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (oj.field_f == 1) {
                oj.field_f = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (oj.field_f == 2) {
                oj.field_f = 1;
              }
              return;
            }
            if (var2 != 4) {
              td.a("F1: " + ck.a(-13299), (Throwable) null, (byte) -70);
              ob.b(-128);
              return;
            }
            oj.field_f = 1;
            var3 = var1.b(false);
            me.field_d = ((String) (var3)).intern();
            var4 = var1.j(-108);
            bd.a(-116, var4);
            return;
          }
          if (gl.field_e == null) {
            gl.field_e = new aa(128);
            kf.field_c = 0;
          }
          var3Lifetime1 = var1.b(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.b(false);
          var5 = var1.b(false);
          var6 = ri.a(0, var4_ref_StringLifetime1);
          if (null == var6) {
            var6 = ri.a(0, var5);
            if (var6 != null) {
              gl.field_e.a((long)il.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 21).hashCode(), var6, -47);
            }
          }
          if (var6 == null) {
            var6 = new qk();
            gl.field_e.a((long)il.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 21).hashCode(), var6, 121);
            fieldTemp$0 = kf.field_c;
            kf.field_c = kf.field_c + 1;
            var6.field_ob = fieldTemp$0;
            rk.field_g.a(var6, -35);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_mb = (String) (var3Lifetime1);
          var6.field_F = var4_ref_StringLifetime1;
          var6.a(true);
          var7 = (qk) (rk.field_g.c((byte) -7));
          L10: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7 != null) {
              stackOut_57_0 = fd.a(var6, 116, var7);
              stackIn_65_0 = stackOut_57_0 ? 1 : 0;
              stackIn_58_0 = stackOut_57_0;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_58_0)) {
                var7 = (qk) (rk.field_g.c(-270));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7 == null) {
                break L10;
              }
              stackIn_65_0 = 52;
            }
            na.$cfr$intArgs$a$83744e1822f8(stackIn_65_0, var7, var6);
            if (var8 == 0) {
              return;
            }
            break;
          }
          rk.field_g.a(var6, -86);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "rc.J(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_143_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var6Lifetime1;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          var3 = 0;
          if (d.p(-115)) {
            var4 = eh.field_l;
            if (var7 != 0) {
              var4 = jj.field_c;
            }
          } else {
            var4 = jj.field_c;
          }
          ae.field_z = ae.field_z ^ 32;
          ac.field_d = ac.field_d ^ 32;
          if (!t.a(0, var4, 121) &&
            0 < fg.field_N &&
            0 < of.field_f &&
            !gh.field_x &&
            qk.field_lb >= of.field_f + fg.field_N) {
            hf.a(255, param0 + 110, 0);
          }
          if (!t.a(1, var4, 117) &&
            of.field_f > 0 &&
            !gh.field_x &&
            wj.field_a >= of.field_f &&
            ea.field_e > 0) {
            hf.a(254, 89, 1);
          }
          if (!t.a(2, var4, 126) &&
            0 < gf.a(hd.field_c[vj.field_c], (byte) 78)) {
            hf.a(253, 13, 2);
          }
          if (!t.a(3, var4, 121) &&
            gf.a(hd.field_c[vj.field_c], (byte) 78) >= 3) {
            hf.a(252, param0 ^ -62, 3);
          }
          if (!t.a(4, var4, 117)) {
            var5 = 0;
            while (true) {
              if (3 > var5) {
                stackIn_58_0 = 3;
                stackIn_58_1 = gf.a(hd.field_c[var5], (byte) 78);
                if (var7 == 0) {
                  if (stackIn_58_0 <= stackIn_58_1) {
                    var1_int++;
                  }
                  var5++;
                  continue;
                }
              } else {
                stackIn_58_0 = var1_int;
                stackIn_58_1 = 3;
              }
              if (stackIn_58_0 < stackIn_58_1) {
                break;
              }
              hf.a(251, 121, 4);
              break;
            }
          }
          if (!t.a(5, var4, 123) &&
            2 <= ab.field_d) {
            hf.a(250, 98, 5);
          }
          if (!t.a(6, var4, 126) &&
            ab.field_d >= 4) {
            hf.a(249, 55, 6);
          }
          if (!t.a(7, var4, 113) &&
            6 <= ab.field_d) {
            hf.a(248, 125, 7);
          }
          boolean decompiledFrameCompleted0 = true;
          if (!t.a(8, var4, 116)) {
            var5Lifetime1 = 0;
            while (3 > var5Lifetime1) {
              stackIn_96_0 = ~(1 << var5Lifetime1 & hk.field_c[vj.field_c]);
              stackIn_96_1 = -1;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_96_0 < stackIn_96_1) {
                var2++;
              }
              var5Lifetime1++;
            }
            if (decompiledFrameCompleted0) {
              if (var2 > 0) {
                hf.a(247, param0 ^ -68, 8);
              }
              var2 = 0;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_96_0 = 9;
            stackIn_96_1 = var4;
          }
          if (!t.a(stackIn_96_0, stackIn_96_1, param0 + 196)) {
            var5Lifetime2 = 0;
            while (true) {
              if (var5Lifetime2 < 3) {
                stackIn_108_0 = ~(1 << var5Lifetime2 & hk.field_c[vj.field_c]);
                stackIn_108_1 = -1;
                if (var7 == 0) {
                  if (stackIn_108_0 < stackIn_108_1) {
                    var2++;
                  }
                  var5Lifetime2++;
                  continue;
                }
              } else {
                stackIn_108_0 = 2;
                stackIn_108_1 = var2;
              }
              break;
            }
            if (stackIn_108_0 <= stackIn_108_1) {
              hf.a(246, 112, 9);
            }
            var2 = 0;
          }
          if (!t.a(10, var4, param0 ^ -45)) {
            var5Lifetime3 = 0;
            while (true) {
              if (var5Lifetime3 < 3) {
                stackIn_122_0 = 0;
                stackIn_122_1 = 1 << var5Lifetime3 & hk.field_c[vj.field_c];
                if (var7 == 0) {
                  if (stackIn_122_0 < stackIn_122_1) {
                    var2++;
                  }
                  var5Lifetime3++;
                  continue;
                }
              } else {
                stackIn_122_0 = ~var2;
                stackIn_122_1 = -4;
              }
              break;
            }
            if (stackIn_122_0 <= stackIn_122_1) {
              hf.a(245, 86, 10);
            }
            var2 = 0;
          }
          if (param0 != -82) {
            return;
          }
          if (!t.a(11, var4, 127)) {
            var5Lifetime4 = 0;
            while (true) {
              stackIn_133_0 = 3;
              stackIn_133_1 = var5Lifetime4;
              if (stackIn_133_0 > stackIn_133_1) {
                stackIn_143_0 = 0;
                if (var7 == 0) {
                  var6 = stackIn_143_0;
                  while (var6 < 3) {
                    stackIn_133_0 = ~(hk.field_c[var5Lifetime4] & 1 << var6);
                    stackIn_133_1 = -1;
                    if (stackIn_133_0 < stackIn_133_1) {
                      var2++;
                    }
                    var6++;
                  }
                  var5Lifetime4++;
                  continue;
                }
              } else {
                stackIn_143_0 = -10;
              }
              if (stackIn_143_0 >= ~var2) {
                hf.a(244, 113, 11);
              }
              var2 = 0;
              break;
            }
          }
          if (!t.a(12, var4, 117) &&
            rk.a((byte) -119, pi.field_d[vj.field_c]) >= 20) {
            hf.a(243, param0 + 172, 12);
          }
          if (!t.a(13, var4, 113) &&
            30 <= rk.a((byte) 118, pi.field_d[vj.field_c])) {
            hf.a(242, 101, 13);
          }
          if (!t.a(14, var4, 121)) {
            var5Lifetime5 = 0;
            while (true) {
              if (var5Lifetime5 < 3) {
                var3 = var3 + rk.a((byte) 49, pi.field_d[var5Lifetime5]);
                var5Lifetime5++;
                if (var7 == 0) {
                  continue;
                }
              } else {
                if (90 > var3) {
                  break;
                }
              }
              hf.a(241, 29, 14);
              break;
            }
          }
          if (!t.a(15, var4, param0 + 196) &&
            gh.field_m &&
            ea.field_e > 0) {
            hf.a(240, 100, 15);
          }
          if (!t.a(16, var4, 116) &&
            g.a(125, 0) &&
            qh.field_J >= 150) {
            var5Lifetime6 = 16;
            var6Lifetime1 = 255 - var5Lifetime6;
            hf.a(var6Lifetime1, param0 + 97, var5Lifetime6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "rc.L(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -2) {
            stackIn_4_0 = lh.e(0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 89;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "rc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = null;
        field_u = false;
        field_q = "Back";
        ka discarded$0 = new ka(96, 96);
        field_s = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
