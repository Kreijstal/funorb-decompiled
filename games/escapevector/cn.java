/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static hf field_a;
    hg field_d;
    private hg field_g;
    static String field_h;
    static cn field_f;
    static char[] field_c;
    static String field_e;
    static String field_b;

    final hg b(int param0) {
        hg var2 = null;
        var2 = ((cn) this).field_d.field_d;
        if (((cn) this).field_d != var2) {
          var2.c((byte) -120);
          if (param0 != -8980) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -93) {
          L0: {
            int discarded$10 = ((cn) this).c((byte) -39);
            if (((cn) this).field_d != ((cn) this).field_d.field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((cn) this).field_d != ((cn) this).field_d.field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0) {
        hg var2_ref_hg = null;
        int var2 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        L0: while (true) {
          var2_ref_hg = ((cn) this).field_d.field_b;
          if (var2_ref_hg != ((cn) this).field_d) {
            var2_ref_hg.c((byte) -46);
            continue L0;
          } else {
            var2 = -116 % ((53 - param0) / 46);
            ((cn) this).field_g = null;
            return;
          }
        }
    }

    final hg c(int param0) {
        hg var2 = null;
        var2 = ((cn) this).field_d.field_b;
        if (((cn) this).field_d != var2) {
          if (param0 != -20245) {
            field_f = null;
            var2.c((byte) -119);
            return var2;
          } else {
            var2.c((byte) -119);
            return var2;
          }
        } else {
          return null;
        }
    }

    final hg a(boolean param0) {
        hg var2 = null;
        if (!param0) {
          var2 = ((cn) this).field_d.field_b;
          if (((cn) this).field_d == var2) {
            ((cn) this).field_g = null;
            return null;
          } else {
            ((cn) this).field_g = var2.field_b;
            return var2;
          }
        } else {
          boolean discarded$2 = ((cn) this).a(-119);
          var2 = ((cn) this).field_d.field_b;
          if (((cn) this).field_d == var2) {
            ((cn) this).field_g = null;
            return null;
          } else {
            ((cn) this).field_g = var2.field_b;
            return var2;
          }
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_h = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final void a(hg param0, int param1) {
        L0: {
          if (null != param0.field_d) {
            param0.c((byte) -67);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_b = ((cn) this).field_d.field_b;
        param0.field_d = ((cn) this).field_d;
        param0.field_d.field_b = param0;
        if (param1 != 8364) {
          ((cn) this).a((byte) 45);
          param0.field_b.field_d = param0;
          return;
        } else {
          param0.field_b.field_d = param0;
          return;
        }
    }

    final int c(byte param0) {
        int var2 = 0;
        hg var3 = null;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (param0 <= 12) {
          return -109;
        } else {
          var2 = 0;
          var3 = ((cn) this).field_d.field_b;
          L0: while (true) {
            if (((cn) this).field_d == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_b;
              continue L0;
            }
          }
        }
    }

    final hg b(byte param0) {
        if (param0 != 70) {
            return null;
        }
        hg var2 = ((cn) this).field_g;
        if (!(var2 != ((cn) this).field_d)) {
            ((cn) this).field_g = null;
            return null;
        }
        ((cn) this).field_g = var2.field_b;
        return var2;
    }

    final void a(int param0, hg param1) {
        L0: {
          if (param1.field_d != null) {
            param1.c((byte) -25);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_d = ((cn) this).field_d.field_d;
        param1.field_b = ((cn) this).field_d;
        if (param0 != -12328) {
          hg discarded$2 = ((cn) this).c(50);
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
          return;
        } else {
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
          return;
        }
    }

    public cn() {
        ((cn) this).field_d = new hg();
        ((cn) this).field_d.field_b = ((cn) this).field_d;
        ((cn) this).field_d.field_d = ((cn) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new hf();
        field_c = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_e = "Log in / Create account";
        field_b = "This password contains your Player Name, and would be easy to guess";
        field_f = new cn();
    }
}
