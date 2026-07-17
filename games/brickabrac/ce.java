/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_g;
    static br field_b;
    static jp field_c;
    static int[][] field_a;
    static char[] field_f;
    static int field_d;
    static bi field_e;

    final static void a() {
        if (mf.field_f != null) {
          L0: {
            mf.field_f.i((byte) -36);
            if (null != sj.field_b) {
              sj.field_b.l(6457);
              break L0;
            } else {
              break L0;
            }
          }
          fl.f((byte) -83);
          return;
        } else {
          L1: {
            if (null != sj.field_b) {
              sj.field_b.l(6457);
              break L1;
            } else {
              break L1;
            }
          }
          fl.f((byte) -83);
          return;
        }
    }

    final static void a(boolean param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (nq.field_p) {
          L0: {
            wd.field_w.a(param0, -15211);
            var4 = hd.field_a.i(28) ? 1 : 0;
            if (0 == ki.field_e) {
              break L0;
            } else {
              if (var4 == 0) {
                int discarded$1 = 1;
                th.b();
                param0 = false;
                break L0;
              } else {
                if (param0) {
                  L1: {
                    hd.field_a.a(38, param3, param1);
                    if (var4 != 0) {
                      wd.field_w.a(param0, -15211);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
                  if (var5 <= 640) {
                    if (635 > var5) {
                      if (ah.field_v <= 0) {
                        return;
                      } else {
                        ah.field_v = ah.field_v - 5;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ah.field_v = ah.field_v + 5;
                    return;
                  }
                } else {
                  L2: {
                    if (var4 != 0) {
                      wd.field_w.a(param0, -15211);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
                  if (var5 <= 640) {
                    if (635 > var5) {
                      if (ah.field_v <= 0) {
                        return;
                      } else {
                        ah.field_v = ah.field_v - 5;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ah.field_v = ah.field_v + 5;
                    return;
                  }
                }
              }
            }
          }
          if (!param0) {
            L3: {
              if (var4 != 0) {
                wd.field_w.a(param0, -15211);
                break L3;
              } else {
                break L3;
              }
            }
            var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
            if (var5 <= 640) {
              if (635 > var5) {
                if (ah.field_v <= 0) {
                  return;
                } else {
                  ah.field_v = ah.field_v - 5;
                  return;
                }
              } else {
                return;
              }
            } else {
              ah.field_v = ah.field_v + 5;
              return;
            }
          } else {
            L4: {
              hd.field_a.a(38, param3, param1);
              if (var4 != 0) {
                wd.field_w.a(param0, -15211);
                break L4;
              } else {
                break L4;
              }
            }
            var5 = hd.field_a.e((byte) -92) - -hd.field_a.field_Eb;
            if (var5 <= 640) {
              if (635 > var5) {
                if (ah.field_v <= 0) {
                  return;
                } else {
                  ah.field_v = ah.field_v - 5;
                  return;
                }
              } else {
                return;
              }
            } else {
              ah.field_v = ah.field_v + 5;
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b() {
        field_e = null;
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%0> wants to join";
        field_f = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_d = 65;
    }
}
