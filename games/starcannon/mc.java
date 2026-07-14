/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_b;
    static byte[] field_g;
    static int field_h;
    static String field_d;
    static int field_c;
    static String field_a;
    static String field_i;
    static int field_f;
    static int[] field_j;
    static String field_e;

    public static void a(byte param0) {
        if (param0 != 40) {
            Object var2 = null;
            boolean discarded$0 = mc.a((String) null, 80);
        }
        field_a = null;
        field_d = null;
        field_e = null;
        field_j = null;
        field_i = null;
        field_g = null;
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 0) {
            field_d = null;
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return ba.field_e.equals((Object) (Object) ni.a(125, var3));
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (100 != param1) {
            break L0;
          } else {
            if (ni.field_k > 0) {
              ni.field_k = ni.field_k - 1;
              var2_ref_byte__ = li.field_a[ni.field_k - 1];
              li.field_a[ni.field_k] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 65536) {
            break L1;
          } else {
            mc.a((byte) 100);
            break L1;
          }
        }
        L2: {
          if (5000 != param1) {
            break L2;
          } else {
            if (sg.field_q > 0) {
              sg.field_q = sg.field_q - 1;
              var2_ref_byte__ = we.field_h[sg.field_q - 1];
              we.field_h[sg.field_q] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param1 != -30001) {
            break L3;
          } else {
            if (-1 < pg.field_f) {
              pg.field_f = pg.field_f - 1;
              var2_ref_byte__ = sj.field_B[pg.field_f - 1];
              sj.field_B[pg.field_f] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (null == kc.field_O) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= fl.field_e.length) {
                break L4;
              } else {
                if (fl.field_e[var2] == param1) {
                  if (-1 > (nf.field_i[var2] ^ -1)) {
                    nf.field_i[var2] = nf.field_i[var2] - 1;
                    var3 = kc.field_O[var2][nf.field_i[var2] - 1];
                    kc.field_O[var2][nf.field_i[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    final static void a(int param0, hl[] param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = StarCannon.field_A;
          if (param1 == null) {
            break L0;
          } else {
            if ((param2 ^ -1) < -1) {
              L1: {
                var6 = param1[0].field_x;
                var7 = param1[2].field_x;
                var8 = param1[1].field_x;
                if (param0 == 100) {
                  break L1;
                } else {
                  mc.a((byte) 61);
                  break L1;
                }
              }
              param1[0].a(param3, param5, param4);
              param1[2].a(param2 + (param3 + -var7), param5, param4);
              ki.a(be.field_c);
              ki.c(var6 + param3, param5, -var7 + (param3 + param2), param1[1].field_q + param5);
              var9 = var6 + param3;
              var10 = param3 + (param2 + -var7);
              param3 = var9;
              L2: while (true) {
                if (param3 >= var10) {
                  ki.b(be.field_c);
                  return;
                } else {
                  param1[1].a(param3, param5, param4);
                  param3 = param3 + var8;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Confirm Password: ";
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = "HELIX LASER - Switches the Nova Ray to use the defensive burst of the helix laser.";
        field_g = new byte[65536];
        field_e = "Close";
        ug.a(field_g, 0, 65536, (byte) -128);
    }
}
