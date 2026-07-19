/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends or {
    static String field_o;
    private byte[] field_p;

    final static void f(int param0) {
        iu[] discarded$2 = null;
        String var2 = null;
        if (param0 != -804227775) {
          discarded$2 = pn.i(-62);
          var2 = (String) null;
          pr.a(0, "", (String) null);
          return;
        } else {
          var2 = (String) null;
          pr.a(0, "", (String) null);
          return;
        }
    }

    final void a(int param0, boolean param1, byte param2) {
        int incrementValue$2 = 0;
        int var4 = 0;
        if (param1) {
          return;
        } else {
          var4 = param0 * 2;
          param2 = (byte)(((255 & param2) >> -804227775) + 127);
          incrementValue$2 = var4;
          var4++;
          this.field_p[incrementValue$2] = (byte)param2;
          this.field_p[var4] = (byte)param2;
          return;
        }
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return (byte[]) null;
        } else {
          this.field_p = new byte[param2 * (param3 * param0 * 2)];
          this.a(param0, param2, param3, (byte) -119);
          return this.field_p;
        }
    }

    pn() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    public static void g(int param0) {
        if (param0 > -26) {
            return;
        }
        field_o = null;
    }

    final static iu[] i(int param0) {
        iu[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        boolean stackIn_4_0 = false;
        int stackIn_23_0 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_22_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 < 71) {
          return (iu[]) null;
        } else {
          var1 = new iu[fa.field_b];
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= fa.field_b) {
                  break L2;
                } else {
                  var3 = mq.field_b[var2] * iga.field_m[var2];
                  var18 = ck.field_c[var2];
                  stackOut_3_0 = qqa.field_n[var2];
                  stackIn_23_0 = stackOut_3_0 ? 1 : 0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (!stackIn_4_0) {
                            break L5;
                          } else {
                            var17 = pb.field_l[var2];
                            var14 = new int[var3];
                            var12 = var14;
                            var6_ref_int__ = var12;
                            var7 = 0;
                            L6: while (true) {
                              L7: {
                                if (var3 <= var7) {
                                  var1[var2] = (iu) ((Object) new mea(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var14));
                                  break L7;
                                } else {
                                  var6_ref_int__[var7] = fh.a(sea.c(-16777216, var17[var7] << -1203922312), mga.field_g[sea.c(255, (int) var18[var7])]);
                                  var7++;
                                  if (var8 != 0) {
                                    break L7;
                                  } else {
                                    continue L6;
                                  }
                                }
                              }
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var10 = new int[var3];
                        var6 = 0;
                        L8: while (true) {
                          if (var3 <= var6) {
                            var1[var2] = new iu(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var10);
                            break L4;
                          } else {
                            var10[var6] = mga.field_g[sea.c(255, (int) var18[var6])];
                            var6++;
                            if (var8 != 0) {
                              break L3;
                            } else {
                              continue L8;
                            }
                          }
                        }
                      }
                      var2++;
                      break L3;
                    }
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_22_0 = 2;
              stackIn_23_0 = stackOut_22_0;
              break L1;
            }
            loa.a((byte) stackIn_23_0);
            return var1;
          }
        }
    }

    final static boolean h(int param0) {
        boolean discarded$6 = false;
        if (param0 != 9807) {
            discarded$6 = pn.h(127);
            return bl.field_a != null ? true : false;
        }
        return bl.field_a != null ? true : false;
    }

    static {
        field_o = "Bags o' Loot";
    }
}
