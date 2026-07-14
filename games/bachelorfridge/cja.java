/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja extends bca {
    int field_u;
    int field_s;
    static int field_v;
    static String field_r;
    int field_q;
    static String field_t;

    final void a(op param0, int param1) {
        int var3 = -69 % ((param1 - 12) / 35);
        ((cja) this).a(param0, (byte) -2);
        param0.b((byte) -64, ((cja) this).field_q, ((cja) this).field_s, ((cja) this).field_u);
    }

    cja(lu param0) {
        super(param0);
        ((cja) this).field_k = param0.e((byte) 105);
        ((cja) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((cja) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((cja) this).field_s = param0.b(16711935);
        ((cja) this).field_u = param0.b(16711935);
        ((cja) this).field_q = param0.b(16711935);
    }

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        if (param0 != -23353) {
            field_v = 32;
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          cja.a((uha) null, (lu) null, 81, true);
          return (at) (Object) new mm(param1, (cja) this);
        } else {
          return (at) (Object) new mm(param1, (cja) this);
        }
    }

    cja(int param0, nq param1) {
        super(param0, param1);
    }

    final static void a(int param0, kv param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          param4 = param4 + param1.field_u;
          param3 = param3 + param1.field_t;
          var5 = param3 - -(param4 * dg.field_i);
          var6 = 0;
          var7 = param1.field_p;
          var8 = param1.field_q;
          var9 = -var8 + dg.field_i;
          if (dg.field_j > param4) {
            var11 = -param4 + dg.field_j;
            var7 = var7 - var11;
            var6 = var6 + var8 * var11;
            param4 = dg.field_j;
            var5 = var5 + dg.field_i * var11;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var10 = 0;
          if (param3 >= dg.field_f) {
            break L1;
          } else {
            var11 = -param3 + dg.field_f;
            var6 = var6 + var11;
            var9 = var9 + var11;
            var8 = var8 - var11;
            var10 = var10 + var11;
            param3 = dg.field_f;
            var5 = var5 + var11;
            break L1;
          }
        }
        L2: {
          if (dg.field_k < var7 + param4) {
            var7 = var7 - (-dg.field_k + (param4 + var7));
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (dg.field_h >= var8 + param3) {
            break L3;
          } else {
            var11 = -dg.field_h + (var8 + param3);
            var9 = var9 + var11;
            var8 = var8 - var11;
            var10 = var10 + var11;
            break L3;
          }
        }
        if (-1 > (var8 ^ -1)) {
          if (0 < var7) {
            if (param2 > -103) {
              return;
            } else {
              el.a(var8, var6, var9, var5, 125, param0, dg.field_e, param1.field_v, var10, var7);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(uha param0, lu param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        uha stackIn_4_0 = null;
        uha stackIn_5_0 = null;
        uha stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        uha stackIn_7_0 = null;
        uha stackIn_8_0 = null;
        uha stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        uha stackIn_10_0 = null;
        uha stackIn_11_0 = null;
        uha stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        uha stackIn_13_0 = null;
        uha stackIn_14_0 = null;
        uha stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uha stackIn_18_0 = null;
        uha stackIn_19_0 = null;
        uha stackIn_20_0 = null;
        uha stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        uha stackIn_22_0 = null;
        uha stackIn_23_0 = null;
        uha stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        uha stackOut_3_0 = null;
        uha stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        uha stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        uha stackOut_6_0 = null;
        uha stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        uha stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        uha stackOut_9_0 = null;
        uha stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        uha stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        uha stackOut_12_0 = null;
        uha stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uha stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        uha stackOut_17_0 = null;
        uha stackOut_18_0 = null;
        uha stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        uha stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        uha stackOut_21_0 = null;
        uha stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        uha stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param3) {
            param0.field_Rb = param1.b(16711935);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          param0.field_Pb = param1.b(16711935);
          param0.field_Kb = param1.b(16711935);
          var4 = param1.b(16711935);
          stackOut_3_0 = (uha) param0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 == (128 & var4)) {
            stackOut_5_0 = (uha) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = (uha) (Object) stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((uha) (Object) stackIn_6_0).field_Bb = stackIn_6_1 != 0;
          stackOut_6_0 = (uha) param0;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if ((32 & var4) == -1) {
            stackOut_8_0 = (uha) (Object) stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = (uha) (Object) stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((uha) (Object) stackIn_9_0).field_dc = stackIn_9_1 != 0;
          stackOut_9_0 = (uha) param0;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (-1 != (16 & var4)) {
            stackOut_11_0 = (uha) (Object) stackIn_11_0;
            stackOut_11_1 = 2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = (uha) (Object) stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((uha) (Object) stackIn_12_0).field_Lb = stackIn_12_1;
          stackOut_12_0 = (uha) param0;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if (0 == (var4 & 64)) {
            stackOut_14_0 = (uha) (Object) stackIn_14_0;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L4;
          } else {
            stackOut_13_0 = (uha) (Object) stackIn_13_0;
            stackOut_13_1 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L4;
          }
        }
        ((uha) (Object) stackIn_15_0).field_Zb = stackIn_15_1 != 0;
        if (param2 >= 47) {
          L5: {
            L6: {
              stackOut_17_0 = (uha) param0;
              stackIn_20_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param0.field_Bb) {
                break L6;
              } else {
                stackOut_18_0 = (uha) (Object) stackIn_18_0;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (param0.field_Pb <= param0.field_Rb) {
                  break L6;
                } else {
                  stackOut_19_0 = (uha) (Object) stackIn_19_0;
                  stackOut_19_1 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L5;
                }
              }
            }
            stackOut_20_0 = (uha) (Object) stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L5;
          }
          L7: {
            ((uha) (Object) stackIn_21_0).field_zb = stackIn_21_1 != 0;
            stackOut_21_0 = (uha) param0;
            stackIn_23_0 = stackOut_21_0;
            stackIn_22_0 = stackOut_21_0;
            if ((var4 & 8) == 0) {
              stackOut_23_0 = (uha) (Object) stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L7;
            } else {
              stackOut_22_0 = (uha) (Object) stackIn_22_0;
              stackOut_22_1 = 1;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              break L7;
            }
          }
          L8: {
            ((uha) (Object) stackIn_24_0).field_Fb = stackIn_24_1 != 0;
            if (0 == (var4 & 4)) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L8;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
              break L8;
            }
          }
          L9: {
            var5 = stackIn_27_0;
            if ((var4 & 2) == 0) {
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L9;
            } else {
              stackOut_28_0 = 1;
              stackIn_30_0 = stackOut_28_0;
              break L9;
            }
          }
          var6 = stackIn_30_0;
          param1.a(param0.field_Eb, param0.field_Eb.length, 128, 0);
          param0.field_bc = param1.e((byte) 64);
          param0.field_Ob = f.b((byte) 73) + -(long)param1.f(-124);
          if (var5 == 0) {
            param0.field_Nb = -1;
            param0.field_Sb = param1.c(-120);
            var7 = param1.field_g;
            param0.field_Jb = param1.g(-87);
            if (var6 != 0) {
              param0.field_Cb = new String[param0.field_Rb];
              param1.field_g = var7;
              var8 = 0;
              L10: while (true) {
                if (param0.field_Rb > var8) {
                  param0.field_Cb[var8] = param1.g(-88);
                  var8++;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              param0.field_Cb = null;
              return;
            }
          } else {
            param0.field_Nb = param1.f(51);
            param0.field_Sb = param1.c(-120);
            var7 = param1.field_g;
            param0.field_Jb = param1.g(-87);
            if (var6 != 0) {
              param0.field_Cb = new String[param0.field_Rb];
              param1.field_g = var7;
              var8 = 0;
              L11: while (true) {
                if (param0.field_Rb > var8) {
                  param0.field_Cb[var8] = param1.g(-88);
                  var8++;
                  continue L11;
                } else {
                  return;
                }
              }
            } else {
              param0.field_Cb = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -47, param1);
        param1.d(((cja) this).field_s, 0);
        param1.d(((cja) this).field_u, 0);
        if (param0 > -12) {
          return;
        } else {
          param1.d(((cja) this).field_q, 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Lobby";
        field_v = 22;
        field_t = "Fruit & Veg";
    }
}
