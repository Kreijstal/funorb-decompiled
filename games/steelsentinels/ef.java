/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int[][] field_d;
    static String field_a;
    static int field_c;
    static boolean field_b;

    public static void b(int param0) {
        if (param0 != 8421504) {
          return;
        }
        field_a = null;
        field_d = (int[][]) null;
    }

    final static void a(int param0, int param1) {
        if (param0 != 1) {
          ef.a((byte) -118);
        }
        ll.field_q = param1;
        if (null != q.field_f) {
          q.field_f.a(param1, 1000000);
        }
        if (ja.field_g != null) {
          ja.field_g.a(param1, param0 - 2);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(ArticulatedPart param0, int param1, int[] param2) {
        int var5 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 0;
          var4 = param0.i(-110);
          for (var5 = 0; var5 < var4; var5++) {
            if (param2[var5] == 0) {
              var3_int++;
            }
            if (param2[var5] == 1) {
              var3_int += 2;
            }
            if (2 == param2[var5]) {
              var3_int += 3;
            }
            if (param2[var5] == 3) {
              var3_int += 4;
            }
            if (param2[var5] == 4) {
              var3_int += 5;
            }
            if (20 == param2[var5]) {
              var3_int += 10;
            }
            if (param2[var5] == 34) {
              var3_int += 25;
            }
          }
          if (param1 != 12258) {
            ef.a(-71);
          }
          var3_int++;
          stackIn_23_0 = var3_int;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("ef.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = SteelSentinels.obfuscationControl;
        int var3Lifetime1;
        try {
          var1_int = 1;
          for (var2 = 0; var2 < 30; var2++) {
            if ((var1_int & Explosion.field_P) == 0) {
            } else {
              mm.field_g.writeCipheredOpcode(71, (byte) -117);
              mm.field_g.writeByte((byte) 122, var2);
              if (var2 >= 10) {
                mm.field_g.writeShort(jh.field_a[var2 - 10], 31);
              } else {
                mm.field_g.writeShort(0, 105);
              }
              for (var3 = 0; var3 < 4; var3++) {
                mm.field_g.writeInt(true, 0);
              }
            }
            var1_int = var1_int << 1;
          }
          var3Lifetime1 = -70 / ((param0 - 40) / 32);
          Explosion.field_P = 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ef.A(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        SceneWidget stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        int stackIn_7_6 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        SceneWidget var7 = null;
        int var7_int = 0;
        int var8 = 0;
        SceneWidget var8_ref_gh = null;
        qh var9 = null;
        int var9_int = 0;
        int var10 = 0;
        qh var10_ref_qh = null;
        int var12 = 0;
        int var13 = 0;
        SceneWidget var14 = null;
        var13 = SteelSentinels.obfuscationControl;
        try {
          sf.field_t = SoftwareRaster.field_j;
          re.field_Z = SoftwareRaster.field_c;
          stackIn_3_0 = 61;
          if (param1) {
            stackIn_4_1 = bd.field_c;
          } else {
            stackIn_4_1 = fj.field_f;
          }
          vb.$cfr$intArgs$a$e9dea5688aa5(stackIn_3_0, stackIn_4_1);
          fg.field_Tb.a(-2 + (ql.field_ec.field_Lb - 40), 0, ql.field_ec.field_zb, param0 ^ 3, 0);
          uj.field_e.a(0, 0, db.field_b, 0, m.field_i.field_zb);
          stackIn_6_0 = gl.field_u;
          stackIn_6_1 = 0;
          stackIn_6_2 = db.field_b + 2;
          stackIn_6_3 = 18;
          stackIn_6_4 = 0;
          stackIn_6_5 = m.field_i.field_zb;
          if (!rm.field_p) {
            stackIn_7_6 = 0;
          } else {
            stackIn_7_6 = 40 + (ua.field_G + 2) + 2;
          }
          ((SceneWidget) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_6_5 - stackIn_7_6);
          ei.field_p.a(0, db.field_b + 2, 18, -2 + (m.field_i.field_zb - (ua.field_G + 40)), 42 + ua.field_G);
          gl.field_t.a(m.field_i.field_zb, -2048, ua.field_G, -2 + (-db.field_b + m.field_i.field_Lb) - 20, 2, 0, db.field_b + 22);
          mn.field_E.a(0, -40 + ql.field_ec.field_Lb, 40, 0, ql.field_ec.field_zb);
          nm.field_q.a(0, 0, 30, 0, gl.field_y.field_zb);
          qa.field_L.a(0, 30, -30 + gl.field_y.field_Lb - 42, 0, gl.field_y.field_zb);
          var2_int = 3 + be.field_a;
          if (jg.field_l.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + ((var2_int + 1) / 2 - 8 + (-5 + (qa.field_L.field_Lb - 5))) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -(var2_int * (2 + var3)) + (qa.field_L.field_Lb - 5 - 5);
          if (var4 > 40) {
            var4 = 40;
          }
          bj.field_d.a(param0 - 1, 5, var4, 5, -10 + qa.field_L.field_zb);
          var5 = 2 + (5 + var4);
          for (var6 = 0; var6 < 4 + be.field_a; var6++) {
            if ((var6 != 1 ||
              !(2 > jg.field_l.length)) && (var6 != 3 ||
              !(tc.field_z <= 1))) {
              if (!param1 &&
                var6 == 3) {
                var7 = sl.field_k[var6];
                sl.field_k[var6].field_Lb = 0;
                var7.field_zb = 0;
                for (var8 = 0; var8 < un.field_h[var6].length; var8++) {
                  if (null != un.field_h[var6][var8]) {
                    var9 = un.field_h[var6][var8];
                    un.field_h[var6][var8].field_Lb = 0;
                    var9.field_zb = 0;
                  }
                }
              } else if (param1 &&
                0 == var6) {
                var14 = sl.field_k[var6];
                var7 = var14;
                sl.field_k[var6].field_Lb = 0;
                var14.field_zb = 0;
                for (var8 = 0; un.field_h[var6].length > var8; var8++) {
                  if (un.field_h[var6][var8] != null) {
                    var9 = un.field_h[var6][var8];
                    un.field_h[var6][var8].field_Lb = 0;
                    var9.field_zb = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (ch.field_G != null) {
                      stackIn_40_0 = (ch.field_G[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_40_0 = 0;
                    }
                  } else {
                    stackIn_40_0 = 0;
                  }
                } else {
                  stackIn_40_0 = 0;
                }
                var7_int = stackIn_40_0;
                if (var7_int != 0) {
                  var8_ref_gh = sl.field_k[var6];
                  sl.field_k[var6].field_Lb = 0;
                  var8_ref_gh.field_zb = 0;
                  for (var9_int = 0; un.field_h[var6].length > var9_int; var9_int++) {
                    if (un.field_h[var6][var9_int] != null) {
                      var10_ref_qh = un.field_h[var6][var9_int];
                      un.field_h[var6][var9_int].field_Lb = 0;
                      var10_ref_qh.field_zb = 0;
                    }
                  }
                } else {
                  sl.field_k[var6].a(0, var5, var3, 5, 103);
                  var8 = 110;
                  if (param1) {
                    un.field_h[var6][0].a(var3, 38, 2, var8, va.field_e, var5, (byte) 122);
                    var8 += 40;
                  } else {
                    if (null != un.field_h[var6][0]) {
                      var9 = un.field_h[var6][0];
                      un.field_h[var6][0].field_Lb = 0;
                      var9.field_zb = 0;
                    }
                  }
                  var9_int = 2 + gl.field_y.field_zb - (5 + var8);
                  var10 = un.field_h[var6].length - 1;
                  for (var11 = 0; var11 < var10; var11++) {
                    var12 = var9_int * var11 / var10;
                    un.field_h[var6][var11 + 1].a(var3, -var12 + (1 + var11) * var9_int / var10 - 2, 2, var8 + var12, va.field_e, var5, (byte) 121);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          fb.field_r.a(0, 10, -134 + (SoftwareRaster.field_j - 10), SoftwareRaster.field_c - 360 >> 1, 360);
          tf.field_a.a(0, 0, 24, 0, fb.field_r.field_zb);
          nd.field_a.a(0, 24, fb.field_r.field_Lb - 24, 0, fb.field_r.field_zb);
          nd.field_a.field_I = se.a(3, param0, 11579568, nd.field_a.field_Lb, 8421504, 13574);
          fl.field_c.a(0, 5, -26 + (-10 + nd.field_a.field_Lb), 5, -10 + nd.field_a.field_zb);
          ta.field_i.a(0, -29 + nd.field_a.field_Lb, 24, (-80 + nd.field_a.field_zb) / 2, 80);
          ql.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ef.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (!mg.field_ac) {
          throw new IllegalStateException();
        }
        IntrusiveNode.field_a = true;
        if (param0 != 12) {
          field_b = true;
        }
        nj.a(false, 40);
        uj.field_d = 0;
    }

    final static boolean b(int param0, int param1) {
        if (param1 < 0) {
          return (param1 + 1) % 4 == 0 ? true : false;
        }
        if (param1 < 1582) {
          return param1 % 4 == 0 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (param1 % 400 != 0) {
          return false;
        }
        if (param0 != -15020) {
          return true;
        }
        return true;
    }

    static {
        field_d = new int[][]{new int[]{0, 0, 0}, new int[]{1, 0, 0, 1}, new int[]{8, 0, 0, 1}, new int[]{1, 9, 1}, new int[]{1, 0, 0, 8}, new int[]{9, 7, 9}, new int[]{7, 0, 7}, new int[]{3, 0, 7, 0, 3}, new int[]{20, 8, 1, 8, 20}, new int[]{10, 0, 10}, new int[]{3, 7, 8}, new int[]{8, 7, 3}, new int[]{9, 9, 9, 9}, new int[]{2, 2}, new int[]{8, 0, 3, 0, 8}, new int[]{10, 0, 3, 3, 2}, new int[]{0, 0, 7, 0, 0}, new int[]{2, 3, 3, 0, 10}, new int[]{1, 1, 1, 1}, new int[]{11, 0, 0, 0}, new int[]{0, 0, 0, 11}, new int[]{12, 12}, new int[]{9, 3, 24, 3, 9}, new int[]{13}, new int[]{2, 2, 2, 2, 12}, new int[]{12, 4, 3, 3, 4}, new int[]{0, 0, 14, 0, 0}, new int[]{2, 13, 2}, new int[]{11, 5, 5, 5, 11}, new int[]{10, 1, 1, 12, 12}, new int[]{12, 12, 1, 1, 10}, new int[]{3, 15, 3}, new int[]{8, 6, 4, 4, 6, 8}, new int[]{9, 9, 4, 6, 14}, new int[]{14, 6, 4, 9, 9}, new int[]{16, 16}, new int[]{11, 12, 4, 4, 12, 11}, new int[]{13, 24, 13}, new int[]{12, 8, 15, 8, 12}, new int[]{14, 0, 0, 0, 17, 0, 0, 0, 14}, new int[]{9, 9, 6, 16, 6, 9, 9}, new int[]{18}};
        field_c = 0;
        field_b = false;
        field_a = "You have withdrawn your request to join.";
    }
}
