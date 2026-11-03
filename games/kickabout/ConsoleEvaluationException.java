/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleEvaluationException extends Exception {
    static String field_a;
    static IndexedSprite[] field_d;
    static String field_f;
    static hd field_e;
    String field_c;
    static String field_b;

    public static void a(int param0) {
        if (param0 == 0) {
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
        field_f = (String) null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + ea.field_a) / 2;
        int var3 = rb.field_Bb * rb.field_Bb;
        int var4 = -(param1 * param1) + var3;
        dn.field_Cb.a(true, 199, var2 - var4 * 199 / var3, 90, -210 + (SoftwareRasterizer.field_f - 4));
        AuctionItem.field_p.a(true, 438, var4 * 438 / var3 + (202 + var2), 0, -124 + SoftwareRasterizer.field_f);
        int var5 = 66 % ((73 - param0) / 52);
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (param1 == 0) {
          if (eq.field_d <= 0) {
            if (!PlayArea.a(100)) {
              var2 = 1;
            } else {
              var2 = 0;
            }
          } else {
            if (ArchiveIndex.field_h == null) {
              SplashScreen.field_m = gf.a(oo.field_c, param1 + 0, 480, 0, 640, 0);
              if (null == SplashScreen.field_m) {
                var2 = 3;
              } else {
                var2 = 2;
                lp.a(SplashScreen.field_m, (byte) -64);
              }
              if (ArchiveIndex.field_h == null &&
                cv.field_e) {
                ba.a(param0, param1 + 6, var2);
              }
              return;
            }
            SplashScreen.field_m = ArchiveIndex.field_h.b(30182);
            ar.a(500, 2);
            if (null != SplashScreen.field_m) {
              var2 = 2;
              lp.a(SplashScreen.field_m, (byte) -64);
              if (ArchiveIndex.field_h == null &&
                cv.field_e) {
                ba.a(param0, param1 + 6, var2);
              }
              return;
            }
            var2 = 3;
          }
        } else {
          ConsoleEvaluationException.a(-109);
          if (eq.field_d <= 0) {
            if (!PlayArea.a(100)) {
              var2 = 1;
              if (ArchiveIndex.field_h == null &&
                cv.field_e) {
                ba.a(param0, param1 + 6, var2);
                return;
              }
              return;
            }
            var2 = 0;
            if (ArchiveIndex.field_h == null &&
              cv.field_e) {
              ba.a(param0, param1 + 6, var2);
              return;
            }
            return;
          }
          if (ArchiveIndex.field_h == null) {
            SplashScreen.field_m = gf.a(oo.field_c, param1 + 0, 480, 0, 640, 0);
          } else {
            SplashScreen.field_m = ArchiveIndex.field_h.b(30182);
            ar.a(500, 2);
          }
          if (null == SplashScreen.field_m) {
            var2 = 3;
          } else {
            var2 = 2;
            lp.a(SplashScreen.field_m, (byte) -64);
          }
        }
        if (ArchiveIndex.field_h != null) {
          return;
        }
        if (!cv.field_e) {
          return;
        }
        ba.a(param0, param1 + 6, var2);
    }

    ConsoleEvaluationException(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Menu";
        field_f = "Create a free Account";
        field_b = "posession";
    }
}
