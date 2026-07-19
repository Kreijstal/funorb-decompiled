/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ko extends IOException {
    static int[] field_c;
    static String[] field_a;
    static boolean field_b;

    ko(String param0) {
        super(param0);
    }

    final static String a(boolean param0, byte param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 == 100) {
          L0: {
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param0) {
            if (param2) {
              var4++;
              return qa.field_k[var4];
            } else {
              return qa.field_k[var4];
            }
          } else {
            var4 += 2;
            if (param2) {
              var4++;
              return qa.field_k[var4];
            } else {
              return qa.field_k[var4];
            }
          }
        } else {
          L1: {
            field_a = (String[]) null;
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0) {
            var4 += 2;
            if (!param2) {
              return qa.field_k[var4];
            } else {
              var4++;
              return qa.field_k[var4];
            }
          } else {
            if (param2) {
              var4++;
              return qa.field_k[var4];
            } else {
              return qa.field_k[var4];
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -97) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = Torquing.field_u;
        if (kn.field_e <= param6) {
          if (qg.field_z >= param3) {
            L0: {
              if (j.field_q > param4) {
                break L0;
              } else {
                if (param1 > qk.field_p) {
                  break L0;
                } else {
                  if (1 == param2) {
                    wo.a(param6, param0, param1, param3, true, param4);
                    if (param5 != -2910) {
                      ko.a(-31, 127, 39, -54, 93, 41, 35);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    w.a((byte) 72, param6, param2, param3, param4, param1, param0);
                    if (param5 != -2910) {
                      ko.a(-31, 127, 39, -54, 93, 41, 35);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (param2 != 1) {
              jg.a(param0, param3, (byte) -115, param2, param4, param6, param1);
              if (param5 != -2910) {
                ko.a(-31, 127, 39, -54, 93, 41, 35);
                return;
              } else {
                return;
              }
            } else {
              vd.a(param4, (byte) -89, param3, param0, param6, param1);
              if (param5 != -2910) {
                ko.a(-31, 127, 39, -54, 93, 41, 35);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param2 != 1) {
              jg.a(param0, param3, (byte) -115, param2, param4, param6, param1);
              if (param5 != -2910) {
                ko.a(-31, 127, 39, -54, 93, 41, 35);
                return;
              } else {
                return;
              }
            } else {
              vd.a(param4, (byte) -89, param3, param0, param6, param1);
              if (param5 != -2910) {
                ko.a(-31, 127, 39, -54, 93, 41, 35);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param2 != 1) {
            jg.a(param0, param3, (byte) -115, param2, param4, param6, param1);
            if (param5 == -2910) {
              return;
            } else {
              ko.a(-31, 127, 39, -54, 93, 41, 35);
              return;
            }
          } else {
            vd.a(param4, (byte) -89, param3, param0, param6, param1);
            if (param5 != -2910) {
              ko.a(-31, 127, 39, -54, 93, 41, 35);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_c = new int[25];
        dk.a(field_c, 0, 25, -1);
        field_c[1] = 0;
        field_c[16] = 6;
        field_c[3] = 2;
        field_b = false;
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
