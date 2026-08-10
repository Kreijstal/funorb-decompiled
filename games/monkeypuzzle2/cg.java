/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    private int field_j;
    private int field_i;
    static kg field_c;
    private ug[] field_e;
    private ug field_f;
    static cj field_a;
    static int field_g;
    static int[] field_d;
    static int field_h;
    private ug field_b;

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -107) {
            field_g = 123;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(boolean param0) {
        if (ok.a(param0)) {
            return;
        }
        if (!(null != fj.field_E)) {
            fj.field_E = je.a(4, -128);
        }
    }

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 30) {
                break L1;
              } else {
                cg.b((byte) -92);
                break L1;
              }
            }
            try {
              L2: {
                if (!md.field_f.startsWith("win")) {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L2;
                } else {
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L3;
                      } else {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param0.length() <= var3) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L2;
                    } else {
                      if (0 == (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                        stackIn_16_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L2;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_21_0 = 0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref2);

            stackIn_24_1 = new StringBuilder().append("cg.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final ug a(byte param0, long param1) {
        ug var5 = null;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 111) {
            return (ug) null;
        }
        ug var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_j))];
        this.field_b = var4.field_d;
        while (this.field_b != var4) {
            if ((this.field_b.field_a ^ -1L) == (param1 ^ -1L)) {
                var5 = this.field_b;
                this.field_b = this.field_b.field_d;
                return var5;
            }
            this.field_b = this.field_b.field_d;
        }
        this.field_b = null;
        return null;
    }

    final void a(ug param0, long param1, byte param2) {
        ug var5 = null;
        try {
            if (null != param0.field_c) {
                param0.c(-19822);
            }
            var5 = this.field_e[(int)(param1 & (long)(-1 + this.field_j))];
            if (param2 != -36) {
                this.a((byte) -88);
            }
            param0.field_d = var5;
            param0.field_c = var5.field_c;
            param0.field_c.field_d = param0;
            param0.field_a = param1;
            param0.field_d.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ug a(int param0) {
        this.field_i = param0;
        return this.a((byte) -55);
    }

    final ug a(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var3;
        ug var4;
        ug var5;
        ug var6;
        ug var9;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (0 < this.field_i) {
          if (this.field_e[-1 + this.field_i] != this.field_f) {
            var9 = this.field_f;
            this.field_f = var9.field_d;
            return var9;
          } else {
            L0: while (true) {
              if (this.field_i >= this.field_j) {
                if (param0 != -55) {
                  field_d = (int[]) null;
                  return null;
                } else {
                  return null;
                }
              } else {
                fieldTemp$3 = this.field_i;
                this.field_i = this.field_i + 1;
                var4 = this.field_e[fieldTemp$3].field_d;
                var6 = var4;
                if (var4 != this.field_e[-1 + this.field_i]) {
                  this.field_f = var6.field_d;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_i >= this.field_j) {
              if (param0 != -55) {
                field_d = (int[]) null;
                return null;
              } else {
                return null;
              }
            } else {
              fieldTemp$4 = this.field_i;
              this.field_i = this.field_i + 1;
              var4 = this.field_e[fieldTemp$4].field_d;
              var5 = var4;
              if (var4 != this.field_e[-1 + this.field_i]) {
                this.field_f = var5.field_d;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    cg(int param0) {
        ug dupTemp$1 = null;
        int var2;
        ug var3;
        this.field_i = 0;
        this.field_j = param0;
        this.field_e = new ug[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$1 = new ug();
            var3 = dupTemp$1;
            this.field_e[var2] = dupTemp$1;
            var3.field_c = var3;
            var3.field_d = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_c = new kg();
        field_d = new int[4];
    }
}
