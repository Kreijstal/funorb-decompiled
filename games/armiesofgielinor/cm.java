/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static je field_a;
    static int field_b;
    private ho[][] field_d;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (param0) {
            field_a = (je) null;
        }
    }

    final int a(boolean param0, int param1) {
        int var5 = 0;
        ho var6 = null;
        om var7 = null;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null == this.field_d[param1]) {
            return 0;
        }
        if (param0) {
            this.a(-6, 29, -98, 117, 69);
        }
        cf var10 = br.a(param1, (byte) -93);
        cf var3 = var10;
        int var4 = 0;
        for (var5 = 0; var5 < var3.field_n.length; var5++) {
            var6 = this.field_d[param1][var5];
            var7 = var10.field_n[var5];
            var8 = var6 != null ? b.a(var7.field_m, var7.field_F, var6.field_c, (byte) 25, var6.field_b) : 0;
            var4 = var4 + var8;
        }
        return var4;
    }

    final static String b(boolean param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var6 = "(" + me.field_c + " " + ba.field_F + " " + sj.field_e + ") " + nm.field_o;
        String var1 = var6;
        if ((fk.field_b ^ -1) >= -1) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < fk.field_b; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & mg.field_e.field_o[var2];
                var4 = var3 >> -1969862716;
                var3 = var3 & 15;
                if ((var4 ^ -1) <= -11) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        if (param0) {
            return (String) null;
        }
        return var1;
    }

    final void a(int param0, vh param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param1.e((byte) -104);
            var5 = 0;
            if (param2 <= -109) {
              L1: while (true) {
                if (0 == var4_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if ((var4_int & 1) != 0) {
                      this.field_d[var5] = new ho[64];
                      L3: while (true) {
                        dupTemp$1 = param1.k(0);
                        var6 = dupTemp$1;
                        if (255 == dupTemp$1) {
                          break L2;
                        } else {
                          L4: {
                            if (-8 < (param0 ^ -1)) {
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
                          this.field_d[var5][var6] = new ho(var7, var8);
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("cm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            if (param1 != 0) {
                cm.b(false);
            }
            wb.a(false, (byte) 32, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        cf var5;
        om var6;
        L0: {
          var4 = 54 / ((67 - param1) / 36);
          if (this.field_d[param0] == null) {
            break L0;
          } else {
            if (null == this.field_d[param0][param2]) {
              break L0;
            } else {
              var5 = br.a(param0, (byte) -57);
              var6 = var5.field_n[param2];
              return b.a(var6.field_m, var6.field_F, this.field_d[param0][param2].field_c, (byte) 25, this.field_d[param0][param2].field_b);
            }
          }
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (this.field_d[param3] != null) {
            break L0;
          } else {
            this.field_d[param3] = new ho[64];
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
            this.field_d[param3][param1] = new ho(param2, param4);
            break L2;
          }
          this.field_d[param3][param1] = null;
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
        if (param0 != 2000) {
            return;
        }
        ArmiesOfGielinor.b(0, param1);
    }

    public cm() {
        this.field_d = new ho[3][];
    }

    static {
        field_c = "Unrated game";
    }
}
