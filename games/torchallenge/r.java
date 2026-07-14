/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static boolean[][][] field_i;
    static int[][] field_h;
    private int field_g;
    String field_c;
    private int field_f;
    float field_d;
    static int[] field_a;
    private int field_b;
    private ni[] field_e;

    final static String a(int param0, int param1, byte[] param2, byte param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        var12 = new char[param0];
        var11 = var12;
        var4 = var11;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param0) {
            L1: {
              if (param3 == 8) {
                break L1;
              } else {
                var10 = null;
                String discarded$1 = r.a(-89, -120, (byte[]) null, (byte) -36);
                break L1;
              }
            }
            return new String(var12, 0, var5);
          } else {
            var7 = 255 & param2[var6 + param1];
            if (var7 != 0) {
              L2: {
                if (var7 > -129) {
                  break L2;
                } else {
                  if (-161 <= var7) {
                    break L2;
                  } else {
                    L3: {
                      var8 = ae.field_p[var7 - 128];
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 <= 22) {
            field_i = null;
        }
        field_h = null;
        field_a = null;
    }

    private final void a(int param0, int param1, ni param2) {
        float var4 = (float)(((r) this).field_b + param1) + (float)param0 / 100.0f;
        if (param0 != 0) {
            ((r) this).field_c = param2.field_j + " - " + param0 + "%";
        } else {
            ((r) this).field_c = param2.field_g;
        }
        ((r) this).field_d = var4 * (float)((r) this).field_f / (float)(1 + ((r) this).field_g);
    }

    final boolean a(int param0) {
        int var3 = 0;
        ni var4 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        L0: while (true) {
          if (((r) this).field_b >= ((r) this).field_g) {
            if (param0 == 0) {
              return true;
            } else {
              field_a = null;
              return true;
            }
          } else {
            var4 = ((r) this).field_e[((r) this).field_b];
            if (!var4.field_a.b(-7957)) {
              this.a(0, 1, var4);
              return false;
            } else {
              L1: {
                if (0 > var4.field_c) {
                  break L1;
                } else {
                  if (var4.field_a.a(true, var4.field_c)) {
                    break L1;
                  } else {
                    this.a(var4.field_a.a(var4.field_c, (byte) 12), 1, var4);
                    return false;
                  }
                }
              }
              L2: {
                if (null == var4.field_e) {
                  break L2;
                } else {
                  if (!var4.field_a.b(5, var4.field_e)) {
                    this.a(var4.field_a.a(118, var4.field_e), param0 ^ 1, var4);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((var4.field_c ^ -1) <= -1) {
                  break L3;
                } else {
                  if (var4.field_e != null) {
                    break L3;
                  } else {
                    if (var4.field_j == null) {
                      break L3;
                    } else {
                      if (!var4.field_a.b((byte) 79)) {
                        this.a(var4.field_a.c(53), 1, var4);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((r) this).field_b = ((r) this).field_b + 1;
              continue L0;
            }
          }
        }
    }

    private r() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_a = new int[]{10, 20, 30};
    }
}
