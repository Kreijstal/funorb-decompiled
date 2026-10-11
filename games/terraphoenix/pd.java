/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int field_h;
    static jj field_g;
    String field_b;
    boolean field_i;
    String[] field_d;
    int field_c;
    static String field_f;
    static String field_e;
    boolean field_a;

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_g = null;
        if (param0 != 122) {
          java.awt.Component var2 = (java.awt.Component) null;
          pd.a(-110, (java.awt.Component) null);
        }
    }

    final static pd a(int param0) {
        if (og.field_a == qe.field_f) {
          throw new IllegalStateException();
        }
        if (param0 != -352) {
          return (pd) null;
        }
        if (k.field_b == qe.field_f) {
          qe.field_f = og.field_a;
          return wl.field_Q;
        }
        return null;
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0 <= 11) {
          field_g = (jj) null;
          if (48 > param1) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (57 >= param1) {
            return true;
          }
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (48 > param1) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (57 >= param1) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (param1 <= 122);
        return stackIn_50_0;
    }

    final static int a(boolean param0) {
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        long var4Lifetime1;
        int var6Lifetime1;
        var7 = Terraphoenix.field_V;
        try {
          var1_int = param0 ? 1 : 0;
          var2 = 0;
          while (fd.d(1)) {
            ai.field_i.b((byte) -87);
            if (ai.field_i.c((byte) -127)) {
              var1_int = 1;
            }
            if (lf.field_c != 13) {
              continue;
            }
            var2 = 1;
          }
          ai.field_i.a(bb.a(-88, jb.field_b, ef.field_j), 127, bb.a(-110, lm.field_c, mm.field_c));
          if (ai.field_i.c((byte) -118)) {
            var1_int = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = 0;
          if (var1_int != 0 &&
            ai.field_i.field_h >= 0) {
            var3 = pj.field_l[ai.field_i.field_h];
            if (var3 == 2) {
              wf.c(25501);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (var3 == 5) {
                wf.c(25501);
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var3 == 0 &&
                  pe.field_e == 2) {
                  var4 = ll.a(1000) - hj.field_I;
                  var6 = (int)((-var4 + 10999L) / 1000L);
                  if (var6 <= 0) {
                    var3 = 2;
                    ja.a(121, true, 5);
                  }
                }
                return var3;
              }
            }
          }
          if ((decompiledFrameRemainder0) && (var2 != 0 &&
            pe.field_e != 2)) {
            wf.c(25501);
          }
          if (var3 == 0 &&
            pe.field_e == 2) {
            var4Lifetime1 = ll.a(1000) - hj.field_I;
            var6Lifetime1 = (int)((-var4Lifetime1 + 10999L) / 1000L);
            if (var6Lifetime1 <= 0) {
              var3 = 2;
              ja.a(121, true, 5);
            }
          }
          stackIn_31_0 = var3;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "pd.C(" + param0 + ')');
        }
    }

    pd(boolean param0) {
        this.field_i = param0 ? true : false;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener(a.field_d);
        if (param0 > -2) {
          return;
        }
        try {
          param1.removeMouseMotionListener(a.field_d);
          param1.removeFocusListener(a.field_d);
          wa.field_p = 0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "pd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "REC";
        field_f = "HARD MODE UNLOCKED";
        field_g = new jj();
    }
}
