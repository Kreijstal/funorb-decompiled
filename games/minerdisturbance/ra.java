/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static ae field_c;
    static String[] field_e;
    static String field_d;
    static int field_b;
    static String field_a;

    final static boolean a(byte param0, char param1) {
        if (param0 == 121) {
          if (param1 < 65) {
            if (param1 >= 97) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          field_e = null;
          if (param1 >= 65) {
            if (param1 > 90) {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (param1 >= 97) {
              if (122 < param1) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > 115) {
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_d = null;
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 >= -21) {
            ra.a(-11);
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        if (1 == param0) {
          ke.field_X[21] = true;
          if (param1 != -59) {
            ra.a(120, (byte) -99);
            return;
          } else {
            return;
          }
        } else {
          if ((param0 ^ -1) == -7) {
            ke.field_X[14] = true;
            if (param1 == -59) {
              return;
            } else {
              ra.a(120, (byte) -99);
              return;
            }
          } else {
            if (16 != param0) {
              if (param1 != -59) {
                ra.a(120, (byte) -99);
                return;
              } else {
                return;
              }
            } else {
              ke.field_X[0] = true;
              if (param1 == -59) {
                return;
              } else {
                ra.a(120, (byte) -99);
                return;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        if (param0 != -38) {
            return false;
        }
        return bi.a(false, false, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_c = new ae();
        field_d = "This password contains repeated characters, and would be easy to guess";
        field_a = "Names cannot contain consecutive spaces";
    }
}
