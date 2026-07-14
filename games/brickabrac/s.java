/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    String field_g;
    static jp field_d;
    private int field_b;
    private int field_c;
    float field_e;
    private int field_h;
    private po[] field_f;
    static String field_a;

    final void a(mf param0, boolean param1, String param2, String param3) {
        if (param1) {
            ((s) this).field_c = -45;
        }
        this.a((String) null, param2, param3, param0, -1, 99);
    }

    final boolean d(int param0) {
        int var3 = 0;
        po var5 = null;
        po var6 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 > -94) {
          field_d = null;
          L0: while (true) {
            if (((s) this).field_c < ((s) this).field_b) {
              var6 = ((s) this).field_f[((s) this).field_c];
              if (!var6.field_b.a((byte) -127)) {
                this.a(0, -22269, var6);
                return false;
              } else {
                L1: {
                  if (0 > var6.field_h) {
                    break L1;
                  } else {
                    if (!var6.field_b.a(-13083, var6.field_h)) {
                      this.a(var6.field_b.d(var6.field_h, -27509), -22269, var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var6.field_d == null) {
                    break L2;
                  } else {
                    if (var6.field_b.a(var6.field_d, -28138)) {
                      break L2;
                    } else {
                      this.a(var6.field_b.b(0, var6.field_d), -22269, var6);
                      return false;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var6.field_h ^ -1)) {
                    break L3;
                  } else {
                    if (null != var6.field_d) {
                      break L3;
                    } else {
                      if (var6.field_g == null) {
                        break L3;
                      } else {
                        if (var6.field_b.a(108)) {
                          break L3;
                        } else {
                          this.a(var6.field_b.b(-4126), -22269, var6);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((s) this).field_c = ((s) this).field_c + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((s) this).field_c < ((s) this).field_b) {
              var5 = ((s) this).field_f[((s) this).field_c];
              if (!var5.field_b.a((byte) -127)) {
                this.a(0, -22269, var5);
                return false;
              } else {
                L5: {
                  if (0 > var5.field_h) {
                    break L5;
                  } else {
                    if (!var5.field_b.a(-13083, var5.field_h)) {
                      this.a(var5.field_b.d(var5.field_h, -27509), -22269, var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5.field_d == null) {
                    break L6;
                  } else {
                    if (var5.field_b.a(var5.field_d, -28138)) {
                      break L6;
                    } else {
                      this.a(var5.field_b.b(0, var5.field_d), -22269, var5);
                      return false;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var5.field_h ^ -1)) {
                    break L7;
                  } else {
                    if (null != var5.field_d) {
                      break L7;
                    } else {
                      if (var5.field_g == null) {
                        break L7;
                      } else {
                        if (var5.field_b.a(108)) {
                          break L7;
                        } else {
                          this.a(var5.field_b.b(-4126), -22269, var5);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((s) this).field_c = ((s) this).field_c + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final void a(String param0, String param1, int param2, String param3, mf param4) {
        this.a(param1, param0, param3, param4, -1, -90);
        int var6 = -82 / ((73 - param2) / 51);
    }

    private final void a(String param0, String param1, String param2, mf param3, int param4, int param5) {
        po[] var10 = null;
        if (((s) this).field_b >= ((s) this).field_f.length) {
            var10 = new po[2 * ((s) this).field_b];
            po[] var7 = var10;
            pm.a((Object[]) (Object) ((s) this).field_f, 0, (Object[]) (Object) var10, 0, ((s) this).field_b);
            ((s) this).field_f = var10;
        }
        po var9 = new po();
        po var11 = var9;
        po var7_ref = var11;
        var11.field_f = param1;
        int var8 = 0 / ((26 - param5) / 51);
        var11.field_g = param2;
        var11.field_b = param3;
        var11.field_d = param0;
        var11.field_h = param4;
        ((s) this).field_b = ((s) this).field_b + 1;
        ((s) this).field_f[((s) this).field_b] = var9;
    }

    final static void a(byte param0) {
        Object var2 = null;
        fr.a(true, (String) null, am.field_cc);
        if (param0 == -30) {
            return;
        }
        field_a = null;
    }

    final static void b(int param0) {
        Object var2 = null;
        mh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        mh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        mh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        mh stackOut_0_0;
        int stackOut_0_1;
        int stackOut_0_2;
        int stackOut_0_3;
        mh stackOut_2_0;
        int stackOut_2_1;
        int stackOut_2_2;
        int stackOut_2_3;
        int stackOut_2_4;
        mh stackOut_1_0;
        int stackOut_1_1;
        int stackOut_1_2;
        int stackOut_1_3;
        int stackOut_1_4;
        L0: {
          stackOut_0_0 = qb.field_v;
          stackOut_0_1 = 18;
          stackOut_0_2 = 0;
          stackOut_0_3 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (vd.field_e) {
            stackOut_2_0 = (mh) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 2 + (ec.field_J - -2) - -40;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (mh) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        ((mh) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, -stackIn_3_4 + vn.field_A.field_Ib, (byte) 64);
        ij.field_a.a(18, 0, -42 + vn.field_A.field_Ib + -ec.field_J, 42 + ec.field_J, (byte) 64);
        if (param0 < 122) {
          var2 = null;
          s.a((jp) null, -53, 56, (jp) null, (pb) null, -22, (byte) -5, (jp) null);
          fo.field_b.a(2, (byte) -118, vn.field_A.field_Ib, 0, 20, ec.field_J, vn.field_A.field_cb - 20);
          return;
        } else {
          fo.field_b.a(2, (byte) -118, vn.field_A.field_Ib, 0, 20, ec.field_J, vn.field_A.field_cb - 20);
          return;
        }
    }

    final static boolean a(int param0) {
        int var1 = -86 / ((28 - param0) / 42);
        return tn.field_m != null ? true : false;
    }

    final static void a(jp param0, int param1, int param2, jp param3, pb param4, int param5, byte param6, jp param7) {
        fc.a(-72, param4.field_p);
        lb.g(0, 0, param4.field_i, param4.field_q, kg.field_d[param2], 22953);
        param3.c((-param3.field_x + param4.field_i) / 2 - 147 / param1, 480 + param5 + -param7.field_z);
        param0.b(-(80 / param1) + (param4.field_i - param0.field_x) / 2, -(201 / param1) + (param4.field_q + param5) + -param0.field_z, 41, 110);
        int var8 = -97 / ((param6 - 54) / 61);
        sc.b(-95);
    }

    s(int param0) {
        ((s) this).field_f = new po[16];
        ((s) this).field_h = param0;
    }

    public static void c(int param0) {
        field_a = null;
        field_d = null;
        if (param0 == 4862) {
            return;
        }
        s.c(25);
    }

    private final void a(int param0, int param1, po param2) {
        float var4 = (float)param0 / 100.0f + (float)(((s) this).field_c + 1);
        ((s) this).field_e = (float)((s) this).field_h * var4 / (float)(1 + ((s) this).field_b);
        if (param1 != -22269) {
            s.b(116);
            if (-1 != (param0 ^ -1)) {
                ((s) this).field_g = param2.field_g + " - " + param0 + "%";
            } else {
                ((s) this).field_g = param2.field_f;
                return;
            }
            return;
        }
        if (-1 != (param0 ^ -1)) {
            ((s) this).field_g = param2.field_g + " - " + param0 + "%";
        } else {
            ((s) this).field_g = param2.field_f;
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Offer unrated rematch";
    }
}
