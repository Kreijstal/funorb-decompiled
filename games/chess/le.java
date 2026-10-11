/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static ci field_e;
    static jd field_g;
    private km[] field_a;
    static String field_b;
    static String field_c;
    static String field_d;
    static int field_f;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 < 107) {
                le.a(96);
              }
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(rh.a(var2, param1, (byte) -87), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("le.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        try {
          em.a(param4, this.field_a, param1, param0, 24599, param2);
          if (!param3) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "le.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String b(byte param0) {
        String stackIn_3_0 = null;
        String stackIn_65_0 = null;
        Object stackIn_103_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = Chess.field_G;
        try {
          var1 = null;
          var2 = null;
          if (param0 < 42) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (vk.field_g == 0 &&
            null != ib.field_d) {
            var2 = lc.field_l;
          }
          if (vk.field_g == 2 &&
            !jd.b((byte) 75)) {
            boolean decompiledSharedTail0 = !(ah.a(ec.field_f, 75));
            if (!decompiledSharedTail0) {
              var2 = oc.a(el.field_x, new String[]{ij.field_c}, (byte) -57);
              decompiledSharedTail0 = (var10 != 0);
            }
            if (decompiledSharedTail0) {
              var2 = oc.a(r.field_Fb, new String[]{ij.field_c}, (byte) -69);
            }
            if (an.field_c) {
              lc.a((String) null, (String) null, 2, 0, (String) (var2), false);
              kf.a(-98);
            }
          }
          if (var2 == null &&
            !fl.field_j &&
            ac.field_l == null) {
            var2 = dk.field_e;
          }
          if (var2 != null) {
            fj.a((String) (var2), 0, -1, (String) null, uh.field_l);
          } else {
            var3 = ci.field_J;
            var3 = on.a(-11307, var3);
            var4 = "";
            var5 = "|";
            var6 = vk.field_g;
            var7 = 0;
            if (var6 == 2) {
              var4 = oc.a(vf.field_d, new String[]{ij.field_c}, (byte) -97);
              var8 = oc.a(sa.field_d, new String[]{var3}, (byte) -110);
              var7 = eg.field_f.field_M - (-uc.field_c.field_M + 485) - (-sc.field_a.b(var8) + sc.field_a.b(var4));
              if (var7 < 0) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (var6 == 0) {
                if (pd.field_Rb == null &&
                  dn.field_b) {
                  var4 = "[" + ja.field_c + "] ";
                }
                if (pd.field_Rb != null) {
                  if (!qj.field_d ||
                    kb.field_P == null) {
                    var4 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -112) + "] ";
                    if (var10 != 0) {
                      var4 = "[" + kb.field_P + "] ";
                    }
                  } else {
                    var4 = "[" + kb.field_P + "] ";
                  }
                  var6 = 1;
                }
              }
              if (!wk.a((byte) 119)) {
                stackIn_65_0 = "<img=3>: ";
              } else {
                stackIn_65_0 = ": ";
              }
              var8Lifetime1 = stackIn_65_0;
              var4 = var4 + var3 + var8Lifetime1;
              if (!qf.field_b) {
                if (kh.field_o) {
                  var4 = "<col=999999>" + var4 + cn.field_e + "</col>";
                  var5 = "";
                  if (var10 != 0) {
                    var4 = "<col=999999>" + var4 + a.field_e + "</col>";
                    var5 = "";
                  }
                }
              } else {
                var4 = "<col=999999>" + var4 + a.field_e + "</col>";
                var5 = "";
              }
              var9 = sc.field_a.b(var4);
              if (!wk.a((byte) 118)) {
                if (eg.field_f.field_F &&
                  var9 > (-eg.field_f.field_U + hn.field_k)) {
                  if (qf.field_b) {
                    var1 = "Broken!";
                  } else {
                    var1 = cn.field_e;
                  }
                }
                if (eg.field_f.field_L != 0 &&
                  eg.field_f.field_qb < var9 &&
                  !qf.field_b) {
                  sh.a(false);
                }
              }
            }
            fj.a(var4 + lh.a(sg.field_c.toString()), var7, -1, var5, vm.field_i[var6]);
            if (!kn.field_L) {
              uc.field_c.field_F = false;
            }
            if (uc.field_c.field_F) {
              var1 = oc.a(vk.field_h, new String[]{var3, ij.field_c}, (byte) -50);
            }
          }
          stackIn_103_0 = var1;
          return (String) (stackIn_103_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (var1), "le.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -485) {
          return;
        }
        try {
          field_c = null;
          field_e = null;
          field_d = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "le.A(" + param0 + ')');
        }
    }

    le(km[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("le.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        String stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        le stackIn_24_0 = null;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int var10 = 0;
        var10 = Chess.field_G;
        try {
          var1_int = -vh.field_g + tf.field_o;
          vh.field_g = -(var1_int >> 1) + of.field_k;
          tf.field_o = var1_int + vh.field_g;
          id.field_c = -(bd.field_d >> 1) + pd.field_Fb;
          var2 = id.field_c;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3 < bd.field_e.length)))) {
            var4 = ec.field_l[var3];
            stackIn_33_0 = 0;
            stackIn_33_1 = var4;
            if (var10 == 0) {
              if (stackIn_33_0 <= stackIn_33_1) {
                if (~nj.field_u.field_h == ~var4) {
                  var5 = cm.field_w;
                } else {
                  var5 = ni.field_d;
                }
              } else {
                var5 = qb.field_b;
              }
              var6 = bd.field_e[var3];
              stackIn_16_0 = var6;
              stackIn_16_1 = 26;
              stackIn_17_2 = !(0 > var4);
              var7 = in.a(stackIn_16_0, stackIn_16_1, stackIn_17_2);
              var8 = of.field_k - (var7 >> 1);
              if (var4 >= 0) {
                if (~nj.field_u.field_h == ~var4) {
                  stackIn_24_0 = ig.field_b;
                } else {
                  stackIn_24_0 = uc.field_g;
                }
                var9 = stackIn_24_0;
                var2 = var2 + mf.field_z;
                if (var9 != null) {
                  var9.a(-gm.field_e + var8, var7 + (gm.field_e << 1), (fh.field_e << 1) + ug.field_a, true, var2);
                }
                var2 = var2 + fh.field_e;
              }
              if (var4 >= 0) {
                vl.field_M.a(var6, var8, var2 + th.field_a, var5, -1);
                var2 = var2 + (ug.field_a + (mf.field_z + fh.field_e));
              } else {
                sj.field_d.a(var6, var8, var2 + jb.field_f, var5, -1);
                var2 = var2 + qd.field_r;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_33_0 = param0;
            stackIn_33_1 = -64;
          }
          if (stackIn_33_0 > stackIn_33_1) {
            field_c = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "le.E(" + param0 + ')');
        }
    }

    static {
        field_b = "Breaking real-world laws";
        field_g = new jd("usename");
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
