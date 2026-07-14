/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static e field_a;

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Bounce.field_N;
        if (ne.a(param1, param2, (byte) -33)) {
          if (param0 > 94) {
            var3 = 0;
            L0: while (true) {
              if (param1.length() > var3) {
                if (uc.a(2, param1.charAt(var3))) {
                  var3++;
                  continue L0;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            var5 = null;
            boolean discarded$5 = f.a((byte) -52, (CharSequence) null, true);
            var3 = 0;
            L1: while (true) {
              if (param1.length() > var3) {
                if (uc.a(2, param1.charAt(var3))) {
                  var3++;
                  continue L1;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(java.math.BigInteger param0, boolean param1, wi param2, wi param3, java.math.BigInteger param4) {
        if (param1) {
          field_a = null;
          dk.a(param3.field_h, 0, param2, 0, param4, param0, param3.field_i);
          return;
        } else {
          dk.a(param3.field_h, 0, param2, 0, param4, param0, param3.field_i);
          return;
        }
    }

    final static qh a(String param0, int param1) {
        if (param1 == -96) {
          if (pb.field_k.a(1000)) {
            if (param0.equals((Object) (Object) pb.field_k.a((byte) -101))) {
              return pb.field_k;
            } else {
              pb.field_k = kg.a(2, param0);
              return pb.field_k;
            }
          } else {
            return pb.field_k;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != -7355) {
            f.a(-56);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        if (!param1) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
    }
}
