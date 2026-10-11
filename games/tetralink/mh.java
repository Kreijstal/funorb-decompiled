/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static float field_c;
    static String field_f;
    static int field_a;
    static int field_b;
    static String field_e;
    static int field_g;
    static int field_d;

    public static void a(int param0) {
        if (param0 > -56) {
          mh.a(-37);
        }
        field_e = null;
        field_f = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TetraLink.field_J;
        try {
          if (param2 != 0) {
            mh.a(121, -17, 103, -39);
          }
          while (true) {
            param3--;
            if (0 > param3) {
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param1;
            var9[var6] = var7 + (pl.a(var9[var6], 16711422) >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("mh.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, int param4) {
        hl stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_36_0 = 0;
        hl stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        boolean stackIn_159_2 = false;
        hl stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        boolean stackIn_164_2 = false;
        hl stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        boolean stackIn_169_2 = false;
        RuntimeException decompiledCaughtException = null;
        hl var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        hl var6 = null;
        hl var7 = null;
        hl var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        je var17 = null;
        Object var18 = null;
        gd var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var22 = null;
        String var24 = null;
        int var11_intLifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1Lifetime1;
        var18 = null;
        var19 = TetraLink.field_J;
        try {
          nb.a(am.field_f, (byte) 37);
          if (null != qb.field_N) {
            boolean decompiledFrameRemainder0 = true;
            qi.field_n.field_S = true;
            nm.field_n.field_R = 0;
            var5 = nm.field_n;
            var5.field_Hb = 0;
            var6 = rn.field_c;
            rn.field_c.field_R = 0;
            var6.field_Hb = 0;
            tn.field_a.field_R = 0;
            var7 = tn.field_a;
            var7.field_Hb = 0;
            if (s.b(63)) {
              ua.field_d.field_jb = jn.field_d.toUpperCase();
              var9 = (2 + fk.field_V.field_Hb) / 2;
              nm.field_n.a((byte) -94, var9 - 2, -40 + fk.field_V.field_R, 40, 0);
              if (qb.field_N.field_jc < qb.field_N.field_rc) {
                nm.field_n.field_jb = ok.field_c.toUpperCase();
                nm.field_n.field_S = true;
              } else {
                nm.field_n.field_jb = cb.field_s.toUpperCase();
                nm.field_n.field_S = false;
              }
              nm.field_n.field_Eb = rj.field_l.field_Eb;
              if (ja.field_g > 0) {
                if (ja.field_g != 1) {
                  var10_ref_String = sk.a(new String[]{Integer.toString(ja.field_g)}, field_e, 121);
                } else {
                  var10_ref_String = ca.field_d;
                }
                if ((16 & cb.field_u) == 0 &&
                  !lg.field_S) {
                  nm.field_n.field_Eb = rj.field_l.field_kb;
                }
                nm.field_n.field_jb = nm.field_n.field_jb + "<br>" + var10_ref_String;
              }
              rn.field_c.a((byte) -122, -var9 + fk.field_V.field_Hb, fk.field_V.field_R - 40, 40, var9);
              rn.field_c.field_jb = lk.field_pb.toUpperCase();
              var8 = rn.field_c;
              stackIn_19_0 = rn.field_c;
              stackIn_20_1 = (param0) && (un.field_f == 0L);
              stackIn_19_0.field_S = stackIn_20_1;
              var10 = 2;
              if (null != uj.field_s) {
                if (null == eg.field_K) {
                  eg.field_K = new byte[hg.field_k];
                  rh.field_G = new boolean[hg.field_k];
                }
                for (var11_int = 0; var11_int < hg.field_k; var11_int++) {
                  rh.field_G[var11_int] = false;
                }
                var10 = 0;
                L11: while (true) {
                  if (var10 < 2) {
                    var11_intLifetime2 = 0;
                    var12 = 0;
                    while (true) {
                      if (uj.field_s.length <= var12) {
                        if (var11_intLifetime2 != 0) {
                          break L11;
                        }
                        var10++;
                        continue L11;
                      }
                      var22 = uj.field_s[var12];
                      var20 = var22;
                      var13 = var20;
                      var14_int = 0;
                      L15: while (true) {
                        if (var14_int >= var22.length) {
                          var11_intLifetime2 = 1;
                          var14_int = -1;
                          for (var15 = 0; var22.length > var15; var15 += 2) {
                            var16 = var22[var15];
                            if (var14_int < var16) {
                              var14_int = var16;
                            }
                          }
                          rh.field_G[var14_int] = true;
                        } else {
                          var15 = var22[var14_int];
                          var16 = var13[var14_int + 1];
                          if (var15 != -1) {
                            if (var16 != (qb.field_N.field_sc[var15] & 255)) {
                              break L15;
                            }
                          } else {
                            if (var10 == 0) {
                              stackIn_36_0 = qb.field_N.field_rc;
                            } else {
                              stackIn_36_0 = qb.field_N.field_jc;
                            }
                            var17_int = stackIn_36_0;
                            if (var16 != var17_int) {
                              break L15;
                            }
                          }
                          var14_int += 2;
                          continue;
                        }
                        break;
                      }
                      var12++;
                    }
                  }
                  break;
                }
                if (!(2 > dd.field_c) &&
                  sn.field_a[12]) {
                  var10 = 2;
                }
              }
              if (2 <= var10) {
                if ((ba.field_S != null ||
                  a.field_g != null ||
                  bi.field_e != null ||
                  null != ti.field_f)) {
                  var11_intLifetime1 = 0;
                  var12Lifetime1 = 0;
                  var13_int = 0;
                  var14_intLifetime1 = 0;
                  var15Lifetime1 = 0;
                  for (var16Lifetime1 = 0; hg.field_k > var16Lifetime1; var16Lifetime1++) {
                    var17_intLifetime1 = qb.field_N.field_sc[var16Lifetime1] & 255;
                    if (null != ba.field_S &&
                      null != ba.field_S[var16Lifetime1] &&
                      ba.field_S[var16Lifetime1][var17_intLifetime1]) {
                      var11_intLifetime1 = 1;
                    }
                    if (a.field_g != null &&
                      null != a.field_g[var16Lifetime1]) {
                      var18_int = a.field_g[var16Lifetime1][var17_intLifetime1];
                      if (var18_int != 0 &&
                        !oa.field_r) {
                        var11_intLifetime1 = 1;
                      }
                      if (var18_int > var13_int) {
                        var13_int = var18_int;
                      }
                    }
                    L32: {
                      if (null != bi.field_e) {
                        if (bi.field_e[var16Lifetime1] == null) {
                          if (((null != ti.field_f)) &&
                            ((null != ti.field_f[var16Lifetime1]))) {
                            var15Lifetime1 = var15Lifetime1 | ti.field_f[var16Lifetime1][var17_intLifetime1];
                          }
                          break L32;
                        }
                        var18_intLifetime1 = bi.field_e[var16Lifetime1][var17_intLifetime1];
                        if (var18_intLifetime1 != 0 &&
                          !oa.field_r) {
                          var11_intLifetime1 = 1;
                        }
                        if (var18_intLifetime1 > var14_intLifetime1) {
                          var14_intLifetime1 = var18_intLifetime1;
                        }
                      }
                      if (null != ti.field_f &&
                        null != ti.field_f[var16Lifetime1]) {
                        var15Lifetime1 = var15Lifetime1 | ti.field_f[var16Lifetime1][var17_intLifetime1];
                      }
                    }
                  }
                  var16Lifetime1Lifetime1 = 0;
                  var17 = v.field_x.field_Pb.field_fb;
                  var18_ref = (gd) (var17.c(false));
                  while (var18_ref != null) {
                    if (var18_ref.d((byte) -1)) {
                      var18_ref = (gd) (var17.a((byte) -70));
                      continue;
                    }
                    if (var11_intLifetime1 != 0 &&
                      !var18_ref.field_Tb) {
                      var16Lifetime1Lifetime1 = 1;
                    } else {
                      if (var18_ref.field_Pb < var13_int) {
                        var16Lifetime1Lifetime1 = 1;
                      } else {
                        if (var14_intLifetime1 <= var18_ref.field_Qb) {
                          if ((~var18_ref.field_Ub & var15Lifetime1) > 0) {
                            var16Lifetime1Lifetime1 = 1;
                          } else {
                            if (var12Lifetime1 == 0) {
                              var18_ref = (gd) (var17.a((byte) -70));
                              continue;
                            }
                            var16Lifetime1Lifetime1 = 1;
                          }
                        } else {
                          var16Lifetime1Lifetime1 = 1;
                        }
                      }
                    }
                    break;
                  }
                  if (2 <= dd.field_c &&
                    sn.field_a[12]) {
                    var16Lifetime1Lifetime1 = 0;
                  }
                  if ((var16Lifetime1Lifetime1 != 0)) {
                    rn.field_c.field_S = false;
                    if (!(!rn.field_c.field_rb)) {
                      if (we.field_e.field_g.field_Lb != 0) {
                        re.field_P = sk.a(new String[]{rl.field_e}, cn.field_b, 119);
                      } else {
                        re.field_P = af.field_b;
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                rn.field_c.field_S = false;
                if (rn.field_c.field_rb) {
                  var11 = null;
                  var12Lifetime2 = 0;
                  for (var13_intLifetime1 = 0; hg.field_k > var13_intLifetime1; var13_intLifetime1++) {
                    if (rh.field_G[var13_intLifetime1]) {
                      var24 = "<col=A00000>" + ll.field_y[var13_intLifetime1] + "</col>";
                      if (var11 != null) {
                        var12Lifetime2 = 1;
                        var11 = (String) (var11) + ", " + var24;
                      } else {
                        var11 = var24;
                      }
                    }
                  }
                  if (0 == var10) {
                    var13_ref = mn.field_b;
                    if (var12Lifetime2 != 0) {
                      var14 = hm.field_d + (String) (var11);
                    } else {
                      var14 = sk.a(new String[]{(String) (var11)}, hb.field_f, 119);
                    }
                  } else {
                    var13_ref = gb.field_q;
                    if (var12Lifetime2 != 0) {
                      var14 = o.field_p + (String) (var11);
                    } else {
                      var14 = sk.a(new String[]{(String) (var11)}, mc.field_d, 127);
                    }
                  }
                  re.field_P = "<col=A00000>" + var13_ref + "<br>" + var14;
                }
              }
            } else {
              var9_ref_String = qb.field_N.field_ec;
              ua.field_d.field_jb = sk.a(new String[]{var9_ref_String}, qe.field_e, 127).toUpperCase();
              tn.field_a.a((byte) -110, fk.field_V.field_Hb, fk.field_V.field_R - 40, 40, 0);
              tn.field_a.field_jb = sk.a(new String[]{var9_ref_String}, om.field_Xb, 123);
              var8 = tn.field_a;
            }
            if (un.field_f != 0L) {
              var9 = (int)(-k.a(0) + un.field_f);
              var9 = (999 + var9) / 1000;
              if (1 > var9) {
                var9 = 1;
              }
              var8.field_jb = sk.a(new String[]{Integer.toString(var9)}, ki.field_a, 121);
            }
            e.field_d.field_jb = sk.a(new String[]{Integer.toString(qb.field_N.field_jc), Integer.toString(qb.field_N.field_rc)}, pl.field_c, 126);
          }
          stackIn_158_0 = tl.field_P;
          stackIn_158_1 = 0;
          stackIn_159_2 = (param3) && (!param1) && (!lg.field_S);
          ((hl) (Object) stackIn_158_0).a(stackIn_158_1, stackIn_159_2);
          var5_int = -59 % ((13 - param4) / 49);
          stackIn_163_0 = fk.field_V;
          stackIn_163_1 = 0;
          stackIn_164_2 = (param3) && (!param1) && (!lg.field_S);
          ((hl) (Object) stackIn_163_0).a(stackIn_163_1, stackIn_164_2);
          stackIn_168_0 = fj.field_b;
          stackIn_168_1 = 0;
          stackIn_169_2 = (param3) && (!param1) && (lg.field_S);
          ((hl) (Object) stackIn_168_0).a(stackIn_168_1, stackIn_169_2);
          we.field_e.field_g.c(true);
          if (qb.field_N != null) {
            if (qi.field_n.field_F != 0) {
              g.e(qb.field_N.j(-56), -125, param2);
            }
            if (nm.field_n.field_F != 0) {
              lg.field_S = true;
            }
            if (0 != rn.field_c.field_F) {
              uf.field_b = true;
            }
            if (0 != c.field_b.field_F) {
              lg.field_S = false;
            }
            hg.a(param2, qb.field_N, 30544, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5_ref), "mh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, bh param1) {
        try {
          int var4 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3 = 0;
          Exception var3_ref_Exception = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          var5 = TetraLink.field_J;
          try {
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (sk.field_f != null) {
              try {
                sk.field_f.a(0L, 0);
                sk.field_f.a(var9, (byte) 66);
                for (var3 = 0; var3 < 24; var3++) {
                  if (var10[var3] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3 >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref_Exception = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
            }
            var3 = -39 % ((42 - param0) / 51);
            param1.a(0, 128, var10, 24);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = runtimeException;
            stackIn_17_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 + param0 + param2 <= ra.field_e) {
          return param0 + param1;
        }
        if (param3 != -8748) {
          field_b = 48;
        }
        if (-param2 + param1 >= 0) {
          return param1 - param2;
        }
        return ra.field_e - param2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_e = "(<%0> players want to join)";
        field_b = 0;
        field_a = 9;
        field_g = -1;
        field_f = "Cancel draw";
    }
}
