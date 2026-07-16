/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ln {
    private long field_g;
    private long[] field_e;
    private int field_d;
    private long field_h;
    private int field_i;
    private long field_f;

    private final long b(boolean param0) {
        int var8 = 0;
        int var9 = ZombieDawn.field_J;
        long var2 = System.nanoTime();
        if (!param0) {
            return -101L;
        }
        long var4 = -((ab) this).field_g + var2;
        ((ab) this).field_g = var2;
        if (4999999999L > (var4 ^ -1L)) {
            if (5000000000L > var4) {
                ((ab) this).field_e[((ab) this).field_d] = var4;
                ((ab) this).field_d = (((ab) this).field_d + 1) % 10;
                if (!(1 <= ((ab) this).field_i)) {
                    ((ab) this).field_i = ((ab) this).field_i + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((ab) this).field_i; var8++) {
            var6 = var6 + ((ab) this).field_e[(10 + -var8 + ((ab) this).field_d) % 10];
        }
        return var6 / (long)((ab) this).field_i;
    }

    final long a(byte param0) {
        if (param0 > -110) {
            ((ab) this).field_e = null;
        }
        ((ab) this).field_h = ((ab) this).field_h + this.b(true);
        if (!((((ab) this).field_h ^ -1L) <= (((ab) this).field_f ^ -1L))) {
            return (-((ab) this).field_h + ((ab) this).field_f) / 1000000L;
        }
        return 0L;
    }

    final static void a(vn[] param0, byte param1, int param2) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ZombieDawn.field_J;
          ob.field_b[param2] = param0;
          if (param1 > 31) {
            break L0;
          } else {
            var5 = null;
            ab.a((vn[]) null, (byte) 32, 21);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 != 0) {
              break L2;
            } else {
              param0[6].a();
              bi.b(0, 0, 24, 24, 0);
              h.a(param0, 3, 79, (byte) -17, 2);
              h.a(param0, 4, 78, (byte) -17, 2);
              h.a(param0, 1, 77, (byte) -17, 2);
              h.a(param0, 2, 76, (byte) -17, 2);
              h.a(param0, 5, 75, (byte) -17, 2);
              h.a(param0, 6, 74, (byte) -17, 2);
              h.a(param0, 7, 73, (byte) -17, 2);
              h.a(param0, 8, 72, (byte) -17, 2);
              h.a(param0, 3, 71, (byte) -17, 0);
              h.a(param0, 4, 70, (byte) -17, 0);
              h.a(param0, 1, 69, (byte) -17, 0);
              h.a(param0, 2, 68, (byte) -17, 0);
              h.a(param0, 5, 67, (byte) -17, 0);
              h.a(param0, 6, 66, (byte) -17, 0);
              h.a(param0, 7, 65, (byte) -17, 0);
              h.a(param0, 8, 64, (byte) -17, 0);
              h.a(param0, 2, 61, (byte) -17, 7);
              h.a(param0, 1, 60, (byte) -17, 7);
              h.a(param0, 5, 59, (byte) -17, 7);
              h.a(param0, 6, 58, (byte) -17, 7);
              h.a(param0, 7, 57, (byte) -17, 7);
              h.a(param0, 8, 56, (byte) -17, 7);
              h.a(param0, 2, 55, (byte) -17, 24);
              h.a(param0, 1, 54, (byte) -17, 24);
              h.a(param0, 5, 53, (byte) -17, 24);
              h.a(param0, 0, 63, (byte) -17, 2);
              h.a(param0, 0, 62, (byte) -17, 0);
              if (0 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (-5 == (param2 ^ -1)) {
              break L3;
            } else {
              L4: {
                if (1 != param2) {
                  break L4;
                } else {
                  h.a(param0, 2, 63, (byte) -17, 2);
                  h.a(param0, 1, 62, (byte) -17, 2);
                  h.a(param0, 5, 61, (byte) -17, 2);
                  h.a(param0, 6, 60, (byte) -17, 2);
                  h.a(param0, 8, 59, (byte) -17, 2);
                  h.a(param0, 7, 58, (byte) -17, 2);
                  h.a(param0, 4, 57, (byte) -17, 2);
                  h.a(param0, 2, 56, (byte) -17, 3);
                  h.a(param0, 1, 55, (byte) -17, 3);
                  h.a(param0, 5, 54, (byte) -17, 3);
                  h.a(param0, 6, 53, (byte) -17, 3);
                  h.a(param0, 8, 52, (byte) -17, 3);
                  h.a(param0, 7, 51, (byte) -17, 3);
                  h.a(param0, 0, 50, (byte) -17, 3);
                  h.a(param0, 3, 49, (byte) -17, 2);
                  h.a(param0, 1, 48, (byte) -17, 0);
                  h.a(param0, 2, 47, (byte) -17, 0);
                  h.a(param0, 3, 46, (byte) -17, 9);
                  if (0 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((param2 ^ -1) == -3) {
                  break L5;
                } else {
                  if ((param2 ^ -1) == -4) {
                    h.a(param0, 3, 63, (byte) -17, 4);
                    h.a(param0, 4, 62, (byte) -17, 4);
                    h.a(param0, 1, 61, (byte) -17, 4);
                    h.a(param0, 2, 60, (byte) -17, 4);
                    h.a(param0, 5, 59, (byte) -17, 4);
                    h.a(param0, 6, 58, (byte) -17, 4);
                    h.a(param0, 7, 57, (byte) -17, 4);
                    h.a(param0, 8, 56, (byte) -17, 4);
                    h.a(param0, 0, 55, (byte) -17, 4);
                    h.a(param0, 0, 52, (byte) -17, 5);
                    h.a(param0, 2, 51, (byte) -17, 12);
                    h.a(param0, 1, 50, (byte) -17, 12);
                    h.a(param0, 2, 49, (byte) -17, 26);
                    h.a(param0, 1, 48, (byte) -17, 26);
                    h.a(param0, 8, 47, (byte) -17, 26);
                    h.a(param0, 5, 46, (byte) -17, 26);
                    h.a(param0, 6, 45, (byte) -17, 26);
                    h.a(param0, 7, 44, (byte) -17, 26);
                    h.a(param0, 2, 43, (byte) -17, 6);
                    h.a(param0, 1, 42, (byte) -17, 6);
                    h.a(param0, 5, 41, (byte) -17, 12);
                    h.a(param0, 8, 40, (byte) -17, 12);
                    h.a(param0, 4, 39, (byte) -17, 12);
                    h.a(param0, 3, 38, (byte) -17, 12);
                    h.a(param0, 2, 37, (byte) -17, 29);
                    h.a(param0, 0, 36, (byte) -17, 29);
                    h.a(param0, 4, 23, (byte) -17, 26);
                    h.a(param0, 6, 22, (byte) -17, 12);
                    h.a(param0, 7, 21, (byte) -17, 12);
                    if (0 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              h.a(param0, 3, 63, (byte) -17, 0);
              h.a(param0, 4, 62, (byte) -17, 0);
              h.a(param0, 1, 61, (byte) -17, 0);
              h.a(param0, 2, 60, (byte) -17, 0);
              h.a(param0, 5, 59, (byte) -17, 0);
              h.a(param0, 6, 58, (byte) -17, 0);
              h.a(param0, 7, 57, (byte) -17, 0);
              h.a(param0, 8, 56, (byte) -17, 0);
              h.a(param0, 3, 55, (byte) -17, 3);
              h.a(param0, 4, 54, (byte) -17, 3);
              h.a(param0, 1, 53, (byte) -17, 3);
              h.a(param0, 2, 52, (byte) -17, 3);
              h.a(param0, 5, 51, (byte) -17, 3);
              h.a(param0, 6, 50, (byte) -17, 3);
              h.a(param0, 7, 49, (byte) -17, 3);
              h.a(param0, 8, 48, (byte) -17, 3);
              h.a(param0, 0, 47, (byte) -17, 0);
              h.a(param0, 0, 46, (byte) -17, 3);
              h.a(param0, 2, 45, (byte) -17, 15);
              h.a(param0, 1, 44, (byte) -17, 15);
              if (0 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
          }
          h.a(param0, 3, 79, (byte) -17, 0);
          h.a(param0, 4, 78, (byte) -17, 0);
          h.a(param0, 1, 77, (byte) -17, 0);
          h.a(param0, 2, 76, (byte) -17, 0);
          h.a(param0, 5, 75, (byte) -17, 0);
          h.a(param0, 6, 74, (byte) -17, 0);
          h.a(param0, 7, 73, (byte) -17, 0);
          h.a(param0, 8, 72, (byte) -17, 0);
          h.a(param0, 0, 71, (byte) -17, 0);
          break L1;
        }
    }

    final void a(boolean param0) {
        if (!((((ab) this).field_f ^ -1L) >= (((ab) this).field_h ^ -1L))) {
            ((ab) this).field_h = ((ab) this).field_h + (-((ab) this).field_h + ((ab) this).field_f);
        }
        ((ab) this).field_g = 0L;
        if (!param0) {
            ((ab) this).field_i = -125;
        }
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param0 <= -76) {
            break L0;
          } else {
            ((ab) this).a(false);
            break L0;
          }
        }
        if ((((ab) this).field_h ^ -1L) <= (((ab) this).field_f ^ -1L)) {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((ab) this).field_f = ((ab) this).field_f + param1;
              var4++;
              if (10 <= var4) {
                break L2;
              } else {
                if ((((ab) this).field_f ^ -1L) > (((ab) this).field_h ^ -1L)) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((ab) this).field_h > ((ab) this).field_f) {
                ((ab) this).field_f = ((ab) this).field_h;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((ab) this).field_g = ((ab) this).field_g + (-((ab) this).field_h + ((ab) this).field_f);
          ((ab) this).field_h = ((ab) this).field_h + (-((ab) this).field_h + ((ab) this).field_f);
          ((ab) this).field_f = ((ab) this).field_f + param1;
          return 1;
        }
    }

    final static vn[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 >= -6) {
            vn[] discarded$0 = ab.a(61, (byte) -100, -10, 45, -84);
        }
        return ca.a(param2, param0, 1, 1, param4, 1, 3, param3, -120);
    }

    final static void a(de param0, java.math.BigInteger param1, byte param2, de param3, java.math.BigInteger param4) {
        int var5 = 50 % ((param2 - -43) / 46);
        oh.a(param0.field_h, 0, param4, param3, param0.field_j, 31857, param1);
    }

    ab() {
        ((ab) this).field_d = 0;
        ((ab) this).field_e = new long[10];
        ((ab) this).field_h = 0L;
        ((ab) this).field_g = 0L;
        ((ab) this).field_i = 1;
        ((ab) this).field_f = 0L;
        ((ab) this).field_h = System.nanoTime();
        ((ab) this).field_f = System.nanoTime();
    }

    static {
    }
}
