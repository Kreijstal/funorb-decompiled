/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends gd {
    private boolean field_m;
    static volatile int field_j;
    private String field_k;
    static boolean field_i;
    static int field_l;

    cb(nk param0) {
        super(param0);
        ((cb) this).field_m = false;
    }

    final static String a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        if ((param1 ^ -1) <= -1) {
          var2 = param1 / 50;
          var3 = 2 * (param1 % 50);
          var4 = var2 / 60;
          var2 = var2 % 60;
          var9 = new char[8];
          var8 = var9;
          var7 = var8;
          var6 = var7;
          var5 = var6;
          var5[7] = (char)(var3 % 10 + 48);
          var5[4] = (char)(48 + var2 % 10);
          var5[6] = (char)(var3 / 10 + 48);
          var5[2] = (char)58;
          var5[5] = (char)46;
          var5[3] = (char)(48 + var2 / 10);
          var5[0] = (char)(48 + var4 / 10 % 10);
          if (param0 < 36) {
            String discarded$1 = cb.a(125, 106);
            var5[1] = (char)(48 + var4 % 10);
            return new String(var9);
          } else {
            var5[1] = (char)(48 + var4 % 10);
            return new String(var9);
          }
        } else {
          return "--:--.--";
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((cb) this).field_k = null;
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        nd var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param1) {
          var6 = (CharSequence) (Object) param0;
          var3 = en.a(12260, var6);
          if (var3 == null) {
            L0: {
              if (param0.equals((Object) (Object) ((cb) this).field_k)) {
                break L0;
              } else {
                var4 = vj.b(0, param0);
                if (var4 != null) {
                  if (var4.field_d == null) {
                    ((cb) this).field_k = param0;
                    ((cb) this).field_m = var4.field_f;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((cb) this).field_m) {
              return ud.field_j;
            } else {
              return od.field_m;
            }
          } else {
            return var3;
          }
        } else {
          ((cb) this).field_k = null;
          var5 = (CharSequence) (Object) param0;
          var3 = en.a(12260, var5);
          if (var3 == null) {
            L1: {
              if (param0.equals((Object) (Object) ((cb) this).field_k)) {
                break L1;
              } else {
                var4 = vj.b(0, param0);
                if (var4 != null) {
                  if (var4.field_d == null) {
                    ((cb) this).field_k = param0;
                    ((cb) this).field_m = var4.field_f;
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((cb) this).field_m) {
              return ud.field_j;
            } else {
              return od.field_m;
            }
          } else {
            return var3;
          }
        }
    }

    final fd a(String param0, byte param1) {
        nd var6 = null;
        nd var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        fd stackIn_12_0 = null;
        fd stackIn_18_0 = null;
        fd stackIn_32_0 = null;
        fd stackOut_31_0 = null;
        fd stackOut_30_0 = null;
        fd stackOut_11_0 = null;
        fd stackOut_10_0 = null;
        fd stackOut_17_0 = null;
        fd stackOut_16_0 = null;
        if (param1 >= 52) {
          var9 = (CharSequence) (Object) param0;
          if (!ff.a(var9, 8192)) {
            return g.field_k;
          } else {
            L0: {
              if (!param0.equals((Object) (Object) ((cb) this).field_k)) {
                L1: {
                  var7 = vj.b(0, param0);
                  if (var7 == null) {
                    break L1;
                  } else {
                    if (null != var7.field_d) {
                      break L1;
                    } else {
                      ((cb) this).field_k = param0;
                      ((cb) this).field_m = var7.field_f;
                      break L0;
                    }
                  }
                }
                return um.field_a;
              } else {
                break L0;
              }
            }
            L2: {
              if (!((cb) this).field_m) {
                stackOut_31_0 = g.field_k;
                stackIn_32_0 = stackOut_31_0;
                break L2;
              } else {
                stackOut_30_0 = tg.field_d;
                stackIn_32_0 = stackOut_30_0;
                break L2;
              }
            }
            return stackIn_32_0;
          }
        } else {
          field_i = true;
          var8 = (CharSequence) (Object) param0;
          if (!ff.a(var8, 8192)) {
            return g.field_k;
          } else {
            if (!param0.equals((Object) (Object) ((cb) this).field_k)) {
              var6 = vj.b(0, param0);
              if (var6 != null) {
                if (null != var6.field_d) {
                  return um.field_a;
                } else {
                  L3: {
                    ((cb) this).field_k = param0;
                    ((cb) this).field_m = var6.field_f;
                    if (!((cb) this).field_m) {
                      stackOut_11_0 = g.field_k;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = tg.field_d;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                return um.field_a;
              }
            } else {
              L4: {
                if (!((cb) this).field_m) {
                  stackOut_17_0 = g.field_k;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = tg.field_d;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              return stackIn_18_0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_j = 0;
        field_l = 0;
    }
}
