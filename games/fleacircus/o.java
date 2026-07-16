/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends wj {
    static int field_m;
    private long field_e;
    private long field_i;
    static String field_g;
    static boolean field_l;
    private long[] field_j;
    private int field_h;
    private long field_k;
    private int field_f;

    final long b(int param0) {
        if (param0 != -31887) {
            ((o) this).field_k = 83L;
        }
        ((o) this).field_e = ((o) this).field_e + this.a((byte) -63);
        if (!((((o) this).field_e ^ -1L) <= (((o) this).field_k ^ -1L))) {
            return (-((o) this).field_e + ((o) this).field_k) / 1000000L;
        }
        return 0L;
    }

    final static String a(byte param0, int param1, int param2) {
        if (param0 != 85) {
            boolean discarded$0 = o.c((byte) -64);
        }
        return param1 + "/" + param2;
    }

    private final long a(byte param0) {
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -((o) this).field_i + var2;
        ((o) this).field_i = var2;
        if (-5000000000L < var4) {
            if (!(5000000000L <= var4)) {
                ((o) this).field_j[((o) this).field_h] = var4;
                ((o) this).field_h = (((o) this).field_h + 1) % 10;
                if (!(-2 >= (((o) this).field_f ^ -1))) {
                    ((o) this).field_f = ((o) this).field_f + 1;
                }
            }
        }
        long var6 = 0L;
        if (param0 != -63) {
            o.b((byte) -81);
        }
        for (var8 = 1; var8 <= ((o) this).field_f; var8++) {
            var6 = var6 + ((o) this).field_j[(((o) this).field_h + (-var8 - -10)) % 10];
        }
        return var6 / (long)((o) this).field_f;
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 < 55) {
            field_g = null;
        }
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0 == -23124) {
            break L0;
          } else {
            break L0;
          }
        }
        if ((((o) this).field_e ^ -1L) <= (((o) this).field_k ^ -1L)) {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((o) this).field_k = ((o) this).field_k + param1;
              var4++;
              if (-11 >= (var4 ^ -1)) {
                break L2;
              } else {
                if (((o) this).field_e > ((o) this).field_k) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((o) this).field_e > ((o) this).field_k) {
                ((o) this).field_k = ((o) this).field_e;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((o) this).field_i = ((o) this).field_i + (((o) this).field_k - ((o) this).field_e);
          ((o) this).field_e = ((o) this).field_e + (((o) this).field_k + -((o) this).field_e);
          ((o) this).field_k = ((o) this).field_k + param1;
          return 1;
        }
    }

    final static boolean c(byte param0) {
        if (param0 != 39) {
            field_m = 21;
        }
        return jg.field_d;
    }

    final static boolean a(boolean param0, String param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length() < rf.field_d) {
              break L0;
            } else {
              if (param1.length() <= rh.field_a) {
                L1: {
                  if (!param0) {
                    break L1;
                  } else {
                    field_m = -82;
                    break L1;
                  }
                }
                return false;
              } else {
                return true;
              }
            }
          }
        }
        return true;
    }

    final void c(int param0) {
        ((o) this).field_i = 0L;
        if (((o) this).field_e < ((o) this).field_k) {
            ((o) this).field_e = ((o) this).field_e + (-((o) this).field_e + ((o) this).field_k);
        }
        if (param0 != 12445) {
            Object var3 = null;
            boolean discarded$0 = o.a(true, (String) null);
        }
    }

    o() {
        ((o) this).field_j = new long[10];
        ((o) this).field_i = 0L;
        ((o) this).field_e = 0L;
        ((o) this).field_h = 0;
        ((o) this).field_k = 0L;
        ((o) this).field_f = 1;
        ((o) this).field_e = System.nanoTime();
        ((o) this).field_k = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_l = false;
    }
}
