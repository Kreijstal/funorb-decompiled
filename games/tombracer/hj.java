/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    private int[] field_c;
    int field_f;
    static String field_b;
    static String field_e;
    int field_a;
    private static String[] field_d;

    final boolean a(int param0, int param1, byte param2) {
        boolean discarded$8 = false;
        if (param2 == -128) {
          if (0 <= param0) {
            if (0 <= param1) {
              if (this.field_f > param0) {
                if (this.field_a <= param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          discarded$8 = this.a(52, -84, (byte) -119);
          if (0 <= param0) {
            if (0 <= param1) {
              if (this.field_f > param0) {
                if (this.field_a <= param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
            hj.a(false);
            field_b = null;
            return;
        }
        field_b = null;
    }

    private final int a(byte param0, int param1, int param2) {
        if (param0 != -37) {
          field_d = (String[]) null;
          return param2 + this.field_f * param1;
        } else {
          return param2 + this.field_f * param1;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.field_c[this.a((byte) -37, param0, param3)] = param1;
        if (param2 != 0) {
            field_d = (String[]) null;
        }
    }

    final int b(byte param0, int param1, int param2) {
        if (param0 != -5) {
          field_d = (String[]) null;
          return this.field_c[this.a((byte) -37, param1, param2)];
        } else {
          return this.field_c[this.a((byte) -37, param1, param2)];
        }
    }

    hj(int param0, int param1, int param2) {
        int var5 = TombRacer.field_G ? 1 : 0;
        this.field_c = new int[param1 * param0];
        this.field_a = param1;
        this.field_f = param0;
        int var4 = 0;
        while (this.field_c.length > var4) {
            this.field_c[var4] = param2;
            var4++;
            if (var5 != 0) {
                return;
            }
        }
    }

    final static void a(eua param0, byte param1) {
        try {
            if (param1 < 120) {
                field_d = (String[]) null;
            }
            rua.field_gb.b(-127, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Join";
        field_e = "You have entered another game.";
        field_d = new String[17];
        field_d[1] = "Crumbly";
        field_d[0] = "Normal";
        field_d[4] = "Target";
        field_d[11] = "Fire Spitter";
        field_d[5] = "Old Pillar";
        field_d[12] = "Dart Spitter";
        field_d[14] = "Laser head (green)";
        field_d[15] = "Laser head (white)";
        field_d[3] = "Key Lock";
        field_d[13] = "Sawblade Spitter";
        field_d[16] = "Laser head (red)";
        field_d[8] = "Face";
        field_d[2] = "Gun";
        field_d[10] = "Big Block";
        field_d[9] = "Mirror";
    }
}
