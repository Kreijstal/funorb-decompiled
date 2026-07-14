/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oma implements ntb, mfa {
    private int field_d;
    int field_k;
    boolean field_e;
    int field_g;
    int field_a;
    static String field_b;
    mib field_l;
    int field_j;
    static String field_c;
    int field_f;
    String[] field_h;
    static float field_i;

    public final void a(String param0, int param1, byte param2) {
        ((oma) this).field_h[param1] = param0;
        if (param2 >= -112) {
            rsb discarded$0 = ((oma) this).b(96);
        }
    }

    public final void a(faa param0, boolean param1) {
        nkb.a(param1, "Starting to read");
        if (kv.a(false, param0)) {
            ((oma) this).field_l = new mib((mfa) this);
            ((oma) this).field_l.a(param0, false);
        } else {
            ((oma) this).field_l = null;
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 <= 54) {
            String discarded$0 = ((oma) this).a(125, -119);
        }
        oma var3 = (oma) (Object) param1;
        if (null != var3.field_l) {
            if (!(null != var3.field_l)) {
                var3.field_l = new mib((mfa) this);
            }
            var3.field_l.b((byte) 91, (tv) (Object) var3.field_l);
        } else {
            var3.field_l = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 28801) {
            oma.a(false);
        }
        field_b = null;
        field_c = null;
    }

    final void c(int param0) {
        pr.field_c = (oma) this;
        ((oma) this).field_l.a(kdb.field_o, (byte) 106);
        int var2 = 5 % ((67 - param0) / 57);
    }

    final pe a(byte param0) {
        if (param0 < 20) {
            field_i = 1.3303049802780151f;
        }
        return ((rsb) (Object) ((oma) this).field_l.b(28120)).field_g;
    }

    final void a(int param0, faa param1) {
        if (param0 > -39) {
            return;
        }
        nc.b(0);
        param1.f((byte) -50);
        int var3 = param1.field_e;
        param1.p(-23497);
        ((oma) this).a(param1, false);
        param1.f((byte) -47);
        int var4 = k.a((byte) -69, param1.field_e, param1.field_h, var3);
        int var5 = param1.h(97);
        if (var5 == var4) {
            nkb.a(false, "cg readstate: Hmm, it seems correct");
        }
        param1.p(-23497);
        nkb.a(false, "has read state");
    }

    public final void a(tv param0, int param1) {
        if (param1 >= -19) {
            oma.a(7);
        }
        oma var5 = (oma) (Object) param0;
        if (null != var5.field_l) {
            if (null != var5.field_l) {
                var5.field_l.a((tv) (Object) var5.field_l, -91);
            }
        }
        int var4 = 0;
        mib discarded$0 = var5.field_l;
        if (var5.field_l != null) {
            if (var5.field_l.a((byte) 106, (tv) (Object) var5.field_l)) {
                var4 = 1;
                System.out.println("Carousel_commongame_Info carousel_info has changed. before=" + var5.field_l + ", now=" + var5.field_l);
            }
        }
        if (var4 != 0) {
            System.out.println("This instance of commongame has changed");
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        if (!(vq.a(param0, -107, null == ((oma) this).field_l ? true : false))) {
            ((oma) this).field_l.b(param0, -114);
        }
    }

    public final String a(int param0, int param1) {
        if (foa.field_p == param0) {
            if (!((oma) this).b(1).a(param1, (byte) 59).field_a) {
                return "Bot " + param1;
            }
        }
        if (((oma) this).field_h[param1] == null) {
            return "Unknown";
        }
        return ((oma) this).field_h[param1];
    }

    final static void a(float[] param0, int param1, float param2, float[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        L0: {
          var18 = VoidHunters.field_G;
          param1 = param1 - param4;
          param8 = param8 - param7;
          param5 = param5 - param10;
          var11 = param0[1] * (float)param8 + (float)param5 * param0[0] + (float)param1 * param0[2];
          var12 = param0[3] * (float)param5 + param0[4] * (float)param8 + (float)param1 * param0[5];
          var13 = (float)param1 * param0[8] + (param0[7] * (float)param8 + (float)param5 * param0[6]);
          var14 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
          var15 = 0.5f + (float)Math.atan2((double)var11, (double)var13) / 6.2831854820251465f;
          var16 = (float)Math.asin((double)(var12 / var14)) / 3.1415927410125732f + 0.5f + param2;
          if (1 != param9) {
            if ((param9 ^ -1) == -3) {
              var15 = -var15;
              var16 = -var16;
              break L0;
            } else {
              if (3 == param9) {
                var17 = var15;
                var15 = var16;
                var16 = -var17;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var17 = var15;
            var15 = -var16;
            var16 = var17;
            break L0;
          }
        }
        L1: {
          param3[1] = var16;
          param3[0] = var15;
          if (param6 == -82) {
            break L1;
          } else {
            field_c = null;
            break L1;
          }
        }
    }

    final static void a(boolean param0) {
        sl.a((byte) -28, tha.field_o);
        if (!param0) {
            field_i = 0.1389508843421936f;
        }
    }

    public final boolean a(byte param0, tv param1) {
        oma var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = (oma) (Object) param1;
          var4 = -29 % ((22 - param0) / 59);
          if (var3.field_l != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (((oma) this).field_l != null) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          L3: {
            if ((stackIn_6_0 ^ stackIn_6_1) != 0) {
              break L3;
            } else {
              L4: {
                if (null == ((oma) this).field_l) {
                  break L4;
                } else {
                  if (!((oma) this).field_l.a((byte) -75, (tv) (Object) var3.field_l)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L2;
        }
        return stackIn_12_0 != 0;
    }

    final rsb b(int param0) {
        if (param0 != 1) {
            pe discarded$0 = ((oma) this).a((byte) -95);
        }
        return (rsb) (Object) ((oma) this).field_l.b(28120);
    }

    oma(String[] param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        rsb var10 = null;
        hkb var11 = null;
        rsb var12 = null;
        hkb var13 = null;
        bba var14 = null;
        crb var15 = null;
        crb var16 = null;
        bea var17 = null;
        bha stackIn_12_0 = null;
        bha stackIn_13_0 = null;
        bha stackIn_14_0 = null;
        bha stackIn_15_0 = null;
        bha stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        bha stackOut_11_0 = null;
        bha stackOut_12_0 = null;
        bha stackOut_13_0 = null;
        bha stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        bha stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            pr.field_c = (oma) this;
            ((oma) this).field_a = param0.length;
            ((oma) this).field_d = param3;
            ((oma) this).field_h = param0;
            ((oma) this).field_g = param2;
            ((oma) this).field_l = new mib((mfa) this, param4);
            ((oma) this).field_l.b(((oma) this).field_a, 107);
            var10 = (rsb) (Object) ((oma) this).field_l.b(28120);
            var12 = var10;
            if (((oma) this).field_g == 0) {
              break L1;
            } else {
              if ((((oma) this).field_g ^ -1) != -2) {
                if (((oma) this).field_g == 2) {
                  var12.field_e.a(((oma) this).field_d, 1, 13);
                  var17 = new bea();
                  var17.field_d = ((oma) this).field_d;
                  var17.a(-89, var12);
                  var12.field_e.c(5, -7, 0);
                  break L0;
                } else {
                  if (-4 != (((oma) this).field_g ^ -1)) {
                    break L0;
                  } else {
                    var12.field_e.c(5, -7, 0);
                    var12.field_g.b(13, (byte) 23);
                    var14 = new bba();
                    var14.a((byte) -117, (wm) (Object) new dab(1));
                    var14.a((rna) (Object) new cf(0, 10), true);
                    var12.field_g.a(var14, -38);
                    var15 = new crb(new ml(54));
                    var15.a(65536, 81920, (byte) -60);
                    var12.field_g.a((byte) 126, var15);
                    var16 = new crb(new ml(50));
                    var16.a(-131072, 65536, (byte) 69);
                    var12.field_g.a((byte) 126, var16);
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          if (!unb.field_o) {
            var13 = bkb.a(0);
            var13.a(false, var12, -48);
            break L0;
          } else {
            var11 = pba.b(false).a(3, false);
            var11.a(false, var12, 126);
            break L0;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (var7 >= ((oma) this).field_a) {
          } else {
            L3: {
              L4: {
                stackOut_11_0 = var10.field_c[var7];
                stackIn_15_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (null == ((oma) this).field_h[var7]) {
                  break L4;
                } else {
                  stackOut_12_0 = (bha) (Object) stackIn_12_0;
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (0 >= ((oma) this).field_h[var7].length()) {
                    break L4;
                  } else {
                    stackOut_13_0 = (bha) (Object) stackIn_13_0;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if ((1 << var7 & ((oma) this).field_j) != 0) {
                      break L4;
                    } else {
                      stackOut_14_0 = (bha) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L3;
                    }
                  }
                }
              }
              stackOut_15_0 = (bha) (Object) stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L3;
            }
            stackIn_16_0.field_a = stackIn_16_1 != 0;
            var7++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Next condition/action value";
        field_c = "Creating your account";
        field_i = 0.5f;
    }
}
