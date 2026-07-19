/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends fb {
    byte[] field_p;
    gf field_t;
    static am field_s;
    static int[] field_u;
    int field_q;
    static int[] field_v;
    static kj field_o;
    static int field_r;

    final byte[] e(int param0) {
        if (this.field_j) {
            throw new RuntimeException();
        }
        int var2 = -15 / ((25 - param0) / 41);
        return this.field_p;
    }

    final static hl a(boolean param0, int param1) {
        cd[] discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        int discarded$8 = 0;
        String discarded$9 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hb var8 = null;
        pi var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_29_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_28_0 = null;
        Object stackOut_27_0 = null;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          var8 = MonkeyPuzzle2.field_D;
          var3 = var8.a((byte) 114);
          if (-1 == (128 & var3 ^ -1)) {
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
          eg.field_j = stackIn_3_0 != 0;
          lf.field_c = var3 & 127;
          if (param1 == 0) {
            break L1;
          } else {
            discarded$5 = si.f(78);
            break L1;
          }
        }
        L2: {
          L3: {
            o.field_c = var8.a((byte) 114);
            bi.field_z = var8.i(66);
            if (2 == lf.field_c) {
              break L3;
            } else {
              sd.field_b = 0;
              c.field_b = 0;
              if (var7 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          sd.field_b = var8.j(param1 + 17277);
          c.field_b = var8.c((byte) 115);
          break L2;
        }
        L4: {
          if ((var8.a((byte) 114) ^ -1) != -2) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        L5: {
          var4 = stackIn_12_0;
          lc.field_h = var8.f(-1);
          if (var4 != 0) {
            i.field_h = var8.f(-1);
            break L5;
          } else {
            i.field_h = lc.field_h;
            if (var7 == 0) {
              break L5;
            } else {
              i.field_h = var8.f(-1);
              break L5;
            }
          }
        }
        L6: {
          if ((lf.field_c ^ -1) == -2) {
            discarded$6 = var8.j(17277);
            discarded$7 = var8.f(-1);
            break L6;
          } else {
            if (lf.field_c != 4) {
              break L6;
            } else {
              discarded$8 = var8.j(17277);
              discarded$9 = var8.f(-1);
              break L6;
            }
          }
        }
        L7: {
          L8: {
            if (param0) {
              break L8;
            } else {
              ba.field_h = ea.a((byte) 90, var8, 80);
              wh.field_e = null;
              if (var7 == 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          var5 = var8.j(17277);
          try {
            L9: {
              L10: {
                var9 = hi.field_a.a(var5, param1 ^ -32769);
                ba.field_h = var9.b((byte) -54);
                if (!i.field_h.equals(cl.field_e)) {
                  stackOut_28_0 = var9.field_q;
                  stackIn_29_0 = stackOut_28_0;
                  break L10;
                } else {
                  stackOut_27_0 = null;
                  stackIn_29_0 = (int[]) ((Object) stackOut_27_0);
                  break L10;
                }
              }
              wh.field_e = stackIn_29_0;
              decompiledRegionSelector0 = 0;
              break L9;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L11: {
              var6 = (Exception) (Object) decompiledCaughtException;
              kk.a("CC1", (byte) 123, (Throwable) ((Object) var6));
              ba.field_h = null;
              wh.field_e = null;
              decompiledRegionSelector0 = 1;
              break L11;
            }
          }
          if (decompiledRegionSelector0 == 0) {
            return new hl(param0);
          } else {
            break L7;
          }
        }
        return new hl(param0);
    }

    final static cd[] f(int param0) {
        if (param0 != 0) {
          field_v = (int[]) null;
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        } else {
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        }
    }

    public static void b(byte param0) {
        cd[] discarded$2 = null;
        if (param0 != 20) {
          discarded$2 = si.f(-27);
          field_v = null;
          field_s = null;
          field_o = null;
          field_u = null;
          return;
        } else {
          field_v = null;
          field_s = null;
          field_o = null;
          field_u = null;
          return;
        }
    }

    final int a(boolean param0) {
        cd[] discarded$5 = null;
        if (param0) {
          if (this.field_j) {
            return 0;
          } else {
            return 100;
          }
        } else {
          discarded$5 = si.f(-82);
          if (this.field_j) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    si() {
    }

    static {
        field_u = new int[4];
        field_v = new int[5];
        field_s = new am();
        field_r = 0;
    }
}
