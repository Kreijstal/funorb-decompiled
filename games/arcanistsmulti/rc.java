/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    float field_b;
    static String field_o;
    static qb field_h;
    private int field_e;
    static String field_f;
    private int field_p;
    static String field_g;
    private ta[] field_c;
    private int field_q;
    String field_j;
    static String field_n;
    static eg field_a;
    static int field_m;
    static String field_l;
    static qb[] field_k;
    static ll[] field_d;
    static String field_i;

    private final void a(ta param0, int param1, int param2) {
        float var4 = (float)param1 / 100.0f + (float)(((rc) this).field_q + 1);
        if (param2 > -107) {
            return;
        }
        ((rc) this).field_b = var4 * (float)((rc) this).field_p / (float)(1 + ((rc) this).field_e);
        if (-1 == (param1 ^ -1)) {
            ((rc) this).field_j = param0.field_j;
        } else {
            ((rc) this).field_j = param0.field_f + " - " + param1 + "%";
            return;
        }
    }

    final static boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1321) {
          L0: {
            field_a = null;
            if (null == tc.field_A) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == tc.field_A) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static lg a(eg param0, int param1, String param2, String param3, eg param4) {
        if (param1 != -24755) {
            field_n = null;
        }
        int var5 = param4.c(param2, 105);
        int var6 = param4.a(param3, (byte) 73, var5);
        return kn.a(param4, var5, true, var6, param0);
    }

    final static void a(ec param0, int param1, int param2, int param3, ec param4, int param5) {
        la.field_d = param2;
        da.field_c = param5;
        bm.field_h = param3;
        if (param1 == 120) {
            return;
        }
        field_n = null;
    }

    public static void a(int param0) {
        field_a = null;
        field_o = null;
        field_g = null;
        field_h = null;
        field_i = null;
        field_l = null;
        field_n = null;
        field_k = null;
        field_d = null;
        if (param0 != -1) {
          field_k = null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        if (param1 != -30218) {
          L0: {
            var4 = null;
            int discarded$1 = rc.a((byte) 20, (CharSequence) null, -57);
            ma.field_N = param0;
            if (ea.field_F != jo.field_e) {
              var2 = ea.field_F * ea.field_F;
              var3 = var2 + -(jo.field_e * jo.field_e);
              param0 = param0 + var3 * (vd.field_k - param0) / var2;
              break L0;
            } else {
              break L0;
            }
          }
          n.field_g.a(640, sa.field_Hb, param0, 120, (byte) -120);
          jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
          return;
        } else {
          L1: {
            ma.field_N = param0;
            if (ea.field_F != jo.field_e) {
              var2 = ea.field_F * ea.field_F;
              var3 = var2 + -(jo.field_e * jo.field_e);
              param0 = param0 + var3 * (vd.field_k - param0) / var2;
              break L1;
            } else {
              break L1;
            }
          }
          n.field_g.a(640, sa.field_Hb, param0, 120, (byte) -120);
          jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            int discarded$0 = rc.a((byte) 9, (CharSequence) null, 44);
            return ri.a(-97);
        }
        return ri.a(-97);
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        int var3 = -52 % ((param0 - 7) / 60);
        return fn.a(true, (byte) -40, param1, param2);
    }

    final boolean d(int param0) {
        ta var2 = null;
        int var3 = 0;
        Object var4 = null;
        ta var5 = null;
        ta var6 = null;
        ta var7 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 78) {
          var4 = null;
          rc.a((ec) null, -3, -38, 35, (ec) null, -83);
          L0: while (true) {
            if (((rc) this).field_q < ((rc) this).field_e) {
              var7 = ((rc) this).field_c[((rc) this).field_q];
              var5 = var7;
              var2 = var5;
              if (var7.field_c.c(-10923)) {
                L1: {
                  if ((var7.field_h ^ -1) > -1) {
                    break L1;
                  } else {
                    if (var7.field_c.a(true, var7.field_h)) {
                      break L1;
                    } else {
                      this.a(var2, var7.field_c.a(var7.field_h, -23760), -112);
                      return false;
                    }
                  }
                }
                L2: {
                  if (var7.field_g == null) {
                    break L2;
                  } else {
                    if (!var7.field_c.a(var7.field_g, -24417)) {
                      this.a(var2, var7.field_c.b(var7.field_g, 108), -126);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((var7.field_h ^ -1) <= -1) {
                    break L3;
                  } else {
                    if (var7.field_g != null) {
                      break L3;
                    } else {
                      if (var7.field_f == null) {
                        break L3;
                      } else {
                        if (var7.field_c.a(-105)) {
                          break L3;
                        } else {
                          this.a(var2, var7.field_c.a((byte) -116), -118);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((rc) this).field_q = ((rc) this).field_q + 1;
                continue L0;
              } else {
                this.a(var7, 0, -123);
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((rc) this).field_q < ((rc) this).field_e) {
              var6 = ((rc) this).field_c[((rc) this).field_q];
              var5 = var6;
              var2 = var5;
              if (var6.field_c.c(-10923)) {
                L5: {
                  if ((var6.field_h ^ -1) > -1) {
                    break L5;
                  } else {
                    if (var6.field_c.a(true, var6.field_h)) {
                      break L5;
                    } else {
                      this.a(var2, var6.field_c.a(var6.field_h, -23760), -112);
                      return false;
                    }
                  }
                }
                L6: {
                  if (var6.field_g == null) {
                    break L6;
                  } else {
                    if (!var6.field_c.a(var6.field_g, -24417)) {
                      this.a(var2, var6.field_c.b(var6.field_g, 108), -126);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if ((var6.field_h ^ -1) <= -1) {
                    break L7;
                  } else {
                    if (var6.field_g != null) {
                      break L7;
                    } else {
                      if (var6.field_f == null) {
                        break L7;
                      } else {
                        if (var6.field_c.a(-105)) {
                          break L7;
                        } else {
                          this.a(var2, var6.field_c.a((byte) -116), -118);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((rc) this).field_q = ((rc) this).field_q + 1;
                continue L4;
              } else {
                this.a(var6, 0, -123);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    private rc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Hide players in <%0>'s game";
        field_f = "Targeted spells:";
        field_g = "Year";
        field_h = new qb(540, 140);
        field_n = "Just play";
        field_l = "You cannot cast Vine Bridge while flying, land to cast it";
        field_i = "<br><br>Your familiar is already at maximum power.";
    }
}
