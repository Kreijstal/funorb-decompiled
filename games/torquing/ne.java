/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ne {
    private int[] field_c;
    static int[] field_d;
    static Calendar field_b;
    static int[] field_a;

    final int a(byte[] param0, boolean param1, int param2, byte[] param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Torquing.field_u;
          if (param1) {
            break L0;
          } else {
            ((ne) this).field_c = null;
            break L0;
          }
        }
        if (0 == param5) {
          return 0;
        } else {
          param5 = param5 + param4;
          var7 = 0;
          var8 = param2;
          L1: while (true) {
            L2: {
              var9 = param3[var8];
              if (var9 >= 0) {
                var7++;
                break L2;
              } else {
                var7 = ((ne) this).field_c[var7];
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] >= 0) {
                  break L4;
                } else {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if ((var9 & 64) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] < 0) {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param5 > param4) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (0 == (32 & var9)) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] < 0) {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param5 > param4) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if (0 == (var9 & 16)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] >= 0) {
                  break L10;
                } else {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L10;
                  } else {
                    break L3;
                  }
                }
              }
              L11: {
                if ((var9 & 8) == 0) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] < 0) {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L12;
                  } else {
                    break L3;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if ((var9 & 4) == 0) {
                  var7++;
                  break L13;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L13;
                }
              }
              L14: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] < 0) {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param5 <= param4) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              L15: {
                if ((2 & var9) == 0) {
                  var7++;
                  break L15;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L15;
                }
              }
              L16: {
                var10 = ((ne) this).field_c[var7];
                if (((ne) this).field_c[var7] < 0) {
                  param4++;
                  param0[param4] = (byte)(var10 ^ -1);
                  if (param4 < param5) {
                    var7 = 0;
                    break L16;
                  } else {
                    return 1 + (var8 - param2);
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if ((var9 & 1) == -1) {
                  var7++;
                  break L17;
                } else {
                  var7 = ((ne) this).field_c[var7];
                  break L17;
                }
              }
              var10 = ((ne) this).field_c[var7];
              if (-1 > ((ne) this).field_c[var7]) {
                param4++;
                param0[param4] = (byte)(var10 ^ -1);
                if (param4 < param5) {
                  var7 = 0;
                  var8++;
                  continue L1;
                } else {
                  break L3;
                }
              } else {
                var8++;
                continue L1;
              }
            }
            return 1 + (var8 - param2);
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = param0.getParameter("username");
        if (param1 != 0) {
            field_d = null;
        }
        if (var2 != null) {
            CharSequence var3 = (CharSequence) (Object) var2;
            // ifne L45
        }
        return;
    }

    public static void a(int param0) {
        if (param0 != 4512) {
            field_b = null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
    }

    private ne() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = new int[256];
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -257) {
            field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            field_a = new int[12];
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_d[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1 ^ -1) == -2) {
                  var0 = -306674912 ^ var0 >>> 505932129;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
