/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    private int field_b;
    static String[] field_e;
    private int[] field_d;
    private int field_a;
    static int field_f;
    private boolean field_c;

    final int a(byte param0) {
        if (param0 > -108) {
            return 89;
        }
        return 1 + ((aj) this).field_b;
    }

    final void b(int param0, int param1) {
        this.a(param0 + -2, param1, ((aj) this).field_b + param0);
    }

    private final int a(int param0) {
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        var3 = ((aj) this).field_d.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (((aj) this).field_c) {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((aj) this).field_a;
                continue L0;
              }
            } else {
              var3 = var3 + ((aj) this).field_a;
              continue L0;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        if (param1 > ((aj) this).field_b) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          var3 = 66 % ((param0 - 60) / 41);
          return ((aj) this).field_d[param1];
        }
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (param2 > ((aj) this).field_b) {
            ((aj) this).field_b = param2;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          L1: {
            ((aj) this).field_b = -4;
            if (((aj) this).field_d.length <= param2) {
              int discarded$4 = 1;
              this.b(param2);
              break L1;
            } else {
              break L1;
            }
          }
          ((aj) this).field_d[param2] = param1;
          return;
        } else {
          L2: {
            if (((aj) this).field_d.length <= param2) {
              int discarded$5 = 1;
              this.b(param2);
              break L2;
            } else {
              break L2;
            }
          }
          ((aj) this).field_d[param2] = param1;
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            aj.a(true);
            field_e = null;
            return;
        }
        field_e = null;
    }

    private final void b(int param0) {
        int discarded$0 = 88;
        int[] var4 = new int[this.a(param0)];
        int[] var3 = var4;
        cb.a(((aj) this).field_d, 0, var4, 0, ((aj) this).field_d.length);
        ((aj) this).field_d = var4;
    }

    final void a(int param0, boolean param1) {
        if (param0 >= 0) {
          if (param0 <= ((aj) this).field_b) {
            if (param0 == ((aj) this).field_b) {
              ((aj) this).field_b = ((aj) this).field_b - 1;
              if (param1) {
                return;
              } else {
                field_e = null;
                return;
              }
            } else {
              cb.a(((aj) this).field_d, param0 + 1, ((aj) this).field_d, param0, ((aj) this).field_b - param0);
              ((aj) this).field_b = ((aj) this).field_b - 1;
              if (param1) {
                return;
              } else {
                field_e = null;
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private aj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
