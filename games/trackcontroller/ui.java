/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends di {
    private lb field_q;
    static String field_n;
    static aa field_m;
    static int[] field_r;
    private lb field_o;
    static be field_p;

    final ud a(int param0, String param1) {
        String var3 = ((ui) this).field_q.field_s.toLowerCase();
        String var4 = param1.toLowerCase();
        if (0 == var4.length()) {
            return ef.field_b;
        }
        if (!ri.a((byte) 56, var4, var3)) {
            return ef.field_b;
        }
        if (param0 > -106) {
            Object var5 = null;
            ud discarded$0 = ((ui) this).a(-122, (String) null);
        }
        if (this.b(param1, 84)) {
            return ef.field_b;
        }
        return TrackController.field_G;
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == 95) {
          L0: {
            if (cj.field_o == null) {
              break L0;
            } else {
              var1 = (Object) (Object) cj.field_o;
              synchronized (var1) {
                L1: {
                  cj.field_o = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        if (param0 != 256) {
            boolean discarded$0 = ui.a(-68, 'ﾥ');
        }
        field_n = null;
        field_p = null;
        field_m = null;
        field_r = null;
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (vl.a(param1, param0 ^ -3296)) {
            return true;
        }
        if (param0 != -19050) {
            return false;
        }
        char[] var6 = ob.field_q;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
                return true;
            }
        }
        var2 = hj.field_f;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (param1 == var4) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param1 <= 24) {
            field_n = null;
        }
        String var3 = ((ui) this).field_o.field_s.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var3.length() > 0) {
            if (-1 <= var4.length()) {
                return false;
            }
            var5 = var3.lastIndexOf("@");
            if (-1 <= var5) {
                if (!(var5 >= -1 + var3.length())) {
                    var6 = var3.substring(0, var5);
                    var7 = var3.substring(var5 + 1);
                    if (-1 >= var4.indexOf(var6)) {
                        return true;
                    }
                    if (-1 <= var4.indexOf(var7)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param1 = v.a('_', (byte) -31, "", param1);
          if (param2 > 77) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = rb.a(22479, param1);
            if ((param0.indexOf(param1) ^ -1) != 0) {
              break L2;
            } else {
              if (-1 == param0.indexOf(var3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final String a(String param0, int param1) {
        if (param1 != 426) {
            field_m = null;
        }
        String var6 = ((ui) this).field_q.field_s.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!ac.a(var5, -23797))) {
            return nl.field_c;
        }
        if (sd.a(var5, (byte) 115)) {
            return kh.field_a;
        }
        if (ba.a(var5, false)) {
            return mj.field_a;
        }
        if (this.b(param0, 35)) {
            return h.field_a;
        }
        if (var6.length() > 0) {
            if (cb.a(var6, var5, (byte) -11)) {
                return qd.field_c;
            }
            if (!(!rh.a(param1 ^ 19012, var6, var5))) {
                return fe.field_J;
            }
            if (!(!ui.a(var5, var6, (byte) 103))) {
                return qd.field_c;
            }
            return nl.field_c;
        }
        return pf.field_N;
    }

    ui(lb param0, lb param1, lb param2) {
        super(param0);
        ((ui) this).field_q = param1;
        ((ui) this).field_o = param2;
    }

    final static boolean a(int param0, boolean param1) {
        if (!(-1 != param0)) {
            return true;
        }
        if (!param1) {
            ui.h(85);
        }
        return (pf.field_U & 1 << param0) != 0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Congratulations! You've completed the full game!";
        field_m = new aa(12, 0, 1, 0);
        field_r = new int[8192];
        field_p = new be(256);
    }
}
