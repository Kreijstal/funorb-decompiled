/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static nh[] field_a;
    static int field_b;

    final static jea b(byte param0) {
        RuntimeException var1 = null;
        jea stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 113) {
            field_a = (nh[]) null;
          }
          stackIn_4_0 = jja.field_j.field_tb;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "fa.C(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        String stackIn_67_0 = null;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 > -110) {
            fa.a(119, (kh) null, -102, (int[]) null);
          }
          var1 = null;
          var2 = null;
          if (bta.field_q == 0 &&
            null != ifa.field_n) {
            var2 = sla.field_e;
          }
          if (bta.field_q == 2 &&
            !at.f(24316)) {
            if (dda.a(false, mn.field_n)) {
              var2 = gl.$cfr$intArgs$a$53ce4ab4c593(87, mi.field_n, new String[]{wp.field_a});
              if (var10 != 0) {
                var2 = gl.$cfr$intArgs$a$53ce4ab4c593(83, pba.field_a, new String[]{wp.field_a});
              }
            } else {
              var2 = gl.$cfr$intArgs$a$53ce4ab4c593(83, pba.field_a, new String[]{wp.field_a});
            }
            if (vo.field_b) {
              gu.a(0, true, (String) null, (String) (var2), (String) null, 2);
              la.l(2097152);
            }
          }
          if (null == var2 &&
            !voa.field_v &&
            wi.field_s == null) {
            var2 = rt.field_p;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != var2) {
            dqa.a((String) (var2), 0, (String) null, sva.field_d, 122);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3 = fna.field_k;
            var3 = ima.a(var3, (byte) 8);
            var4 = "";
            var5 = "|";
            var6 = bta.field_q;
            var7 = 0;
            if (var6 == 2) {
              var4 = gl.$cfr$intArgs$a$53ce4ab4c593(88, wha.field_G, new String[]{wp.field_a});
              var8 = gl.$cfr$intArgs$a$53ce4ab4c593(111, li.field_a, new String[]{var3});
              var7 = mka.field_b.field_G + (pq.field_g.field_G - 485) + lpa.field_s.b(var8) - lpa.field_s.b(var4);
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (var6 == 0) {
                if (uu.field_a == null &&
                  kq.field_c) {
                  var4 = "[" + cla.field_o + "] ";
                }
                if (null != uu.field_a) {
                  if (!kp.field_c ||
                    tla.field_f == null) {
                    var4 = "[" + gl.$cfr$intArgs$a$53ce4ab4c593(110, jea.field_nb, new String[]{uu.field_a.field_tb}) + "] ";
                    if (var10 != 0) {
                      var4 = "[" + tla.field_f + "] ";
                    }
                  } else {
                    var4 = "[" + tla.field_f + "] ";
                  }
                  var6 = 1;
                }
              }
              if (rn.a(27)) {
                stackIn_67_0 = ": ";
              } else {
                stackIn_67_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_67_0;
              var4 = var4 + var3 + var8Lifetime1;
              if (!fua.field_g) {
                if (ok.field_s) {
                  var5 = "";
                  var4 = "<col=999999>" + var4 + lva.field_o + "</col>";
                  if (var10 != 0) {
                    var5 = "";
                    var4 = "<col=999999>" + var4 + kia.field_a + "</col>";
                  }
                }
              } else {
                var5 = "";
                var4 = "<col=999999>" + var4 + kia.field_a + "</col>";
              }
              var9 = lpa.field_s.b(var4);
              if (!rn.a(27)) {
                if (pq.field_g.field_o &&
                  var9 > jba.field_j - pq.field_g.field_q) {
                  if (fua.field_g) {
                    var1 = "Broken!";
                  } else {
                    var1 = lva.field_o;
                  }
                }
                if (pq.field_g.field_y != 0 &&
                  pq.field_g.field_p < var9 &&
                  !fua.field_g) {
                  ola.e((byte) 117);
                }
              }
            }
            dqa.a(var4 + il.c(vc.field_n.toString()), var7, var5, pm.field_a[var6], 125);
            if (!ni.field_c) {
              mka.field_b.field_o = false;
            }
            if (mka.field_b.field_o) {
              var1 = gl.$cfr$intArgs$a$53ce4ab4c593(126, vf.field_c, new String[]{var3, wp.field_a});
            }
          }
          stackIn_102_0 = var1;
          return (String) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (var1), "fa.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -23172) {
            fa.a(67, -121, true, -29);
          }
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "fa.E(" + param0 + ')');
        }
    }

    final static int[] a(int param0, kh param1, int param2, int[] param3) {
        Object stackIn_5_0 = null;
        int[] stackIn_28_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param1.b((byte) 44, param2);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (int[]) (stackIn_5_0);
          }
          if (null == param3 ||
            ~var4_int != ~param3.length) {
            param3 = new int[var4_int];
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          var5 = param1.b((byte) 44, 6);
          var6 = param1.b((byte) 44, 32);
          if (var5 <= param0) {
            var7 = 0;
            while (var7 < var4_int) {
              param3[var7] = var6;
              var7++;
              if (var8 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (!(var5 <= param0) ||
            var8 != 0)) {
            var7Lifetime1 = 0;
            while (var7Lifetime1 < var4_int) {
              stackIn_28_0 = (int[]) (param3);
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_28_0[var7Lifetime1] = param1.b((byte) 44, var5) + var6;
              var7Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_28_0 = (int[]) (param3);
          }
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("fa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0 &&
            11 >= param0) {
            if (!param2) {
              return false;
            }
            if (param1 >= 1 &&
              param1 <= um.a(param3, -2, param0)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "fa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
