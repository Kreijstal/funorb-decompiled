/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static nc field_c;
    dl field_b;
    volatile gj[] field_a;
    volatile boolean field_e;
    volatile boolean field_f;
    static int field_d;

    public final void run() {
        int var1_int = 0;
        gj var2 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_f = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_e) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        i.a((byte) 18, 10L);
                        var5 = (Object) null;
                        pb.a(this.field_b, (Object) null, (byte) 106);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_a[var1_int];
                          if (var2 == null) {
                            break L4;
                          } else {
                            var2.b();
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              hi.a((Throwable) ((Object) var1), (String) null, 1);
              this.field_f = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_f = false;
          throw sb.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_f = false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        if (param2 != 1513551664) {
          return -96;
        } else {
          var3 = param0 >> 1218313584;
          var4 = 65535 & param0;
          var5 = param1 >> 134446224;
          var6 = 65535 & param1;
          return (var4 * var6 >> 1513551664) + (param1 * var3 - -(var4 * var5));
        }
    }

    final static hd a(byte[] param0, int param1) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 32223) {
                  break L1;
                } else {
                  field_d = 21;
                  break L1;
                }
              }
              var2 = new hd(param0, ph.field_h, qf.field_d, sa.field_l, uj.field_b, jc.field_c);
              og.a((byte) -97);
              stackIn_6_0 = (hd) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("sb.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hd) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -90) {
            sb.a((byte) -7);
        }
    }

    sb() {
        this.field_a = new gj[2];
        this.field_e = false;
        this.field_f = false;
    }

    static {
        field_c = new nc();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
