/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static qj[] field_d;
    static volatile int field_f;
    static int field_b;
    private gb field_e;
    static String field_a;
    static int field_c;
    private gb field_g;

    final gb b(int param0) {
        gb var2 = ((mb) this).field_e.field_k;
        if (((mb) this).field_e == var2) {
            ((mb) this).field_g = null;
            return null;
        }
        ((mb) this).field_g = var2.field_k;
        if (param0 != 48) {
            return null;
        }
        return var2;
    }

    final gb a(int param0) {
        gb var2 = ((mb) this).field_e.field_k;
        if (((mb) this).field_e == var2) {
            return null;
        }
        var2.e(0);
        if (param0 != -58) {
            mb.a(-120, -63, -45, (byte) 19, 80);
        }
        return var2;
    }

    public static void b(byte param0) {
        if (param0 != -36) {
            field_a = null;
        }
        field_d = null;
        field_a = null;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          if (param2 < 2) {
            break L0;
          } else {
            if (-37 <= (param2 ^ -1)) {
              L1: {
                var4 = 0;
                if (param0 == 55) {
                  break L1;
                } else {
                  field_c = -28;
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (43 != var9) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (97 > var9) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param2 > var9) {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = param2 * var6 + var9;
                    if (var10 / param2 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        nk.b(false);
        ll.b(param0, param1, param4, param2);
        int var5 = -22 % ((param3 - 51) / 54);
    }

    final static void a(byte param0, qj param1) {
        int var2 = 45 / ((64 - param0) / 53);
        nk.b(false);
        ll.a(param1.field_z, param1.field_s, param1.field_v);
    }

    final void a(gb param0, boolean param1) {
        if (null != param0.field_j) {
            param0.e(0);
        }
        if (!param1) {
            field_a = null;
        }
        param0.field_k = ((mb) this).field_e;
        param0.field_j = ((mb) this).field_e.field_j;
        param0.field_j.field_k = param0;
        param0.field_k.field_j = param0;
    }

    final gb a(byte param0) {
        if (param0 <= 70) {
            Object var3 = null;
            ((mb) this).a((gb) null, true);
        }
        gb var2 = ((mb) this).field_g;
        if (!(var2 != ((mb) this).field_e)) {
            ((mb) this).field_g = null;
            return null;
        }
        ((mb) this).field_g = var2.field_k;
        return var2;
    }

    public mb() {
        ((mb) this).field_e = new gb();
        ((mb) this).field_e.field_j = ((mb) this).field_e;
        ((mb) this).field_e.field_k = ((mb) this).field_e;
    }

    final int c(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 > -42) {
            return -128;
        }
        gb var3 = ((mb) this).field_e.field_k;
        while (var3 != ((mb) this).field_e) {
            var2++;
            var3 = var3.field_k;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new qj[104];
        field_f = 0;
        field_b = 0;
        field_a = "Achieved";
    }
}
