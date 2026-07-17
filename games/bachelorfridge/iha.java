/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iha extends at {
    static int field_j;
    static String field_k;

    iha() {
    }

    final boolean b(int param0) {
        int var3 = 0;
        at var4 = null;
        int stackIn_34_0 = 0;
        int stackIn_50_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        var3 = BachelorFridge.field_y;
        if (!((iha) this).field_f) {
          if (((iha) this).c((byte) 122)) {
            ((iha) this).field_f = true;
            if (param0 == 21807) {
              if (null != ((iha) this).field_h) {
                var4 = (at) (Object) ((iha) this).field_h.b((byte) 90);
                L0: while (true) {
                  if (var4 == null) {
                    L1: {
                      L2: {
                        if (!((iha) this).field_f) {
                          break L2;
                        } else {
                          if (!((iha) this).field_h.e(12917)) {
                            break L2;
                          } else {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_49_0 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      break L1;
                    }
                    return stackIn_50_0 != 0;
                  } else {
                    L3: {
                      if (var4.b(param0)) {
                        var4.a(false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = (at) (Object) ((iha) this).field_h.c(0);
                    continue L0;
                  }
                }
              } else {
                return ((iha) this).field_f;
              }
            } else {
              return true;
            }
          } else {
            if (param0 == 21807) {
              if (null != ((iha) this).field_h) {
                var4 = (at) (Object) ((iha) this).field_h.b((byte) 90);
                L4: while (true) {
                  if (var4 == null) {
                    L5: {
                      L6: {
                        if (!((iha) this).field_f) {
                          break L6;
                        } else {
                          if (!((iha) this).field_h.e(12917)) {
                            break L6;
                          } else {
                            stackOut_32_0 = 1;
                            stackIn_34_0 = stackOut_32_0;
                            break L5;
                          }
                        }
                      }
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L5;
                    }
                    return stackIn_34_0 != 0;
                  } else {
                    L7: {
                      if (var4.b(param0)) {
                        var4.a(false);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var4 = (at) (Object) ((iha) this).field_h.c(0);
                    continue L4;
                  }
                }
              } else {
                return ((iha) this).field_f;
              }
            } else {
              return true;
            }
          }
        } else {
          if (param0 == 21807) {
            if (null != ((iha) this).field_h) {
              var4 = (at) (Object) ((iha) this).field_h.b((byte) 90);
              L8: while (true) {
                if (var4 == null) {
                  if (((iha) this).field_f) {
                    if (!((iha) this).field_h.e(12917)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  L9: {
                    if (var4.b(param0)) {
                      var4.a(false);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var4 = (at) (Object) ((iha) this).field_h.c(0);
                  continue L8;
                }
              }
            } else {
              return ((iha) this).field_f;
            }
          } else {
            return true;
          }
        }
    }

    public static void d(int param0) {
        field_k = null;
        int var1 = -57;
    }

    final static void e(int param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 5;
        field_k = "There are no valid types of game that match your preferences.";
    }
}
