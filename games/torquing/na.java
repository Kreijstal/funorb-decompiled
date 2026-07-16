/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends jh {
    private uc field_L;
    private boolean field_J;
    private int field_M;
    private int field_F;
    static int[] field_G;
    static int field_E;
    private int field_H;
    private String field_D;
    static String[] field_I;

    na(int param0, int param1, int param2, int param3, gm param4, boolean param5, int param6, int param7, uc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (el) null, (ca) null);
        ((na) this).field_H = param6;
        ((na) this).field_M = param7;
        ((na) this).field_J = param5 ? true : false;
        ((na) this).field_C = param4;
        ((na) this).field_D = param10;
        ((na) this).field_F = param9;
        ((na) this).field_L = param8;
        int var12 = ((na) this).field_H + -((na) this).field_M;
        int var13 = ((na) this).field_L.a(param10, var12, ((na) this).field_L.field_x) + ((na) this).field_M * 2;
        if (param3 < var13) {
            ((na) this).a((byte) 127, param0, param1, var13, param2);
        } else {
            var13 = param3;
        }
        int var14 = ((na) this).field_J ? 0 : ((na) this).field_H + ((na) this).field_M * 2;
        ((na) this).field_C.a((byte) 123, var14, (-param3 + var13 >> -1792318271) + ((na) this).field_M, param3 + -(((na) this).field_M * 2), -(((na) this).field_M * 3) + (-((na) this).field_H + param2));
    }

    final static int a(da param0, String param1, int param2, da param3, int param4, boolean param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        fj stackIn_8_0 = null;
        fj stackIn_9_0 = null;
        fj stackIn_10_0 = null;
        String stackIn_10_1 = null;
        fj stackIn_11_0 = null;
        fj stackIn_12_0 = null;
        fj stackIn_13_0 = null;
        String stackIn_13_1 = null;
        fj stackOut_7_0 = null;
        fj stackOut_9_0 = null;
        String stackOut_9_1 = null;
        fj stackOut_8_0 = null;
        String stackOut_8_1 = null;
        fj stackOut_10_0 = null;
        fj stackOut_12_0 = null;
        String stackOut_12_1 = null;
        fj stackOut_11_0 = null;
        String stackOut_11_1 = null;
        L0: {
          var16 = null;
          var13 = Torquing.field_u;
          var15 = param3.b((byte) -38);
          var8 = param0.b((byte) -107);
          if (null == vk.field_E) {
            if (mo.a(269, false)) {
              break L0;
            } else {
              return -1;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (ef.field_a == tb.field_o) {
            L2: {
              jl.field_T = null;
              wa.field_d.field_n = 0;
              if (param1 != null) {
                L3: {
                  var9 = 0;
                  jb.field_c.field_n = 0;
                  if (!param5) {
                    break L3;
                  } else {
                    var9 = var9 | 1;
                    break L3;
                  }
                }
                L4: {
                  jb.field_c.b((byte) 60, sa.field_d.nextInt());
                  jb.field_c.b((byte) 60, sa.field_d.nextInt());
                  jb.field_c.a(var15, (byte) -72);
                  jb.field_c.a(var8, (byte) -72);
                  var17 = (CharSequence) (Object) param1;
                  jb.field_c.a(lp.a(var17, 109), (byte) -72);
                  jb.field_c.a(param6, 109);
                  jb.field_c.b(90, param4);
                  jb.field_c.b(90, var9);
                  wa.field_d.b(90, 18);
                  wa.field_d.field_n = wa.field_d.field_n + 2;
                  var10 = wa.field_d.field_n;
                  var11_ref_String = rb.a(-108, ip.a(9));
                  if (var11_ref_String == null) {
                    var11_ref_String = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                wa.field_d.b((byte) 4, var11_ref_String);
                ok.a(jb.field_c, ua.field_a, (fj) (Object) wa.field_d, gk.field_b, -4);
                wa.field_d.c(-var10 + wa.field_d.field_n, param2 + 400395746);
                break L2;
              } else {
                L5: {
                  jb.field_c.field_n = 0;
                  jb.field_c.b((byte) 60, sa.field_d.nextInt());
                  jb.field_c.b((byte) 60, sa.field_d.nextInt());
                  stackOut_7_0 = jb.field_c;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (!param3.a((byte) 104)) {
                    stackOut_9_0 = (fj) (Object) stackIn_9_0;
                    stackOut_9_1 = "";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L5;
                  } else {
                    stackOut_8_0 = (fj) (Object) stackIn_8_0;
                    stackOut_8_1 = (String) var15;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L5;
                  }
                }
                L6: {
                  ((fj) (Object) stackIn_10_0).a(stackIn_10_1, (byte) -72);
                  stackOut_10_0 = jb.field_c;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param0.a((byte) -113)) {
                    stackOut_12_0 = (fj) (Object) stackIn_12_0;
                    stackOut_12_1 = (String) var8;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L6;
                  } else {
                    stackOut_11_0 = (fj) (Object) stackIn_11_0;
                    stackOut_11_1 = "";
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L6;
                  }
                }
                ((fj) (Object) stackIn_13_0).a(stackIn_13_1, (byte) -72);
                wa.field_d.b(90, 16);
                wa.field_d.field_n = wa.field_d.field_n + 1;
                var9 = wa.field_d.field_n;
                ok.a(jb.field_c, ua.field_a, (fj) (Object) wa.field_d, gk.field_b, -4);
                wa.field_d.c((byte) 48, -var9 + wa.field_d.field_n);
                break L2;
              }
            }
            jd.a((byte) -118, -1);
            ef.field_a = q.field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (param2 == -25978) {
            break L7;
          } else {
            var14 = null;
            int discarded$2 = na.a((da) null, (String) null, 121, (da) null, -99, true, 19);
            break L7;
          }
        }
        L8: {
          if (q.field_c == ef.field_a) {
            if (!no.a(1, param2 + 25978)) {
              break L8;
            } else {
              L9: {
                var9 = kj.field_d.i((byte) -101);
                kj.field_d.field_n = 0;
                if (100 > var9) {
                  break L9;
                } else {
                  if (var9 <= 105) {
                    kh.field_n = new String[var9 - 100];
                    ef.field_a = pl.field_s;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (248 == var9) {
                ae.a(ip.a(9), (byte) 25);
                pl.field_u = od.field_u;
                ih.b(true);
                lh.field_J = false;
                return var9;
              } else {
                if ((var9 ^ -1) == -100) {
                  boolean discarded$3 = no.a(ol.b(-92), param2 ^ -25978);
                  jl.field_T = new Boolean(ac.a((fj) (Object) kj.field_d, 28066));
                  kj.field_d.field_n = 0;
                  break L8;
                } else {
                  fa.field_e = var9;
                  ef.field_a = ah.field_b;
                  oo.field_a = -1;
                  break L8;
                }
              }
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (pl.field_s == ef.field_a) {
            var9 = 2;
            if (no.a(var9, 0)) {
              var10 = kj.field_d.i(7088);
              kj.field_d.field_n = 0;
              if (!no.a(var10, 0)) {
                break L10;
              } else {
                var11 = kh.field_n.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    ih.b(true);
                    lh.field_J = false;
                    return 100 - -var11;
                  } else {
                    kh.field_n[var12] = kj.field_d.d(-7519);
                    var12++;
                    continue L11;
                  }
                }
              }
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L12: {
          if (ef.field_a == ah.field_b) {
            if (ah.a(param2 + 25980)) {
              L13: {
                if (-256 != (fa.field_e ^ -1)) {
                  pl.field_u = kj.field_d.h((byte) 124);
                  break L13;
                } else {
                  var9_ref_String = kj.field_d.a(19);
                  if (var9_ref_String == null) {
                    break L13;
                  } else {
                    om.a((byte) 73, var9_ref_String, ip.a(9));
                    break L13;
                  }
                }
              }
              ih.b(true);
              lh.field_J = false;
              return fa.field_e;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (vk.field_E != null) {
            break L14;
          } else {
            if (lh.field_J) {
              L15: {
                if (lc.h((byte) -76) > 30000L) {
                  pl.field_u = eb.field_h;
                  break L15;
                } else {
                  pl.field_u = hq.field_e;
                  break L15;
                }
              }
              lh.field_J = false;
              return 249;
            } else {
              var9 = ea.field_t;
              ea.field_t = sf.field_a;
              lh.field_J = true;
              sf.field_a = var9;
              break L14;
            }
          }
        }
        return -1;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_I = null;
        }
        field_I = null;
        field_G = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = ((na) this).field_w - -param3;
        if (param1 >= -7) {
            String discarded$0 = ((na) this).b(85);
        }
        int var6 = param2 + ((na) this).field_k;
        super.a(param0, (byte) -91, param2, param3);
        if (-1 != (param0 ^ -1)) {
            return;
        }
        int var7 = !((na) this).field_J ? 0 : -((na) this).field_H + (((na) this).field_p + -(2 * ((na) this).field_M));
        int discarded$1 = ((na) this).field_L.a(((na) this).field_D, var5 - (-var7 + -((na) this).field_M), var6 - -((na) this).field_M, -((na) this).field_M + ((na) this).field_H, ((na) this).field_o - 2 * ((na) this).field_M, ((na) this).field_F, -1, !((na) this).field_J ? 2 : 0, 1, ((na) this).field_L.field_x);
    }

    final String b(int param0) {
        int var2 = ((na) this).field_C.field_s ? 1 : 0;
        ((na) this).field_C.field_s = ((na) this).field_s;
        String var3 = ((na) this).field_C.b(param0);
        ((na) this).field_C.field_s = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new String[]{"By rating", "By win percentage"};
    }
}
