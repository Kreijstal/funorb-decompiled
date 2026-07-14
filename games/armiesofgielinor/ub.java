/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    private int field_c;
    private jr[] field_b;
    static boolean field_e;
    static String field_a;
    private int field_f;
    static int field_d;

    final static te a(byte param0, sn param1) {
        if (param0 <= 24) {
            return null;
        }
        return ne.a(-69, aa.a(param1, 100, 96));
    }

    final boolean b(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var6 = 0;
        if (param0 != 117) {
            Object var8 = null;
            te discarded$0 = ub.a((byte) 7, (sn) null);
        }
        while (((ub) this).field_c > var6) {
            if (((ub) this).field_b[var6].b(42, param4, param2, param3, param1)) {
                return ((ub) this).field_c >> 1452281729 < var6 ? true : false;
            }
            var6++;
        }
        return false;
    }

    final int a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= -92) {
            field_d = 33;
        }
        for (var6 = 0; ((ub) this).field_c > var6; var6++) {
            if (!(!((ub) this).field_b[var6].b(71, param3, param4, param2, param1))) {
                return ((ub) this).field_b[var6].field_i;
            }
        }
        return -1;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jr stackIn_6_0 = null;
        jr stackIn_7_0 = null;
        jr stackIn_8_0 = null;
        jr stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        jr stackOut_5_0 = null;
        jr stackOut_6_0 = null;
        jr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        jr stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = param2[6];
        var7 = 0;
        L0: while (true) {
          if (((ub) this).field_c <= var7) {
            L1: {
              if (param1 == -23451) {
                break L1;
              } else {
                boolean discarded$1 = ((ub) this).b((byte) 112, 3, 116, -86, -110);
                break L1;
              }
            }
            return;
          } else {
            if (!((ub) this).field_b[var7].field_a) {
              if (((ub) this).field_b[var7].field_c == 0) {
                ((ub) this).field_b[var7].a(var6, param4 + 16, false, param3 + 16);
                var7++;
                continue L0;
              } else {
                ((ub) this).field_b[var7].a(param2[-1 + ((ub) this).field_b[var7].field_c], param4 + 16, false, param3 + 16);
                var7++;
                continue L0;
              }
            } else {
              L2: {
                if (-1 == bw.field_m[((ub) this).field_b[var7].field_i][1]) {
                  break L2;
                } else {
                  var6 = param2[bw.field_m[((ub) this).field_b[var7].field_i][1]];
                  break L2;
                }
              }
              L3: {
                L4: {
                  stackOut_5_0 = ((ub) this).field_b[var7];
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (param0 < bw.field_m[((ub) this).field_b[var7].field_i][8]) {
                    break L4;
                  } else {
                    stackOut_6_0 = (jr) (Object) stackIn_6_0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 < bw.field_m[((ub) this).field_b[var7].field_i][2]) {
                      break L4;
                    } else {
                      stackOut_7_0 = (jr) (Object) stackIn_7_0;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                }
                stackOut_8_0 = (jr) (Object) stackIn_8_0;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              }
              ((jr) (Object) stackIn_9_0).a(stackIn_9_1, 16 + param4, false, param3 - -16);
              var7++;
              continue L0;
            }
          }
        }
    }

    final static String a(byte param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param1) {
            break L0;
          } else {
            if (-4 < (param1 ^ -1)) {
              var2 = "";
              if (param0 >= 19) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= cd.field_a[param1].field_n.length) {
                    return var2;
                  } else {
                    var2 = var2 + var3 + ": " + cd.field_a[param1].field_n[var3].field_J + "\n";
                    var3++;
                    continue L1;
                  }
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
        }
        return "Unkown Campaign " + param1;
    }

    final jr a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = 0;
          if (param1 == -15050) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 < ((ub) this).field_c) {
            if (param0 != ((ub) this).field_b[var3].field_i) {
              var3++;
              continue L1;
            } else {
              return ((ub) this).field_b[var3];
            }
          } else {
            return null;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ij.field_w = !param1 ? new ea(ob.field_O, eb.field_c) : new ea(ur.field_x, uj.field_l);
        if (param0) {
            return;
        }
        lk.field_a = new je(0L, (je) null);
        lk.field_a.a((je) (Object) ij.field_w.field_a, 126);
        lk.field_a.a(mp.field_Lb, 97);
        ta.field_R = new je(0L, jm.field_b);
        df.field_K = new je(0L, (je) null);
        ta.field_R.a(bk.field_f, 54);
        ta.field_R.a(df.field_K, 70);
        df.field_K.a(nf.field_Kb, 112);
        df.field_K.a(dv.field_m, 74);
        je.a(27, param1);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -122) {
            field_a = null;
        }
    }

    ub(int param0, jr[] param1, boolean param2) {
        int var4 = 0;
        ((ub) this).field_c = param1.length;
        ((ub) this).field_f = param0;
        ((ub) this).field_b = param1;
        for (var4 = 0; var4 < ((ub) this).field_c; var4++) {
            ((ub) this).field_b[var4].field_b = (param2 ? 1 : -1) * (int)(Math.sin(2.0 * (3.141592653589793 * (double)var4) / (double)((ub) this).field_c) * (double)((ub) this).field_f);
            ((ub) this).field_b[var4].field_g = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)var4) / (double)((ub) this).field_c) * (double)((ub) this).field_f);
        }
    }

    final static vb a(oj param0, ha param1, boolean param2, int param3, ic param4, int param5, int param6, eo param7) {
        int var8 = -39 / ((-87 - param5) / 33);
        vb var9 = new vb(param4, param1, param7, param0, param6, param3, param2);
        if (!var9.b(param6, param3, true)) {
            return null;
        }
        return var9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Portal";
    }
}
