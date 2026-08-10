/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cf extends ca {
    final static boolean a(char param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
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
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          cf.c(5);
          if (160 != param0) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
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
        try {
            vk.a(param0.field_w, 0, param0.field_F);
            if (param1 != 50) {
                fc var3 = (fc) null;
                cf.a((fc) null, (byte) -22);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "cf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String c(int param0) {
        if (param0 != 32) {
            return (String) null;
        }
        return si.field_q;
    }

    cf() {
    }

    static {
    }
}
