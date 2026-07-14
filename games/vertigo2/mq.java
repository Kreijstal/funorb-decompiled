/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends va {
    private e field_x;
    static String field_t;
    static String field_u;
    private e[] field_w;
    static mp field_v;

    final void a(byte param0, er param1) {
        e[] var3 = null;
        int var4 = 0;
        e var5_ref_e = null;
        int var5 = 0;
        int var6 = 0;
        e[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        var7 = ((mq) this).field_w;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            var5 = -101 % ((-16 - param0) / 58);
            return;
          } else {
            var5_ref_e = var7[var4];
            if (var5_ref_e != null) {
              var5_ref_e.field_h = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        L0: {
          var25 = Vertigo2.field_L ? 1 : 0;
          var6 = 0;
          var7 = param1;
          var8 = param3 * param3;
          if (!param0) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: {
          var9 = param1 * param1;
          var10 = var9 << 425192513;
          var11 = var8 << 1149150881;
          var12 = param1 << -422710591;
          var13 = var8 * (1 + -var12) + var10;
          var14 = var9 - (-1 + var12) * var11;
          var15 = var8 << 248128706;
          var16 = var9 << 1982044002;
          var17 = var10 * (3 + (var6 << 1801069345));
          var18 = (-3 + (var7 << -227164671)) * var11;
          var19 = var16 * (1 + var6);
          var20 = var15 * (-1 + var7);
          if (ua.field_e > param4) {
            break L1;
          } else {
            if (cj.field_D >= param4) {
              var21 = pk.a((byte) -14, ib.field_a, param5 + param3, ap.field_e);
              var22 = pk.a((byte) -14, ib.field_a, -param3 + param5, ap.field_e);
              ki.a(-86, var22, vl.field_e[param4], var21, param2);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if (-1 <= var7) {
            return;
          } else {
            L3: {
              if (-1 <= var13) {
                break L3;
              } else {
                L4: while (true) {
                  if ((var13 ^ -1) <= -1) {
                    break L3;
                  } else {
                    var13 = var13 + var17;
                    var14 = var14 + var19;
                    var6++;
                    var19 = var19 + var16;
                    var17 = var17 + var16;
                    continue L4;
                  }
                }
              }
            }
            L5: {
              if (-1 < (var14 ^ -1)) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var17 = var17 + var16;
                var19 = var19 + var16;
                var6++;
                break L5;
              } else {
                break L5;
              }
            }
            var14 = var14 + -var18;
            var13 = var13 + -var20;
            var20 = var20 - var15;
            var18 = var18 - var15;
            var7--;
            var21 = param4 + -var7;
            var22 = param4 - -var7;
            if (var22 < ua.field_e) {
              continue L2;
            } else {
              if (var21 <= cj.field_D) {
                L6: {
                  var23 = pk.a((byte) -14, ib.field_a, param5 - -var6, ap.field_e);
                  var24 = pk.a((byte) -14, ib.field_a, param5 + -var6, ap.field_e);
                  if (ua.field_e <= var21) {
                    ki.a(-85, var24, vl.field_e[var21], var23, param2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (cj.field_D < var22) {
                  continue L2;
                } else {
                  ki.a(-76, var24, vl.field_e[var22], var23, param2);
                  continue L2;
                }
              } else {
                continue L2;
              }
            }
          }
        }
    }

    final static void b(boolean param0) {
        int var2 = 0;
        L0: {
          var2 = Vertigo2.field_L ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          if (!ln.field_d.field_i) {
            if ((ln.field_d.field_D.field_t & 1 << ln.field_d.field_B) == 0) {
              if (ln.field_d.field_D.field_t != 0) {
                sl.field_q[12] = en.field_c;
                break L1;
              } else {
                if ((1 << ln.field_d.field_B | ln.field_d.field_h) != -1 + (1 << ln.field_d.field_D.field_z)) {
                  sl.field_q[12] = fq.field_f;
                  break L1;
                } else {
                  sl.field_q[12] = ii.field_A;
                  break L1;
                }
              }
            } else {
              sl.field_q[12] = ho.field_a;
              break L1;
            }
          } else {
            if ((1 << ln.field_d.field_B & ln.field_d.field_D.field_t) != 0) {
              sl.field_q[12] = hi.field_p;
              break L1;
            } else {
              if (ln.field_d.field_D.field_t == 0) {
                if ((1 << ln.field_d.field_B | ln.field_d.field_h) == -1 + (1 << ln.field_d.field_D.field_z)) {
                  sl.field_q[12] = kd.field_B;
                  break L1;
                } else {
                  sl.field_q[12] = oq.field_H;
                  break L1;
                }
              } else {
                sl.field_q[12] = bh.field_H;
                break L1;
              }
            }
          }
        }
    }

    private final void a(byte param0, boolean param1, mq param2) {
        int var4 = 0;
        e var5 = null;
        e var6 = null;
        int var7 = 0;
        e stackIn_7_0 = null;
        e stackIn_8_0 = null;
        e stackIn_9_0 = null;
        e stackIn_9_1 = null;
        e stackOut_6_0 = null;
        e stackOut_8_0 = null;
        e stackOut_8_1 = null;
        e stackOut_7_0 = null;
        e stackOut_7_1 = null;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          if (param0 > 39) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          super.a(16777215, (va) (Object) param2);
          if (!param1) {
            qq.a((Object[]) (Object) ((mq) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (6 <= var4) {
                break L1;
              } else {
                var5 = ((mq) this).field_w[var4];
                if (var5 == null) {
                  param2.field_w[var4] = null;
                  var4++;
                  continue L2;
                } else {
                  L3: {
                    var6 = param2.field_w[var4];
                    stackOut_6_0 = (e) var5;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != null) {
                      stackOut_8_0 = (e) (Object) stackIn_8_0;
                      stackOut_8_1 = (e) var6;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      param2.field_w[var4] = new e();
                      stackOut_7_0 = (e) (Object) stackIn_7_0;
                      stackOut_7_1 = new e();
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  ((e) (Object) stackIn_9_0).a(stackIn_9_1, 16777215);
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void c(int param0) {
        gk.field_a[44] = 71;
        gk.field_a[91] = 42;
        gk.field_a[59] = 57;
        gk.field_a[222] = 58;
        gk.field_a[520] = 59;
        gk.field_a[192] = 28;
        gk.field_a[92] = 74;
        gk.field_a[46] = 72;
        gk.field_a[45] = 26;
        gk.field_a[93] = 43;
        gk.field_a[47] = 73;
        gk.field_a[61] = 27;
        if (param0 != 1) {
            mq.c(-54);
        }
    }

    final static void a(java.math.BigInteger param0, ed param1, java.math.BigInteger param2, int param3, ed param4) {
        if (param3 != 12) {
            Object var6 = null;
            mq.a((java.math.BigInteger) null, (ed) null, (java.math.BigInteger) null, 66, (ed) null);
        }
        qp.a(param2, param0, param4.field_p, 0, param4.field_u, (byte) 63, param1);
    }

    final void a(int param0, er[] param1, boolean param2) {
        if (param2) {
            return;
        }
        int var4 = param0;
        if (((mq) this).field_w[var4] == null) {
            ((mq) this).field_w[var4] = new e();
        }
        ((mq) this).field_w[param0].field_m = param1;
    }

    final void a(er[] param0, byte param1) {
        e[] var3 = null;
        int var4 = 0;
        e var5 = null;
        int var6 = 0;
        e[] var7 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        var7 = ((mq) this).field_w;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            L1: {
              if (param1 >= 21) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_m = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    mq(mq param0, boolean param1) {
        this();
        param0.a((byte) 77, param1, (mq) this);
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        e var7 = null;
        e var9 = null;
        d var10 = null;
        e var11 = null;
        e var12 = null;
        e var13 = null;
        e var14 = null;
        iq stackIn_3_0 = null;
        iq stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof d) {
            stackOut_2_0 = (iq) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (iq) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (d) (Object) stackIn_3_0;
          jb.a(param3.field_t + param4, param3.field_o + param1 - -param3.field_n, param3.field_o + param1, -30486, param3.field_s + (param3.field_t + param4));
          if (var10 != null) {
            param0 = param0 & var10.field_F;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((mq) this).field_w[0];
          ((mq) this).field_x.a(-21151);
          var7.a((mq) this, param1, param3, -123, param4, ((mq) this).field_x);
          if (var10 != null) {
            L3: {
              if (var10.field_G) {
                var11 = ((mq) this).field_w[1];
                if (var11 == null) {
                  break L3;
                } else {
                  var11.a((mq) this, param1, param3, -73, param4, ((mq) this).field_x);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (!var10.field_p) {
              break L2;
            } else {
              L4: {
                var12 = ((mq) this).field_w[3];
                if (var10.field_A == 0) {
                  break L4;
                } else {
                  if (var12 != null) {
                    var12.a((mq) this, param1, param3, -116, param4, ((mq) this).field_x);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var9 = ((mq) this).field_w[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a((mq) this, param1, param3, -77, param4, ((mq) this).field_x);
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (param3.f(125)) {
            var13 = ((mq) this).field_w[5];
            if (var13 != null) {
              var13.a((mq) this, param1, param3, -93, param4, ((mq) this).field_x);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param2) {
            break L6;
          } else {
            e discarded$1 = ((mq) this).a(-104, 1);
            break L6;
          }
        }
        L7: {
          if (!param0) {
            var14 = ((mq) this).field_w[4];
            if (var14 != null) {
              var14.a((mq) this, param1, param3, -113, param4, ((mq) this).field_x);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((mq) this).field_x.a(param3, param1, 1, param4, (mq) this);
        ln.d(-28558);
    }

    final static void a(int param0, mp param1, int param2, cc param3, int param4, int param5, int param6, int param7, int param8, mp param9, byte param10, int param11, int param12, int param13, int param14, cc param15, int param16, int param17, int param18, mp param19, int param20) {
        if (param10 <= 14) {
            mq.a(true, -13, -58, 72, 60, -124);
        }
        nb.a(param11, param3, param15, (byte) -99);
        ar.a(param13, (byte) 77, param14, param5, param18);
        tn.a(param20, param8, 55);
        vd.a(param4, param9, 1516482162, param17, param12, param1);
        tr.a(param2, param0, param19, -25220);
        pb.a((byte) -26, param7, param16, param6);
    }

    final e a(int param0, int param1) {
        if (param1 != 6216) {
            field_v = null;
        }
        ((mq) this).field_w[param0] = new e();
        return new e();
    }

    public mq() {
        ((mq) this).field_w = new e[6];
        ((mq) this).field_x = new e();
        ((mq) this).field_w[0] = new e();
        e var1 = new e();
        var1.a(-21151);
    }

    final static String a(String param0, boolean param1) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        if (param1) {
            mq.a(false);
        }
        for (var4 = 0; var2 > var4; var4++) {
            var3[-var4 + var2 - 1] = param0.charAt(var4);
        }
        return new String(var3);
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_t = null;
        field_v = null;
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Loading...";
        field_u = "Try changing the '<%0>' setting.";
    }
}
