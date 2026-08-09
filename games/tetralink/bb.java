/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String[] field_d;
    static String field_f;
    static String field_b;
    static String[] field_a;
    static oh field_c;
    static int field_e;
    static String field_g;

    final static int a(int param0) {
        if (param0 != 32032) {
            return 79;
        }
        return 1;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        bo.field_y = 50.0f;
        jl.field_e = 262144;
        s.field_c = 52.5f;
        hi.field_d[2] = 0.0;
        sk.field_c = 0;
        hi.field_d[0] = 1.0;
        var2 = param1 ? 1 : 0;
        var3 = pf.field_d;
        if (ed.field_O != 0) {
          if ((kb.field_t ^ -1) != -3) {
            L0: {
              L1: {
                if (-4 == (kb.field_t ^ -1)) {
                  break L1;
                } else {
                  if ((ed.field_O ^ -1) == -5) {
                    break L1;
                  } else {
                    if (5 == ed.field_O) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              var3 = ed.field_O;
              break L0;
            }
            ac.a(param0, param0 + -120, var2 != 0, var3);
            if (tc.field_v != 0) {
              if (10 <= tc.field_v) {
                if (20 <= tc.field_v) {
                  L2: {
                    if ((tc.field_v ^ -1) > -16) {
                      stackIn_48_0 = 2;
                      break L2;
                    } else {
                      stackIn_48_0 = 4;
                      break L2;
                    }
                  }
                  qe.field_g = stackIn_48_0;
                  oi.field_c = stackIn_48_0;
                  wb.a(true, -7869);
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  if ((tc.field_v ^ -1) > -16) {
                    stackIn_42_0 = 2;
                    break L3;
                  } else {
                    stackIn_42_0 = 4;
                    break L3;
                  }
                }
                qe.field_g = stackIn_42_0;
                oi.field_c = stackIn_42_0;
                wb.a(true, -7869);
                return;
              }
            } else {
              return;
            }
          } else {
            var3 = ed.field_O;
            ac.a(param0, param0 + -120, var2 != 0, var3);
            if (tc.field_v != 0) {
              if (10 <= tc.field_v) {
                if (20 <= tc.field_v) {
                  L4: {
                    if ((tc.field_v ^ -1) > -16) {
                      stackIn_29_0 = 2;
                      break L4;
                    } else {
                      stackIn_29_0 = 4;
                      break L4;
                    }
                  }
                  qe.field_g = stackIn_29_0;
                  oi.field_c = stackIn_29_0;
                  wb.a(true, -7869);
                  return;
                } else {
                  return;
                }
              } else {
                L5: {
                  if ((tc.field_v ^ -1) > -16) {
                    stackIn_23_0 = 2;
                    break L5;
                  } else {
                    stackIn_23_0 = 4;
                    break L5;
                  }
                }
                qe.field_g = stackIn_23_0;
                oi.field_c = stackIn_23_0;
                wb.a(true, -7869);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var3 = ed.field_O;
          ac.a(param0, param0 + -120, var2 != 0, var3);
          if (tc.field_v != 0) {
            if (10 <= tc.field_v) {
              if (20 > tc.field_v) {
                return;
              } else {
                L6: {
                  if ((tc.field_v ^ -1) > -16) {
                    stackIn_12_0 = 2;
                    break L6;
                  } else {
                    stackIn_12_0 = 4;
                    break L6;
                  }
                }
                qe.field_g = stackIn_12_0;
                oi.field_c = stackIn_12_0;
                wb.a(true, -7869);
                return;
              }
            } else {
              L7: {
                if ((tc.field_v ^ -1) > -16) {
                  stackIn_7_0 = 2;
                  break L7;
                } else {
                  stackIn_7_0 = 4;
                  break L7;
                }
              }
              qe.field_g = stackIn_7_0;
              oi.field_c = stackIn_7_0;
              wb.a(true, -7869);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 != -578) {
            bb.a(1);
        }
    }

    final static void a(byte param0) {
        if (param0 != -63) {
            field_g = (String) null;
            t.a(17, 0);
            return;
        }
        t.a(17, 0);
    }

    static {
        field_f = "All games";
        field_b = "to return to the normal view.";
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = 0;
        field_g = "Ask to join <%0>'s game";
    }
}
