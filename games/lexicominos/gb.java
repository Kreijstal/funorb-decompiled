/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    private String field_c;
    private boolean field_b;
    static int field_a;
    static boolean field_d;

    gb(String param0, boolean param1) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (null != this.field_c) {
                break L1;
              } else {
                this.field_c = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              ((gb) (this)).field_b = stackIn_6_1 != 0;
              if (this.field_c.length() != 0) {
                break L3;
              } else {
                this.field_b = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("gb.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static aj a(int param0, int param1) {
        aj[] var2;
        int var3;
        int var4;
        aj[] var5;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          var5 = ah.a((byte) -55);
          var2 = var5;
          if (param1 == 2121865922) {
            break L0;
          } else {
            gb.a(71, -115);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_a == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static we[] a(byte param0, ab param1) {
        we[] stackIn_6_0 = null;
        we[] stackIn_13_0 = null;
        we[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        we[] var4 = null;
        int var5 = 0;
        we var6 = null;
        int var7 = 0;
        ab var8 = null;
        ei var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -66) {
                break L1;
              } else {
                var8 = (ab) null;
                gb.a((byte) 108, (ab) null);
                break L1;
              }
            }
            if (!param1.b(0)) {
              stackIn_6_0 = new we[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = param1.a((byte) 127);
              L2: while (true) {
                if (var9.field_b != 0) {
                  if (2 == var9.field_b) {
                    stackIn_13_0 = new we[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var11 = (int[]) (var9.field_g);
                    var10 = var11;
                    var3 = var10;
                    var4 = new we[var11.length >> -1296970974];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_18_0 = (we[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new we();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 2121865922];
                        var6.field_e = var3[1 + (var5 << 794115490)];
                        var6.field_f = var3[(var5 << -1933966654) + 2];
                        var6.field_k = var3[(var5 << 1213143170) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  ge.a(0, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("gb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    gb(String param0) {
        this(param0, false);
    }

    final boolean a(int param0) {
        if (param0 != 15738) {
            field_a = -125;
        }
        return this.field_b;
    }

    final String b(int param0) {
        if (param0 != 25545) {
            return (String) null;
        }
        return this.field_c;
    }

    static {
        field_d = false;
    }
}
