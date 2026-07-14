/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve {
    rj[] field_c;
    static dg field_e;
    static String[] field_b;
    static boolean field_a;
    static int field_d;

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
            field_d = -91;
        }
    }

    final int a(int param0, boolean param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Lexicominos.field_L ? 1 : 0;
        var5 = 0;
        var6 = param1 ? 1 : 0;
        var7 = param3.length();
        var8 = 0;
        L0: while (true) {
          if (var7 <= var8) {
            if (-1 <= (var5 ^ -1)) {
              return 0;
            } else {
              return (-param2 + param0 << -796485304) / var5;
            }
          } else {
            var9 = param3.charAt(var8);
            if (var9 != 60) {
              if (62 != var9) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            } else {
              var6 = 1;
              var8++;
              continue L0;
            }
          }
        }
    }

    final static int a(String param0, byte param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            CharSequence var11 = null;
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Lexicominos.field_L ? 1 : 0;
                        if (null != jc.field_b) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!dg.a(param3, true)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (uf.field_m == ae.field_E) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (param3) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        fa.field_b = fj.a(param0, param4, false, param1 ^ 118);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        fa.field_b = ef.a(rc.field_f, param1 ^ 27988, (String) null, false, param0);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ed.field_q.field_h = 0;
                        ed.field_q.c(14, param1 + 24);
                        ed.field_q.c(fa.field_b.a((byte) 45).field_b, -1);
                        kc.a(-1, -1);
                        uf.field_m = rb.field_d;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (uf.field_m == rb.field_d) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (!a.b(1, 10343)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var6 = ig.field_a.d(true);
                        ig.field_a.field_h = 0;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        pg.field_d = var6;
                        a.field_c = -1;
                        uf.field_m = uh.field_l;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        uf.field_m = kf.field_z;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (param1 == -25) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        return 43;
                    }
                    case 18: {
                        if (kf.field_z != uf.field_m) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (!a.b(8, 10343)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        ti.field_M = ig.field_a.f((byte) 49);
                        ig.field_a.field_h = 0;
                        ri.a(param2, param3, fa.field_b, (byte) -82, param5);
                        uf.field_m = he.field_h;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (uf.field_m != he.field_h) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (!a.b(1, 10343)) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var6 = ig.field_a.d(true);
                        ig.field_a.field_h = 0;
                        pg.field_d = var6;
                        og.field_b = null;
                        if (0 == var6) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (-2 == (var6 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (8 != var6) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        ck.b((byte) -30);
                        fb.field_p = false;
                        return var6;
                    }
                    case 27: {
                        a.field_c = -1;
                        uf.field_m = uh.field_l;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        a.field_c = -1;
                        uf.field_m = ug.field_q;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (uf.field_m == ug.field_q) {
                            statePc = 31;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (!dc.d(param1 ^ -27)) {
                            statePc = 69;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        rc.field_f = ig.field_a.f((byte) -110);
                        vb.field_i = ig.field_a.d(true);
                        int discarded$12 = ig.field_a.d(true);
                        jd.field_c = ig.field_a.b(param1 + -1698573631);
                        var6_ref = ig.field_a.e((byte) -90);
                        var7 = ig.field_a.d(true);
                        if ((1 & var7) != -1) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        fg.a((byte) 120);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (param3) {
                            statePc = 43;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (-1 == (var7 & 4)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        jl.field_c = stackIn_39_0 != 0;
                        if ((8 & var7) == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        ul.field_k = stackIn_42_0 != 0;
                        if (ul.field_k) {
                            statePc = 43;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (!qb.field_c) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        int discarded$13 = ig.field_a.d(true);
                        int discarded$14 = ig.field_a.d(true);
                        int discarded$15 = ig.field_a.d((byte) 19);
                        ef.field_f = ig.field_a.b(-1698573656);
                        kc.field_d = new byte[ef.field_f];
                        var8 = 0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (ef.field_f <= var8) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        kc.field_d[var8] = ig.field_a.e(true);
                        var8++;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 47: {
                        og.field_c = ig.field_a.c(false);
                        var11 = (CharSequence) (Object) og.field_c;
                        cb.field_t = ck.a(var11, (byte) -48);
                        be.field_l = ig.field_a.d(true);
                        uf.field_m = gg.field_b;
                        if (fa.field_b.a((byte) 45) == jf.field_M) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        if (fa.field_b.a((byte) 45) != ej.field_a) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        mh.field_B.a(kk.c(-14047), 4096);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        bb.field_J.a(kk.c(-14047), 4096);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        fb.field_p = false;
                        if (var6_ref != null) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        ee.a(var6_ref, -11971, kk.c(-14047));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (0 < jd.field_c) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (jl.field_c) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        try {
                            Object discarded$16 = oa.a(true, kk.c(-14047), "unzap");
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 59;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        var8_ref_Throwable = caughtException;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 60: {
                        try {
                            Object discarded$17 = oa.a(kk.c(-14047), 22347, "zap", new Object[1]);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var8_ref_Throwable = caughtException;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (jd.field_c <= 0) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        hl.field_F = true;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        ed.field_q.a(l.field_F, param1 ^ -48);
                        var8 = 0;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (-5 >= (var8 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        l.field_F[var8] = l.field_F[var8] + 50;
                        var8++;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 68: {
                        ig.field_a.a(l.field_F, 16);
                        return pg.field_d;
                    }
                    case 69: {
                        if (uf.field_m != uh.field_l) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        if (dc.d(param1 + 27)) {
                            statePc = 72;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        ck.b((byte) -96);
                        if (7 != pg.field_d) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (!fb.field_p) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        if (pg.field_d == 7) {
                            statePc = 77;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        pg.field_d = 3;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        wj.field_p = ig.field_a.c(false);
                        fb.field_p = false;
                        return pg.field_d;
                    }
                    case 79: {
                        fb.field_p = true;
                        return -1;
                    }
                    case 80: {
                        if (jc.field_b != null) {
                            statePc = 87;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (!fb.field_p) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        if (-30001L <= (vl.b(-92) ^ -1L)) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        wj.field_p = nk.field_t;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 84: {
                        wj.field_p = sa.field_h;
                        statePc = 85;
                        continue stateLoop;
                    }
                    case 85: {
                        fb.field_p = false;
                        return 3;
                    }
                    case 86: {
                        var6 = nj.field_a;
                        nj.field_a = mg.field_y;
                        fb.field_p = true;
                        mg.field_y = var6;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 87: {
                        return -1;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        rj[] var3 = null;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          var2 = -1;
          if (((ve) this).field_c != null) {
            var3 = ((ve) this).field_c;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) 103);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 94) {
            break L2;
          } else {
            ve.a(true);
            break L2;
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (null == ((ve) this).field_c) {
            break L0;
          } else {
            if (((ve) this).field_c.length == 0) {
              break L0;
            } else {
              if (param2 >= ((ve) this).field_c[0].field_d) {
                L1: {
                  if (param1 <= -97) {
                    break L1;
                  } else {
                    int discarded$2 = ((ve) this).a((byte) -5, -94);
                    break L1;
                  }
                }
                if (((ve) this).field_c[((ve) this).field_c.length - 1].field_c >= param2) {
                  if (-2 != (((ve) this).field_c.length ^ -1)) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (((ve) this).field_c.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((ve) this).field_c[var5];
                          if (var6.field_d > param2) {
                            break L3;
                          } else {
                            if (param2 <= var6.field_c) {
                              var7 = var6.a(param0, (byte) -100);
                              if (0 != (var7 ^ -1)) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_a.length);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((ve) this).field_c[0].a(param0, (byte) -100);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (((ve) this).field_c == null) {
                break L1;
              } else {
                if (((ve) this).field_c.length <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = -((ve) this).field_c[0].field_d + ((ve) this).field_c[-1 + ((ve) this).field_c.length].field_c;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return 36;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        rj var4 = null;
        int var5 = Lexicominos.field_L ? 1 : 0;
        for (var3 = 0; var3 < ((ve) this).field_c.length; var3++) {
            var4 = ((ve) this).field_c[var3];
            if (var4.field_a.length > param1) {
                return var3;
            }
            param1 = param1 - (var4.field_a.length + -1);
        }
        if (param0 != 28276) {
            int discarded$0 = ((ve) this).a(73, (byte) 15, -124);
        }
        return ((ve) this).field_c.length;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        rj var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        rj[] var7 = ((ve) this).field_c;
        rj[] var3 = var7;
        if (param0 > -108) {
            return 107;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_a.length > param1) {
                return var5.field_a[param1];
            }
            param1 = param1 - (var5.field_a.length + -1);
        }
        return 0;
    }

    final static String b(int param0) {
        if (!(bk.field_c != ca.field_i)) {
            return Lexicominos.field_H;
        }
        if (!qa.field_c.b(param0 ^ 25590)) {
            return qa.field_c.a(false);
        }
        if (param0 != 25594) {
            return null;
        }
        if (!(ca.field_i != ee.field_c)) {
            return qa.field_c.a(false);
        }
        return dd.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new dg();
        field_b = new String[]{"The dictionaries used by Lexicominos have been compiled with reference to multiple independent sources.", "Certain words, which may offend some players, have been omitted, as have all words shorter than 3 letters or longer than 8."};
        field_a = true;
    }
}
