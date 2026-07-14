/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_f;
    int[] field_c;
    boolean field_b;
    private int[] field_k;
    static String field_n;
    static boolean field_a;
    int field_m;
    int[] field_e;
    int field_i;
    int field_d;
    int field_j;
    int field_l;
    int field_g;
    boolean field_h;

    public static void b(byte param0) {
        if (param0 != -114) {
            vh.a(67, -67);
        }
        field_n = null;
    }

    final void a(boolean param0, byte param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (((vh) this).field_k.length * 32 <= ((vh) this).field_j) {
            var6 = new int[2 * ((vh) this).field_k.length];
            int[] var3 = var6;
            for (var4 = 0; var4 < ((vh) this).field_k.length; var4++) {
                var6[var4] = ((vh) this).field_k[var4];
            }
        }
        if (param1 >= -122) {
            return;
        }
        if (!(!param0)) {
            ((vh) this).field_k[((vh) this).field_j >> 1151845829] = hm.a(((vh) this).field_k[((vh) this).field_j >> 1151845829], 1 << pf.b(31, ((vh) this).field_j));
        }
        ((vh) this).field_j = ((vh) this).field_j + 1;
    }

    final boolean a(byte param0, int param1) {
        if (param0 <= 26) {
            return true;
        }
        return (((vh) this).field_k[param1 >> 2065069605] & 1 << (param1 & 31)) != 0 ? true : false;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          var2 = 0;
          var3 = sn.field_c;
          if (var3 < 5) {
            var2 = 8192 * var3 * var3 / 1100;
            break L0;
          } else {
            if (var3 < 105) {
              var2 = (-40960 + 16384 * var3) / 220;
              break L0;
            } else {
              if ((var3 ^ -1) > -121) {
                var3 = -var3 + 120;
                var2 = 8192 + -(var3 * var3 * 8192 / 3300);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param0 != 3) {
            break L1;
          } else {
            var4 = -1;
            break L1;
          }
        }
        L2: {
          if (param0 != 1) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (param0 == 4) {
            var4 = 1;
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 5) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0 != 6) {
            break L5;
          } else {
            var5 = -1;
            var4 = 1;
            break L5;
          }
        }
        L6: {
          L7: {
            if (7 == param0) {
              break L7;
            } else {
              if ((param0 ^ -1) != -9) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (param0 != 11) {
            break L8;
          } else {
            var4 = -1;
            break L8;
          }
        }
        if (param1 == 10718) {
          L9: {
            if (param0 != -13) {
              break L9;
            } else {
              var5 = -1;
              var4 = -1;
              break L9;
            }
          }
          L10: {
            if (-14 == param0) {
              var5 = -1;
              var4 = 1;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (14 != param0) {
              break L11;
            } else {
              var5 = 1;
              var4 = -1;
              break L11;
            }
          }
          L12: {
            if (-16 != (param0 ^ -1)) {
              break L12;
            } else {
              var5 = 1;
              var4 = 1;
              break L12;
            }
          }
          kf.field_a = cj.d(param1 ^ -10660, var4 * var2, var2 * var5);
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        ((vh) this).field_m = 0;
        ((vh) this).field_c = new int[4];
        ((vh) this).field_l = 0;
        ((vh) this).field_e = new int[2];
        ((vh) this).field_d = 0;
        ((vh) this).field_h = false;
        ((vh) this).field_k = new int[4];
        ((vh) this).field_g = 0;
        if (param0 <= 104) {
            vh.b((byte) 20);
        }
        ((vh) this).field_j = 0;
        ((vh) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Secret achievement";
        field_a = false;
    }
}
