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
            field_Gb = (int[]) null;
        }
        this.field_x = param5;
        this.field_I = param1;
        this.field_T = param0;
        this.field_db = param6;
        this.a(1, param3, param2);
    }

    tn(long param0, kc param1, String[] param2, kc param3, kc[] param4, int param5) {
        super(param0, (kc) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        kc var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Bb = new kc[param2.length];
            this.field_Jb = new kc(0L, param3);
            this.field_Nb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.a(this.field_Jb, 53);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    this.field_Mb = param5;
                    this.field_Bb[param5].field_ab = true;
                    break L0;
                  } else {
                    this.field_Jb.a(param4[var11], 84);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new kc(0L, param1);
                var9.field_rb = param2[var8_int];
                this.field_Bb[var8_int] = var9;
                this.a(var9, 22);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("tn.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        int stackIn_10_0 = 0;
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
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L1;
            }
            return stackIn_10_0 != 0;
          } else {
            return false;
          }
        }
    }

    final void h(byte param0) {
        kc dupTemp$0 = null;
        kc dupTemp$1 = null;
        int var2;
        int var3;
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
          if (var2 >= this.field_Bb.length) {
            return;
          } else {
            if (this.field_Mb != var2) {
              if (-1 != (this.field_Bb[var2].field_U ^ -1)) {
                this.field_Bb[this.field_Mb].field_ab = false;
                dupTemp$0 = this.field_Nb[this.field_Mb];
                dupTemp$0.field_T = dupTemp$0.field_T + 10000;
                this.field_Mb = var2;
                this.field_Bb[var2].field_ab = true;
                dupTemp$1 = this.field_Nb[var2];
                dupTemp$1.field_T = dupTemp$1.field_T - 10000;
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
        kc dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_Bb.length) {
            L1: {
              this.field_Jb.a(this.field_x, 0, param1, this.field_I - param1, (byte) -120);
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
              if (var8 >= this.field_Nb.length) {
                return;
              } else {
                this.field_Nb[var8].a(-(2 * param2) + this.field_Jb.field_x, param2, param2, this.field_Jb.field_I + -(param2 * 2), (byte) -120);
                if (this.field_Mb != var8) {
                  dupTemp$0 = this.field_Nb[var8];
                  dupTemp$0.field_T = dupTemp$0.field_T + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * this.field_x / this.field_Bb.length;
            var6 = this.field_x * (var4 + 1) / this.field_Bb.length;
            this.field_Bb[var4].field_T = var5;
            this.field_Bb[var4].field_db = 0;
            this.field_Bb[var4].field_x = var6 + -var5;
            this.field_Bb[var4].field_I = param1;
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
        int var17;
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
        field_Fb = 256;
        field_Lb = "Add <%0> to ignore list";
        field_Kb = "The numbers above the players' heads indicate their current health.";
        field_Ib = "Choose the spells you wish your Arcanist to take into battle.<br><br>Select a spellbook, then select your spells from the wheel to the left. You can remove spells from your spellbook by clicking on the<nbsp>icons<nbsp>above.<br>Some spells are locked until you meet their requirements - select blacked-out spells for more information.";
        field_Db = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
