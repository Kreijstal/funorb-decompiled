/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sm implements el {
    private long field_c;
    static String field_a;
    static int field_b;
    static String field_d;

    public final rf a(int param0) {
        if (!(!this.c(-107))) {
            return re.field_s;
        }
        if (param0 != 17124) {
            sm.a(false, true);
            if ((td.b(param0 + -16996) ^ -1L) > (this.field_c + 350L ^ -1L)) {
                return of.field_f;
            }
            return this.d(-76);
        }
        if ((td.b(param0 + -16996) ^ -1L) > (this.field_c + 350L ^ -1L)) {
            return of.field_f;
        }
        return this.d(-76);
    }

    public final String b(int param0) {
        int var2 = 103 / ((param0 - -35) / 59);
        if (this.c(95)) {
            return null;
        }
        if ((350L + this.field_c ^ -1L) < (td.b(128) ^ -1L)) {
            return null;
        }
        return this.a((byte) 125);
    }

    final static int a(int param0, int param1, dk[] param2, int param3) {
        dk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        dk var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (param2 != null) {
              var4 = param2;
              var6 = -90 % ((param1 - -58) / 32);
              var5 = 0;
              L1: while (true) {
                if (var4.length <= var5) {
                  stackIn_13_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var7 = var4[var5];
                    if (var7 != null) {
                      if (!var7.a((byte) 65, param3, param0)) {
                        break L2;
                      } else {
                        stackIn_10_0 = var7.field_c;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("sm.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public final void a(boolean param0) {
        this.field_c = td.b(128);
        if (param0) {
            field_b = -44;
        }
    }

    abstract rf d(int param0);

    public static void b(boolean param0) {
        field_a = null;
        if (!param0) {
            sm.a(false, false);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(qd param0, int param1, boolean param2) {
        c var3 = null;
        int var4 = 0;
        try {
            var3 = om.field_c;
            var3.a(param1, param2);
            var3.field_m = var3.field_m + 1;
            var4 = var3.field_m;
            var3.f(1, -123);
            var3.f(param0.field_m, -123);
            var3.f(param0.field_h, -123);
            var3.a((byte) 124, param0.field_k);
            var3.a((byte) 127, param0.field_i);
            var3.a((byte) 125, param0.field_j);
            var3.a((byte) 127, param0.field_g);
            var3.c(var4, -76);
            var3.e(86, var3.field_m - var4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sm.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        if (param0) {
            field_a = (String) null;
            if (s.field_x <= 0) {
                if (!aj.b(-104)) {
                    var2 = 1;
                    if (null != km.field_n) {
                        return;
                    }
                    if (!e.field_d) {
                        return;
                    }
                    sn.a(var2, 0, param1);
                    return;
                }
                var2 = 0;
                if (null != km.field_n) {
                    return;
                }
                if (!e.field_d) {
                    return;
                }
                sn.a(var2, 0, param1);
                return;
            }
            if (km.field_n != null) {
                df.field_d = km.field_n.a(!param0 ? true : false);
                ue.b(2, (byte) 101);
                if (null == df.field_d) {
                    var2 = 3;
                } else {
                    var2 = 2;
                    rc.a(df.field_d, true);
                }
                if (null != km.field_n) {
                    return;
                }
                if (!e.field_d) {
                    return;
                }
                sn.a(var2, 0, param1);
                return;
            }
            df.field_d = al.a(640, -16493, g.field_r, 480, 0, 0);
            if (null == df.field_d) {
                var2 = 3;
            } else {
                var2 = 2;
                rc.a(df.field_d, true);
            }
            if (null != km.field_n) {
                return;
            }
            if (!e.field_d) {
                return;
            }
            sn.a(var2, 0, param1);
            return;
        }
        if (s.field_x <= 0) {
            if (!aj.b(-104)) {
                var2 = 1;
                if (null == km.field_n && e.field_d) {
                    sn.a(var2, 0, param1);
                    return;
                }
                return;
            }
            var2 = 0;
            if (null != km.field_n) {
                return;
            }
            if (!e.field_d) {
                return;
            }
            sn.a(var2, 0, param1);
            return;
        }
        if (km.field_n != null) {
            df.field_d = km.field_n.a(!param0 ? true : false);
            ue.b(2, (byte) 101);
            if (null == df.field_d) {
                var2 = 3;
            } else {
                var2 = 2;
                rc.a(df.field_d, true);
            }
            if (null == km.field_n && e.field_d) {
                sn.a(var2, 0, param1);
                return;
            }
            return;
        }
        df.field_d = al.a(640, -16493, g.field_r, 480, 0, 0);
        if (null == df.field_d) {
            var2 = 3;
        } else {
            var2 = 2;
            rc.a(df.field_d, true);
        }
        if (null == km.field_n && e.field_d) {
            sn.a(var2, 0, param1);
            return;
        }
    }

    final static void b(byte param0) {
        jh.a(true, kl.field_o, false, mf.field_b);
        if (param0 > -45) {
            return;
        }
        ha.field_a = true;
    }

    abstract String a(byte param0);

    static {
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = "Loading graphics";
    }
}
