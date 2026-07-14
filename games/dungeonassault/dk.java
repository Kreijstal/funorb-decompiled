/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk implements ca {
    static int field_c;
    static cn field_b;
    static String field_e;
    static String field_a;
    static int field_d;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -41) {
            field_b = null;
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        cn var9 = null;
        cn var10 = null;
        if (param0 == 34) {
          var6 = param1.field_q + param2;
          var7 = param3 + param1.field_v;
          ll.a(param0 ^ 32, var6, param1.field_x, param1.field_s, var7);
          var10 = sl.field_c[1];
          if (param1 instanceof ck) {
            if (!((ck) (Object) param1).field_E) {
              L0: {
                if (param1.a((byte) 28)) {
                  in.a(2 + var6, -4 + param1.field_s, param1.field_x - 4, var7 - -2, param0 + -33);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.b(var6 + (1 - -(-var10.field_E + param1.field_x >> -703459871)), 1 + var7 + (-var10.field_G + param1.field_s >> 855024673), 256);
                if (param1.a((byte) 28)) {
                  in.a(2 + var6, -4 + param1.field_s, param1.field_x - 4, var7 - -2, param0 + -33);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param1.a((byte) 28)) {
                in.a(2 + var6, -4 + param1.field_s, param1.field_x - 4, var7 - -2, param0 + -33);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          field_b = null;
          var6 = param1.field_q + param2;
          var7 = param3 + param1.field_v;
          ll.a(param0 ^ 32, var6, param1.field_x, param1.field_s, var7);
          var9 = sl.field_c[1];
          if (!(param1 instanceof ck)) {
            L3: {
              if (param1.a((byte) 28)) {
                in.a(2 + var6, -4 + param1.field_s, param1.field_x - 4, var7 - -2, param0 + -33);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (((ck) (Object) param1).field_E) {
                var9.b(var6 + (1 - -(-var9.field_E + param1.field_x >> -703459871)), 1 + var7 + (-var9.field_G + param1.field_s >> 855024673), 256);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1.a((byte) 28)) {
                in.a(2 + var6, -4 + param1.field_s, param1.field_x - 4, var7 - -2, param0 + -33);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static wh a(int param0, int param1, String param2) {
        vh var3 = vh.a(bl.field_t, "", param2);
        ai.a(param1 ^ param1, var3);
        return new wh(var3, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "You do not meet the requirements for the title of <%0>.";
        field_a = "Large, hairy humanoid with a jutting lower jaw, ramshackle plate armour and a two-handed hammer. Ogres are forever hungry, but luckily for them, they can eat almost anything.";
    }
}
