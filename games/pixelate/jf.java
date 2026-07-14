/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static tf field_a;
    static String field_b;
    static mj field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -31476) {
            field_a = null;
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        long var2 = 0L;
        ug var4_ref_ug = null;
        int var4 = 0;
        int var5_int = 0;
        ug var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        if (Pixelate.field_G == uk.field_s) {
          L0: {
            if (param0) {
              break L0;
            } else {
              field_c = null;
              break L0;
            }
          }
          L1: {
            var2 = hm.a(64);
            if (0 == ij.field_s) {
              break L1;
            } else {
              if (0 <= ao.field_c) {
                break L1;
              } else {
                var4_ref_ug = (ug) (Object) id.field_d.c(1504642273);
                if (var4_ref_ug == null) {
                  break L1;
                } else {
                  if (var2 <= var4_ref_ug.field_o) {
                    break L1;
                  } else {
                    var4_ref_ug.c(2779);
                    jj.field_b = var4_ref_ug.field_r.length;
                    vi.field_o.field_m = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (jj.field_b <= var5_int) {
                        oj.field_G = gb.field_d;
                        gb.field_d = tm.field_U;
                        tm.field_U = mn.field_e;
                        mn.field_e = var4_ref_ug.field_m;
                        return true;
                      } else {
                        vi.field_o.field_k[var5_int] = var4_ref_ug.field_r[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
          L3: while (true) {
            L4: {
              if (-1 >= (ao.field_c ^ -1)) {
                break L4;
              } else {
                vi.field_o.field_m = 0;
                if (rd.a(1, false)) {
                  ao.field_c = vi.field_o.f((byte) 114);
                  vi.field_o.field_m = 0;
                  jj.field_b = param1[ao.field_c];
                  break L4;
                } else {
                  return false;
                }
              }
            }
            if (in.e(-18481)) {
              if (0 == ij.field_s) {
                oj.field_G = gb.field_d;
                gb.field_d = tm.field_U;
                tm.field_U = mn.field_e;
                mn.field_e = ao.field_c;
                ao.field_c = -1;
                return true;
              } else {
                L5: {
                  var4 = ij.field_s;
                  if (k.field_h != 0.0) {
                    var4 = (int)((double)var4 + ai.field_d.nextGaussian() * k.field_h);
                    if (var4 < 0) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var5 = new ug(var2 - -(long)var4, ao.field_c, new byte[jj.field_b]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= jj.field_b) {
                    id.field_d.a(22125, (fa) (Object) var5);
                    ao.field_c = -1;
                    continue L3;
                  } else {
                    var5.field_r[var6] = vi.field_o.field_k[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(String param0, int param1, byte param2) {
        CharSequence var6 = (CharSequence) (Object) param0;
        if (!(ai.a((byte) -126, var6))) {
            return qn.field_n;
        }
        if (gk.field_db != 2) {
            return ai.field_C;
        }
        if (sm.a(param0, -1)) {
            return wd.field_h;
        }
        if (!(!ha.a(param0, (byte) 37))) {
            return sd.a(mo.field_b, 34, new String[1]);
        }
        if ((f.field_q ^ -1) <= -101) {
            if (!((uo.field_j ^ -1) < -1)) {
                return tm.field_Q;
            }
        }
        if (param2 < 57) {
            field_c = null;
        }
        if (!((f.field_q ^ -1) > -201)) {
            return tm.field_Q;
        }
        if (i.a(-640, param0)) {
            return sd.a(bm.field_r, 85, new String[1]);
        }
        pc var5 = aa.field_f;
        var5.g(param1, 15514);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.e(160, 0);
        var5.b((byte) -41, param0);
        var5.f(-var4 + var5.field_m, -1);
        return null;
    }

    final static el a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        el var7 = null;
        int var8 = Pixelate.field_H ? 1 : 0;
        int var2 = param0.length();
        if (!(0 != var2)) {
            return pd.field_Kb;
        }
        if (var2 > 255) {
            return mk.field_a;
        }
        String[] var3 = dd.a(param0, (byte) -96, '.');
        if (2 > var3.length) {
            return pd.field_Kb;
        }
        String[] var4 = var3;
        if (param1 != -4384) {
            return null;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = sl.a(var6, (byte) 120);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return uo.a(-58, var3[var3.length + -1]);
    }

    final static ob a(fm param0, int param1, fm param2, int param3, byte param4) {
        if (param4 <= 96) {
            Object var6 = null;
            String discarded$0 = jf.a((String) null, -39, (byte) 9);
        }
        if (!rk.a(param3, false, param2, param1)) {
            return null;
        }
        return ed.a(param0.a(param1, param3, true), -28628);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your email address again to make sure it's correct";
    }
}
