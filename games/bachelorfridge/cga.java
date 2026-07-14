/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cga extends eo {
    static int field_p;
    static ee field_r;
    boolean field_q;
    boolean field_o;
    volatile boolean field_n;

    abstract byte[] d(byte param0);

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        var5 = BachelorFridge.field_y;
        if (param1 <= 0) {
          L0: {
            if (param1 < 160) {
              break L0;
            } else {
              if (param1 > 255) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (param0 == 255) {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var16 = on.field_s;
                var11 = var16;
                var6 = var11;
                var2 = var6;
                var3 = 0;
                L2: while (true) {
                  if (var16.length <= var3) {
                    break L1;
                  } else {
                    var4 = var16[var3];
                    if (param1 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
            return false;
          } else {
            return true;
          }
        } else {
          if (param1 >= 128) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                return true;
              } else {
                if (param0 == 255) {
                  L3: {
                    if (param1 == 0) {
                      break L3;
                    } else {
                      var15 = on.field_s;
                      var10 = var15;
                      var6 = var10;
                      var2 = var6;
                      var3 = 0;
                      L4: while (true) {
                        if (var15.length <= var3) {
                          break L3;
                        } else {
                          var4 = var15[var3];
                          if (param1 == var4) {
                            return true;
                          } else {
                            var3++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              if (param0 == 255) {
                if (param1 != 0) {
                  var14 = on.field_s;
                  var9 = var14;
                  var6 = var9;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var14.length > var3) {
                      var4 = var14[var3];
                      if (param1 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L5;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    abstract int e(int param0);

    public static void b(boolean param0) {
        if (!param0) {
            field_r = null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    cga() {
        ((cga) this).field_n = true;
    }

    static {
    }
}
