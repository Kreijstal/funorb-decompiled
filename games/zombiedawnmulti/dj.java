/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends gf implements fi, qg {
    wk field_n;
    static ak field_k;
    static ri field_p;
    static int field_m;
    static boolean field_l;
    static String field_o;

    public dj() {
    }

    public final void a(pm param0, boolean param1) {
        try {
            if (!param1) {
                this.field_n = (wk) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "dj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != -3) {
          field_k = (ak) null;
          field_o = null;
          field_k = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    public final boolean b(int param0) {
        if (param0 != -3) {
            return false;
        }
        return this.field_n.a(1872);
    }

    final re f(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        re stackIn_2_0 = null;
        re stackIn_6_0 = null;
        re stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_n.i(1);
            var3 = this.field_n.j(param0 + -191);
            var4 = this.field_n.g((byte) -118);
            var5 = oa.b((byte) -63);
            if (-1891 >= (var4 ^ -1)) {
              if (var4 > var5 + param0) {
                stackIn_6_0 = jq.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!dq.a((byte) -82, var3, var2_int, var4)) {
                  stackIn_10_0 = jq.field_b;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = jq.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return jq.field_b;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return db.field_b;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    public final void a(pm param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            this.a(-1306);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "dj.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -3) {
            break L0;
          } else {
            this.e(-103);
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              var2_int = this.field_n.i(1);
              var3 = this.field_n.j(param0 + -191);
              var4 = this.field_n.g((byte) -86);
              var5 = oa.b((byte) -44);
              if ((var4 ^ -1) > -1891) {
                break L2;
              } else {
                if (var4 > var5 + -3) {
                  break L2;
                } else {
                  if (!dq.a((byte) -65, var3, var2_int, var4)) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            }
            stackIn_6_0 = vl.a(ia.field_v, new String[]{"1890", Integer.toString(var5 - 3)}, 2);
            decompiledRegionSelector0 = 0;
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return wm.field_T;
          } else {
            return (String) ((Object) stackIn_9_0);
          }
        }
    }

    static {
        field_k = new ak();
        field_m = 4;
        field_o = "SCORE";
    }
}
