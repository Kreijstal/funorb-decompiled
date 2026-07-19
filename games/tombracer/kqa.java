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
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_18_0 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = -103 % ((-35 - param0) / 39);
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= this.field_d.field_H.length) {
                break L2;
              } else {
                if (var9 != 0) {
                  break L1;
                } else {
                  L3: {
                    stackOut_3_0 = this.field_c;
                    stackOut_3_1 = var3;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (this.field_d.field_G[var3].b(0)) {
                      stackOut_5_0 = (int[]) ((Object) stackIn_5_0);
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = -999;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L3;
                    } else {
                      stackOut_4_0 = (int[]) ((Object) stackIn_4_0);
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = this.field_d.field_G[var3].b(false) - -this.field_d.field_H[var3].i((byte) -72);
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L3;
                    }
                  }
                  L4: {
                    stackIn_6_0[stackIn_6_1] = stackIn_6_2;
                    if (!this.field_d.f((byte) -99, var3)) {
                      break L4;
                    } else {
                      this.field_c[var3] = 2147483647;
                      break L4;
                    }
                  }
                  var3++;
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var3 = 0;
            break L1;
          }
          var4 = 0;
          L5: while (true) {
            stackOut_11_0 = var4;
            stackOut_11_1 = this.field_e.length;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            L6: while (true) {
              L7: {
                L8: {
                  if (stackIn_12_0 >= stackIn_12_1) {
                    break L8;
                  } else {
                    stackOut_13_0 = var4;
                    stackIn_19_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var9 != 0) {
                      break L7;
                    } else {
                      var5 = stackIn_14_0;
                      if (var5 >= this.field_e.length) {
                        var4++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L8;
                        }
                      } else {
                        var6 = this.field_e[var4];
                        var7 = this.field_e[var5];
                        var8 = 0;
                        stackOut_15_0 = this.field_c[var7];
                        stackOut_15_1 = this.field_c[var6];
                        stackIn_12_0 = stackOut_15_0;
                        stackIn_12_1 = stackOut_15_1;
                        continue L6;
                      }
                    }
                  }
                }
                stackOut_18_0 = var3;
                stackIn_19_0 = stackOut_18_0;
                break L7;
              }
              if (stackIn_19_0 != 0) {
                var4 = 0;
                L9: while (true) {
                  if (var4 < this.field_e.length) {
                    this.field_b[this.field_e[var4]] = var4;
                    var4++;
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -119) {
            kqa.b(-126);
        }
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
                field_a = (fia) null;
                break L1;
              }
            }
            var1 = (vb) ((Object) tna.field_e.f(-80));
            L2: while (true) {
              if (var1 == null) {
                break L0;
              } else {
                var2 = new fla(var1, var1.field_f.k(), var1.field_f.g());
                rs.a(var2, -58);
                var1 = (vb) ((Object) tna.field_e.e(119));
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "kqa.D(" + param0 + ')');
        }
    }

    kqa(ff param0) {
        try {
            this.field_d = param0;
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kqa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_d.field_H.length;
        if (!param0) {
          this.field_c = new int[var2];
          this.field_e = new int[var2];
          this.field_b = new int[var2];
          var3 = 0;
          L0: while (true) {
            if (var3 < var2) {
              this.field_e[var3] = var3;
              this.field_b[var3] = var3;
              var3++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          kqa.b(110);
          this.field_c = new int[var2];
          this.field_e = new int[var2];
          this.field_b = new int[var2];
          var3 = 0;
          L1: while (true) {
            if (var3 < var2) {
              this.field_e[var3] = var3;
              this.field_b[var3] = var3;
              var3++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
    }
}
