/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    static String field_h;
    private int field_b;
    static int[] field_e;
    private int[] field_f;
    private boolean field_a;
    static int field_d;
    private int field_g;
    static String field_c;

    private final int c(int param0) {
        int var3 = 0;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        var3 = ((bp) this).field_f.length;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (!((bp) this).field_a) {
              var3 = var3 + ((bp) this).field_g;
              continue L0;
            } else {
              if (0 != var3) {
                var3 = var3 * ((bp) this).field_g;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (!(((bp) this).field_b >= param0)) {
            ((bp) this).field_b = param0;
        }
        if (!(((bp) this).field_f.length > param0)) {
            this.d(-93, param0);
        }
        ((bp) this).field_f[param0] = param2;
    }

    private final void d(int param0, int param1) {
        int discarded$0 = -13676;
        int[] var5 = new int[this.c(param1)];
        int[] var3 = var5;
        int var4 = 41;
        cj.a(((bp) this).field_f, 0, var5, 0, ((bp) this).field_f.length);
        ((bp) this).field_f = var5;
    }

    final static um a(int param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ha var4 = null;
        ha stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ha stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 0;
            var4 = new ha();
            ((um) (Object) var4).field_f = param0;
            ((um) (Object) var4).field_a = param2;
            stackOut_0_0 = (ha) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("bp.J(").append(param0).append(44).append(127).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return (um) (Object) stackIn_1_0;
    }

    final static void a(int param0, cn param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            param2 = param2 + param1.field_w;
            param0 = param0 + param1.field_A;
            L1: {
              var4_int = param2 + param0 * gf.field_i;
              var5 = 0;
              var6 = param1.field_v;
              var7 = param1.field_y;
              var8 = gf.field_i + -var7;
              if (gf.field_f > param0) {
                var10 = -param0 + gf.field_f;
                var5 = var5 + var7 * var10;
                param0 = gf.field_f;
                var6 = var6 - var10;
                var4_int = var4_int + var10 * gf.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = 0;
              if (var6 + param0 > gf.field_e) {
                var6 = var6 - (-gf.field_e + param0 + var6);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (gf.field_j <= param2) {
                break L3;
              } else {
                var10 = gf.field_j - param2;
                var7 = var7 - var10;
                param2 = gf.field_j;
                var9 = var9 + var10;
                var8 = var8 + var10;
                var5 = var5 + var10;
                var4_int = var4_int + var10;
                break L3;
              }
            }
            L4: {
              if (gf.field_h >= param2 + var7) {
                break L4;
              } else {
                var10 = param2 + (var7 - gf.field_h);
                var8 = var8 + var10;
                var7 = var7 - var10;
                var9 = var9 + var10;
                break L4;
              }
            }
            L5: {
              if (var7 <= 0) {
                break L5;
              } else {
                if (var6 > 0) {
                  id.a(var4_int, 0, (byte) 104, var6, var9, param1.field_B, var5, var7, gf.field_b, var8);
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("bp.D(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + 99 + 41);
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (((bp) this).field_b >= param0) {
              L1: {
                if (param0 == ((bp) this).field_b) {
                  break L1;
                } else {
                  cj.a(((bp) this).field_f, param0 - -1, ((bp) this).field_f, param0, -param0 + ((bp) this).field_b);
                  break L1;
                }
              }
              var3 = 125 / ((param1 - 16) / 53);
              ((bp) this).field_b = ((bp) this).field_b - 1;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final static void a(cn param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              lg.field_m = param2;
              rf.field_Q = param0;
              if (param1 == 51) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bp.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -814) {
            return 73;
        }
        if (param1 > ((bp) this).field_b) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((bp) this).field_f[param1];
    }

    public static void a() {
        field_c = null;
        field_h = null;
        field_e = null;
    }

    final int a(byte param0) {
        if (param0 > -36) {
            return 3;
        }
        return 1 + ((bp) this).field_b;
    }

    final void e(int param0, int param1) {
        if (param1 > -66) {
            Object var4 = null;
            bp.a((cn) null, (byte) 50, (String) null);
        }
        this.a(1 + ((bp) this).field_b, 0, param0);
    }

    final static void b() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var1 = (Object) (Object) in.field_C;
            synchronized (var1) {
              L1: {
                L2: {
                  hl.field_g = hl.field_g + 1;
                  je.field_i = pj.field_x;
                  if (0 <= ia.field_M) {
                    L3: while (true) {
                      if (dl.field_b == ia.field_M) {
                        break L2;
                      } else {
                        var2 = ih.field_r[dl.field_b];
                        dl.field_b = 127 & dl.field_b - -1;
                        if (0 <= var2) {
                          qk.field_e[var2] = true;
                          continue L3;
                        } else {
                          qk.field_e[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        ia.field_M = dl.field_b;
                        break L2;
                      } else {
                        qk.field_e[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                pj.field_x = ka.field_c;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1_ref, "bp.B(" + 94 + 41);
        }
    }

    private bp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Treasure: <col=DB0100><%0></col>";
        field_c = "Your raider was trapped and incapacitated.";
        field_e = wa.b(-1);
    }
}
