/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static char[] field_f;
    static String field_a;
    static int[] field_g;
    static String field_d;
    static volatile int field_c;
    static String field_b;
    static qb field_e;

    final static String[] a(boolean param0, char param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0) {
            field_e = null;
        }
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = wa.a(param1, var10, (byte) -16);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    final static void b(byte param0) {
        ce var1 = (ce) (Object) lh.field_c.b(12623);
        int var2 = -104 % ((-41 - param0) / 40);
        if (var1 == null) {
            ka.b(false);
            return;
        }
        ab var3 = df.field_z;
        int discarded$0 = var3.d(-10674);
        int discarded$1 = var3.d(-10674);
        int discarded$2 = var3.d(-10674);
        int discarded$3 = var3.d(-10674);
        var1.a(true);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            eh.b((byte) -111);
        }
        if (!(!wh.field_g)) {
            return ln.field_U.a(ed.field_Bb, (byte) 123, vn.field_d);
        }
        if (oj.field_i) {
            return rg.a(param3, -14, param2);
        }
        if (rk.a((byte) -60, param3, param2)) {
            return true;
        }
        if (!(!ld.field_p)) {
            return false;
        }
        return ko.a(-110, param1, param2);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0, int param1, String param2) {
        CharSequence var7 = (CharSequence) (Object) param2;
        if (!(vn.a(var7, 0))) {
            return fn.field_h;
        }
        if (!(!je.a(16, param2))) {
            return sd.field_l;
        }
        if (!(jb.field_t == 2)) {
            return vi.field_K;
        }
        if (!(!sa.a(param2, 320))) {
            return tj.a(119, new String[1], sc.field_bb);
        }
        if (!((pc.field_b ^ -1) > -101)) {
            return nh.field_u;
        }
        if (!(!kl.a(param2, 1))) {
            return tj.a(114, new String[1], ga.field_q);
        }
        ab var6 = he.field_e;
        var6.b((byte) -67, param1);
        var6.field_g = var6.field_g + 1;
        int var4 = var6.field_g;
        var6.f(2, (byte) -70);
        if (param0 >= -14) {
            Object var5 = null;
            String[] discarded$0 = eh.a(false, '￞', (String) null);
        }
        var6.a(param2, 23333);
        var6.b(-var4 + var6.field_g, (byte) 43);
        return null;
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -93 % ((78 - param0) / 43);
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static boolean a(int param0, eg param1) {
        if (param0 != 18306) {
            eh.a((byte) 21);
        }
        return param1.a(-27);
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        kc stackIn_6_0 = null;
        kc stackIn_7_0 = null;
        kc stackIn_8_0 = null;
        kc stackIn_9_0 = null;
        kc stackIn_10_0 = null;
        kc stackIn_11_0 = null;
        kc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kc stackIn_13_0 = null;
        kc stackIn_14_0 = null;
        kc stackIn_15_0 = null;
        kc stackIn_16_0 = null;
        kc stackIn_17_0 = null;
        kc stackIn_18_0 = null;
        kc stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        kc stackIn_20_0 = null;
        kc stackIn_21_0 = null;
        kc stackIn_22_0 = null;
        kc stackIn_23_0 = null;
        kc stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        kc stackOut_5_0 = null;
        kc stackOut_6_0 = null;
        kc stackOut_7_0 = null;
        kc stackOut_8_0 = null;
        kc stackOut_9_0 = null;
        kc stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        kc stackOut_12_0 = null;
        kc stackOut_13_0 = null;
        kc stackOut_14_0 = null;
        kc stackOut_15_0 = null;
        kc stackOut_16_0 = null;
        kc stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        kc stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        kc stackOut_19_0 = null;
        kc stackOut_20_0 = null;
        kc stackOut_21_0 = null;
        kc stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        kc stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          vc.a((byte) -126);
          if (param2 == 4) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          if ((sk.field_e ^ -1) <= -1) {
            kg.field_c.field_rb = tj.a(-14, new String[1], gi.field_j);
            break L1;
          } else {
            kg.field_c.field_rb = null;
            break L1;
          }
        }
        L2: {
          L3: {
            stackOut_5_0 = k.field_d;
            stackIn_11_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              break L3;
            } else {
              stackOut_6_0 = (kc) (Object) stackIn_6_0;
              stackIn_11_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param1) {
                break L3;
              } else {
                stackOut_7_0 = (kc) (Object) stackIn_7_0;
                stackIn_11_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (pg.field_d) {
                  break L3;
                } else {
                  stackOut_8_0 = (kc) (Object) stackIn_8_0;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (null != wi.field_f) {
                    break L3;
                  } else {
                    stackOut_9_0 = (kc) (Object) stackIn_9_0;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (om.field_x != null) {
                      break L3;
                    } else {
                      stackOut_10_0 = (kc) (Object) stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_11_0 = (kc) (Object) stackIn_11_0;
          stackOut_11_1 = 0;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          break L2;
        }
        L4: {
          L5: {
            ((kc) (Object) stackIn_12_0).b(stackIn_12_1 != 0, (byte) 75);
            stackOut_12_0 = fn.field_e;
            stackIn_18_0 = stackOut_12_0;
            stackIn_13_0 = stackOut_12_0;
            if (!param0) {
              break L5;
            } else {
              stackOut_13_0 = (kc) (Object) stackIn_13_0;
              stackIn_18_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (param1) {
                break L5;
              } else {
                stackOut_14_0 = (kc) (Object) stackIn_14_0;
                stackIn_18_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (pg.field_d) {
                  break L5;
                } else {
                  stackOut_15_0 = (kc) (Object) stackIn_15_0;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (null != wi.field_f) {
                    break L5;
                  } else {
                    stackOut_16_0 = (kc) (Object) stackIn_16_0;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (null != om.field_x) {
                      break L5;
                    } else {
                      stackOut_17_0 = (kc) (Object) stackIn_17_0;
                      stackOut_17_1 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L4;
                    }
                  }
                }
              }
            }
          }
          stackOut_18_0 = (kc) (Object) stackIn_18_0;
          stackOut_18_1 = 0;
          stackIn_19_0 = stackOut_18_0;
          stackIn_19_1 = stackOut_18_1;
          break L4;
        }
        L6: {
          L7: {
            ((kc) (Object) stackIn_19_0).b(stackIn_19_1 != 0, (byte) 121);
            stackOut_19_0 = gm.field_h;
            stackIn_23_0 = stackOut_19_0;
            stackIn_20_0 = stackOut_19_0;
            if (!param0) {
              break L7;
            } else {
              stackOut_20_0 = (kc) (Object) stackIn_20_0;
              stackIn_23_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (param1) {
                break L7;
              } else {
                stackOut_21_0 = (kc) (Object) stackIn_21_0;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (!pg.field_d) {
                  break L7;
                } else {
                  stackOut_22_0 = (kc) (Object) stackIn_22_0;
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L6;
                }
              }
            }
          }
          stackOut_23_0 = (kc) (Object) stackIn_23_0;
          stackOut_23_1 = 0;
          stackIn_24_0 = stackOut_23_0;
          stackIn_24_1 = stackOut_23_1;
          break L6;
        }
        L8: {
          ((kc) (Object) stackIn_24_0).b(stackIn_24_1 != 0, (byte) 115);
          aj.field_h.field_c.h((byte) 100);
          if (0 == ii.field_b.field_U) {
            break L8;
          } else {
            dh.field_Mb = true;
            break L8;
          }
        }
        L9: {
          if (of.field_a.field_U == 0) {
            break L9;
          } else {
            L10: {
              if (gm.field_c) {
                break L10;
              } else {
                if (0 < ah.field_c) {
                  break L10;
                } else {
                  if (2 <= qf.field_d) {
                    if (ri.field_b[12]) {
                      break L10;
                    } else {
                      me.field_C = true;
                      break L9;
                    }
                  } else {
                    me.field_C = true;
                    break L9;
                  }
                }
              }
            }
            ib.a(param3, 0);
            break L9;
          }
        }
        L11: {
          if (0 != jl.field_a.field_U) {
            L12: {
              if ((ao.field_h.length ^ -1) != -2) {
                break L12;
              } else {
                if (ef.field_t != ao.field_h[0]) {
                  ef.field_t = ao.field_h[0];
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            dn.a(param2 + -13218, 0, ml.field_m, param3, ef.field_t, true);
            break L11;
          } else {
            break L11;
          }
        }
        L13: {
          if (0 != dm.field_E.field_U) {
            pg.field_d = false;
            break L13;
          } else {
            break L13;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Cancel rematch";
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_f = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[]{1, 2, 2, 3, 5, 10, 2, 2, 2, 2, 3, 3, 5, 5, 10, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 5, 1, 3, 1, 3, 1, 5, 3, 3, 5, 3, 1, 1, 5, 3, 5, 10, 10, 10, 1, 1, 1, 1, 1, 1, 5, 1, 2, 2, 2, 2, 2, 4, 4, 2, 2, 4, 5, 5, 1, 1, 4, 2, 3, 4, 1, 1, 4, 5, 2, 5, 1, 3, 3, 5, 1, 3, 1, 3, 3, 4, 2, 3, 3, 3};
        field_a = "Password: ";
        field_c = 0;
    }
}
