/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ak {
    private dk[] field_k;
    private int[] field_a;
    static hf field_d;
    private int[][] field_b;
    private dk[] field_i;
    private dk[] field_j;
    private gj field_g;
    boolean field_h;
    int field_f;
    private int field_e;
    private int field_c;

    private final int[] a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (var5 = param2; param0 > var5; var5++) {
            var7[var5] = param1 + var5;
        }
        return var4;
    }

    private final void l(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -1) {
            this.b(true);
        }
        String var2 = this.j(0);
        ((ak) this).field_g = this.a((byte) -103, var2);
        if (!(null == ((ak) this).field_g)) {
            this.e((byte) -96);
            ((ak) this).field_g.c(2);
        }
        if (!(var2 == null)) {
            var3 = 320;
            var4 = 240;
            var5 = 6340704;
            fh.field_g.c(var2, var3, var4, var5, -1);
        }
    }

    private final void a(boolean param0, byte param1) {
        ol.field_N = null;
        hn.field_n = false;
        pl.field_q.b(param1 + -26357, param0);
        di.field_d = null;
        mj.field_d = 0;
        if (param1 != -123) {
            return;
        }
        gi.a((byte) -71);
    }

    private final int[] a(int[] param0, int param1, int[] param2, int[] param3) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        L0: {
          var9 = EscapeVector.field_A;
          if (param1 == 10) {
            break L0;
          } else {
            this.e((byte) 114);
            break L0;
          }
        }
        var11 = new int[10];
        var10 = var11;
        var5 = var10;
        var6 = 0;
        L1: while (true) {
          if (var6 <= -11) {
            return var5;
          } else {
            var7 = param2[var6];
            if (-1 <= var7) {
              L2: {
                var8 = 0;
                if (0 == var7 / 10) {
                  var7 = var7 % 10;
                  var8 = param3[var7];
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-2 == (var7 / 10 ^ -1)) {
                  var11 = var10;
                  var7 = var7 % 10;
                  var8 = param0[var7];
                  break L3;
                } else {
                  break L3;
                }
              }
              var11 = var10;
              var11[var6] = var8;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    private final boolean f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = this.k(-115);
        if (!(0 <= var2)) {
            return false;
        }
        if (param0 > -103) {
            this.h((byte) -110);
        }
        for (var3 = 0; var3 < fh.field_d.length; var3++) {
            var4 = fh.field_d[var3];
            if (!(var4 != var2)) {
                if (var3 >= ti.field_a.length) {
                    return false;
                }
                var5 = ti.field_a[var3];
                ((ak) this).field_c = var5;
                return true;
            }
        }
        return false;
    }

    final int h(int param0) {
        if (!(((ak) this).field_a != null)) {
            return 0;
        }
        if (param0 < 29) {
            ((ak) this).field_h = false;
        }
        return ((ak) this).field_a.length;
    }

    private final boolean c(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int var2 = this.k(param0 ^ -17654);
        if (param0 != 17592) {
            ((ak) this).field_k = null;
        }
        if (!(-1 >= (var2 ^ -1))) {
            return false;
        }
        for (var3 = 0; v.field_b.length > var3; var3++) {
            var4 = v.field_b[var3];
            if (var4 == var2) {
                if (!(var4 != ((ak) this).field_e)) {
                    return false;
                }
                ol.field_N = null;
                ((ak) this).field_e = var4;
                this.h((byte) -122);
                return true;
            }
        }
        return false;
    }

    private final int b(byte param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int var2 = 0;
        if (param0 > -60) {
            ((ak) this).field_j = null;
        }
        while (var2 < v.field_b.length) {
            var3 = v.field_b[var2];
            if (!(((ak) this).field_e != var3)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 77) {
            field_d = null;
        }
    }

    private final void a(int param0, ij param1, ij param2, int param3, int param4) {
        if (param3 != 6144) {
            return;
        }
        int var6 = jb.a(102, param4);
        int var7 = jb.a(param3 + -6045, param0);
        int[] var21 = this.a(var7, param2, param1, ((ak) this).field_c, -17, ((ak) this).field_c, var6);
        int[] var22 = this.a(param2.field_o[((ak) this).field_c], 10, var21, param1.field_o[((ak) this).field_c]);
        param1.field_o[((ak) this).field_c] = var22;
        String[] var10 = this.a((byte) 56, param2.field_m[((ak) this).field_c], var21, param1.field_m[((ak) this).field_c]);
        param1.field_m[((ak) this).field_c] = var10;
        long[] var23 = this.a(param2.field_k[((ak) this).field_c], param1.field_k[((ak) this).field_c], var21, true);
        param1.field_k[((ak) this).field_c] = var23;
        this.a((byte) 69, param4, var21, param0);
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        if (((ak) this).field_b == null) {
            return;
        }
        for (var2 = param0; ((ak) this).field_b.length > var2; var2++) {
            ((ak) this).field_b[var2] = null;
        }
    }

    private final int[] d(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (var5 = param2; var5 < var7.length; var5++) {
            var7[var5] = param1;
        }
        return var4;
    }

    private final int d(int param0) {
        int var2 = 0;
        dk var3 = null;
        Object var4 = null;
        L0: {
          var2 = 115;
          if (null == ((ak) this).field_k) {
            break L0;
          } else {
            if (((ak) this).field_k.length != 0) {
              var3 = ((ak) this).field_k[0];
              if (var3 == null) {
                return var2;
              } else {
                L1: {
                  var2 = 3 + var3.field_l - -var3.field_i;
                  if (param0 > 29) {
                    break L1;
                  } else {
                    var4 = null;
                    String[] discarded$2 = this.a((byte) -18, (String[]) null, (int[]) null, (String[]) null);
                    break L1;
                  }
                }
                return var2;
              }
            } else {
              break L0;
            }
          }
        }
        return var2;
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          if (0 > ((ak) this).field_c) {
            break L0;
          } else {
            if (ti.field_a.length > ((ak) this).field_c) {
              var3 = -38 / ((29 - param0) / 43);
              var2 = 0;
              L1: while (true) {
                if (var2 >= ti.field_a.length) {
                  return -1;
                } else {
                  if (((ak) this).field_c == ti.field_a[var2]) {
                    if (fh.field_d.length >= var2) {
                      var4 = fh.field_d[var2];
                      return var4;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final void a(boolean param0) {
        em.d();
        od.b(2);
        this.l(-1);
        pb.a(4);
        if (param0) {
            return;
        }
        this.b(true);
    }

    private final void i(byte param0) {
        int var3 = 0;
        int[] var4 = null;
        if (param0 >= -52) {
            return;
        }
        ij[] var5 = ol.field_N;
        ij[] var2 = var5;
        if (var2 != null) {
            if (!(-1 != (var5.length ^ -1))) {
                return;
            }
            var3 = this.b((byte) -92);
            var4 = vn.field_a[var3];
            if (1 == var5.length) {
                ((ak) this).field_b[((ak) this).field_c] = this.d(10, var4[0], 0);
                return;
            }
            this.a(var4[1], var5[0], var5[1], 6144, var4[0]);
            return;
        }
    }

    private final int k(int param0) {
        int var2 = di.field_d.field_h;
        if (var2 >= 0) {
            // if_icmpge L23
        } else {
            return -1;
        }
        if (param0 > -77) {
            return 85;
        }
        int var3 = ((ak) this).field_a[var2];
        return var3;
    }

    private final boolean e(int param0) {
        int var4 = 0;
        ij var5 = null;
        int var6 = EscapeVector.field_A;
        ij[] var7 = ol.field_N;
        ij[] var2 = var7;
        if (var2 != null) {
            // ifeq L26
        } else {
            return false;
        }
        ij[] var3 = var7;
        for (var4 = param0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(var5 != null)) {
                return false;
            }
            if (!var5.field_l) {
                return false;
            }
        }
        return true;
    }

    private final long[] a(long[] param0, long[] param1, int[] param2, boolean param3) {
        long[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        int var10 = 0;
        long[] var11 = null;
        long[] var12 = null;
        var10 = EscapeVector.field_A;
        var12 = new long[10];
        var11 = var12;
        var5 = var11;
        var6 = 0;
        L0: while (true) {
          if (-11 >= (var6 ^ -1)) {
            L1: {
              if (param3) {
                break L1;
              } else {
                ((ak) this).field_f = -56;
                break L1;
              }
            }
            return var5;
          } else {
            var7 = param2[var6];
            if (var7 >= 0) {
              L2: {
                var8 = 0L;
                if (var7 / 10 != 0) {
                  break L2;
                } else {
                  var7 = var7 % 10;
                  var8 = param1[var7];
                  break L2;
                }
              }
              L3: {
                if (var7 / 10 != 1) {
                  break L3;
                } else {
                  var7 = var7 % 10;
                  var8 = param0[var7];
                  break L3;
                }
              }
              var12[var6] = var8;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    private final gj a(byte param0, String param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var3 = this.d(77);
          if (aj.b(-123)) {
            stackOut_2_0 = hg.field_a;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = tj.field_G;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (aj.b(-104)) {
            stackOut_5_0 = 10551200;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 6340704;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_6_0;
          if (param1 != wk.field_f) {
            break L2;
          } else {
            L3: {
              if (((ak) this).field_g == null) {
                break L3;
              } else {
                if (((ak) this).field_g.field_o == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            ((ak) this).field_g = new gj(((ak) this).field_e, var3, ((ak) this).field_h);
            ((ak) this).field_g.a(3, var4, var5);
            break L2;
          }
        }
        L4: {
          if (param1 != le.field_b) {
            break L4;
          } else {
            L5: {
              if (null == ((ak) this).field_g) {
                break L5;
              } else {
                if (((ak) this).field_g.field_o == 0) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            ((ak) this).field_g = new gj(((ak) this).field_e, var3, ((ak) this).field_h);
            ((ak) this).field_g.a(3, var4, var5);
            break L4;
          }
        }
        L6: {
          if (param0 <= -66) {
            break L6;
          } else {
            ((ak) this).field_b = null;
            break L6;
          }
        }
        L7: {
          if (bd.field_m == param1) {
            L8: {
              if (((ak) this).field_g == null) {
                break L8;
              } else {
                if (0 == ((ak) this).field_g.field_o) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            ((ak) this).field_g = new gj(((ak) this).field_e, var3, ((ak) this).field_h);
            ((ak) this).field_g.a(3, var4, var5);
            break L7;
          } else {
            break L7;
          }
        }
        L9: {
          if (param1 != null) {
            break L9;
          } else {
            L10: {
              if (((ak) this).field_g == null) {
                break L10;
              } else {
                if ((((ak) this).field_g.field_o ^ -1) != -2) {
                  break L10;
                } else {
                  if (((ak) this).field_c != ((ak) this).field_g.field_p) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
            }
            this.a(var5, var3, var4, (byte) -10);
            break L9;
          }
        }
        return ((ak) this).field_g;
    }

    private final void c(boolean param0) {
        dk var2 = null;
        int var3 = 0;
        if (!(!di.field_d.field_e)) {
            var2 = this.j((byte) 82);
            var3 = nk.a(-122, var2);
            rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, var3);
        }
        if (param0) {
            String discarded$0 = this.g((byte) 4);
        }
    }

    private final String a(int param0) {
        String var2 = null;
        String var3 = null;
        ij[] var4 = null;
        ij[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ij var8 = null;
        String[][] var9 = null;
        String[] var10 = null;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        L0: {
          var13 = EscapeVector.field_A;
          var2 = wk.field_f;
          var3 = bd.field_m;
          var4 = ol.field_N;
          if (var4 == null) {
            break L0;
          } else {
            if (-1 == (var4.length ^ -1)) {
              break L0;
            } else {
              var5 = var4;
              var6 = 0;
              var7 = 80 / ((param0 - -34) / 35);
              L1: while (true) {
                if (var6 >= var5.length) {
                  return var2;
                } else {
                  var8 = var5[var6];
                  if (var8 != null) {
                    var9 = var8.field_m;
                    if (var9 != null) {
                      L2: {
                        if (-1 < (((ak) this).field_c ^ -1)) {
                          break L2;
                        } else {
                          if (((ak) this).field_c >= var9.length) {
                            break L2;
                          } else {
                            if (var9[((ak) this).field_c] != null) {
                              var10 = var9[((ak) this).field_c];
                              var11 = 0;
                              L3: while (true) {
                                if (var11 >= var10.length) {
                                  var6++;
                                  continue L1;
                                } else {
                                  var12 = var10[var11];
                                  if (var12 != null) {
                                    var2 = null;
                                    var11++;
                                    continue L3;
                                  } else {
                                    var11++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return var3;
                            }
                          }
                        }
                      }
                      return var3;
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    private final dk j(byte param0) {
        int var2 = di.field_d.field_h;
        dk var3 = m.a(((ak) this).field_k, var2, 0);
        if (!(var3 == null)) {
            return var3;
        }
        if (param0 <= 65) {
            boolean discarded$0 = this.c(-122);
        }
        var3 = m.a(((ak) this).field_i, var2, 0);
        if (var3 != null) {
            return var3;
        }
        var3 = m.a(((ak) this).field_j, var2, 0);
        if (var3 == null) {
            return null;
        }
        return var3;
    }

    private final int[] a(int param0, ij param1, ij param2, int param3, int param4, int param5, int param6) {
        int var14 = 0;
        int var15 = EscapeVector.field_A;
        int var10 = -77 / ((param4 - 78) / 43);
        int[] var21 = ua.a(param6, true, param5, param2);
        int[] var17 = var21;
        int[] var8 = var17;
        int[] var22 = ua.a(param0, true, param3, param1);
        int[] var18 = var22;
        int[] var9 = var18;
        int var11 = var21.length + var22.length;
        int[] var24 = new int[var11];
        int[] var20 = var24;
        int[] var12 = var20;
        qg.a(var8, 0, var12, 0, var21.length);
        qg.a(var9, 0, var12, var21.length, var22.length);
        int[] var23 = new int[var11];
        for (var14 = 0; var14 < var23.length; var14++) {
            var23[var14] = var14;
        }
        uk.a(-1, var24, var23);
        int[] var16 = this.a(var23, 12);
        return var16;
    }

    private final int[] a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        int[] var9 = new int[param2];
        int[] var5 = var9;
        int var6 = 40 % ((11 - param1) / 39);
        for (var7 = 0; var7 < param2; var7++) {
            var9[var7] = param3 - -(var7 * param0);
        }
        return var5;
    }

    private final void b(int param0) {
        if (-1 == (mj.field_d ^ -1)) {
            sj.a(8192, (byte) 51);
        }
        de.field_j = true;
        if (param0 != 100) {
            ((ak) this).field_j = null;
        }
        if (aj.b(-122)) {
            if (!(-1 != (mj.field_d ^ -1))) {
                rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
            }
            // if_icmpne L258
            rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
        } else {
            if (mj.field_d == 0) {
                rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 5120);
            }
            if (!(10 != mj.field_d)) {
                rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
            }
            if (mj.field_d == 20) {
                rk.field_e.a(pc.field_a, 100, 6144 * qm.field_c / 64, 11264);
            }
            if (30 == mj.field_d) {
                rk.field_e.a(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
            }
        }
        if (-1001 < (mj.field_d ^ -1)) {
            mj.field_d = mj.field_d + 1;
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = sm.a(param2, -121, ((ak) this).field_k, param0);
        if (!(0 > var4)) {
            return var4;
        }
        var4 = sm.a(param2, -94, ((ak) this).field_i, param0);
        if (!(0 > var4)) {
            return var4;
        }
        var4 = sm.a(param2, param1 ^ 108, ((ak) this).field_j, param0);
        if (!(param1 < (var4 ^ -1))) {
            return var4;
        }
        return -1;
    }

    final boolean f(int param0) {
        int var2 = -60 / ((param0 - -22) / 35);
        int var3 = 0;
        this.b(100);
        var3 = this.a((byte) 3) ? 1 : 0;
        if (var3 != 0) {
            return var3 != 0;
        }
        di.field_d.a(((ak) this).c(sf.field_c, -1, ng.field_ob), (byte) 120, ((ak) this).c(dh.field_d, -1, bj.field_y));
        this.c(false);
        var3 = this.a(true, s.a((byte) 15, -1), (byte) 79) ? 1 : 0;
        return var3 != 0;
    }

    private final int[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ih param7, int param8) {
        if (param5 >= -27) {
            String discarded$0 = this.g((byte) 98);
        }
        int[] var16 = new int[]{0};
        int[] var10 = var16;
        String[] var11 = new String[]{ag.field_a};
        int var12 = var16.length;
        int[] var20 = this.b(var12, param3, 10);
        int[] var22 = this.a(param0, -47, var12, param4);
        int[] var21 = this.a(var12, param1, 0);
        ((ak) this).field_j = na.a(param2 + (-param8 - -1), var20, param6, param8, param7, var11, var21, false, var22);
        return var10;
    }

    private final void g(int param0) {
        if (param0 != -1) {
            return;
        }
        if (!aj.b(-119)) {
            return;
        }
        pa.a(true);
        mj.field_d = 0;
        gi.a((byte) -94);
    }

    private final void h(byte param0) {
        ih var18 = fh.field_g;
        int var3 = 640;
        int var4 = 0;
        int var5 = 10;
        int var6 = 10;
        int var7 = 1;
        int var8 = 78;
        int var9 = var8;
        int[] var10 = this.a(var7, 0, var9, 0, var5, var6, var18, var3 + -1, var4);
        dk var19 = ((ak) this).field_k[0];
        var9 = var9 + (var19.field_i - -3);
        ((ak) this).field_g = new gj(((ak) this).field_e, var9, ((ak) this).field_h);
        int var12 = (var3 - ((ak) this).field_g.field_m) / 2;
        var9 = var9 + (3 + ((ak) this).field_g.field_c);
        int var13 = var12 + ((ak) this).field_g.field_m;
        int[] var28 = this.a(var7, var12, var8, 0, var5, var6, var18, var13, var4);
        var5 = var5 + var28.length;
        var4 = var4 + var28.length;
        int[] var29 = this.a(var18, var6, var5, var13, var12, 98, var4, var7, var9);
        var5 = var5 + var29.length;
        var4 = var4 + var29.length;
        dk var21 = ((ak) this).field_i[0];
        var9 = var9 + (var21.field_i - -20);
        int[] var30 = this.a(var6, var7, var3 + -1, var4, var5, -28, var9, var18, 0);
        int var16 = var28.length - (-var29.length - var30.length);
        var4 = 0;
        ((ak) this).field_a = new int[var16];
        var4 = qe.a(((ak) this).field_a, var4, true, var28);
        var4 = qe.a(((ak) this).field_a, var4, true, var29);
        int discarded$7 = qe.a(((ak) this).field_a, var4, true, var30);
        gn.a(((ak) this).field_k, true, (byte) 41);
        if (param0 > -120) {
            ((ak) this).field_a = null;
        }
        gn.a(((ak) this).field_i, !aj.b(-102) ? true : false, (byte) 41);
        gn.a(((ak) this).field_j, false, (byte) 41);
        ((ak) this).field_g = null;
    }

    private final int[] a(int[] param0, int param1) {
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param0.length];
        int[] var3 = var7;
        int var4 = -1 + param0.length;
        int var5 = 0;
        while (-1 >= (var4 ^ -1)) {
            var5++;
            var7[var5] = param0[var4];
            var4--;
        }
        if (param1 != 12) {
            this.b(-32);
        }
        return var3;
    }

    private final void a(byte param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        ((ak) this).field_b[((ak) this).field_c] = new int[10];
        var5 = 0;
        L0: while (true) {
          if (var5 >= 10) {
            var5 = -68 % ((-21 - param0) / 61);
            return;
          } else {
            var6 = param2[var5];
            if (var6 >= 0) {
              L1: {
                var7 = 0;
                if (var6 / 10 != 0) {
                  break L1;
                } else {
                  var7 = param1;
                  break L1;
                }
              }
              L2: {
                if (1 != var6 / 10) {
                  break L2;
                } else {
                  var7 = param3;
                  break L2;
                }
              }
              ((ak) this).field_b[((ak) this).field_c][var5] = var7;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var4 = EscapeVector.field_A;
          if (param0 == 3) {
            break L0;
          } else {
            var5 = null;
            this.a(-127, 66, (String) null, (byte) -74);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (!pn.p(-110)) {
            return var2 != 0;
          } else {
            L2: {
              di.field_d.a(127);
              qk.a(((ak) this).field_a, param0 ^ 3);
              if (-14 == (nk.field_n ^ -1)) {
                var3 = ((ak) this).a(1, 0);
                di.field_d.a(false, var3);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.a(false, s.a((byte) 15, nk.field_n), (byte) 96)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var2 = stackIn_10_0;
            if (var2 != 0) {
              return var2 != 0;
            } else {
              continue L1;
            }
          }
        }
    }

    private final int[] a(int param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8) {
        String[] var11 = null;
        int[] var10 = null;
        String[] var12 = mg.field_h;
        if (bj.e((byte) 103)) {
            var10 = v.field_b;
            var11 = var12;
        } else {
            var10 = new int[]{5};
            var11 = new String[]{var12[0]};
        }
        int var13 = var10.length;
        int[] var20 = this.b(var13, param8, 10);
        int[] var22 = this.a(param5, param3 ^ 115, var13, param4);
        int[] var21 = this.a(var13, param0, param3 ^ param3);
        ((ak) this).field_k = na.a(param7 + (-param1 + 1), var20, param2, param1, param6, var11, var21, false, var22);
        return var10;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        if (param0 != 1) {
            Object var5 = null;
            int[] discarded$0 = this.a((int[]) null, -63, (int[]) null, (int[]) null);
        }
        for (var3 = 0; ((ak) this).field_a.length > var3; var3++) {
            if (!(((ak) this).field_a[var3] != param1)) {
                return var3;
            }
        }
        return -1;
    }

    private final String g(byte param0) {
        String var2 = null;
        ij[] var3 = null;
        ij[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ij var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        L0: {
          var9 = EscapeVector.field_A;
          var2 = bd.field_m;
          var3 = ol.field_N;
          if (var3 == null) {
            break L0;
          } else {
            if (-1 == (var3.length ^ -1)) {
              break L0;
            } else {
              var4 = var3;
              var5 = 73 / ((-1 - param0) / 44);
              var6 = 0;
              L1: while (true) {
                if (var4.length > var6) {
                  var7 = var4[var6];
                  if (var7 != null) {
                    var11 = var7.field_o;
                    var10 = var11;
                    var8 = var10;
                    if (var8 != null) {
                      L2: {
                        if (-1 < (((ak) this).field_c ^ -1)) {
                          break L2;
                        } else {
                          if (((ak) this).field_c < var11.length) {
                            if (null == var8[((ak) this).field_c]) {
                              return var2;
                            } else {
                              var6++;
                              continue L1;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return var2;
                    } else {
                      return var2;
                    }
                  } else {
                    return var2;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        ij var6 = null;
        ik var7 = null;
        if (!(null != ((ak) this).field_b[((ak) this).field_c])) {
            this.i((byte) -107);
        }
        ij[] var8 = ol.field_N;
        ij[] var5 = var8;
        if (var5 != null) {
            if (!(-1 != (var8.length ^ -1))) {
                return;
            }
            var6 = var8[0];
            if (!(var6 != null)) {
                return;
            }
            var7 = de.field_i;
            if (param3 != -10) {
                return;
            }
            ((ak) this).field_g = new gj(var6, ((ak) this).field_b[((ak) this).field_c], var7, ((ak) this).field_c, ((ak) this).field_e, param1, ((ak) this).field_h);
            ((ak) this).field_g.a(3, param2, param0);
            return;
        }
    }

    private final String[] a(byte param0, String[] param1, int[] param2, String[] param3) {
        int var6 = 0;
        int var7 = 0;
        String var8_ref = null;
        int var9 = EscapeVector.field_A;
        String[] var10 = new String[10];
        String[] var5 = var10;
        for (var6 = 0; var6 < 10; var6++) {
            var7 = param2[var6];
            String var8 = "";
            if (var7 / 10 == 0) {
                var7 = var7 % 10;
                var8_ref = param3[var7];
            }
            if (!(1 != var7 / 10)) {
                var10 = var5;
                var7 = var7 % 10;
                var8_ref = param1[var7];
            }
            var10 = var5;
            var10[var6] = var8_ref;
        }
        if (param0 != 56) {
            ((ak) this).field_b = null;
        }
        return var5;
    }

    private final int[] a(ih param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int[] var10 = null;
        String[] var11 = null;
        if (aj.b(-99)) {
            var11 = new String[]{cn.field_e};
            var10 = new int[]{1};
        } else {
            var10 = new int[]{2, 3, 4};
            var11 = ge.field_d;
        }
        int var12 = var10.length;
        int var13 = -114 / ((-5 - param5) / 34);
        int[] var20 = this.b(var12, param6, 10);
        int[] var22 = this.a(param1, -47, var12, param2);
        int[] var21 = this.a(var12, param7, 0);
        ((ak) this).field_i = na.a(1 + (-param4 + param3), var20, param8, param4, param0, var11, var21, false, var22);
        return var10;
    }

    private final void e(byte param0) {
        dk var15 = null;
        int var8 = 0;
        dk var16 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var2 = 20;
        int var3 = 12;
        int var4 = 12;
        int var5 = ((ak) this).field_g.field_t + -var2;
        int var6 = ((ak) this).field_g.field_m + var5 + 2 * var2;
        Object var7 = null;
        if (((ak) this).field_k != null) {
            if (-2 >= (((ak) this).field_k.length ^ -1)) {
                // if_acmpeq L73
            } else {
                return;
            }
            var15 = ((ak) this).field_k[0];
            if (param0 >= -81) {
                ((ak) this).field_c = -52;
            }
            var8 = -var3 + var15.field_l;
            if (((ak) this).field_i != null) {
                if (((ak) this).field_i.length >= 1) {
                    // ifnull L138
                } else {
                    return;
                }
                var16 = ((ak) this).field_i[0];
                var9 = var16.field_l + var16.field_i - -var4;
                var10 = mj.field_d;
                var11 = -41 >= (var10 ^ -1) ? 0 : 40 - var10;
                var12 = 0;
                var13 = 3162160;
                var14 = 6324320;
                fc.a(var11, var5, var6, var9, true, 29788, false, var14, var13, var12, var8, true);
                return;
            }
        }
    }

    private final void a(boolean param0, int param1) {
        ((ak) this).field_e = 5;
        if (hi.a(param1, -2)) {
            ((ak) this).field_e = 5;
        }
        if (!bj.e((byte) 98)) {
            return;
        }
        if ((param1 ^ -1) == -3) {
            ((ak) this).field_e = 6;
        }
        if (!param0) {
            ((ak) this).field_i = null;
        }
        if (!(3 != param1)) {
            ((ak) this).field_e = 7;
        }
    }

    private final int[] b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var8 = new int[param0];
        int[] var4 = var8;
        for (var5 = 0; var5 < param0; var5++) {
            var8[var5] = var5 + param1;
        }
        if (param2 != 10) {
            Object var7 = null;
            int[] discarded$0 = this.a(-63, -54, -8, -112, -7, -16, (ih) null, -12, -123);
        }
        return var4;
    }

    private final boolean a(boolean param0, boolean param1, byte param2) {
        int var6 = 0;
        int var4 = 0;
        if (!(!param1)) {
            if (!(!this.f((byte) -123))) {
                return var4 != 0;
            }
            if (!(!this.c(17592))) {
                return var4 != 0;
            }
            var6 = this.k(-124);
            if (var6 == 0) {
                var4 = 1;
                this.a(param0, (byte) -123);
                return var4 != 0;
            }
            if (!((var6 ^ -1) != -2)) {
                this.g(-1);
                var4 = 1;
                return var4 != 0;
            }
        }
        if (param2 < 77) {
            this.a(true, 117);
        }
        return var4 != 0;
    }

    private final void d(byte param0) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int var2 = this.b((byte) -89);
        if (!(-1 >= (var2 ^ -1))) {
            return;
        }
        if (!(var2 < vn.field_a.length)) {
            return;
        }
        int[] var3 = vn.field_a[var2];
        ij[] var4 = new ij[var3.length];
        for (var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = bk.a(var3[var5], true, 10, 3, 1);
            this.m(0);
        }
        ol.field_N = var4;
        if (param0 >= -74) {
            ((ak) this).field_i = null;
        }
    }

    private final void b(boolean param0) {
        int var2 = ((ak) this).a(1, ((ak) this).field_e);
        if (!param0) {
            ((ak) this).field_b = null;
        }
        int var3 = this.i(-74);
        int var4 = ((ak) this).a(1, var3);
        int var5 = di.field_d.field_h;
        rb.a(((ak) this).field_k, var2, var5, (byte) -55);
        rb.a(((ak) this).field_i, var4, var5, (byte) -114);
        rb.a(((ak) this).field_j, -1, var5, (byte) -97);
    }

    private final String j(int param0) {
        String var2 = wk.field_f;
        ij[] var3 = ol.field_N;
        if (!(!aj.b(-123))) {
            return var2;
        }
        if (!(var3 != null)) {
            this.d((byte) -83);
            ((ak) this).field_g = null;
            return var2;
        }
        if (!this.e(param0)) {
            var2 = le.field_b;
            return var2;
        }
        var2 = this.a(48);
        if (var2 != null) {
            return var2;
        }
        var2 = this.g((byte) 86);
        return var2;
    }

    ak(boolean param0, int param1) {
        ((ak) this).field_b = new int[ti.field_a.length][];
        ((ak) this).field_h = param0 ? true : false;
        ((ak) this).field_c = 0;
        this.a(true, param1);
        ((ak) this).field_f = vh.f(121);
        this.h((byte) -126);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hf();
    }
}
