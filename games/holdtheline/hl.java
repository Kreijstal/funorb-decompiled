/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl {
    static hj field_d;
    long field_f;
    static qi field_g;
    static String field_e;
    static String field_c;
    hl field_h;
    hl field_a;
    static boolean field_b;

    final static boolean a(boolean param0, int param1, wc param2, qm param3) {
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        Object var16 = null;
        Object var17 = null;
        hn var17_ref = null;
        Object var18 = null;
        dd var18_ref = null;
        var16 = null;
        var17 = null;
        var18 = null;
        if (-2 <= -param2.field_k + param1) {
          if (0 <= param1 + -param2.field_k) {
            if (!param0) {
              if (param2 instanceof dd) {
                var18_ref = (dd) (Object) param2;
                var5 = (float)(-var18_ref.field_R.field_h + param3.field_h);
                var6 = (float)(param3.field_f - var18_ref.field_R.field_f);
                var7 = -(var6 * var18_ref.field_D) + var5 * var18_ref.field_B;
                if (0.0f <= var7) {
                  if (var18_ref.field_J >= var7) {
                    var8 = var7 / var18_ref.field_J;
                    var9 = var18_ref.field_D * var5 + var18_ref.field_B * var6;
                    if ((float)var18_ref.d(var8, 0) <= var9) {
                      if (var9 > (float)var18_ref.c(95, var8)) {
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
                L0: {
                  var17_ref = (hn) (Object) param2;
                  var5 = (float)(param3.field_h + -var17_ref.field_U.field_h);
                  var6 = (float)(param3.field_f + -var17_ref.field_U.field_f);
                  var7 = (float)var17_ref.field_D;
                  var8 = (float)var17_ref.field_R;
                  if (var17_ref.field_E <= var17_ref.field_I) {
                    break L0;
                  } else {
                    var7 = (float)var17_ref.field_R;
                    var8 = (float)var17_ref.field_D;
                    break L0;
                  }
                }
                var9 = var6 * var6 + var5 * var5;
                if (var7 * var7 <= var9) {
                  if (var8 * var8 < var9) {
                    return false;
                  } else {
                    var10 = ha.a(var17_ref.field_U, param3, param0);
                    return var17_ref.b((byte) -113, var10);
                  }
                } else {
                  return false;
                }
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

    public static void c(int param0) {
        Object var2 = null;
        if (param0 != -2) {
          var2 = null;
          boolean discarded$2 = hl.a((String) null, 26, true, (String) null, (a) null, (String) null, 76);
          field_e = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final void d(int param0) {
        if (param0 != 0) {
            hl.c(47);
            if (!(null != ((hl) this).field_a)) {
                return;
            }
            ((hl) this).field_a.field_h = ((hl) this).field_h;
            ((hl) this).field_h.field_a = ((hl) this).field_a;
            ((hl) this).field_a = null;
            ((hl) this).field_h = null;
            return;
        }
        if (!(null != ((hl) this).field_a)) {
            return;
        }
        ((hl) this).field_a.field_h = ((hl) this).field_h;
        ((hl) this).field_h.field_a = ((hl) this).field_a;
        ((hl) this).field_a = null;
        ((hl) this).field_h = null;
    }

    final boolean b(int param0) {
        if (null == ((hl) this).field_a) {
            return false;
        }
        if (param0 < 38) {
            return true;
        }
        return true;
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, a param4, String param5, int param6) {
        Object var8 = null;
        vm var10 = null;
        vm var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param1 == -23000) {
          if (gg.field_M != bb.field_a) {
            return false;
          } else {
            var11 = new vm(ka.field_b, param4);
            ka.field_b.a((n) (Object) var11, false);
            if (!ma.a(0)) {
              L0: {
                ij.field_k = param5;
                qd.field_k = param0;
                if (!param2) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L0;
                }
              }
              ff.field_b = stackIn_19_0 != 0;
              bb.field_a = sf.field_n;
              ol.field_a = param3;
              u.field_V = param6;
              bg.field_d = null;
              return true;
            } else {
              var11.q(-124);
              return true;
            }
          }
        } else {
          var8 = null;
          boolean discarded$1 = hl.a((String) null, 49, true, (String) null, (a) null, (String) null, 51);
          if (gg.field_M != bb.field_a) {
            return false;
          } else {
            var10 = new vm(ka.field_b, param4);
            ka.field_b.a((n) (Object) var10, false);
            if (!ma.a(0)) {
              L1: {
                ij.field_k = param5;
                qd.field_k = param0;
                if (!param2) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              ff.field_b = stackIn_9_0 != 0;
              bb.field_a = sf.field_n;
              ol.field_a = param3;
              u.field_V = param6;
              bg.field_d = null;
              return true;
            } else {
              var10.q(-124);
              return true;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "To use a <col=1>super powers</col> you must activate it. Doing so will scatter the three used powerups around the course.";
        field_c = "Back";
        field_b = false;
    }
}
