/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends kc {
    static String field_Lb;
    int field_Mb;
    private kc field_Jb;
    static String field_Kb;
    static long field_Hb;
    static int field_Eb;
    private kc[] field_Nb;
    static int field_Fb;
    static String field_Ib;
    static boolean field_Cb;
    static int[] field_Gb;
    private kc[] field_Bb;
    static String field_Db;
    static i field_Ob;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 0) {
            field_Gb = null;
        }
        ((tn) this).field_x = param5;
        ((tn) this).field_I = param1;
        ((tn) this).field_T = param0;
        ((tn) this).field_db = param6;
        this.a(1, param3, param2);
    }

    tn(long param0, kc param1, String[] param2, kc param3, kc[] param4, int param5) {
        super(param0, (kc) null);
        int var8 = 0;
        kc var9 = null;
        ((tn) this).field_Bb = new kc[param2.length];
        ((tn) this).field_Jb = new kc(0L, param3);
        ((tn) this).field_Nb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new kc(0L, param1);
            var9.field_rb = param2[var8];
            ((tn) this).field_Bb[var8] = var9;
            ((tn) this).a(var9, 22);
        }
        ((tn) this).a(((tn) this).field_Jb, 53);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((tn) this).field_Jb.a(param4[var11], 84);
            var11++;
        }
        ((tn) this).field_Mb = param5;
        ((tn) this).field_Bb[param5].field_ab = true;
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param1 >= 44) {
            break L0;
          } else {
            field_Hb = 69L;
            break L0;
          }
        }
        if (-1 < (param0 ^ -1)) {
          return false;
        } else {
          if (param0 <= 11) {
            L1: {
              L2: {
                if (1 > param3) {
                  break L2;
                } else {
                  if (oe.a(-2, param2, param0) < param3) {
                    break L2;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            return stackIn_10_0 != 0;
          } else {
            return false;
          }
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 >= 73) {
            break L0;
          } else {
            this.a(-65, -24, 38);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= ((tn) this).field_Bb.length) {
            return;
          } else {
            if (((tn) this).field_Mb != var2) {
              if (-1 != (((tn) this).field_Bb[var2].field_U ^ -1)) {
                ((tn) this).field_Bb[((tn) this).field_Mb].field_ab = false;
                ((tn) this).field_Nb[((tn) this).field_Mb].field_T = ((tn) this).field_Nb[((tn) this).field_Mb].field_T + 10000;
                ((tn) this).field_Mb = var2;
                ((tn) this).field_Bb[var2].field_ab = true;
                ((tn) this).field_Nb[var2].field_T = ((tn) this).field_Nb[var2].field_T - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_Db = null;
        field_Lb = null;
        field_Ib = null;
        field_Gb = null;
        int var1 = 4 / ((-22 - param0) / 56);
        field_Ob = null;
        field_Kb = null;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((tn) this).field_Bb.length) {
            L1: {
              ((tn) this).field_Jb.a(((tn) this).field_x, 0, param1, ((tn) this).field_I - param1, (byte) -120);
              if (param0 == 1) {
                break L1;
              } else {
                tn.f((byte) 87);
                break L1;
              }
            }
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= ((tn) this).field_Nb.length) {
                return;
              } else {
                ((tn) this).field_Nb[var8].a(-(2 * param2) + ((tn) this).field_Jb.field_x, param2, param2, ((tn) this).field_Jb.field_I + -(param2 * 2), (byte) -120);
                if (((tn) this).field_Mb != var8) {
                  ((tn) this).field_Nb[var8].field_T = ((tn) this).field_Nb[var8].field_T + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * ((tn) this).field_x / ((tn) this).field_Bb.length;
            var6 = ((tn) this).field_x * (var4 + 1) / ((tn) this).field_Bb.length;
            ((tn) this).field_Bb[var4].field_T = var5;
            ((tn) this).field_Bb[var4].field_db = 0;
            ((tn) this).field_Bb[var4].field_x = var6 + -var5;
            ((tn) this).field_Bb[var4].field_I = param1;
            var4++;
            continue L0;
          }
        }
    }

    final static boolean g(byte param0) {
        int var1 = 93 / ((49 - param0) / 60);
        return !ld.field_p ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = ArcanistsMulti.field_G ? 1 : 0;
          if (param3 >= param11) {
            if (param6 > param3) {
              dh.a(param10, param5, 127, param6, param9, param13, param11, de.field_l, param3, param2, param12, param7, param8, param0, param14, param15, param1);
              break L0;
            } else {
              if (param6 <= param11) {
                dh.a(param5, param7, 109, param3, param1, param0, param6, de.field_l, param11, param13, param9, param10, param15, param2, param8, param14, param12);
                break L0;
              } else {
                dh.a(param5, param10, 97, param3, param12, param0, param11, de.field_l, param6, param2, param9, param7, param14, param13, param8, param15, param1);
                break L0;
              }
            }
          } else {
            if (param6 <= param11) {
              if (param3 >= param6) {
                dh.a(param7, param5, 89, param11, param9, param2, param6, de.field_l, param3, param13, param1, param10, param8, param0, param15, param14, param12);
                break L0;
              } else {
                dh.a(param7, param10, 95, param11, param12, param2, param3, de.field_l, param6, param0, param1, param5, param14, param13, param15, param8, param9);
                break L0;
              }
            } else {
              dh.a(param10, param7, 127, param6, param1, param13, param3, de.field_l, param11, param0, param12, param5, param15, param2, param14, param8, param9);
              break L0;
            }
          }
        }
        L1: {
          if (param4 < -104) {
            break L1;
          } else {
            tn.a(78, 61, 0, 49, 79, 33, -47, -19, -85, 33, 87, 86, -90, -40, 8, -120);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = 256;
        field_Lb = "Add <%0> to ignore list";
        field_Kb = "The numbers above the players' heads indicate their current health.";
        field_Ib = "Choose the spells you wish your Arcanist to take into battle.<br><br>Select a spellbook, then select your spells from the wheel to the left. You can remove spells from your spellbook by clicking on the<nbsp>icons<nbsp>above.<br>Some spells are locked until you meet their requirements - select blacked-out spells for more information.";
        field_Db = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
