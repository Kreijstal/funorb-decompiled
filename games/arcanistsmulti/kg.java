/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static int field_b;
    static boolean field_f;
    private ig field_g;
    private eg field_e;
    static ec field_h;
    static kc field_c;
    static int[][] field_d;
    private eg field_i;
    static boolean field_a;

    public static void a(int param0) {
        field_h = null;
        field_d = (int[][]) null;
        field_c = null;
        if (param0 != 0) {
            field_a = true;
        }
    }

    final oo a(int param0, int param1) {
        oo var3;
        byte[] var4;
        oo var5;
        if (param0 == 3) {
          var3 = (oo) (this.field_g.a((long)param1, false));
          if (var3 == null) {
            L0: {
              if (32768 > param1) {
                var4 = this.field_e.b(param1, param0 + 26216, 0);
                break L0;
              } else {
                var4 = this.field_i.b(32767 & param1, 26219, 0);
                break L0;
              }
            }
            var5 = new oo();
            if (var4 == null) {
              if (param1 >= 32768) {
                var5.f(-94);
                this.field_g.a(var5, (long)param1, -65);
                return var5;
              } else {
                this.field_g.a(var5, (long)param1, -65);
                return var5;
              }
            } else {
              var5.a((byte) 116, new wk(var4));
              if (param1 < 32768) {
                this.field_g.a(var5, (long)param1, -65);
                return var5;
              } else {
                var5.f(-94);
                this.field_g.a(var5, (long)param1, -65);
                return var5;
              }
            }
          } else {
            return var3;
          }
        } else {
          return (oo) null;
        }
    }

    kg(int param0, eg param1, eg param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = new ig(64);
        try {
          L0: {
            L1: {
              this.field_i = param2;
              this.field_e = param1;
              if (null == this.field_e) {
                break L1;
              } else {
                this.field_e.a(0, (byte) -60);
                break L1;
              }
            }
            if (this.field_i == null) {
              break L0;
            } else {
              this.field_i.a(0, (byte) -60);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("kg.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final static boolean a(long param0, boolean param1, String param2) {
        wa var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_b = 104;
                break L1;
              }
            }
            L2: {
              var4 = im.a(0, param2);
              if (var4 == null) {
                break L2;
              } else {
                if (var4.field_Lb != null) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (wi.field_f == null) {
                  break L4;
                } else {
                  if (vf.a(param0, 8192) == null) {
                    break L4;
                  } else {
                    stackIn_11_0 = 1;
                    break L3;
                  }
                }
              }
              stackIn_11_0 = 0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("kg.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    static {
        field_b = 0;
        field_d = new int[4][3];
    }
}
