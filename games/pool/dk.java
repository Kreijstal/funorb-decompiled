/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_e;
    static String field_a;
    static byte[] field_j;
    static String field_g;
    static String field_h;
    int field_i;
    short field_b;
    short field_l;
    int field_d;
    static int field_f;
    short field_k;
    boolean field_c;

    private final void a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var6 = param1 - param0[0];
        var7 = param2 - param0[1];
        var8 = param3 - 64 - param0[2];
        var9 = param0[9] * var6 + param0[10] * var7 + param0[11] * var8 >> 16;
        if (var9 > 0) {
          var10 = (qh.field_b + fb.field_q << 4) + (param0[3] * var6 + param0[4] * var7 + param0[5] * var8 >> 3) / var9;
          var11 = (qh.field_c + fb.field_d << 4) + (param0[6] * var6 + param0[7] * var7 + param0[8] * var8 >> 3) / var9;
          param4 = param4 / var9;
          if (param4 > -23170 &&
            param4 < 23170) {
            qh.a(var10, var11, param4, 4, bc.field_c);
          }
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, this.field_e, this.field_i, this.field_d, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, pq param3, int param4) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        long var12 = 0L;
        try {
          param3.a(param2, 6);
          var5_long = param3.e(-14770);
          var7 = param0 - param3.field_g;
          var8 = -param3.field_k + param4;
          var9 = bm.a(-107, od.a((long)var7, (long)var7, false) + od.a((long)var8, (long)var8, false));
          if (var9 <= 2147483647L &&
            var9 >= -2147483648L) {
            var7 = lh.a((int)var9, (byte) -96, (long)var7);
            var8 = lh.a((int)var9, (byte) -85, (long)var8);
            var11 = aj.a(var7, false, param3.field_I) + aj.a(var8, false, param3.field_t);
            param3.field_I = param3.field_I - 2 * aj.a(var11, false, var7);
            param3.field_t = param3.field_t - aj.a(var11, false, var8) * 2;
            param3.field_n = param3.field_n * kp.field_m >> 8;
            param3.field_v = 1;
            param3.field_b = param3.field_b * kp.field_m >> 8;
            param3.field_K = kp.field_m * param3.field_K >> 8;
            var12 = param3.e(-14770);
            if (td.field_b < nn.field_e.length) {
              nn.field_e[td.field_b][0] = param0;
              nn.field_e[td.field_b][1] = param4;
              nn.field_e[td.field_b][2] = -524288;
            }
            if (td.field_b < cf.field_g.length) {
              fieldTemp$0 = td.field_b;
              td.field_b = td.field_b + 1;
              cf.field_g[fieldTemp$0] = (int)(var5_long - var12);
            }
            if (param1 != -20) {
              field_g = (String) null;
            }
            return;
          }
          throw new IllegalStateException("d out of bounds.");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
          this.field_k = (short)(param2 - this.field_i);
          this.field_b = (short)(param0 - this.field_e);
          this.field_i = param2;
          this.field_e = param0;
          if (param1 != 78) {
            dk.a((byte) -28, (String) null, (di) null, (String) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "dk.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0) {
        String stackIn_59_0 = null;
        Object stackIn_97_0 = null;
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
        var10 = Pool.field_O;
        try {
          if (param0 != 1) {
            dk.a((byte) -62, (String) null, (di) null, (String) null, (String) null);
          }
          var1 = null;
          var2 = null;
          if (0 == hn.field_b &&
            tp.field_e != null) {
            var2 = cl.field_l;
          }
          if (hn.field_b == 2 &&
            !hp.a(false)) {
            boolean decompiledSharedTail2 = !(!lq.a(di.field_a, -1));
            if (!decompiledSharedTail2) {
              var2 = nr.a(new String[]{fm.field_I}, param0 ^ -2, tp.field_c);
              decompiledSharedTail2 = (var10 != 0);
            }
            if (decompiledSharedTail2) {
              var2 = nr.a(new String[]{fm.field_I}, -1, bm.field_d);
            }
            if (fm.field_H) {
              jh.a(0, (String) (var2), (String) null, 2, (String) null, true);
              th.b(-1);
            }
          }
          if (null == var2 &&
            !gd.field_b &&
            uq.field_D == null) {
            var2 = fj.field_i;
          }
          if (var2 != null) {
            dr.a((String) null, param0 + 11467, mc.field_g, 0, (String) (var2));
          } else {
            var3 = di.field_j;
            var3 = bm.a(524288, var3);
            var4 = "";
            var5 = "|";
            var6 = hn.field_b;
            var7 = 0;
            if (var6 == 2) {
              var4 = nr.a(new String[]{fm.field_I}, -1, jl.field_a);
              var8 = nr.a(new String[]{var3}, -1, vh.field_S);
              var7 = pa.field_J.field_gb - (-fj.field_j.field_gb + (485 - m.field_c.b(var8) + m.field_c.b(var4)));
              if (var7 < 0) {
                var7 = 0;
              }
            } else {
              if (var6 == 0) {
                if (null == em.field_L &&
                  ej.field_l) {
                  var4 = "[" + sn.field_l + "] ";
                }
                if (null != em.field_L) {
                  boolean decompiledSharedTail1 = (!(sa.field_c) ||
                    kn.field_g == null);
                  if (!decompiledSharedTail1) {
                    var4 = "[" + kn.field_g + "] ";
                    decompiledSharedTail1 = (var10 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var4 = "[" + nr.a(new String[]{em.field_L.field_Ob}, -1, th.field_c) + "] ";
                  }
                  var6 = 1;
                }
              }
              if (ia.b(-1)) {
                stackIn_59_0 = ": ";
              } else {
                stackIn_59_0 = "<img=3>: ";
              }
              var8 = stackIn_59_0;
              var4 = var4 + var3 + var8;
              boolean decompiledSharedTail0 = !(ea.field_z);
              if (!decompiledSharedTail0) {
                var5 = "";
                var4 = "<col=999999>" + var4 + fg.field_e + "</col>";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (hr.field_y)) {
                var5 = "";
                var4 = "<col=999999>" + var4 + je.field_c + "</col>";
              }
              var9 = m.field_c.b(var4);
              if (!ia.b(param0 ^ -2)) {
                if (pa.field_J.field_W &&
                  -pa.field_J.field_sb + wn.field_i < var9) {
                  if (ea.field_z) {
                    var1 = "Broken!";
                  } else {
                    var1 = je.field_c;
                  }
                }
                if (pa.field_J.field_R != 0 &&
                  var9 > pa.field_J.field_mb &&
                  !ea.field_z) {
                  r.c((byte) 68);
                }
              }
            }
            dr.a(var5, 11468, pq.field_F[var6], var7, var4 + lr.a(td.field_c.toString()));
            if (!rg.field_p) {
              fj.field_j.field_W = false;
            }
            if (fj.field_j.field_W) {
              var1 = nr.a(new String[]{var3, fm.field_I}, -1, wb.field_b);
            }
          }
          stackIn_97_0 = var1;
          return (String) (stackIn_97_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (var1), "dk.E(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        try {
          this.field_i = param0;
          this.field_e = param1;
          if (param2 <= 21) {
            this.a(-71, 118, (byte) -96);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "dk.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 113) {
          return;
        }
        try {
          field_j = null;
          field_a = null;
          field_h = null;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "dk.B(" + param0 + ')');
        }
    }

    final static String a(byte param0, String param1, di param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.d(58)) {
            stackIn_4_0 = (String) (param4);
            return stackIn_4_0;
          }
          var5_int = -40 / ((param0 - 48) / 49);
          stackIn_6_0 = param3 + " - " + param2.a(100, param1) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void a(vh param0, byte param1) {
        dd var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        dd var2Lifetime1;
        try {
          if (param1 != 93) {
            dk.a((byte) 91, (String) null, (di) null, (String) null, (String) null);
          }
          var2 = param0.field_hb;
          var2.field_B = -var2.field_A + param0.field_Db >> 1;
          var2.field_y = var2.field_B + var2.field_A;
          var2Lifetime1 = param0.field_yb;
          if (null != var2Lifetime1) {
            var2Lifetime1.field_B = -var2Lifetime1.field_A + param0.field_Db >> 1;
            var2Lifetime1.field_y = var2Lifetime1.field_B + var2Lifetime1.field_A;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("dk.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    dk(int param0, int param1) {
        this.field_c = false;
        try {
          this.a(param1, param0, (byte) 34);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "This game option has not yet been unlocked for use.";
        field_f = 0;
        field_h = "This game has been updated! Please reload this page.";
        field_g = "Return to lobby";
    }
}
