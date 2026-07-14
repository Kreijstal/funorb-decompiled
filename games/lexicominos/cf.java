/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cf extends ca {
    final static boolean a(char param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 78) {
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          String discarded$5 = cf.c(5);
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(fc param0, byte param1) {
        vk.a(param0.field_w, 0, param0.field_F);
        if (param1 != 50) {
            Object var3 = null;
            cf.a((fc) null, (byte) -22);
        }
    }

    final static String c(int param0) {
        if (param0 != 32) {
            return null;
        }
        return si.field_q;
    }

    cf() {
    }

    static {
    }
}
