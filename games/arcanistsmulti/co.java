/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class co {
    static kc field_f;
    static am field_h;
    static String field_b;
    static String field_d;
    static boolean[][] field_a;
    static int field_c;
    static String field_i;
    static java.util.zip.CRC32 field_g;
    static int[] field_e;

    public static void b(int param0) {
        field_a = null;
        field_i = null;
        field_h = null;
        field_f = null;
        if (param0 > -42) {
            co.c(8);
        }
        field_d = null;
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static int a(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        vn var1 = rk.field_O.g((byte) 56);
        int var2 = 0;
        ml var3 = (ml) (Object) var1.b(param0 + 33298);
        if (param0 != -20675) {
            field_h = null;
        }
        while (var3 != null) {
            if (40 == var3.field_jb) {
                var2++;
            }
            var3 = (ml) (Object) var1.a(0);
        }
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          rm.field_k = 0;
          rk.field_O.field_X[0] = 0;
          qn.field_ob.field_t = false;
          rk.field_O.field_D = false;
          rk.field_O.b(0, true, 0);
          qn.field_ob.field_bb = 0;
          rk.field_O.c(-4207, 0);
          rk.field_O.d(3, true);
          rk.field_O.field_y = 1920;
          rk.field_O.field_H = 960;
          if (mj.field_p != 0) {
            break L0;
          } else {
            rk.field_O.field_y = 1280;
            rk.field_O.field_H = 480;
            rk.field_O.d(9, true);
            break L0;
          }
        }
        L1: {
          if ((mj.field_p ^ -1) == -2) {
            rk.field_O.field_y = 960;
            rk.field_O.field_H = 960;
            rk.field_O.d(33, true);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((mj.field_p ^ -1) == -3) {
            rk.field_O.d(3, true);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (3 == mj.field_p) {
            rk.field_O.d(9, true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if ((mj.field_p ^ -1) != -5) {
            break L4;
          } else {
            rk.field_O.d(15, true);
            break L4;
          }
        }
        L5: {
          if (mj.field_p != 5) {
            break L5;
          } else {
            rk.field_O.d(33, true);
            break L5;
          }
        }
        L6: {
          if (mj.field_p != 6) {
            break L6;
          } else {
            rk.field_O.d(39, true);
            break L6;
          }
        }
        L7: {
          if ((mj.field_p ^ -1) != -8) {
            break L7;
          } else {
            rk.field_O.d(45, true);
            break L7;
          }
        }
        L8: {
          rk.field_O.field_Hb = rk.field_O.field_H >> 2135688897;
          rk.field_O.field_hb = rk.field_O.field_y >> -1733914751;
          rk.field_O.b(649860712, true);
          if (jh.field_c[rk.field_O.a(-31497) + 1] != null) {
            mi.a(jh.field_c[rk.field_O.a(-31497) - -1], 3);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          qn.field_ob.m(413355681);
          rk.field_O.a((byte) -96);
          var2 = mj.field_p;
          if (var2 == 0) {
            rk.field_O.a(false, -1, false);
            qn.field_ob.field_y = false;
            qn.field_ob.field_G = false;
            rk.field_O.h((byte) 19);
            rk.field_O.a(0, 0, -1, 68, 12);
            rk.field_O.a((byte) -124, new ml(0, 167, 134, rk.field_O.h(-107), rk.field_O, 0));
            rk.field_O.a((byte) -122, new ml(40, 437, 93, rk.field_O.h(-71), rk.field_O, 1));
            rk.field_O.a((byte) -124, new ml(40, 707, 90, rk.field_O.h(-88), rk.field_O, 2));
            rk.field_O.a((byte) -127, new ml(40, 996, 164, rk.field_O.h(-105), rk.field_O, 3));
            rk.field_O.a(1, (byte) -121);
            break L9;
          } else {
            if ((var2 ^ -1) != -2) {
              if ((var2 ^ -1) == -3) {
                rk.field_O.a(false, -1, false);
                qn.field_ob.field_G = false;
                qn.field_ob.field_y = false;
                rk.field_O.h((byte) 19);
                rk.field_O.a(0, 0, -1, 21, 0);
                rk.field_O.a((byte) -117, new ml(0, 1058, 238, rk.field_O.h(-85), rk.field_O, 0));
                rk.field_O.a((byte) -126, new ml(40, 505, 334, rk.field_O.h(-100), rk.field_O, 1));
                rk.field_O.a((byte) -126, new ml(40, 1297, 566, rk.field_O.h(-84), rk.field_O, 2));
                rk.field_O.a((byte) -115, new ml(40, 1515, 153, rk.field_O.h(-87), rk.field_O, 3));
                rk.field_O.a(1, (byte) 38);
                break L9;
              } else {
                if (var2 != 3) {
                  if (var2 == 4) {
                    rk.field_O.a(true, -1, false);
                    qn.field_ob.field_G = true;
                    qn.field_ob.field_y = false;
                    rk.field_O.h((byte) 19);
                    rk.field_O.a(0, 0, -1, 78, 10);
                    rk.field_O.a((byte) -125, new ml(0, 803, 366, rk.field_O.h(-97), rk.field_O, 0));
                    rk.field_O.a((byte) -124, new ml(40, 300, 110, rk.field_O.h(-75), rk.field_O, 1));
                    rk.field_O.a((byte) -120, new ml(40, 1440, 465, rk.field_O.h(-80), rk.field_O, 2));
                    rk.field_O.a((byte) -121, new ml(40, 740, 327, rk.field_O.h(-115), rk.field_O, 3));
                    rk.field_O.a(1, (byte) 115);
                    break L9;
                  } else {
                    if (var2 != 5) {
                      if (6 != var2) {
                        L10: {
                          if ((var2 ^ -1) == -8) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          rk.field_O.a(true, -1, true);
                          qn.field_ob.field_y = false;
                          qn.field_ob.field_G = true;
                          if (9 != rk.field_O.field_x[0]) {
                            rk.field_O.a((byte) -127, new ml(0, 910, 181, rk.field_O.h(-93), rk.field_O, 0));
                            break L11;
                          } else {
                            rk.field_O.a((byte) -115, new ml(27, 910, 181, rk.field_O.h(-115), rk.field_O, 0));
                            break L11;
                          }
                        }
                        rk.field_O.a(1, (byte) 29);
                        rk.field_O.h((byte) 19);
                        var2 = 0;
                        L12: while (true) {
                          if ((var2 ^ -1) <= -17) {
                            var1 = 10;
                            var2 = 0;
                            L13: while (true) {
                              if ((var2 ^ -1) < -5) {
                                rk.field_O.field_x[0] = var1;
                                rk.field_O.field_X[0] = 0;
                                rk.field_O.field_Ab[0] = 0;
                                rk.field_O.field_o[0] = 0;
                                rk.field_O.b(0, true, 0);
                                break L9;
                              } else {
                                if (0 <= b.field_f[var2]) {
                                  if (0 == b.field_f[var2] % 12) {
                                    if (b.field_f[11 + var2] == 11 + b.field_f[var2]) {
                                      var1 = b.field_f[var2] / 12 - 1;
                                      if (var1 == -1) {
                                        var1 = 10;
                                        if (qf.field_d >= 2) {
                                          var1 = 9;
                                          var2++;
                                          continue L13;
                                        } else {
                                          var2++;
                                          continue L13;
                                        }
                                      } else {
                                        var2++;
                                        continue L13;
                                      }
                                    } else {
                                      var2++;
                                      continue L13;
                                    }
                                  } else {
                                    var2++;
                                    continue L13;
                                  }
                                } else {
                                  var2++;
                                  continue L13;
                                }
                              }
                            }
                          } else {
                            var3 = b.field_f[var2];
                            if (var3 != -1) {
                              L14: {
                                var4 = hh.field_b[var3];
                                if (hh.field_b[var3] != -1) {
                                  break L14;
                                } else {
                                  var4 = 1;
                                  break L14;
                                }
                              }
                              L15: {
                                if (hh.field_b[var3] == 0) {
                                  var4 = -1;
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              rk.field_O.a(0, var2, var4, 27, var3);
                              rk.field_O.a(1, var2, var4, 67, var3);
                              rk.field_O.a(2, var2, var4, 75, var3);
                              rk.field_O.a(3, var2, var4, 36, var3);
                              var2++;
                              continue L12;
                            } else {
                              var2++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        rk.field_O.a(true, -1, true);
                        qn.field_ob.field_G = true;
                        qn.field_ob.field_y = true;
                        rk.field_O.b(0, true, 0);
                        rk.field_O.h((byte) 19);
                        rk.field_O.a(0, 0, -1, 59, 0);
                        rk.field_O.a(0, 1, -1, 67, 12);
                        rk.field_O.a(0, 2, -1, 28, 14);
                        rk.field_O.a((byte) -116, new ml(0, 707, 365, rk.field_O.h(-92), rk.field_O, 0));
                        rk.field_O.a((byte) -119, new ml(3, 341, -rk.field_O.field_H, rk.field_O.h(-119), rk.field_O, 1));
                        rk.field_O.a((byte) -117, new ml(3, 1152, -rk.field_O.field_H, rk.field_O.h(-116), rk.field_O, 2));
                        rk.field_O.a((byte) -118, new ml(3, 1546, -rk.field_O.field_H, rk.field_O.h(-111), rk.field_O, 3));
                        rk.field_O.a(4, (byte) -105);
                        break L9;
                      }
                    } else {
                      rk.field_O.a(true, -1, false);
                      qn.field_ob.field_y = false;
                      qn.field_ob.field_G = true;
                      rk.field_O.h((byte) 19);
                      rk.field_O.a(0, 0, -1, 68, 6);
                      rk.field_O.a((byte) -120, new ml(0, 768, 399, rk.field_O.h(-115), rk.field_O, 0));
                      rk.field_O.a((byte) -116, new ml(40, 403, 543, rk.field_O.h(-119), rk.field_O, 1));
                      rk.field_O.a((byte) -127, new ml(40, 1033, 510, rk.field_O.h(-83), rk.field_O, 2));
                      rk.field_O.a((byte) -125, new ml(40, 1549, 98, rk.field_O.h(-112), rk.field_O, 3));
                      rk.field_O.a(1, (byte) -87);
                      break L9;
                    }
                  }
                } else {
                  rk.field_O.a(false, -1, false);
                  qn.field_ob.field_G = false;
                  qn.field_ob.field_y = false;
                  rk.field_O.h((byte) 19);
                  rk.field_O.a(0, 0, -1, 54, 20);
                  rk.field_O.b(12, true, 0);
                  rk.field_O.a((byte) -126, new ml(0, 1143, 572, rk.field_O.h(-72), rk.field_O, 0));
                  rk.field_O.a((byte) -119, new ml(40, 373, 532, rk.field_O.h(-75), rk.field_O, 1));
                  rk.field_O.a((byte) -124, new ml(40, 781, 248, rk.field_O.h(-72), rk.field_O, 2));
                  rk.field_O.a((byte) -126, new ml(40, 1349, 244, rk.field_O.h(-124), rk.field_O, 3));
                  rk.field_O.a(1, (byte) 48);
                  break L9;
                }
              }
            } else {
              rk.field_O.a(false, -1, false);
              qn.field_ob.field_G = false;
              qn.field_ob.field_y = false;
              rk.field_O.h((byte) 19);
              rk.field_O.a(0, 0, -1, 86, 14);
              rk.field_O.a((byte) -123, new ml(0, 608, 307, rk.field_O.h(-71), rk.field_O, 0));
              rk.field_O.a((byte) -121, new ml(40, 228, 687, rk.field_O.h(-128), rk.field_O, 1));
              rk.field_O.a((byte) -124, new ml(40, 423, 667, rk.field_O.h(-85), rk.field_O, 2));
              rk.field_O.a((byte) -119, new ml(40, 766, 301, rk.field_O.h(-84), rk.field_O, 3));
              rk.field_O.a(1, (byte) -95);
              break L9;
            }
          }
        }
        L16: {
          ce.field_m.a(true);
          qn.field_ob.field_z = gj.field_a[rk.field_O.field_F];
          if (param0 > 103) {
            break L16;
          } else {
            co.c(-94);
            break L16;
          }
        }
        L17: {
          var6 = rk.field_O.a(0, true);
          if (var6 != null) {
            qn.field_ob.field_m.a(-88, var6);
            qn.field_ob.field_bb = var6.field_T;
            break L17;
          } else {
            qn.field_ob.field_bb = -1;
            break L17;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "MOST RESILIENT - ";
        field_h = new am();
        field_d = "Your account has had its rating reset as we suspect that you have been involved in ratings transfer.<br>If you feel that this is not the case, please post a query by submitting a bug report on the FunOrb main site.<br><br>We will not respond to any other forms of communication on this matter.";
        field_i = "Time left:";
        field_a = new boolean[][]{null, new boolean[10], null};
        field_g = new java.util.zip.CRC32();
    }
}
