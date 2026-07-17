/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends gj {
    static String field_f;
    static int field_i;
    static String field_o;
    static String field_m;
    private int field_n;
    private long field_l;
    private long field_h;
    private long field_k;
    static String field_g;
    private long[] field_j;
    static int[] field_d;
    private int field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        var17 = DungeonAssault.field_K;
        var16 = 1;
        if (param3 < param2) {
          if (param0 <= param2) {
            if (param0 > param3) {
              sg.a(gf.field_b, param8, param4, param2, param1, param15, param10, param0, (byte) -13, param3, param9, param5, param7, param13, param11, param6, param14);
              return;
            } else {
              sg.a(gf.field_b, param8, param7, param2, param13, param11, param10, param3, (byte) -13, param0, param5, param9, param4, param1, param15, param6, param14);
              return;
            }
          } else {
            sg.a(gf.field_b, param7, param4, param0, param10, param14, param1, param2, (byte) -13, param3, param9, param6, param8, param13, param11, param5, param15);
            return;
          }
        } else {
          if (param3 >= param0) {
            if (param2 >= param0) {
              sg.a(gf.field_b, param4, param7, param3, param10, param14, param13, param2, (byte) -13, param0, param5, param6, param8, param1, param15, param9, param11);
              return;
            } else {
              sg.a(gf.field_b, param4, param8, param3, param1, param15, param13, param0, (byte) -13, param2, param6, param5, param7, param10, param14, param9, param11);
              return;
            }
          } else {
            sg.a(gf.field_b, param7, param8, param0, param13, param11, param1, param3, (byte) -13, param2, param6, param9, param4, param10, param14, param5, param15);
            return;
          }
        }
    }

    final int b(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param1 == 2048) {
          if (~((fg) this).field_h <= ~((fg) this).field_l) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((fg) this).field_l = ((fg) this).field_l + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (((fg) this).field_l < ((fg) this).field_h) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (~((fg) this).field_h < ~((fg) this).field_l) {
                ((fg) this).field_l = ((fg) this).field_h;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((fg) this).field_k = ((fg) this).field_k + (((fg) this).field_l - ((fg) this).field_h);
            ((fg) this).field_h = ((fg) this).field_h + (-((fg) this).field_h + ((fg) this).field_l);
            ((fg) this).field_l = ((fg) this).field_l + param0;
            return 1;
          }
        } else {
          field_m = null;
          if (~((fg) this).field_h <= ~((fg) this).field_l) {
            var4 = 0;
            L2: while (true) {
              L3: {
                ((fg) this).field_l = ((fg) this).field_l + param0;
                var4++;
                if (var4 >= 10) {
                  break L3;
                } else {
                  if (((fg) this).field_l < ((fg) this).field_h) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (~((fg) this).field_h >= ~((fg) this).field_l) {
                return var4;
              } else {
                ((fg) this).field_l = ((fg) this).field_h;
                return var4;
              }
            }
          } else {
            ((fg) this).field_k = ((fg) this).field_k + (((fg) this).field_l - ((fg) this).field_h);
            ((fg) this).field_h = ((fg) this).field_h + (-((fg) this).field_h + ((fg) this).field_l);
            ((fg) this).field_l = ((fg) this).field_l + param0;
            return 1;
          }
        }
    }

    final long a(int param0) {
        int var2 = 0;
        int discarded$2 = 0;
        ((fg) this).field_h = ((fg) this).field_h + this.c();
        if (((fg) this).field_h < ((fg) this).field_l) {
          return (((fg) this).field_l - ((fg) this).field_h) / 1000000L;
        } else {
          var2 = -20 % ((64 - param0) / 62);
          return 0L;
        }
    }

    public static void d(int param0) {
        field_m = null;
        if (param0 > -96) {
            return;
        }
        field_d = null;
        field_o = null;
        field_g = null;
        field_f = null;
    }

    final void b(int param0) {
        ((fg) this).field_k = 0L;
        if (param0 >= -86) {
          L0: {
            fg.d(110);
            if (((fg) this).field_h < ((fg) this).field_l) {
              ((fg) this).field_h = ((fg) this).field_h + (-((fg) this).field_h + ((fg) this).field_l);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((fg) this).field_h < ((fg) this).field_l) {
              ((fg) this).field_h = ((fg) this).field_h + (-((fg) this).field_h + ((fg) this).field_l);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final long c() {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        var2 = System.nanoTime();
        var4 = -((fg) this).field_k + var2;
        ((fg) this).field_k = var2;
        if (-5000000000L < var4) {
          if (var4 >= 5000000000L) {
            var6 = 0L;
            var8 = 1;
            L0: while (true) {
              if (((fg) this).field_n < var8) {
                return var6 / (long)((fg) this).field_n;
              } else {
                var6 = var6 + ((fg) this).field_j[(10 + (((fg) this).field_e - var8)) % 10];
                var8++;
                continue L0;
              }
            }
          } else {
            L1: {
              ((fg) this).field_j[((fg) this).field_e] = var4;
              if (((fg) this).field_n < 1) {
                ((fg) this).field_n = ((fg) this).field_n + 1;
                break L1;
              } else {
                break L1;
              }
            }
            ((fg) this).field_e = (1 + ((fg) this).field_e) % 10;
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((fg) this).field_n < var8) {
                return var6 / (long)((fg) this).field_n;
              } else {
                var6 = var6 + ((fg) this).field_j[(10 + (((fg) this).field_e - var8)) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((fg) this).field_n < var8) {
              return var6 / (long)((fg) this).field_n;
            } else {
              var6 = var6 + ((fg) this).field_j[(10 + (((fg) this).field_e - var8)) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    fg() {
        ((fg) this).field_h = 0L;
        ((fg) this).field_n = 1;
        ((fg) this).field_k = 0L;
        ((fg) this).field_l = 0L;
        ((fg) this).field_j = new long[10];
        ((fg) this).field_e = 0;
        ((fg) this).field_h = System.nanoTime();
        ((fg) this).field_l = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This huge, black-skinned, winged demon's claws and muscly build make it a raider's worst nightmare.<br><br>If this monster's <%attack> is at least twice as high as the <%defence> of the raider it encounters, the entire party will flee in terror!";
        field_o = "Whirling Blades";
        field_g = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_i = 10;
        field_m = "Waiting for extra data";
        field_d = new int[8192];
    }
}
