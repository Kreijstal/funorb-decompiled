/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rb {
    static String field_c;
    static String field_d;
    va[] field_b;
    static sd field_a;

    final static boolean a(boolean param0, String param1) {
        if (param0) {
            field_c = null;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        return dd.field_p.equals((Object) (Object) r.a(var3, -11133));
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        va var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        va[] var7 = ((rb) this).field_b;
        va[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(param1 >= var5.field_b.length)) {
                return var5.field_b[param1];
            }
            param1 = param1 - (var5.field_b.length - 1);
        }
        if (param0 != 111) {
            return 56;
        }
        return 0;
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        int var2 = param1.length();
        if (param0 != 22479) {
            field_d = null;
        }
        char[] var3 = new char[var2];
        for (var4 = 0; var2 > var4; var4++) {
            var3[-var4 + var2 - 1] = param1.charAt(var4);
        }
        return new String(var3);
    }

    final static String a(long param0, byte param1) {
        ki.field_e.setTime(new Date(param0));
        int var3 = ki.field_e.get(7);
        if (param1 > -95) {
            field_a = null;
        }
        int var4 = ki.field_e.get(5);
        int var5 = ki.field_e.get(2);
        int var6 = ki.field_e.get(1);
        int var7 = ki.field_e.get(11);
        int var8 = ki.field_e.get(12);
        int var9 = ki.field_e.get(13);
        return fg.field_b[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ej.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TrackController.field_F ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param1.length();
        if (param2 == 5) {
          var8 = 0;
          L0: while (true) {
            if (var7 <= var8) {
              if (var5 <= 0) {
                return 0;
              } else {
                return (param3 - param0 << 1730737448) / var5;
              }
            } else {
              var9 = param1.charAt(var8);
              if (var9 == 60) {
                var6 = 1;
                var8++;
                continue L0;
              } else {
                if (var9 != 62) {
                  if (var6 == 0) {
                    if (var9 == 32) {
                      var5++;
                      var8++;
                      continue L0;
                    } else {
                      var8++;
                      continue L0;
                    }
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var6 = 0;
                  var8++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 14;
        }
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 12323) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((rb) this).field_b == null) {
              break L2;
            } else {
              if (((rb) this).field_b.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((rb) this).field_b[0].field_c + ((rb) this).field_b[-1 + ((rb) this).field_b.length].field_f;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        va var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          if (null == ((rb) this).field_b) {
            break L0;
          } else {
            if (((rb) this).field_b.length == 0) {
              break L0;
            } else {
              if (((rb) this).field_b[0].field_c <= param2) {
                if (((rb) this).field_b[-1 + ((rb) this).field_b.length].field_f >= param2) {
                  if (-2 != (((rb) this).field_b.length ^ -1)) {
                    if (!param1) {
                      var4 = 0;
                      var5 = 0;
                      L1: while (true) {
                        if (((rb) this).field_b.length <= var5) {
                          return -1;
                        } else {
                          L2: {
                            var6 = ((rb) this).field_b[var5];
                            if (param2 < var6.field_c) {
                              break L2;
                            } else {
                              if (var6.field_f >= param2) {
                                var7 = var6.b(param0, (byte) -85);
                                if (var7 == -1) {
                                  return -1;
                                } else {
                                  return var7 + var4;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_b.length);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return ((rb) this).field_b[0].b(param0, (byte) -85);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -2857) {
            field_d = null;
        }
        field_d = null;
        field_c = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        va var4 = null;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param1 != -36) {
            int discarded$0 = ((rb) this).c(65);
        }
        for (var3 = 0; ((rb) this).field_b.length > var3; var3++) {
            var4 = ((rb) this).field_b[var3];
            if (var4.field_b.length > param0) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_b.length);
        }
        return ((rb) this).field_b.length;
    }

    final int c(int param0) {
        int var2 = 0;
        va[] var3 = null;
        int var4 = 0;
        va var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          var2 = param0;
          if (((rb) this).field_b != null) {
            var3 = ((rb) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This entry doesn't match";
        field_d = "Names cannot contain consecutive spaces";
    }
}
