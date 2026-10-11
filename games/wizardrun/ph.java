/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends ge {
    static int[] field_q;
    static int field_r;
    static String field_s;
    boolean field_p;
    static int field_o;

    final void a(int param0, boolean param1, int param2, byte param3) {
        int var5;
        String var6;
        int var11;
        int stackIn_3_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_54_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var7Lifetime2Lifetime1;
        int var7Lifetime2Lifetime2;
        int var7Lifetime2Lifetime3;
        int var10Lifetime1Lifetime1;
        var11 = wizardrun.field_H;
        stackIn_3_0 = (!param1) ? 16639 : 16777215;
        boolean decompiledFrameRemainder0 = true;
        var5 = stackIn_3_0;
        var6 = "";
        if (param2 != 0) {
          if (param2 == 1) {
            var6 = vk.field_o;
            if (param1) {
              var7 = jj.field_b.b(var6);
              ok.field_d[2].e(268 - (var7 / 2 + ok.field_d[2].field_z), param0);
              ok.field_d[2].e(var7 / 2 + 268, param0);
            }
            if (param3 > -98) {
              ph.a((byte) 46);
            }
            jj.field_b.b(var6, 267, param0 + 18, 0, -1);
            jj.field_b.b(var6, 269, param0 + 18, 0, -1);
            jj.field_b.b(var6, 268, 18 + param0 - 1, 0, -1);
            jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
            jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
            jj.field_b.b(var6, 270, 2 + param0 + 18, 0, -1);
            jj.field_b.b(var6, 268, param0 + 18, var5, -1);
            return;
          }
          if ((param2 != 5 ||
            e.a(-116)) &&
            (param2 != 4 ||
            !e.a(-103))) {
            if (param2 == 2) {
              if (pk.field_s) {
                stackIn_54_0 = ee.field_p;
              } else {
                stackIn_54_0 = 0;
              }
              var7Lifetime2 = stackIn_54_0;
              var8 = 20 + param0;
              var9 = 260;
              ok.field_d[0].a(2 + var9 + 0, -6 + var8 - 10, -118, 20, 0);
              ok.field_d[0].a(2 + var9 - 0, -6 + (var8 + 10), -86, 20, 0);
              ok.field_d[0].a(2 + (0 + var9), -6 + var8, -105, 30, 0);
              ok.field_d[0].a(108 + var9 + 2, -10 + (-6 + var8), -98, 20, 0);
              ok.field_d[0].a(var9 + 108 + 2, var8 - 6 + 10, -121, 20, 0);
              ok.field_d[0].a(2 + var9 + 108, -6 + var8, -90, 30, 0);
              for (var10 = var9; var10 < -12 + var9 + 108; var10 += 14) {
                ok.field_d[0].b(var10, var8 - 14 - 6, 28, 28, 64);
              }
              ed.c(0, 0, 2 + (var7Lifetime2 * 108 / 104 + var9), 480);
              for (var10Lifetime2 = var9; 108 + var9 + 2 - 14 > var10Lifetime2; var10Lifetime2 += 14) {
                ok.field_d[0].a(var10Lifetime2, -20 + var8, 28, 28);
              }
              ed.c();
              ok.field_d[0].a(2 + var7Lifetime2 * 108 / 104 + var9, var8 - 16, -102, 30, 0);
              ok.field_d[0].a(2 + (var7Lifetime2 * 108 / 104 + var9), var8 - 6 + 10, -102, 30, 0);
              ok.field_d[0].a(108 * var7Lifetime2 / 104 + (var9 + 2), var8 - 6, -90, 40, 0);
              var6 = qc.field_N + "       ";
              decompiledFrameRemainder0 = false;
            }
            else {
              if (3 == param2) {
                if (tl.field_e) {
                  stackIn_27_0 = hc.field_o;
                } else {
                  stackIn_27_0 = 0;
                }
                var7Lifetime2Lifetime1 = stackIn_27_0;
                var8Lifetime1 = param0 + 20;
                var9Lifetime1 = 260;
                ok.field_d[0].a(0 + var9Lifetime1 + 2, -16 + var8Lifetime1, -121, 20, 0);
                ok.field_d[0].a(var9Lifetime1 - 0 + 2, -6 + var8Lifetime1 + 10, -115, 20, 0);
                ok.field_d[0].a(2 + var9Lifetime1, var8Lifetime1 - 6, -125, 30, 0);
                ok.field_d[0].a(var9Lifetime1 + 110, -10 + (-6 + var8Lifetime1), -126, 20, 0);
                ok.field_d[0].a(var9Lifetime1 + 110, -6 + (var8Lifetime1 + 10), -116, 20, 0);
                ok.field_d[0].a(2 + (108 + var9Lifetime1), var8Lifetime1 - 6, -88, 30, 0);
                for (var10Lifetime1 = var9Lifetime1; 2 + (var9Lifetime1 + 108) - 14 > var10Lifetime1; var10Lifetime1 += 14) {
                  ok.field_d[0].b(var10Lifetime1, -6 + (-14 + var8Lifetime1), 28, 28, 64);
                }
                ed.c(0, 0, 2 + (var9Lifetime1 + var7Lifetime2Lifetime1 * 108 / 200), 480);
                for (var10Lifetime1Lifetime1 = var9Lifetime1; var10Lifetime1Lifetime1 < -14 + (110 + var9Lifetime1); var10Lifetime1Lifetime1 += 14) {
                  ok.field_d[0].a(var10Lifetime1Lifetime1, -6 + (var8Lifetime1 - 14), 28, 28);
                }
                ed.c();
                ok.field_d[0].a(var9Lifetime1 + var7Lifetime2Lifetime1 * 108 / 200 + 2, var8Lifetime1 - 6 - 10, -122, 30, 0);
                ok.field_d[0].a(108 * var7Lifetime2Lifetime1 / 200 + (var9Lifetime1 + 2), 10 + var8Lifetime1 - 6, -91, 30, 0);
                ok.field_d[0].a(108 * var7Lifetime2Lifetime1 / 200 + (var9Lifetime1 + 2), -6 + var8Lifetime1, -98, 40, 0);
                var6 = qk.field_i + "       ";
                decompiledFrameRemainder0 = false;
              }
              else {
                if (param2 != 4) {
                  if (param1) {
                    var7Lifetime2Lifetime2 = jj.field_b.b(var6);
                    ok.field_d[2].e(268 - (var7Lifetime2Lifetime2 / 2 + ok.field_d[2].field_z), param0);
                    ok.field_d[2].e(var7Lifetime2Lifetime2 / 2 + 268, param0);
                  }
                  if (param3 > -98) {
                    ph.a((byte) 46);
                  }
                  jj.field_b.b(var6, 267, param0 + 18, 0, -1);
                  jj.field_b.b(var6, 269, param0 + 18, 0, -1);
                  jj.field_b.b(var6, 268, 18 + param0 - 1, 0, -1);
                  jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
                  jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
                  jj.field_b.b(var6, 270, 2 + param0 + 18, 0, -1);
                  jj.field_b.b(var6, 268, param0 + 18, var5, -1);
                  return;
                }
                if (!e.a(-114)) {
                  if (null == ki.field_E) {
                    var6 = mh.field_lb;
                  } else {
                    var6 = mh.field_lb;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (param1) {
                    var7Lifetime2Lifetime3 = jj.field_b.b(var6);
                    ok.field_d[2].e(268 - (var7Lifetime2Lifetime3 / 2 + ok.field_d[2].field_z), param0);
                    ok.field_d[2].e(var7Lifetime2Lifetime3 / 2 + 268, param0);
                  }
                  if (param3 > -98) {
                    ph.a((byte) 46);
                  }
                  jj.field_b.b(var6, 267, param0 + 18, 0, -1);
                  jj.field_b.b(var6, 269, param0 + 18, 0, -1);
                  jj.field_b.b(var6, 268, 18 + param0 - 1, 0, -1);
                  jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
                  jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
                  jj.field_b.b(var6, 270, 2 + param0 + 18, 0, -1);
                  jj.field_b.b(var6, 268, param0 + 18, var5, -1);
                  return;
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (wi.field_K != 2) {
              return;
            }
            var6 = od.field_o;
            if (param1) {
              var7Lifetime3 = jj.field_b.b(var6);
              ok.field_d[2].e(268 - (var7Lifetime3 / 2 + ok.field_d[2].field_z), param0);
              ok.field_d[2].e(var7Lifetime3 / 2 + 268, param0);
            }
            if (param3 > -98) {
              ph.a((byte) 46);
            }
            jj.field_b.b(var6, 267, param0 + 18, 0, -1);
            jj.field_b.b(var6, 269, param0 + 18, 0, -1);
            jj.field_b.b(var6, 268, 18 + param0 - 1, 0, -1);
            jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
            jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
            jj.field_b.b(var6, 270, 2 + param0 + 18, 0, -1);
            jj.field_b.b(var6, 268, param0 + 18, var5, -1);
            return;
          }
        }
        if (decompiledFrameRemainder0) {
          if (1 >= wi.field_K) {
            var6 = og.field_G;
          }
          if (wi.field_K == 2) {
            var6 = nk.field_K;
          }
        }
        if (param1) {
          var7Lifetime1 = jj.field_b.b(var6);
          ok.field_d[2].e(268 - (var7Lifetime1 / 2 + ok.field_d[2].field_z), param0);
          ok.field_d[2].e(var7Lifetime1 / 2 + 268, param0);
        }
        if (param3 > -98) {
          ph.a((byte) 46);
        }
        jj.field_b.b(var6, 267, param0 + 18, 0, -1);
        jj.field_b.b(var6, 269, param0 + 18, 0, -1);
        jj.field_b.b(var6, 268, 18 + param0 - 1, 0, -1);
        jj.field_b.b(var6, 268, 1 + (18 + param0), 0, -1);
        jj.field_b.b(var6, 269, param0 + 18 + 1, 0, -1);
        jj.field_b.b(var6, 270, 2 + param0 + 18, 0, -1);
        jj.field_b.b(var6, 268, param0 + 18, var5, -1);
    }

    ph() {
        super(e.a(-106) ? 5 : 6, 160, 392, 152, 32);
        int stackIn_3_1 = 0;
        if (!e.a(-106)) {
          stackIn_3_1 = 6;
        } else {
          stackIn_3_1 = 5;
        }
    }

    final static void d(int param0) {
        ei var1 = (ei) (qa.field_q.c(param0 + 39974));
        if (var1 == null) {
          var1 = new ei();
        }
        var1.a(ed.field_k, ed.field_d, ed.field_c, ed.field_b, ed.field_h, param0 ^ 9202, ed.field_l, ed.field_i);
        if (param0 != -31782) {
          field_o = 6;
        }
        lh.field_b.a(var1, false);
    }

    final void b(int param0, int param1) {
        int var4;
        boolean stackIn_24_0 = false;
        var4 = wizardrun.field_H;
        if (param0 >= -123) {
          field_o = 29;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 != 0) {
          if (1 == param1) {
            md.field_d = true;
          } else {
            if ((5 != param1 ||
              e.a(-112)) &&
              (4 != param1 ||
              !e.a(-115))) {
              if (param1 == 2) {
                stackIn_24_0 = !(pk.field_s);
                pk.field_s = stackIn_24_0;
              } else {
                if (param1 == 3) {
                  if (tl.field_e) {
                    tl.field_e = false;
                    mi.field_D.d(-101);
                  } else {
                    tl.field_e = true;
                    mi.field_D.a(true, -122, ga.field_e);
                  }
                } else {
                  if (((param1 == 4)) &&
                    (!(e.a(-106)))) {
                    if (ki.field_E != null) {
                      di.a((byte) 60);
                    } else {
                      pd.a(false, false);
                    }
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (2 == wi.field_K) {
                hi.field_c = hi.field_c + (qh.field_g + 1);
                hi.field_a = -350;
                qh.field_g = -1;
              }
              this.field_p = true;
            }
          }
        } else {
          this.field_p = true;
        }

    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1124) {
            field_o = -19;
          }
          stackIn_3_0 = il.a(10, (byte) -83, param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ph.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        int var8;
        boolean decompiledFrameRemainder0 = true;
        var8 = wizardrun.field_H;
        if (param1 == 2) {
          if (260 <= param0 &&
            pk.field_s) {
            if (param0 <= 368) {
              ee.field_p = (param0 - 260) * 104 / 108;
            } else {
              ee.field_p = 104;
            }
            if ((!(!pk.field_s)) &&
              (!(nl.field_y > 0))) {
              tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
              nl.field_y = 25;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (!param4) {
              super.a(param0, param1, param2, param3, param4, false);
            }
            return;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param1 == 3) {
            if (260 > param0) {
              if (!param4) {
                super.a(param0, param1, param2, param3, param4, param5);
              }
              return;
            }
            if (param0 <= 368) {
              hc.field_o = (-52000 + param0 * 200) / 108;
            } else {
              hc.field_o = 200;
            }
            if (pk.field_s &&
              nl.field_y <= 0) {
              tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
              nl.field_y = 25;
            }
            if (hc.field_o >= 10) {
              if (!tl.field_e) {
                tl.field_e = true;
                mi.field_D.a(true, -76, ga.field_e);
              }
              mi.field_D.a(-1, hc.field_o);
            } else {
              hc.field_o = 10;
              if (!tl.field_e) {
                if (param5) {
                  this.b(-123, 44);
                }
                return;
              }
              mi.field_D.a(-1, hc.field_o);
              tl.field_e = false;
              mi.field_D.d(-123);
            }
          } else {
            super.a(param0, param1, param2, param3, param4, false);
          }
        }
        if (param5) {
          this.b(-123, 44);
        }
    }

    public static void e(int param0) {
        field_q = null;
        if (param0 != 0) {
          return;
        }
        field_s = null;
    }

    final void c(int param0) {
        if (param0 <= 12) {
          return;
        }
        if (wi.field_K == 2) {
          oe.field_a.c(0, 0);
        } else {
          kb.field_jb.c(0, 0);
        }
        super.c(68);
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 12) {
          return true;
        }
        stackIn_6_0 = (10 <= ml.field_t) && (ri.field_a >= 13);
        return stackIn_6_0;
    }

    final void a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_8_1 = 0;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != -6) {
          return;
        }
        if (param1 == 2) {
          ee.field_p = ee.field_p - 13;
          if (ee.field_p <= 0) {
            ee.field_p = 0;
            pk.field_s = false;
          }
        } else {
          if (param1 == 3) {
            hc.field_o = hc.field_o - 25;
            if (hc.field_o <= 0) {
              hc.field_o = 0;
              stackIn_7_0 = 1;
              stackIn_8_1 = (tl.field_e) ? 0 : 1;
              if (stackIn_7_0 != stackIn_8_1) {
                tl.field_e = false;
                mi.field_D.d(-102);
              }
            } else {
              mi.field_D.a(-1, hc.field_o);
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          return;
        }
        if (param0 != 2) {
          if (param0 == 3) {
            hc.field_o = hc.field_o + 25;
            if (hc.field_o > 200) {
              hc.field_o = 200;
            }
            mi.field_D.a(-1, hc.field_o);
            if (!tl.field_e) {
              tl.field_e = true;
              mi.field_D.a(true, -117, ga.field_e);
            }
          }
        } else {
          ee.field_p = ee.field_p + 13;
          if (104 < ee.field_p) {
            ee.field_p = 104;
          }
          pk.field_s = true;
        }
    }

    static {
        field_s = "Type your password again to make sure it's correct";
        field_r = 0;
        field_o = 0;
    }
}
