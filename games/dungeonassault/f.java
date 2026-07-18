/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static cn field_a;
    static String field_c;
    static cn field_f;
    static String field_e;
    static String field_b;
    static boolean field_d;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        if (!param0) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        return !im.field_b.b(36);
    }

    final static int a(int param0, int param1, int param2) {
        if (null == nl.field_g) {
          return -1;
        } else {
          if (wk.field_h <= param0) {
            if (param0 < wk.field_h + nl.field_g.field_y) {
              if (param1 < fo.field_b) {
                if (param0 >= rm.field_T) {
                  if (param0 < nl.field_g.field_y + rm.field_T) {
                    if (param1 >= mi.field_f) {
                      if (nl.field_g.field_v + mi.field_f <= param1) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (fo.field_b + nl.field_g.field_v <= param1) {
                  if (param0 >= rm.field_T) {
                    if (param0 < nl.field_g.field_y + rm.field_T) {
                      if (param1 >= mi.field_f) {
                        if (nl.field_g.field_v + mi.field_f <= param1) {
                          return -1;
                        } else {
                          return 1;
                        }
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (param0 >= rm.field_T) {
                if (param0 < nl.field_g.field_y + rm.field_T) {
                  if (param1 >= mi.field_f) {
                    if (nl.field_g.field_v + mi.field_f > param1) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param0 >= rm.field_T) {
              if (param0 < nl.field_g.field_y + rm.field_T) {
                if (param1 >= mi.field_f) {
                  if (nl.field_g.field_v + mi.field_f <= param1) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        jd var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 12;
            var3 = (jd) (Object) ta.field_f.e(-24172);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                o.a(2, 62, var3);
                var3 = (jd) (Object) ta.field_f.a(4);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "f.C(" + 2 + ',' + -50 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0>: <col=<%1>><%2></col>";
        field_c = "DUNGEON BUILDER";
        field_e = "A large, snarling wolf; it's grey fur is matted with blood.<br><br>If this monster detects a raider, its howl will alert monsters in adjacent rooms, increasing their <%detect> by 2.";
    }
}
