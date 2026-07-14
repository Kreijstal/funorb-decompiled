/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ej {
    private String field_P;
    private boolean field_R;
    static int[] field_N;
    static int field_Q;
    private String field_S;
    static jc field_O;
    private dg field_T;
    static int[] field_V;
    private boolean field_U;

    public static void f(boolean param0) {
        if (param0) {
            return;
        }
        field_N = null;
        field_V = null;
        field_O = null;
    }

    ve(sk param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((ve) this).field_P = param1;
        if (null != ((ve) this).field_P) {
            var3 = qc.field_b.a(((ve) this).field_P, 260, qc.field_b.field_H);
            ((ve) this).a(150 + var3, (byte) -81, 300);
        }
        ((ve) this).field_T = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((ve) this).field_R = false;
        ((ve) this).field_T.field_z = true;
        ((ve) this).field_U = false;
        ((ve) this).a((pj) (Object) ((ve) this).field_T, (byte) 74);
    }

    final void p(int param0) {
        ((ve) this).field_U = true;
        ((ve) this).field_T.field_z = false;
        if (param0 != 1) {
            Object var3 = null;
            ve.a(62, -4, (hj) null, -58, 98, -124, (byte) 124, -112);
        }
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4, int param5, byte param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        hj var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        L0: {
          var19 = OrbDefence.field_D ? 1 : 0;
          if (ul.field_i > param5) {
            param3 = param3 - (ul.field_i + -param5);
            param5 = ul.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ul.field_d > param7) {
            param1 = param1 - (ul.field_d - param7);
            param7 = ul.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ul.field_e < param5 - -param3) {
            param3 = ul.field_e + -param5;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param7 - -param1 > ul.field_a) {
            param1 = ul.field_a + -param7;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-1 <= (param3 ^ -1)) {
            break L4;
          } else {
            if (param1 <= 0) {
              break L4;
            } else {
              L5: {
                var22 = param2.f();
                var33 = ul.field_b;
                var10 = ul.field_f;
                var11 = ul.field_l;
                var31 = new int[4];
                ul.a(var31);
                param2.d();
                ul.i(var31[0], var31[1], var31[2], var31[3]);
                var13 = param5 - -(param7 * param2.field_o);
                var14 = -param3 + param2.field_o;
                var32 = var22.field_v;
                var29 = var32;
                var26 = var29;
                var23 = var26;
                var15 = var23;
                if (param6 >= 52) {
                  break L5;
                } else {
                  var20 = null;
                  ve.a(69, -127, (hj) null, 0, -117, 43, (byte) -101, -90);
                  break L5;
                }
              }
              var16 = param7;
              L6: while (true) {
                if (var16 >= param1 + param7) {
                  var22.c(-param2.field_p, -param2.field_u);
                  ul.a(var33, var10, var11);
                  ul.b(var31);
                  return;
                } else {
                  var17 = param5;
                  L7: while (true) {
                    if (param5 + param3 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L6;
                    } else {
                      var18 = var32[var13];
                      if (-1 != (var18 ^ -1)) {
                        L8: {
                          L9: {
                            if ((var17 ^ -1) >= -1) {
                              break L9;
                            } else {
                              if (0 == var15[var13 + -1]) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (0 >= var16) {
                              break L10;
                            } else {
                              if (0 == var15[var13 + -param2.field_o]) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (param2.field_o - 1 <= var17) {
                              break L11;
                            } else {
                              if (var15[1 + var13] == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (var16 < -1 + param2.field_k) {
                            if (var15[param2.field_o + var13] == 0) {
                              break L8;
                            } else {
                              var13++;
                              var17++;
                              continue L7;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                        ul.f(var17, var16, param0, param4);
                        var13++;
                        var17++;
                        continue L7;
                      } else {
                        var13++;
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, String param1, float param2, int param3) {
        if (param3 != 2113632) {
            return;
        }
        if (param0 == ((ve) this).field_R) {
            ((ve) this).field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
            ((ve) this).field_S = param1;
        } else {
            ((ve) this).field_R = param0 ? true : false;
            if (((ve) this).field_R) {
                ((ve) this).field_T.a(16711422, 8405024, 4210752);
                ((ve) this).field_T.field_z = true;
            } else {
                ((ve) this).field_T.a(16711422, 2113632, 4210752);
                if (((ve) this).field_U) {
                    ((ve) this).field_T.field_z = false;
                }
            }
            ((ve) this).field_T.field_J = (int)(65536.0f * (param2 / 100.0f));
            ((ve) this).field_S = param1;
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        qc.field_b.c(((ve) this).field_S, param0 - -(((ve) this).field_m >> 289864865), param1 + 103, 16777215, -1);
        if (!(null == ((ve) this).field_P)) {
            ul.d(param0 + 20, param1 - -113, 260, 8421504);
            int discarded$0 = qc.field_b.a(((ve) this).field_P, param0 + 20, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, qc.field_b.field_H);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new int[12];
        field_N = new int[8192];
    }
}
