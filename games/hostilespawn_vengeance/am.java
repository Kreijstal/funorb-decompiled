/*
 * Decompiled by CFR-JS 0.4.0.
 */
class am {
    static String field_a;
    am field_f;
    static String field_b;
    static HostileSpawn field_d;
    am field_g;
    long field_c;
    static int field_e;

    final static void a(int param0, int param1, int param2, p param3) {
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 < 0 ||
            param1 < 0 ||
            param2 > 640 ||
            param1 > 480) {
            param3.field_i = -1;
          }
          if (param0 >= ~param3.field_e) {
            var4_int = -param3.field_e + 16;
            sc.field_l.a(param2, param1, var4_int, var4_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("am.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          fb.field_l = fb.field_l + 1;
          if (qh.field_s == -1 &&
            hn.field_b == -1) {
            qh.field_s = j.field_c;
            hn.field_b = rb.field_m;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(eb.field_d));
          } else {
            decompiledFrameRemainder0 = (null == eb.field_d);
          }
          if (decompiledFrameRemainder0) {
            if (!re.field_k) {
              if (ui.field_e <= fb.field_l) {
                stackIn_17_0 = (qg.field_u + ui.field_e > fb.field_l) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              fb.field_l = 0;
            } else {
              if (!re.field_k &&
                var2_int == 0) {
                fb.field_l = 0;
              } else {
                fb.field_l = ui.field_e;
              }
            }
            qh.field_q = hn.field_b;
            l.field_d = qh.field_s;
            if (param0 != null) {
              re.field_k = false;
            } else {
              if (var2_int != 0) {
                re.field_k = true;
              }
            }
          }
          eb.field_d = param0;
          if (!re.field_k &&
            fb.field_l < ui.field_e &&
            um.field_d) {
            qh.field_q = hn.field_b;
            l.field_d = qh.field_s;
            fb.field_l = 0;
          }
          hn.field_b = -1;
          if (param1 != -82) {
            return;
          }
          if (re.field_k &&
            rd.field_h == fb.field_l) {
            fb.field_l = 0;
            re.field_k = false;
          }
          qh.field_s = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("am.L(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -50) {
          field_d = (HostileSpawn) null;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        oj var4 = null;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        p var9 = null;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4_intLifetime1;
        int var4_intLifetime2;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = ln.field_a.field_d;
          if (bm.field_c == 0) {
            var3 = 7500;
            if (rl.field_c != 6) {
              if (rl.field_c == 7) {
                var3 = 6000;
              } else {
                if (rl.field_c == 2) {
                  var3 = 6000;
                }
              }
            } else {
              var3 = 3000;
            }
            if (!(var3 >= le.field_D) ||
              0 == le.field_D) {
              le.field_D = var3;
            }
          }
          r.field_a = 0;
          if (ha.field_t == 1) {
            ue.a(250, false);
            var3Lifetime1 = 1;
            for (var4_int = 0; var4_int < el.field_j; var4_int++) {
              if (125 != mm.field_m[var4_int].field_i) {
                continue;
              }
              var3Lifetime1 = 0;
              break;
            }
            if (var3Lifetime1 == 0) {
              ha.field_t = -1;
              kd.a(1, 1);
            } else {
              if (bm.field_c == 0 &&
                rl.field_c == 2) {
                kd.a(14, 1);
                for (var4_intLifetime2 = 1; var4_intLifetime2 < el.field_j; var4_intLifetime2++) {
                  var8 = mm.field_m[var4_intLifetime2];
                  if (15 == var8.field_i) {
                    var8.field_i = -1;
                    var6 = var8.field_j.b(-4);
                    ln.field_a.field_c[var6] = 0;
                    ln.field_a.field_f[var6] = 2;
                  }
                }
              } else {
                stackIn_32_0 = 0;
                stackIn_32_1 = 1;
                kd.a(stackIn_32_0, stackIn_32_1);
              }
            }
          }
          ue.a(250, false);
          if (param1 <= 89) {
            am.a(-56, (byte) -41);
          }
          for (var3Lifetime2 = 1; var3Lifetime2 < 5; var3Lifetime2++) {
            for (var4_intLifetime1 = 0; var4_intLifetime1 <= 256; var4_intLifetime1 += 16) {
              var9 = jn.field_F[ib.field_c];
              var9.field_c = (double)var4_intLifetime1;
              var9.field_j.a((int)(-4.0 + 6.0 * Math.random()) + param0 % var2_int, 8360, (int)(-4.0 + 6.0 * Math.random()) + param0 / var2_int);
              var9.field_l.a(0.0, 0.0, 1);
              var9.field_i = 8;
              var9.field_e = 0;
              var9.field_h = var3Lifetime2;
              var9.field_l.a(var3Lifetime2 * 4, (byte) 94, var9.field_c);
              var9.a(225, var9.field_c + 20.0 * Math.random() - 10.0, 50);
              ib.field_c = ib.field_c + 1;
            }
          }
          if (1 == bm.field_c &&
            rl.field_c == 3) {
            return;
          }
          for (var3Lifetime3 = 0; var3Lifetime3 < el.field_j; var3Lifetime3++) {
            var4 = mm.field_m[var3Lifetime3];
            if (5 == var4.field_i) {
              var4.field_I = 0;
            } else {
              if (22 == var4.field_i) {
                var4.field_I = 0;
              }
            }
            var4.field_F = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "am.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        if (null == this.field_f) {
          return;
        }
        this.field_f.field_g = this.field_g;
        this.field_g.field_f = this.field_f;
        this.field_g = null;
        this.field_f = null;
        int var2 = -107 % ((67 - param0) / 39);
    }

    final boolean a(int param0) {
        if (param0 != 3000) {
          return false;
        }
        if (null == this.field_f) {
          return false;
        }
        return true;
    }

    static {
        field_b = "The explosive barrel is blocking your route into the ship. Aim and hold the left mouse button to shoot at it.";
        field_a = "You have unlocked this campaign's <col=ffffff>hard mode</col> on the level select screen.";
    }
}
