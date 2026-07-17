/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static je field_a;
    static int field_b;
    private ho[][] field_d;

    public static void a() {
        field_a = null;
        field_c = null;
    }

    final int a(boolean param0, int param1) {
        int var5 = 0;
        ho var6 = null;
        om var7 = null;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == ((cm) this).field_d[param1]) {
            return 0;
        }
        if (param0) {
            ((cm) this).a(-6, 29, -98, 117, 69);
        }
        cf var10 = br.a(param1, (byte) -93);
        cf var3 = var10;
        int var4 = 0;
        for (var5 = 0; var5 < var3.field_n.length; var5++) {
            var6 = ((cm) this).field_d[param1][var5];
            var7 = var10.field_n[var5];
            var8 = var6 != null ? b.a(var7.field_m, var7.field_F, var6.field_c, (byte) 25, var6.field_b) : 0;
            var4 = var4 + var8;
        }
        return var4;
    }

    final static String b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var1 = "(" + me.field_c + " " + ba.field_F + " " + sj.field_e + ") " + nm.field_o;
        if (fk.field_b <= 0) {
        } else {
            var1 = var1 + ":";
            for (var2 = 0; var2 < fk.field_b; var2++) {
                var1 = var1 + 32;
                var3 = 255 & mg.field_e.field_o[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    final void a(int param0, vh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param1.e((byte) -104);
            var5 = 0;
            if (param2 <= -109) {
              L1: while (true) {
                if (0 == var4_int) {
                  break L0;
                } else {
                  L2: {
                    if ((var4_int & 1) != 0) {
                      ((cm) this).field_d[var5] = new ho[64];
                      L3: while (true) {
                        int dupTemp$5 = param1.k(0);
                        var6 = dupTemp$5;
                        if (255 == dupTemp$5) {
                          break L2;
                        } else {
                          L4: {
                            if (param0 < 7) {
                              var7 = 2000;
                              var9 = param1.e((byte) -104);
                              var8 = var9;
                              break L4;
                            } else {
                              var7 = param1.e((byte) -104);
                              var8 = param1.e((byte) -104);
                              break L4;
                            }
                          }
                          ((cm) this).field_d[var5][var6] = new ho(var7, var8);
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var4_int = var4_int >> 1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("cm.A(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            wb.a(false, (byte) 32, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cm.D(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        cf var5 = null;
        om var6 = null;
        L0: {
          var4 = 54 / ((67 - param1) / 36);
          if (((cm) this).field_d[param0] == null) {
            break L0;
          } else {
            if (null == ((cm) this).field_d[param0][param2]) {
              break L0;
            } else {
              var5 = br.a(param0, (byte) -57);
              var6 = var5.field_n[param2];
              return b.a(var6.field_m, var6.field_F, ((cm) this).field_d[param0][param2].field_c, (byte) 25, ((cm) this).field_d[param0][param2].field_b);
            }
          }
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (((cm) this).field_d[param3] != null) {
            break L0;
          } else {
            ((cm) this).field_d[param3] = new ho[64];
            break L0;
          }
        }
        L1: {
          if (param0 == 65535) {
            break L1;
          } else {
            field_b = -24;
            break L1;
          }
        }
        L2: {
          L3: {
            L4: {
              if (-1 != param2) {
                break L4;
              } else {
                if (-1 == param4) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (65535 != param2) {
                break L5;
              } else {
                if (param4 != 65535) {
                  break L5;
                } else {
                  break L3;
                }
              }
            }
            ((cm) this).field_d[param3][param1] = new ho(param2, param4);
            break L2;
          }
          ((cm) this).field_d[param3][param1] = null;
          break L2;
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(!jj.b((byte) -73))) {
            param1 = false;
        }
        nm.a((byte) 95, param1);
        if (!(!gl.field_b)) {
            qn.d(ij.field_w.field_a.field_S, ij.field_w.field_a.field_ab, ij.field_w.field_a.field_gb, ij.field_w.field_a.field_ob);
            ij.field_w.field_a.b(param1, 20);
        }
        ArmiesOfGielinor.b(0, param1);
    }

    public cm() {
        ((cm) this).field_d = new ho[3][];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unrated game";
    }
}
