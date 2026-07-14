/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    int[] field_e;
    int field_g;
    private int field_k;
    private String field_b;
    private boolean field_f;
    static int field_h;
    String field_i;
    static int field_j;
    int field_d;
    int field_a;
    private long field_c;

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = param0.length();
          if (-21 <= (var2 ^ -1)) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var9 = new char[var2];
        var8 = var9;
        var3 = var8;
        var4 = 0;
        var5 = 90 % ((param1 - 5) / 48);
        L1: while (true) {
          if (var2 <= var4) {
            return new String(var9);
          } else {
            L2: {
              var6 = param0.charAt(var4);
              if (var6 < 65) {
                break L2;
              } else {
                if (var6 > 90) {
                  break L2;
                } else {
                  var3[var4] = (char)(var6 - -32);
                  var4++;
                  var4++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var6 < 97) {
                  break L4;
                } else {
                  if (var6 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var6 < 48) {
                  break L5;
                } else {
                  if (var6 <= 57) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var6;
            var4++;
            continue L1;
          }
        }
    }

    final static sf a(int param0) {
        Object var2 = null;
        if (param0 != 1) {
          L0: {
            var2 = null;
            String discarded$1 = fg.a((CharSequence) null, 84);
            if (null == th.field_c) {
              th.field_c = new sf();
              th.field_c.a(42, uh.field_i);
              th.field_c.field_n = 5;
              th.field_c.field_g = u.field_d;
              th.field_c.field_s = 6;
              th.field_c.field_k = 2763306;
              th.field_c.field_t = 4;
              th.field_c.field_c = 0;
              th.field_c.field_r = 7697781;
              th.field_c.field_q = 14;
              break L0;
            } else {
              break L0;
            }
          }
          return th.field_c;
        } else {
          L1: {
            if (null == th.field_c) {
              th.field_c = new sf();
              th.field_c.a(42, uh.field_i);
              th.field_c.field_n = 5;
              th.field_c.field_g = u.field_d;
              th.field_c.field_s = 6;
              th.field_c.field_k = 2763306;
              th.field_c.field_t = 4;
              th.field_c.field_c = 0;
              th.field_c.field_r = 7697781;
              th.field_c.field_q = 14;
              break L1;
            } else {
              break L1;
            }
          }
          return th.field_c;
        }
    }

    fg(boolean param0) {
        ((fg) this).field_k = ib.field_o;
        ((fg) this).field_i = am.field_m;
        ((fg) this).field_f = td.field_f;
        ((fg) this).field_a = kl.field_J;
        ((fg) this).field_b = tf.field_kb;
        ((fg) this).field_c = fm.field_j;
        ((fg) this).field_g = dj.field_K;
        if (param0) {
            ((fg) this).field_e = mf.field_x;
        } else {
            ((fg) this).field_e = null;
        }
        ((fg) this).field_d = ob.field_a;
    }

    final int a(byte param0) {
        int var2 = 0;
        if (!((fg) this).field_f) {
          if ((((fg) this).field_a ^ -1) != -3) {
            if (((fg) this).field_c != DrPhlogistonSavesTheEarth.field_I) {
              var2 = 19 / ((param0 - -29) / 38);
              if (-3 == (of.field_v ^ -1)) {
                if (ik.a(((fg) this).field_b, (byte) -119)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            if (0 >= ((fg) this).field_k) {
              if (((fg) this).field_c != DrPhlogistonSavesTheEarth.field_I) {
                var2 = 19 / ((param0 - -29) / 38);
                if (-3 == (of.field_v ^ -1)) {
                  if (ik.a(((fg) this).field_b, (byte) -119)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    static {
    }
}
