/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends hf {
    static String field_Cb;
    static int[] field_Bb;
    static int[] field_Db;

    final void b(int param0, lm param1) {
        super.b(param0, param1);
    }

    final static void j(byte param0) {
        int var2 = 0;
        ai var3 = null;
        int var4 = DungeonAssault.field_K;
        if (param0 != 59) {
            field_Db = null;
        }
        ai[] var5 = gm.field_d.field_L;
        ai[] var1 = var5;
        for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.field_c = new wd(var3.field_h.field_d);
        }
        wm.field_c = null;
        im.field_e = null;
        if (!gl.field_Lb) {
            kh.e(108);
            ra.c(8);
        } else {
            li.b(-107);
            of.a(param0 ^ -98);
        }
        df.b(16);
    }

    final static String a(String[] args, String param1, int param2) {
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
          var11 = DungeonAssault.field_K;
          var3 = param1.length();
          if (param2 == 30496) {
            break L0;
          } else {
            String discarded$4 = jk.a(21, -86);
            break L0;
          }
        }
        var4 = var3;
        var5 = 0;
        L1: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (var6_int < 0) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L2: while (true) {
              var8 = param1.indexOf("<%", var5);
              if ((var8 ^ -1) <= -1) {
                var5 = var8 + 2;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!qm.a(57, param1.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param1.substring(var8 + 2, var5);
                  if (!sj.a((CharSequence) (Object) var9, param2 + -30486)) {
                    continue L2;
                  } else {
                    if (var5 >= var3) {
                      continue L2;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var10 = ri.a((byte) 118, (CharSequence) (Object) var9);
                        StringBuilder discarded$5 = var6.append(param1.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$6 = var6.append(args[var10]);
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                StringBuilder discarded$7 = var6.append(param1.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = var6_int - -2;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!qm.a(57, param1.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param1.substring(2 + var6_int, var5);
              if (!sj.a((CharSequence) (Object) var7_ref, param2 + -30486)) {
                continue L1;
              } else {
                if (var3 <= var5) {
                  continue L1;
                } else {
                  if (param1.charAt(var5) != 62) {
                    continue L1;
                  } else {
                    var5++;
                    var8 = ri.a((byte) 113, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (args[var8].length() - var5 - -var6_int);
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    public static void n(int param0) {
        field_Bb = null;
        field_Cb = null;
        if (param0 != -18554) {
            return;
        }
        field_Db = null;
    }

    jk(ji param0, lm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String a(int param0, int param1) {
        if (param0 <= 110) {
            return null;
        }
        return k.a((byte) -122, 1, 1, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Priest";
        field_Db = new int[128];
    }
}
