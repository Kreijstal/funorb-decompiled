/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl extends pp {
    static du field_j;
    static kv[] field_k;
    int field_i;
    int field_l;

    final void a(lu param0, byte param1) {
        int var3 = -112 % ((34 - param1) / 58);
        this.a(param0, (byte) -32);
        param0.b(((sl) this).field_f, -114);
        param0.d(((sl) this).field_i, 0);
        param0.d(((sl) this).field_l, 0);
    }

    final static void a(byte param0, String param1) {
        if (param0 >= -67) {
            return;
        }
        System.out.println("Error: " + ig.a(-19384, param1, "%0a", "\n"));
    }

    final static boolean a(boolean param0, byte param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        if (param2 == null) {
          return false;
        } else {
          L0: {
            var3 = param2.length();
            if ((var3 ^ -1) > -2) {
              break L0;
            } else {
              if ((var3 ^ -1) < -13) {
                break L0;
              } else {
                L1: {
                  var5 = 28 % ((78 - param1) / 34);
                  var4 = fq.a(0, param2);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.length() < 1) {
                      break L1;
                    } else {
                      L2: {
                        if (mp.a(true, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (mp.a(true, var4.charAt(var4.length() + -1))) {
                            break L2;
                          } else {
                            var6 = 0;
                            var7 = 0;
                            L3: while (true) {
                              if (var7 >= param2.length()) {
                                if (var6 <= 0) {
                                  return true;
                                } else {
                                  return false;
                                }
                              } else {
                                L4: {
                                  var8 = param2.charAt(var7);
                                  if (mp.a(true, (char) var8)) {
                                    var6++;
                                    break L4;
                                  } else {
                                    var6 = 0;
                                    break L4;
                                  }
                                }
                                if (2 <= var6) {
                                  if (!param0) {
                                    return false;
                                  } else {
                                    var7++;
                                    continue L3;
                                  }
                                } else {
                                  var7++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        }
    }

    sl(int param0, int param1, int param2) {
        ((sl) this).field_l = param2;
        ((sl) this).field_f = param0;
        ((sl) this).field_i = param1;
    }

    final void a(aga param0, op param1, int param2) {
        wia var5 = param1.field_a[((sl) this).field_i][((sl) this).field_l];
        wia var6 = var5;
        wia var4 = var6;
        if (!(var4 != null)) {
            return;
        }
        if (!var6.b((byte) -113)) {
            return;
        }
        if (!(param0 == null)) {
            param1.field_T.field_f[param0.field_D] = param1.field_T.field_f[param0.field_D] + var5.field_h;
        }
        if (param2 != 12) {
            return;
        }
        var6.field_h = var6.field_h - ((sl) this).field_f;
        if (!(0 <= var6.field_h)) {
            var4.field_h = 0;
            param1.b((byte) -56, param1.field_L.field_o[((sl) this).field_i][((sl) this).field_l].field_n, ((sl) this).field_i, ((sl) this).field_l);
            param1.field_e = param1.field_e - 1;
            if (param0 != null) {
                param1.field_T.field_w[param0.field_D] = param1.field_T.field_w[param0.field_D] + 1;
            }
        }
    }

    public static void d(byte param0) {
        field_k = null;
        int var1 = 13 % ((param0 - 53) / 61);
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new du(1, 2, 2, 0);
    }
}
