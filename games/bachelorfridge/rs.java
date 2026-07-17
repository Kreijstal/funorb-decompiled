/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    int field_i;
    private int field_b;
    static String field_h;
    static lr[] field_g;
    static int field_c;
    static int field_a;
    static kv field_f;
    String field_d;
    String field_e;

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            if (~iba.field_s != ~kaa.field_m) {
              L1: {
                if (!tn.a(iba.field_s, 124)) {
                  break L1;
                } else {
                  eg.field_p[iba.field_s].j(-5);
                  break L1;
                }
              }
              L2: {
                ip.a((byte) 22, kaa.field_m);
                iba.field_s = kaa.field_m;
                vla.field_w = sia.field_h;
                tma.field_v = 0;
                if (kaa.field_m == 1) {
                  break L2;
                } else {
                  if (kaa.field_m == -3) {
                    break L2;
                  } else {
                    ct.c(0, -114);
                    break L2;
                  }
                }
              }
              L3: {
                if (param0) {
                  break L3;
                } else {
                  field_h = null;
                  break L3;
                }
              }
              L4: {
                if (nu.field_b) {
                  nu.field_b = false;
                  gs.field_f = null;
                  dj.field_c = null;
                  sna.field_fb = null;
                  baa.e(17035);
                  iba.d(34);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (ai.field_c) {
                  tla.field_q = new eaa();
                  var13 = sg.field_q;
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var4 = var7;
                  var1_array = var4;
                  var2 = 0;
                  L6: while (true) {
                    if (var2 >= 8) {
                      var14 = nga.field_i;
                      var12 = var14;
                      var10 = var12;
                      var8 = var10;
                      var5 = var8;
                      var1_array = var5;
                      var6 = 0;
                      var2 = var6;
                      L7: while (true) {
                        if (var6 >= 8) {
                          ai.field_c = false;
                          break L5;
                        } else {
                          var14[var6] = 0;
                          var6++;
                          continue L7;
                        }
                      }
                    } else {
                      var13[var2] = 0;
                      var2++;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L8: {
                if (ge.field_D) {
                  ih.d((byte) -109);
                  oga.e(46);
                  eo.c(106);
                  ge.field_D = false;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (iba.field_s == 12) {
                  tla.d(-89);
                  break L9;
                } else {
                  if (iba.field_s == 0) {
                    tla.d(-89);
                    break L9;
                  } else {
                    if (iba.field_s != -2) {
                      break L9;
                    } else {
                      tla.d(-89);
                      break L9;
                    }
                  }
                }
              }
              L10: {
                L11: {
                  if (iba.field_s == 0) {
                    break L11;
                  } else {
                    if (kaa.field_m != -3) {
                      break L11;
                    } else {
                      if (iba.field_s == 12) {
                        break L11;
                      } else {
                        ena.a((byte) -44, wha.field_a);
                        break L10;
                      }
                    }
                  }
                }
                if (kaa.field_m != -1) {
                  break L10;
                } else {
                  hba.a(true, wha.field_a);
                  break L10;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "rs.D(" + param0 + 41);
        }
    }

    final static boolean b(boolean param0) {
        return null != pja.field_e && null != pja.field_e.h(0);
    }

    final static vr a(int param0, boolean param1, int param2, boolean param3, int param4) {
        if (param2 != 0) {
            rs.a(false);
        }
        return qma.a(param3, 2097152, false, param0, param1, param4);
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_h = null;
    }

    rs(int param0, int param1) {
        ((rs) this).field_i = param1;
        ((rs) this).field_b = param0;
        ((rs) this).field_d = kna.field_g[((rs) this).field_b];
        ((rs) this).field_e = c.field_k[((rs) this).field_b];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You can spectate this game";
    }
}
