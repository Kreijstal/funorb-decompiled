/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j implements pf {
    static String field_c;
    static String field_e;
    static qb field_a;
    static kc field_f;
    static String field_b;
    private ti field_d;
    static volatile int field_g;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        if (param0 != -122) {
            nf var2 = (nf) null;
            j.a((ml) null, -73, (byte) -49, (nf) null, -70, 53, 100);
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -100) {
            j.a(42, -19, 22);
        }
        param0 = param0 & 8191;
        if (-4097 < (param0 ^ -1)) {
            return (param0 ^ -1) <= -2049 ? -ge.field_l[param0 + -2048] : ge.field_l[2048 + -param0];
        }
        return -6145 < (param0 ^ -1) ? -ge.field_l[6144 + -param0] : ge.field_l[-6144 + param0];
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if ((param0 ^ -1) >= -2) {
                L2: {
                  if (param1 < -29) {
                    break L2;
                  } else {
                    j.a(-40, -118);
                    break L2;
                  }
                }
                if (param0 == 1) {
                  stackIn_13_0 = param2 * var3_int;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                L3: {
                  if (-1 == (param0 & 1 ^ -1)) {
                    break L3;
                  } else {
                    var3_int = var3_int * param2;
                    break L3;
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "j.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final static mi a(ml param0, int param1, byte param2, nf param3, int param4, int param5, int param6) {
        mi var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = 117 % ((param2 - -43) / 50);
            var7 = (mi) ((Object) uh.field_n.c(true));
            if (var7 != null) {
              var7.a(-104, param6, param1, param5, param4, param3, param0);
              stackIn_4_0 = (mi) (var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = new mi(param6, param4, param5, param1, param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("j.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(int param0) {
        try {
            if (null != pg.field_f) {
                try {
                    pg.field_f.a(0L, -101);
                    pg.field_f.a((byte) -53, df.field_z.field_g, df.field_z.field_j, 24);
                } catch (Exception exception) {
                }
            }
            int var1 = 125 / ((param0 - 27) / 38);
            df.field_z.field_g = df.field_z.field_g + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        nj.field_c = 0;
        if (param0) {
            j.a(121, 53, 31);
        }
        ef.field_r = true;
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1 = ch.field_a;
            synchronized (var1) {
              L1: {
                L2: {
                  hg.field_b = hg.field_b + 1;
                  vk.field_u = gn.field_b;
                  if (0 <= ub.field_b) {
                    L3: while (true) {
                      if (ub.field_b == go.field_g) {
                        break L2;
                      } else {
                        var2 = dk.field_d[go.field_g];
                        go.field_g = 1 + go.field_g & 127;
                        if (var2 >= 0) {
                          ri.field_b[var2] = true;
                          continue L3;
                        } else {
                          ri.field_b[var2 ^ -1] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -113) {
                        ub.field_b = go.field_g;
                        break L2;
                      } else {
                        ri.field_b[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  gn.field_b = pi.field_a;
                  if (param0 == 24) {
                    break L5;
                  } else {
                    field_e = (String) null;
                    break L5;
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "j.B(" + param0 + ')');
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        try {
          L0: {
            L1: {
              var6_int = param0.field_n + param2;
              var7 = param0.field_j + param3;
              kh.a(param0.field_v, var6_int, var7, param0.field_k, 83);
              if (!param0.d(-2116)) {
                break L1;
              } else {
                oj.a(-32171, var7 + 2, var6_int - -2, -4 + param0.field_k, param0.field_v - 4);
                break L1;
              }
            }
            L2: {
              de.h(var6_int, var7, -2 + (var6_int - -param0.field_v), param0.field_k + var7);
              var8 = this.field_d.field_P.g(126);
              if (var8 != null) {
                var9 = var8.toString();
                this.field_d.field_Q.a(var9, var6_int - -2, -1 + (this.field_d.field_Q.field_C + param0.field_k >> 918147425) + var7, 10000536, -1);
                if (!this.field_d.d(-2116)) {
                  break L2;
                } else {
                  if (!var9.startsWith(this.field_d.field_D)) {
                    break L2;
                  } else {
                    var10 = this.field_d.field_Q.b(this.field_d.field_D);
                    de.e(var6_int - -2, 2 + var7, var10, -4 + param0.field_k, 2188450, 100);
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              de.a();
              if (param1 == 5592405) {
                break L3;
              } else {
                var11 = (String) null;
                j.a(false, (String) null, true, false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("j.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    j(ti param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, String param1, boolean param2, boolean param3) {
        try {
            hk.d(-24225);
            p.field_b.f(-117);
            if (param3) {
                j.a(-101, 37, 87);
            }
            wh.field_f = new e(ge.field_g, (String) null, hk.field_s, param0, param2);
            g.field_e = new no(p.field_b, wh.field_f);
            p.field_b.b(g.field_e, 15637);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "j.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Book of Cogs";
        field_e = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_g = -1;
        field_b = "Flame spells focus on explosions and fire-based mayhem.";
    }
}
