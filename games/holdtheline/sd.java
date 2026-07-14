/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sd {
    static volatile boolean field_a;
    static int field_c;
    static int[] field_b;

    abstract void a(int param0, th param1);

    abstract kb a(boolean param0);

    public static void a(byte param0) {
        if (param0 != -123) {
            sd.a((byte) 102);
        }
        field_b = null;
    }

    final static String a(String param0, String[] param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = HoldTheLine.field_D;
          var3 = param0.length();
          var4 = var3;
          var5 = 0;
          if (param2) {
            break L0;
          } else {
            field_c = 69;
            break L0;
          }
        }
        L1: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if ((var6_int ^ -1) > -1) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L2: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (-1 >= (var8 ^ -1)) {
                var5 = 2 + var8;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!ii.a(48, param0.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (ik.a((CharSequence) (Object) var9, true)) {
                    if (var3 <= var5) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var10 = mo.a((CharSequence) (Object) var9, (byte) -116);
                        StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$4 = var6.append(param1[var10]);
                        continue L2;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param0.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = 2 + var6_int;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!ii.a(48, param0.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param0.substring(2 + var6_int, var5);
              if (!ik.a((CharSequence) (Object) var7_ref, true)) {
                continue L1;
              } else {
                if (var3 <= var5) {
                  continue L1;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = mo.a((CharSequence) (Object) var7_ref, (byte) -116);
                    var4 = var4 + (param1[var8].length() + (-var5 - -var6_int));
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    final static int a(byte param0, io param1, io param2) {
        int var3 = -29 / ((-76 - param0) / 48);
        Object var4 = null;
        return cc.a(65500, 0, 0, param2, false, (String) null, param1);
    }

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (dg.a((byte) 78, param0)) {
            return true;
        }
        char[] var6 = rg.field_h;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
                return true;
            }
        }
        var2 = nn.field_f;
        if (param1 > -48) {
            return true;
        }
        int var7 = 0;
        var3 = var7;
        while (var2.length > var7) {
            var4 = var2[var7];
            if (var4 == param0) {
                return true;
            }
            var7++;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_b = new int[8192];
    }
}
