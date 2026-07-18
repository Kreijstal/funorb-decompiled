/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends cj {
    cj field_Hb;
    static String field_Kb;
    tq field_Jb;
    cj field_Gb;
    static String field_Lb;
    static String field_Fb;
    static String field_Mb;
    cj field_Ib;

    cd(long param0, cd param1, String param2, String param3) {
        this(param0, (cj) (Object) param1, param1.field_Jb.field_Jb, param1.field_Jb.field_Ib, param1.field_Gb, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((cd) this).field_z = param2;
        if (param0 != 0) {
            field_Mb = null;
        }
        ((cd) this).field_x = param5;
        ((cd) this).field_Q = param6;
        ((cd) this).field_zb = param3;
        ((cd) this).a(param4, (byte) -67, param1, param7);
    }

    cd(long param0, cj param1, cj param2, hi param3, cj param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((cd) this).field_Ib = new cj(0L, (cj) null);
            ((cd) this).field_Jb = new tq(0L, ((cd) this).field_Ib, param2, param3);
            ((cd) this).field_Gb = new cj(0L, param4);
            ((cd) this).field_Hb = new cj(0L, param4);
            ((cd) this).field_Gb.field_wb = param5;
            ((cd) this).field_Hb.field_wb = param6;
            ((cd) this).a((byte) 50, (cj) (Object) ((cd) this).field_Jb);
            ((cd) this).a((byte) 50, ((cd) this).field_Gb);
            ((cd) this).a((byte) 50, ((cd) this).field_Hb);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "cd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = (((cd) this).field_zb + param0) / 2;
        int var6 = -param3 + ((cd) this).field_z;
        ((cd) this).field_Jb.a(param2, param0, ((cd) this).field_zb, 0, -param0 + var6, -31465, 0);
        ((cd) this).field_Gb.field_z = param3;
        int var7 = 42 % ((param1 - -27) / 39);
        ((cd) this).field_Gb.field_zb = -param0 + var5;
        ((cd) this).field_Gb.field_Q = var6;
        ((cd) this).field_Gb.field_x = 0;
        ((cd) this).field_Hb.field_Q = var6;
        ((cd) this).field_Hb.field_x = var5;
        ((cd) this).field_Hb.field_zb = -var5 + ((cd) this).field_zb;
        ((cd) this).field_Hb.field_z = param3;
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ja var6 = null;
        ja var7 = null;
        ja var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            oo.a(243, 197, 369, 143, 16777215);
            oo.e(244, 198, 367, 141, 0);
            if (ld.field_Ub == null) {
              L1: {
                if (null != gf.field_e) {
                  int discarded$3 = gf.field_e.a(hj.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var6 = ld.field_Ub[gf.field_g];
                if (var6 == null) {
                  if (null == gf.field_e) {
                    break L2;
                  } else {
                    int discarded$4 = gf.field_e.a(hj.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  }
                } else {
                  var6.g(245, 199);
                  break L2;
                }
              }
              L3: {
                if (nf.field_a <= lb.field_a) {
                  break L3;
                } else {
                  var7 = ld.field_Ub[gf.field_j];
                  if (var7 == null) {
                    break L3;
                  } else {
                    var2_int = lb.field_a * (var7.field_z + 60) / nf.field_a;
                    var3 = var2_int + -30;
                    if (qh.field_a) {
                      cb.a(199, false, var3 * -256 / 30, 245, var7, 256 * (-var3 + var7.field_z) / 30);
                      break L3;
                    } else {
                      cb.a(199, false, 256 * (var7.field_z + -var3) / 30, 245, var7, -256 * var3 / 30);
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (gf.field_e != null) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L5: while (true) {
                    if (var5 >= ld.field_Ub.length) {
                      if (var2 != null) {
                        int discarded$5 = gf.field_e.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var8 = ld.field_Ub[var5];
                        if (var8 == null) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "cd.AA(" + -57 + ')');
        }
    }

    public static void d(boolean param0) {
        field_Mb = null;
        field_Fb = null;
        field_Lb = null;
        field_Kb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_Lb = "Fullscreen";
        field_Fb = "Sound: ";
        field_Mb = "Curse";
    }
}
