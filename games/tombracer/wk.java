/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends vg {
    static boolean[] field_i;
    int field_f;
    boolean field_j;
    int field_l;
    int field_g;
    int field_h;
    static int field_n;
    int field_k;
    static int field_m;

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == -84) {
                  L1: {
                    var1_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var1_ref == null) {
                      break L1;
                    } else {
                      try {
                        L2: {
                          var2_ref = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1_ref.invoke((Object) (var2_ref), (Object[]) null));
                          cba.field_d = 1 + (int)(var3.longValue() / 1048576L);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          var2 = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L3;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        return;
                      } else {
                        break L1;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector1 = 1;
                break L4;
              }
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(en param0, int param1, int param2, cn param3) {
        try {
            gpa.field_b = param1 * aqa.a(1188664449) / 1000;
            ne.a(param3, -101);
            gja.a(param3, 0);
            jp.a(param3, (byte) 20);
            if (param2 != 11861) {
                cn var5 = (cn) null;
                wk.a((en) null, 0, -42, (cn) null);
            }
            mf.a(85);
            ica.a(16777215);
            tl.field_r = 0 + -gpa.field_b;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 > -43) {
            return;
        }
        field_i = null;
    }

    wk() {
        this.field_j = false;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = -param1 + this.field_g;
        if (param0 != 0) {
          return;
        } else {
          this.field_l = var4 / 20;
          var5 = this.field_k + -param2;
          this.field_f = var5 / 20;
          this.field_h = dfa.a(qva.a((byte) -100, var5, -var4) >> -1607804798, 2048, -126);
          return;
        }
    }

    static {
        field_i = new boolean[]{true, true, false, true, false, false, true, false, false};
        field_m = 0;
    }
}
