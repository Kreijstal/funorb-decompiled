/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lk extends oa {
    static int field_W;
    static String field_X;
    private int field_ab;
    static String field_V;
    private tl field_db;
    static int field_eb;
    static String field_bb;
    static String field_Y;
    static wg field_cb;
    static String field_Z;

    final static void a(pn param0, String param1, boolean param2, int param3, int param4, boolean param5, int param6, int param7, int param8, long param9, byte param10, int param11, int param12, int param13) {
        try {
            rf.field_d = new kj(param8);
            mm.field_g = new kj(param11);
            bk.field_Z = param4;
            kg.field_Wb = param3;
            ll.field_l = param13;
            og.field_b = param9;
            cd.field_a = param2 ? true : false;
            ki.field_ib = param5 ? true : false;
            if (param10 < 112) {
                lk.g(-71);
            }
            fe.field_F = param6;
            e.field_b = param1;
            vi.field_T = param7;
            nk.field_A = param0;
            kk.field_d = param12;
            if (!(null == nk.field_A.field_m)) {
                try {
                    va.field_h = new rj(nk.field_A.field_m, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        if (!(!vm.b(param0, 75))) {
            return false;
        }
        if (eb.b(param0, 29974)) {
            return false;
        }
        if (!(!mn.a(-30157, param0))) {
            return false;
        }
        if (-1 == (param2.length() ^ -1)) {
            return true;
        }
        if (nj.a(param0, 300, param2)) {
            return false;
        }
        if (fj.a(param2, -7036, param0)) {
            return false;
        }
        if (!(!wl.a(param0, true, param2))) {
            return false;
        }
        int var3 = -38 % ((param1 - -50) / 37);
        return true;
    }

    public static void h(int param0) {
        field_Z = null;
        if (param0 != -30289) {
            return;
        }
        field_Y = null;
        field_V = null;
        field_X = null;
        field_cb = null;
        field_bb = null;
    }

    final static void a(byte param0, boolean param1) {
        ji.a(param1, (byte) 44);
        if (param0 > -58) {
            return;
        }
        ci.a(param1, (byte) 122);
    }

    final static void g(int param0) {
        jn.field_g = true;
        ib.field_b = param0;
    }

    lk(tl param0) {
        ((lk) this).field_db = param0;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = SteelSentinels.field_G;
        lf.a();
        kf.field_t = new int[260];
        cj.field_j = 11;
        for (var1 = 0; 256 > var1; var1++) {
            var2 = 15.0;
            kf.field_t[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < kf.field_t.length) {
            kf.field_t[var5] = 255;
            var5++;
        }
        if (!param0) {
            field_V = null;
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        ((lk) this).field_ab = ((lk) this).field_ab + 1;
        if (param1 <= 56) {
            ((lk) this).a(71, (byte) 105, -24, 10);
        }
        super.a(param0, 123, param2, param3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        vd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk var12 = null;
        wk var13 = null;
        wk var14 = null;
        L0: {
          var11 = SteelSentinels.field_G;
          if (param1 <= -99) {
            break L0;
          } else {
            ((lk) this).field_ab = 58;
            break L0;
          }
        }
        super.a(param0, (byte) -124, param2, param3);
        if (-1 == (param3 ^ -1)) {
          L1: {
            L2: {
              var5 = param2 - (-((lk) this).field_o + -(((lk) this).field_x >> -1950049055));
              var6 = param0 + (((lk) this).field_z - -(((lk) this).field_E >> 186470657));
              var8 = ((lk) this).field_db.a((byte) 21);
              if (nh.field_J == var8) {
                break L2;
              } else {
                if (ma.field_Y != var8) {
                  if (var8 == fa.field_d) {
                    var14 = t.field_i[2];
                    var14.a(var5 + -(var14.field_A >> 259455585), -(var14.field_F >> 1320354081) + var6, 256);
                    break L1;
                  } else {
                    if (vf.field_b == var8) {
                      var13 = t.field_i[1];
                      var13.a(var5 - (var13.field_A >> -1188893599), var6 + -(var13.field_F >> 1579588897), 256);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                var12 = t.field_i[0];
                var9 = var12.field_z << 1471493217;
                var10 = var12.field_B << -2026876799;
                if (null == qf.field_f) {
                  break L4;
                } else {
                  if (var9 > qf.field_f.field_A) {
                    break L4;
                  } else {
                    if (var10 > qf.field_f.field_F) {
                      break L4;
                    } else {
                      q.a(qf.field_f, (byte) -71);
                      pb.b();
                      break L3;
                    }
                  }
                }
              }
              qf.field_f = new wk(var9, var10);
              q.a(qf.field_f, (byte) -108);
              break L3;
            }
            var12.a(112, 144, var12.field_z << 1507260388, var12.field_B << 1286368356, -((lk) this).field_ab << 1735451114, 4096);
            tk.f((byte) 106);
            qf.field_f.a(-var12.field_z + var5, -var12.field_B + var6, 256);
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    final String e(int param0) {
        if (((lk) this).field_C) {
            return ((lk) this).field_db.a(true);
        }
        if (param0 == 0) {
            return null;
        }
        field_eb = 95;
        return null;
    }

    final boolean a(int param0, lh param1) {
        if (param0 != 1) {
            field_V = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Hide lobby chat";
        field_Y = "Names should contain a maximum of 12 characters";
        field_X = "D";
        field_Z = "Account created successfully!";
        field_eb = 0;
        field_bb = "Please log in as a subscribing member to access this feature.";
    }
}
