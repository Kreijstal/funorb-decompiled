/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ig extends gg implements pe {
    private sl field_l;
    static String field_k;
    static dd field_i;
    static so field_h;
    static qr field_j;

    public final void a(sl param0, int param1) {
        try {
            this.b(11755);
            int var3_int = -31 % ((-43 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ig.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String f(int param0) {
        int var2 = -69 % ((param0 - -30) / 45);
        return this.a(this.field_l.field_m, 0);
    }

    public final boolean d(int param0) {
        sl var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -3) {
          if (this.field_l.field_m != null) {
            if (this.field_l.field_m.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = (sl) null;
          this.a((sl) null, false);
          if (this.field_l.field_m == null) {
            return true;
          } else {
            L0: {
              if (this.field_l.field_m.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    abstract na a(String param0, boolean param1);

    public final void a(sl param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ig.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    ig(sl param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String a(String param0, int param1);

    final static void a(dd param0, byte param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            if ((3 & (param0.field_z | param0.field_A | param0.field_G | param0.field_B)) == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -12) {
                var2_int = (param0.field_G & 3) + param0.field_z;
                var2_int = 4 - (3 & var2_int) + var2_int;
                var3 = (param0.field_B & 3) + param0.field_A;
                var3 = -(var3 & 3) - -4 + var3;
                var4 = new int[var3 * var2_int];
                var5 = 0;
                var6 = var2_int * (3 & param0.field_B) + (3 & param0.field_G);
                var7 = 0;
                L1: while (true) {
                  if (param0.field_A <= var7) {
                    param0.field_G = param0.field_G & -4;
                    param0.field_B = param0.field_B & -4;
                    param0.field_D = var4;
                    param0.field_z = var2_int;
                    param0.field_A = var3;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = 0;
                    L2: while (true) {
                      if (param0.field_z <= var8) {
                        var6 = var6 + (var2_int - param0.field_z);
                        var7++;
                        continue L1;
                      } else {
                        incrementValue$2 = var6;
                        var6++;
                        incrementValue$3 = var5;
                        var5++;
                        var4[incrementValue$2] = param0.field_D[incrementValue$3];
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ig.DA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_k = null;
        field_j = null;
        if (param0 < 85) {
            return;
        }
        field_h = null;
    }

    final na g(int param0) {
        sl var3 = null;
        if (param0 != -14836) {
          var3 = (sl) null;
          this.a((sl) null, 41);
          return this.a(this.field_l.field_m, true);
        } else {
          return this.a(this.field_l.field_m, true);
        }
    }

    static {
        field_k = "Unable to delete name - system busy";
    }
}
