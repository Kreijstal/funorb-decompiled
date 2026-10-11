/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends hi {
    static String field_r;
    static String field_q;
    static bd field_p;
    static bd field_o;

    final static void a(int param0, byte param1, vm param2, String param3, pm param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 1;
          var8 = -125 / ((param1 - 0) / 54);
          while (var7 < param3.length()) {
            var9 = param3.charAt(var7);
            if (var9 == 60) {
              var6 = (var5_int >> 8) - (-param4.field_b[0] - param2.a(param3.substring(0, var7)));
            }
            if (var6 != -1) {
              param4.field_b[var7] = var6;
            } else {
              if (var9 == 32) {
                var5_int = var5_int + param0;
              }
              param4.field_b[var7] = param4.field_b[0] + ((var5_int >> 8) - (-param2.a(param3.substring(0, 1 + var7)) + param2.a((char) var9)));
            }
            if (var9 == 62) {
              var6 = -1;
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ld.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, bd param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        try {
          if (param1 != -84) {
            pm var8 = (pm) null;
            ld.a(-5, (byte) -60, (vm) null, (String) null, (pm) null);
          }
          var6_int = param4.field_u << 3;
          param3 = (param3 << 4) + (15 & var6_int);
          var7 = param4.field_r << 3;
          param5 = (param5 << 4) + (var7 & 15);
          ki.a(var7, var6_int, param5, false, param3, param0, param2, param4);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ld.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    ld(ig param0) {
        super(param0);
    }

    final bm a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        bm stackIn_3_0 = null;
        bm stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          if (!sf.a((byte) 122, var5)) {
            stackIn_3_0 = bi.field_d;
            return stackIn_3_0;
          }
          var4 = -7 % ((param1 - 3) / 42);
          var6 = (CharSequence) ((Object) param0);
          var3_int = hi.a(-83, var6);
          if (0 < var3_int &&
            130 >= var3_int) {
            return nd.field_d;
          }
          stackIn_8_0 = bi.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ld.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        p var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pm var9 = null;
        p var10 = null;
        oj var11 = null;
        p var12 = null;
        p var13 = null;
        p var14 = null;
        p var12Lifetime1;
        p var12Lifetime2;
        p var13Lifetime1;
        int var6Lifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var11 = mm.field_m[0];
          var3 = 0;
          if (param0 >= -5) {
            var9 = (pm) null;
            ld.a(20, (byte) 120, (vm) null, (String) null, (pm) null);
          }
          var4 = 0;
          if (param1 == 1 &&
            0 > jm.field_e) {
            jm.field_e = (int)(5.0 * Math.random());
          }
          if (param1 == 6 &&
            0 > we.field_b) {
            we.field_b = (int)(Math.random() * 3.0);
          }
          boolean decompiledFrameRemainder0 = true;
          if (3 == param1 &&
            d.field_u <= 10) {
            if ((!fh.field_c[0] ||
              kh.field_U[0] != 3) &&
              (!fh.field_c[1] ||
              kh.field_U[1] != 3)) {
              if ((d.field_u == 0)) {
                var4 = 1;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              d.field_u = 35;
              var3 = 1;
            }
          }
          if (0 == param1) {
            nh.field_M = th.field_Fb[0];
            dn.field_j = dn.field_j + 1;
          }
          if (uj.field_l == 1) {
            var5_int = 100;
            var6 = uh.field_i;
            var7 = param1;
            if (0 == var7) {
              if (dn.field_j > 2) {
                dn.field_j = 2;
              }
              eh.field_c.a(sf.field_V[12 + dn.field_j], var5_int, var6);
            } else {
              if (var7 != 1) {
                if (var7 == 2) {
                  eh.field_c.a(sf.field_V[(int)(5.0 * Math.random()) + 23], var5_int, var6);
                } else {
                  if (var7 == 3) {
                    if (var3 != 0 &&
                      null == rc.field_c) {
                      rc.field_c = b.a(sf.field_V[35], var5_int, var6);
                      rc.field_c.d(120);
                      eh.field_c.b(rc.field_c);
                    }
                    if (var4 != 0) {
                      f.a((byte) 119);
                      eh.field_c.a(sf.field_V[36], var5_int, var6);
                    }
                  } else {
                    if (var7 != 4) {
                      if (var7 == 5) {
                        eh.field_c.a(sf.field_V[37], var5_int, var6);
                      } else {
                        if (var7 != 6) {
                          if (7 == var7) {
                            eh.field_c.a(sf.field_V[39], var5_int, var6);
                          }
                        } else {
                          om.field_a = true;
                          eh.field_c.a(sf.field_V[we.field_b + 28], var5_int, var6);
                        }
                      }
                    } else {
                      om.field_a = true;
                      eh.field_c.a(sf.field_V[(int)(Math.random() * 4.0) + 31], var5_int, var6);
                    }
                  }
                }
              } else {
                eh.field_c.a(sf.field_V[jm.field_e + 0], var5_int, var6);
                ag.field_k = ag.field_k + 1;
              }
            }
          }
          hf.field_i = param1;
          var10 = jn.field_F[ib.field_c];
          var12 = var10;
          var13 = var12;
          var12Lifetime1 = var10;
          var5 = var10;
          var6Lifetime1 = param1;
          if (0 != var6Lifetime1) {
            if (var6Lifetime1 != 1) {
              if (var6Lifetime1 == 2) {
                dupTemp$0 = an.field_r[param1];
                kh.field_ib[dupTemp$0] = kh.field_ib[dupTemp$0] - 9;
                for (var6Lifetime1 = -17; 17 >= var6Lifetime1; var6Lifetime1 += 4) {
                  var13Lifetime1 = jn.field_F[ib.field_c];
                  r.a(var6Lifetime1, param1, var13Lifetime1, -5, var11);
                  ib.field_c = ib.field_c + 1;
                }
                pj.field_v = 4;
              } else {
                if (var6Lifetime1 == 3) {
                  for (var6Lifetime1 = -1; var6Lifetime1 <= 1; var6Lifetime1++) {
                    var14 = jn.field_F[ib.field_c];
                    var5 = var14;
                    r.a(var6Lifetime1, param1, var14, -5, var11);
                    ib.field_c = ib.field_c + 1;
                  }
                } else {
                  if (4 != var6Lifetime1) {
                    if (var6Lifetime1 != 5) {
                      if (var6Lifetime1 != 6) {
                        if (7 != var6Lifetime1) {
                          return 0;
                        }
                        r.a(0, param1, var10, -5, var11);
                        if (0.5 > Math.random()) {
                          var5.field_f = true;
                        }
                        ib.field_c = ib.field_c + 1;
                      } else {
                        r.a(0, param1, var10, -5, var11);
                        ib.field_c = ib.field_c + 1;
                        if (!(10 <= pj.field_v) ||
                          !(pj.field_v < 12)) {
                          pj.field_v = 10;
                        }
                      }
                    } else {
                      r.a(0, param1, var10, -5, var11);
                      ib.field_c = ib.field_c + 1;
                    }
                  } else {
                    dupTemp$1 = an.field_r[param1];
                    kh.field_ib[dupTemp$1] = kh.field_ib[dupTemp$1] - 4;
                    r.a(0, param1, var10, -5, var11);
                    ib.field_c = ib.field_c + 1;
                    jg.field_l = (int)((0.5 + ((double)var10.field_j.field_g + var10.field_l.field_a)) * 24.0);
                    am.field_e = (int)(24.0 * (0.5 + (var10.field_l.field_f + (double)var10.field_j.field_e)));
                  }
                }
              }
            } else {
              r.a(0, param1, var10, -5, var11);
              ib.field_c = ib.field_c + 1;
              var12Lifetime2 = jn.field_F[ib.field_c];
              var13Lifetime1 = var12Lifetime2;
              var13Lifetime1 = var12Lifetime2;
              r.a(0, param1, var12Lifetime2, -5, var11);
              ib.field_c = ib.field_c + 1;
              if (pj.field_v == -1 ||
                !(3 > pj.field_v)) {
                pj.field_v = 0;
              }
              if (var12Lifetime2.field_i == 0) {
                var12Lifetime2.field_i = 32;
              }
            }
          } else {
            r.a(0, param1, var10, -5, var11);
            ib.field_c = ib.field_c + 1;
          }
          if (0 == param1 &&
            dn.field_j < 2) {
            stackIn_97_0 = 8;
            return stackIn_97_0;
          }
          stackIn_99_0 = th.field_Fb[param1];
          return stackIn_99_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "ld.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_o = null;
        field_r = null;
        field_q = null;
        if (param0 < 29) {
          ld.a(true, 18);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        bf var5 = null;
        byte[] var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 > 0) {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; param3 > var5_int; var5_int++) {
              var8[var5_int] = param0[var5_int + param1];
            }
          } else {
            var4 = param0;
          }
          var5 = new bf();
          if (param2 < 92) {
            field_p = (bd) null;
          }
          var5.a((byte) 30);
          var5.a((byte) 123, var4, (long)(param3 * 8));
          var6 = new byte[64];
          var5.a(var6, 0, -6);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("ld.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
          pm var3 = (pm) null;
          ld.a(-17, (byte) 69, (vm) null, (String) null, (pm) null);
        }
        if (p.field_m[param1] == null) {
          p.field_m[param1] = pi.a(10, 6413, 3, ka.field_p[param1], 1);
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 96 % ((param0 + 24) / 35);
          if (this.a(param1, (byte) -70) != bi.field_d) {
            return null;
          }
          stackIn_3_0 = fg.field_a;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ld.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_r = "Email address is unavailable";
        field_q = "Locate the entrance to the spawn hive.";
    }
}
