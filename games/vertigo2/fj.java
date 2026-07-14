/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj extends rl implements ij {
    static int[] field_lb;
    private boolean field_jb;
    private boolean field_kb;
    private boolean field_gb;
    private we field_fb;
    private cc field_mb;
    static String field_hb;
    private boolean field_ib;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param5 >= param2) {
          return;
        } else {
          if (param0 > 1 + param5) {
            L0: {
              if (param0 <= param5 - -5) {
                break L0;
              } else {
                if (param4 != param3) {
                  var7 = (param4 >> 811497217) + (param3 >> -709459775) + (param3 & param4 & 1);
                  var8 = param5;
                  var9 = param4;
                  var10 = param3;
                  var11 = param5;
                  L1: while (true) {
                    if (var11 >= param0) {
                      fj.a(var8, param1 + 0, param2, var9, param4, param5, param6);
                      fj.a(param0, param1, param2, param3, var10, var8, param6);
                      return;
                    } else {
                      L2: {
                        var12 = ac.field_I[var11];
                        if (param6) {
                          stackOut_21_0 = on.field_e[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = hm.field_A[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_22_0;
                      if (var7 < var13) {
                        ac.field_I[var11] = ac.field_I[var8];
                        var8++;
                        ac.field_I[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = param0 - 1;
            L3: while (true) {
              if (param5 >= var7) {
                return;
              } else {
                var8 = param5;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = ac.field_I[var8];
                    var10 = ac.field_I[1 + var8];
                    if (eg.a(param6, var9, (byte) 98, var10)) {
                      ac.field_I[var8] = var10;
                      ac.field_I[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    fj(sd param0, cc param1, String param2, boolean param3, boolean param4) {
        super(param0, (iq) (Object) new rh((fj) null, param1, param2), 77, 10, 10);
        ((fj) this).field_kb = false;
        ((fj) this).field_jb = param4 ? true : false;
        ((fj) this).field_mb = param1;
        ((fj) this).field_gb = false;
        ((fj) this).field_ib = param3 ? true : false;
        ((fj) this).field_fb = new we(13, 50, 274, 30, 15, 2113632, 4210752);
        ((fj) this).field_fb.field_F = true;
        ((fj) this).c((byte) -14, (iq) (Object) ((fj) this).field_fb);
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        if (param2 == param1) {
            ((fj) this).h((byte) 85);
            return true;
        }
        return super.a(param0, 13, param2, param3);
    }

    final static aa a(cr param0, cr param1, ud param2, int param3, cr param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        aa[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        ud var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        q var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = Vertigo2.field_L ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (param2.field_C == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param2.field_C.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param2.field_z) {
              stackOut_7_0 = param2.field_z.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var6 + var5;
            var8 = new String[var7];
            var25 = new char[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var9 = var19;
            var24 = new int[var7];
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var10 = var18;
            var11 = new aa[var7];
            if (null == param2.field_C) {
              break L2;
            } else {
              var12 = 0;
              L3: while (true) {
                if (var12 >= param2.field_C.length) {
                  break L2;
                } else {
                  var13_ref = ni.field_d.a(param2.field_C[var12], true);
                  var8[var12] = var13_ref.field_D;
                  var9[var12] = param2.field_v[var12];
                  var11[var12] = fj.a(param0, param1, var13_ref, 10, param4);
                  var12++;
                  continue L3;
                }
              }
            }
          }
          L4: {
            if (param3 == 10) {
              break L4;
            } else {
              fj.a(118, 81, -122, 27, -116, -20, false);
              break L4;
            }
          }
          L5: {
            if (null == param2.field_z) {
              break L5;
            } else {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (param2.field_z.length <= var14) {
                  break L5;
                } else {
                  var15 = param2.field_z[var14];
                  if (var15 == -1) {
                    var8[var14 + var12] = br.field_W;
                    var9[var12 + var14] = param2.field_u[var14];
                    var10[var12 + var14] = param2.field_z[var14];
                    var14++;
                    continue L6;
                  } else {
                    L7: {
                      var16 = wm.field_k.a(1, var15);
                      var8[var14 + var12] = var16.h(tk.a(param3, 43));
                      var9[var12 - -var14] = param2.field_u[var14];
                      if (var9[var12 - -var14] <= 0) {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char)var13;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10[var14 + var12] = param2.field_z[var14];
                    var14++;
                    continue L6;
                  }
                }
              }
            }
          }
          return new aa(0L, param0, param4, param1, var11, var24, var8, var25);
        } else {
          return null;
        }
    }

    final void h(byte param0) {
        if (param0 < 55) {
            fj.g((byte) 127);
        }
        if (!(((fj) this).field_I)) {
            return;
        }
        ((fj) this).field_I = false;
        if (((fj) this).field_ib) {
            sm.k(-14284);
        } else {
            if (((fj) this).field_jb) {
                sg.a(3);
            }
        }
    }

    final void m(int param0) {
        ((fj) this).field_fb.b(param0, -113, 4210752);
        rh var2 = new rh((fj) this, ((fj) this).field_mb, qk.field_H);
        var2.a(gb.field_a, 15, -102);
        ((fj) this).a(false, (iq) (Object) var2);
    }

    public void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0 % ((param2 - -63) / 51);
        if (((fj) this).field_kb) {
            rh.b(-14, 3);
            ((fj) this).h((byte) 93);
        } else {
            gg.a("tochangedisplayname.ws", true, ob.e((byte) 77));
        }
    }

    public static void n(int param0) {
        int var1 = 106 / ((param0 - -20) / 39);
        field_lb = null;
        field_hb = null;
    }

    final void a(int param0, boolean param1, String param2) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (((fj) this).field_gb) {
            return;
        }
        ((fj) this).field_gb = param1 ? true : false;
        ((fj) this).field_kb = -257 == (param0 ^ -1) ? true : false;
        ((fj) this).field_fb.b(8405024, -117, 4210752);
        rh var6 = new rh((fj) this, ((fj) this).field_mb, param2);
        rh var4 = var6;
        if (5 == param0) {
            var6.a(jb.field_A, 11, -66);
            var6.a(jd.field_b, 17, -60);
        } else {
            if (256 == param0) {
                d discarded$1 = var6.a(bk.field_d, (uf) this, -109);
            } else {
                var6.a(!((fj) this).field_ib ? ap.field_f : bk.field_d, -1, -60);
            }
        }
        if (3 == param0) {
            var6.a(hb.field_o, 7, -82);
        } else {
            if (param0 == 4) {
                var6.a(so.field_z, 8, -58);
            } else {
                if (6 != param0) {
                    // if_icmpne L239
                    d discarded$2 = var6.a(s.field_v, (uf) this, -126);
                } else {
                    var6.a(hm.field_H, 9, -90);
                }
            }
        }
        ((fj) this).a(false, (iq) (Object) var6);
    }

    final static void g(byte param0) {
        km.a(af.field_H, true, true, mk.field_S);
        int var1 = 68 % ((-79 - param0) / 44);
        bf.field_a = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = "Mouse over an icon for details";
    }
}
