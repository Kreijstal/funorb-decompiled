/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cn extends vp {
    cn field_u;
    cn field_x;
    static String field_v;
    static int field_w;

    final static String a(CharSequence param0, byte param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = param0.length();
          if (var2 > 20) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          if (param1 == 53) {
            break L1;
          } else {
            cn.e(false);
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param0.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(var5 - 65 + 97);
                  var4++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var5 < 48) {
                  break L6;
                } else {
                  if (var5 > 57) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    final void f(byte param0) {
        if (!(((cn) this).field_u != null)) {
            return;
        }
        ((cn) this).field_u.field_x = ((cn) this).field_x;
        ((cn) this).field_x.field_u = ((cn) this).field_u;
        if (param0 != -62) {
            ((cn) this).f((byte) -89);
        }
        ((cn) this).field_x = null;
        ((cn) this).field_u = null;
    }

    public static void e(boolean param0) {
        field_v = null;
        if (!param0) {
            Object var2 = null;
            String discarded$0 = cn.a((CharSequence) null, (byte) 57);
        }
    }

    protected cn() {
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 > -67) {
            field_v = null;
        }
        int var3 = param1 >>> -772668161;
        return -var3 + (param1 + var3) / param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Email: ";
    }
}
