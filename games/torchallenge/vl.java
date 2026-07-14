/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_c;
    static int field_b;
    static uj field_a;
    static boolean[][][] field_d;

    final static void a(byte param0) {
        if (!(lj.field_q)) {
            throw new IllegalStateException();
        }
        if (param0 != -88) {
            field_a = null;
        }
        fh.field_g = true;
        wb.a(false, (byte) -80);
        gj.field_c = 0;
    }

    final static void b(byte param0) {
        fg.i(126);
        eb.field_m = true;
        ga.field_y = true;
        int var1 = 45 / ((-48 - param0) / 48);
        t.field_b.i(8389905);
        gh.a((byte) -116, ub.field_g, false);
    }

    final static void a(byte[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 == null) {
            break L0;
          } else {
            if (hf.field_d != null) {
              L1: {
                var2 = 28;
                if (var2 > param0.length) {
                  break L1;
                } else {
                  if (var2 > hf.field_d.length) {
                    break L1;
                  } else {
                    if (hf.field_d.length == param0.length) {
                      L2: {
                        if (param1 >= 6) {
                          break L2;
                        } else {
                          field_d = null;
                          break L2;
                        }
                      }
                      var3 = hf.field_d.length;
                      var4 = 0;
                      L3: while (true) {
                        if (var4 >= var3) {
                          return;
                        } else {
                          hf.field_d[var4] = (byte)p.a((int) hf.field_d[var4], (int) param0[var4]);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            field_c = null;
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_d = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
    }
}
