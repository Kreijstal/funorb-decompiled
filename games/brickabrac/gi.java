/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ki {
    static String field_r;
    static String field_s;
    static String field_u;
    static String field_t;

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (!this.b((byte) -127)) {
          lb.g(param4, param2, 640, 480, kg.field_i[param3], 16777215);
          if (!param0) {
            field_u = (String) null;
            return;
          } else {
            return;
          }
        } else {
          var6 = ge.a(this.field_m, param3, -20777);
          if (var6.a((byte) -84, param3, this.field_m)) {
            sa.a((byte) 119, wn.field_b, param2, 1, lj.field_q, var6.field_p, param1, 640, 0, param4);
            if (param0) {
              return;
            } else {
              field_u = (String) null;
              return;
            }
          } else {
            lf.a(var6, 1, 0, fp.field_B, param3, 100);
            var6.a(this.field_m, param3, (byte) 78);
            sa.a((byte) 119, wn.field_b, param2, 1, lj.field_q, var6.field_p, param1, 640, 0, param4);
            if (param0) {
              return;
            } else {
              field_u = (String) null;
              return;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (-1 < param1) {
          lb.g(param2, param3, 153, 238, kg.field_i[param1], 16777215);
          var5 = 52 % ((param0 - -28) / 43);
          if (!this.b((byte) -106)) {
            return;
          } else {
            ce.field_c.c(param2, param3);
            return;
          }
        } else {
          lb.g(param2, param3, 153, 238, 16777215, 11184810);
          var5 = 52 % ((param0 - -28) / 43);
          if (!this.b((byte) -106)) {
            return;
          } else {
            ce.field_c.c(param2, param3);
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (!i.field_m.a("desert", -28138)) {
          return false;
        } else {
          wn.field_b = pl.a("desert", "desert_near", (byte) 107, i.field_m);
          lj.field_q = pl.a("desert", "desert_mid", (byte) -121, i.field_m);
          fp.field_B = pl.a("desert", "desert_far", (byte) 122, i.field_m);
          ce.field_c = pl.a("desert", "desert_small", (byte) 99, i.field_m);
          lq.field_d = jh.a(0, wn.field_b);
          oc.field_x = jh.a(0, lj.field_q);
          pp.field_b = jh.a(0, fp.field_B);
          im.field_f[0] = cr.a("desert", i.field_m, "desert_caps", 2);
          pk.field_e[0] = cr.a("desert", i.field_m, "desert_segs", 2);
          um.field_l[0] = pl.a("desert", "desert_centre", (byte) 110, i.field_m);
          im.field_f[1] = ig.a(im.field_f[0], param0);
          pk.field_e[1] = ig.a(pk.field_e[0], false);
          um.field_l[1] = pl.a(-16371, um.field_l[0]);
          return true;
        }
    }

    final jp a(boolean param0, int param1) {
        if (!param0) {
          this.a((byte) 65, 25, -62, -115);
          return um.field_l[-1 + param1];
        } else {
          return um.field_l[-1 + param1];
        }
    }

    final jp[] a(byte param0, int param1) {
        int var3 = 105 % ((param0 - 65) / 49);
        return im.field_f[param1 - 1];
    }

    final jp[] a(int param0, boolean param1) {
        if (!param1) {
            field_u = (String) null;
            return pk.field_e[param0 - 1];
        }
        return pk.field_e[param0 - 1];
    }

    public static void f(int param0) {
        field_u = null;
        field_t = null;
        field_r = null;
        field_s = null;
        if (param0 != -417029247) {
            gi.g(-5);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var7 = null;
        pb var8 = null;
        if (param1 < -84) {
          if (this.b((byte) -123)) {
            var8 = kd.a(this.field_m, param3, (byte) -74);
            if (var8.a((byte) -84, param3, this.field_m)) {
              sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var8.field_p, param4, 306, -13, param2);
              return;
            } else {
              lf.a(var8, 2, -13, pp.field_b, param3, 102);
              var8.a(this.field_m, param3, (byte) 78);
              sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var8.field_p, param4, 306, -13, param2);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, kg.field_i[param3], 16777215);
            return;
          }
        } else {
          field_u = (String) null;
          if (this.b((byte) -123)) {
            var7 = kd.a(this.field_m, param3, (byte) -74);
            if (var7.a((byte) -84, param3, this.field_m)) {
              sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var7.field_p, param4, 306, -13, param2);
              return;
            } else {
              lf.a(var7, 2, -13, pp.field_b, param3, 102);
              var7.a(this.field_m, param3, (byte) 78);
              sa.a((byte) 86, lq.field_d, param0, 2, oc.field_x, var7.field_p, param4, 306, -13, param2);
              return;
            }
          } else {
            lb.g(param2, param0, 306, 480, kg.field_i[param3], 16777215);
            return;
          }
        }
    }

    gi(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        try {
            im.field_f = new jp[2][];
            um.field_l = new jp[2];
            pk.field_e = new jp[2][];
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(byte param0) {
        int stackIn_15_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param0 < -91) {
          if (wn.field_b != null) {
            if (null != lj.field_q) {
              if (null != fp.field_B) {
                if (ce.field_c != null) {
                  if (im.field_f != null) {
                    if (pk.field_e == null) {
                      return false;
                    } else {
                      L0: {
                        if (um.field_l == null) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          break L0;
                        } else {
                          stackOut_30_0 = 1;
                          stackIn_32_0 = stackOut_30_0;
                          break L0;
                        }
                      }
                      return stackIn_32_0 != 0;
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
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_s = (String) null;
          if (wn.field_b != null) {
            if (null != lj.field_q) {
              if (null != fp.field_B) {
                if (ce.field_c != null) {
                  if (im.field_f != null) {
                    if (pk.field_e == null) {
                      return false;
                    } else {
                      L1: {
                        if (um.field_l == null) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L1;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L1;
                        }
                      }
                      return stackIn_15_0 != 0;
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
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = co.a((byte) -53);
        var2 = ba.b(true);
        vg.field_c.a(var1 - -(un.field_a << 753437185), var2 - -(vo.field_A << -417029247), nc.field_k + -un.field_a, false, mi.field_d + -vo.field_A);
        jq.d(-16085);
        if (param0 != 11184810) {
          field_t = (String) null;
          return;
        } else {
          return;
        }
    }

    static {
        field_r = "Discard";
        field_t = "Report <%0> for abuse";
        field_u = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_s = "Achieved";
    }
}
