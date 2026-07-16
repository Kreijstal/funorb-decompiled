/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sm extends l {
    static int field_f;
    static int field_j;
    private int field_g;
    static String field_h;
    static int field_i;
    static int field_e;

    public static void b(int param0) {
        if (param0 != 10) {
            field_i = -38;
        }
        field_h = null;
    }

    final static String a(long param0, byte param1) {
        an.field_t.setTime(new Date(param0));
        int var3 = an.field_t.get(7);
        if (param1 <= 120) {
            Object var10 = null;
            byte[] discarded$0 = sm.a(-128, (byte[]) null);
        }
        int var4 = an.field_t.get(5);
        int var5 = an.field_t.get(2);
        int var6 = an.field_t.get(1);
        int var7 = an.field_t.get(11);
        int var8 = an.field_t.get(12);
        int var9 = an.field_t.get(13);
        return ed.field_y[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + mn.field_l[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        if (param2 != null) {
          L0: {
            var3 = param2.length();
            if ((var3 ^ -1) > -2) {
              break L0;
            } else {
              if (-13 <= (var3 ^ -1)) {
                L1: {
                  var4 = fe.a(60136, param2);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.length() >= 1) {
                      L2: {
                        if (am.a(var4.charAt(0), (byte) 100)) {
                          break L2;
                        } else {
                          if (!am.a(var4.charAt(var4.length() - 1), (byte) 26)) {
                            var5 = 0;
                            var6 = 0;
                            L3: while (true) {
                              if ((var6 ^ -1) <= (param2.length() ^ -1)) {
                                var6 = 35 % ((param0 - 35) / 59);
                                if (var5 > 0) {
                                  return on.field_a;
                                } else {
                                  return null;
                                }
                              } else {
                                L4: {
                                  var7 = param2.charAt(var6);
                                  if (am.a((char) var7, (byte) 125)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (2 > var5) {
                                    break L5;
                                  } else {
                                    if (!param1) {
                                      return fe.field_e;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var6++;
                                continue L3;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return on.field_a;
                    } else {
                      break L1;
                    }
                  }
                }
                return om.field_v;
              } else {
                break L0;
              }
            }
          }
          return om.field_v;
        } else {
          return om.field_v;
        }
    }

    final static int d(byte param0) {
        int var1 = -39 / ((param0 - -26) / 39);
        return (int)(1000000000L / s.field_k);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = -35 / ((-86 - param0) / 36);
        int var3 = param1.length;
        byte[] var4 = new byte[var3];
        eg.a(param1, 0, var4, 0, var3);
        return var4;
    }

    final l a(int param0) {
        if (li.field_a != null) {
            if (li.field_a.field_l != null) {
                if (180 <= li.field_a.field_f) {
                    return (l) this;
                }
            }
        }
        nj.field_k = kk.field_a[0].length;
        ij.a(0, param0, 0, kk.field_a);
        nj.field_k = 0;
        if (!(((sm) this).field_g < 60)) {
            jj.field_b = jj.field_b + -((jj.field_b ^ -1) >> -1059294717);
            if (jj.field_b >= kk.field_l) {
                kk.field_a = null;
                bd.a((byte) 35, true);
                kj.a((byte) 91);
                return null;
            }
        }
        ((sm) this).field_g = ((sm) this).field_g + 1;
        return (l) this;
    }

    final l b(byte param0) {
        kk.field_a = null;
        bd.a((byte) 35, false);
        kj.a((byte) 36);
        if (param0 == -90) {
            return null;
        }
        return null;
    }

    sm() {
        ((sm) this).field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_h = "?";
        field_i = -1;
    }
}
