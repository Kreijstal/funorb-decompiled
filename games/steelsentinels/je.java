/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends ck {
    boolean field_q;
    static boolean field_v;
    static ul field_w;
    boolean field_p;
    int field_A;
    static int field_o;
    int field_x;
    int field_s;
    int field_B;
    int field_u;
    int field_y;
    int field_r;
    boolean field_z;
    static int field_t;

    public static void a(byte param0) {
        field_w = null;
        if (param0 >= -102) {
            Object var2 = null;
            u discarded$0 = je.a(-111, (byte[]) null);
        }
    }

    final static u a(int param0, byte[] param1) {
        u var2 = null;
        if (param1 != null) {
          if (param0 < 57) {
            return null;
          } else {
            var2 = new u(param1, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
            uh.a(9324);
            return var2;
          }
        } else {
          return null;
        }
    }

    je(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          ((je) this).field_x = param2;
          ((je) this).field_s = param0;
          ((je) this).field_q = false;
          ((je) this).field_A = param1;
          ((je) this).field_p = false;
          var4 = 50;
          ((je) this).field_z = false;
          if (-7 != (((je) this).field_s ^ -1)) {
            break L0;
          } else {
            var4 = 5;
            break L0;
          }
        }
        L1: {
          if (((je) this).field_s != 5) {
            break L1;
          } else {
            ((je) this).field_z = true;
            var4 = 125;
            break L1;
          }
        }
        L2: {
          if (((je) this).field_s != -13) {
            break L2;
          } else {
            ((je) this).field_z = false;
            var4 = 5;
            break L2;
          }
        }
        L3: {
          if (-4 != ((je) this).field_s) {
            break L3;
          } else {
            ((je) this).field_z = true;
            var4 = 100;
            break L3;
          }
        }
        L4: {
          if (0 != ((je) this).field_s) {
            break L4;
          } else {
            L5: {
              var4 = 10;
              if (-1 != (((je) this).field_A ^ -1)) {
                break L5;
              } else {
                var4 = 25;
                break L5;
              }
            }
            L6: {
              if (1 != ((je) this).field_A) {
                break L6;
              } else {
                var4 = 20;
                break L6;
              }
            }
            L7: {
              if ((((je) this).field_A ^ -1) != -3) {
                break L7;
              } else {
                var4 = 35;
                break L7;
              }
            }
            L8: {
              if (3 != ((je) this).field_A) {
                break L8;
              } else {
                var4 = 50;
                break L8;
              }
            }
            L9: {
              if (6 != ((je) this).field_A) {
                break L9;
              } else {
                var4 = 40;
                ((je) this).field_z = true;
                break L9;
              }
            }
            L10: {
              if ((((je) this).field_A ^ -1) != -8) {
                break L10;
              } else {
                var4 = 50;
                ((je) this).field_z = true;
                break L10;
              }
            }
            L11: {
              if (8 != ((je) this).field_A) {
                break L11;
              } else {
                var4 = 100;
                ((je) this).field_z = true;
                break L11;
              }
            }
            L12: {
              if ((((je) this).field_A ^ -1) != -10) {
                break L12;
              } else {
                var4 = 30;
                ((je) this).field_z = true;
                break L12;
              }
            }
            L13: {
              if ((((je) this).field_A ^ -1) != -11) {
                break L13;
              } else {
                var4 = 20;
                ((je) this).field_z = true;
                break L13;
              }
            }
            L14: {
              if (((je) this).field_A != 4) {
                break L14;
              } else {
                var4 = 75;
                break L14;
              }
            }
            if (5 != ((je) this).field_A) {
              break L4;
            } else {
              var4 = 75;
              break L4;
            }
          }
        }
        L15: {
          if ((((je) this).field_s ^ -1) != -8) {
            break L15;
          } else {
            ((je) this).field_z = true;
            var4 = 25;
            if (3 != ((je) this).field_A) {
              break L15;
            } else {
              var4 = 100;
              break L15;
            }
          }
        }
        L16: {
          if (((je) this).field_s != 8) {
            break L16;
          } else {
            var4 = 25;
            ((je) this).field_z = true;
            break L16;
          }
        }
        L17: {
          if ((((je) this).field_s ^ -1) != -10) {
            break L17;
          } else {
            ((je) this).field_z = true;
            var4 = 25;
            break L17;
          }
        }
        L18: {
          if (11 != ((je) this).field_s) {
            break L18;
          } else {
            var4 = 25;
            ((je) this).field_z = false;
            break L18;
          }
        }
        L19: {
          if (((je) this).field_s != 10) {
            break L19;
          } else {
            var4 = 1;
            break L19;
          }
        }
        ((je) this).field_r = var4 + ((je) this).field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = false;
        field_o = 0;
        field_w = new ul();
    }
}
