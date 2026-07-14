/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends tf {
    private int field_g;
    private long field_f;
    private long field_e;
    private int field_h;
    private long[] field_d;
    private long field_c;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param1 = lm.a('_', param2 + -172, param1, "");
          var3 = ph.a(param0, 0);
          if (param2 == 52) {
            break L0;
          } else {
            var4 = (String) null;
            boolean discarded$2 = cr.a((String) null, (String) null, (byte) -22);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 != param1.indexOf(param0)) {
              break L2;
            } else {
              if (param1.indexOf(var3) == -1) {
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

    final long a(boolean param0) {
        ((cr) this).field_c = ((cr) this).field_c + this.b(-89);
        if (!(((cr) this).field_e <= ((cr) this).field_c)) {
            return (-((cr) this).field_c + ((cr) this).field_e) / 1000000L;
        }
        if (param0) {
            ((cr) this).a(6);
        }
        return 0L;
    }

    final void a(int param0) {
        if (!(((cr) this).field_c >= ((cr) this).field_e)) {
            ((cr) this).field_c = ((cr) this).field_c + (-((cr) this).field_c + ((cr) this).field_e);
        }
        ((cr) this).field_f = (long)param0;
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (param1 != 0) {
            return -42;
        }
        if (((cr) this).field_c >= ((cr) this).field_e) {
            var4 = 0;
            do {
                ((cr) this).field_e = ((cr) this).field_e + param0;
                var4++;
                // if_icmpge L69
            } while ((((cr) this).field_e ^ -1L) > (((cr) this).field_c ^ -1L));
            if (!((((cr) this).field_c ^ -1L) >= (((cr) this).field_e ^ -1L))) {
                ((cr) this).field_e = ((cr) this).field_c;
            }
            return var4;
        }
        ((cr) this).field_f = ((cr) this).field_f + (((cr) this).field_e + -((cr) this).field_c);
        ((cr) this).field_c = ((cr) this).field_c + (((cr) this).field_e + -((cr) this).field_c);
        ((cr) this).field_e = ((cr) this).field_e + param0;
        return 1;
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = AceOfSkies.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((cr) this).field_f;
        if (param0 >= -71) {
            return 93L;
        }
        ((cr) this).field_f = var2;
        if (-5000000000L < var4) {
            if (-5000000001L < (var4 ^ -1L)) {
                ((cr) this).field_d[((cr) this).field_h] = var4;
                if (((cr) this).field_g < 1) {
                    ((cr) this).field_g = ((cr) this).field_g + 1;
                }
                ((cr) this).field_h = (1 + ((cr) this).field_h) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((cr) this).field_g; var8++) {
            var6 = var6 + ((cr) this).field_d[(10 + ((cr) this).field_h - var8) % 10];
        }
        return var6 / (long)((cr) this).field_g;
    }

    cr() {
        ((cr) this).field_e = 0L;
        ((cr) this).field_g = 1;
        ((cr) this).field_d = new long[10];
        ((cr) this).field_f = 0L;
        ((cr) this).field_h = 0;
        ((cr) this).field_c = 0L;
        ((cr) this).field_c = System.nanoTime();
        ((cr) this).field_e = System.nanoTime();
    }

    static {
    }
}
