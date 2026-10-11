/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends ph {
    static bd field_H;
    static String field_G;
    static String field_I;
    static String field_J;

    final static boolean l(int param0) {
        if (param0 != -1) {
          return true;
        }
        return uh.field_o;
    }

    final static void j(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!m.c(param0 ^ -77)) {
            if (null != wa.field_q &&
              wa.field_q.field_g) {
              tb.f((byte) -119);
              nb.field_F.c(new jh(nb.field_F, hf.field_g), param0 + 118);
            }
            return;
          }
          nb.field_F.a(im.field_f, param0 + 8800, true, ul.field_H);
          nb.field_F.e((byte) 114);
          while (jn.e((byte) 125)) {
            nb.field_F.a(pj.field_e, aj.field_e, 80);
          }
          if (param0 != -1) {
            field_H = (bd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "vf.N(" + param0 + ')');
        }
    }

    vf(String param0, mh param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_A = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private vf(String param0, mh param1) {
        this(param0, gf.field_e.field_e, param1);
        try {
          this.field_h = gf.field_e.field_n;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private vf(String param0, nn param1, mh param2) {
        super(param0, param1, param2);
        try {
          this.field_h = gf.field_e.field_n;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var22 = null;
        var18 = HostileSpawn.field_I ? 1 : 0;
        try {
          var10 = uj.field_p.field_e;
          var11 = uj.field_p.field_g;
          var12 = -101 % ((-33 - param3) / 43);
          var22 = ln.field_a.field_o;
          for (var14 = param4; param5 >= var14; var14++) {
            var7_int = param0 * var14 + param2;
            var9 = 24 * var14 - var11;
            for (var15 = param2; var15 <= param6; var15++) {
              var7_int++;
              var8 = 24 * var15 - var10;
              var16 = var22[var7_int];
              if ((var16 >> 8 != 4 ||
                0 != bm.field_c ||
                2 != rl.field_c ||
                ha.field_t == 14) && var16 >= 0) {
                var17 = var16 & 255;
                if (3 == var17) {
                  si.a(var8, var9, 24, 24, 0, 50);
                } else {
                  if (var17 == 17) {
                    si.a(var8, var9, 24, 24, 0, 50);
                  } else {
                    if (19 == var17) {
                      si.a(var8, var9, 24, 24, 0, 50);
                    } else {
                      if (3 == var17) {
                        si.a(var8, var9, 24, 24, 0, 50);
                      } else {
                        if (var17 == 34) {
                          si.a(var8, var9, 24, 24, 0, 50);
                        } else {
                          if (var17 == 35) {
                            si.a(var8, var9, 24, 24, 0, 50);
                          } else {
                            if (48 == var17) {
                              si.a(var8, var9, 24, 24, 0, 50);
                            } else {
                              if (49 == var17) {
                                si.a(var8, var9, 24, 24, 0, 50);
                              } else {
                                if (var17 == 50) {
                                  si.a(var8, var9, 24, 24, 0, 50);
                                } else {
                                  if (var17 == 56) {
                                    si.a(var8, var9, 24, 24, 0, 50);
                                  } else {
                                    if (var17 == 64) {
                                      si.a(var8, var9, 24, 24, 0, 50);
                                    } else {
                                      if (var17 == 81) {
                                        si.a(var8, var9, 24, 24, 0, 50);
                                      } else {
                                        if (128 == var17) {
                                          si.a(var8, var9, 24, 24, 0, 50);
                                        } else {
                                          if (var17 == 131) {
                                            si.a(var8, var9, 24, 24, 0, 50);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                ak.field_b[var16].a(var8, var9);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "vf.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static jj a(String[] args, boolean param1) {
        jj var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        jj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var3 = (String[]) null;
            vf.a((String[]) null, false);
          }
          var2 = new jj(false);
          var2.field_e = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("vf.O(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        if (r.field_a >= 1) {
          var2 = pm.field_d;
        } else {
          var2 = 0;
        }
        if (param0 > -3) {
          return;
        }
        if (ln.field_a.field_r[param1] &&
          wb.field_Z) {
          var2 = 0;
        }
        if (!(ln.field_a.field_u[param1] >= var2) &&
          ln.field_a.field_f[param1] == 2) {
          ln.field_a.field_u[param1] = var2;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_A = !this.field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        int var1 = 82 / ((param0 - 27) / 32);
        field_G = null;
        field_I = null;
        field_H = null;
        field_J = null;
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = -87 / ((param0 - 36) / 63);
        if (param1 < 0 ||
          65536 <= param1) {
          var2 += 16;
          param1 = param1 >>> 16;
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    final static void k(int param0) {
        int var2 = 0;
        String[] var3 = null;
        ne var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = (ne) (ei.field_q.g(param0 + 8183));
          while (var4 != null) {
            om.a(var4, 5, param0 + 8140);
            var4 = (ne) (ei.field_q.a(12684));
          }
          el.field_h[0] = cm.a(128, 5, 0, 1);
          el.field_h[1] = cm.a(128, 5, 1, 1);
          nh.field_L = cj.a(6, 5);
          if (param0 != -8255) {
            var3 = (String[]) null;
            vf.a((String[]) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "vf.P(" + param0 + ')');
        }
    }

    static {
        field_G = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_I = "The lift won't work until I get the power working again.";
        field_J = "Account created successfully!";
    }
}
