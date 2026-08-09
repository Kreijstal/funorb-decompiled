/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    private ij field_c;
    static String field_d;
    static dja field_a;
    private ksa field_b;

    final ksa a(byte param0) {
        ksa var2;
        var2 = this.field_b;
        if (param0 == 108) {
          if (var2 == this.field_c.field_a) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        } else {
          return (ksa) null;
        }
    }

    final ksa b(byte param0) {
        ksa var2;
        if (param0 > 61) {
          var2 = this.field_c.field_a.field_a;
          if (this.field_c.field_a == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        } else {
          return (ksa) null;
        }
    }

    final ksa c(int param0) {
        ksa var2 = this.field_c.field_a.field_c;
        if (param0 != 570) {
            this.field_c = (ij) null;
            if (!(var2 != this.field_c.field_a)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != this.field_c.field_a)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_c;
        return var2;
    }

    final ksa a(int param0) {
        ksa var2;
        ksa var3;
        if (param0 == 19072) {
          var2 = this.field_b;
          if (this.field_c.field_a == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_c;
            return var2;
          }
        } else {
          var3 = (ksa) null;
          this.a((ksa) null, 109);
          var2 = this.field_b;
          if (this.field_c.field_a == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_c;
            return var2;
          }
        }
    }

    final ksa a(byte param0, ksa param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ksa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 87) {
                break L1;
              } else {
                this.a(73);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = this.field_c.field_a.field_a;
                break L2;
              }
            }
            if (var3 == this.field_c.field_a) {
              this.field_b = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_b = var3.field_a;
              stackIn_10_0 = (ksa) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("wc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ksa) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    public static void b(int param0) {
        if (param0 != -20221) {
            wc.b(-115);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    final ksa a(ksa param0, int param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ksa stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = this.field_c.field_a.field_c;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (var3 != this.field_c.field_a) {
              L2: {
                this.field_b = var3.field_c;
                if (param1 == -28791) {
                  break L2;
                } else {
                  field_d = (String) null;
                  break L2;
                }
              }
              stackIn_9_0 = (ksa) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("wc.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ksa) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    wc(ij param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "To play a multiplayer game, please log in or create a free account.";
    }
}
