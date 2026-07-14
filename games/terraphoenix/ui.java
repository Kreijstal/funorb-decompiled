/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    private int field_b;
    boolean field_d;
    static int[] field_e;
    static bg[] field_a;
    boolean field_c;
    static r field_f;

    final static String a(int param0, dh param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            if (param2 == -48) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          L1: {
            var3_int = param1.h(-115);
            if (var3_int > param0) {
              var3_int = param0;
              break L1;
            } else {
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param1.field_k = param1.field_k + bd.field_m.a(-112, var3_int, 0, param1.field_k, var4, param1.field_i);
          var5 = tc.a((byte) -114, var4, var3_int, 0);
          stackOut_5_0 = (String) var5;
          stackIn_6_0 = stackOut_5_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_6_0;
        }
        return null;
    }

    public static void a(byte param0) {
        if (param0 != -121) {
            field_a = null;
        }
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          ((ui) this).field_d = true;
          if (param1 == 0) {
            break L0;
          } else {
            ((ui) this).a(-126, -38, -21);
            break L0;
          }
        }
        L1: {
          var5 = ((ui) this).field_b;
          if (0 == var5) {
            param0 = 320;
            vc.field_f.c(qd.field_h[0], 320, 468, 13881286, 0);
            param2 = 76;
            param2 += 64;
            pf.field_a[0].b(0, 0);
            // wide iinc 3 160
            // wide iinc 1 -265
            og.field_f.b("<col=fcfe7f>1.</col> " + qd.field_h[1], param0, param2, 16777215, 0);
            param2 += 16;
            og.field_f.b("<col=fcfe7f>2.</col> " + qd.field_h[2], param0, param2, 16777215, 0);
            param2 += 16;
            og.field_f.b("<col=fcfe7f>3.</col> " + qd.field_h[3], param0, param2, 16777215, 0);
            // wide iinc 1 330
            param2 += 16;
            param2 -= 48;
            og.field_f.b("<col=fcfe7f>4.</col> " + qd.field_h[4], param0, param2, 16777215, 0);
            param2 += 16;
            og.field_f.b("<col=fcfe7f>5.</col> " + qd.field_h[5], param0, param2, 16777215, 0);
            param2 += 16;
            param2 += 46;
            int discarded$17 = sj.a(65280, 20, param2, 608, 14, 32, qd.field_h[6], 0);
            break L1;
          } else {
            if (-2 == (var5 ^ -1)) {
              vc.field_f.c(nd.field_o[0], 320, 468, 13881286, -1);
              param2 = 76;
              param0 = 320;
              param0 += 42;
              param2 += 32;
              pf.field_a[1].b(0, 0);
              param2 += 9;
              var5 = 1;
              L2: while (true) {
                if (var5 > 14) {
                  param2 += 30;
                  int discarded$18 = sj.a(65280, 20, param2, 592, 14, 48, nd.field_o[15], 0);
                  break L1;
                } else {
                  if (var5 >= 10) {
                    og.field_f.b("<col=fcfe7f>" + var5 + ".</col> " + nd.field_o[var5].toUpperCase(), param0, param2, 16777215, 0);
                    param2 += 16;
                    var5++;
                    continue L2;
                  } else {
                    og.field_f.b("<col=fcfe7f>0" + var5 + ".</col> " + nd.field_o[var5].toUpperCase(), param0, param2, 16777215, 0);
                    param2 += 16;
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              if (2 != var5) {
                if (var5 != 3) {
                  if (4 != var5) {
                    if ((var5 ^ -1) == -6) {
                      vc.field_f.c(oi.field_M[0], 320, 468, 13881286, -1);
                      param2 = 76;
                      param0 = 320;
                      param0 = 64;
                      param2 += 64;
                      rh.field_b[5].b(32, param2 + -16);
                      int discarded$19 = sj.a(16777215, 20, param2, 608, 14, param0, oi.field_M[1], 0);
                      param2 += 64;
                      rh.field_b[7].b(32, -16 + param2);
                      int discarded$20 = sj.a(16777215, 20, param2, 608, 14, param0, oi.field_M[2], 0);
                      param2 += 64;
                      rh.field_b[8].b(32, param2 + -16);
                      int discarded$21 = sj.a(16777215, param1 + 20, param2, 608, 14, param0, oi.field_M[3], 0);
                      break L1;
                    } else {
                      if (var5 != 6) {
                        if (7 != var5) {
                          if (8 == var5) {
                            param2 = 100;
                            vc.field_f.c(vb.field_f[0], 320, 468, 13881286, -1);
                            param0 = 320;
                            param2 += 32;
                            param0 = 32;
                            og.field_f.b(vb.field_f[1], param0, param2, 16580223, 0);
                            param2 += 24;
                            og.field_f.b(vb.field_f[2], 48 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b(vb.field_f[3], param0, param2, 16580223, 0);
                            param2 += 24;
                            og.field_f.b("S", 48 + param0, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[4], 64 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("M", 48 + param0, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[5], param0 + 64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("I", param0 - -48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[6], param0 - -64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("O", param0 + 48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[7], param0 - -64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("R", param0 - -48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[8], 64 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("W", 48 + param0, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[18], param0 + 64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("L", param0 - -48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[9], 64 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("N", 48 + param0, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[10], 64 + param0, param2, 16777215, 0);
                            // wide iinc 1 256
                            // wide iinc 3 -192
                            param2 += 24;
                            og.field_f.b("C", 48 + param0, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[11], param0 - -64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("TAB", 40 + param0, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[12], param0 - -64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("A", param0 + 48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[13], 64 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("G", param0 + 48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[14], 64 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("V", param0 - -48, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[15], 64 + param0, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b("[,]", param0 - -44, param2, 16580223, 0);
                            og.field_f.b(vb.field_f[16], param0 + 64, param2, 16777215, 0);
                            param2 += 24;
                            og.field_f.b(vb.field_f[17], 44 + param0, param2, 16777215, 0);
                            if (mm.field_e < 2) {
                              break L1;
                            } else {
                              param2 += 28;
                              og.field_f.c("ADMIN CHEATS", 320, param2, 16580223, 0);
                              param2 += 20;
                              og.field_f.c("<col=fcfe7f>K -</col> Kill all enemies on map.", 320, param2, 16777215, 0);
                              param2 += 16;
                              og.field_f.c("<col=fcfe7f>T -</col> Give current soldier full walking tus.", 320, param2, 16777215, 0);
                              param2 += 16;
                              og.field_f.c("<col=fcfe7f>Q -</col> Toggle QA helpermode.", 320, param2, 16777215, 0);
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          param2 = 80;
                          vc.field_f.c(o.field_a[0], 320, 468, 13881286, -1);
                          param0 = 320;
                          param0 = 32;
                          param2 += 32;
                          nb.field_d[0].b(param0, param2 - 16);
                          param2 = param2 + 13 * (sj.a(16777215, param1 ^ 20, param2, 608, 14, param0 + 48, o.field_a[1], 0) + 1);
                          nb.field_d[1].b(param0, param2 + -16);
                          param2 = param2 + (1 + sj.a(16777215, 20, param2, 608, 14, param0 + 48, o.field_a[2], 0)) * 13;
                          param2 = param2 + 13 * (sj.a(16777215, 20, param2, 608, 14, param0 - -48, o.field_a[3], 0) + 1);
                          param2 = param2 + (sj.a(16777215, 20, param2, 608, 14, param0 - -48, o.field_a[4], 0) + 1) * 13;
                          param2 = param2 + (sj.a(16777215, 20, param2, 608, 14, 48 + param0, o.field_a[5], 0) + 1) * 13;
                          break L1;
                        }
                      } else {
                        param2 = 80;
                        param0 = 320;
                        vc.field_f.c(k.field_d[0], 320, 468, 13881286, -1);
                        param0 = 20;
                        pf.field_a[7].b(0, param2);
                        param2 += 125;
                        og.field_f.b("1.", param0, param2 + -9, 16580223, 0);
                        param2 = param2 + (14 - -(14 * sj.a(16777215, 20, param2, 620, 14, param0 - -16, k.field_d[1], 0)));
                        og.field_f.b("2.", param0, -9 + param2, 16580223, 0);
                        param2 = param2 + (14 - -(14 * sj.a(16777215, param1 + 20, param2, 620, 14, 16 + param0, k.field_d[2], 0)));
                        og.field_f.b("3.", param0, -9 + param2, 16580223, 0);
                        param2 = param2 + (1 + sj.a(16777215, param1 + 20, param2, 620, 14, 16 + param0, k.field_d[3], 0)) * 14;
                        og.field_f.b("4.", param0, param2 - 9, 16580223, 0);
                        param2 = param2 + (sj.a(16777215, 20, param2, 620, 14, param0 - -16, k.field_d[4], 0) * 14 + 14);
                        og.field_f.b("5.", param0, -9 + param2, 16580223, 0);
                        param2 = param2 + 14 * (sj.a(16777215, param1 + 20, param2, 620, 14, 16 + param0, k.field_d[5], 0) + 1);
                        break L1;
                      }
                    }
                  } else {
                    param0 = 320;
                    param2 = 76;
                    vc.field_f.c(ij.field_a[0], 320, 468, 13881286, -1);
                    param0 = 96;
                    param2 += 48;
                    int discarded$22 = sj.a(16777215, 20, param2, 610, 14, param0, ij.field_a[1], 0);
                    rh.field_b[11].b(32, param2 - 16);
                    param2 += 48;
                    rh.field_b[0].b(32, param2 - 16);
                    int discarded$23 = sj.a(16777215, 20, param2, 608, 14, param0, ij.field_a[2], 0);
                    param2 += 48;
                    rh.field_b[1].b(32, param2 - 16);
                    int discarded$24 = sj.a(16777215, 20, param2, 608, 14, param0, ij.field_a[3], 0);
                    param2 += 48;
                    rh.field_b[3].b(32, -16 + param2);
                    int discarded$25 = sj.a(16777215, 20, param2, 608, 14, param0, ij.field_a[4], 0);
                    param2 += 48;
                    rh.field_b[6].b(32, -16 + param2);
                    int discarded$26 = sj.a(16777215, 20, param2, 608, 14, param0, ij.field_a[5], 0);
                    param2 += 48;
                    rh.field_b[9].b(32, -16 + param2);
                    rh.field_b[10].b(32, 4 + param2);
                    param2 += 16;
                    int discarded$27 = sj.a(16777215, 20, param2, 608, 14, param0, ij.field_a[6], 0);
                    break L1;
                  }
                } else {
                  param0 = 320;
                  vc.field_f.c(dd.field_O[0], 320, 468, 13881286, -1);
                  param2 = 76;
                  param2 += 32;
                  pf.field_a[3].b(0, 0);
                  param2 = param2 + pf.field_a[3].field_t;
                  param0 = 32;
                  param0 = 0;
                  var4 = param2;
                  var5 = 1;
                  L3: while (true) {
                    if (16 < var5) {
                      break L1;
                    } else {
                      L4: {
                        if (10 <= var5) {
                          og.field_f.b(var5 + ". ", 32 + param0, param2 - 9, 16580223, 0);
                          break L4;
                        } else {
                          og.field_f.b("0" + var5 + ". ", param0 - -32, param2 - 9, 16580223, 0);
                          break L4;
                        }
                      }
                      param2 = param2 + 11 * (1 - -sj.a(16777215, 20, param2, 320 + param0 + -16, 12, param0 + 48, dd.field_O[var5], 0));
                      if (-430 > (param2 ^ -1)) {
                        // wide iinc 1 310
                        param2 = var4;
                        var5++;
                        continue L3;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                param0 = 320;
                param2 = 76;
                vc.field_f.c(mb.field_p[0], 320, 468, 13881286, -1);
                pf.field_a[2].b(0, 0);
                param0 += 64;
                param2 += 32;
                param2 -= 32;
                param2 += 48;
                og.field_f.b("1.", param0, -9 + param2, 16580223, 0);
                int discarded$28 = sj.a(16777215, 20, param2, 616, 14, 16 + param0, mb.field_p[1], 0);
                param2 += 48;
                og.field_f.b("2.", param0, -9 + param2, 16580223, 0);
                int discarded$29 = sj.a(16777215, 20, param2, 616, 14, param0 + 16, mb.field_p[2], 0);
                param2 += 48;
                og.field_f.b("3.", param0, param2 + -9, 16580223, 0);
                int discarded$30 = sj.a(16777215, param1 + 20, param2, 616, 14, param0 - -16, mb.field_p[3], 0);
                param2 += 48;
                og.field_f.b("4.", param0, param2 + -9, 16580223, 0);
                int discarded$31 = sj.a(16777215, 20, param2, 616, 14, param0 - -16, mb.field_p[4], 0);
                param2 += 48;
                og.field_f.b("5.", param0, param2 + -9, 16580223, 0);
                int discarded$32 = sj.a(16777215, 20, param2, 616, 14, 16 + param0, mb.field_p[5], 0);
                param2 += 48;
                int discarded$33 = sj.a(65280, param1 + 20, param2, 592, 14, 48, mb.field_p[6], 0);
                break L1;
              }
            }
          }
        }
    }

    ui(int param0) {
        ((ui) this).field_b = param0;
        ((ui) this).field_c = true;
        ((ui) this).field_d = true;
        if ((param0 ^ -1) == -6) {
            ((ui) this).field_d = false;
            ((ui) this).field_c = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
    }
}
