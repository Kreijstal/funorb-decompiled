/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb {
    al field_o;
    static int field_f;
    static int field_n;
    static int field_b;
    static ej field_d;
    static String[] field_e;
    al field_q;
    static pb field_h;
    al field_j;
    al field_k;
    ka field_c;
    int field_m;
    long field_l;
    volatile int field_g;
    ka field_a;
    byte field_p;
    volatile int field_i;
    ph field_r;

    final int b(byte param0) {
        if (param0 > -77) {
            boolean discarded$0 = ((fb) this).e(-118);
        }
        return ((fb) this).field_o.b((byte) -7) + ((fb) this).field_q.b((byte) -7);
    }

    abstract void a(byte param0);

    abstract boolean f(int param0);

    final static ml a(int param0, boolean param1, String param2) {
        ml var3 = new ml(false);
        var3.field_g = param0;
        var3.field_e = param2;
        if (!param1) {
            field_f = -59;
        }
        return var3;
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        field_h = null;
        if (param0 != -2918) {
            Object var2 = null;
            fb.a(47, (String[]) null, 113, (java.applet.Applet) null, 32, -16);
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((fb) this).f(72);
        }
        return ((fb) this).field_j.b((byte) -7) + ((fb) this).field_k.b((byte) -7);
    }

    final static void a(int param0, byte param1, ta param2) {
        ha var3 = pg.field_fb;
        var3.f(param0, 950);
        var3.a(false, param2.field_o);
        if (param1 > -117) {
            return;
        }
        var3.a(false, param2.field_t);
    }

    final boolean d(int param0) {
        if (param0 != 2) {
            ((fb) this).field_k = null;
        }
        return 20 <= ((fb) this).b((byte) -87) ? true : false;
    }

    final ph a(byte param0, int param1, boolean param2, int param3, boolean param4) {
        long var6 = ((long)param3 << -1322373600) + (long)param1;
        if (!param4) {
            return null;
        }
        ph var8 = new ph();
        var8.field_F = param0;
        var8.field_u = param2 ? true : false;
        var8.field_o = var6;
        if (param2) {
            if (!(20 > ((fb) this).b((byte) -92))) {
                throw new RuntimeException();
            }
            ((fb) this).field_o.a((byte) 124, (ah) (Object) var8);
        } else {
            if (((fb) this).a(0) >= 20) {
                throw new RuntimeException();
            }
            ((fb) this).field_j.a((byte) 125, (ah) (Object) var8);
        }
        return var8;
    }

    abstract void b(int param0);

    abstract void a(boolean param0, Object param1, int param2);

    final boolean e(int param0) {
        int var2 = -34 / ((-29 - param0) / 36);
        return (((fb) this).a(0) ^ -1) <= -21 ? true : false;
    }

    final static void a(ka param0, int param1, ej param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            lb var18 = null;
            byte[][] var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            Throwable decompiledCaughtException = null;
            var14 = stellarshard.field_B;
            var18 = new lb();
            var18.field_s = param0.f(4);
            var18.field_l = param0.b(false);
            var18.field_p = new int[var18.field_s];
            var18.field_n = new int[var18.field_s];
            var18.field_k = new int[var18.field_s];
            var18.field_r = new re[var18.field_s];
            var18.field_m = new byte[var18.field_s][][];
            var18.field_q = new re[var18.field_s];
            if (param3 == 20) {
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_s) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_p[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param0.f(4);
                        if (var6_int == 0) {
                          break L2;
                        } else {
                          if ((var6_int ^ -1) == -2) {
                            break L2;
                          } else {
                            if ((var6_int ^ -1) != -3) {
                              L3: {
                                if (3 == var6_int) {
                                  break L3;
                                } else {
                                  if (var6_int == 4) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var7 = param0.e((byte) 106);
                              var8 = param0.e((byte) 117);
                              var9 = param0.f(param3 ^ 16);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var9 <= var11_int) {
                                  L5: {
                                    var22 = new byte[var9][];
                                    var21 = var22;
                                    var20 = var21;
                                    var19 = var20;
                                    var11 = var19;
                                    if (var6_int != 3) {
                                      break L5;
                                    } else {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var9 <= var12_int) {
                                          break L5;
                                        } else {
                                          var13 = param0.b(false);
                                          var11[var12_int] = new byte[var13];
                                          param0.a(0, (byte) -106, var13, var22[var12_int]);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                  var18.field_k[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_q[var5] = param2.a(var8, var12, param3 + 94, he.b(var7, ih.a(param3, -73)));
                                      var18.field_m[var5] = var22;
                                      break L1;
                                    } else {
                                      var12[var17] = he.b(var10[var17], -61);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param0.e((byte) 85);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param0.e((byte) 102);
                        var7 = var15;
                        var16 = param0.e((byte) 102);
                        var8 = var16;
                        var9 = 0;
                        if (-2 != (var6_int ^ -1)) {
                          break L8;
                        } else {
                          var9 = param0.b(false);
                          break L8;
                        }
                      }
                      var18.field_k[var5] = var6_int;
                      var18.field_n[var5] = var9;
                      var18.field_r[var5] = param2.a(he.b(var15, -112), 0, var16);
                      var5++;
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_p[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_p[var5] = -4;
                    var5++;
                  }
                  continue L0;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, String[] param1, int param2, java.applet.Applet param3, int param4, int param5) {
        int var7 = 0;
        int var8 = stellarshard.field_B;
        vd.field_d = param3.getParameter("overxgames");
        if (!(vd.field_d != null)) {
            vd.field_d = "0";
        }
        vg.field_r = param3.getParameter("overxachievements");
        if (!(null != vg.field_r)) {
            vg.field_r = "0";
        }
        String var6 = param3.getParameter("currency");
        if (var6 == null) {
            ic.field_a = 2;
        } else {
            if (!rg.a((byte) 19, (CharSequence) (Object) var6)) {
                ic.field_a = 2;
            } else {
                ic.field_a = pf.a((CharSequence) (Object) var6, (byte) 125);
            }
        }
        ki.field_x = param5;
        jb.field_a = param0;
        ki.field_t = param2;
        dl.field_C = new pb[param1.length];
        for (var7 = 0; param1.length > var7; var7++) {
            dl.field_C[var7] = new pb(317, 34);
        }
        if (param4 != -1) {
            Object var9 = null;
            fb.a((ka) null, 60, (ej) null, 71);
        }
        pk.field_d = param1;
    }

    fb() {
        ((fb) this).field_o = new al();
        ((fb) this).field_q = new al();
        ((fb) this).field_j = new al();
        ((fb) this).field_k = new al();
        ((fb) this).field_c = new ka(6);
        ((fb) this).field_p = (byte) 0;
        ((fb) this).field_i = 0;
        ((fb) this).field_g = 0;
        ((fb) this).field_a = new ka(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_f = 0;
    }
}
