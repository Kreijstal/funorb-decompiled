/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements ci {
    final static String a(byte param0, String param1, String param2, qk param3, String param4) {
        if (!param3.b(4)) {
          return param2;
        } else {
          if (param0 != 87) {
            return (String) null;
          } else {
            return param4 + " - " + param3.a(param1, 0) + "%";
          }
        }
    }

    final static boolean a(int param0, pb param1) {
        int var2 = param1.f(param0 ^ 109);
        int var3 = (var2 ^ -1) != param0 ? 0 : 1;
        return var3 != 0;
    }

    final static boolean a(byte param0, char param1) {
        String var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -63) {
          if (param1 != 160) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
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
          var3 = (String) null;
          String discarded$4 = tg.a((byte) 33, (String) null, (String) null, (qk) null, (String) null);
          if (param1 != 160) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
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

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        kc var8 = null;
        pb var9 = null;
        var6 = ((lk) param1).field_o + param0;
        var7 = ((lk) param1).field_i + param3;
        kl.b(((lk) param1).field_q, var7, var6, 48, ((lk) param1).field_h);
        var8 = gh.field_n[1];
        if (param2 == 11447) {
          L0: {
            if (!(param1 instanceof hl)) {
              break L0;
            } else {
              if (((hl) param1).field_D) {
                var8.b(1 + (var6 - -(-((kc) var8).field_l + ((lk) param1).field_h >> 1005956513)), (-((kc) var8).field_k + ((lk) param1).field_q >> 343228385) + 1 + var7, 256);
                break L0;
              } else {
                if (param1.d(82)) {
                  na.a(2 + var7, 71, -4 + ((lk) param1).field_h, -4 + ((lk) param1).field_q, var6 - -2);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (param1.d(82)) {
            na.a(2 + var7, 71, -4 + ((lk) param1).field_h, -4 + ((lk) param1).field_q, var6 - -2);
            return;
          } else {
            return;
          }
        } else {
          var9 = (pb) null;
          boolean discarded$1 = tg.a(65, (pb) null);
          if (param1 instanceof hl) {
            L1: {
              if (((hl) param1).field_D) {
                var8.b(1 + (var6 - -(-((kc) var8).field_l + ((lk) param1).field_h >> 1005956513)), (-((kc) var8).field_k + ((lk) param1).field_q >> 343228385) + 1 + var7, 256);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param1.d(82)) {
              return;
            } else {
              na.a(2 + var7, 71, -4 + ((lk) param1).field_h, -4 + ((lk) param1).field_q, var6 - -2);
              return;
            }
          } else {
            if (param1.d(82)) {
              na.a(2 + var7, 71, -4 + ((lk) param1).field_h, -4 + ((lk) param1).field_q, var6 - -2);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
    }
}
