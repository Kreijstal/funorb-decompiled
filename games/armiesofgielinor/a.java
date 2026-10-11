/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends tc {
    int field_p;
    static wk[] field_m;
    static String field_n;
    static String field_k;
    int field_l;
    static kl field_o;

    final static int a(int param0, int param1, int param2, int param3) {
        int stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_126_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var4_int = 16777215;
          var5 = ic.field_f >> 1 << 24;
          if (vs.field_e[param2].h(-1)) {
            var6 = vs.field_e[param2].field_a;
            if (null != bv.field_w) {
              var6 = bv.field_w.o(var6, param0 ^ -16711681);
            }
            var4_int = bo.field_g[1 + var6] | -2147483648;
          }
          if (jf.field_C.field_T != null) {
            if (param2 == ks.field_y * jf.field_C.field_T.field_w + jf.field_C.field_T.field_J) {
              var4_int = 16777215 | var5;
            } else {
              if (!jf.field_C.field_vb.field_w) {
                var6 = jf.field_C.field_vb.c(27732);
                if (!jf.field_C.field_T.field_s) {
                  if (bv.field_w.field_gb != jf.field_C.field_q) {
                    if (var6 <= jf.field_C.field_vb.field_q[param2]) {
                      if ((jf.field_C.field_vb.field_e[param2] & 2) != 0) {
                        var4_int = var5 | 5570560;
                      }
                    } else {
                      var4_int = 21760 | var5;
                    }
                  } else {
                    if (jf.field_C.field_vb.field_q[param2] <= var6) {
                      var4_int = var5 | 43264;
                    } else {
                      if (0 == (jf.field_C.field_vb.field_e[param2] & 2)) {
                        if (jf.field_C.field_vb.field_k[param2] < var6) {
                          var4_int = 11118848 | var5;
                        }
                      } else {
                        var4_int = 16711680 | var5;
                      }
                    }
                  }
                } else {
                  if (jf.field_C.field_T.field_B == 0) {
                    if (var6 < jf.field_C.field_vb.field_q[param2]) {
                      if ((2 & jf.field_C.field_vb.field_e[param2]) != 0) {
                        var4_int = var5 | 5570560;
                      }
                    } else {
                      var4_int = var5 | 21760;
                    }
                  } else {
                    if ((1 & jf.field_C.field_vb.field_e[param2]) != 0) {
                      var4_int = var5 | 5570560;
                    }
                  }
                }
              } else {
                if (jf.field_C.field_T.field_B > 0) {
                  if (!jf.field_C.field_T.field_s) {
                    if ((jf.field_C.field_vb.field_e[param2] & 2) != 0) {
                      var4_int = var5 | 16711680;
                    }
                  } else {
                    if ((1 & jf.field_C.field_vb.field_e[param2]) != 0) {
                      var4_int = var5 | 16711680;
                    }
                  }
                }
              }
            }
            if (!jf.field_C.field_T.field_s &&
              jf.field_C.field_T.field_O == jf.field_C.field_q &&
              !jf.field_C.field_T.h(-13494)) {
              var6 = jf.field_C.field_T.B(3257);
              var7 = jf.field_C.field_T.l((byte) -79);
              var8 = jf.field_C.field_vb.field_n;
              var9 = jf.field_C.field_vb.field_b;
              if (jf.field_C.field_T.o(-28467)) {
                var8 = jf.field_C.field_T.a(false);
                var9 = jf.field_C.field_T.D(param0 - 16711795);
              }
              var10 = Math.abs(var8 - param3);
              var11 = Math.abs(-param1 + var9);
              if (var6 >= var10 + var11 &&
                var7 <= var10 + var11) {
                stackIn_52_0 = (var10 + var11 != 1) ? 0 : 1;
                var12 = stackIn_52_0;
                if (var12 == 0) {
                  if (0 == (2 & bv.field_w.b(31, var9, var8, jf.field_C.field_T.field_O))) {
                    if ((bv.field_w.b(31, param1, param3, jf.field_C.field_T.field_O) & 2) == 0) {
                      stackIn_62_0 = (bv.field_w.field_j.a(var9, param3, var8, jf.field_C.field_T.x(-97), var6, param1, (byte) 62)) ? 1 : 0;
                    } else {
                      stackIn_62_0 = 0;
                    }
                  } else {
                    stackIn_62_0 = 0;
                  }
                } else {
                  stackIn_62_0 = 0;
                }
                var13 = stackIn_62_0;
                if (var12 != 0 ||
                  var13 != 0) {
                  var4_int = var5 | 11145472;
                }
              }
            }
            if (jf.field_C.field_lc) {
              var6 = -jf.field_C.field_T.field_J - ks.field_y * jf.field_C.field_T.field_w + param2;
              if (var6 == ks.field_y ||
                -ks.field_y == var6 ||
                1 == var6 ||
                var6 == -1) {
                var4_int = var5 | 16777215;
              }
            }
          }
          if (param2 == jf.field_C.field_h) {
            var4_int = var4_int & 16777215 | var5 + var4_int & -16777216;
          }
          L11: {
            if (jf.field_C.field_cc > -1 &&
              jf.field_C.field_ic > -1) {
              if (jf.field_C.field_gc == 44 &&
                jf.field_C.field_rb &&
                -1 < jf.field_C.field_Cb) {
                var6 = jf.field_C.field_Cb;
                switch (var6) {
                  case 1:
                    if (jf.field_C.field_cc != param3) {
                      break L11;
                    }
                    if (jf.field_C.field_eb < param1) {
                      break L11;
                    }
                    if (param1 < -jf.field_C.field_ic + jf.field_C.field_eb) {
                      break L11;
                    }
                    var4_int = 43264 | var5;
                    break L11;
                  case 0:
                    if (jf.field_C.field_eb != param1) {
                      break L11;
                    }
                    if (jf.field_C.field_cc > param3) {
                      break L11;
                    }
                    if (jf.field_C.field_ic + jf.field_C.field_cc < param3) {
                      break L11;
                    }
                    var4_int = 43264 | var5;
                    break L11;
                  case 2:
                    if (param3 != jf.field_C.field_cc) {
                      break L11;
                    }
                    if (param1 < jf.field_C.field_eb) {
                      break L11;
                    }
                    if (jf.field_C.field_eb + jf.field_C.field_ic < param1) {
                      break L11;
                    }
                    var4_int = var5 | 43264;
                    break L11;
                  default:
                    break L11;
                  case 3:
                    if (param1 != jf.field_C.field_eb) {
                      break L11;
                    }
                    if (param3 > jf.field_C.field_cc) {
                      break L11;
                    }
                    if (param3 < jf.field_C.field_cc - jf.field_C.field_ic) {
                      break L11;
                    }
                    var4_int = 43264 | var5;
                    break L11;
                }
              }
              var6 = Math.abs(jf.field_C.field_cc - param3);
              var7 = Math.abs(jf.field_C.field_eb - param1);
              if (var6 <= jf.field_C.field_ic &&
                var7 <= jf.field_C.field_ic) {
                if (jf.field_C.field_rb) {
                  var4_int = 43264 | var5;
                } else {
                  var4_int = var5 | 16711680;
                }
              }
            }
          }
          var6 = bv.field_w.a(param2, -1, true) & 28;
          if (param0 != 16711680) {
            field_o = (kl) null;
          }
          for (var7 = 0; 5 > var7; var7++) {
            if ((var6 & 1 << var7) != 0 &&
              0 != (-16777216 & hm.field_l[var7])) {
              var4_int = fm.a(var4_int, hm.field_l[var7], 789485328);
            }
          }
          stackIn_126_0 = var4_int;
          return stackIn_126_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "a.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_o = null;
        field_k = null;
        field_n = null;
        if (!param0) {
          a.a(-107, -22, -114, 71);
        }
    }

    final static jd a(int param0, int param1, bv param2) {
        jd var3 = null;
        RuntimeException var3_ref = null;
        jd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return null;
          }
          var3 = new jd();
          if (param1 <= 31) {
            a.a(96, (byte) -94);
          }
          no.a(param2, var3, param0, -24721);
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("a.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 != -32) {
          field_m = (wk[]) null;
        }
        bv var2 = vl.field_n;
        var2.h(32161, param0);
        var2.b(1, 1);
        var2.b(1, 2);
    }

    a(int param0, int param1) {
        this.field_p = param0;
        this.field_l = param1;
    }

    static {
        field_k = "Retry";
        field_n = "You are not fighting for <%0>.";
    }
}
