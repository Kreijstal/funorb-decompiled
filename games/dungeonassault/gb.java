/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int[] field_e;
    private nh field_d;
    static int field_a;
    private nh field_b;
    private eg field_c;

    final nf a(int param0, int param1) {
        byte[] var4 = null;
        nf var3 = (nf) (this.field_c.a(-70, (long)param0));
        if (var3 != null) {
            return var3;
        }
        if ((param0 ^ -1) > -32769) {
            var4 = this.field_b.b(5, 1, param0);
        } else {
            var4 = this.field_d.b(5, 1, param0 & 32767);
        }
        if (param1 != -19256) {
            return (nf) null;
        }
        var3 = new nf();
        if (!(var4 == null)) {
            var3.a(new ec(var4), param1 + 19255);
        }
        if (!(32768 > param0)) {
            var3.d((byte) -74);
        }
        this.field_c.a(true, var3, (long)param0);
        return var3;
    }

    final static ba a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ba[] var3 = null;
        int var4 = 0;
        ba var5 = null;
        int var6 = 0;
        java.applet.Applet var7 = null;
        ba stackIn_3_0 = null;
        ba stackIn_11_0 = null;
        ba stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2 = en.a("jagex-last-login-method", (byte) 121, param0);
            if (var2 != null) {
              L1: {
                if (param1 < -74) {
                  break L1;
                } else {
                  var7 = (java.applet.Applet) null;
                  gb.a((java.applet.Applet) null, 18);
                  break L1;
                }
              }
              var3 = jg.b((byte) 24);
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackIn_14_0 = rl.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 20886)) {
                    stackIn_11_0 = (ba) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_3_0 = rl.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("gb.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 32767) {
            field_a = 79;
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new int[]{10};
    }
}
