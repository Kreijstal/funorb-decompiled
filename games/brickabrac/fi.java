/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends ki {
    static re field_r;
    static String field_u;
    static int[] field_w;
    static mh field_s;
    static int field_t;
    static String field_v;

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var8 = null;
        pb var9 = null;
        if (param1 < -84) {
          if (((fi) this).b((byte) -111)) {
            var9 = kd.a(((fi) this).field_m, param3, (byte) 107);
            if (!var9.a((byte) -84, param3, ((fi) this).field_m)) {
              dk.a(2, param3, var9, -35, 23275, on.field_K);
              var9.a(((fi) this).field_m, param3, (byte) 78);
              mn.a(var9.field_p, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
              return;
            } else {
              mn.a(var9.field_p, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, pf.field_b[param3], 16777215);
            return;
          }
        } else {
          ((fi) this).a(false, 56, -90, -99, 75);
          if (((fi) this).b((byte) -111)) {
            var8 = kd.a(((fi) this).field_m, param3, (byte) 107);
            if (var8.a((byte) -84, param3, ((fi) this).field_m)) {
              mn.a(var8.field_p, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
              return;
            } else {
              dk.a(2, param3, var8, -35, 23275, on.field_K);
              var8.a(((fi) this).field_m, param3, (byte) 78);
              mn.a(var8.field_p, 306, param0, param2, param3, param4, un.field_d, 2, jl.field_d, 1, -35);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, pf.field_b[param3], 16777215);
            return;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = 22 % ((param0 - -28) / 43);
        if (param1 <= -1) {
          lb.g(param2, param3, 153, 240, 16777215, 11184810);
          if (!((fi) this).b((byte) -107)) {
            return;
          } else {
            be.field_d.c(param2, param3);
            return;
          }
        } else {
          lb.g(param2, param3, 160, 238, pf.field_b[param1], 16777215);
          if (!((fi) this).b((byte) -107)) {
            return;
          } else {
            be.field_d.c(param2, param3);
            return;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 <= -91) {
          if (null != s.field_d) {
            if (kc.field_r != null) {
              if (null != hk.field_I) {
                if (be.field_d == null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_v = null;
          if (null != s.field_d) {
            if (kc.field_r != null) {
              if (null != hk.field_I) {
                if (be.field_d == null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    fi(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
            ga.field_k = new jp[2];
            ao.field_o = new jp[2][];
            ja.field_a = new jp[2][];
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void d() {
        field_v = null;
        field_u = null;
        field_r = null;
        field_s = null;
        field_w = null;
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            field_u = null;
            return ja.field_a[param0 - 1];
        }
        return ja.field_a[param0 - 1];
    }

    final jp[] a(byte param0, int param1) {
        int var3 = 84 % ((65 - param0) / 49);
        return ao.field_o[-1 + param1];
    }

    final jp a(boolean param0, int param1) {
        if (!param0) {
          ((fi) this).a(true, -66, 69, -83, 51);
          return ga.field_k[-1 + param1];
        } else {
          return ga.field_k[-1 + param1];
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (((fi) this).b((byte) -125)) {
          int discarded$8 = -20777;
          var6 = ge.a(((fi) this).field_m, param3);
          if (var6.a((byte) -84, param3, ((fi) this).field_m)) {
            mn.a(var6.field_p, 640, param2, param4, param3, param1, s.field_d, 1, kc.field_r, 1, 0);
            if (param0) {
              return;
            } else {
              boolean discarded$9 = ((fi) this).a(false);
              return;
            }
          } else {
            dk.a(1, param3, var6, 0, 23275, hk.field_I);
            var6.a(((fi) this).field_m, param3, (byte) 78);
            mn.a(var6.field_p, 640, param2, param4, param3, param1, s.field_d, 1, kc.field_r, 1, 0);
            if (!param0) {
              boolean discarded$10 = ((fi) this).a(false);
              return;
            } else {
              return;
            }
          }
        } else {
          lb.g(param4, param2, 640, 480, pf.field_b[param3], 16777215);
          if (param0) {
            return;
          } else {
            boolean discarded$11 = ((fi) this).a(false);
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!i.field_m.a("arctic", -28138)) {
          return false;
        } else {
          s.field_d = pl.a("arctic", "arctic_near", (byte) 117, i.field_m);
          kc.field_r = pl.a("arctic", "arctic_mid", (byte) -79, i.field_m);
          hk.field_I = pl.a("arctic", "arctic_far", (byte) 112, i.field_m);
          be.field_d = pl.a("arctic", "arctic_small", (byte) -44, i.field_m);
          un.field_d = jh.a(0, s.field_d);
          jl.field_d = jh.a(0, kc.field_r);
          on.field_K = jh.a(0, hk.field_I);
          int discarded$2 = 2;
          ao.field_o[0] = cr.a("arctic", i.field_m, "arctic_caps");
          int discarded$3 = 2;
          ja.field_a[0] = cr.a("arctic", i.field_m, "arctic_segs");
          ga.field_k[0] = pl.a("arctic", "arctic_centre", (byte) -115, i.field_m);
          ao.field_o[1] = ig.a(ao.field_o[0], param0);
          ja.field_a[1] = ig.a(ja.field_a[0], false);
          ga.field_k[1] = pl.a(-16371, ga.field_k[0]);
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new re(1);
        field_w = new int[1024];
        field_u = "Lobby";
        field_v = "<%0> has left the lobby.";
    }
}
