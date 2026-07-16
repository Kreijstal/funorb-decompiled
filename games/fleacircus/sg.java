/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private String field_m;
    String field_l;
    static dd field_f;
    private int field_d;
    static String field_a;
    int field_j;
    int[] field_c;
    static rd field_i;
    private boolean field_k;
    int field_e;
    int field_b;
    private long field_g;
    static td field_h;

    final static pd a(byte param0, ie param1) {
        if (param0 != 20) {
            return null;
        }
        pd var2 = new pd(param1, (lh) (Object) param1);
        bk.field_d.a(false, (lh) (Object) var2);
        qg.field_f.a((sh) (Object) param1);
        return var2;
    }

    final static boolean a(char param0, byte param1) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (!(!ii.a(param1 + 96, param0))) {
            return true;
        }
        char[] var2 = ei.field_m;
        int var3 = 0;
        if (param1 != -95) {
            sg discarded$0 = sg.a(false, -117);
        }
        while (var2.length > var3) {
            var4 = var2[var3];
            if (param0 == var4) {
                return true;
            }
            var3++;
        }
        char[] var6 = sa.field_a;
        var2 = var6;
        int var7 = 0;
        var3 = var7;
        while (var7 < var6.length) {
            var4 = var6[var7];
            if (var4 == param0) {
                return true;
            }
            var7++;
        }
        return false;
    }

    final static sg a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ih var8 = null;
        aj var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          var8 = ae.field_a;
          var3 = var8.e(false);
          if (0 == (var3 & 128)) {
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
          ll.field_j = stackIn_3_0 != 0;
          d.field_N = 127 & var3;
          gm.field_ob = var8.e(false);
          ki.field_b = var8.f(-83);
          if ((d.field_N ^ -1) == -3) {
            ga.field_o = var8.d((byte) -60);
            jd.field_t = var8.c(true);
            break L1;
          } else {
            jd.field_t = 0;
            ga.field_o = 0;
            break L1;
          }
        }
        L2: {
          if ((var8.e(false) ^ -1) != -2) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          ci.field_e = var8.h(0);
          if (var4 == 0) {
            qi.field_d = ci.field_e;
            break L3;
          } else {
            qi.field_d = var8.h(0);
            break L3;
          }
        }
        L4: {
          L5: {
            if (-2 == (d.field_N ^ -1)) {
              break L5;
            } else {
              if (-5 == (d.field_N ^ -1)) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          int discarded$2 = var8.d((byte) -121);
          String discarded$3 = var8.h(0);
          break L4;
        }
        L6: {
          if (param1 >= 22) {
            break L6;
          } else {
            field_f = null;
            break L6;
          }
        }
        L7: {
          if (param0) {
            var5 = var8.d((byte) 59);
            try {
              L8: {
                L9: {
                  var9 = nf.field_F.a(32768, var5);
                  wf.field_d = var9.c((byte) 103);
                  if (qi.field_d.equals((Object) (Object) b.field_e)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                    break L9;
                  } else {
                    stackOut_22_0 = var9.field_z;
                    stackIn_24_0 = stackOut_22_0;
                    break L9;
                  }
                }
                l.field_c = stackIn_24_0;
                break L8;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L10: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ud.a("CC1", (Throwable) (Object) var6, 0);
                l.field_c = null;
                wf.field_d = null;
                break L10;
              }
            }
            break L7;
          } else {
            wf.field_d = tf.a((ni) (Object) var8, 0, 80);
            l.field_c = null;
            break L7;
          }
        }
        return new sg(param0);
    }

    final int b(int param0) {
        L0: {
          if (((sg) this).field_k) {
            break L0;
          } else {
            L1: {
              if (-3 != (((sg) this).field_j ^ -1)) {
                break L1;
              } else {
                if (0 < ((sg) this).field_d) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (jc.field_b == ((sg) this).field_g) {
              return 1;
            } else {
              L2: {
                if (-3 != (nb.field_i ^ -1)) {
                  break L2;
                } else {
                  if (ef.a((byte) 119, ((sg) this).field_m)) {
                    return 1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param0 == 0) {
                return 0;
              } else {
                int discarded$2 = ((sg) this).b(53);
                return 0;
              }
            }
          }
        }
        return 2;
    }

    public static void a(int param0) {
        field_i = null;
        field_f = null;
        if (param0 != -3) {
            sg.a(-59);
        }
        field_h = null;
        field_a = null;
    }

    private sg(boolean param0) {
        if (!param0) {
            ((sg) this).field_c = null;
        } else {
            ((sg) this).field_c = l.field_c;
        }
        ((sg) this).field_j = d.field_N;
        ((sg) this).field_e = jd.field_t;
        ((sg) this).field_l = wf.field_d;
        ((sg) this).field_g = ki.field_b;
        ((sg) this).field_b = ga.field_o;
        ((sg) this).field_k = ll.field_j;
        ((sg) this).field_m = qi.field_d;
        ((sg) this).field_d = gm.field_ob;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new rd();
    }
}
