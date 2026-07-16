/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ig {
    static np field_f;
    static String field_e;
    static int field_g;
    static String field_b;
    static String field_i;
    static int field_c;
    static String field_k;
    static String field_h;
    static ut[] field_a;
    static int field_d;
    static String field_j;

    public static void a(byte param0) {
        field_a = null;
        field_k = null;
        field_i = null;
        field_b = null;
        if (param0 != -13) {
            return;
        }
        field_j = null;
        field_f = null;
        field_e = null;
        field_h = null;
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          param0 = param0 >> 1;
          vo.field_cb.c(param0 + qj.field_e, bi.field_i);
          nn.field_C.c(param0 + qj.field_e, 18 + bi.field_i);
          var2 = 2;
          if (wm.field_s <= 1) {
            break L0;
          } else {
            var3 = 1;
            L1: while (true) {
              if ((var3 ^ -1) <= (wm.field_s ^ -1)) {
                break L0;
              } else {
                nn.field_C.c(qj.field_e + param0, 18 + bi.field_i + var2);
                var2 += 2;
                var3++;
                continue L1;
              }
            }
          }
        }
        L2: {
          du.field_i.c(qj.field_e - -param0, bi.field_i + (18 + var2));
          un.field_d.a(qn.field_c, 13 + qj.field_e + param0, var2 / 2 + (20 + bi.field_i), 16777215, -1);
          var3 = 0;
          if (param1 == -12452) {
            break L2;
          } else {
            field_c = -16;
            break L2;
          }
        }
        L3: {
          var4 = 0;
          if (0 != dc.field_d) {
            var3 = 0;
            pt.a(param0 + (qj.field_e + vo.field_cb.field_q), -22914, qj.field_e - -param0, -14 + (bi.field_i - (-vo.field_cb.field_w - 2 * wm.field_s)), bi.field_i + 8);
            var4 = cf.field_Db;
            L4: while (true) {
              if (var4 <= 0) {
                var4 = Math.abs(dc.field_d);
                var3 = 0;
                L5: while (true) {
                  if (-1 <= (var4 ^ -1)) {
                    L6: {
                      if (dc.field_d < 0) {
                        un.field_d.a(vl.field_b, qj.field_e + (140 + -(var3 * field_a[0].field_q) + param0), bi.field_i - (-35 + 2 * (-wm.field_s + 18)), 16729156, -1);
                        break L6;
                      } else {
                        un.field_d.a(ks.field_b, -(var3 * field_a[0].field_q) + (qj.field_e - -140 + param0), 35 + bi.field_i - 2 * (18 - wm.field_s), 4521796, -1);
                        break L6;
                      }
                    }
                    un.field_d.a("-----------", 64 + qj.field_e, -(2 * (18 + -wm.field_s)) + 44 + bi.field_i, 16777215, -1);
                    ta.e(param1 ^ -12506);
                    break L3;
                  } else {
                    L7: {
                      if (-1 < (dc.field_d ^ -1)) {
                        wk.field_d[var4 % 10].c(param0 + -(wk.field_d[0].field_q * var3) + (140 + qj.field_e), -36 - (-(2 * wm.field_s) - (24 + bi.field_i)));
                        break L7;
                      } else {
                        gb.field_G[var4 % 10].c(param0 + qj.field_e + (140 - gb.field_G[0].field_q * var3), 24 + bi.field_i + -((18 + -wm.field_s) * 2));
                        break L7;
                      }
                    }
                    var4 = var4 / 10;
                    var3++;
                    continue L5;
                  }
                }
              } else {
                field_a[var4 % 10].c(qj.field_e + 140 + (-(var3 * field_a[0].field_q) + param0), 9 + (bi.field_i - 2 * (-wm.field_s + 18)));
                var3++;
                var4 = var4 / 10;
                continue L4;
              }
            }
          } else {
            break L3;
          }
        }
        L8: {
          var4 = ua.field_l;
          var3 = 0;
          if (var4 != 0) {
            break L8;
          } else {
            field_a[0].c(param0 + (140 + (qj.field_e - field_a[0].field_q * var3)), bi.field_i + 7 + wm.field_s * 2);
            break L8;
          }
        }
        L9: while (true) {
          if (var4 <= 0) {
            return;
          } else {
            field_a[var4 % 10].c(qj.field_e - -140 - (var3 * field_a[0].field_q - param0), bi.field_i - -7 + 2 * wm.field_s);
            var3++;
            var4 = var4 / 10;
            continue L9;
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param1 != 4620) {
            field_h = null;
        }
        return (int)(fw.field_G + (jr.field_Gb + (double)((-240 + param0 << 1318329896) / hw.field_i)));
    }

    final static void a(boolean param0, byte param1, int param2, int param3) {
        if (param1 < 15) {
            return;
        }
        int var4 = sh.a(70, param2);
        int var5 = fm.a((byte) -27, param3);
        gm var6 = (gm) (Object) et.field_d.field_P[param3][param2];
        int var7 = !param0 ? 80 + qj.a(-6779, 480) : qj.a(-6779, 0) - 50;
        if (var6.field_w != var5) {
            if (tc.a(4, (byte) 106, var6.field_M, (nl) (Object) var6, var7 << -1225474960)) {
                var6.a(var4, false, 0, var5);
            }
        }
    }

    final static void a(long param0, String param1, byte param2) {
        ov.field_b = 2;
        at.field_Kb = param1;
        if (param2 <= 46) {
            Object var5 = null;
            ig.a(127L, (String) null, (byte) 87);
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        qi.field_o = mo.a(0, var6);
        ik.field_A = param0;
        vg.field_Wb = true;
    }

    final static void a(boolean param0, int param1, int param2) {
        uo var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6_int = 0;
        String[] var6 = null;
        String[] var7 = null;
        int var8 = 0;
        String[] var9_ref_String__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var11_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String[] var17 = null;
        String var18 = null;
        String[] var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String[] var23 = null;
        String stackIn_13_0 = null;
        String[] stackIn_16_0 = null;
        String[] stackIn_19_0 = null;
        String stackOut_12_0 = null;
        String stackOut_11_0 = null;
        String[] stackOut_15_0 = null;
        String[] stackOut_14_0 = null;
        String[] stackOut_18_0 = null;
        String[] stackOut_17_0 = null;
        var15 = Kickabout.field_G;
        var3 = pb.field_C;
        var4 = 0;
        var17 = po.field_a;
        var6_int = 0;
        L0: while (true) {
          if (var17.length <= var6_int) {
            var19 = w.field_g;
            var16 = 0;
            var6_int = var16;
            L1: while (true) {
              if (var19.length <= var16) {
                L2: {
                  if (param0) {
                    stackOut_12_0 = iw.field_k;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = qd.field_f;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var21 = stackIn_13_0;
                  var5 = var21;
                  if (!param0) {
                    stackOut_15_0 = fn.field_j;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = cg.field_G;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_16_0;
                  var22 = "[" + var21 + "]";
                  if (param0) {
                    stackOut_18_0 = po.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = w.field_g;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                var23 = stackIn_19_0;
                var7 = var23;
                var8 = 0;
                var9_ref_String__ = var6;
                var10 = 0;
                L5: while (true) {
                  if (var10 >= var9_ref_String__.length) {
                    var9 = 20 + (var4 + var8 + 65);
                    var10 = rb.field_yb * (var6.length + 1) - -20;
                    var11 = -6 + (-var10 + (473 - rn.field_c * vt.field_c.field_I) + -22);
                    on.a(-var9 + 644, var11, var9, var10, 2, 0, param2);
                    var12 = 619 - (var4 + 20);
                    var13 = 6 + var11 + rb.field_yb;
                    ((hu) (Object) var3).c(var22, 599, var13, param1, -1);
                    var13 = var13 + (rb.field_yb + 6);
                    var14 = 0;
                    L6: while (true) {
                      if (var6.length <= var14) {
                        return;
                      } else {
                        ((hu) (Object) var3).a(':', var12, var13, 16777215);
                        ((hu) (Object) var3).c(var6[var14], -20 + var12, var13, 16777215, -1);
                        ((hu) (Object) var3).a(var23[var14], 20 + var12, var13, 16777215, -1);
                        var13 = var13 + (2 + rb.field_yb);
                        var14++;
                        continue L6;
                      }
                    }
                  } else {
                    var11_ref_String = var9_ref_String__[var10];
                    var12 = ((hu) (Object) var3).a(var11_ref_String);
                    if (var12 > var8) {
                      var8 = var12;
                      var10++;
                      continue L5;
                    } else {
                      var10++;
                      continue L5;
                    }
                  }
                }
              } else {
                var20 = var19[var16];
                var8 = ((hu) (Object) var3).a(var20);
                if (var4 < var8) {
                  var4 = var8;
                  var16++;
                  continue L1;
                } else {
                  var16++;
                  continue L1;
                }
              }
            }
          } else {
            var18 = var17[var6_int];
            var8 = ((hu) (Object) var3).a(var18);
            if (var4 < var8) {
              var4 = var8;
              var6_int++;
              continue L0;
            } else {
              var6_int++;
              continue L0;
            }
          }
        }
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1936506367;
        if (param0 != 6) {
            return -2;
        }
        param1 = param1 | param1 >>> -1263296798;
        param1 = param1 | param1 >>> -226303548;
        param1 = param1 | param1 >>> 2919720;
        param1 = param1 | param1 >>> 703318672;
        return 1 + param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Show all lobby chat";
        field_i = "Report abuse";
        field_e = "<%0> (left)";
        field_h = "Elapsed time";
        field_j = "Waiting for players to choose the lineup...";
        field_k = "create new game";
    }
}
