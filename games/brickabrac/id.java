/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends mh {
    static int field_Pb;
    long field_gc;
    String field_hc;
    boolean field_Qb;
    mh field_Tb;
    mh field_Rb;
    static String field_bc;
    long field_Xb;
    mh field_cc;
    boolean field_ec;
    int field_Wb;
    int field_kc;
    static String field_jc;
    mh field_Vb;
    int field_ac;
    int field_Zb;
    String field_Yb;
    boolean field_fc;
    static String field_Sb;
    int field_Ub;
    mh field_dc;
    int field_ic;

    public static void h(int param0) {
        int var1 = 102 % ((param0 - 48) / 43);
        field_jc = null;
        field_bc = null;
        field_Sb = null;
    }

    final void a(String param0, String param1, byte param2) {
        CharSequence var6 = null;
        try {
            this.field_hc = param1;
            if (param2 != -121) {
                id var5 = (id) null;
                this.a((id) null, -125);
            }
            this.field_Yb = param0;
            var6 = (CharSequence) ((Object) this.field_hc);
            gb.a(var6, 116);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "id.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    id(String param0, String param1, long param2) {
        super(0L, (mh) null);
        CharSequence var6 = null;
        try {
            this.field_hc = param0;
            this.field_Yb = param1;
            this.field_gc = param2;
            var6 = (CharSequence) ((Object) this.field_hc);
            gb.a(var6, 124);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int[] a(fo param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = tf.field_g.length;
              if (lc.a(0, -107)) {
                break L1;
              } else {
                var2_int--;
                break L1;
              }
            }
            var3 = new int[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    field_Sb = (String) null;
                    break L3;
                  }
                }
                ke.a(var3, (byte) 39, param0);
                stackIn_9_0 = (int[]) (var3);
                break L0;
              } else {
                var3[var4] = var4;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("id.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final boolean i(int param0) {
        if (param0 != 0) {
            return false;
        }
        return !this.c(2) ? true : false;
    }

    final boolean a(id param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = param0.field_fc;

              if (this.field_fc) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
              stackIn_6_0 = this.field_fc;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == -755) {
                  break L2;
                } else {
                  var4 = (String) null;
                  this.a((String) null, (String) null, (byte) -26);
                  break L2;
                }
              }
              L3: {
                stackIn_11_0 = this.field_Qb;

                if (param0.field_Qb) {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = 1;
                  break L3;
                }
              }
              if ((stackIn_12_0 ? 1 : 0) == stackIn_12_1) {
                stackIn_15_0 = this.field_Qb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (this.field_Xb >= param0.field_Xb) {
                    stackIn_19_0 = 0;
                    break L4;
                  } else {
                    stackIn_19_0 = 1;
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("id.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    static {
        field_bc = "Try changing the '<%0>' setting.";
        field_Pb = 0;
        field_jc = "You can spectate this game";
        field_Sb = "Concluded";
    }
}
