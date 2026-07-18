/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di extends ak {
    private int field_i;

    final void b(int param0) {
        nt var2 = null;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          super.b(param0);
          kf.field_u.d(param0 ^ 18481);
          if (((di) this).field_i % 50 == 0) {
            int discarded$18 = -96;
            up.field_a = fi.a(640, he.field_o) << 8;
            int discarded$19 = -96;
            cv.field_E = fi.a(480, he.field_o) << 8;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          kf.field_u.a(false, cv.field_E, up.field_a);
          if (param0 == -18556) {
            break L1;
          } else {
            ((di) this).field_i = -126;
            break L1;
          }
        }
        L2: {
          if (0 != ((di) this).field_i % 100) {
            break L2;
          } else {
            int discarded$20 = -96;
            ff.a(kf.field_u.field_C, 40, kf.field_u.field_z, im.field_b, lr.field_a[fi.a(6, he.field_o)], (byte) 94);
            int discarded$21 = -96;
            gn.a(34 - -fi.a(4, he.field_o), true);
            break L2;
          }
        }
        L3: {
          if (((di) this).field_i % 2 != 0) {
            int discarded$22 = -96;
            int discarded$23 = -96;
            im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - -fi.a(2048, he.field_o) + -1024 >> 8, -1024 + (kf.field_u.field_z + fi.a(2048, he.field_o)) >> 8, -1, 1, true), (byte) 39);
            int discarded$24 = -96;
            int discarded$25 = -96;
            im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o) + 1024) >> 8, kf.field_u.field_z - (-fi.a(2048, he.field_o) + 1024) >> 8, -1, 3, true), (byte) 39);
            int discarded$26 = -96;
            int discarded$27 = -96;
            im.field_b.a((ms) (Object) new eq(50, kf.field_u.field_C - (-fi.a(2048, he.field_o) + 1024) >> 8, -1024 + kf.field_u.field_z - -fi.a(2048, he.field_o) >> 8, -1, 5, true), (byte) 39);
            break L3;
          } else {
            int discarded$28 = -96;
            int discarded$29 = -96;
            im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C - -fi.a(2048, he.field_o)) >> 8, kf.field_u.field_z - -fi.a(2048, he.field_o) - 1024 >> 8, -1, 0, false), (byte) 39);
            int discarded$30 = -96;
            int discarded$31 = -96;
            im.field_b.a((ms) (Object) new eq(50, -1024 + (kf.field_u.field_C + fi.a(2048, he.field_o)) >> 8, -1024 + (kf.field_u.field_z - -fi.a(2048, he.field_o)) >> 8, -1, 2, false), (byte) 39);
            int discarded$32 = -96;
            int discarded$33 = -96;
            im.field_b.a((ms) (Object) new eq(50, -1024 + kf.field_u.field_C + fi.a(2048, he.field_o) >> 8, kf.field_u.field_z + fi.a(2048, he.field_o) - 1024 >> 8, -1, 4, false), (byte) 39);
            break L3;
          }
        }
        var2 = (nt) (Object) im.field_b.b(68);
        L4: while (true) {
          if (var2 == null) {
            ((di) this).field_i = ((di) this).field_i + 1;
            return;
          } else {
            L5: {
              if (!var2.a(-2567)) {
                break L5;
              } else {
                var2.b(false);
                if (!(var2 instanceof vi)) {
                  break L5;
                } else {
                  int discarded$34 = -96;
                  if (fi.a(3, he.field_o) != 1) {
                    break L5;
                  } else {
                    if (((vi) (Object) var2).field_u) {
                      break L5;
                    } else {
                      int discarded$35 = -96;
                      uv.a(lr.field_a[fi.a(6, he.field_o)], var2.field_o, param0 ^ 18547, var2.field_k, im.field_b, 20);
                      break L5;
                    }
                  }
                }
              }
            }
            var2 = (nt) (Object) im.field_b.d((byte) 18);
            continue L4;
          }
        }
    }

    final static String b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 42 / ((param0 - -75) / 49);
        String var1 = "(" + li.field_r + " " + vb.field_I + " " + ur.field_Q + ") " + iw.field_a;
        if (0 >= gu.field_d) {
        } else {
            var1 = var1 + ":";
            for (var3 = 0; var3 < gu.field_d; var3++) {
                var1 = var1 + ' ';
                var4 = ig.field_a.field_n[var3] & 255;
                var5 = var4 >> 4;
                var4 = var4 & 15;
                if (10 <= var5) {
                    var5 += 55;
                } else {
                    var5 += 48;
                }
                if (10 <= var4) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var1 = var1 + (char)var5;
                var1 = var1 + (char)var4;
            }
        }
        return var1;
    }

    public di() {
        super(12);
        im.field_b = new jn();
    }

    final void a(int param0, ha param1, int param2) {
        ha var4 = null;
        hr[] var5 = null;
        nt var7 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        try {
            var4 = param1;
            var5 = hf.field_H;
            wo.a(var5, 60, 210, 0, 1, var4, 220, 350, 1, true);
            wo.a(hf.field_H, lu.field_e.a() + 20, -10 + (-(lu.field_e.c() >> 1) + 320), -1426063360, 3, param1, lu.field_e.c() - -20, 190 - (lu.field_e.a() >> 1), 1, true);
            lu.field_e.a(-(lu.field_e.c() >> 1) + 320, 200 - (lu.field_e.a() >> 1));
            var7 = (nt) (Object) im.field_b.b(-102);
            while (var7 != null) {
                var7.a(param1, param2 + 2230);
                var7 = (nt) (Object) im.field_b.d((byte) 18);
            }
            kf.field_u.a(param1, param2 + 21754);
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "di.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
