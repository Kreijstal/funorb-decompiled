/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kqa {
    private int[] field_c;
    int[] field_b;
    static fia field_a;
    int[] field_e;
    private ff field_d;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = -103 % ((-35 - param0) / 39);
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((kqa) this).field_d.field_H.length) {
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((kqa) this).field_e.length) {
                L2: {
                  if (var3 == 0) {
                    break L2;
                  } else {
                    var10 = 0;
                    var4 = var10;
                    L3: while (true) {
                      if (var10 >= ((kqa) this).field_e.length) {
                        break L2;
                      } else {
                        ((kqa) this).field_b[((kqa) this).field_e[var10]] = var10;
                        var10++;
                        continue L3;
                      }
                    }
                  }
                }
                return;
              } else {
                var5 = var4;
                L4: while (true) {
                  if (var5 >= ((kqa) this).field_e.length) {
                    var4++;
                    continue L1;
                  } else {
                    L5: {
                      var6 = ((kqa) this).field_e[var4];
                      var7 = ((kqa) this).field_e[var5];
                      var8 = 0;
                      if (((kqa) this).field_c[var7] < ((kqa) this).field_c[var6]) {
                        var8 = 1;
                        break L5;
                      } else {
                        if (((kqa) this).field_c[var6] != ((kqa) this).field_c[var7]) {
                          break L5;
                        } else {
                          if (((kqa) this).field_d.field_G[var7].field_c < ((kqa) this).field_d.field_G[var6].field_c) {
                            var8 = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var8 != 0) {
                      ((kqa) this).field_e[var4] = var7;
                      var3 = 1;
                      ((kqa) this).field_e[var5] = var6;
                      var5++;
                      continue L4;
                    } else {
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            L6: {
              stackOut_2_0 = ((kqa) this).field_c;
              stackOut_2_1 = var3;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (((kqa) this).field_d.field_G[var3].b(0)) {
                stackOut_4_0 = (int[]) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = -999;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L6;
              } else {
                stackOut_3_0 = (int[]) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = ((kqa) this).field_d.field_G[var3].b(false) - -((kqa) this).field_d.field_H[var3].i((byte) -72);
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L6;
              }
            }
            stackIn_5_0[stackIn_5_1] = stackIn_5_2;
            if (((kqa) this).field_d.f((byte) -99, var3)) {
              ((kqa) this).field_c[var3] = 2147483647;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    final static void b(int param0) {
        vb var1 = null;
        RuntimeException var1_ref = null;
        fla var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 18916) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var1 = (vb) (Object) tna.field_e.f(-80);
            L2: while (true) {
              if (var1 == null) {
                break L0;
              } else {
                var2 = new fla(var1, var1.field_f.k(), var1.field_f.g());
                rs.a(var2, -58);
                var1 = (vb) (Object) tna.field_e.e(119);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1_ref, "kqa.D(" + param0 + ')');
        }
    }

    kqa(ff param0) {
        try {
            ((kqa) this).field_d = param0;
            ((kqa) this).a(false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kqa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = ((kqa) this).field_d.field_H.length;
        if (param0) {
            kqa.b(110);
        }
        ((kqa) this).field_c = new int[var2];
        ((kqa) this).field_e = new int[var2];
        ((kqa) this).field_b = new int[var2];
        for (var3 = 0; var3 < var2; var3++) {
            ((kqa) this).field_e[var3] = var3;
            ((kqa) this).field_b[var3] = var3;
        }
    }

    static {
    }
}
