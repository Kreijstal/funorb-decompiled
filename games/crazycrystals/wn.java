/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn implements wo {
    static int field_c;
    static int field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var6 = param4 - 350;
          var7 = -param4 + (-param5 + 130);
          if (var6 < var7) {
            var6 = var7;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = -(var6 * 256 / 50) + 256;
        if ((var8 ^ -1) < param0) {
          if (var8 < 256) {
            go.field_l.a(param3, param2, 15 + param4, param1, -1, var8);
            return;
          } else {
            go.field_l.a(param3, param2, 15 + param4, param1, -1);
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (param4 == -30) {
          if (param1 >= param3) {
            if (param1 < param0 + param3) {
              if (param6 <= param2) {
                if (param5 + param6 <= param2) {
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
          field_a = null;
          if (param1 >= param3) {
            if (param1 < param0 + param3) {
              if (param6 <= param2) {
                if (param5 + param6 <= param2) {
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

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 48) {
            boolean discarded$0 = wn.a(-68, 71, -50, 47, (byte) 118, 122, -66);
        }
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        dl var9 = null;
        dl var10 = null;
        if (!param1) {
          var6 = param2 - -param3.field_r;
          var7 = param3.field_j + param0;
          ca.a((byte) -128, var6, var7, param3.field_f, param3.field_g);
          var10 = ao.field_b[1];
          if (param3 instanceof pc) {
            if (!((pc) (Object) param3).field_A) {
              L0: {
                if (param3.e(-122)) {
                  ci.a(var6 + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.d(var6 - -1 + (param3.field_g - var10.field_n >> 1511148865), var7 - -1 - -(param3.field_f - var10.field_o >> -1175892991), 256);
                if (param3.e(-122)) {
                  ci.a(var6 + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param3.e(-122)) {
                ci.a(var6 + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          field_c = 70;
          var6 = param2 - -param3.field_r;
          var7 = param3.field_j + param0;
          ca.a((byte) -128, var6, var7, param3.field_f, param3.field_g);
          var9 = ao.field_b[1];
          if (param3 instanceof pc) {
            if (!((pc) (Object) param3).field_A) {
              L3: {
                if (param3.e(-122)) {
                  ci.a(var6 + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var9.d(var6 - -1 + (param3.field_g - var9.field_n >> 1511148865), var7 - -1 - -(param3.field_f - var9.field_o >> -1175892991), 256);
                if (param3.e(-122)) {
                  ci.a(var6 + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param3.e(-122)) {
                ci.a(var6 + 2, var7 + 2, false, param3.field_f + -4, -4 + param3.field_g);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "Achieved: <%0>";
    }
}
